package grandprixworld.gui.raceWeekend;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import grandprixworld.gamedata.Driver;
import grandprixworld.gamedata.Team;
import grandprixworld.gui.FullGame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Josh Brookes
 */
public class rwCar extends javax.swing.JLabel {

    //private NeuralNetwork net;
    private BufferedImage trackbkg;

    public List<PitStop> pitstops = new ArrayList<PitStop>();
    public double currentStratRaceTime;

    public double tDriver;
    public int gridpos;

    public double tCar;
    public double mFuelStart;
    public double BfuelLap = 1.79;
    public double tStandstill;

    public int reliabilityPts;

    public Driver driver;
    public Team team;
    public float speed;
    public float speedStart;
    public float carHeading;
    public int nextwaypoint;
    public int nextlane;
    public Vec3 target;
    private int speedadjustnum;
    public int num;
    public int pitstopsCompleted;
    public boolean pitThisLap;
    public boolean inPit;
    public boolean inLimit;

    public float wheelbase;// m
    public float length;
    public float width;
    public double locationx;
    public double locationy;
    public Vec3 frontWheel;
    public Vec3 rearWheel;
    public double frontWheelX;
    public double frontWheelY;
    public double rearWheelX;
    public double rearWheelY;

    private Vec3 flWorld = new Vec3(0, 0, 0);
    private Vec3 frWorld = new Vec3(0, 0, 0);
    private Vec3 rlWorld = new Vec3(0, 0, 0);
    private Vec3 rrWorld = new Vec3(0, 0, 0);

    public float scale;
    public int pixelLength = 0;
    public int pixelWidth = 0;

    public RaceTyre[] raceTyres = new RaceTyre[13];
    public int currentTyreIndex;
    public int nextTyreIndex;
    public int[] availTyres = new int[3];

    private int lapsCompleted;
    public boolean inRace;

    private Random r;

    public rwCar(float scale, BufferedImage trackbkg, int num, Driver driver) {
        this.scale = scale;
        this.driver = driver;
        this.team = FullGame.data.findTeamByDriver(driver.raceNum);
        tDriver = calcDriver();
        tCar = calcCar();
        mFuelStart = 110;
        setTyres();
        initCar();
        initWorld();
        this.trackbkg = trackbkg;
        this.num = num;
        reliabilityPts = setReliability();
        inRace = true;
        lapsCompleted = 0;
        pitstopsCompleted = 0;
        nextTyreIndex = -1;
    }

    private void initCar() {
        width = 2f;
        length = 6f;
    }

    private void initWorld() {
        pixelLength = (int) (length / scale);
        pixelWidth = (int) (width / scale);
        nextwaypoint = 0;
        speedStart = setLapSpeed();
        speed = speedStart;
        r = new Random();
        speedadjustnum = 50;
        pitThisLap = false;
        inPit = false;
        inLimit = false;
    }

    public void physics() {
        frontWheel = new Vec3(Math.sin(carHeading), Math.cos(carHeading), 0);
        rearWheel = new Vec3(Math.sin(carHeading), Math.cos(carHeading), 0);
        frontWheel.scale(wheelbase / 2);
        rearWheel.scale(wheelbase / 2);
        rearWheel.scale(-1);
        frontWheel.add(new Vec3(locationx, locationy, 0));
        rearWheel.add(new Vec3(locationx, locationy, 0));

        Vec3 rearAdj = new Vec3(Math.sin(carHeading), Math.cos(carHeading), 0);
        Vec3 frontAdj = new Vec3(Math.sin(carHeading), Math.cos(carHeading), 0);//+ steerAngle on both sin and cos
        rearAdj.scale(0.005 * speed);
        frontAdj.scale(0.005 * speed);
        rearWheel.add(rearAdj);
        frontWheel.add(frontAdj);

        locationx = (frontWheel.x + rearWheel.x) / 2.0f;
        locationy = (frontWheel.y + rearWheel.y) / 2.0f;

        carHeading = setHeading();
    }

    public int update() {
        int newsector = 0;
        physics();
        //Update next waypoint
        if (distanceToWaypoint(target) < 10) {
            nextwaypoint = (nextwaypoint + 1) % rwCircuitMap.waypoints.size();
            newsector = 1;
            if (nextwaypoint == rwCircuitMap.pitInIndex + 1 && pitThisLap == true) {
                pitThisLap = false;
                inPit = true;
            } else if (nextwaypoint == rwCircuitMap.limitStartIndex + rwCircuitMap.pitInIndex + 2 && inPit == true) {
                inLimit = true;
            } else if (nextwaypoint + rwCircuitMap.pitTimingIndex == rwCircuitMap.limitEndIndex && inPit == true) {
                inLimit = false;
                if (team.isPlayer == false) {
                    currentTyreIndex = pitstops.get(pitstopsCompleted).raceTyreIndex;
                } else {
                    currentTyreIndex = nextTyreIndex;
                }
                pitstopsCompleted++;
                speedStart = setLapSpeed();
                speed = speedStart;
            } else if (nextwaypoint + rwCircuitMap.pitTimingIndex + 1 == rwCircuitMap.pits.size() && inPit == true) {
                inPit = false;
                if (driver.raceNum == FullGame.data.findPlayerTeam().driver1.raceNum) {
                    rwPitWall.d1pit = false;
                    rwPitWall.btnD1Pit.setBorder(new EmptyBorder(1, 1, 1, 1));
                    rwPitWall.btnD1Soft.setBorder(new EmptyBorder(1, 1, 1, 1));
                    rwPitWall.btnD1Med.setBorder(new EmptyBorder(1, 1, 1, 1));
                    rwPitWall.btnD1Hard.setBorder(new EmptyBorder(1, 1, 1, 1));
                    nextTyreIndex = -1;                     
                } else if (driver.raceNum == FullGame.data.findPlayerTeam().driver2.raceNum) {
                    rwPitWall.d2pit = false;
                    rwPitWall.btnD2Pit.setBorder(new EmptyBorder(1, 1, 1, 1));
                    rwPitWall.btnD2Soft.setBorder(new EmptyBorder(1, 1, 1, 1));
                    rwPitWall.btnD2Med.setBorder(new EmptyBorder(1, 1, 1, 1));
                    rwPitWall.btnD2Hard.setBorder(new EmptyBorder(1, 1, 1, 1));
                    nextTyreIndex = -1;
                }
            }
            //Set new lane
            nextlane = setLane();
            target = setTargetVec();
            //Check lap end
            if (nextwaypoint == 0) {
                speedadjustnum = 50;
                speedStart = setLapSpeed();
                if (inPit == false) {
                    speed = speedStart;
                    raceTyres[currentTyreIndex].age++;
                }
                lapsCompleted++;
                newsector = 2;
            }
            //Adjust speed
            speed = speedAdjust();
            //Adjust heading
            carHeading = setHeading();
        }
        return newsector;
    }
    
    public double runLapSim() {
        double tBase = rwCircuitMap.tQ + rwCircuitMap.tPaceGap;
        double tTyre = raceTyres[currentTyreIndex].age * raceTyres[currentTyreIndex].k2 + raceTyres[currentTyreIndex].k3;
        double tFuel = (mFuelStart - (BfuelLap * (lapsCompleted + 1))) * 0.033;
        double tGrid = 0;
        if (lapsCompleted == 0) {
            tGrid = gridpos * rwCircuitMap.tGridPos + rwCircuitMap.tFirstLap;
        }
        return tBase + tTyre + tFuel + tCar + tDriver + tGrid;
    }

    public float speedAdjust() {
        if (inLimit == true) {
            return rwCircuitMap.pitSpeedLimit;
        }
        if (speedadjustnum > 0) {
            if (r.nextInt(4) == 1) {
                speedadjustnum--;
                return speed + (r.nextFloat() * -1) + 0.5f;
            }
        }
        return speed;
    }

    private int setLane() {
        boolean[] avail = new boolean[] {true, true, true, true, true};
        rwCar lanecar = null;
        if (inPit == true && inLimit == false) {
            return 5;
        }
        if (inPit == true) {
            return 1;
        }
        for (rwCar car : Race.cars) {
            if (car.nextwaypoint == nextwaypoint && car.num != num) {
                avail[car.nextlane - 1] = false;
                if (car.nextlane == nextlane) {
                    lanecar = car;
                }
            }
        }
        
        if (nextwaypoint == rwCircuitMap.pitInIndex && pitThisLap == true) {
            return 5;
        }
        switch (nextlane) {
            case 1:
                if (avail[0] == true) {
                    return 1;
                }
                if (avail[1] == true) {
                    return 2;
                }
                if (avail[2] == true) {
                    return 3;
                }
                if (avail[3] == true) {
                    return 4;
                }
                if (avail[4] == true) {
                    return 5;
                } else {
                    speed = lanecar.speed - 0.5f;
                    return nextlane;
                }
            case 2:
                if (avail[1] == true) {
                    return 2;
                }
                if (avail[0] == true) {
                    return 1;
                }
                if (avail[2] == true) {
                    return 3;
                }
                if (avail[3] == true) {
                    return 4;
                }
                if (avail[4] == true) {
                    return 5;
                } else {
                    speed = lanecar.speed - 0.5f;
                    return nextlane;
                }
            case 3:
                if (avail[2] == true) {
                    return 3;
                }
                if (avail[1] == true) {
                    return 2;
                }
                if (avail[3] == true) {
                    return 4;
                }
                if (avail[0] == true) {
                    return 1;
                }
                if (avail[4] == true) {
                    return 5;
                } else {
                    speed = lanecar.speed - 0.5f;
                    return nextlane;
                }
            case 4:
                if (avail[3] == true) {
                    return 4;
                }
                if (avail[2] == true) {
                    return 3;
                }
                if (avail[4] == true) {
                    return 5;
                }
                if (avail[1] == true) {
                    return 2;
                }
                if (avail[0] == true) {
                    return 1;
                } else {
                    speed = lanecar.speed - 0.5f;
                    return nextlane;
                }
            case 5:
                if (avail[4] == true) {
                    return 5;
                }
                if (avail[3] == true) {
                    return 4;
                }
                if (avail[2] == true) {
                    return 3;
                }
                if (avail[1] == true) {
                    return 2;
                }
                if (avail[0] == true) {
                    return 1;
                } else {
                    speed = lanecar.speed - 0.5f;
                    return nextlane;
                }
        }
        return nextlane;
    }

    private float setLapSpeed() {
        return (float) ((((rwCircuitMap.kmlength * 1000) / runLapSim())) / scale);
    }

    public float setHeading() {
        return (float) Math.atan2(target.x - locationx, target.y - locationy);
    }

    public Vec3 setTargetVec() {
        if (inPit == true) {
            if (nextwaypoint < rwCircuitMap.pitOutIndex) {
                return rwCircuitMap.pits.get(nextwaypoint + rwCircuitMap.pitTimingIndex + 1);
            } else {
                return rwCircuitMap.pits.get(nextwaypoint - rwCircuitMap.pitInIndex - 1);
            }
        }
        Vec3 l = rwCircuitMap.waypoints.get(nextwaypoint)[0];
        Vec3 r = rwCircuitMap.waypoints.get(nextwaypoint)[1];
        double percent = 0;
        switch (nextlane) {
            case 1:
                percent = 0.1;
                break;
            case 2:
                percent = 0.3;
                break;
            case 3:
                percent = 0.5;
                break;
            case 4:
                percent = 0.7;
                break;
            case 5:
                percent = 0.9;
                break;
        }
        Vec3 targetVec = new Vec3((l.x + ((r.x - l.x) * percent)), (l.y + ((r.y - l.y) * percent)), 0);
        return targetVec;
    }

    public double getPosition(int plane) {
        switch (plane) {
            case 0: //x
                return locationx;
            case 1: //y
                return locationy;
            default:
                return 0;
        }
    }

    public float distanceToWaypoint(Vec3 waypoint) {
        double ax = waypoint.x;
        double ay = waypoint.y;
        double bx = locationx;
        double by = locationy;

        double dist = Math.sqrt((by - ay) * (by - ay) + (bx - ax) * (bx - ax));
        return (float) dist;
    }

    public void checkWheels() {
        Vec3 flLocal = new Vec3(0, 0, 0);
        Vec3 frLocal = new Vec3(0, 0, 0);
        Vec3 rlLocal = new Vec3(0, 0, 0);
        Vec3 rrLocal = new Vec3(0, 0, 0);

        double angleDeg = Math.toDegrees(carHeading) % 360.0;
        if (angleDeg < 0) {
            angleDeg += 360;
        }

        flLocal.x = Math.cos(Math.toRadians(angleDeg)) * locationy + Math.sin(Math.toRadians(angleDeg)) * locationx;
        flLocal.y = -Math.sin(Math.toRadians(angleDeg)) * locationy + Math.cos(Math.toRadians(angleDeg)) * locationx;
        flLocal.x += pixelLength / 2.0f;
        flLocal.y += pixelWidth / 2.0f;
        flWorld.x = Math.cos(Math.toRadians(angleDeg)) * flLocal.y + Math.sin(Math.toRadians(angleDeg)) * flLocal.x;
        flWorld.y = -Math.sin(Math.toRadians(angleDeg)) * flLocal.y + Math.cos(Math.toRadians(angleDeg)) * flLocal.x;

        frLocal.x = Math.cos(Math.toRadians(angleDeg)) * locationy + Math.sin(Math.toRadians(angleDeg)) * locationx;
        frLocal.y = -Math.sin(Math.toRadians(angleDeg)) * locationy + Math.cos(Math.toRadians(angleDeg)) * locationx;
        frLocal.x += pixelLength / 2.0f;
        frLocal.y -= pixelWidth / 2.0f;
        frWorld.x = Math.cos(Math.toRadians(angleDeg)) * frLocal.y + Math.sin(Math.toRadians(angleDeg)) * frLocal.x;
        frWorld.y = -Math.sin(Math.toRadians(angleDeg)) * frLocal.y + Math.cos(Math.toRadians(angleDeg)) * frLocal.x;

        rlLocal.x = Math.cos(Math.toRadians(angleDeg)) * locationy + Math.sin(Math.toRadians(angleDeg)) * locationx;
        rlLocal.y = -Math.sin(Math.toRadians(angleDeg)) * locationy + Math.cos(Math.toRadians(angleDeg)) * locationx;
        rlLocal.x -= pixelLength / 2.0f;
        rlLocal.y += pixelWidth / 2.0f;
        rlWorld.x = Math.cos(Math.toRadians(angleDeg)) * rlLocal.y + Math.sin(Math.toRadians(angleDeg)) * rlLocal.x;
        rlWorld.y = -Math.sin(Math.toRadians(angleDeg)) * rlLocal.y + Math.cos(Math.toRadians(angleDeg)) * rlLocal.x;

        rrLocal.x = Math.cos(Math.toRadians(angleDeg)) * locationy + Math.sin(Math.toRadians(angleDeg)) * locationx;
        rrLocal.y = -Math.sin(Math.toRadians(angleDeg)) * locationy + Math.cos(Math.toRadians(angleDeg)) * locationx;
        rrLocal.x -= pixelLength / 2.0f;
        rrLocal.y -= pixelWidth / 2.0f;
        rrWorld.x = Math.cos(Math.toRadians(angleDeg)) * rrLocal.y + Math.sin(Math.toRadians(angleDeg)) * rrLocal.x;
        rrWorld.y = -Math.sin(Math.toRadians(angleDeg)) * rrLocal.y + Math.cos(Math.toRadians(angleDeg)) * rrLocal.x;
    }

    public double calcDriver() {
        double skills = driver.attributes[0] * 6 + driver.attributes[1] * 5 + driver.attributes[2] * 5 + driver.attributes[4] * 4 + driver.attributes[5] * 6;
        double temperament = driver.attAcceleration + driver.attBraking + driver.attDefence + driver.attKerbs + driver.attLapping + driver.attOffLine + driver.attOvertaking + driver.attTopSpeed;
        return 1.6 - ((skills + temperament) / 100.0);
    }

    public double calcCar() {
        double components = 6 * (team.currentCar.brakes.performance
                + team.currentCar.clutch.performance + team.currentCar.gearbox.performance
                + team.currentCar.hydraulics.performance + team.currentCar.suspension.performance
                + team.currentCar.throttle.performance);
        double ice = team.currentCar.ice.fuel * 3 + team.currentCar.ice.power * 5
                + team.currentCar.ice.heat * 2 + team.currentCar.ice.rigidity + team.currentCar.ice.weight * 3;
        double tc = team.currentCar.turbo.power * 5 + team.currentCar.turbo.heat * 2 + team.currentCar.turbo.weight * 3;
        double mguh = team.currentCar.mguh.power * 5 + team.currentCar.mguh.heat * 2 + team.currentCar.mguh.weight * 3;
        double mguk = team.currentCar.mguk.power * 5 + team.currentCar.mguk.heat * 2 + team.currentCar.mguk.weight * 3;
        double es = team.currentCar.es.capacity * 3 + team.currentCar.es.heat * 1 + team.currentCar.es.weight * 3;
        double ce = team.currentCar.ce.rigidity + team.currentCar.ce.weight * 2;
        return 2.7 - (((team.currentCar.chassis.handling / 100.0) * (components + ice + tc + mguh + mguk + es + ce)) / 200.0);
    }

    public int setReliability() {
        return team.currentCar.brakes.reliability + team.currentCar.clutch.reliability
                + team.currentCar.gearbox.reliability + team.currentCar.hydraulics.reliability
                + team.currentCar.suspension.reliability + team.currentCar.throttle.reliability
                + team.currentCar.ice.reliability + team.currentCar.turbo.reliability
                + team.currentCar.mguh.reliability + team.currentCar.mguk.reliability
                + team.currentCar.es.reliability + team.currentCar.ce.reliability;
    }

    public void setTyres() {
        int[] def = new int[]{3, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 2, 3};
        if (team.isPlayer == true) {
            if (driver.raceNum == team.driver1.raceNum) {
                for (int i = 0; i < 13; i++) {
                    if (team.d1tyres[i] == 1) {
                        raceTyres[i] = new RaceTyre(team.currentCar.tyres[Race.soft - 1]);
                    } else if (team.d1tyres[i] == 2) {
                        raceTyres[i] = new RaceTyre(team.currentCar.tyres[Race.medium - 1]);
                    } else {
                        raceTyres[i] = new RaceTyre(team.currentCar.tyres[Race.hard - 1]);
                    }
                }
            } else {
                for (int i = 0; i < 13; i++) {
                    if (team.d2tyres[i] == 1) {
                        raceTyres[i] = new RaceTyre(team.currentCar.tyres[Race.soft - 1]);
                    } else if (team.d2tyres[i] == 2) {
                        raceTyres[i] = new RaceTyre(team.currentCar.tyres[Race.medium - 1]);
                    } else {
                        raceTyres[i] = new RaceTyre(team.currentCar.tyres[Race.hard - 1]);
                    }
                }
            }
        } else {
            for (int i = 0; i < 13; i++) {
                    if (def[i] == 1) {
                        raceTyres[i] = new RaceTyre(team.currentCar.tyres[Race.soft - 1]);
                    } else if (def[i] == 2) {
                        raceTyres[i] = new RaceTyre(team.currentCar.tyres[Race.medium - 1]);
                    } else {
                        raceTyres[i] = new RaceTyre(team.currentCar.tyres[Race.hard - 1]);
                    }
                }
        }
        for (int i = 0; i < 13; i++) {
            if (raceTyres[i].usable == true && i != currentTyreIndex) {
                if (raceTyres[i].compound == Race.softComp) {
                    availTyres[0]++;
                } else if (raceTyres[i].compound == Race.medComp) {
                    availTyres[1]++;
                } else if (raceTyres[i].compound == Race.hardComp) {
                    availTyres[2]++;
                }
            }
        }
    }

    public void draw(Graphics g) {
        g.setColor(team.teamColor);
        g.drawLine((int) flWorld.x, (int) flWorld.y, (int) frWorld.x, (int) frWorld.y);
        g.drawLine((int) frWorld.x, (int) frWorld.y, (int) rrWorld.x, (int) rrWorld.y);
        g.drawLine((int) rrWorld.x, (int) rrWorld.y, (int) rlWorld.x, (int) rlWorld.y);
        g.drawLine((int) rlWorld.x, (int) rlWorld.y, (int) flWorld.x, (int) flWorld.y);
    }

}
