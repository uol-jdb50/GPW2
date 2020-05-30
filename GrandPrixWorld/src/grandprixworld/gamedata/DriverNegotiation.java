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
 * @author Josh Brookes
 */
public class DriverNegotiation {

    public Driver driver;
    Team team;
    int targetSalary;
    int targetRaceBonus;
    int targetChampBonus;
    int targetFinalSeason;
    public int lastOfferSalary;
    public int lastOfferRaceBonus;
    public int lastOfferChampBonus;
    public int lastOfferFinalSeason;
    boolean wantsToDrive;
    public int[] lastOfferResults;
    public LocalDate lastOfferDate;

    public DriverNegotiation(Driver driver, Team team, int salary, int racebonus, int champbonus, int finalseason) {
        this.driver = driver;
        this.team = team;
        lastOfferSalary = salary;
        lastOfferRaceBonus = racebonus;
        lastOfferChampBonus = champbonus;
        lastOfferFinalSeason = finalseason;
        lastOfferDate = grandprixworld.gui.FullGame.data.currentDate;
        calculateTargets();
        lastOfferResults = checkTargets();
    }

    public void calculateTargets() {
        Random r = new Random();
        targetSalary = (int) (driver.salary  * ((r.nextDouble() / 25.0) + 1));
        targetRaceBonus = (int) (driver.racebonus  * ((r.nextDouble() / 40.0) + 1));
        targetChampBonus = (int) (driver.champbonus  * ((r.nextDouble() / 30.0) + 1));
        targetFinalSeason = grandprixworld.gui.FullGame.data.currentYear + (r.nextInt(3) + 1);
        wantsToDrive = true;
    }

    public int[] checkTargets() {
        int[] results = new int[5];//0-salary 1-racebonus 2-champbonus 3-finalseason 4-wantstodrive
        if (lastOfferSalary >= targetSalary) {
            results[0] = 1;
        } else {
            results[0] = 0;
        }
        if (lastOfferRaceBonus >= targetRaceBonus) {
            results[1] = 1;
        } else {
            results[1] = 0;
        }
        if (lastOfferChampBonus >= targetChampBonus) {
            results[2] = 1;
        } else {
            results[2] = 0;
        }
        if (lastOfferFinalSeason > targetFinalSeason) {
            results[3] = 2;
        } else if (lastOfferFinalSeason < targetFinalSeason) {
            results[3] = 0;
        } else {
            results[3] = 1;
        }
        if (wantsToDrive == true) {
            results[4] = 1;
        } else {
            results[4] = 0;
        }
        return results;
    }

    public boolean canSign() {
        if (lastOfferResults[0] == 1 && lastOfferResults[1] == 1 && lastOfferResults[2] == 1 && lastOfferResults[3] == 1 && lastOfferResults[4] == 1) {
            return true;
        } else {
            return false;
        }
    }
}
