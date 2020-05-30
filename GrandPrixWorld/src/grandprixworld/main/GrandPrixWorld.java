/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.main;

import grandprixworld.gui.*;
import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author jdb50
 */
public class GrandPrixWorld extends JFrame {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            GrandPrixWorld ex = new GrandPrixWorld();
            ex.setVisible(true);
        });
    }
    
    public GrandPrixWorld() {
        initMenu();
    }
    
    private void initMenu() {
        add(new FullGame());
        setUndecorated(true);
        pack();
        setTitle("Grand Prix World");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
}
