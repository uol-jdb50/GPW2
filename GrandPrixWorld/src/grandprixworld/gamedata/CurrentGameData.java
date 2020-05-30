/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata;

import grandprixworld.gamedata.car.Fuel;
import grandprixworld.gamedata.car.engine.Electronics;
import grandprixworld.gamedata.car.engine.EnergyStore;
import grandprixworld.gamedata.car.engine.ICE;
import grandprixworld.gamedata.car.engine.MGUH;
import grandprixworld.gamedata.car.engine.MGUK;
import grandprixworld.gamedata.car.engine.Turbo;
import grandprixworld.gamedata.car.tyres.Compound;
import grandprixworld.gamedata.car.tyres.Tyres;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author jdb50
 */
public class CurrentGameData {

    DateTimeFormatter formatter;
    public LocalDate currentDate;
    public int currentYear;

    public List<Team> teams = new ArrayList<Team>();
    public List<Driver> drivers = new ArrayList<Driver>();
    public List<Venue> venues = new ArrayList<Venue>();

    public List<ChiefDesigner> chiefDesigners = new ArrayList<ChiefDesigner>();
    public List<ChiefMechanic> chiefMechanics = new ArrayList<ChiefMechanic>();
    public List<CommercialDirector> commercialDirectors = new ArrayList<CommercialDirector>();
    public List<TechnicalDirector> technicalDirectors = new ArrayList<TechnicalDirector>();
    public List<TeamSponsor> teamSponsors = new ArrayList<TeamSponsor>();
    public List<EngineSponsor> engineSponsors = new ArrayList<EngineSponsor>();
    public List<TyreSponsor> tyreSponsors = new ArrayList<TyreSponsor>();
    public List<FuelSponsor> fuelSponsors = new ArrayList<FuelSponsor>();
    public List<CashSponsor> cashSponsors = new ArrayList<CashSponsor>();

    public List<Championship> prevF1 = new ArrayList<Championship>();

    public List<Event> nextYearCalendar = new ArrayList<Event>();

    public int[] pointsSystem = new int[20];

    public Championship f1;
    //public Championship f2;
    //public Championship f3;

    public CurrentGameData(boolean newGame) {
        //formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        if (newGame == true) {
            currentDate = LocalDate.of(2019, Month.MARCH, 15);
            currentYear = 2019;
        }

        getChiefDesigners();
        getChiefMechanics();
        getCommercialDirectors();
        getTechnicalDirectors();

        getTeamSponsors();
        getEngineSponsors();
        getTyreSponsors();
        getFuelSponsors();

        getTeams();
        getDrivers();
        for (Team t : teams) {
            t.setDriver(findDriverByNumber(t.driver1num), 1);
            t.setDriver(findDriverByNumber(t.driver2num), 2);
            if (t.youth1num > 0) {
                t.setDriver(findDriverByNumber(t.youth1num), 3);
            }
            if (t.youth2num > 0) {
                t.setDriver(findDriverByNumber(t.youth2num), 4);
            }
            if (t.youth3num > 0) {
                t.setDriver(findDriverByNumber(t.youth3num), 5);
            }
        }
        getVenues();
        f1 = new Championship(getF1Drivers(), teams, setCalendar(true));
        generateRaceCalendar();

        pointsSystem[0] = 25;
        pointsSystem[1] = 18;
        pointsSystem[2] = 15;
        pointsSystem[3] = 12;
        pointsSystem[4] = 10;
        pointsSystem[5] = 8;
        pointsSystem[6] = 6;
        pointsSystem[7] = 4;
        pointsSystem[8] = 2;
        pointsSystem[9] = 1;
        pointsSystem[10] = 0;
        pointsSystem[11] = 0;
        pointsSystem[12] = 0;
        pointsSystem[13] = 0;
        pointsSystem[14] = 0;
        pointsSystem[15] = 0;
        pointsSystem[16] = 0;
        pointsSystem[17] = 0;
        pointsSystem[18] = 0;
        pointsSystem[19] = 0;
    }

    private List<String[]> readFile(String file) {
        List<String[]> fileContents = new ArrayList<String[]>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(file)));
            String s;
            while ((s = br.readLine()) != null) {
                fileContents.add(parseLine(s));
            }

        } catch (IOException e) {
            System.out.println(e);
        }
        return fileContents;
    }

    private void getTeamSponsors() {
        String name = null;
        int cash = 0;

        List<String[]> fileContents = readFile("gamedata//TeamSponsors.gpw");

        for (String[] s : fileContents) {
            if (s != null) {
                switch (s[0]) {
                    case "name":
                        name = s[1];
                        break;
                    case "cash":
                        cash = Integer.parseInt(s[1]);
                        break;
                    case "next":
                        teamSponsors.add(new TeamSponsor(name, cash));
                        name = null;
                        cash = 0;
                        break;
                }
            }
        }
    }

    private void getEngineSponsors() {
        String name = null;
        int cash = 0;
        int randd = 0;
        int teams = 0;
        List<SupplierContract> contracts = new ArrayList<SupplierContract>();
        String[] ice = new String[] {"", "", "", "", "", ""};
        String[] turbo = new String[] {"", "", "", ""};
        String[] mguh = new String[] {"", "", "", ""};
        String[] mguk = new String[] {"", "", "", ""};
        String[] es = new String[] {"", "", "", ""};
        String[] ce = new String[] {"", "", ""};

        List<String[]> fileContents = readFile("gamedata//EngineSponsors.gpw");

        for (String[] s : fileContents) {
            if (s != null) {
                switch (s[0]) {
                    case "name":
                        name = s[1];
                        break;
                    case "cash":
                        cash = Integer.parseInt(s[1]);
                        break;
                    case "randd":
                        randd = Integer.parseInt(s[1]);
                        break;
                    case "teams":
                        teams = Integer.parseInt(s[1]);
                        break;
                    case "contracts":
                        contracts.addAll(parseContracts(s[1]));
                        break;
                    case "ice":
                        ice = parseQualityLine(s[1], 6);
                        break;
                    case "turbo":
                        turbo = parseQualityLine(s[1], 4);
                        break;
                    case "mguh":
                        mguh = parseQualityLine(s[1], 4);
                        break;
                    case "mguk":
                        mguk = parseQualityLine(s[1], 4);
                        break;
                    case "es":
                        es = parseQualityLine(s[1], 4);
                        break;
                    case "ce":
                        ce = parseQualityLine(s[1], 3);
                        break;
                    case "next":
                        engineSponsors.add(new EngineSponsor(name, cash, randd, contracts, 
                        new ICE(currentYear, 1, 1, name, Integer.parseInt(ice[0]), Integer.parseInt(ice[1]), Integer.parseInt(ice[2]), Integer.parseInt(ice[3]), Integer.parseInt(ice[4]), Integer.parseInt(ice[5])),
                        new Turbo(currentYear, 1, 1, name, Integer.parseInt(turbo[0]), Integer.parseInt(turbo[1]), Integer.parseInt(turbo[2]), Integer.parseInt(turbo[3])),
                        new MGUH(currentYear, 1, 1, name, Integer.parseInt(mguh[0]), Integer.parseInt(mguh[1]), Integer.parseInt(mguh[2]), Integer.parseInt(mguh[3])),
                        new MGUK(currentYear, 1, 1, name, Integer.parseInt(mguk[0]), Integer.parseInt(mguk[1]), Integer.parseInt(mguk[2]), Integer.parseInt(mguk[3])),
                        new EnergyStore(currentYear, 1, 1, name, Integer.parseInt(es[0]), Integer.parseInt(es[1]), Integer.parseInt(es[2]), Integer.parseInt(es[3])),
                        new Electronics(currentYear, 1, 1, name, Integer.parseInt(ce[0]), Integer.parseInt(ce[1]), Integer.parseInt(ce[2]))));
                        name = null;
                        cash = 0;
                        randd = 0;
                        contracts.clear();
                        break;
                }
            }
        }
    }

    private void getTyreSponsors() {
        String name = null;
        int cash = 0;
        int randd = 0;
        int teams = 0;
        String[] c1 = new String[] {"", "", "", ""};
        String[] c2 = new String[] {"", "", "", ""};
        String[] c3 = new String[] {"", "", "", ""};
        String[] c4 = new String[] {"", "", "", ""};
        String[] c5 = new String[] {"", "", "", ""};
        List<SupplierContract> contracts = new ArrayList<SupplierContract>();

        List<String[]> fileContents = readFile("gamedata//TyreSponsors.gpw");

        for (String[] s : fileContents) {
            if (s != null) {
                switch (s[0]) {
                    case "name":
                        name = s[1];
                        break;
                    case "cash":
                        cash = Integer.parseInt(s[1]);
                        break;
                    case "randd":
                        randd = Integer.parseInt(s[1]);
                        break;
                    case "teams":
                        teams = Integer.parseInt(s[1]);
                        break;
                    case "contracts":
                        contracts.addAll(parseContracts(s[1]));
                        break;
                    case "c1":
                        c1 = parseQualityLine(s[1], 4);
                        break;
                    case "c2":
                        c2 = parseQualityLine(s[1], 4);
                        break;
                    case "c3":
                        c3 = parseQualityLine(s[1], 4);
                        break;
                    case "c4":
                        c4 = parseQualityLine(s[1], 4);
                        break;
                    case "c5":
                        c5 = parseQualityLine(s[1], 4);
                        break;
                    case "next":
                        tyreSponsors.add(new TyreSponsor(name, cash, randd, contracts,
                        new Tyres(currentYear, 1, 1, name, Compound.C1, Integer.parseInt(c1[0]), Integer.parseInt(c1[1]), Integer.parseInt(c1[2]), Integer.parseInt(c1[3])),
                        new Tyres(currentYear, 1, 1, name, Compound.C2, Integer.parseInt(c2[0]), Integer.parseInt(c2[1]), Integer.parseInt(c2[2]), Integer.parseInt(c2[3])),
                        new Tyres(currentYear, 1, 1, name, Compound.C3, Integer.parseInt(c3[0]), Integer.parseInt(c3[1]), Integer.parseInt(c3[2]), Integer.parseInt(c3[3])),
                        new Tyres(currentYear, 1, 1, name, Compound.C4, Integer.parseInt(c4[0]), Integer.parseInt(c4[1]), Integer.parseInt(c4[2]), Integer.parseInt(c4[3])),
                        new Tyres(currentYear, 1, 1, name, Compound.C5, Integer.parseInt(c5[0]), Integer.parseInt(c5[1]), Integer.parseInt(c5[2]), Integer.parseInt(c5[3]))));
                        name = null;
                        cash = 0;
                        randd = 0;
                        break;
                }
            }
        }
    }

    private void getFuelSponsors() {
        String name = null;
        int cash = 0;
        int randd = 0;
        int teams = 0;
        String[] quality = new String[] {"", ""};
        Fuel fuel = null;
        List<SupplierContract> contracts = new ArrayList<SupplierContract>();

        List<String[]> fileContents = readFile("gamedata//FuelSponsors.gpw");

        for (String[] s : fileContents) {
            if (s != null) {
                switch (s[0]) {
                    case "name":
                        name = s[1];
                        break;
                    case "cash":
                        cash = Integer.parseInt(s[1]);
                        break;
                    case "randd":
                        randd = Integer.parseInt(s[1]);
                        break;
                    case "teams":
                        teams = Integer.parseInt(s[1]);
                        break;
                    case "contracts":
                        contracts.addAll(parseContracts(s[1]));
                        break;
                    case "quality":
                        quality = parseQualityLine(s[1], 2);
                        break;
                    case "next":
                        fuelSponsors.add(new FuelSponsor(name, cash, randd, contracts, new Fuel(currentYear, 1, 1, name, Integer.parseInt(quality[0]), Integer.parseInt(quality[1]))));
                        name = "";
                        cash = 0;
                        randd = 0;
                        break;
                }
            }
        }
    }

    private void getTeams() {
        String name = null;
        int ccpos18 = 0;
        int driver1 = 0;
        int driver2 = 0;
        Color color = null;
        String principal = null;
        CommercialDirector commDir = null;
        ChiefDesigner chiefDes = null;
        ChiefMechanic chiefMech = null;
        TechnicalDirector techDir = null;
        int youth1 = 0;
        int youth2 = 0;
        int youth3 = 0;
        int factorySize = 0;
        int startBalance = 0;
        TeamSponsor teamSp = null;
        EngineSponsor engineSp = null;
        int engineCtId = -1;
        FuelSponsor fuelSp = null;
        int fuelCtId = -1;
        TyreSponsor tyreSp = null;
        int tyreCtId = -1;
        String cashSp1 = null;
        String cashSp2 = null;
        String cashSp3 = null;
        String cashSp4 = null;
        String cashSp5 = null;
        String cashSp6 = null;
        int handling = 0;
        boolean isPlayer = false;

        List<String[]> fileContents = readFile("gamedata//Teams.gpw");

        for (String[] s : fileContents) {
            if (s != null) {
                switch (s[0]) {
                    case "name":
                        name = s[1];
                        break;
                    case "ccpos18":
                        ccpos18 = Integer.parseInt(s[1]);
                        break;
                    case "driver1num":
                        driver1 = Integer.parseInt(s[1]);
                        break;
                    case "driver2num":
                        driver2 = Integer.parseInt(s[1]);
                        break;
                    case "color":
                        color = parseColor(s[1]);
                        break;
                    case "principal":
                        principal = s[1];
                        break;
                    case "commdir":
                        for (CommercialDirector com : commercialDirectors) {
                            if (s[1].equals(com.name)) {
                                commDir = com;
                            }
                        }
                        break;
                    case "chiefdes":
                        for (ChiefDesigner des : chiefDesigners) {
                            if (s[1].equals(des.name)) {
                                chiefDes = des;
                            }
                        }
                        break;
                    case "chiefmech":
                        for (ChiefMechanic mec : chiefMechanics) {
                            if (s[1].equals(mec.name)) {
                                chiefMech = mec;
                            }
                        }
                        break;
                    case "techdir":
                        for (TechnicalDirector tech : technicalDirectors) {
                            if (s[1].equals(tech.name)) {
                                techDir = tech;
                            }
                        }
                        break;
                    case "youth1num":
                        youth1 = Integer.parseInt(s[1]);
                        break;
                    case "youth2num":
                        youth2 = Integer.parseInt(s[1]);
                        break;
                    case "youth3num":
                        youth3 = Integer.parseInt(s[1]);
                        break;
                    case "factorysize":
                        factorySize = Integer.parseInt(s[1]);
                        break;
                    case "startBalance":
                        startBalance = Integer.parseInt(s[1]);
                        break;
                    case "teamsp":
                        teamSp = (TeamSponsor) findSponsorByName(1, s[1]);
                        break;
                    case "enginesp":
                        engineSp = (EngineSponsor) findSponsorByName(2, s[1]);
                        break;
                    case "engineCtId":
                        engineCtId = Integer.parseInt(s[1]);
                        break;
                    case "fuelsp":
                        fuelSp = (FuelSponsor) findSponsorByName(4, s[1]);
                        break;
                    case "fuelCtId":
                        fuelCtId = Integer.parseInt(s[1]);
                        break;
                    case "tyresp":
                        tyreSp = (TyreSponsor) findSponsorByName(3, s[1]);
                        break;
                    case "tyreCtId":
                        tyreCtId = Integer.parseInt(s[1]);
                        break;
                    case "cashsp1":
                        cashSp1 = s[1];
                        break;
                    case "cashsp2":
                        cashSp2 = s[1];
                        break;
                    case "cashsp3":
                        cashSp3 = s[1];
                        break;
                    case "cashsp4":
                        cashSp4 = s[1];
                        break;
                    case "cashsp5":
                        cashSp5 = s[1];
                        break;
                    case "cashsp6":
                        cashSp6 = s[1];
                        break;
                    case "chassis":
                        handling = Integer.parseInt(s[1]);
                        break;
                    case "player":
                        isPlayer = Boolean.parseBoolean(s[1]);
                        break;
                    case "next":
                        teams.add(new Team(name, ccpos18, driver1, driver2, principal, commDir, chiefDes, chiefMech, techDir, youth1, youth2, youth3, factorySize, startBalance, teamSp, engineSp, engineCtId, fuelSp, fuelCtId, tyreSp, tyreCtId, cashSp1, cashSp2, cashSp3, cashSp4, cashSp5, cashSp6, isPlayer, color, handling));
                        name = "";
                        ccpos18 = 0;
                        driver1 = 0;
                        driver2 = 0;
                        principal = "";
                        color = null;
                        youth1 = 0;
                        youth2 = 0;
                        youth3 = 0;
                        teamSp = null;
                        engineSp = null;
                        engineCtId = -1;
                        fuelSp = null;
                        fuelCtId = -1;
                        tyreSp = null;
                        tyreCtId = -1;
                        cashSp1 = null;
                        cashSp2 = null;
                        cashSp3 = null;
                        cashSp4 = null;
                        cashSp5 = null;
                        cashSp6 = null;
                        handling = 0;
                        break;
                }
            }
        }
    }

    private void getDrivers() {
        String fname = null;
        String lname = null;
        LocalDate dob = null;
        String nation = null;
        int raceNum = 0;
        String raceCode = null;
        String quality = null;
        double[] qualityParsed = new double[6];
        double exp = 0;
        int salary = 0;
        int racebonus = 0;
        int champbonus = 0;

        List<String[]> fileContents = readFile("gamedata//Drivers.gpw");

        for (String[] s : fileContents) {
            if (s != null) {
                switch (s[0]) {
                    case "fname":
                        fname = s[1];
                        break;
                    case "lname":
                        lname = s[1];
                        break;
                    case "dob":
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        dob = LocalDate.parse(s[1], dtf);
                        break;
                    case "nation":
                        nation = s[1];
                        break;
                    case "raceNum":
                        raceNum = Integer.parseInt(s[1]);
                        break;
                    case "raceCode":
                        raceCode = s[1];
                        break;
                    case "quality": {
                        quality = s[1];
                        qualityParsed = parseQuality(quality);
                        break;
                    }
                    case "experience":
                        exp = Double.parseDouble(s[1]);
                        break;
                    case "salary":
                        salary = Integer.parseInt(s[1]);
                        break;
                    case "racebonus":
                        racebonus = Integer.parseInt(s[1]);
                        break;
                    case "champbonus":
                        champbonus = Integer.parseInt(s[1]);
                        break;
                    case "next":
                        drivers.add(new Driver(fname, lname, dob, nation, raceNum, raceCode, qualityParsed, exp, salary, racebonus, champbonus));
                        break;
                }
            }
        }
    }

    private void getVenues() {
        String fullName = null;
        String shortName = null;
        String raceName = null;
        String imageCode = null;
        String nation = null;
        Region region = null;
        double kmLength = 0.0;
        boolean lastYear = false;
        float scale = 0f;
        double record = 0;

        List<String[]> fileContents = readFile("gamedata//Venues.gpw");

        for (String[] s : fileContents) {
            if (s != null) {
                switch (s[0]) {
                    case "fullname":
                        fullName = s[1];
                        break;
                    case "shortname":
                        shortName = s[1];
                        break;
                    case "racename":
                        raceName = s[1];
                        break;
                    case "imagecode":
                        imageCode = s[1];
                        break;
                    case "nation":
                        nation = s[1];
                        break;
                    case "region":
                        if (s[1].equals("EUR")) {
                            region = Region.EUR;
                        } else {
                            region = Region.FLY;
                        }
                        break;
                    case "kmlength":
                        kmLength = Double.parseDouble(s[1]);
                        break;
                    case "lastyear":
                        lastYear = Boolean.parseBoolean(s[1]);
                        break;
                    case "scale":
                        scale = parseScale(s[1]);
                        break;
                    case "record":
                        record = Double.parseDouble(s[1]);
                        break;
                    case "next":
                        venues.add(new Venue(fullName, shortName, raceName, imageCode, nation, region, kmLength, lastYear, scale, record));
                        scale = 0f;
                        record = 0;
                        break;
                }
            }
        }
    }

    private void getChiefDesigners() {
        String name = "";
        int ability = 0;
        int salary = 0;
        int racebonus = 0;
        int champbonus = 0;

        List<String[]> fileContents = readFile("gamedata//ChiefDesigners.gpw");

        for (String[] s : fileContents) {
            if (s != null) {
                switch (s[0]) {
                    case "name":
                        name = s[1];
                        break;
                    case "ability":
                        ability = Integer.parseInt(s[1]);
                        break;
                    case "salary":
                        salary = Integer.parseInt(s[1]);
                        break;
                    case "racebonus":
                        racebonus = Integer.parseInt(s[1]);
                        break;
                    case "champbonus":
                        champbonus = Integer.parseInt(s[1]);
                        break;
                    case "next":
                        chiefDesigners.add(new ChiefDesigner(name, ability, salary, racebonus, champbonus));
                        break;
                }
            }
        }
    }

    private void getChiefMechanics() {
        String name = "";
        int ability = 0;
        int salary = 0;
        int racebonus = 0;
        int champbonus = 0;

        List<String[]> fileContents = readFile("gamedata//ChiefMechanics.gpw");

        for (String[] s : fileContents) {
            if (s != null) {
                switch (s[0]) {
                    case "name":
                        name = s[1];
                        break;
                    case "ability":
                        ability = Integer.parseInt(s[1]);
                        break;
                    case "salary":
                        salary = Integer.parseInt(s[1]);
                        break;
                    case "racebonus":
                        racebonus = Integer.parseInt(s[1]);
                        break;
                    case "champbonus":
                        champbonus = Integer.parseInt(s[1]);
                        break;
                    case "next":
                        chiefMechanics.add(new ChiefMechanic(name, ability, salary, racebonus, champbonus));
                        break;
                }
            }
        }
    }

    private void getCommercialDirectors() {
        String name = "";
        int ability = 0;
        int salary = 0;
        int royalty = 0;

        List<String[]> fileContents = readFile("gamedata//CommercialDirectors.gpw");

        for (String[] s : fileContents) {
            if (s != null) {
                switch (s[0]) {
                    case "name":
                        name = s[1];
                        break;
                    case "ability":
                        ability = Integer.parseInt(s[1]);
                        break;
                    case "salary":
                        salary = Integer.parseInt(s[1]);
                        break;
                    case "royalty":
                        royalty = Integer.parseInt(s[1]);
                        break;
                    case "next":
                        commercialDirectors.add(new CommercialDirector(name, ability, salary, royalty));
                        break;
                }
            }
        }
    }

    private void getTechnicalDirectors() {
        String name = "";
        int ability = 0;
        int salary = 0;
        int racebonus = 0;
        int champbonus = 0;

        List<String[]> fileContents = readFile("gamedata//TechnicalDirectors.gpw");

        for (String[] s : fileContents) {
            if (s != null) {
                switch (s[0]) {
                    case "name":
                        name = s[1];
                        break;
                    case "ability":
                        ability = Integer.parseInt(s[1]);
                        break;
                    case "salary":
                        salary = Integer.parseInt(s[1]);
                        break;
                    case "racebonus":
                        racebonus = Integer.parseInt(s[1]);
                        break;
                    case "champbonus":
                        champbonus = Integer.parseInt(s[1]);
                        break;
                    case "next":
                        technicalDirectors.add(new TechnicalDirector(name, ability, salary, racebonus, champbonus));
                        break;
                }
            }
        }
    }

    private List<Event> setCalendar(boolean isDefault) {
        List<Event> cal = new ArrayList<Event>();
        if (isDefault == true) {
            String race = null;
            LocalDate date = null;

            List<String[]> fileContents = readFile("gamedata//DefaultCalendar.gpw");

            for (String[] s : fileContents) {
                if (s != null) {
                    switch (s[0]) {
                        case "race":
                            race = s[1];
                            break;
                        case "date":
                            date = LocalDate.parse(s[1], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                            break;
                        case "next":
                            cal.add(new Event(findVenueByImageCode(race).raceName, findVenueByImageCode(race), date));
                            break;
                    }
                }
            }
        } else {
            //random calendar
        }
        return cal;
    }

    private String[] parseLine(String s) {
        String[] line = new String[2];
        line[0] = "";
        line[1] = "";
        while (true) {
            if (s.equals("")) {
                break;
            }
            if (s.charAt(0) == '=') {
                line[1] = s.substring(1);
                break;
            }
            line[0] += s.charAt(0);
            s = s.substring(1);
        }
        if (!line[0].equals("") && !line[1].equals("")) {
            return line;
        } else {
            return null;
        }
    }
    
    private float parseScale(String s) {
        float numerator = 0;
        float denominator = 0;
        String left = "";
        while (true) {
            if (s.charAt(0) == '/') {
                numerator = Float.parseFloat(left);
                denominator = Float.parseFloat(s.substring(1));
                break;
            } else {
                left += s.charAt(0);
                s = s.substring(1);
            }
        }
        return numerator / denominator;
    }
    
    private Color parseColor(String s) {
        int[] values = new int[2];
        int i = 0;
        String current = "";
        while (true) {
            if (s.equals("")) return new Color(values[0], values[1], Integer.parseInt(current));
            if (s.charAt(0) == ',') {
                values[i] = Integer.parseInt(current);
                current = "";
                i++;
            } else {
                current += s.charAt(0);
            }
            s = s.substring(1);
        }
    }

    private List<SupplierContract> parseContracts(String s) {
        List<SupplierContract> contracts = new ArrayList<SupplierContract>();
        int i = 0;
        while (true) {
            if (s.equals("")) {
                break;
            }
            if (s.charAt(0) == ',') {
                i++;
            } else {
                switch (s.charAt(0)) {
                    case 'W':
                        contracts.add(new SupplierContract(ContractType.WORKS, currentYear));
                        break;
                    case 'P':
                        contracts.add(new SupplierContract(ContractType.PARTNER, currentYear));
                        break;
                    case 'C':
                        contracts.add(new SupplierContract(ContractType.CUSTOMER, currentYear));
                        break;
                }
            }
            s = s.substring(1);
        }
        return contracts;
    }

    private double[] parseQuality(String q) {
        String quality[] = new String[6];
        for (int a = 0; a < 6; a++) {
            quality[a] = "";
        }
        int i = 0;
        while (true) {
            if (q.equals("")) {
                break;
            }
            if (q.charAt(0) == ',') {
                i++;
            } else {
                quality[i] += q.charAt(0);
            }
            q = q.substring(1);
        }
        double qualityParsed[] = new double[6];
        for (int j = 0; j < 6; j++) {
            qualityParsed[j] = Double.parseDouble(quality[j]);
        }
        return qualityParsed;
    }
    
    private String[] parseQualityLine(String s, int length) {
        String[] quality = new String[length];
        for (int a = 0; a < length; a++) {
            quality[a] = "";
        }
        int i = 0;
        while (true) {
            if (s.equals("")) {
                return quality;
            }
            if (s.charAt(0) == ',') {
                i++;
            } else {
                quality[i] += s.charAt(0);
            }
            s = s.substring(1);
        }
    }

    public Object findSponsorByName(int type, String name) {
        switch (type) {
            case 1:
                for (TeamSponsor s : teamSponsors) {
                    if (s.name.equals(name)) {
                        return s;
                    }
                }
                break;
            case 2:
                for (EngineSponsor s : engineSponsors) {
                    if (s.name.equals(name)) {
                        return s;
                    }
                }
                break;
            case 3:
                for (TyreSponsor s : tyreSponsors) {
                    if (s.name.equals(name)) {
                        return s;
                    }
                }
                break;
            case 4:
                for (FuelSponsor s : fuelSponsors) {
                    if (s.name.equals(name)) {
                        return s;
                    }
                }
                break;
            case 5:

        }
        return null;
    }

    public Driver findDriverByNumber(int num) {
        for (Driver d : drivers) {
            if (d.raceNum == num) {
                return d;
            }
        }
        return null;
    }

    public Driver findDriverByName(String name) {
        for (Driver d : drivers) {
            if (name.substring(2).equals(d.lname)) {
                return d;
            }
        }
        return null;
    }

    public Team findTeamByDriver(int num) {
        for (Team t : teams) {
            if (t.driver1num == num || t.driver2num == num) {
                return t;
            }
        }
        return null;
    }

    public TechnicalDirector findTechDirByName(String name) {
        for (TechnicalDirector t : technicalDirectors) {
            if (t.name.equals(name)) {
                return t;
            }
        }
        return null;
    }

    public CommercialDirector findCommDirByName(String name) {
        for (CommercialDirector c : commercialDirectors) {
            if (c.name.equals(name)) {
                return c;
            }
        }
        return null;
    }

    public ChiefMechanic findChiefMechByName(String name) {
        for (ChiefMechanic m : chiefMechanics) {
            if (m.name.equals(name)) {
                return m;
            }
        }
        return null;
    }

    public ChiefDesigner findChiefDesByName(String name) {
        for (ChiefDesigner d : chiefDesigners) {
            if (d.name.equals(name)) {
                return d;
            }
        }
        return null;
    }

    public Team findTeamByTechDir(String name) {
        for (Team t : teams) {
            if (t.techDir.name.equals(name)) {
                return t;
            }
        }
        return null;
    }

    public Team findTeamByCommDir(String name) {
        for (Team t : teams) {
            if (t.commDir.name.equals(name)) {
                return t;
            }
        }
        return null;
    }

    public Team findTeamByChiefMech(String name) {
        for (Team t : teams) {
            if (t.chiefMech.name.equals(name)) {
                return t;
            }
        }
        return null;
    }

    public Team findTeamByChiefDes(String name) {
        for (Team t : teams) {
            if (t.chiefDes.name.equals(name)) {
                return t;
            }
        }
        return null;
    }

    public Team findPlayerTeam() {
        for (Team t : teams) {
            if (t.isPlayer == true) {
                return t;
            }
        }
        return null;
    }

    public Team findTeamByName(String name) {
        for (Team t : teams) {
            if (t.name.equals(name)) {
                return t;
            }
        }
        return null;
    }

    public int findTeamIndexByName(String name) {
        int i = 0;
        for (Team t : teams) {
            if (t.name.equals(name)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Venue findVenueByImageCode(String imageCode) {
        for (Venue v : venues) {
            if (v.imageCode.equals(imageCode)) {
                return v;
            }
        }
        return null;
    }

    public List<Driver> getF1Drivers() {
        List<Driver> f1drivers = new ArrayList<Driver>();
        for (Team t : teams) {
            f1drivers.add(t.driver1);
            f1drivers.add(t.driver2);
        }
        return f1drivers;
    }

    public void generateRaceCalendar() {

        List<Venue> selectedVenues = new ArrayList<Venue>();
        int year = currentYear + 1;

        List<LocalDate> available = findAvailableDates();

        int[] grandsPrix = new int[50];

        for (Venue v : venues) {
            grandsPrix[v.nation.ordinal()]++;
        }

        for (int i = 0; i < grandsPrix.length; i++) {
            if (grandsPrix[i] > 0) {
                selectedVenues.add(VenueSelect(i));
            }
        }

        Random rnd = new Random();
        int races = rnd.nextInt(6) + 18;

        List<LocalDate> calendarDates = new ArrayList<LocalDate>();

        for (int i = 0; i < races; i++) {
            int index = rnd.nextInt(available.size());
            calendarDates.add(available.get(index));
            available.remove(index);
        }

        calendarDates.sort(new CalendarSorter());
        List<Venue> selectedVenues2 = new ArrayList<Venue>();

        for (Venue v : selectedVenues) {
            if (v.lastYear == true) {
                selectedVenues2.add(v);
                selectedVenues2.add(v);
                selectedVenues2.add(v);
                selectedVenues2.add(v);
                selectedVenues2.add(v);
                selectedVenues2.add(v);
                selectedVenues2.add(v);
                selectedVenues2.add(v);
                selectedVenues2.add(v);
                selectedVenues2.add(v);
                selectedVenues2.add(v);
                selectedVenues2.add(v);
                selectedVenues2.add(v);
                selectedVenues2.add(v);
            }
        }
        selectedVenues.addAll(selectedVenues2);

        for (Venue v : venues) {
            v.lastYear = false;
        }

        Venue venueAUS = null;
        Venue venueMON = null;
        Venue venueUAE = null;

        for (Venue v : selectedVenues) {
            if (v.nation == Nation.AUSTRALIA) {
                venueAUS = v;
            } else if (v.nation == Nation.MONACO) {
                venueMON = v;
            } else if (v.nation == Nation.UNITED_ARAB_EMIRATES) {
                venueUAE = v;
            };
        }
        selectedVenues.removeIf(ven -> ven.nation == Nation.AUSTRALIA);
        selectedVenues.removeIf(ven -> ven.nation == Nation.MONACO);
        selectedVenues.removeIf(ven -> ven.nation == Nation.UNITED_ARAB_EMIRATES);

        List<Venue> euroVenues = new ArrayList<Venue>();
        List<Venue> flyVenues = new ArrayList<Venue>();

        for (Venue v : selectedVenues) {
            if (v.region == Region.EUR) {
                euroVenues.add(v);
            } else if (v.region == Region.FLY) {
                flyVenues.add(v);
            }
        }

        for (LocalDate d : calendarDates) {
            if (calendarDates.get(0) == d) {
                nextYearCalendar.add(new Event(venueAUS.raceName, venueAUS, d));
                venues.get(venues.indexOf(venueAUS)).lastYear = true;

            } else if ((calendarDates.get(1) == d) || (calendarDates.get(2) == d)) {
                int location = rnd.nextInt(flyVenues.size());
                Venue selected = flyVenues.get(location);
                nextYearCalendar.add(new Event(selected.raceName, selected, d));
                flyVenues.removeIf(v -> v.imageCode == selected.imageCode);
                venues.get(venues.indexOf(selected)).lastYear = true;
            } else if ((calendarDates.get(3) == d)) {
                if (rnd.nextInt(1) == 0) {
                    int location = rnd.nextInt(flyVenues.size());
                    Venue selected = flyVenues.get(location);
                    nextYearCalendar.add(new Event(selected.raceName, selected, d));
                    flyVenues.removeIf(v -> v.imageCode == selected.imageCode);
                    venues.get(venues.indexOf(selected)).lastYear = true;
                } else {
                    int location = rnd.nextInt(euroVenues.size());
                    Venue selected = euroVenues.get(location);
                    nextYearCalendar.add(new Event(selected.raceName, selected, d));
                    euroVenues.removeIf(v -> v.imageCode == selected.imageCode);
                    venues.get(venues.indexOf(selected)).lastYear = true;
                }

            } else if ((calendarDates.get(4) == d)) {
                int location = rnd.nextInt(euroVenues.size());
                Venue selected = euroVenues.get(location);
                nextYearCalendar.add(new Event(selected.raceName, selected, d));
                euroVenues.removeIf(v -> v.imageCode == selected.imageCode);
                venues.get(venues.indexOf(selected)).lastYear = true;
            } else if (calendarDates.get(5) == d) {
                nextYearCalendar.add(new Event(venueMON.raceName, venueMON, d));
                venues.get(venues.indexOf(venueMON)).lastYear = true;
            } else if ((calendarDates.get(6) == d)) {
                int location = rnd.nextInt(flyVenues.size());
                Venue selected = flyVenues.get(location);
                nextYearCalendar.add(new Event(selected.raceName, selected, d));
                flyVenues.removeIf(v -> v.imageCode == selected.imageCode);
                venues.get(venues.indexOf(selected)).lastYear = true;
            } else if ((calendarDates.get(7) == d) || (calendarDates.get(8) == d) || (calendarDates.get(9) == d) || (calendarDates.get(10) == d) || (calendarDates.get(11) == d) || (calendarDates.get(12) == d) || (calendarDates.get(13) == d)) {
                int location = rnd.nextInt(euroVenues.size());
                Venue selected = euroVenues.get(location);
                nextYearCalendar.add(new Event(selected.raceName, selected, d));
                euroVenues.removeIf(v -> v.imageCode == selected.imageCode);
                venues.get(venues.indexOf(selected)).lastYear = true;
            } else if (calendarDates.get(races - 1) == d) {
                nextYearCalendar.add(new Event(venueUAE.raceName, venueUAE, d));
                venues.get(venues.indexOf(venueUAE)).lastYear = true;
            } else {
                int location = rnd.nextInt(flyVenues.size());
                Venue selected = flyVenues.get(location);
                nextYearCalendar.add(new Event(selected.raceName, selected, d));
                flyVenues.removeIf(v -> v.imageCode == selected.imageCode);
                venues.get(venues.indexOf(selected)).lastYear = true;
            }
        }
    }

    private Venue VenueSelect(int countryOrdinal) {
        List<Venue> countryVenues = new ArrayList<Venue>();

        for (Venue v : venues) {
            if (v.nation.ordinal() == countryOrdinal) {
                countryVenues.add(v);
                if (v.lastYear == true) {
                    countryVenues.add(v);
                    countryVenues.add(v);
                    countryVenues.add(v);
                    countryVenues.add(v);
                    countryVenues.add(v);
                    countryVenues.add(v);
                    countryVenues.add(v);
                    countryVenues.add(v);
                    countryVenues.add(v);
                    countryVenues.add(v);
                    countryVenues.add(v);
                    countryVenues.add(v);
                    countryVenues.add(v);
                    countryVenues.add(v);
                    countryVenues.add(v);
                    countryVenues.add(v);
                    countryVenues.add(v);
                    countryVenues.add(v);
                    countryVenues.add(v);
                } else {
                    countryVenues.add(v);
                    countryVenues.add(v);
                    countryVenues.add(v);
                }
            }
        }
        if (countryVenues.size() == 1) {
            return countryVenues.get(0);
        } else {
            Random rnd = new Random();
            return countryVenues.get(rnd.nextInt(countryVenues.size()));
        }
    }

    private List<LocalDate> findAvailableDates() {
        int year = currentYear + 1;
        LocalDate current = LocalDate.of(year, 2, 28);

        List<LocalDate> availableDates = new ArrayList<LocalDate>();
        boolean found = false;
        do {
            if (current.getDayOfWeek() == DayOfWeek.FRIDAY) {
                found = true;
                //current = current.plusDays(2);
                availableDates.add(current);
            } else {
                current = current.minusDays(1);
            }
        } while (found == false);

        do {
            current = current.plusDays(7);
            availableDates.add(current);
        } while (current.getMonthValue() < 12);

        return availableDates;
    }

    private int[] runJobHunt() {
        int[] hire = new int[5];
        Random r = new Random();
        int max = r.nextInt(4);
        hire[4] = max;
        for (int i = 3; i >= 0; i--) {
            if (max != 0) {
                max = r.nextInt(max + 1);
                hire[i] = max;
            } else {
                break;
            }
        }
        return hire;
    }

    public void newWeek() {
        findPlayerTeam().commHire = runJobHunt();
        findPlayerTeam().desHire = runJobHunt();
        findPlayerTeam().techHire = runJobHunt();
        findPlayerTeam().mechHire = runJobHunt();
        
        findPlayerTeam().car1mnt = 0;
        findPlayerTeam().car2mnt = 0;
        findPlayerTeam().car3mnt = 0;
        findPlayerTeam().car4mnt = 0;
        findPlayerTeam().car1rep = 0;
        findPlayerTeam().car2rep = 0;
        findPlayerTeam().car3rep = 0;
        findPlayerTeam().car4rep = 0;
        
        findPlayerTeam().mechAvail += findPlayerTeam().mntStaffUsed + findPlayerTeam().repStaffUsed;
        findPlayerTeam().mntStaffUsed = 0;
        findPlayerTeam().repStaffUsed = 0;
        
        grandprixworld.gui.engineering.EnConstruction.resetNewWeek();
    }

    public void newYear() {
        currentYear++;
        prevF1.add(f1);
        List<Event> calendar = nextYearCalendar;
        nextYearCalendar = new ArrayList<Event>();
        generateRaceCalendar();
        f1 = new Championship(getF1Drivers(), teams, calendar);
    }

    public DriverNegotiation findDriverNegotiationByDriver(Driver driver, Team team) {
        for (DriverNegotiation n : team.driverTalks) {
            if (n.driver == driver) {
                return n;
            }
        }
        return null;
    }

    public CommercialNegotiation findCommercialNegotiationByCommDir(CommercialDirector commDir, Team team) {
        for (CommercialNegotiation n : team.commTalks) {
            if (n.commDir == commDir) {
                return n;
            }
        }
        return null;
    }

    public DesignerNegotiation findDesignerNegotiationByChiefDes(ChiefDesigner chiefDes, Team team) {
        for (DesignerNegotiation n : team.desTalks) {
            if (n.chiefDes == chiefDes) {
                return n;
            }
        }
        return null;
    }

    public TechnicalNegotiation findTechnicalNegotiationByTechDir(TechnicalDirector techDir, Team team) {
        for (TechnicalNegotiation n : team.techTalks) {
            if (n.techDir == techDir) {
                return n;
            }
        }
        return null;
    }

    public MechanicNegotiation findMechanicNegotiationByChiefMech(ChiefMechanic chiefMech, Team team) {
        for (MechanicNegotiation n : team.mechTalks) {
            if (n.chiefMech == chiefMech) {
                return n;
            }
        }
        return null;
    }

    public int getMaxStaff(int factorySize) {
        switch (factorySize) {
            case 1:
                return 40;
            case 2:
                return 50;
            case 3:
                return 60;
            case 4:
                return 80;
            case 5:
                return 100;
            default:
                return 0;
        }
    }

}
