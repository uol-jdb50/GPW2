/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata;

/**
 *
 * @author Josh Brookes
 */
public class SupplierContract {
    public ContractType type;
    public int finalSeason;
    
    public SupplierContract(ContractType type, int finalSeason) {
        this.type = type;
        this.finalSeason = finalSeason;
    }
}
