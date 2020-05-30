/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata.car;

import grandprixworld.gamedata.Team;

/**
 *
 * @author Josh Brookes
 */
public class Fuel {
    public int year;
    public int version;
    public int iteration;
    public String supplier;
    public String name;
    public int performance;
    public int tolerance;
    
    public Fuel(int year, int version, int iteration, String supplier, int performance, int tolerance) {
        this.year = year;
        this.version = version;
        this.iteration = iteration;
        this.supplier = supplier;
        this.performance = performance;
        this.tolerance = tolerance;
        name = supplier.substring(0, 2).toUpperCase() + "-" + Integer.toString(year - 2000) + ((iteration == 1) ? "XX" : supplier.substring(0, 1).toUpperCase()) + "-" + String.format("%02d", version) + String.valueOf((char)(iteration + 64)).toUpperCase();
    }
    public Fuel(Fuel parent) {
        this.year = parent.year;
        this.version = parent.version;
        this.iteration = parent.iteration;
        this.supplier = parent.supplier;
        this.name = parent.name;
        this.performance = parent.performance;
        this.tolerance = parent.tolerance;
    }
    public void resetName(int year, int version, int iteration) {
        if (year != 0) {
            this.year = year;
        }
        if (version != 0) {
            this.version = version;
        }
        if (iteration != 0) {
            this.iteration = iteration;
        }
        name = supplier.substring(0, 2).toUpperCase() + "-" + Integer.toString(year - 2000) + ((iteration == 1) ? "XX" : supplier.substring(0, 1).toUpperCase()) + "-" + String.format("%02d", version) + String.valueOf((char)(iteration + 64)).toUpperCase();
    }
}