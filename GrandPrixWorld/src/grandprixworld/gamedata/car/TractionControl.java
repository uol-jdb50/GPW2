/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata.car;

/**
 *
 * @author Josh Brookes
 */
public class TractionControl {
    public int level;
    public boolean legal;
    
    public TractionControl(int level, boolean legal) {
        this.level = level;
        this.legal = legal;
    }
}
