/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gui.commercial;

/**
 *
 * @author Josh Brookes
 */
public class CoAll extends javax.swing.JPanel {

    /**
     * Creates new form CoAll
     */
    public CoAll() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coSponsors1 = new grandprixworld.gui.commercial.CoSponsors();
        coNegotiations1 = new grandprixworld.gui.commercial.CoNegotiations();
        coMerchandising1 = new grandprixworld.gui.commercial.CoMerchandising();

        setBackground(new java.awt.Color(64, 64, 64));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        setForeground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1100, 550));
        setMinimumSize(new java.awt.Dimension(1100, 550));
        setLayout(new java.awt.CardLayout());
        add(coSponsors1, "Sponsors");
        add(coNegotiations1, "Negotiations");
        add(coMerchandising1, "Merchandising");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private grandprixworld.gui.commercial.CoMerchandising coMerchandising1;
    private grandprixworld.gui.commercial.CoNegotiations coNegotiations1;
    private grandprixworld.gui.commercial.CoSponsors coSponsors1;
    // End of variables declaration//GEN-END:variables
}