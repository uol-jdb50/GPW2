/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josh Brookes
 */
public class DriverStanding {
    public Driver driver;
    public int points;
    public int poles;
    public List<Integer> results = new ArrayList<Integer>();
    
    public DriverStanding(Driver driver) {
        this.driver = driver;
        points = 0;
        poles = 0;
    }
    
    public int getWins() {
        int wins = 0;
        for (int i: results) {
            if (i == 1) wins++;
        }
        return wins;
    }
    
}
