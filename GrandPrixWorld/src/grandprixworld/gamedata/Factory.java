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
public class Factory {
    public int size;
    public int cad;
    public int cam;
    public int supercomputer;
    public int windTunnel;
    public int workshop;
    
    public Factory(int size) {
        this.size = size;
        cad = 0;
        cam = 0;
        supercomputer = 0;
        windTunnel = 0;
        workshop = 0;
    }
    
    public int maxDepartment() {
        switch (size) {
            case 1:
                return 40;
            case 2:
                return 50;
            case 3:
                return 60;
            case 4:
                return 80;
            case 5:
                return 100;
            default:
                return 0;
        }
    }
    public int maxStaff() {
        return maxDepartment() * 4;
    }
    public int maxFacility() {
        switch (size) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            default:
                return 0;
        }
    }
}
