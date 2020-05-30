/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gui.engineering;

import grandprixworld.gui.FullGame;

/**
 *
 * @author Josh Brookes
 */
public class EnTesting extends javax.swing.JPanel {

    public int[] D1Tyres;//1-S 2-M 3-H
    public int[] D2Tyres;
    
    /**
     * Creates new form EnTesting
     */
    public EnTesting() {
        initComponents();
        FullGame.data.findPlayerTeam().d1tyres = new int[] {3, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 2, 3};
        FullGame.data.findPlayerTeam().d2tyres = new int[] {3, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 2, 3};
        updateScreenData();
    }
    
    public void updateScreenData() {
        lblSumAvail.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().mechAvail) + "%");
        lblSumMnt.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().mntStaffUsed) + "%");
        lblSumRep.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().repStaffUsed) + "%");
        lblSumTst.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstStaffUsed) + "%");
        if (grandprixworld.gui.FullGame.data.f1.testingThisWeek()) lblTesting.setText("Yes");
        else lblTesting.setText("No");
        if (grandprixworld.gui.FullGame.data.f1.findNextEvent().eventStart.equals(grandprixworld.gui.FullGame.data.currentDate)) lblPractice.setText("Yes");
        else lblPractice.setText("No");
        imgDevProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + grandprixworld.gui.FullGame.data.findPlayerTeam().tstDev + ".png")));
        imgResProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + grandprixworld.gui.FullGame.data.findPlayerTeam().tstRes + ".png")));
        imgEngProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + grandprixworld.gui.FullGame.data.findPlayerTeam().tstEng + ".png")));
        imgFuelProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + grandprixworld.gui.FullGame.data.findPlayerTeam().tstFuel + ".png")));
        imgTyreProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + grandprixworld.gui.FullGame.data.findPlayerTeam().tstTyre + ".png")));
        
        lblTstAvail.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().mechAvail) + "%");
        lblTstMnt.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().mntStaffUsed) + "%");
        lblTstRep.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().repStaffUsed) + "%");
        lblTstTst.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstStaffUsed) + "%");
        lblCostPerMile.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.f1.testCost));
        lblTestMiles.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().testMiles));
        lblTotalCost.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().testMiles * grandprixworld.gui.FullGame.data.f1.testCost));
        lblTstDriver1.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().driver1.fname.charAt(0) + " " + grandprixworld.gui.FullGame.data.findPlayerTeam().driver1.lname);
        lblTstDriver2.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().driver2.fname.charAt(0) + " " + grandprixworld.gui.FullGame.data.findPlayerTeam().driver2.lname);
        lblTstMechDev.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechDev) + "%");
        lblTstMechRes.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechRes) + "%");
        lblTstMechEng.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechEng) + "%");
        lblTstMechFuel.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechFuel) + "%");
        lblTstMechTyre.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechTyre) + "%");
        lblTstD1Dev.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Dev) + "%");
        lblTstD1Res.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Res) + "%");
        lblTstD1Eng.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Eng) + "%");
        lblTstD1Fuel.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Fuel) + "%");
        lblTstD1Tyre.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Tyre) + "%");
        lblTstD2Dev.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Dev) + "%");
        lblTstD2Res.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Res) + "%");
        lblTstD2Eng.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Eng) + "%");
        lblTstD2Fuel.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Fuel) + "%");
        lblTstD2Tyre.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Tyre) + "%");
        lblTstRDDev.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDDev) + "%");
        lblTstRDRes.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDRes) + "%");
        lblTstRDEng.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDEng) + "%");
        lblTstRDFuel.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDFuel) + "%");
        lblTstRDTyre.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDTyre) + "%");
        
        lblTyreAllocation.setText("Tyre Allocation - " + grandprixworld.gui.FullGame.data.f1.findNextEvent().eventName);
        lblPraDriver1.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().driver1.fname.charAt(0) + " " + grandprixworld.gui.FullGame.data.findPlayerTeam().driver1.lname);
        lblPraDriver2.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().driver2.fname.charAt(0) + " " + grandprixworld.gui.FullGame.data.findPlayerTeam().driver2.lname);
        imgD1P1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d1tyres[0] + ".png")));
        imgD1P2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d1tyres[1] + ".png")));
        imgD1P3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d1tyres[2] + ".png")));
        imgD1P4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d1tyres[3] + ".png")));
        imgD1P5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d1tyres[4] + ".png")));
        imgD1P6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d1tyres[5] + ".png")));
        imgD1Q1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d1tyres[6] + ".png")));
        imgD1Q2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d1tyres[7] + ".png")));
        imgD1Q3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d1tyres[8] + ".png")));
        imgD1Q4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d1tyres[9] + ".png")));
        imgD2P1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d2tyres[0] + ".png")));
        imgD2P2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d2tyres[1] + ".png")));
        imgD2P3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d2tyres[2] + ".png")));
        imgD2P4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d2tyres[3] + ".png")));
        imgD2P5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d2tyres[4] + ".png")));
        imgD2P6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d2tyres[5] + ".png")));
        imgD2Q1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d2tyres[6] + ".png")));
        imgD2Q2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d2tyres[7] + ".png")));
        imgD2Q3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d2tyres[8] + ".png")));
        imgD2Q4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre" + FullGame.data.findPlayerTeam().d2tyres[9] + ".png")));
        lblD1Softs.setText(Integer.toString(numCompound(1, 1)));
        lblD1Meds.setText(Integer.toString(numCompound(1, 2)));
        lblD1Hards.setText(Integer.toString(numCompound(1, 3)));
        lblD2Softs.setText(Integer.toString(numCompound(2, 1)));
        lblD2Meds.setText(Integer.toString(numCompound(2, 2)));
        lblD2Hards.setText(Integer.toString(numCompound(2, 3)));
        lblProgD1.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().driver1.fname.charAt(0) + " " + grandprixworld.gui.FullGame.data.findPlayerTeam().driver1.lname);
        lblProgD2.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().driver2.fname.charAt(0) + " " + grandprixworld.gui.FullGame.data.findPlayerTeam().driver2.lname);
        lblPraD1Set.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Set) + "%");
        lblPraD1Dev.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Dev) + "%");
        lblPraD1Res.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Res) + "%");
        lblPraD1Qua.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Qua) + "%");
        lblPraD1Str.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Str) + "%");
        lblPraD2Set.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Set) + "%");
        lblPraD2Dev.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Dev) + "%");
        lblPraD2Res.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Res) + "%");
        lblPraD2Qua.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Qua) + "%");
        lblPraD2Str.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Str) + "%");
    }
    
    private int numCompound(int driver, int comp) {
        int count = 1;
        if (driver == 1) {
            for (int i: FullGame.data.findPlayerTeam().d1tyres) {
                if (i == comp) count++;
            }
        } else {
            for (int i: FullGame.data.findPlayerTeam().d2tyres) {
                if (i == comp) count++;
            }
        }
        return count;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        lblSumAvail = new javax.swing.JLabel();
        lblSumMnt = new javax.swing.JLabel();
        lblSumRep = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        lblSumTst = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel140 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        lblTesting = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        lblPractice = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel141 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        imgDevProg = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        imgResProg = new javax.swing.JLabel();
        imgEngProg = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        imgFuelProg = new javax.swing.JLabel();
        imgTyreProg = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        btnDevFinish = new javax.swing.JLabel();
        btnResFinish = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel142 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        lblTstAvail = new javax.swing.JLabel();
        lblTstMnt = new javax.swing.JLabel();
        lblTstRep = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        lblTstTst = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        lblCostPerMile = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        lblTestMiles = new javax.swing.JLabel();
        btnDecMiles = new javax.swing.JLabel();
        btnIncMiles = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        lblTotalCost = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel174 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        lblTstDriver1 = new javax.swing.JLabel();
        lblTstDriver2 = new javax.swing.JLabel();
        selDriverRD = new javax.swing.JComboBox<>();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        lblTstMechDev = new javax.swing.JLabel();
        btnTstDecMechDev = new javax.swing.JLabel();
        btnTstIncMechDev = new javax.swing.JLabel();
        btnTstDecMechRes = new javax.swing.JLabel();
        btnTstIncMechRes = new javax.swing.JLabel();
        btnTstDecMechEng = new javax.swing.JLabel();
        btnTstIncMechEng = new javax.swing.JLabel();
        btnTstDecMechTyre = new javax.swing.JLabel();
        btnTstIncMechTyre = new javax.swing.JLabel();
        btnTstDecMechFuel = new javax.swing.JLabel();
        btnTstIncMechFuel = new javax.swing.JLabel();
        lblTstMechRes = new javax.swing.JLabel();
        lblTstMechEng = new javax.swing.JLabel();
        lblTstMechTyre = new javax.swing.JLabel();
        lblTstMechFuel = new javax.swing.JLabel();
        btnTstDecD1Dev = new javax.swing.JLabel();
        lblTstD1Dev = new javax.swing.JLabel();
        btnTstIncD1Dev = new javax.swing.JLabel();
        btnTstDecD2Dev = new javax.swing.JLabel();
        lblTstD2Dev = new javax.swing.JLabel();
        btnTstIncD2Dev = new javax.swing.JLabel();
        btnTstDecRDDev = new javax.swing.JLabel();
        lblTstRDDev = new javax.swing.JLabel();
        btnTstIncRDDev = new javax.swing.JLabel();
        btnTstDecD1Res = new javax.swing.JLabel();
        lblTstD1Res = new javax.swing.JLabel();
        btnTstIncD1Res = new javax.swing.JLabel();
        btnTstDecD2Res = new javax.swing.JLabel();
        lblTstD2Res = new javax.swing.JLabel();
        btnTstIncD2Res = new javax.swing.JLabel();
        btnTstDecRDRes = new javax.swing.JLabel();
        lblTstRDRes = new javax.swing.JLabel();
        btnTstIncRDRes = new javax.swing.JLabel();
        btnTstDecD1Eng = new javax.swing.JLabel();
        lblTstD1Eng = new javax.swing.JLabel();
        btnTstIncD1Eng = new javax.swing.JLabel();
        btnTstDecD2Eng = new javax.swing.JLabel();
        lblTstD2Eng = new javax.swing.JLabel();
        btnTstIncD2Eng = new javax.swing.JLabel();
        btnTstDecRDEng = new javax.swing.JLabel();
        lblTstRDEng = new javax.swing.JLabel();
        btnTstIncRDEng = new javax.swing.JLabel();
        btnTstDecD1Tyre = new javax.swing.JLabel();
        lblTstD1Tyre = new javax.swing.JLabel();
        btnTstIncD1Tyre = new javax.swing.JLabel();
        btnTstDecD2Tyre = new javax.swing.JLabel();
        lblTstD2Tyre = new javax.swing.JLabel();
        btnTstIncD2Tyre = new javax.swing.JLabel();
        btnTstDecRDTyre = new javax.swing.JLabel();
        lblTstRDTyre = new javax.swing.JLabel();
        btnTstIncRDTyre = new javax.swing.JLabel();
        btnTstDecD1Fuel = new javax.swing.JLabel();
        lblTstD1Fuel = new javax.swing.JLabel();
        btnTstIncD1Fuel = new javax.swing.JLabel();
        btnTstDecD2Fuel = new javax.swing.JLabel();
        lblTstD2Fuel = new javax.swing.JLabel();
        btnTstIncD2Fuel = new javax.swing.JLabel();
        btnTstDecRDFuel = new javax.swing.JLabel();
        lblTstRDFuel = new javax.swing.JLabel();
        btnTstIncRDFuel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        lblTyreAllocation = new javax.swing.JLabel();
        lblPraDriver1 = new javax.swing.JLabel();
        lblPraDriver2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblD1Softs = new javax.swing.JLabel();
        lblD1Meds = new javax.swing.JLabel();
        lblD1Hards = new javax.swing.JLabel();
        lblD2Softs = new javax.swing.JLabel();
        lblD2Meds = new javax.swing.JLabel();
        lblD2Hards = new javax.swing.JLabel();
        imgD1P1 = new javax.swing.JLabel();
        imgD1P2 = new javax.swing.JLabel();
        imgD1P3 = new javax.swing.JLabel();
        imgD1P4 = new javax.swing.JLabel();
        imgD1P5 = new javax.swing.JLabel();
        imgD1P6 = new javax.swing.JLabel();
        imgD1Q1 = new javax.swing.JLabel();
        imgD1Q2 = new javax.swing.JLabel();
        imgD1Q3 = new javax.swing.JLabel();
        imgD1Q4 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        imgD1R1 = new javax.swing.JLabel();
        imgD1R2 = new javax.swing.JLabel();
        imgD1R3 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        imgD2P1 = new javax.swing.JLabel();
        imgD2P2 = new javax.swing.JLabel();
        imgD2P3 = new javax.swing.JLabel();
        imgD2P4 = new javax.swing.JLabel();
        imgD2P5 = new javax.swing.JLabel();
        imgD2P6 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        imgD2Q1 = new javax.swing.JLabel();
        imgD2Q2 = new javax.swing.JLabel();
        imgD2Q3 = new javax.swing.JLabel();
        imgD2Q4 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        imgD2R1 = new javax.swing.JLabel();
        imgD2R2 = new javax.swing.JLabel();
        imgD2R3 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        lblProgD1 = new javax.swing.JLabel();
        lblProgD2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        btnDecD1Set = new javax.swing.JLabel();
        lblPraD1Set = new javax.swing.JLabel();
        btnIncD1Set = new javax.swing.JLabel();
        btnDecD1Res = new javax.swing.JLabel();
        lblPraD1Res = new javax.swing.JLabel();
        btnIncD1Res = new javax.swing.JLabel();
        btnDecD1Dev = new javax.swing.JLabel();
        lblPraD1Dev = new javax.swing.JLabel();
        btnIncD1Dev = new javax.swing.JLabel();
        btnDecD1Qua = new javax.swing.JLabel();
        lblPraD1Qua = new javax.swing.JLabel();
        btnIncD1Qua = new javax.swing.JLabel();
        btnDecD1Str = new javax.swing.JLabel();
        lblPraD1Str = new javax.swing.JLabel();
        btnIncD1Str = new javax.swing.JLabel();
        btnDecD2Set = new javax.swing.JLabel();
        lblPraD2Set = new javax.swing.JLabel();
        btnIncD2Set = new javax.swing.JLabel();
        btnDecD2Res = new javax.swing.JLabel();
        lblPraD2Res = new javax.swing.JLabel();
        btnIncD2Res = new javax.swing.JLabel();
        btnDecD2Dev = new javax.swing.JLabel();
        lblPraD2Dev = new javax.swing.JLabel();
        btnIncD2Dev = new javax.swing.JLabel();
        btnDecD2Qua = new javax.swing.JLabel();
        lblPraD2Qua = new javax.swing.JLabel();
        btnIncD2Qua = new javax.swing.JLabel();
        btnDecD2Str = new javax.swing.JLabel();
        lblPraD2Str = new javax.swing.JLabel();
        btnIncD2Str = new javax.swing.JLabel();

        setBackground(new java.awt.Color(88, 103, 108));
        setForeground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1100, 550));
        setMinimumSize(new java.awt.Dimension(1100, 550));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(1070, 520));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1070, 520));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1070, 520));

        jPanel1.setBackground(new java.awt.Color(88, 103, 108));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        jPanel1.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jPanel4.setOpaque(false);

        jLabel131.setBackground(new java.awt.Color(113, 132, 137));
        jLabel131.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(255, 255, 255));
        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel131.setText("Mechanics");
        jLabel131.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel131.setOpaque(true);

        jLabel132.setBackground(new java.awt.Color(113, 132, 137));
        jLabel132.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(255, 255, 255));
        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel132.setText("Available");
        jLabel132.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel132.setOpaque(true);

        jLabel133.setBackground(new java.awt.Color(113, 132, 137));
        jLabel133.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(255, 255, 255));
        jLabel133.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel133.setText("Maintenance");
        jLabel133.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel133.setOpaque(true);

        jLabel134.setBackground(new java.awt.Color(113, 132, 137));
        jLabel134.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(255, 255, 255));
        jLabel134.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel134.setText("Repairs");
        jLabel134.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel134.setOpaque(true);

        lblSumAvail.setBackground(new java.awt.Color(113, 132, 137));
        lblSumAvail.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumAvail.setForeground(new java.awt.Color(255, 255, 255));
        lblSumAvail.setText(" ");
        lblSumAvail.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumAvail.setOpaque(true);

        lblSumMnt.setBackground(new java.awt.Color(113, 132, 137));
        lblSumMnt.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumMnt.setForeground(new java.awt.Color(255, 255, 255));
        lblSumMnt.setText(" ");
        lblSumMnt.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumMnt.setOpaque(true);

        lblSumRep.setBackground(new java.awt.Color(113, 132, 137));
        lblSumRep.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumRep.setForeground(new java.awt.Color(255, 255, 255));
        lblSumRep.setText(" ");
        lblSumRep.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumRep.setOpaque(true);

        jLabel138.setBackground(new java.awt.Color(113, 132, 137));
        jLabel138.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(255, 255, 255));
        jLabel138.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel138.setText("Testing");
        jLabel138.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel138.setOpaque(true);

        lblSumTst.setBackground(new java.awt.Color(113, 132, 137));
        lblSumTst.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumTst.setForeground(new java.awt.Color(255, 255, 255));
        lblSumTst.setText(" ");
        lblSumTst.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumTst.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSumRep, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSumAvail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSumMnt, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSumTst, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel131)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel132, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSumAvail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel133)
                    .addComponent(lblSumMnt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel134)
                    .addComponent(lblSumRep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel138)
                    .addComponent(lblSumTst))
                .addGap(0, 71, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);

        jPanel6.setOpaque(false);

        jLabel140.setBackground(new java.awt.Color(113, 132, 137));
        jLabel140.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(255, 255, 255));
        jLabel140.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel140.setText("This Week");
        jLabel140.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel140.setOpaque(true);

        jLabel143.setBackground(new java.awt.Color(113, 132, 137));
        jLabel143.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(255, 255, 255));
        jLabel143.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel143.setText("Testing");
        jLabel143.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel143.setOpaque(true);

        lblTesting.setBackground(new java.awt.Color(113, 132, 137));
        lblTesting.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTesting.setForeground(new java.awt.Color(255, 255, 255));
        lblTesting.setText(" ");
        lblTesting.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTesting.setOpaque(true);

        jLabel145.setBackground(new java.awt.Color(113, 132, 137));
        jLabel145.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(255, 255, 255));
        jLabel145.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel145.setText("Free Practice");
        jLabel145.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel145.setOpaque(true);

        lblPractice.setBackground(new java.awt.Color(113, 132, 137));
        lblPractice.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblPractice.setForeground(new java.awt.Color(255, 255, 255));
        lblPractice.setText(" ");
        lblPractice.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblPractice.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel140, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTesting, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPractice, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel140)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel143, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTesting))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel145, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPractice))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6);

        jPanel5.setOpaque(false);

        jLabel141.setBackground(new java.awt.Color(113, 132, 137));
        jLabel141.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(255, 255, 255));
        jLabel141.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel141.setText("Research");
        jLabel141.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel141.setOpaque(true);

        jLabel147.setBackground(new java.awt.Color(113, 132, 137));
        jLabel147.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(255, 255, 255));
        jLabel147.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel147.setText("Development");
        jLabel147.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel147.setOpaque(true);

        imgDevProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgDevProg.setForeground(new java.awt.Color(255, 255, 255));
        imgDevProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel149.setBackground(new java.awt.Color(113, 132, 137));
        jLabel149.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(255, 255, 255));
        jLabel149.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel149.setText("Research");
        jLabel149.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel149.setOpaque(true);

        imgResProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgResProg.setForeground(new java.awt.Color(255, 255, 255));
        imgResProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        imgEngProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgEngProg.setForeground(new java.awt.Color(255, 255, 255));
        imgEngProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel152.setBackground(new java.awt.Color(113, 132, 137));
        jLabel152.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(255, 255, 255));
        jLabel152.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel152.setText("Engine");
        jLabel152.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel152.setOpaque(true);

        jLabel153.setBackground(new java.awt.Color(113, 132, 137));
        jLabel153.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(255, 255, 255));
        jLabel153.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel153.setText("Fuel");
        jLabel153.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel153.setOpaque(true);

        imgFuelProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgFuelProg.setForeground(new java.awt.Color(255, 255, 255));
        imgFuelProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        imgTyreProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgTyreProg.setForeground(new java.awt.Color(255, 255, 255));
        imgTyreProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel156.setBackground(new java.awt.Color(113, 132, 137));
        jLabel156.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel156.setForeground(new java.awt.Color(255, 255, 255));
        jLabel156.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel156.setText("Tyre");
        jLabel156.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel156.setOpaque(true);

        btnDevFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDevFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnDevFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDevFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnDevFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnDevFinish.setMaximumSize(new java.awt.Dimension(126, 24));
        btnDevFinish.setMinimumSize(new java.awt.Dimension(126, 24));
        btnDevFinish.setPreferredSize(new java.awt.Dimension(126, 24));
        btnDevFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDevFinishMouseClicked(evt);
            }
        });

        btnResFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnResFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnResFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnResFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnResFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnResFinish.setMaximumSize(new java.awt.Dimension(126, 24));
        btnResFinish.setMinimumSize(new java.awt.Dimension(126, 24));
        btnResFinish.setPreferredSize(new java.awt.Dimension(126, 24));
        btnResFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResFinishMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel141, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel153, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel152, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel149, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel147, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel156, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imgEngProg)
                                    .addComponent(imgFuelProg)
                                    .addComponent(imgTyreProg))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(imgDevProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(imgResProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDevFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(btnResFinish, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel141)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDevFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel147, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgDevProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel149, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgResProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnResFinish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel152)
                    .addComponent(imgEngProg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel153)
                    .addComponent(imgFuelProg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel156)
                    .addComponent(imgTyreProg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);

        jPanel7.setOpaque(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7);

        jTabbedPane1.addTab("Summary", jPanel1);

        jPanel2.setBackground(new java.awt.Color(88, 103, 108));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        jPanel2.setLayout(new java.awt.GridLayout(2, 1, 10, 10));

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridLayout(1, 2, 10, 10));

        jPanel10.setOpaque(false);

        jLabel142.setBackground(new java.awt.Color(113, 132, 137));
        jLabel142.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(255, 255, 255));
        jLabel142.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel142.setText("Mechanics");
        jLabel142.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel142.setOpaque(true);

        jLabel157.setBackground(new java.awt.Color(113, 132, 137));
        jLabel157.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel157.setForeground(new java.awt.Color(255, 255, 255));
        jLabel157.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel157.setText("Available");
        jLabel157.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel157.setOpaque(true);

        jLabel158.setBackground(new java.awt.Color(113, 132, 137));
        jLabel158.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel158.setForeground(new java.awt.Color(255, 255, 255));
        jLabel158.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel158.setText("Maintenance");
        jLabel158.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel158.setOpaque(true);

        jLabel159.setBackground(new java.awt.Color(113, 132, 137));
        jLabel159.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(255, 255, 255));
        jLabel159.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel159.setText("Repairs");
        jLabel159.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel159.setOpaque(true);

        lblTstAvail.setBackground(new java.awt.Color(113, 132, 137));
        lblTstAvail.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstAvail.setForeground(new java.awt.Color(255, 255, 255));
        lblTstAvail.setText(" ");
        lblTstAvail.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstAvail.setOpaque(true);

        lblTstMnt.setBackground(new java.awt.Color(113, 132, 137));
        lblTstMnt.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstMnt.setForeground(new java.awt.Color(255, 255, 255));
        lblTstMnt.setText(" ");
        lblTstMnt.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstMnt.setOpaque(true);

        lblTstRep.setBackground(new java.awt.Color(113, 132, 137));
        lblTstRep.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstRep.setForeground(new java.awt.Color(255, 255, 255));
        lblTstRep.setText(" ");
        lblTstRep.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstRep.setOpaque(true);

        jLabel163.setBackground(new java.awt.Color(113, 132, 137));
        jLabel163.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel163.setForeground(new java.awt.Color(255, 255, 255));
        jLabel163.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel163.setText("Testing");
        jLabel163.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel163.setOpaque(true);

        lblTstTst.setBackground(new java.awt.Color(113, 132, 137));
        lblTstTst.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstTst.setForeground(new java.awt.Color(255, 255, 255));
        lblTstTst.setText(" ");
        lblTstTst.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstTst.setOpaque(true);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel142, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTstRep, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTstAvail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTstMnt, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTstTst, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel142)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel157, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTstAvail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel158)
                    .addComponent(lblTstMnt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel159)
                    .addComponent(lblTstRep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel163)
                    .addComponent(lblTstTst))
                .addGap(0, 71, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel10);

        jPanel11.setOpaque(false);

        jLabel165.setBackground(new java.awt.Color(113, 132, 137));
        jLabel165.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(255, 255, 255));
        jLabel165.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel165.setText("Allowance");
        jLabel165.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel165.setOpaque(true);

        jLabel166.setBackground(new java.awt.Color(113, 132, 137));
        jLabel166.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(255, 255, 255));
        jLabel166.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel166.setText("Cost Per Mile");
        jLabel166.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel166.setOpaque(true);

        lblCostPerMile.setBackground(new java.awt.Color(113, 132, 137));
        lblCostPerMile.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCostPerMile.setForeground(new java.awt.Color(255, 255, 255));
        lblCostPerMile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCostPerMile.setText(" ");
        lblCostPerMile.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCostPerMile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCostPerMile.setOpaque(true);

        jLabel168.setBackground(new java.awt.Color(113, 132, 137));
        jLabel168.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(255, 255, 255));
        jLabel168.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel168.setText("Testing Miles");
        jLabel168.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel168.setOpaque(true);

        lblTestMiles.setBackground(new java.awt.Color(113, 132, 137));
        lblTestMiles.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTestMiles.setForeground(new java.awt.Color(255, 255, 255));
        lblTestMiles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTestMiles.setText(" ");
        lblTestMiles.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTestMiles.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTestMiles.setOpaque(true);

        btnDecMiles.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecMiles.setForeground(new java.awt.Color(255, 255, 255));
        btnDecMiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecMiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecMilesMouseClicked(evt);
            }
        });

        btnIncMiles.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncMiles.setForeground(new java.awt.Color(255, 255, 255));
        btnIncMiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncMiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncMilesMouseClicked(evt);
            }
        });

        jLabel172.setBackground(new java.awt.Color(113, 132, 137));
        jLabel172.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel172.setForeground(new java.awt.Color(255, 255, 255));
        jLabel172.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel172.setText("Total Cost");
        jLabel172.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel172.setOpaque(true);

        lblTotalCost.setBackground(new java.awt.Color(113, 132, 137));
        lblTotalCost.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTotalCost.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalCost.setText(" ");
        lblTotalCost.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTotalCost.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTotalCost.setOpaque(true);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel165, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel166, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCostPerMile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecMiles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTestMiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncMiles))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel172, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel165)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel166)
                    .addComponent(lblCostPerMile, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel168)
                    .addComponent(btnDecMiles)
                    .addComponent(btnIncMiles)
                    .addComponent(lblTestMiles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel172)
                    .addComponent(lblTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel11);

        jPanel2.add(jPanel8);

        jPanel9.setOpaque(false);

        jLabel174.setBackground(new java.awt.Color(113, 132, 137));
        jLabel174.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(255, 255, 255));
        jLabel174.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel174.setText("Testing Plan");
        jLabel174.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel174.setOpaque(true);

        jLabel176.setBackground(new java.awt.Color(113, 132, 137));
        jLabel176.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(255, 255, 255));
        jLabel176.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel176.setText("Mechanics");
        jLabel176.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel176.setOpaque(true);

        lblTstDriver1.setBackground(new java.awt.Color(113, 132, 137));
        lblTstDriver1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstDriver1.setForeground(new java.awt.Color(255, 255, 255));
        lblTstDriver1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstDriver1.setText(" ");
        lblTstDriver1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstDriver1.setOpaque(true);

        lblTstDriver2.setBackground(new java.awt.Color(113, 132, 137));
        lblTstDriver2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstDriver2.setForeground(new java.awt.Color(255, 255, 255));
        lblTstDriver2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstDriver2.setText(" ");
        lblTstDriver2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstDriver2.setOpaque(true);

        selDriverRD.setBackground(new java.awt.Color(113, 132, 137));
        selDriverRD.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        selDriverRD.setForeground(new java.awt.Color(255, 255, 255));
        selDriverRD.setMaximumRowCount(3);

        jLabel186.setBackground(new java.awt.Color(113, 132, 137));
        jLabel186.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel186.setForeground(new java.awt.Color(255, 255, 255));
        jLabel186.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel186.setText("Development");
        jLabel186.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel186.setOpaque(true);

        jLabel187.setBackground(new java.awt.Color(113, 132, 137));
        jLabel187.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel187.setForeground(new java.awt.Color(255, 255, 255));
        jLabel187.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel187.setText("Research");
        jLabel187.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel187.setOpaque(true);

        jLabel193.setBackground(new java.awt.Color(113, 132, 137));
        jLabel193.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel193.setForeground(new java.awt.Color(255, 255, 255));
        jLabel193.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel193.setText("Engine");
        jLabel193.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel193.setOpaque(true);

        jLabel198.setBackground(new java.awt.Color(113, 132, 137));
        jLabel198.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel198.setForeground(new java.awt.Color(255, 255, 255));
        jLabel198.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel198.setText("Tyre");
        jLabel198.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel198.setOpaque(true);

        jLabel199.setBackground(new java.awt.Color(113, 132, 137));
        jLabel199.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel199.setForeground(new java.awt.Color(255, 255, 255));
        jLabel199.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel199.setText("Fuel");
        jLabel199.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel199.setOpaque(true);

        lblTstMechDev.setBackground(new java.awt.Color(113, 132, 137));
        lblTstMechDev.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstMechDev.setForeground(new java.awt.Color(255, 255, 255));
        lblTstMechDev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstMechDev.setText(" ");
        lblTstMechDev.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstMechDev.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstMechDev.setOpaque(true);

        btnTstDecMechDev.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecMechDev.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecMechDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecMechDev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecMechDevMouseClicked(evt);
            }
        });

        btnTstIncMechDev.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncMechDev.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncMechDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncMechDev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncMechDevMouseClicked(evt);
            }
        });

        btnTstDecMechRes.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecMechRes.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecMechRes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecMechRes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecMechResMouseClicked(evt);
            }
        });

        btnTstIncMechRes.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncMechRes.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncMechRes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncMechRes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncMechResMouseClicked(evt);
            }
        });

        btnTstDecMechEng.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecMechEng.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecMechEng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecMechEng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecMechEngMouseClicked(evt);
            }
        });

        btnTstIncMechEng.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncMechEng.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncMechEng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncMechEng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncMechEngMouseClicked(evt);
            }
        });

        btnTstDecMechTyre.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecMechTyre.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecMechTyre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecMechTyre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecMechTyreMouseClicked(evt);
            }
        });

        btnTstIncMechTyre.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncMechTyre.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncMechTyre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncMechTyre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncMechTyreMouseClicked(evt);
            }
        });

        btnTstDecMechFuel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecMechFuel.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecMechFuel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecMechFuel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecMechFuelMouseClicked(evt);
            }
        });

        btnTstIncMechFuel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncMechFuel.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncMechFuel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncMechFuel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncMechFuelMouseClicked(evt);
            }
        });

        lblTstMechRes.setBackground(new java.awt.Color(113, 132, 137));
        lblTstMechRes.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstMechRes.setForeground(new java.awt.Color(255, 255, 255));
        lblTstMechRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstMechRes.setText(" ");
        lblTstMechRes.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstMechRes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstMechRes.setOpaque(true);

        lblTstMechEng.setBackground(new java.awt.Color(113, 132, 137));
        lblTstMechEng.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstMechEng.setForeground(new java.awt.Color(255, 255, 255));
        lblTstMechEng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstMechEng.setText(" ");
        lblTstMechEng.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstMechEng.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstMechEng.setOpaque(true);

        lblTstMechTyre.setBackground(new java.awt.Color(113, 132, 137));
        lblTstMechTyre.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstMechTyre.setForeground(new java.awt.Color(255, 255, 255));
        lblTstMechTyre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstMechTyre.setText(" ");
        lblTstMechTyre.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstMechTyre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstMechTyre.setOpaque(true);

        lblTstMechFuel.setBackground(new java.awt.Color(113, 132, 137));
        lblTstMechFuel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstMechFuel.setForeground(new java.awt.Color(255, 255, 255));
        lblTstMechFuel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstMechFuel.setText(" ");
        lblTstMechFuel.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstMechFuel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstMechFuel.setOpaque(true);

        btnTstDecD1Dev.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecD1Dev.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecD1Dev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecD1Dev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecD1DevMouseClicked(evt);
            }
        });

        lblTstD1Dev.setBackground(new java.awt.Color(113, 132, 137));
        lblTstD1Dev.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstD1Dev.setForeground(new java.awt.Color(255, 255, 255));
        lblTstD1Dev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstD1Dev.setText(" ");
        lblTstD1Dev.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstD1Dev.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstD1Dev.setOpaque(true);

        btnTstIncD1Dev.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncD1Dev.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncD1Dev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncD1Dev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncD1DevMouseClicked(evt);
            }
        });

        btnTstDecD2Dev.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecD2Dev.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecD2Dev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecD2Dev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecD2DevMouseClicked(evt);
            }
        });

        lblTstD2Dev.setBackground(new java.awt.Color(113, 132, 137));
        lblTstD2Dev.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstD2Dev.setForeground(new java.awt.Color(255, 255, 255));
        lblTstD2Dev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstD2Dev.setText(" ");
        lblTstD2Dev.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstD2Dev.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstD2Dev.setOpaque(true);

        btnTstIncD2Dev.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncD2Dev.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncD2Dev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncD2Dev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncD2DevMouseClicked(evt);
            }
        });

        btnTstDecRDDev.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecRDDev.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecRDDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecRDDev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecRDDevMouseClicked(evt);
            }
        });

        lblTstRDDev.setBackground(new java.awt.Color(113, 132, 137));
        lblTstRDDev.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstRDDev.setForeground(new java.awt.Color(255, 255, 255));
        lblTstRDDev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstRDDev.setText(" ");
        lblTstRDDev.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstRDDev.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstRDDev.setOpaque(true);

        btnTstIncRDDev.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncRDDev.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncRDDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncRDDev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncRDDevMouseClicked(evt);
            }
        });

        btnTstDecD1Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecD1Res.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecD1Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecD1Res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecD1ResMouseClicked(evt);
            }
        });

        lblTstD1Res.setBackground(new java.awt.Color(113, 132, 137));
        lblTstD1Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstD1Res.setForeground(new java.awt.Color(255, 255, 255));
        lblTstD1Res.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstD1Res.setText(" ");
        lblTstD1Res.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstD1Res.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstD1Res.setOpaque(true);

        btnTstIncD1Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncD1Res.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncD1Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncD1Res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncD1ResMouseClicked(evt);
            }
        });

        btnTstDecD2Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecD2Res.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecD2Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecD2Res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecD2ResMouseClicked(evt);
            }
        });

        lblTstD2Res.setBackground(new java.awt.Color(113, 132, 137));
        lblTstD2Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstD2Res.setForeground(new java.awt.Color(255, 255, 255));
        lblTstD2Res.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstD2Res.setText(" ");
        lblTstD2Res.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstD2Res.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstD2Res.setOpaque(true);

        btnTstIncD2Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncD2Res.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncD2Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncD2Res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncD2ResMouseClicked(evt);
            }
        });

        btnTstDecRDRes.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecRDRes.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecRDRes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecRDRes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecRDResMouseClicked(evt);
            }
        });

        lblTstRDRes.setBackground(new java.awt.Color(113, 132, 137));
        lblTstRDRes.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstRDRes.setForeground(new java.awt.Color(255, 255, 255));
        lblTstRDRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstRDRes.setText(" ");
        lblTstRDRes.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstRDRes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstRDRes.setOpaque(true);

        btnTstIncRDRes.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncRDRes.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncRDRes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncRDRes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncRDResMouseClicked(evt);
            }
        });

        btnTstDecD1Eng.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecD1Eng.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecD1Eng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecD1Eng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecD1EngMouseClicked(evt);
            }
        });

        lblTstD1Eng.setBackground(new java.awt.Color(113, 132, 137));
        lblTstD1Eng.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstD1Eng.setForeground(new java.awt.Color(255, 255, 255));
        lblTstD1Eng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstD1Eng.setText(" ");
        lblTstD1Eng.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstD1Eng.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstD1Eng.setOpaque(true);

        btnTstIncD1Eng.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncD1Eng.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncD1Eng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncD1Eng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncD1EngMouseClicked(evt);
            }
        });

        btnTstDecD2Eng.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecD2Eng.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecD2Eng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecD2Eng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecD2EngMouseClicked(evt);
            }
        });

        lblTstD2Eng.setBackground(new java.awt.Color(113, 132, 137));
        lblTstD2Eng.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstD2Eng.setForeground(new java.awt.Color(255, 255, 255));
        lblTstD2Eng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstD2Eng.setText(" ");
        lblTstD2Eng.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstD2Eng.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstD2Eng.setOpaque(true);

        btnTstIncD2Eng.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncD2Eng.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncD2Eng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncD2Eng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncD2EngMouseClicked(evt);
            }
        });

        btnTstDecRDEng.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecRDEng.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecRDEng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecRDEng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecRDEngMouseClicked(evt);
            }
        });

        lblTstRDEng.setBackground(new java.awt.Color(113, 132, 137));
        lblTstRDEng.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstRDEng.setForeground(new java.awt.Color(255, 255, 255));
        lblTstRDEng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstRDEng.setText(" ");
        lblTstRDEng.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstRDEng.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstRDEng.setOpaque(true);

        btnTstIncRDEng.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncRDEng.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncRDEng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncRDEng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncRDEngMouseClicked(evt);
            }
        });

        btnTstDecD1Tyre.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecD1Tyre.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecD1Tyre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecD1Tyre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecD1TyreMouseClicked(evt);
            }
        });

        lblTstD1Tyre.setBackground(new java.awt.Color(113, 132, 137));
        lblTstD1Tyre.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstD1Tyre.setForeground(new java.awt.Color(255, 255, 255));
        lblTstD1Tyre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstD1Tyre.setText(" ");
        lblTstD1Tyre.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstD1Tyre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstD1Tyre.setOpaque(true);

        btnTstIncD1Tyre.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncD1Tyre.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncD1Tyre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncD1Tyre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncD1TyreMouseClicked(evt);
            }
        });

        btnTstDecD2Tyre.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecD2Tyre.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecD2Tyre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecD2Tyre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecD2TyreMouseClicked(evt);
            }
        });

        lblTstD2Tyre.setBackground(new java.awt.Color(113, 132, 137));
        lblTstD2Tyre.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstD2Tyre.setForeground(new java.awt.Color(255, 255, 255));
        lblTstD2Tyre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstD2Tyre.setText(" ");
        lblTstD2Tyre.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstD2Tyre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstD2Tyre.setOpaque(true);

        btnTstIncD2Tyre.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncD2Tyre.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncD2Tyre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncD2Tyre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncD2TyreMouseClicked(evt);
            }
        });

        btnTstDecRDTyre.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecRDTyre.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecRDTyre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecRDTyre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecRDTyreMouseClicked(evt);
            }
        });

        lblTstRDTyre.setBackground(new java.awt.Color(113, 132, 137));
        lblTstRDTyre.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstRDTyre.setForeground(new java.awt.Color(255, 255, 255));
        lblTstRDTyre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstRDTyre.setText(" ");
        lblTstRDTyre.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstRDTyre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstRDTyre.setOpaque(true);

        btnTstIncRDTyre.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncRDTyre.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncRDTyre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncRDTyre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncRDTyreMouseClicked(evt);
            }
        });

        btnTstDecD1Fuel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecD1Fuel.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecD1Fuel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecD1Fuel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecD1FuelMouseClicked(evt);
            }
        });

        lblTstD1Fuel.setBackground(new java.awt.Color(113, 132, 137));
        lblTstD1Fuel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstD1Fuel.setForeground(new java.awt.Color(255, 255, 255));
        lblTstD1Fuel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstD1Fuel.setText(" ");
        lblTstD1Fuel.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstD1Fuel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstD1Fuel.setOpaque(true);

        btnTstIncD1Fuel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncD1Fuel.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncD1Fuel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncD1Fuel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncD1FuelMouseClicked(evt);
            }
        });

        btnTstDecD2Fuel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecD2Fuel.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecD2Fuel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecD2Fuel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecD2FuelMouseClicked(evt);
            }
        });

        lblTstD2Fuel.setBackground(new java.awt.Color(113, 132, 137));
        lblTstD2Fuel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstD2Fuel.setForeground(new java.awt.Color(255, 255, 255));
        lblTstD2Fuel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstD2Fuel.setText(" ");
        lblTstD2Fuel.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstD2Fuel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstD2Fuel.setOpaque(true);

        btnTstIncD2Fuel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncD2Fuel.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncD2Fuel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncD2Fuel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncD2FuelMouseClicked(evt);
            }
        });

        btnTstDecRDFuel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstDecRDFuel.setForeground(new java.awt.Color(255, 255, 255));
        btnTstDecRDFuel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnTstDecRDFuel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstDecRDFuelMouseClicked(evt);
            }
        });

        lblTstRDFuel.setBackground(new java.awt.Color(113, 132, 137));
        lblTstRDFuel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTstRDFuel.setForeground(new java.awt.Color(255, 255, 255));
        lblTstRDFuel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTstRDFuel.setText(" ");
        lblTstRDFuel.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTstRDFuel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTstRDFuel.setOpaque(true);

        btnTstIncRDFuel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTstIncRDFuel.setForeground(new java.awt.Color(255, 255, 255));
        btnTstIncRDFuel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnTstIncRDFuel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTstIncRDFuelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel186, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTstDecMechDev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTstMechDev, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTstIncMechDev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTstDecD1Dev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTstD1Dev, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTstIncD1Dev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTstDecD2Dev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTstD2Dev, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTstIncD2Dev))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(206, 206, 206)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel176, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(lblTstMechRes, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnTstIncMechRes))
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                                        .addComponent(lblTstMechFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnTstIncMechFuel))
                                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                                        .addComponent(lblTstMechEng, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnTstIncMechEng))
                                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                                        .addComponent(lblTstMechTyre, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnTstIncMechTyre))))))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel187, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTstDecMechRes))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel193, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTstDecMechEng))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel198, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTstDecMechTyre))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel199, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTstDecMechFuel)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(lblTstDriver1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTstDriver2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(btnTstDecD1Res)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTstD1Res, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTstIncD1Res)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTstDecD2Res)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTstD2Res, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTstIncD2Res))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(btnTstDecD1Eng)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTstD1Eng, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTstIncD1Eng)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTstDecD2Eng)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTstD2Eng, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTstIncD2Eng))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(btnTstDecD1Tyre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTstD1Tyre, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTstIncD1Tyre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTstDecD2Tyre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTstD2Tyre, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTstIncD2Tyre))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(btnTstDecD1Fuel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTstD1Fuel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTstIncD1Fuel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTstDecD2Fuel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTstD2Fuel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTstIncD2Fuel)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selDriverRD, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(btnTstDecRDDev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTstRDDev, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTstIncRDDev))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(btnTstDecRDRes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTstRDRes, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTstIncRDRes))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(btnTstDecRDEng)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTstRDEng, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTstIncRDEng))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(btnTstDecRDTyre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTstRDTyre, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTstIncRDTyre))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(btnTstDecRDFuel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTstRDFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTstIncRDFuel)))
                        .addGap(92, 92, 92))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel174, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel174)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel176)
                            .addComponent(lblTstDriver1)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTstDriver2)
                                .addComponent(selDriverRD, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel186)
                                            .addComponent(btnTstDecMechDev)
                                            .addComponent(lblTstMechDev)
                                            .addComponent(btnTstIncMechDev)
                                            .addComponent(btnTstDecD1Dev)
                                            .addComponent(lblTstD1Dev)
                                            .addComponent(btnTstIncD1Dev)
                                            .addComponent(btnTstDecD2Dev)
                                            .addComponent(lblTstD2Dev)
                                            .addComponent(btnTstIncD2Dev)
                                            .addComponent(btnTstDecRDDev)
                                            .addComponent(lblTstRDDev)
                                            .addComponent(btnTstIncRDDev))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel187)
                                            .addComponent(btnTstIncMechRes)
                                            .addComponent(lblTstMechRes, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnTstDecD1Res)
                                            .addComponent(lblTstD1Res)
                                            .addComponent(btnTstIncD1Res)
                                            .addComponent(btnTstDecD2Res)
                                            .addComponent(lblTstD2Res)
                                            .addComponent(btnTstIncD2Res)
                                            .addComponent(btnTstDecRDRes)
                                            .addComponent(lblTstRDRes)
                                            .addComponent(btnTstIncRDRes)))
                                    .addComponent(btnTstDecMechRes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel193)
                                    .addComponent(btnTstIncMechEng)
                                    .addComponent(lblTstMechEng, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnTstDecD1Eng)
                                    .addComponent(lblTstD1Eng)
                                    .addComponent(btnTstIncD1Eng)
                                    .addComponent(btnTstDecD2Eng)
                                    .addComponent(lblTstD2Eng)
                                    .addComponent(btnTstIncD2Eng)
                                    .addComponent(btnTstDecRDEng)
                                    .addComponent(lblTstRDEng)
                                    .addComponent(btnTstIncRDEng)))
                            .addComponent(btnTstDecMechEng))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel198)
                            .addComponent(btnTstIncMechTyre)
                            .addComponent(lblTstMechTyre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTstDecD1Tyre)
                            .addComponent(lblTstD1Tyre)
                            .addComponent(btnTstIncD1Tyre)
                            .addComponent(btnTstDecD2Tyre)
                            .addComponent(lblTstD2Tyre)
                            .addComponent(btnTstIncD2Tyre)
                            .addComponent(btnTstDecRDTyre)
                            .addComponent(lblTstRDTyre)
                            .addComponent(btnTstIncRDTyre)))
                    .addComponent(btnTstDecMechTyre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel199)
                    .addComponent(btnTstDecMechFuel)
                    .addComponent(btnTstIncMechFuel)
                    .addComponent(lblTstMechFuel)
                    .addComponent(btnTstDecD1Fuel)
                    .addComponent(lblTstD1Fuel)
                    .addComponent(btnTstIncD1Fuel)
                    .addComponent(btnTstDecD2Fuel)
                    .addComponent(lblTstD2Fuel)
                    .addComponent(btnTstIncD2Fuel)
                    .addComponent(btnTstDecRDFuel)
                    .addComponent(lblTstRDFuel)
                    .addComponent(btnTstIncRDFuel))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel9);

        jTabbedPane1.addTab("Testing", jPanel2);

        jPanel3.setBackground(new java.awt.Color(88, 103, 108));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        jPanel3.setLayout(new java.awt.GridLayout(2, 1, 5, 5));

        jPanel12.setOpaque(false);

        lblTyreAllocation.setBackground(new java.awt.Color(113, 132, 137));
        lblTyreAllocation.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        lblTyreAllocation.setForeground(new java.awt.Color(255, 255, 255));
        lblTyreAllocation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTyreAllocation.setText("Tyre Allocation");
        lblTyreAllocation.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTyreAllocation.setOpaque(true);

        lblPraDriver1.setBackground(new java.awt.Color(113, 132, 137));
        lblPraDriver1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblPraDriver1.setForeground(new java.awt.Color(255, 255, 255));
        lblPraDriver1.setText(" ");
        lblPraDriver1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblPraDriver1.setOpaque(true);

        lblPraDriver2.setBackground(new java.awt.Color(113, 132, 137));
        lblPraDriver2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblPraDriver2.setForeground(new java.awt.Color(255, 255, 255));
        lblPraDriver2.setText(" ");
        lblPraDriver2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblPraDriver2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(113, 132, 137));
        jLabel3.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Medium");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(113, 132, 137));
        jLabel4.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hard");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(113, 132, 137));
        jLabel5.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Soft");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(113, 132, 137));
        jLabel6.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Soft");
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(113, 132, 137));
        jLabel7.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Medium");
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel7.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(113, 132, 137));
        jLabel8.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hard");
        jLabel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel8.setOpaque(true);

        lblD1Softs.setBackground(new java.awt.Color(113, 132, 137));
        lblD1Softs.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblD1Softs.setForeground(new java.awt.Color(255, 255, 255));
        lblD1Softs.setText(" ");
        lblD1Softs.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblD1Softs.setOpaque(true);

        lblD1Meds.setBackground(new java.awt.Color(113, 132, 137));
        lblD1Meds.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblD1Meds.setForeground(new java.awt.Color(255, 255, 255));
        lblD1Meds.setText(" ");
        lblD1Meds.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblD1Meds.setOpaque(true);

        lblD1Hards.setBackground(new java.awt.Color(113, 132, 137));
        lblD1Hards.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblD1Hards.setForeground(new java.awt.Color(255, 255, 255));
        lblD1Hards.setText(" ");
        lblD1Hards.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblD1Hards.setOpaque(true);

        lblD2Softs.setBackground(new java.awt.Color(113, 132, 137));
        lblD2Softs.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblD2Softs.setForeground(new java.awt.Color(255, 255, 255));
        lblD2Softs.setText(" ");
        lblD2Softs.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblD2Softs.setOpaque(true);

        lblD2Meds.setBackground(new java.awt.Color(113, 132, 137));
        lblD2Meds.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblD2Meds.setForeground(new java.awt.Color(255, 255, 255));
        lblD2Meds.setText(" ");
        lblD2Meds.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblD2Meds.setOpaque(true);

        lblD2Hards.setBackground(new java.awt.Color(113, 132, 137));
        lblD2Hards.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblD2Hards.setForeground(new java.awt.Color(255, 255, 255));
        lblD2Hards.setText(" ");
        lblD2Hards.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblD2Hards.setOpaque(true);

        imgD1P1.setBackground(new java.awt.Color(113, 132, 137));
        imgD1P1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1P1.setText(" ");
        imgD1P1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD1P1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD1P1.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD1P1.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD1P1.setOpaque(true);
        imgD1P1.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD1P1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD1P1MouseClicked(evt);
            }
        });

        imgD1P2.setBackground(new java.awt.Color(113, 132, 137));
        imgD1P2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1P2.setText(" ");
        imgD1P2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD1P2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD1P2.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD1P2.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD1P2.setOpaque(true);
        imgD1P2.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD1P2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD1P2MouseClicked(evt);
            }
        });

        imgD1P3.setBackground(new java.awt.Color(113, 132, 137));
        imgD1P3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1P3.setText(" ");
        imgD1P3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD1P3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD1P3.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD1P3.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD1P3.setOpaque(true);
        imgD1P3.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD1P3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD1P3MouseClicked(evt);
            }
        });

        imgD1P4.setBackground(new java.awt.Color(113, 132, 137));
        imgD1P4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1P4.setText(" ");
        imgD1P4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD1P4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD1P4.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD1P4.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD1P4.setOpaque(true);
        imgD1P4.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD1P4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD1P4MouseClicked(evt);
            }
        });

        imgD1P5.setBackground(new java.awt.Color(113, 132, 137));
        imgD1P5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1P5.setText(" ");
        imgD1P5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD1P5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD1P5.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD1P5.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD1P5.setOpaque(true);
        imgD1P5.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD1P5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD1P5MouseClicked(evt);
            }
        });

        imgD1P6.setBackground(new java.awt.Color(113, 132, 137));
        imgD1P6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1P6.setText(" ");
        imgD1P6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD1P6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD1P6.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD1P6.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD1P6.setOpaque(true);
        imgD1P6.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD1P6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD1P6MouseClicked(evt);
            }
        });

        imgD1Q1.setBackground(new java.awt.Color(113, 132, 137));
        imgD1Q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1Q1.setText(" ");
        imgD1Q1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD1Q1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD1Q1.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD1Q1.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD1Q1.setOpaque(true);
        imgD1Q1.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD1Q1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD1Q1MouseClicked(evt);
            }
        });

        imgD1Q2.setBackground(new java.awt.Color(113, 132, 137));
        imgD1Q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1Q2.setText(" ");
        imgD1Q2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD1Q2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD1Q2.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD1Q2.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD1Q2.setOpaque(true);
        imgD1Q2.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD1Q2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD1Q2MouseClicked(evt);
            }
        });

        imgD1Q3.setBackground(new java.awt.Color(113, 132, 137));
        imgD1Q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1Q3.setText(" ");
        imgD1Q3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD1Q3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD1Q3.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD1Q3.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD1Q3.setOpaque(true);
        imgD1Q3.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD1Q3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD1Q3MouseClicked(evt);
            }
        });

        imgD1Q4.setBackground(new java.awt.Color(113, 132, 137));
        imgD1Q4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1Q4.setText(" ");
        imgD1Q4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD1Q4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD1Q4.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD1Q4.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD1Q4.setOpaque(true);
        imgD1Q4.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD1Q4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD1Q4MouseClicked(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("P");
        jLabel35.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel35.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel35.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel36.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Q");
        jLabel36.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel36.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel36.setPreferredSize(new java.awt.Dimension(40, 40));

        imgD1R1.setBackground(new java.awt.Color(88, 103, 107));
        imgD1R1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1R1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre1.png"))); // NOI18N
        imgD1R1.setText(" ");
        imgD1R1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD1R1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD1R1.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD1R1.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD1R1.setOpaque(true);
        imgD1R1.setPreferredSize(new java.awt.Dimension(40, 40));

        imgD1R2.setBackground(new java.awt.Color(88, 103, 107));
        imgD1R2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1R2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre2.png"))); // NOI18N
        imgD1R2.setText(" ");
        imgD1R2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD1R2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD1R2.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD1R2.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD1R2.setOpaque(true);
        imgD1R2.setPreferredSize(new java.awt.Dimension(40, 40));

        imgD1R3.setBackground(new java.awt.Color(88, 103, 107));
        imgD1R3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1R3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre3.png"))); // NOI18N
        imgD1R3.setText(" ");
        imgD1R3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD1R3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD1R3.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD1R3.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD1R3.setOpaque(true);
        imgD1R3.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel40.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("R");
        jLabel40.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel40.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel40.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel41.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("P");
        jLabel41.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel41.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel41.setPreferredSize(new java.awt.Dimension(40, 40));

        imgD2P1.setBackground(new java.awt.Color(113, 132, 137));
        imgD2P1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2P1.setText(" ");
        imgD2P1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD2P1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD2P1.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD2P1.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD2P1.setOpaque(true);
        imgD2P1.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD2P1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD2P1MouseClicked(evt);
            }
        });

        imgD2P2.setBackground(new java.awt.Color(113, 132, 137));
        imgD2P2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2P2.setText(" ");
        imgD2P2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD2P2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD2P2.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD2P2.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD2P2.setOpaque(true);
        imgD2P2.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD2P2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD2P2MouseClicked(evt);
            }
        });

        imgD2P3.setBackground(new java.awt.Color(113, 132, 137));
        imgD2P3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2P3.setText(" ");
        imgD2P3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD2P3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD2P3.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD2P3.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD2P3.setOpaque(true);
        imgD2P3.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD2P3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD2P3MouseClicked(evt);
            }
        });

        imgD2P4.setBackground(new java.awt.Color(113, 132, 137));
        imgD2P4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2P4.setText(" ");
        imgD2P4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD2P4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD2P4.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD2P4.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD2P4.setOpaque(true);
        imgD2P4.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD2P4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD2P4MouseClicked(evt);
            }
        });

        imgD2P5.setBackground(new java.awt.Color(113, 132, 137));
        imgD2P5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2P5.setText(" ");
        imgD2P5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD2P5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD2P5.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD2P5.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD2P5.setOpaque(true);
        imgD2P5.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD2P5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD2P5MouseClicked(evt);
            }
        });

        imgD2P6.setBackground(new java.awt.Color(113, 132, 137));
        imgD2P6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2P6.setText(" ");
        imgD2P6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD2P6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD2P6.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD2P6.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD2P6.setOpaque(true);
        imgD2P6.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD2P6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD2P6MouseClicked(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Q");
        jLabel47.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel47.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel47.setPreferredSize(new java.awt.Dimension(40, 40));

        imgD2Q1.setBackground(new java.awt.Color(113, 132, 137));
        imgD2Q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2Q1.setText(" ");
        imgD2Q1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD2Q1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD2Q1.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD2Q1.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD2Q1.setOpaque(true);
        imgD2Q1.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD2Q1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD2Q1MouseClicked(evt);
            }
        });

        imgD2Q2.setBackground(new java.awt.Color(113, 132, 137));
        imgD2Q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2Q2.setText(" ");
        imgD2Q2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD2Q2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD2Q2.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD2Q2.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD2Q2.setOpaque(true);
        imgD2Q2.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD2Q2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD2Q2MouseClicked(evt);
            }
        });

        imgD2Q3.setBackground(new java.awt.Color(113, 132, 137));
        imgD2Q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2Q3.setText(" ");
        imgD2Q3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD2Q3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD2Q3.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD2Q3.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD2Q3.setOpaque(true);
        imgD2Q3.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD2Q3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD2Q3MouseClicked(evt);
            }
        });

        imgD2Q4.setBackground(new java.awt.Color(113, 132, 137));
        imgD2Q4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2Q4.setText(" ");
        imgD2Q4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD2Q4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD2Q4.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD2Q4.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD2Q4.setOpaque(true);
        imgD2Q4.setPreferredSize(new java.awt.Dimension(40, 40));
        imgD2Q4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgD2Q4MouseClicked(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("R");
        jLabel52.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel52.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel52.setPreferredSize(new java.awt.Dimension(40, 40));

        imgD2R1.setBackground(new java.awt.Color(88, 103, 107));
        imgD2R1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2R1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre1.png"))); // NOI18N
        imgD2R1.setText(" ");
        imgD2R1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD2R1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD2R1.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD2R1.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD2R1.setOpaque(true);
        imgD2R1.setPreferredSize(new java.awt.Dimension(40, 40));

        imgD2R2.setBackground(new java.awt.Color(88, 103, 107));
        imgD2R2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2R2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre2.png"))); // NOI18N
        imgD2R2.setText(" ");
        imgD2R2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD2R2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD2R2.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD2R2.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD2R2.setOpaque(true);
        imgD2R2.setPreferredSize(new java.awt.Dimension(40, 40));

        imgD2R3.setBackground(new java.awt.Color(88, 103, 107));
        imgD2R3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2R3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre3.png"))); // NOI18N
        imgD2R3.setText(" ");
        imgD2R3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        imgD2R3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgD2R3.setMaximumSize(new java.awt.Dimension(40, 40));
        imgD2R3.setMinimumSize(new java.awt.Dimension(40, 40));
        imgD2R3.setOpaque(true);
        imgD2R3.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTyreAllocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblD2Softs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(lblPraDriver2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblD2Hards, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblD2Meds, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD2P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD2P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD2P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD2P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD2P5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD2P6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD2Q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD2Q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD2Q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD2Q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(imgD2R1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD2R2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD2R3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(lblPraDriver1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblD1Meds, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblD1Softs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblD1Hards, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1P5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1P6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1Q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1Q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1Q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1Q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(imgD1R1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1R2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1R3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTyreAllocation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblD1Softs))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblPraDriver1)
                            .addComponent(lblD1Meds))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblD1Hards)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(imgD1P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD1P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD1P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD1P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD1P5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD1P6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(imgD1Q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD1Q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD1Q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD1Q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(imgD1R1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD1R2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD1R3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(19, 19, 19)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(imgD2P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD2P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD2P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD2P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD2P5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD2P6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(imgD2Q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD2Q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD2Q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD2Q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(imgD2R1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD2R2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imgD2R3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblD2Softs))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblPraDriver2)
                            .addComponent(lblD2Meds))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblD2Hards))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel12);

        jPanel13.setOpaque(false);

        jLabel19.setBackground(new java.awt.Color(113, 132, 137));
        jLabel19.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Practice Programmes");
        jLabel19.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel19.setOpaque(true);

        lblProgD1.setBackground(new java.awt.Color(113, 132, 137));
        lblProgD1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblProgD1.setForeground(new java.awt.Color(255, 255, 255));
        lblProgD1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgD1.setText(" ");
        lblProgD1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblProgD1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblProgD1.setOpaque(true);

        lblProgD2.setBackground(new java.awt.Color(113, 132, 137));
        lblProgD2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblProgD2.setForeground(new java.awt.Color(255, 255, 255));
        lblProgD2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgD2.setText(" ");
        lblProgD2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblProgD2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblProgD2.setOpaque(true);

        jLabel22.setBackground(new java.awt.Color(113, 132, 137));
        jLabel22.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Setup");
        jLabel22.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel22.setOpaque(true);

        jLabel23.setBackground(new java.awt.Color(113, 132, 137));
        jLabel23.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Research");
        jLabel23.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel23.setOpaque(true);

        jLabel24.setBackground(new java.awt.Color(113, 132, 137));
        jLabel24.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Development");
        jLabel24.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel24.setOpaque(true);

        jLabel25.setBackground(new java.awt.Color(113, 132, 137));
        jLabel25.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Qualifying");
        jLabel25.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel25.setOpaque(true);

        jLabel56.setBackground(new java.awt.Color(113, 132, 137));
        jLabel56.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Race Strategy");
        jLabel56.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel56.setOpaque(true);

        btnDecD1Set.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecD1Set.setForeground(new java.awt.Color(255, 255, 255));
        btnDecD1Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDecD1Set.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecD1Set.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecD1SetMouseClicked(evt);
            }
        });

        lblPraD1Set.setBackground(new java.awt.Color(113, 132, 137));
        lblPraD1Set.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblPraD1Set.setForeground(new java.awt.Color(255, 255, 255));
        lblPraD1Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPraD1Set.setText(" ");
        lblPraD1Set.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblPraD1Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPraD1Set.setOpaque(true);

        btnIncD1Set.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncD1Set.setForeground(new java.awt.Color(255, 255, 255));
        btnIncD1Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIncD1Set.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncD1Set.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncD1SetMouseClicked(evt);
            }
        });

        btnDecD1Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecD1Res.setForeground(new java.awt.Color(255, 255, 255));
        btnDecD1Res.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDecD1Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecD1Res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecD1ResMouseClicked(evt);
            }
        });

        lblPraD1Res.setBackground(new java.awt.Color(113, 132, 137));
        lblPraD1Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblPraD1Res.setForeground(new java.awt.Color(255, 255, 255));
        lblPraD1Res.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPraD1Res.setText(" ");
        lblPraD1Res.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblPraD1Res.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPraD1Res.setOpaque(true);

        btnIncD1Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncD1Res.setForeground(new java.awt.Color(255, 255, 255));
        btnIncD1Res.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIncD1Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncD1Res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncD1ResMouseClicked(evt);
            }
        });

        btnDecD1Dev.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecD1Dev.setForeground(new java.awt.Color(255, 255, 255));
        btnDecD1Dev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDecD1Dev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecD1Dev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecD1DevMouseClicked(evt);
            }
        });

        lblPraD1Dev.setBackground(new java.awt.Color(113, 132, 137));
        lblPraD1Dev.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblPraD1Dev.setForeground(new java.awt.Color(255, 255, 255));
        lblPraD1Dev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPraD1Dev.setText(" ");
        lblPraD1Dev.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblPraD1Dev.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPraD1Dev.setOpaque(true);

        btnIncD1Dev.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncD1Dev.setForeground(new java.awt.Color(255, 255, 255));
        btnIncD1Dev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIncD1Dev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncD1Dev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncD1DevMouseClicked(evt);
            }
        });

        btnDecD1Qua.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecD1Qua.setForeground(new java.awt.Color(255, 255, 255));
        btnDecD1Qua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDecD1Qua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecD1Qua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecD1QuaMouseClicked(evt);
            }
        });

        lblPraD1Qua.setBackground(new java.awt.Color(113, 132, 137));
        lblPraD1Qua.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblPraD1Qua.setForeground(new java.awt.Color(255, 255, 255));
        lblPraD1Qua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPraD1Qua.setText(" ");
        lblPraD1Qua.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblPraD1Qua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPraD1Qua.setOpaque(true);

        btnIncD1Qua.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncD1Qua.setForeground(new java.awt.Color(255, 255, 255));
        btnIncD1Qua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIncD1Qua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncD1Qua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncD1QuaMouseClicked(evt);
            }
        });

        btnDecD1Str.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecD1Str.setForeground(new java.awt.Color(255, 255, 255));
        btnDecD1Str.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDecD1Str.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecD1Str.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecD1StrMouseClicked(evt);
            }
        });

        lblPraD1Str.setBackground(new java.awt.Color(113, 132, 137));
        lblPraD1Str.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblPraD1Str.setForeground(new java.awt.Color(255, 255, 255));
        lblPraD1Str.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPraD1Str.setText(" ");
        lblPraD1Str.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblPraD1Str.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPraD1Str.setOpaque(true);

        btnIncD1Str.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncD1Str.setForeground(new java.awt.Color(255, 255, 255));
        btnIncD1Str.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIncD1Str.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncD1Str.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncD1StrMouseClicked(evt);
            }
        });

        btnDecD2Set.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecD2Set.setForeground(new java.awt.Color(255, 255, 255));
        btnDecD2Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDecD2Set.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecD2Set.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecD2SetMouseClicked(evt);
            }
        });

        lblPraD2Set.setBackground(new java.awt.Color(113, 132, 137));
        lblPraD2Set.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblPraD2Set.setForeground(new java.awt.Color(255, 255, 255));
        lblPraD2Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPraD2Set.setText(" ");
        lblPraD2Set.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblPraD2Set.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPraD2Set.setOpaque(true);

        btnIncD2Set.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncD2Set.setForeground(new java.awt.Color(255, 255, 255));
        btnIncD2Set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIncD2Set.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncD2Set.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncD2SetMouseClicked(evt);
            }
        });

        btnDecD2Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecD2Res.setForeground(new java.awt.Color(255, 255, 255));
        btnDecD2Res.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDecD2Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecD2Res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecD2ResMouseClicked(evt);
            }
        });

        lblPraD2Res.setBackground(new java.awt.Color(113, 132, 137));
        lblPraD2Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblPraD2Res.setForeground(new java.awt.Color(255, 255, 255));
        lblPraD2Res.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPraD2Res.setText(" ");
        lblPraD2Res.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblPraD2Res.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPraD2Res.setOpaque(true);

        btnIncD2Res.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncD2Res.setForeground(new java.awt.Color(255, 255, 255));
        btnIncD2Res.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIncD2Res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncD2Res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncD2ResMouseClicked(evt);
            }
        });

        btnDecD2Dev.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecD2Dev.setForeground(new java.awt.Color(255, 255, 255));
        btnDecD2Dev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDecD2Dev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecD2Dev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecD2DevMouseClicked(evt);
            }
        });

        lblPraD2Dev.setBackground(new java.awt.Color(113, 132, 137));
        lblPraD2Dev.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblPraD2Dev.setForeground(new java.awt.Color(255, 255, 255));
        lblPraD2Dev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPraD2Dev.setText(" ");
        lblPraD2Dev.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblPraD2Dev.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPraD2Dev.setOpaque(true);

        btnIncD2Dev.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncD2Dev.setForeground(new java.awt.Color(255, 255, 255));
        btnIncD2Dev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIncD2Dev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncD2Dev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncD2DevMouseClicked(evt);
            }
        });

        btnDecD2Qua.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecD2Qua.setForeground(new java.awt.Color(255, 255, 255));
        btnDecD2Qua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDecD2Qua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecD2Qua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecD2QuaMouseClicked(evt);
            }
        });

        lblPraD2Qua.setBackground(new java.awt.Color(113, 132, 137));
        lblPraD2Qua.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblPraD2Qua.setForeground(new java.awt.Color(255, 255, 255));
        lblPraD2Qua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPraD2Qua.setText(" ");
        lblPraD2Qua.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblPraD2Qua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPraD2Qua.setOpaque(true);

        btnIncD2Qua.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncD2Qua.setForeground(new java.awt.Color(255, 255, 255));
        btnIncD2Qua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIncD2Qua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncD2Qua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncD2QuaMouseClicked(evt);
            }
        });

        btnDecD2Str.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecD2Str.setForeground(new java.awt.Color(255, 255, 255));
        btnDecD2Str.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDecD2Str.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecD2Str.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecD2StrMouseClicked(evt);
            }
        });

        lblPraD2Str.setBackground(new java.awt.Color(113, 132, 137));
        lblPraD2Str.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblPraD2Str.setForeground(new java.awt.Color(255, 255, 255));
        lblPraD2Str.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPraD2Str.setText(" ");
        lblPraD2Str.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblPraD2Str.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPraD2Str.setOpaque(true);

        btnIncD2Str.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncD2Str.setForeground(new java.awt.Color(255, 255, 255));
        btnIncD2Str.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIncD2Str.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncD2Str.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncD2StrMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDecD1Res)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblPraD1Res, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnIncD1Res)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDecD2Res)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblPraD2Res, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnIncD2Res))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDecD1Dev)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblPraD1Dev, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnIncD1Dev)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDecD2Dev)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblPraD2Dev, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnIncD2Dev))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDecD1Qua)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblPraD1Qua, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnIncD1Qua)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDecD2Qua)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblPraD2Qua, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnIncD2Qua))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDecD1Str)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblPraD1Str, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnIncD1Str)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDecD2Str)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblPraD2Str, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnIncD2Str))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDecD1Set)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblPraD1Set, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnIncD1Set)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDecD2Set)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblPraD2Set, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnIncD2Set)))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addGap(186, 186, 186)
                            .addComponent(lblProgD1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblProgD2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProgD2)
                    .addComponent(lblProgD1))
                .addGap(22, 22, 22)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnDecD1Set)
                                            .addComponent(jLabel22)
                                            .addComponent(lblPraD1Set)
                                            .addComponent(btnIncD1Set)
                                            .addComponent(btnDecD2Set)
                                            .addComponent(lblPraD2Set)
                                            .addComponent(btnIncD2Set))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnIncD2Res, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnDecD2Res)
                                                    .addComponent(lblPraD2Res)))
                                            .addComponent(btnIncD1Res)
                                            .addComponent(jLabel23)))
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnDecD1Res)
                                        .addComponent(lblPraD1Res)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24))
                            .addComponent(btnIncD1Dev)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnDecD1Dev)
                                .addComponent(lblPraD1Dev))
                            .addComponent(btnIncD2Dev)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnDecD2Dev)
                                .addComponent(lblPraD2Dev)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(btnIncD2Qua, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnDecD2Qua)
                                .addComponent(lblPraD2Qua))))
                    .addComponent(btnIncD1Qua)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnDecD1Qua)
                        .addComponent(lblPraD1Qua)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel56)
                    .addComponent(btnIncD1Str)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnDecD1Str)
                        .addComponent(lblPraD1Str))
                    .addComponent(btnIncD2Str)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnDecD2Str)
                        .addComponent(lblPraD2Str)))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel13);

        jTabbedPane1.addTab("Practice", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDevFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevFinishMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstDev == 10) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstDev = 0;
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstDevDone = true;
        }
        updateScreenData();
    }//GEN-LAST:event_btnDevFinishMouseClicked

    private void btnResFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResFinishMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstRes == 10) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstRes = 0;
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstResDone = true;
        }
        updateScreenData();
    }//GEN-LAST:event_btnResFinishMouseClicked

    private void btnDecMilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecMilesMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().testMiles > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().testMiles -= 10;
        }
        updateScreenData();
    }//GEN-LAST:event_btnDecMilesMouseClicked

    private void btnIncMilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncMilesMouseClicked
        grandprixworld.gui.FullGame.data.findPlayerTeam().testMiles += 10;
        updateScreenData();
    }//GEN-LAST:event_btnIncMilesMouseClicked

    private void btnTstDecMechDevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecMechDevMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechDev > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechDev--;
            grandprixworld.gui.FullGame.data.findPlayerTeam().mechAvail++;
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstStaffUsed--;
        }
        updateScreenData();
    }//GEN-LAST:event_btnTstDecMechDevMouseClicked

    private void btnTstDecMechResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecMechResMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechRes > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechRes--;
            grandprixworld.gui.FullGame.data.findPlayerTeam().mechAvail++;
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstStaffUsed--;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstDecMechResMouseClicked

    private void btnTstDecMechEngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecMechEngMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechEng > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechEng--;
            grandprixworld.gui.FullGame.data.findPlayerTeam().mechAvail++;
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstStaffUsed--;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstDecMechEngMouseClicked

    private void btnTstDecMechTyreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecMechTyreMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechTyre > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechTyre--;
            grandprixworld.gui.FullGame.data.findPlayerTeam().mechAvail++;
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstStaffUsed--;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstDecMechTyreMouseClicked

    private void btnTstDecMechFuelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecMechFuelMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechFuel > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechFuel--;
            grandprixworld.gui.FullGame.data.findPlayerTeam().mechAvail++;
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstStaffUsed--;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstDecMechFuelMouseClicked

    private void btnTstIncMechDevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncMechDevMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().mechAvail > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechDev++;
            grandprixworld.gui.FullGame.data.findPlayerTeam().mechAvail--;
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstStaffUsed++;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncMechDevMouseClicked

    private void btnTstIncMechResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncMechResMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().mechAvail > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechRes++;
            grandprixworld.gui.FullGame.data.findPlayerTeam().mechAvail--;
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstStaffUsed++;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncMechResMouseClicked

    private void btnTstIncMechEngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncMechEngMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().mechAvail > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechEng++;
            grandprixworld.gui.FullGame.data.findPlayerTeam().mechAvail--;
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstStaffUsed++;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncMechEngMouseClicked

    private void btnTstIncMechTyreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncMechTyreMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().mechAvail > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechTyre++;
            grandprixworld.gui.FullGame.data.findPlayerTeam().mechAvail--;
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstStaffUsed++;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncMechTyreMouseClicked

    private void btnTstIncMechFuelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncMechFuelMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().mechAvail > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstMechFuel++;
            grandprixworld.gui.FullGame.data.findPlayerTeam().mechAvail--;
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstStaffUsed++;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncMechFuelMouseClicked

    private void btnTstDecD1DevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecD1DevMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Dev > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Dev -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstDecD1DevMouseClicked

    private void btnTstDecD1ResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecD1ResMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Res > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Res -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstDecD1ResMouseClicked

    private void btnTstDecD1EngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecD1EngMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Eng > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Eng -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstDecD1EngMouseClicked

    private void btnTstDecD1TyreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecD1TyreMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Tyre > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Tyre -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstDecD1TyreMouseClicked

    private void btnTstDecD1FuelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecD1FuelMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Fuel > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Fuel -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstDecD1FuelMouseClicked

    private void btnTstIncD1DevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncD1DevMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverTestEffort(1) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Dev += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncD1DevMouseClicked

    private void btnTstIncD1ResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncD1ResMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverTestEffort(1) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Res += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncD1ResMouseClicked

    private void btnTstIncD1EngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncD1EngMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverTestEffort(1) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Eng += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncD1EngMouseClicked

    private void btnTstIncD1TyreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncD1TyreMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverTestEffort(1) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Tyre += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncD1TyreMouseClicked

    private void btnTstIncD1FuelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncD1FuelMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverTestEffort(1) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD1Fuel += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncD1FuelMouseClicked

    private void btnTstDecD2DevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecD2DevMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Dev > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Dev -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstDecD2DevMouseClicked

    private void btnTstDecD2ResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecD2ResMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Res > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Res -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstDecD2ResMouseClicked

    private void btnTstDecD2EngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecD2EngMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Eng > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Eng -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstDecD2EngMouseClicked

    private void btnTstDecD2TyreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecD2TyreMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Tyre > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Tyre -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstDecD2TyreMouseClicked

    private void btnTstDecD2FuelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecD2FuelMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Fuel > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Fuel -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstDecD2FuelMouseClicked

    private void btnTstIncD2DevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncD2DevMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverTestEffort(2) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Dev += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncD2DevMouseClicked

    private void btnTstIncD2ResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncD2ResMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverTestEffort(2) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Res += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncD2ResMouseClicked

    private void btnTstIncD2EngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncD2EngMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverTestEffort(2) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Eng += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncD2EngMouseClicked

    private void btnTstIncD2TyreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncD2TyreMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverTestEffort(2) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Tyre += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncD2TyreMouseClicked

    private void btnTstIncD2FuelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncD2FuelMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverTestEffort(2) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstD2Fuel += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncD2FuelMouseClicked

    private void btnTstDecRDDevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecRDDevMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDDev > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDDev -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstDecRDDevMouseClicked

    private void btnTstDecRDResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecRDResMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDRes > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDRes -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstDecRDResMouseClicked

    private void btnTstDecRDEngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecRDEngMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDEng > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDEng -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstDecRDEngMouseClicked

    private void btnTstDecRDTyreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecRDTyreMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDTyre > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDTyre -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstDecRDTyreMouseClicked

    private void btnTstDecRDFuelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstDecRDFuelMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDFuel > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDDev -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstDecRDFuelMouseClicked

    private void btnTstIncRDDevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncRDDevMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverTestEffort(3) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDDev += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncRDDevMouseClicked

    private void btnTstIncRDResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncRDResMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverTestEffort(3) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDRes += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncRDResMouseClicked

    private void btnTstIncRDEngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncRDEngMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverTestEffort(3) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDEng += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncRDEngMouseClicked

    private void btnTstIncRDTyreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncRDTyreMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverTestEffort(3) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDTyre += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncRDTyreMouseClicked

    private void btnTstIncRDFuelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTstIncRDFuelMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverTestEffort(3) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().tstRDFuel += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTstIncRDFuelMouseClicked

    private void imgD1P1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD1P1MouseClicked
        switch (FullGame.data.findPlayerTeam().d1tyres[0]) {
            case 1:
                FullGame.data.findPlayerTeam().d1tyres[0] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d1tyres[0] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d1tyres[0] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD1P1MouseClicked

    private void imgD1P2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD1P2MouseClicked
        switch (FullGame.data.findPlayerTeam().d1tyres[1]) {
            case 1:
                FullGame.data.findPlayerTeam().d1tyres[1] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d1tyres[1] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d1tyres[1] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD1P2MouseClicked

    private void imgD1P3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD1P3MouseClicked
        switch (FullGame.data.findPlayerTeam().d1tyres[2]) {
            case 1:
                FullGame.data.findPlayerTeam().d1tyres[2] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d1tyres[2] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d1tyres[2] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD1P3MouseClicked

    private void imgD1P4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD1P4MouseClicked
        switch (FullGame.data.findPlayerTeam().d1tyres[3]) {
            case 1:
                FullGame.data.findPlayerTeam().d1tyres[3] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d1tyres[3] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d1tyres[3] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD1P4MouseClicked

    private void imgD1P5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD1P5MouseClicked
        switch (FullGame.data.findPlayerTeam().d1tyres[4]) {
            case 1:
                FullGame.data.findPlayerTeam().d1tyres[4] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d1tyres[4] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d1tyres[4] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD1P5MouseClicked

    private void imgD1P6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD1P6MouseClicked
        switch (FullGame.data.findPlayerTeam().d1tyres[5]) {
            case 1:
                FullGame.data.findPlayerTeam().d1tyres[5] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d1tyres[5] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d1tyres[5] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD1P6MouseClicked

    private void imgD1Q1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD1Q1MouseClicked
        switch (FullGame.data.findPlayerTeam().d1tyres[6]) {
            case 1:
                FullGame.data.findPlayerTeam().d1tyres[6] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d1tyres[6] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d1tyres[6] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD1Q1MouseClicked

    private void imgD1Q2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD1Q2MouseClicked
        switch (FullGame.data.findPlayerTeam().d1tyres[7]) {
            case 1:
                FullGame.data.findPlayerTeam().d1tyres[7] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d1tyres[7] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d1tyres[7] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD1Q2MouseClicked

    private void imgD1Q3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD1Q3MouseClicked
        switch (FullGame.data.findPlayerTeam().d1tyres[8]) {
            case 1:
                FullGame.data.findPlayerTeam().d1tyres[8] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d1tyres[8] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d1tyres[8] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD1Q3MouseClicked

    private void imgD1Q4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD1Q4MouseClicked
        switch (FullGame.data.findPlayerTeam().d1tyres[9]) {
            case 1:
                FullGame.data.findPlayerTeam().d1tyres[9] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d1tyres[9] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d1tyres[9] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD1Q4MouseClicked

    private void imgD2P1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD2P1MouseClicked
        switch (FullGame.data.findPlayerTeam().d2tyres[0]) {
            case 1:
                FullGame.data.findPlayerTeam().d2tyres[0] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d2tyres[0] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d2tyres[0] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD2P1MouseClicked

    private void imgD2P2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD2P2MouseClicked
        switch (FullGame.data.findPlayerTeam().d2tyres[1]) {
            case 1:
                FullGame.data.findPlayerTeam().d2tyres[1] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d2tyres[1] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d2tyres[1] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD2P2MouseClicked

    private void imgD2P3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD2P3MouseClicked
        switch (FullGame.data.findPlayerTeam().d2tyres[2]) {
            case 1:
                FullGame.data.findPlayerTeam().d2tyres[2] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d2tyres[2] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d2tyres[2] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD2P3MouseClicked

    private void imgD2P4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD2P4MouseClicked
        switch (FullGame.data.findPlayerTeam().d2tyres[3]) {
            case 1:
                FullGame.data.findPlayerTeam().d2tyres[3] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d2tyres[3] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d2tyres[3] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD2P4MouseClicked

    private void imgD2P5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD2P5MouseClicked
        switch (FullGame.data.findPlayerTeam().d2tyres[4]) {
            case 1:
                FullGame.data.findPlayerTeam().d2tyres[4] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d2tyres[4] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d2tyres[4] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD2P5MouseClicked

    private void imgD2P6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD2P6MouseClicked
        switch (FullGame.data.findPlayerTeam().d2tyres[5]) {
            case 1:
                FullGame.data.findPlayerTeam().d2tyres[5] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d2tyres[5] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d2tyres[5] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD2P6MouseClicked

    private void imgD2Q1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD2Q1MouseClicked
        switch (FullGame.data.findPlayerTeam().d2tyres[6]) {
            case 1:
                FullGame.data.findPlayerTeam().d2tyres[6] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d2tyres[6] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d2tyres[6] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD2Q1MouseClicked

    private void imgD2Q2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD2Q2MouseClicked
        switch (FullGame.data.findPlayerTeam().d2tyres[7]) {
            case 1:
                FullGame.data.findPlayerTeam().d2tyres[7] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d2tyres[7] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d2tyres[7] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD2Q2MouseClicked

    private void imgD2Q3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD2Q3MouseClicked
        switch (FullGame.data.findPlayerTeam().d2tyres[8]) {
            case 1:
                FullGame.data.findPlayerTeam().d2tyres[8] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d2tyres[8] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d2tyres[8] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD2Q3MouseClicked

    private void imgD2Q4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgD2Q4MouseClicked
        switch (FullGame.data.findPlayerTeam().d2tyres[9]) {
            case 1:
                FullGame.data.findPlayerTeam().d2tyres[9] = 2;
                break;
            case 2:
                FullGame.data.findPlayerTeam().d2tyres[9] = 3;
                break;
            case 3:
                FullGame.data.findPlayerTeam().d2tyres[9] = 1;
                break;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_imgD2Q4MouseClicked

    private void btnDecD1SetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecD1SetMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Set > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Set -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecD1SetMouseClicked

    private void btnDecD1ResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecD1ResMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Res > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Res -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecD1ResMouseClicked

    private void btnDecD1DevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecD1DevMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Dev > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Dev -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecD1DevMouseClicked

    private void btnDecD1QuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecD1QuaMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Qua > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Qua -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecD1QuaMouseClicked

    private void btnDecD1StrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecD1StrMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Str > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Str -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecD1StrMouseClicked

    private void btnIncD1SetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncD1SetMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverPracticeEffort(1) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Set += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncD1SetMouseClicked

    private void btnIncD1ResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncD1ResMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverPracticeEffort(1) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Res += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncD1ResMouseClicked

    private void btnIncD1DevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncD1DevMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverPracticeEffort(1) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Dev += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncD1DevMouseClicked

    private void btnIncD1QuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncD1QuaMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverPracticeEffort(1) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Qua += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncD1QuaMouseClicked

    private void btnIncD1StrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncD1StrMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverPracticeEffort(1) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD1Str += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncD1StrMouseClicked

    private void btnDecD2SetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecD2SetMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Set > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Set -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecD2SetMouseClicked

    private void btnDecD2ResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecD2ResMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Res > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Res -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecD2ResMouseClicked

    private void btnDecD2DevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecD2DevMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Dev > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Dev -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecD2DevMouseClicked

    private void btnDecD2QuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecD2QuaMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Qua > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Qua -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecD2QuaMouseClicked

    private void btnDecD2StrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecD2StrMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Str > 0) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Str -= 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecD2StrMouseClicked

    private void btnIncD2SetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncD2SetMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverPracticeEffort(2) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Set += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncD2SetMouseClicked

    private void btnIncD2ResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncD2ResMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverPracticeEffort(2) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Res += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncD2ResMouseClicked

    private void btnIncD2DevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncD2DevMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverPracticeEffort(2) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Dev += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncD2DevMouseClicked

    private void btnIncD2QuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncD2QuaMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverPracticeEffort(2) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Qua += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncD2QuaMouseClicked

    private void btnIncD2StrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncD2StrMouseClicked
        if (grandprixworld.gui.FullGame.data.findPlayerTeam().getDriverPracticeEffort(2) < 100) {
            grandprixworld.gui.FullGame.data.findPlayerTeam().praD2Str += 10;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncD2StrMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDecD1Dev;
    private javax.swing.JLabel btnDecD1Qua;
    private javax.swing.JLabel btnDecD1Res;
    private javax.swing.JLabel btnDecD1Set;
    private javax.swing.JLabel btnDecD1Str;
    private javax.swing.JLabel btnDecD2Dev;
    private javax.swing.JLabel btnDecD2Qua;
    private javax.swing.JLabel btnDecD2Res;
    private javax.swing.JLabel btnDecD2Set;
    private javax.swing.JLabel btnDecD2Str;
    private javax.swing.JLabel btnDecMiles;
    private javax.swing.JLabel btnDevFinish;
    private javax.swing.JLabel btnIncD1Dev;
    private javax.swing.JLabel btnIncD1Qua;
    private javax.swing.JLabel btnIncD1Res;
    private javax.swing.JLabel btnIncD1Set;
    private javax.swing.JLabel btnIncD1Str;
    private javax.swing.JLabel btnIncD2Dev;
    private javax.swing.JLabel btnIncD2Qua;
    private javax.swing.JLabel btnIncD2Res;
    private javax.swing.JLabel btnIncD2Set;
    private javax.swing.JLabel btnIncD2Str;
    private javax.swing.JLabel btnIncMiles;
    private javax.swing.JLabel btnResFinish;
    private javax.swing.JLabel btnTstDecD1Dev;
    private javax.swing.JLabel btnTstDecD1Eng;
    private javax.swing.JLabel btnTstDecD1Fuel;
    private javax.swing.JLabel btnTstDecD1Res;
    private javax.swing.JLabel btnTstDecD1Tyre;
    private javax.swing.JLabel btnTstDecD2Dev;
    private javax.swing.JLabel btnTstDecD2Eng;
    private javax.swing.JLabel btnTstDecD2Fuel;
    private javax.swing.JLabel btnTstDecD2Res;
    private javax.swing.JLabel btnTstDecD2Tyre;
    private javax.swing.JLabel btnTstDecMechDev;
    private javax.swing.JLabel btnTstDecMechEng;
    private javax.swing.JLabel btnTstDecMechFuel;
    private javax.swing.JLabel btnTstDecMechRes;
    private javax.swing.JLabel btnTstDecMechTyre;
    private javax.swing.JLabel btnTstDecRDDev;
    private javax.swing.JLabel btnTstDecRDEng;
    private javax.swing.JLabel btnTstDecRDFuel;
    private javax.swing.JLabel btnTstDecRDRes;
    private javax.swing.JLabel btnTstDecRDTyre;
    private javax.swing.JLabel btnTstIncD1Dev;
    private javax.swing.JLabel btnTstIncD1Eng;
    private javax.swing.JLabel btnTstIncD1Fuel;
    private javax.swing.JLabel btnTstIncD1Res;
    private javax.swing.JLabel btnTstIncD1Tyre;
    private javax.swing.JLabel btnTstIncD2Dev;
    private javax.swing.JLabel btnTstIncD2Eng;
    private javax.swing.JLabel btnTstIncD2Fuel;
    private javax.swing.JLabel btnTstIncD2Res;
    private javax.swing.JLabel btnTstIncD2Tyre;
    private javax.swing.JLabel btnTstIncMechDev;
    private javax.swing.JLabel btnTstIncMechEng;
    private javax.swing.JLabel btnTstIncMechFuel;
    private javax.swing.JLabel btnTstIncMechRes;
    private javax.swing.JLabel btnTstIncMechTyre;
    private javax.swing.JLabel btnTstIncRDDev;
    private javax.swing.JLabel btnTstIncRDEng;
    private javax.swing.JLabel btnTstIncRDFuel;
    private javax.swing.JLabel btnTstIncRDRes;
    private javax.swing.JLabel btnTstIncRDTyre;
    private javax.swing.JLabel imgD1P1;
    private javax.swing.JLabel imgD1P2;
    private javax.swing.JLabel imgD1P3;
    private javax.swing.JLabel imgD1P4;
    private javax.swing.JLabel imgD1P5;
    private javax.swing.JLabel imgD1P6;
    private javax.swing.JLabel imgD1Q1;
    private javax.swing.JLabel imgD1Q2;
    private javax.swing.JLabel imgD1Q3;
    private javax.swing.JLabel imgD1Q4;
    private javax.swing.JLabel imgD1R1;
    private javax.swing.JLabel imgD1R2;
    private javax.swing.JLabel imgD1R3;
    private javax.swing.JLabel imgD2P1;
    private javax.swing.JLabel imgD2P2;
    private javax.swing.JLabel imgD2P3;
    private javax.swing.JLabel imgD2P4;
    private javax.swing.JLabel imgD2P5;
    private javax.swing.JLabel imgD2P6;
    private javax.swing.JLabel imgD2Q1;
    private javax.swing.JLabel imgD2Q2;
    private javax.swing.JLabel imgD2Q3;
    private javax.swing.JLabel imgD2Q4;
    private javax.swing.JLabel imgD2R1;
    private javax.swing.JLabel imgD2R2;
    private javax.swing.JLabel imgD2R3;
    private javax.swing.JLabel imgDevProg;
    private javax.swing.JLabel imgEngProg;
    private javax.swing.JLabel imgFuelProg;
    private javax.swing.JLabel imgResProg;
    private javax.swing.JLabel imgTyreProg;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCostPerMile;
    private javax.swing.JLabel lblD1Hards;
    private javax.swing.JLabel lblD1Meds;
    private javax.swing.JLabel lblD1Softs;
    private javax.swing.JLabel lblD2Hards;
    private javax.swing.JLabel lblD2Meds;
    private javax.swing.JLabel lblD2Softs;
    private javax.swing.JLabel lblPraD1Dev;
    private javax.swing.JLabel lblPraD1Qua;
    private javax.swing.JLabel lblPraD1Res;
    private javax.swing.JLabel lblPraD1Set;
    private javax.swing.JLabel lblPraD1Str;
    private javax.swing.JLabel lblPraD2Dev;
    private javax.swing.JLabel lblPraD2Qua;
    private javax.swing.JLabel lblPraD2Res;
    private javax.swing.JLabel lblPraD2Set;
    private javax.swing.JLabel lblPraD2Str;
    private javax.swing.JLabel lblPraDriver1;
    private javax.swing.JLabel lblPraDriver2;
    private javax.swing.JLabel lblPractice;
    private javax.swing.JLabel lblProgD1;
    private javax.swing.JLabel lblProgD2;
    private javax.swing.JLabel lblSumAvail;
    private javax.swing.JLabel lblSumMnt;
    private javax.swing.JLabel lblSumRep;
    private javax.swing.JLabel lblSumTst;
    private javax.swing.JLabel lblTestMiles;
    private javax.swing.JLabel lblTesting;
    private javax.swing.JLabel lblTotalCost;
    private javax.swing.JLabel lblTstAvail;
    private javax.swing.JLabel lblTstD1Dev;
    private javax.swing.JLabel lblTstD1Eng;
    private javax.swing.JLabel lblTstD1Fuel;
    private javax.swing.JLabel lblTstD1Res;
    private javax.swing.JLabel lblTstD1Tyre;
    private javax.swing.JLabel lblTstD2Dev;
    private javax.swing.JLabel lblTstD2Eng;
    private javax.swing.JLabel lblTstD2Fuel;
    private javax.swing.JLabel lblTstD2Res;
    private javax.swing.JLabel lblTstD2Tyre;
    private javax.swing.JLabel lblTstDriver1;
    private javax.swing.JLabel lblTstDriver2;
    private javax.swing.JLabel lblTstMechDev;
    private javax.swing.JLabel lblTstMechEng;
    private javax.swing.JLabel lblTstMechFuel;
    private javax.swing.JLabel lblTstMechRes;
    private javax.swing.JLabel lblTstMechTyre;
    private javax.swing.JLabel lblTstMnt;
    private javax.swing.JLabel lblTstRDDev;
    private javax.swing.JLabel lblTstRDEng;
    private javax.swing.JLabel lblTstRDFuel;
    private javax.swing.JLabel lblTstRDRes;
    private javax.swing.JLabel lblTstRDTyre;
    private javax.swing.JLabel lblTstRep;
    private javax.swing.JLabel lblTstTst;
    private javax.swing.JLabel lblTyreAllocation;
    private javax.swing.JComboBox<String> selDriverRD;
    // End of variables declaration//GEN-END:variables
}
