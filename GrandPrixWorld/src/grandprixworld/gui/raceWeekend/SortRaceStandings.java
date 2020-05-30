/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gui.raceWeekend;

import java.util.Comparator;

/**
 *
 * @author Josh Brookes
 */
public class SortRaceStandings implements Comparator<RaceStanding> {

    @Override
    public int compare(RaceStanding o1, RaceStanding o2) {
        if (o1.lapsCompleted > o2.lapsCompleted) return -1;
        else if (o1.lapsCompleted < o2.lapsCompleted) return 1;
        else {
            if (o1.raceTime > o2.raceTime) return 1;
            if (o1.raceTime < o2.raceTime) return -1;
            else return 0;
        }
    }
    
}
