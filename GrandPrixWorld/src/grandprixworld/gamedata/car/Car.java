/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata.car;

import grandprixworld.gamedata.car.engine.Electronics;
import grandprixworld.gamedata.car.engine.EnergyStore;
import grandprixworld.gamedata.car.engine.ICE;
import grandprixworld.gamedata.car.engine.MGUH;
import grandprixworld.gamedata.car.engine.MGUK;
import grandprixworld.gamedata.car.engine.Turbo;
import grandprixworld.gamedata.car.tyres.Tyres;

/**
 *
 * @author Josh Brookes
 */
public class Car {
    public Chassis chassis;
    public ICE ice;
    public MGUH mguh;
    public MGUK mguk;
    public EnergyStore es;
    public Turbo turbo;
    public Electronics ce;
    public Tyres[] tyres = new Tyres[7];
    public Fuel fuel;
    public Brakes brakes;
    public Clutch clutch;
    public Gearbox gearbox;
    public Hydraulics hydraulics;
    public Suspension suspension;
    public Throttle throttle;
    public ActiveSusp activesusp;
    public AutoGears autogears;
    public PowerBrakes powerbrakes;
    public TractionControl tractioncontrol;
    
    public Car(Chassis chassis, ICE ice, MGUH mguh, MGUK mguk, EnergyStore es, 
            Turbo turbo, Electronics ce, Tyres[] tyres, Fuel fuel, Brakes brakes,
            Clutch clutch, Gearbox gearbox, Hydraulics hydraulics, 
            Suspension suspension, Throttle throttle, ActiveSusp activesusp, 
            AutoGears autogears, PowerBrakes powerbrakes, TractionControl tractioncontrol) {
        this.chassis = chassis;
        this.ice = ice;
        this.mguh = mguh;
        this.mguk = mguk;
        this.es = es;
        this.turbo = turbo;
        this.ce = ce;
        this.tyres = tyres;
        this.fuel = fuel;
        this.brakes = brakes;
        this.clutch = clutch;
        this.gearbox = gearbox;
        this.hydraulics = hydraulics;
        this.suspension = suspension;
        this.throttle = throttle;
        this.activesusp = activesusp;
        this.autogears = autogears;
        this.powerbrakes = powerbrakes;
        this.tractioncontrol = tractioncontrol;
    }
    public Car(Car car) {
        this.chassis = car.chassis;
        this.ice = car.ice;
        this.mguh = car.mguh;
        this.mguk = car.mguk;
        this.es = car.es;
        this.turbo = car.turbo;
        this.ce = car.ce;
        this.tyres = car.tyres;
        this.fuel = car.fuel;
        this.brakes = car.brakes;
        this.clutch = car.clutch;
        this.gearbox = car.gearbox;
        this.hydraulics = car.hydraulics;
        this.suspension = car.suspension;
        this.throttle = car.throttle;
        this.activesusp = car.activesusp;
        this.autogears = car.autogears;
        this.powerbrakes = car.powerbrakes;
        this.tractioncontrol = car.tractioncontrol;
    }
}
