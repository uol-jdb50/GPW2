/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gui.raceWeekend;

/**
 *
 * @author Josh Brookes
 */
public class PitStop {
    public int lap;
    public int raceTyreIndex;
    
    public PitStop(int lap, int raceTyreIndex) {
        this.lap = lap;
        this.raceTyreIndex = raceTyreIndex;
    }
}
