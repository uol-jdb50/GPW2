/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gui.raceWeekend;

import java.text.DecimalFormat;

/**
 *
 * @author Josh Brookes
 */
public class Stopwatch {
    private int run = 0;
    private boolean running = false;
    
    public void start() {
        run = 0;
        running = true;
    }
    
    public void inc() {
        run++;
    }
    
    public void stop() {
        running = false;
    }
    
    public long getElapsedTime() {
        long elapsed;
        elapsed = run * 5;
        return elapsed;
    }
    
    public String getElapsedLapTime() {
        long elapsed = getElapsedTime();
        DecimalFormat dfMIN = new DecimalFormat("#");
        DecimalFormat dfSEC = new DecimalFormat("##");
        DecimalFormat dfMIL = new DecimalFormat("###");
        return dfMIN.format(elapsed / 60000) + ":" + dfSEC.format((elapsed / 1000) % 60) + "." + dfMIL.format(elapsed % 1000);
    }
}
