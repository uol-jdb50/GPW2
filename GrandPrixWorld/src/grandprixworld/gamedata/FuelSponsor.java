/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata;

import grandprixworld.gamedata.car.Fuel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jdb50
 */
public class FuelSponsor {
    public String name;
    public int cash;
    public int rd;
    public List<SupplierContract> contracts;
    public Fuel fuel;
    
    public FuelSponsor(String name, int cash, int rd, List<SupplierContract> contracts, 
            Fuel fuel) {
        this.name = name;
        this.cash = cash;
        this.rd = rd;
        this.contracts = new ArrayList<SupplierContract>();
        this.contracts.addAll(contracts);
        this.fuel = fuel;
    }
}
