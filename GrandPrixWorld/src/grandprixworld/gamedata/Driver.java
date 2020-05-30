/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author jdb50
 */
public class Driver {
    Random rnd = new Random();
    
    public String fname;
    public String lname;
    public LocalDate dob;
    public Nation nation;
    public int raceNum;
    public String raceCode;
    public double[] quality = new double[6];
    public double experience;
    public int[] attributes = new int[6];
    public int salary;
    public int racebonus;
    public int champbonus;
    public int finalSeason;
    public int nextsalary = 0;
    public int nextracebonus = 0;
    public int nextchampbonus = 0;
    public int nextfinalSeason = 0;
    
    public int attAcceleration;
    public int attBraking;
    public int attTopSpeed;
    public int attKerbs;
    public int attOffLine;
    public int attDefence;
    public int attOvertaking;
    public int attLapping;
    
    public Driver(String fname, String lname, LocalDate dob, String nation, 
            int raceNum, String raceCode, double[] quality, double experience, 
            int salary, int racebonus, int champbonus) {
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.nation = findNationByString(nation);
        this.raceNum = raceNum;
        this.raceCode = raceCode;
        this.quality = quality;
        this.experience = experience;
        this.salary = salary;
        this.racebonus = racebonus;
        this.champbonus = champbonus;
        finalSeason = 2019;
        
        attAcceleration = 5;
        attBraking = 5;
        attTopSpeed = 5;
        attKerbs = 5;
        attOffLine = 5;
        attDefence = 5;
        attOvertaking = 5;
        attLapping = 5;
        generateAttributes();
    }
    
    private Nation findNationByString(String nation) {
        for (Nation n: Nation.values()) {
            if (n.toString().equals(nation)) return n;
        }
        return null;
    }
    
    private void generateAttributes() {
        double qualityOverall = 0;
        double yrs = 0;
        for (int i = 0; i < 6; i += 2) {
            if (quality[i + 1] != 0) {
                qualityOverall += (quality[i] / quality[i + 1]);
                yrs++;
            }
        }
        qualityOverall /= (10.0 * yrs);
        qualityOverall *= 25;
        if (qualityOverall < 5) qualityOverall = 5;
        else if (qualityOverall > 25) qualityOverall = 25;
        attributes[0] = 1;
        attributes[1] = 1;
        attributes[2] = 1;
        attributes[3] = 1;
        attributes[4] = 1;
        qualityOverall -= 5;
        while (qualityOverall > 0) {
            int att = rnd.nextInt(5);
            if (attributes[att] < 5) {
                attributes[att]++;
                qualityOverall -= 1;
            }
        }
        
        if (experience <= 300) attributes[5] = 1;
        else if (experience <= 600) attributes[5] = 2;
        else if (experience <= 1000) attributes[5] = 3;
        else if (experience <= 1600) attributes[5] = 4;
        else attributes[5] = 5;
    }
}
