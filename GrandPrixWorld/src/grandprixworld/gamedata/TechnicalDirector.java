/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata;

/**
 *
 * @author jdb50
 */
public class TechnicalDirector {
    public String name;
    public int ability;
    public int salary;
    public int racebonus;
    public int champbonus;
    public int finalSeason;
    
    public int nextSalary;
    public int nextRaceBonus;
    public int nextChampBonus;
    public int nextFinalSeason;
    public TechnicalDirector(String name, int ability, int salary, int racebonus, int champbonus) {
        this.name = name;
        this.ability = ability;
        this.salary = salary;
        this.racebonus = racebonus;
        this.champbonus = champbonus;
        finalSeason = 2019;
    }
}
