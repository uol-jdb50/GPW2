/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata.car.engine;

import grandprixworld.gamedata.Team;

/**
 *
 * @author Josh Brookes
 */
public class ICE {
    public int year;
    public int version;
    public int iteration;
    public String supplier;
    public String name;
    public int fuel;
    public int power;
    public int heat;
    public int reliability;
    public int rigidity;
    public int weight;
    
    public ICE(int year, int version, int iteration, String supplier, int fuel, int power, int heat, int reliability, int rigidity, int weight) {
        this.year = year;
        this.version = version;
        this.iteration = iteration;
        this.supplier = supplier;
        this.fuel = fuel;
        this.power = power;
        this.heat = heat;
        this.reliability = reliability;
        this.rigidity = rigidity;
        this.weight = weight;
        name = supplier.substring(0, 2).toUpperCase() + "-ICE" + Integer.toString(year - 2000) + ((iteration == 1) ? "XX" : supplier.substring(0, 1).toUpperCase()) + "-" + String.format("%02d", version) + String.valueOf((char)(iteration + 64)).toUpperCase();
    }
    public ICE(ICE parent) {
        this.year = parent.year;
        this.version = parent.version;
        this.iteration = parent.iteration;
        this.supplier = parent.supplier;
        this.name = parent.name;
        this.fuel = parent.fuel;
        this.power = parent.power;
        this.heat = parent.heat;
        this.reliability = parent.reliability;
        this.rigidity = parent.rigidity;
        this.weight = parent.weight;
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
        name = supplier.substring(0, 2).toUpperCase() + "-ICE" + Integer.toString(year - 2000) + ((iteration == 1) ? "XX" : supplier.substring(0, 1).toUpperCase()) + "-" + String.format("%02d", version) + String.valueOf((char)(iteration + 64)).toUpperCase();
    }
}
