/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata;

import grandprixworld.gamedata.car.engine.Electronics;
import grandprixworld.gamedata.car.engine.EnergyStore;
import grandprixworld.gamedata.car.engine.ICE;
import grandprixworld.gamedata.car.engine.MGUH;
import grandprixworld.gamedata.car.engine.MGUK;
import grandprixworld.gamedata.car.engine.Turbo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jdb50
 */
public class EngineSponsor {
    public String name;
    public int cash;
    public int rd;
    public List<SupplierContract> contracts;
    public ICE ice;
    public Turbo turbo;
    public MGUH mguh;
    public MGUK mguk;
    public EnergyStore es;
    public Electronics ce;
    
    public EngineSponsor(String name, int cash, int rd, List<SupplierContract> contracts,
            ICE ice, Turbo turbo, MGUH mguh, MGUK mguk, EnergyStore es, Electronics ce) {
        this.name = name;
        this.cash = cash;
        this.rd = rd;
        this.contracts = new ArrayList<SupplierContract>();
        this.contracts.addAll(contracts);
        this.ice = ice;
        this.turbo = turbo;
        this.mguh = mguh;
        this.mguk = mguk;
        this.es = es;
        this.ce = ce;
    }
}
