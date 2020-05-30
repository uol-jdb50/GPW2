/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gui.raceWeekend;

import grandprixworld.gamedata.Driver;
import grandprixworld.gamedata.Event;
import grandprixworld.gamedata.car.tyres.Compound;
import grandprixworld.gui.FullGame;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Josh Brookes
 */
public class Race extends Thread {

    private Thread t;
    private Random rnd = new Random();

    public Event event;
    List<Driver> raceDrivers;
    List<RaceStanding> raceStandings = new ArrayList<RaceStanding>();
    int raceLaps;
    int lapsCompleted;
    public static rwCar[] cars;
    public static int soft;
    public static int medium;
    public static int hard;
    public static Compound softComp;
    public static Compound medComp;
    public static Compound hardComp;

    public Race(Event event, List<Vec3> grid, float startDir, BufferedImage image) {
        this.event = event;
        raceDrivers = FullGame.data.getF1Drivers();
        if (event.eventName.equals("Grand Prix de Monaco")) {
            raceLaps = (int) Math.round(40.0 / event.venue.KmLength);//260
        } else {
            raceLaps = (int) Math.round(50.0 / event.venue.KmLength);//305
        }
        soft = 4;
        medium = 3;
        hard = 2;
        softComp = Compound.C4;
        medComp = Compound.C3;
        hardComp = Compound.C2;
        lapsCompleted = 0;
        int i = 0;
        cars = new rwCar[20];
        for (Driver d : raceDrivers) {
            raceStandings.add(new RaceStanding(d, i));
            cars[i] = new rwCar(FullGame.data.f1.findNextEvent().venue.scale,
                    image, i, d);
            cars[i].mFuelStart = 10;
            raceStandings.get(raceStandings.size() - 1).qualyTime = runLapSim(raceStandings.get(raceStandings.size() - 1), 0, cars[raceStandings.get(raceStandings.size() - 1).carnum].raceTyres[0], 2);
            cars[i].mFuelStart = 110;
            i++;
        }
        raceStandings.sort(new SortQualyTimes());
        for (int a = 0; a < 20; a++) {
            cars[raceStandings.get(a).carnum].locationx = grid.get(a).x;
            cars[raceStandings.get(a).carnum].locationy = grid.get(a).y;
            cars[raceStandings.get(a).carnum].nextlane = ((a % 2) + 1) * 2;
            cars[raceStandings.get(a).carnum].target = cars[raceStandings.get(a).carnum].setTargetVec();
            cars[raceStandings.get(a).carnum].setHeading();
            cars[raceStandings.get(a).carnum].gridpos = a + 1;
            //if (a > 5) cars[raceStandings.get(a).carnum].inRace = false;
        }
    }
    
    private void checkBestLap(RaceStanding r) {
        if (r.laptimer.getElapsedTime() < r.bestlap) {
            r.bestlapindex = r.lapsCompleted;
            r.bestlap = r.laptimer.getElapsedTime();
        }
    }

    @Override
    public void run() {
        int newlap = 0;
        boolean raceFinished;
        boolean lapFinish;
        rwPitWall.updateStandings();
        while (true) {
            raceFinished = true;
            lapFinish = false;
            for (RaceStanding r : raceStandings) {
                if (r.lapsCompleted < raceLaps && cars[r.carnum].inRace == true) {
                    raceFinished = false;
                    newlap = cars[r.carnum].update();
                    cars[r.carnum].checkWheels();
                    rwPitWall.map.repaint();
                    r.laptimer.inc();
                    if (newlap > 0) {
                        r.sectorsCompleted++;
//                        r.sectortimer.stop();
//                        r.raceTime += (double) r.sectortimer.getElapsedTime();
//                        r.sectors.add(r.raceTime);
//                        r.sectortimer.start();
                        if (newlap == 2) {
                            lapFinish = true;
                            r.laptimer.stop();
                            checkBestLap(r);
                            r.raceTime += r.laptimer.getElapsedTime();
                            r.laps.add(r.raceTime);
                            r.lapTimes.add(r.laptimer.getElapsedLapTime());
                            r.laptimer.start();
                            r.lapsCompleted++;
                            if (FullGame.data.findTeamByDriver(r.driver.raceNum).isPlayer == false) {
                                cars[r.carnum].pitstops.stream().filter((p) -> (p.lap == r.lapsCompleted + 1)).forEachOrdered((_item) -> {
                                    cars[r.carnum].pitThisLap = true;
                                });
                            }
                            cars[r.carnum].reliabilityPts -= reliabilityDecrement();
                            if (cars[r.carnum].reliabilityPts <= 0) {
                                cars[r.carnum].inRace = false;
                            }
                        }
                    }
                }
            }
            lapsCompleted = raceStandings.get(0).lapsCompleted;
            if (lapFinish == true) {
                rwPitWall.updateStandings();
            }
            rwPitWall.updateView();
            if (raceFinished == true) {
                finishRace();
                break;
            }
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(Race.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void start() {
        if (t == null) {
            for (RaceStanding r : raceStandings) {
                if (FullGame.data.findTeamByDriver(r.driver.raceNum).isPlayer == false) {
                    List<PitStop> optimalStrat = new ArrayList<PitStop>();
                    double optimalRaceTime = 1000000;
                    int optimalStartTyre = -1;
                    List<PitStop> currentStrat = new ArrayList<PitStop>();
                    double currentRaceTime = 0;
                    int currentStartTyre = -1;
                    for (int a = 0; a < 50; a++) {
                        currentStrat.clear();
                        while (true) {
                            int pitstops = 1;//rnd.nextInt(3) + 1;
                            int[] pitlaps = new int[pitstops];
                            for (int i = 0; i < pitstops; i++) {
                                int found = 0;
                                while (found >= 0) {
                                    pitlaps[i] = rnd.nextInt(raceLaps - 1) + 1;
                                    found = -1;
                                    for (int p = 0; p < i; p++) {
                                        if (pitlaps[p] == pitlaps[i]) {
                                            found = 1;
                                        }
                                    }
                                }
                            }
                            Arrays.sort(pitlaps);
                            while (true) {
                                currentStartTyre = rnd.nextInt(13);
                                if (cars[r.carnum].raceTyres[currentStartTyre].usable == true) break;
                            }
                            int nexttyreindex;
                            for (int i = 0; i < pitstops; i++) {
                                while (true) {
                                    nexttyreindex = rnd.nextInt(13);
                                    if (cars[r.carnum].raceTyres[nexttyreindex].usable == true) {
                                        break;
                                    }
                                }
                                currentStrat.add(new PitStop(pitlaps[i], nexttyreindex));
                            }
                            boolean diff = false;
                            for (PitStop p : currentStrat) {
                                if (cars[r.carnum].raceTyres[p.raceTyreIndex].compound != cars[r.carnum].raceTyres[cars[r.carnum].currentTyreIndex].compound) {
                                    diff = true;
                                }
                            }
                            if (diff == true) {
                                break;
                            }
                        }
                        currentRaceTime = runRaceSimulation(r, currentStrat, currentStartTyre);
                        if (currentRaceTime < optimalRaceTime) {
                            optimalRaceTime = currentRaceTime;
                            optimalStrat.clear();
                            optimalStrat.addAll(currentStrat);
                            optimalStartTyre = currentStartTyre;
                        }
                    }
                    cars[r.carnum].currentStratRaceTime = optimalRaceTime;
                    cars[r.carnum].currentTyreIndex = optimalStartTyre;
                    cars[r.carnum].pitstops.clear();
                    cars[r.carnum].pitstops.addAll(optimalStrat);
                }
            }
            raceStandings.stream().map((r) -> {
                r.sectortimer.start();
                return r;
            }).forEachOrdered((r) -> {
                r.laptimer.start();
            });
            t = new Thread(this, "Race");
            t.start();
        }
    }

    public double runRaceSimulation(RaceStanding r, List<PitStop> stops) {
        double projectedTime;
        RaceTyre tyre = new RaceTyre(cars[r.carnum].raceTyres[cars[r.carnum].currentTyreIndex]);
        projectedTime = r.raceTime;
        for (int i = r.lapsCompleted + 1; i < raceLaps; i++) {
            int pit = 0;
            for (PitStop p : stops) {
                if (p.lap == i) {
                    pit = 1;
                }
                if (p.lap == i - 1) {
                    pit = 2;
                    tyre = new RaceTyre(cars[r.carnum].raceTyres[p.raceTyreIndex]);
                }
            }
            projectedTime += runLapSim(r, pit, tyre, i);
            tyre.age++;
        }
        return projectedTime;
    }
    
    public double runRaceSimulation(RaceStanding r, List<PitStop> stops, int startTyre) {
        double projectedTime;
        RaceTyre tyre = new RaceTyre(cars[r.carnum].raceTyres[startTyre]);
        projectedTime = r.raceTime;
        for (int i = r.lapsCompleted + 1; i < raceLaps; i++) {
            int pit = 0;
            for (PitStop p : stops) {
                if (p.lap == i) {
                    pit = 1;
                }
                if (p.lap == i - 1) {
                    pit = 2;
                    tyre = new RaceTyre(cars[r.carnum].raceTyres[p.raceTyreIndex]);
                }
            }
            projectedTime += runLapSim(r, pit, tyre, i);
            tyre.age++;
        }
        return projectedTime;
    }

    public double runLapSim(RaceStanding r, int inoutlap, RaceTyre tyre, int racelap) {
        double tBase = rwCircuitMap.tQ + rwCircuitMap.tPaceGap;
        double tTyre = tyre.age * tyre.k2 + tyre.k3;
        double tFuel = (cars[r.carnum].mFuelStart - (cars[r.carnum].BfuelLap * racelap)) * 0.033;
        double tCar = cars[r.carnum].tCar;
        double tDriver = cars[r.carnum].tDriver;
        double tGrid = 0;
        if (racelap == 1) {
            tGrid = cars[r.carnum].gridpos * rwCircuitMap.tGridPos + rwCircuitMap.tFirstLap;
        }
        double tPit = 0;
        if (inoutlap == 1) {
            tPit = rwCircuitMap.tInLap;
        } else if (inoutlap == 2) {
            tPit = rwCircuitMap.tOutLap + cars[r.carnum].tStandstill;
        }
        return tBase + tTyre + tFuel + tCar + tDriver + tGrid + tPit;
    }

    public int reliabilityDecrement() {
        return rnd.nextInt(8);
    }

    public double gapToNext(int pos) {
        return (raceStandings.get(pos).laps.get(raceStandings.get(pos).lapsCompleted - 1) - raceStandings.get(pos - 1).laps.get(raceStandings.get(pos).lapsCompleted - 1)) / 1000.0;
    }

    private void finishRace() {
        FullGame.data.f1.addPoints(raceStandings.get(0).driver.raceNum, FullGame.data.pointsSystem[0]);
        FullGame.data.f1.addPoints(raceStandings.get(1).driver.raceNum, FullGame.data.pointsSystem[1]);
        FullGame.data.f1.addPoints(raceStandings.get(2).driver.raceNum, FullGame.data.pointsSystem[2]);
        FullGame.data.f1.addPoints(raceStandings.get(3).driver.raceNum, FullGame.data.pointsSystem[3]);
        FullGame.data.f1.addPoints(raceStandings.get(4).driver.raceNum, FullGame.data.pointsSystem[4]);
        FullGame.data.f1.addPoints(raceStandings.get(5).driver.raceNum, FullGame.data.pointsSystem[5]);
        FullGame.data.f1.addPoints(raceStandings.get(6).driver.raceNum, FullGame.data.pointsSystem[6]);
        FullGame.data.f1.addPoints(raceStandings.get(7).driver.raceNum, FullGame.data.pointsSystem[7]);
        FullGame.data.f1.addPoints(raceStandings.get(8).driver.raceNum, FullGame.data.pointsSystem[8]);
        FullGame.data.f1.addPoints(raceStandings.get(9).driver.raceNum, FullGame.data.pointsSystem[9]);
        for (int i = 0; i < 20; i++) {
            addStats(raceStandings.get(i).driver.raceNum, (i + 1));
        }
        FullGame.data.f1.setCCPoints();
        FullGame.data.f1.driversStandings.sort(new grandprixworld.gamedata.SortByDriverPts());
        FullGame.data.f1.teamsStandings.sort(new grandprixworld.gamedata.SortByTeamPts());
    }

    private void addStats(int raceNum, int finishPos) {
        FullGame.data.f1.findDriverStandingByRaceNum(raceNum).results.add(finishPos);
    }

}
