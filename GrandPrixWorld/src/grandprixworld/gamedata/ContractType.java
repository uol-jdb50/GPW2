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
public enum ContractType {
    WORKS("Works"),PARTNER("Partner"),CUSTOMER("Customer");
    private String name;
    
    private ContractType(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
