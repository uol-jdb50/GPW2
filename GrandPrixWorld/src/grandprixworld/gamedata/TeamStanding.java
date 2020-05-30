/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josh Brookes
 */
public class TeamStanding {
    public Team team;
    public int points;
    public List<String[]> results = new ArrayList<String[]>();
    
    public TeamStanding(Team team) {
        this.team = team;
        points = 0;
    }
}
