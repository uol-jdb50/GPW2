/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata.car;

import grandprixworld.gamedata.Team;

/**
 *
 * @author Josh Brookes
 */
public class Chassis {
    public String name;
    public int handling; //"quality", should probably be divided across multiple attributes that the player won't see.
    public int wear;
    public int damage;
    
    public Chassis(int year, String team, int handling, int version) {
        this.handling = handling;
        wear = 0;
        damage = 0;
        name = team.substring(0, 2).toUpperCase() + Integer.toString(year) + "-" + (char) (version + 64);
    }
    public Chassis(Chassis chassis) {
        name = chassis.name;
        handling = chassis.handling;
        wear = 0;
        damage = 0;
    }
}
