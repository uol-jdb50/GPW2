/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata;

import grandprixworld.gamedata.car.*;
import grandprixworld.gamedata.car.engine.Electronics;
import grandprixworld.gamedata.car.engine.EnergyStore;
import grandprixworld.gamedata.car.engine.ICE;
import grandprixworld.gamedata.car.engine.MGUH;
import grandprixworld.gamedata.car.engine.MGUK;
import grandprixworld.gamedata.car.engine.Turbo;
import grandprixworld.gamedata.car.tyres.Compound;
import grandprixworld.gamedata.car.tyres.Tyres;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author jdb50
 */
public class Team {
    private Random rnd = new Random();
    public String name;
    public int lastCCPos;
    public Driver driver1;
    public Driver driver2;
    public Color teamColor;
    public String principal;
    public CommercialDirector commDir;
    public ChiefDesigner chiefDes;
    public ChiefMechanic chiefMech;
    public TechnicalDirector techDir;
    public Driver youth1;
    public Driver youth2;
    public Driver youth3;
    public Factory factory;
    public int balance;
    public TeamSponsor teamSp;
    public EngineSponsor engineSp;
    public int engineCtId;
    public FuelSponsor fuelSp;
    public int fuelCtId;
    public TyreSponsor tyreSp;
    public int tyreCtId;
    public CashSponsor cashSp1;
    public CashSponsor cashSp2;
    public CashSponsor cashSp3;
    public CashSponsor cashSp4;
    public CashSponsor cashSp5;
    public CashSponsor cashSp6;
    
    public CommercialDirector nextCommDir;
    public ChiefDesigner nextChiefDes;
    public ChiefMechanic nextChiefMech;
    public TechnicalDirector nextTechDir;
    
    public TeamSponsor nextTeamSp;
    public EngineSponsor nextEngineSp;
    public FuelSponsor nextFuelSp;
    public TyreSponsor nextTyreSp;
    public CashSponsor nextCashSp1;
    public CashSponsor nextCashSp2;
    public CashSponsor nextCashSp3;
    public CashSponsor nextCashSp4;
    public CashSponsor nextCashSp5;
    public CashSponsor nextCashSp6;
    
    public boolean isPlayer;
    
    int driver1num;
    int driver2num;
    int youth1num;
    int youth2num;
    int youth3num;
    
    public List<DriverNegotiation> driverTalks = new ArrayList<DriverNegotiation>();
    public List<CommercialNegotiation> commTalks = new ArrayList<CommercialNegotiation>();
    public List<DesignerNegotiation> desTalks = new ArrayList<DesignerNegotiation>();
    public List<TechnicalNegotiation> techTalks = new ArrayList<TechnicalNegotiation>();
    public List<MechanicNegotiation> mechTalks = new ArrayList<MechanicNegotiation>();
    
    public Driver nextDriver1 = null;
    public Driver nextDriver2 = null;
    public Driver nextYouth1 = null;
    public Driver nextYouth2 = null;
    public Driver nextYouth3 = null;
    
    public int[] commStaff = new int[5];
    public int[] desStaff = new int[5];
    public int[] techStaff = new int[5];
    public int[] mechStaff = new int[5];
    
    public int commAvail;
    public int desAvail;
    public int techAvail;
    public int mechAvail;
    
    public int mntStaffUsed;
    public int repStaffUsed;
    public int tstStaffUsed;
    
    public int cnstStaffUsed;
    
    public int spares;
    
    public int car1mnt;
    public int car2mnt;
    public int car3mnt;
    public int car4mnt;
    public int car1rep;
    public int car2rep;
    public int car3rep;
    public int car4rep;
    
    public int testMiles;
    
    public int tstMechDev;
    public int tstMechRes;
    public int tstMechEng;
    public int tstMechTyre;
    public int tstMechFuel;
    
    public int tstD1Dev;
    public int tstD1Res;
    public int tstD1Eng;
    public int tstD1Tyre;
    public int tstD1Fuel;
    public int tstD2Dev;
    public int tstD2Res;
    public int tstD2Eng;
    public int tstD2Tyre;
    public int tstD2Fuel;
    public int tstRDDev;
    public int tstRDRes;
    public int tstRDEng;
    public int tstRDTyre;
    public int tstRDFuel;
    
    public int tstDev;
    public int tstRes;
    public int tstEng;
    public int tstTyre;
    public int tstFuel;
    public boolean tstDevDone;
    public boolean tstResDone;
    
    public int praD1Set;
    public int praD1Dev;
    public int praD1Res;
    public int praD1Qua;
    public int praD1Str;
    public int praD2Set;
    public int praD2Dev;
    public int praD2Res;
    public int praD2Qua;
    public int praD2Str;
    
    public int cyStage;
    public int nyStage;
    
    public int desCY;
    public int desNY;
    public int desTech;
    public int desAids;
    
    public int[] commHire = new int[5];
    public int[] desHire = new int[5];
    public int[] techHire = new int[5];
    public int[] mechHire = new int[5];
    
    public Car currentCar;
    public Car nextCar;
    
    public Car[] currentYearCars = new Car[4];
    public Car[] nextYearCars = new Car[4];
    
    public int d1car;
    public int d2car;
    public int rdcar;
    
    public int currentCars;
    public int nextCars;
    
    public Chassis currentYearChassis;
    public Chassis nextYearChassis;
    
    public ChassisDev currentDevCY;
    public ChassisDev currentDevNY;
    
    public List<ICE> ice = new ArrayList<ICE>();
    public List<MGUH> mguh = new ArrayList<MGUH>();
    public List<MGUK> mguk = new ArrayList<MGUK>();
    public List<EnergyStore> es = new ArrayList<EnergyStore>();
    public List<Turbo> turbo = new ArrayList<Turbo>();
    public List<Electronics> ce = new ArrayList<Electronics>();
    public List<Fuel> fuel = new ArrayList<Fuel>();
    public List<Tyres> c1tyres = new ArrayList<Tyres>();
    public List<Tyres> c2tyres = new ArrayList<Tyres>();
    public List<Tyres> c3tyres = new ArrayList<Tyres>();
    public List<Tyres> c4tyres = new ArrayList<Tyres>();
    public List<Tyres> c5tyres = new ArrayList<Tyres>();
    public List<Tyres> intertyres = new ArrayList<Tyres>();
    public List<Tyres> wettyres = new ArrayList<Tyres>();
    
    public int[] d1tyres = new int[13];
    public int[] d2tyres = new int[13];
    
    public Brakes brakes;
    public Clutch clutch;
    public Gearbox gearbox;
    public Hydraulics hydraulics;
    public Suspension suspension;
    public Throttle throttle;
    
    public int techInProd;
    public int techProg;
    public int upgradeAvail;
    
    public ActiveSusp activesusp;
    public AutoGears autogears;
    public PowerBrakes powerbrakes;
    public TractionControl tractioncontrol;
    
    public int aidInProd;
    public int aidProg;
    public int aidAvail;
    
    public Team(String name, int ccpos19, int driver1num, int driver2num, 
            String principal, CommercialDirector commDir, ChiefDesigner chiefDes, 
            ChiefMechanic chiefMech, TechnicalDirector techDir, int youth1num, 
            int youth2num, int youth3num, int factorySize, int startBalance, 
            TeamSponsor teamSp, EngineSponsor engineSp, int engineCtId, FuelSponsor fuelSp, 
            int fuelCtId, TyreSponsor tyreSp, int tyreCtId, String cashSp1Name, String cashSp2Name, 
            String cashSp3Name, String cashSp4Name, String cashSp5Name, 
            String cashSp6Name, boolean isPlayer, Color color, int handling) {
        this.name = name;
        this.lastCCPos = ccpos19;
        this.driver1num = driver1num;
        this.driver2num = driver2num;
        this.teamColor = color;
        this.principal = principal;
        this.commDir = commDir;
        this.chiefDes = chiefDes;
        this.chiefMech = chiefMech;
        this.techDir = techDir;
        this.youth1num = youth1num;
        this.youth2num = youth2num;
        this.youth3num = youth3num;
        factory = new Factory(factorySize);
        this.balance = startBalance;
        this.teamSp = teamSp;
        this.engineSp = engineSp;
        this.fuelSp = fuelSp;
        this.tyreSp = tyreSp;
        this.engineCtId = engineCtId;
        this.fuelCtId = fuelCtId;
        this.tyreCtId = tyreCtId;
        
        this.isPlayer = isPlayer;
        
        commStaff = setupStaff();
        desStaff = setupStaff();
        techStaff = setupStaff();
        mechStaff = setupStaff();
        
        commAvail = 100;
        desAvail = 100;
        techAvail = 100;
        mechAvail = 100;
        
        mntStaffUsed = 0;
        repStaffUsed = 0;
        tstStaffUsed = 0;
        cnstStaffUsed = 0;
        
        spares = 3;
        
        tstDev = 0;
        tstRes = 0;
        tstEng = 0;
        tstTyre = 0;
        tstFuel = 0;
        
        //Engineering
        currentYearChassis = new Chassis(2019, name, handling, 1);
        ice.add(new ICE(engineSp.ice));
        mguh.add(new MGUH(engineSp.mguh));
        mguk.add(new MGUK(engineSp.mguk));
        es.add(new EnergyStore(engineSp.es));
        turbo.add(new Turbo(engineSp.turbo));
        ce.add(new Electronics(engineSp.ce));
        c1tyres.add(new Tyres(tyreSp.c1));
        c2tyres.add(new Tyres(tyreSp.c2));
        c3tyres.add(new Tyres(tyreSp.c3));
        c4tyres.add(new Tyres(tyreSp.c4));
        c5tyres.add(new Tyres(tyreSp.c5));
        intertyres.add(new Tyres(2019, 1, 1, tyreSp.name, Compound.Inter, 5, 5, 5, 5));
        wettyres.add(new Tyres(2019, 1, 1, tyreSp.name, Compound.Wet, 5, 5, 5, 5));
        
        Tyres[] tyres = new Tyres[7];
        tyres[0] = c1tyres.get(0);
        tyres[1] = c2tyres.get(0);
        tyres[2] = c3tyres.get(0);
        tyres[3] = c4tyres.get(0);
        tyres[4] = c5tyres.get(0);
        tyres[5] = intertyres.get(0);
        tyres[6] = wettyres.get(0);
        
        fuel.add(new Fuel(fuelSp.fuel));
        
        brakes = new Brakes(rnd.nextInt(5) + 1, rnd.nextInt(5) + 1);
        clutch = new Clutch(rnd.nextInt(5) + 1, rnd.nextInt(5) + 1);
        gearbox = new Gearbox(rnd.nextInt(5) + 1, rnd.nextInt(5) + 1);
        hydraulics = new Hydraulics(rnd.nextInt(5) + 1, rnd.nextInt(5) + 1);
        suspension = new Suspension(rnd.nextInt(5) + 1, rnd.nextInt(5) + 1);
        throttle = new Throttle(rnd.nextInt(5) + 1, rnd.nextInt(5) + 1);
        
        upgradeAvail = 0;
        
        activesusp = new ActiveSusp(0, true);
        autogears = new AutoGears(0, true);
        powerbrakes = new PowerBrakes(0, true);
        tractioncontrol = new TractionControl(0, true);
        
        aidAvail = 0;
        
        currentCar = new Car(new Chassis(currentYearChassis), ice.get(0), mguh.get(0),
                    mguk.get(0), es.get(0), turbo.get(0), ce.get(0), tyres, fuel.get(0), brakes, 
                    clutch, gearbox, hydraulics, suspension, throttle, activesusp, 
                    autogears, powerbrakes, tractioncontrol);
        
        for (int i = 0; i < 2; i++) {
            currentYearCars[i] = new Car(currentCar);
        }
        currentCars = 2;
        nextCars = 0;
        
        d1car = 0;
        d2car = 1;
        rdcar = -1;
    }
    
    public void setDriver(Driver d, int position) {
        switch (position) {
            case 1: driver1 = d; break;
            case 2: driver2 = d; break;
            case 3: youth1 = d; break;
            case 4: youth2 = d; break;
            case 5: youth3 = d; break;
        }
    }
    
    private int[] setupStaff() {
        int[] staff = new int[5];
        Random rnd = new Random();
        int max;
        switch (factory.size) {
            case 1:
                max = rnd.nextInt(5) + 25;
                staff[1] = rnd.nextInt(3);//3
                staff[2] = rnd.nextInt(6);//6
                staff[3] = rnd.nextInt(4) + 6;//10
                staff[4] = max - staff[1] - staff[2] - staff[3];
                break;
            case 2:
                max = rnd.nextInt(6) + 33;
                staff[0] = rnd.nextInt(2);//2
                staff[1] = rnd.nextInt(2) + 3;//5
                staff[2] = rnd.nextInt(3) + 5;//8
                staff[3] = rnd.nextInt(4) + 7;//11
                staff[4] = max - staff[0] - staff[1] - staff[2] - staff[3];
                break;
            case 3:
                max = rnd.nextInt(8) + 40;
                staff[0] = rnd.nextInt(2) + 2;//4
                staff[1] = rnd.nextInt(3) + 4;//7
                staff[2] = rnd.nextInt(4) + 8;//12
                staff[3] = rnd.nextInt(5) + 6;//11
                staff[4] = max - staff[0] - staff[1] - staff[2] - staff[3];
                break;
            case 4:
                max = rnd.nextInt(10) + 55;
                staff[0] = rnd.nextInt(3) + 4;//7
                staff[1] = rnd.nextInt(4) + 8;//12
                staff[2] = rnd.nextInt(5) + 13;//18
                staff[3] = rnd.nextInt(6) + 6;//12
                staff[4] = max - staff[0] - staff[1] - staff[2] - staff[3];
                break;
            case 5:
                max = rnd.nextInt(12) + 73;
                staff[0] = rnd.nextInt(4) + 6;//10
                staff[1] = rnd.nextInt(5) + 12;//17
                staff[2] = rnd.nextInt(6) + 19;//25
                staff[3] = rnd.nextInt(7) + 6;//13
                staff[4] = max - staff[0] - staff[1] - staff[2] - staff[3];
                break;
        }
        return staff;
    }
    
    public int getTotalStaff(int dept) {
        switch (dept) {
            case 1:
                return commStaff[0] + commStaff[1] + commStaff[2] + commStaff[3] + commStaff[4];
            case 2:
                return desStaff[0] + desStaff[1] + desStaff[2] + desStaff[3] + desStaff[4];
            case 3:
                return techStaff[0] + techStaff[1] + techStaff[2] + techStaff[3] + techStaff[4];
            case 4:
                return mechStaff[0] + mechStaff[1] + mechStaff[2] + mechStaff[3] + mechStaff[4];
            default:
                return 0;
        }
    }
    
    public int getTotalSalary(int dept) {
        switch (dept) {
            case 1:
                return commStaff[0] * 75000 + commStaff[1] * 50000 + commStaff[2] * 30000 + commStaff[3] * 20000 + commStaff[4] * 15000;
            case 2:
                return desStaff[0] * 110000 + desStaff[1] * 70000 + desStaff[2] * 45000 + desStaff[3] * 25000 + desStaff[4] * 15000;
            case 3:
                return techStaff[0] * 95000 + techStaff[1] * 60000 + techStaff[2] * 40000 + techStaff[3] * 22000 + techStaff[4] * 15000;
            case 4:
                return mechStaff[0] * 55000 + mechStaff[1] * 40000 + mechStaff[2] * 25000 + mechStaff[3] * 20000 + mechStaff[4] * 15000;
            default:
                return 0;
        }
    }
    
    public int getWorkforce(int dept) {
        switch (dept) {
            case 1:
                return commStaff[0] * 5 + commStaff[1] * 4 + commStaff[2] * 3 + commStaff[3] * 2 + commStaff[4] * 1;
            case 2:
                return desStaff[0] * 5 + desStaff[1] * 4 + desStaff[2] * 3 + desStaff[3] * 2 + desStaff[4] * 1;
            case 3:
                return techStaff[0] * 5 + techStaff[1] * 4 + techStaff[2] * 3 + techStaff[3] * 2 + techStaff[4] * 1;
            case 4:
                return mechStaff[0] * 5 + mechStaff[1] * 4 + mechStaff[2] * 3 + mechStaff[3] * 2 + mechStaff[4] * 1;
            default:
                return 0;
        }
    }
    
    public int getDriverTestEffort(int driver) {
        switch (driver) {
            case 1:
                return tstD1Dev + tstD1Res + tstD1Eng + tstD1Tyre + tstD1Fuel;
            case 2:
                return tstD2Dev + tstD2Res + tstD2Eng + tstD2Tyre + tstD2Fuel;
            default:
                return tstRDDev + tstRDRes + tstRDEng + tstRDTyre + tstRDFuel;
        }
    }
    
    public int getDriverPracticeEffort(int driver) {
        if (driver == 1) {
            return praD1Set + praD1Dev + praD1Res + praD1Qua + praD1Str;
        } else {
            return praD2Set + praD2Dev + praD2Res + praD2Qua + praD2Str;
        }
    }
    
    public Object findComponentByName(int comp, String name) {
        switch (comp) {
            case 1://ICE
                for (ICE i: ice) {
                    if (i.name.equals(name)) return i;
                }
                break;
            case 2://TC
                for (Turbo i: turbo) {
                    if (i.name.equals(name)) return i;
                }
                break;
            case 3://MGUH
                for (MGUH i: mguh) {
                    if (i.name.equals(name)) return i;
                }
                break;
            case 4://MGUK
                for (MGUK i: mguk) {
                    if (i.name.equals(name)) return i;
                }
                break;
            case 5://ES
                for (EnergyStore i: es) {
                    if (i.name.equals(name)) return i;
                }
                break;
            case 6://CE
                for (Electronics i: ce) {
                    if (i.name.equals(name)) return i;
                }
                break;
            case 7://Fuel
                for (Fuel i: fuel) {
                    if (i.name.equals(name)) return i;
                }
                break;
            case 8://C1
                for (Tyres i: c1tyres) {
                    if (i.name.equals(name)) return i;
                }
                break;
            case 9://C2
                for (Tyres i: c2tyres) {
                    if (i.name.equals(name)) return i;
                }
                break;
            case 10://C3
                for (Tyres i: c3tyres) {
                    if (i.name.equals(name)) return i;
                }
                break;
            case 11://C4
                for (Tyres i: c4tyres) {
                    if (i.name.equals(name)) return i;
                }
                break;
            case 12://C5
                for (Tyres i: c5tyres) {
                    if (i.name.equals(name)) return i;
                }
                break;
            case 13://Inter
            case 14://Wet
        }
        return null;
    }
    
}
