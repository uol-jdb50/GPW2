/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata;

import grandprixworld.gamedata.car.tyres.Tyres;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jdb50
 */
public class TyreSponsor {
    public String name;
    public int cash;
    public int rd;
    public List<SupplierContract> contracts;
    public Tyres c1;
    public Tyres c2;
    public Tyres c3;
    public Tyres c4;
    public Tyres c5;
    
    public TyreSponsor(String name, int cash, int rd, List<SupplierContract> contracts,
            Tyres c1, Tyres c2, Tyres c3, Tyres c4, Tyres c5) {
        this.name = name;
        this.cash = cash;
        this.rd = rd;
        this.contracts = new ArrayList<SupplierContract>();
        this.contracts.addAll(contracts);
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.c5 = c5;
    }
}
