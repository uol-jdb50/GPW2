/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata.car.tyres;

/**
 *
 * @author Josh Brookes
 */
public class Tyres {
    public int year;
    public int version;
    public int iteration;
    public String supplier;
    public String name;
    public int grip;
    public int resilience;
    public int stiffness;
    public int heat;
    public Compound compound;
    
    public double k2;//Tyre deg
    public double k3;//Time offset by compound
    
    public Tyres(int year, int version, int iteration, String supplier, Compound compound, int grip, int resilience, int stiffness, int heat) {
        this.compound = compound;
        this.grip = grip;
        this.resilience = resilience;
        this.stiffness = stiffness;
        this.heat = heat;
        name = supplier.substring(0, 2).toUpperCase() + "-" + compound.toString() + "-" + Integer.toString(year - 2000) + ((iteration == 1) ? "XX" : supplier.substring(0, 1).toUpperCase()) + "-" + String.format("%02d", version) + String.valueOf((char)(iteration + 64)).toUpperCase();
        calculateKFactors();
    }
    public Tyres(Tyres parent) {
        this.year = parent.year;
        this.version = parent.version;
        this.iteration = parent.iteration;
        this.supplier = parent.supplier;
        this.name = parent.name;
        this.compound = parent.compound;
        this.grip = parent.grip;
        this.resilience = parent.resilience;
        this.stiffness = parent.stiffness;
        this.heat = parent.heat;
        this.k2 = parent.k2;
        this.k3 = parent.k3;
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
        name = supplier.substring(0, 2).toUpperCase() + "-" + compound.toString() + "-" + Integer.toString(year - 2000) + ((iteration == 1) ? "XX" : supplier.substring(0, 1).toUpperCase()) + "-" + String.format("%02d", version) + String.valueOf((char)(iteration + 64)).toUpperCase();
    }
    public void calculateKFactors() {
        k2 = (120 - grip - (resilience * 5) - stiffness - (heat * 3)) / 1000.0f;
        k3 = ((80 - (grip * 4) - (stiffness * 3) - heat) / 100.0f) * 1.5;
    }
}
