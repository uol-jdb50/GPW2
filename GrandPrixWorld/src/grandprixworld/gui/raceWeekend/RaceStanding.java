/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gui.raceWeekend;

import grandprixworld.gamedata.Driver;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josh Brookes
 */
public class RaceStanding {
    Driver driver;
    double qualyTime;
    boolean differentCompound;
    //rwCar car;
    int carnum;
    double raceTime;
    int sectorsCompleted;
    int lapsCompleted;
    Stopwatch sectortimer;
    Stopwatch laptimer;
    List<String> lapTimes;
    List<Double> laps;
    double bestlap;
    int bestlapindex;
    
    public RaceStanding(Driver driver, int carnum) {
        this.driver = driver;
        this.carnum = carnum;
        raceTime = 0;
        lapsCompleted = 0;
        sectortimer = new Stopwatch();
        laptimer = new Stopwatch();
        lapTimes = new ArrayList<>();
        laps = new ArrayList<>();
        differentCompound = false;
        bestlap = 10000000;
        bestlapindex = -1;
    }
}
