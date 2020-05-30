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
public class CommercialDirector {
    public String name;
    public int ability;
    public int salary;
    public int royalty;
    public int finalSeason;
    
    public int nextsalary;
    public int nextroyalty;
    public int nextfinalSeason;
    public CommercialDirector(String name, int ability, int salary, int royalty) {
        this.name = name;
        this.ability = ability;
        this.salary = salary;
        this.royalty = royalty;
        finalSeason = 2019;
    }
}
