/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata.car.tyres;

/**
 *
 * @author Josh Brookes
 */
public enum Compound {
    C1("C1"), C2("C2"), C3("C3"), C4("C4"), C5("C5"), Inter("IN"), Wet("WE");
    private String name;
    
    private Compound(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name();
    }
}
