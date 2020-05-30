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
public class CommercialNegotiation {
    public CommercialDirector commDir;
    Team team;
    int targetSalary;
    int targetRoyalty;
    int targetFinalSeason;
    public int lastOfferSalary;
    public int lastOfferRoyalty;
    public int lastOfferFinalSeason;
    public int[] lastOfferResults;
    public LocalDate lastOfferDate;

    public CommercialNegotiation(CommercialDirector commDir, Team team, int salary, int royalty, int finalseason) {
        this.commDir = commDir;
        this.team = team;
        lastOfferSalary = salary;
        lastOfferRoyalty = royalty;
        lastOfferFinalSeason = finalseason;
        lastOfferDate = grandprixworld.gui.FullGame.data.currentDate;
        calculateTargets();
        lastOfferResults = checkTargets();
    }

    public void calculateTargets() {
        Random r = new Random();
        targetSalary = (int) (commDir.salary  * ((r.nextDouble() / 25.0) + 1));
        targetRoyalty = commDir.royalty + (r.nextInt(4));
        targetFinalSeason = grandprixworld.gui.FullGame.data.currentYear + (r.nextInt(3) + 1);
    }

    public int[] checkTargets() {
        int[] results = new int[3];//0-salary 1-royalty 2-finalseason
        if (lastOfferSalary >= targetSalary) {
            results[0] = 1;
        } else {
            results[0] = 0;
        }
        if (lastOfferRoyalty >= targetRoyalty) {
            results[1] = 1;
        } else {
            results[1] = 0;
        }
        if (lastOfferFinalSeason > targetFinalSeason) {
            results[2] = 2;
        } else if (lastOfferFinalSeason < targetFinalSeason) {
            results[2] = 0;
        } else {
            results[2] = 1;
        }
        return results;
    }

    public boolean canSign() {
        if (lastOfferResults[0] == 1 && lastOfferResults[1] == 1 && lastOfferResults[2] == 1) {
            return true;
        } else {
            return false;
        }
    }
}
