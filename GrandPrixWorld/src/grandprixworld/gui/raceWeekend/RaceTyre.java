/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gui.raceWeekend;

import grandprixworld.gamedata.car.tyres.Compound;
import grandprixworld.gamedata.car.tyres.Tyres;


/**
 *
 * @author Josh Brookes
 */
public class RaceTyre {
    public int grip;
    public int resilience;
    public int stiffness;
    public int heat;
    public Compound compound;
    
    public double k2;
    public double k3;
    
    public int age;
    public double temperature;
    public boolean usable;
    
    public RaceTyre(Tyres tyre) {
        this.grip = tyre.grip;
        this.resilience = tyre.resilience;
        this.stiffness = tyre.stiffness;
        this.heat = tyre.heat;
        this.compound = tyre.compound;
        this.k2 = tyre.k2;
        this.k3 = tyre.k3;
        
        age = 0;
        temperature = 0;
        usable = true;
    }
    public RaceTyre(RaceTyre tyre) {
        this.grip = tyre.grip;
        this.resilience = tyre.resilience;
        this.stiffness = tyre.stiffness;
        this.heat = tyre.heat;
        this.compound = tyre.compound;
        this.k2 = tyre.k2;
        this.k3 = tyre.k3;
        this.age = tyre.age;
        this.temperature = tyre.temperature;
        this.usable = tyre.usable;
    }
}
