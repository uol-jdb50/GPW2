/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata.car;

import java.util.Random;

/**
 *
 * @author Josh Brookes
 */
public class ChassisDev {
    public Chassis chassis;
    public int designProg;//max=10
    public int cfdProg;
    public int modelProg;
    public int windProg;
    
    public ChassisDev(Chassis parent) {
        String chassisname = parent.name;
        char version = chassisname.charAt(chassisname.length() - 1);
        chassisname = chassisname.substring(1);
        chassisname += version + 1;
        chassis = new Chassis(parent);
        chassis.name = chassisname;
        designProg = 0;
        cfdProg = 0;
        modelProg = 0;
        windProg = 0;
    }
    public ChassisDev() {
        chassis = new Chassis(grandprixworld.gui.FullGame.data.currentYear, grandprixworld.gui.FullGame.data.findPlayerTeam().name, 0, 1);
        designProg = 0;
        cfdProg = 0;
        modelProg = 0;
        windProg = 0;
    }
    public void completeChassis() {
        Random r = new Random();
        chassis.handling += r.nextInt(10) - 2;
        if (chassis.handling > 100) chassis.handling = 100;
        if (chassis.handling < 0) chassis.handling = 0;
    }
}
