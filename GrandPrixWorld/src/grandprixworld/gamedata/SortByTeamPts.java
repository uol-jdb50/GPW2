/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata;

import java.util.Comparator;

/**
 *
 * @author Josh Brookes
 */
public class SortByTeamPts implements Comparator<TeamStanding> {
    public int compare(TeamStanding a, TeamStanding b) {
        return b.points - a.points;
    }
}
