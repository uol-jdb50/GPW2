/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gui.engineering;

import grandprixworld.gamedata.car.ActiveSusp;
import grandprixworld.gamedata.car.AutoGears;
import grandprixworld.gamedata.car.Brakes;
import grandprixworld.gamedata.car.ChassisDev;
import grandprixworld.gamedata.car.Clutch;
import grandprixworld.gamedata.car.Gearbox;
import grandprixworld.gamedata.car.Hydraulics;
import grandprixworld.gamedata.car.PowerBrakes;
import grandprixworld.gamedata.car.Suspension;
import grandprixworld.gamedata.car.Throttle;
import grandprixworld.gamedata.car.TractionControl;
import grandprixworld.gui.FullGame;

/**
 *
 * @author Josh Brookes
 */
public class EnDesign extends javax.swing.JPanel {

    /**
     * Creates new form EnDesign
     */
    public EnDesign() {
        initComponents();
        updateScreenData();
    }

    public void updateScreenData() {
        lblSumCYAvailTitle.setText(Integer.toString(FullGame.data.currentYear) + " Chassis");
        lblSumNYAvailTitle.setText(Integer.toString(FullGame.data.currentYear + 1) + " Chassis");
        lblSumAvail.setText(Integer.toString(FullGame.data.findPlayerTeam().desAvail) + "%");
        lblSumCY.setText(Integer.toString(FullGame.data.findPlayerTeam().desCY) + "%");
        lblSumNY.setText(Integer.toString(FullGame.data.findPlayerTeam().desNY) + "%");
        lblSumTech.setText(Integer.toString(FullGame.data.findPlayerTeam().desTech) + "%");
        lblSumAids.setText(Integer.toString(FullGame.data.findPlayerTeam().desAids) + "%");

        imgSumBrakeP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().brakes.performance + ".png")));
        imgSumClutchP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().clutch.performance + ".png")));
        imgSumGearP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().gearbox.performance + ".png")));
        imgSumHydP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().hydraulics.performance + ".png")));
        imgSumSuspP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().suspension.performance + ".png")));
        imgSumThrP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().throttle.performance + ".png")));
        imgSumBrakeR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().brakes.reliability + ".png")));
        imgSumClutchR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().clutch.reliability + ".png")));
        imgSumGearR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().gearbox.reliability + ".png")));
        imgSumHydR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().hydraulics.reliability + ".png")));
        imgSumSuspR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().suspension.reliability + ".png")));
        imgSumThrR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().throttle.reliability + ".png")));

        lblSumCYTitle.setText(Integer.toString(FullGame.data.currentYear) + " Chassis");
        lblSumCYName.setText(FullGame.data.findPlayerTeam().currentYearChassis.name);
        lblSumCYHandling.setText("?");
        lblSumCYProj.setText("None");

        lblSumNYTitle.setText(Integer.toString(FullGame.data.currentYear + 1) + " Chassis");
        lblSumNYName.setText("Unknown");
        lblSumNYStage.setText("Not Started");
        lblSumNYEff.setText("0%");

        imgSumASLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().activesusp.level + ".png")));
        imgSumAGLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().autogears.level + ".png")));
        imgSumPBLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().powerbrakes.level + ".png")));
        imgSumTCLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().tractioncontrol.level + ".png")));
        lblSumASLegal.setText("Yes");
        lblSumAGLegal.setText("Yes");
        lblSumPBLegal.setText("Yes");
        lblSumTCLegal.setText("Yes");

        lblCYCYTitle.setText(Integer.toString(FullGame.data.currentYear) + " Chassis");
        lblCYNYTitle.setText(Integer.toString(FullGame.data.currentYear + 1) + " Chassis");
        lblCYAvail.setText(Integer.toString(FullGame.data.findPlayerTeam().desAvail) + "%");
        lblCYCY.setText(Integer.toString(FullGame.data.findPlayerTeam().desCY) + "%");
        lblCYNY.setText(Integer.toString(FullGame.data.findPlayerTeam().desNY) + "%");
        lblCYTech.setText(Integer.toString(FullGame.data.findPlayerTeam().desTech) + "%");
        lblCYAids.setText(Integer.toString(FullGame.data.findPlayerTeam().desAids) + "%");

        imgCYTesting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().tstRes + ".png")));
        lblCYHandling.setText("?");
        lblCYProblem.setText("Unknown");
        lblCYSolution.setText("Unknown");

        lblCYDesign.setText("0%");
        lblCYCFD.setText("0%");
        lblCYModel.setText("0%");
        lblCYWind.setText("0%");
        switch (FullGame.data.findPlayerTeam().cyStage) {
            case 1:
                lblCYDesign.setText(Integer.toString(FullGame.data.findPlayerTeam().desCY) + "%");
                break;
            case 2:
                lblCYCFD.setText(Integer.toString(FullGame.data.findPlayerTeam().desCY) + "%");
                break;
            case 3:
                lblCYModel.setText(Integer.toString(FullGame.data.findPlayerTeam().desCY) + "%");
                break;
            case 4:
                lblCYWind.setText(Integer.toString(FullGame.data.findPlayerTeam().desCY) + "%");
                break;
        }
        imgCYCAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().factory.cad + ".png")));
        imgCYSupercomp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().factory.supercomputer + ".png")));
        imgCYCAM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().factory.cam + ".png")));
        imgCYTunnel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().factory.windTunnel + ".png")));
        if (FullGame.data.findPlayerTeam().currentDevCY != null) {
            imgCYDesignProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().currentDevCY.designProg + ".png")));
            imgCYCFDProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().currentDevCY.cfdProg + ".png")));
            imgCYModelProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().currentDevCY.modelProg + ".png")));
            imgCYWindProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().currentDevCY.windProg + ".png")));
        } else {
            imgCYDesignProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability0.png")));
            imgCYCFDProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability0.png")));
            imgCYModelProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability0.png")));
            imgCYWindProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability0.png")));
        }
        lblNYCYTitle.setText(Integer.toString(FullGame.data.currentYear) + " Chassis");
        lblNYNYTitle.setText(Integer.toString(FullGame.data.currentYear + 1) + " Chassis");
        lblNYAvail.setText(Integer.toString(FullGame.data.findPlayerTeam().desAvail) + "%");
        lblNYCY.setText(Integer.toString(FullGame.data.findPlayerTeam().desCY) + "%");
        lblNYNY.setText(Integer.toString(FullGame.data.findPlayerTeam().desNY) + "%");
        lblNYTech.setText(Integer.toString(FullGame.data.findPlayerTeam().desTech) + "%");
        lblNYAids.setText(Integer.toString(FullGame.data.findPlayerTeam().desAids) + "%");
        lblNYDes.setText("0%");
        lblNYCFD.setText("0%");
        lblNYModel.setText("0%");
        lblNYWind.setText("0%");
        switch (FullGame.data.findPlayerTeam().nyStage) {
            case 1:
                lblNYDes.setText(Integer.toString(FullGame.data.findPlayerTeam().desNY) + "%");
                break;
            case 2:
                lblNYCFD.setText(Integer.toString(FullGame.data.findPlayerTeam().desNY) + "%");
                break;
            case 3:
                lblNYModel.setText(Integer.toString(FullGame.data.findPlayerTeam().desNY) + "%");
                break;
            case 4:
                lblNYWind.setText(Integer.toString(FullGame.data.findPlayerTeam().desNY) + "%");
                break;
        }
        imgNYCAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().factory.cad + ".png")));
        imgNYSupercomputer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().factory.supercomputer + ".png")));
        imgNYCAM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().factory.cam + ".png")));
        imgNYTunnel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().factory.windTunnel + ".png")));
        if (FullGame.data.findPlayerTeam().currentDevNY != null) {
            imgNYDesProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().currentDevNY.designProg + ".png")));
            imgNYCFDProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().currentDevNY.cfdProg + ".png")));
            imgNYModelProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().currentDevNY.modelProg + ".png")));
            imgNYWindProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().currentDevNY.windProg + ".png")));
        } else {
            imgNYDesProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability0.png")));
            imgNYCFDProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability0.png")));
            imgNYModelProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability0.png")));
            imgNYWindProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability0.png")));
        }
        lblTechCYTitle.setText(Integer.toString(FullGame.data.currentYear) + " Chassis");
        lblTechNYTitle.setText(Integer.toString(FullGame.data.currentYear + 1) + " Chassis");
        lblTechAvail.setText(Integer.toString(FullGame.data.findPlayerTeam().desAvail) + "%");
        lblTechCY.setText(Integer.toString(FullGame.data.findPlayerTeam().desCY) + "%");
        lblTechNY.setText(Integer.toString(FullGame.data.findPlayerTeam().desNY) + "%");
        lblTechTech.setText(Integer.toString(FullGame.data.findPlayerTeam().desTech) + "%");
        lblTechAids.setText(Integer.toString(FullGame.data.findPlayerTeam().desAids) + "%");
        lblBrake.setText("0%");
        lblClutch.setText("0%");
        lblGear.setText("0%");
        lblHyd.setText("0%");
        lblSusp.setText("0%");
        lblThr.setText("0%");
        imgBrakeProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability0.png")));
        imgClutchProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability0.png")));
        imgGearProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability0.png")));
        imgHydProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability0.png")));
        imgSuspProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability0.png")));
        imgThrProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability0.png")));
        switch (FullGame.data.findPlayerTeam().techInProd) {
            case 1:
            case 7:
                lblBrake.setText(Integer.toString(FullGame.data.findPlayerTeam().desTech) + "%");
                imgBrakeProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().techProg + ".png")));
                break;
            case 2:
            case 8:
                lblClutch.setText(Integer.toString(FullGame.data.findPlayerTeam().desTech) + "%");
                imgClutchProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().techProg + ".png")));
                break;
            case 3:
            case 9:
                lblGear.setText(Integer.toString(FullGame.data.findPlayerTeam().desTech) + "%");
                imgGearProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().techProg + ".png")));
                break;
            case 4:
            case 10:
                lblHyd.setText(Integer.toString(FullGame.data.findPlayerTeam().desTech) + "%");
                imgHydProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().techProg + ".png")));
                break;
            case 5:
            case 11:
                lblSusp.setText(Integer.toString(FullGame.data.findPlayerTeam().desTech) + "%");
                imgSuspProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().techProg + ".png")));
                break;
            case 6:
            case 12:
                lblThr.setText(Integer.toString(FullGame.data.findPlayerTeam().desTech) + "%");
                imgThrProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().techProg + ".png")));
                break;
        }
        imgBrakePerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().brakes.performance + ".png")));
        imgClutchPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().clutch.performance + ".png")));
        imgGearPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().gearbox.performance + ".png")));
        imgHydPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().hydraulics.performance + ".png")));
        imgSuspPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().suspension.performance + ".png")));
        imgThrPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().throttle.performance + ".png")));
        imgBrakeRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().brakes.reliability + ".png")));
        imgClutchRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().clutch.reliability + ".png")));
        imgGearRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().gearbox.reliability + ".png")));
        imgHydRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().hydraulics.reliability + ".png")));
        imgSuspRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().suspension.reliability + ".png")));
        imgThrRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().throttle.reliability + ".png")));

        lblAidsCYTitle.setText(Integer.toString(FullGame.data.currentYear) + " Chassis");
        lblAidsNYTitle.setText(Integer.toString(FullGame.data.currentYear + 1) + " Chassis");
        lblAidsAvail.setText(Integer.toString(FullGame.data.findPlayerTeam().desAvail) + "%");
        lblAidsCY.setText(Integer.toString(FullGame.data.findPlayerTeam().desCY) + "%");
        lblAidsNY.setText(Integer.toString(FullGame.data.findPlayerTeam().desNY) + "%");
        lblAidsTech.setText(Integer.toString(FullGame.data.findPlayerTeam().desTech) + "%");
        lblAidsAids.setText(Integer.toString(FullGame.data.findPlayerTeam().desAids) + "%");
        lblAS.setText("0%");
        lblAG.setText("0%");
        lblPB.setText("0%");
        lblTC.setText("0%");
        imgASProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability0.png")));
        imgAGProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability0.png")));
        imgPBProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability0.png")));
        imgTCProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability0.png")));
        switch (FullGame.data.findPlayerTeam().aidInProd) {
            case 1:
                lblAS.setText(FullGame.data.findPlayerTeam().desAids + "%");
                imgASProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().aidProg + ".png")));
                break;
            case 2:
                lblAG.setText(FullGame.data.findPlayerTeam().desAids + "%");
                imgASProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().aidProg + ".png")));
                break;
            case 3:
                lblPB.setText(FullGame.data.findPlayerTeam().desAids + "%");
                imgASProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().aidProg + ".png")));
                break;
            case 4:
                lblTC.setText(FullGame.data.findPlayerTeam().desAids + "%");
                imgASProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().aidProg + ".png")));
                break;
        }
        imgASLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().activesusp.level + ".png")));
        imgAGLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().autogears.level + ".png")));
        imgPBLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().powerbrakes.level + ".png")));
        imgTCLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().tractioncontrol.level + ".png")));
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
        jPanel6 = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        lblSumCYAvailTitle = new javax.swing.JLabel();
        lblSumNYAvailTitle = new javax.swing.JLabel();
        lblSumAvail = new javax.swing.JLabel();
        lblSumCY = new javax.swing.JLabel();
        lblSumNY = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        lblSumTech = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        lblSumAids = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblSumCYTitle = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        lblSumCYName = new javax.swing.JLabel();
        lblSumCYHandling = new javax.swing.JLabel();
        lblSumCYProj = new javax.swing.JLabel();
        lblSumNYTitle = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        lblSumNYName = new javax.swing.JLabel();
        lblSumNYStage = new javax.swing.JLabel();
        lblSumNYEff = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        imgSumBrakeP = new javax.swing.JLabel();
        imgSumBrakeR = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        imgSumClutchP = new javax.swing.JLabel();
        imgSumClutchR = new javax.swing.JLabel();
        imgSumGearR = new javax.swing.JLabel();
        imgSumGearP = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        imgSumHydP = new javax.swing.JLabel();
        imgSumHydR = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        imgSumSuspR = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        imgSumSuspP = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        imgSumThrP = new javax.swing.JLabel();
        imgSumThrR = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel180 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        imgSumASLevel = new javax.swing.JLabel();
        lblSumASLegal = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        imgSumAGLevel = new javax.swing.JLabel();
        lblSumAGLegal = new javax.swing.JLabel();
        imgSumPBLevel = new javax.swing.JLabel();
        lblSumPBLegal = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        imgSumTCLevel = new javax.swing.JLabel();
        lblSumTCLegal = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        pnlCYChassis = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel181 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        lblCYCYTitle = new javax.swing.JLabel();
        lblCYNYTitle = new javax.swing.JLabel();
        lblCYAvail = new javax.swing.JLabel();
        lblCYCY = new javax.swing.JLabel();
        lblCYNY = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        lblCYTech = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        lblCYAids = new javax.swing.JLabel();
        jLabel241 = new javax.swing.JLabel();
        btnCYStartWork = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        imgCYTesting = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        lblCYHandling = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        lblCYProblem = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        lblCYSolution = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        btnCYDecDesign = new javax.swing.JLabel();
        lblCYDesign = new javax.swing.JLabel();
        btnCYIncDesign = new javax.swing.JLabel();
        imgCYCAD = new javax.swing.JLabel();
        imgCYDesignProg = new javax.swing.JLabel();
        btnCYDesignFinish = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        btnCYDecCFD = new javax.swing.JLabel();
        lblCYCFD = new javax.swing.JLabel();
        btnCYIncCFD = new javax.swing.JLabel();
        imgCYSupercomp = new javax.swing.JLabel();
        imgCYCFDProg = new javax.swing.JLabel();
        btnCYCFDFinish = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        btnCYDecModel = new javax.swing.JLabel();
        lblCYModel = new javax.swing.JLabel();
        btnCYIncModel = new javax.swing.JLabel();
        imgCYCAM = new javax.swing.JLabel();
        imgCYModelProg = new javax.swing.JLabel();
        btnCYModelFinish = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        btnCYDecWind = new javax.swing.JLabel();
        lblCYWind = new javax.swing.JLabel();
        btnCYIncWind = new javax.swing.JLabel();
        imgCYTunnel = new javax.swing.JLabel();
        imgCYWindProg = new javax.swing.JLabel();
        btnCYWindFinish = new javax.swing.JLabel();
        pnlNYChassis = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        lblNYCYTitle = new javax.swing.JLabel();
        lblNYNYTitle = new javax.swing.JLabel();
        lblNYAvail = new javax.swing.JLabel();
        lblNYCY = new javax.swing.JLabel();
        lblNYNY = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        lblNYTech = new javax.swing.JLabel();
        jLabel248 = new javax.swing.JLabel();
        lblNYAids = new javax.swing.JLabel();
        jLabel250 = new javax.swing.JLabel();
        btnNYStartWork = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel251 = new javax.swing.JLabel();
        lblNYRegsTitle = new javax.swing.JLabel();
        lblNYRegs = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        lblNYEff = new javax.swing.JLabel();
        jLabel283 = new javax.swing.JLabel();
        lblNYChassisName = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel260 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        btnNYDecDes = new javax.swing.JLabel();
        lblNYDes = new javax.swing.JLabel();
        btnNYIncDes = new javax.swing.JLabel();
        imgNYCAD = new javax.swing.JLabel();
        imgNYDesProg = new javax.swing.JLabel();
        btnNYDesFinish = new javax.swing.JLabel();
        jLabel268 = new javax.swing.JLabel();
        btnNYDecCFD = new javax.swing.JLabel();
        lblNYCFD = new javax.swing.JLabel();
        btnNYIncCFD = new javax.swing.JLabel();
        imgNYSupercomputer = new javax.swing.JLabel();
        imgNYCFDProg = new javax.swing.JLabel();
        btnNYCFDFinish = new javax.swing.JLabel();
        jLabel273 = new javax.swing.JLabel();
        btnNYDecModel = new javax.swing.JLabel();
        lblNYModel = new javax.swing.JLabel();
        btnNYIncModel = new javax.swing.JLabel();
        imgNYCAM = new javax.swing.JLabel();
        imgNYModelProg = new javax.swing.JLabel();
        btnNYModelFinish = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        btnNYDecWind = new javax.swing.JLabel();
        lblNYWind = new javax.swing.JLabel();
        btnNYIncWind = new javax.swing.JLabel();
        imgNYTunnel = new javax.swing.JLabel();
        imgNYWindProg = new javax.swing.JLabel();
        btnNYWindFinish = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel252 = new javax.swing.JLabel();
        jLabel253 = new javax.swing.JLabel();
        lblTechAvail = new javax.swing.JLabel();
        lblTechCYTitle = new javax.swing.JLabel();
        lblTechCY = new javax.swing.JLabel();
        lblTechNYTitle = new javax.swing.JLabel();
        lblTechNY = new javax.swing.JLabel();
        jLabel288 = new javax.swing.JLabel();
        lblTechTech = new javax.swing.JLabel();
        jLabel290 = new javax.swing.JLabel();
        lblTechAids = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        imgBrakePerf = new javax.swing.JLabel();
        jLabel321 = new javax.swing.JLabel();
        btnDecBrake = new javax.swing.JLabel();
        lblBrake = new javax.swing.JLabel();
        btnIncBrake = new javax.swing.JLabel();
        btnBrakePerf = new javax.swing.JLabel();
        imgBrakeRel = new javax.swing.JLabel();
        btnBrakeRel = new javax.swing.JLabel();
        imgBrakeProg = new javax.swing.JLabel();
        btnBrakeFinish = new javax.swing.JLabel();
        jLabel355 = new javax.swing.JLabel();
        jLabel356 = new javax.swing.JLabel();
        jLabel357 = new javax.swing.JLabel();
        jLabel358 = new javax.swing.JLabel();
        jLabel365 = new javax.swing.JLabel();
        btnDecClutch = new javax.swing.JLabel();
        lblClutch = new javax.swing.JLabel();
        btnIncClutch = new javax.swing.JLabel();
        imgClutchPerf = new javax.swing.JLabel();
        btnClutchPerf = new javax.swing.JLabel();
        imgClutchRel = new javax.swing.JLabel();
        btnClutchRel = new javax.swing.JLabel();
        imgClutchProg = new javax.swing.JLabel();
        btnClutchFinish = new javax.swing.JLabel();
        btnDecGear = new javax.swing.JLabel();
        btnIncGear = new javax.swing.JLabel();
        btnGearPerf = new javax.swing.JLabel();
        imgGearPerf = new javax.swing.JLabel();
        btnGearRel = new javax.swing.JLabel();
        btnGearFinish = new javax.swing.JLabel();
        lblGear = new javax.swing.JLabel();
        imgGearRel = new javax.swing.JLabel();
        jLabel372 = new javax.swing.JLabel();
        imgGearProg = new javax.swing.JLabel();
        btnDecHyd = new javax.swing.JLabel();
        btnIncHyd = new javax.swing.JLabel();
        imgHydProg = new javax.swing.JLabel();
        imgHydRel = new javax.swing.JLabel();
        btnHydPerf = new javax.swing.JLabel();
        btnHydRel = new javax.swing.JLabel();
        btnHydFinish = new javax.swing.JLabel();
        imgHydPerf = new javax.swing.JLabel();
        jLabel397 = new javax.swing.JLabel();
        lblHyd = new javax.swing.JLabel();
        imgSuspRel = new javax.swing.JLabel();
        lblSusp = new javax.swing.JLabel();
        btnSuspRel = new javax.swing.JLabel();
        btnSuspFinish = new javax.swing.JLabel();
        imgSuspProg = new javax.swing.JLabel();
        btnSuspPerf = new javax.swing.JLabel();
        imgSuspPerf = new javax.swing.JLabel();
        btnIncSusp = new javax.swing.JLabel();
        jLabel401 = new javax.swing.JLabel();
        btnDecSusp = new javax.swing.JLabel();
        btnThrPerf = new javax.swing.JLabel();
        jLabel403 = new javax.swing.JLabel();
        imgThrPerf = new javax.swing.JLabel();
        imgThrProg = new javax.swing.JLabel();
        btnIncThr = new javax.swing.JLabel();
        imgThrRel = new javax.swing.JLabel();
        lblThr = new javax.swing.JLabel();
        btnThrFinish = new javax.swing.JLabel();
        btnThrRel = new javax.swing.JLabel();
        btnDecThr = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel293 = new javax.swing.JLabel();
        jLabel294 = new javax.swing.JLabel();
        lblAidsAvail = new javax.swing.JLabel();
        lblAidsCYTitle = new javax.swing.JLabel();
        lblAidsCY = new javax.swing.JLabel();
        lblAidsNYTitle = new javax.swing.JLabel();
        lblAidsNY = new javax.swing.JLabel();
        jLabel300 = new javax.swing.JLabel();
        lblAidsTech = new javax.swing.JLabel();
        jLabel302 = new javax.swing.JLabel();
        lblAidsAids = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel306 = new javax.swing.JLabel();
        btnDecAS = new javax.swing.JLabel();
        lblAS = new javax.swing.JLabel();
        btnIncAS = new javax.swing.JLabel();
        imgASLevel = new javax.swing.JLabel();
        btnASStart = new javax.swing.JLabel();
        imgASProg = new javax.swing.JLabel();
        btnASFinish = new javax.swing.JLabel();
        btnASLegal = new javax.swing.JLabel();
        jLabel318 = new javax.swing.JLabel();
        jLabel319 = new javax.swing.JLabel();
        jLabel320 = new javax.swing.JLabel();
        jLabel359 = new javax.swing.JLabel();
        btnDecAG = new javax.swing.JLabel();
        lblAG = new javax.swing.JLabel();
        btnIncAG = new javax.swing.JLabel();
        imgAGLevel = new javax.swing.JLabel();
        btnAGStart = new javax.swing.JLabel();
        imgAGProg = new javax.swing.JLabel();
        btnAGProg = new javax.swing.JLabel();
        btnAGLegal = new javax.swing.JLabel();
        btnDecPB = new javax.swing.JLabel();
        imgPBLevel = new javax.swing.JLabel();
        btnPBProg = new javax.swing.JLabel();
        btnPBStart = new javax.swing.JLabel();
        btnIncPB = new javax.swing.JLabel();
        jLabel383 = new javax.swing.JLabel();
        lblPB = new javax.swing.JLabel();
        imgPBProg = new javax.swing.JLabel();
        btnPBLegal = new javax.swing.JLabel();
        imgTCProg = new javax.swing.JLabel();
        imgTCLevel = new javax.swing.JLabel();
        btnTCLegal = new javax.swing.JLabel();
        btnTCProg = new javax.swing.JLabel();
        btnIncTC = new javax.swing.JLabel();
        btnTCStart = new javax.swing.JLabel();
        lblTC = new javax.swing.JLabel();
        jLabel394 = new javax.swing.JLabel();
        btnDecTC = new javax.swing.JLabel();

        setBackground(new java.awt.Color(88, 103, 108));
        setForeground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1100, 550));
        setMinimumSize(new java.awt.Dimension(1100, 550));
        setPreferredSize(new java.awt.Dimension(1100, 550));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(1070, 520));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1070, 520));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1070, 520));

        jPanel1.setBackground(new java.awt.Color(88, 103, 108));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        jPanel6.setOpaque(false);

        jLabel131.setBackground(new java.awt.Color(113, 132, 137));
        jLabel131.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(255, 255, 255));
        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel131.setText("Designers");
        jLabel131.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel131.setOpaque(true);

        jLabel132.setBackground(new java.awt.Color(113, 132, 137));
        jLabel132.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(255, 255, 255));
        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel132.setText("Available");
        jLabel132.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel132.setOpaque(true);

        lblSumCYAvailTitle.setBackground(new java.awt.Color(113, 132, 137));
        lblSumCYAvailTitle.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumCYAvailTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSumCYAvailTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSumCYAvailTitle.setText("2019 Chassis");
        lblSumCYAvailTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumCYAvailTitle.setOpaque(true);

        lblSumNYAvailTitle.setBackground(new java.awt.Color(113, 132, 137));
        lblSumNYAvailTitle.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumNYAvailTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSumNYAvailTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSumNYAvailTitle.setText("2020 Chassis");
        lblSumNYAvailTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumNYAvailTitle.setOpaque(true);

        lblSumAvail.setBackground(new java.awt.Color(113, 132, 137));
        lblSumAvail.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumAvail.setForeground(new java.awt.Color(255, 255, 255));
        lblSumAvail.setText(" ");
        lblSumAvail.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumAvail.setOpaque(true);

        lblSumCY.setBackground(new java.awt.Color(113, 132, 137));
        lblSumCY.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumCY.setForeground(new java.awt.Color(255, 255, 255));
        lblSumCY.setText(" ");
        lblSumCY.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumCY.setOpaque(true);

        lblSumNY.setBackground(new java.awt.Color(113, 132, 137));
        lblSumNY.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumNY.setForeground(new java.awt.Color(255, 255, 255));
        lblSumNY.setText(" ");
        lblSumNY.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumNY.setOpaque(true);

        jLabel138.setBackground(new java.awt.Color(113, 132, 137));
        jLabel138.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(255, 255, 255));
        jLabel138.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel138.setText("Technology");
        jLabel138.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel138.setOpaque(true);

        lblSumTech.setBackground(new java.awt.Color(113, 132, 137));
        lblSumTech.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumTech.setForeground(new java.awt.Color(255, 255, 255));
        lblSumTech.setText(" ");
        lblSumTech.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumTech.setOpaque(true);

        jLabel140.setBackground(new java.awt.Color(113, 132, 137));
        jLabel140.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(255, 255, 255));
        jLabel140.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel140.setText("Driving Aids");
        jLabel140.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel140.setOpaque(true);

        lblSumAids.setBackground(new java.awt.Color(113, 132, 137));
        lblSumAids.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumAids.setForeground(new java.awt.Color(255, 255, 255));
        lblSumAids.setText(" ");
        lblSumAids.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumAids.setOpaque(true);

        jLabel142.setBackground(new java.awt.Color(113, 132, 137));
        jLabel142.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(255, 255, 255));
        jLabel142.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel142.setText("Technology");
        jLabel142.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel142.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel142, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblSumNYAvailTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSumNY, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSumAvail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblSumCYAvailTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSumCY, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSumTech, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSumAids, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel131)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel132, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSumAvail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSumCYAvailTitle)
                    .addComponent(lblSumCY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSumNYAvailTitle)
                    .addComponent(lblSumNY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel138)
                    .addComponent(lblSumTech))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel140)
                    .addComponent(lblSumAids))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel142))
        );

        jPanel1.add(jPanel6);

        jPanel8.setOpaque(false);

        lblSumCYTitle.setBackground(new java.awt.Color(113, 132, 137));
        lblSumCYTitle.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        lblSumCYTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSumCYTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSumCYTitle.setText("2019 Chassis");
        lblSumCYTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumCYTitle.setOpaque(true);

        jLabel167.setBackground(new java.awt.Color(113, 132, 137));
        jLabel167.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel167.setForeground(new java.awt.Color(255, 255, 255));
        jLabel167.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel167.setText("Name");
        jLabel167.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel167.setOpaque(true);

        jLabel168.setBackground(new java.awt.Color(113, 132, 137));
        jLabel168.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(255, 255, 255));
        jLabel168.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel168.setText("Handling");
        jLabel168.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel168.setOpaque(true);

        jLabel169.setBackground(new java.awt.Color(113, 132, 137));
        jLabel169.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel169.setForeground(new java.awt.Color(255, 255, 255));
        jLabel169.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel169.setText("Project");
        jLabel169.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel169.setOpaque(true);

        lblSumCYName.setBackground(new java.awt.Color(113, 132, 137));
        lblSumCYName.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumCYName.setForeground(new java.awt.Color(255, 255, 255));
        lblSumCYName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSumCYName.setText(" ");
        lblSumCYName.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumCYName.setOpaque(true);

        lblSumCYHandling.setBackground(new java.awt.Color(113, 132, 137));
        lblSumCYHandling.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumCYHandling.setForeground(new java.awt.Color(255, 255, 255));
        lblSumCYHandling.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSumCYHandling.setText(" ");
        lblSumCYHandling.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumCYHandling.setOpaque(true);

        lblSumCYProj.setBackground(new java.awt.Color(113, 132, 137));
        lblSumCYProj.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumCYProj.setForeground(new java.awt.Color(255, 255, 255));
        lblSumCYProj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSumCYProj.setText(" ");
        lblSumCYProj.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumCYProj.setOpaque(true);

        lblSumNYTitle.setBackground(new java.awt.Color(113, 132, 137));
        lblSumNYTitle.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        lblSumNYTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSumNYTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSumNYTitle.setText("2020 Chassis");
        lblSumNYTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumNYTitle.setOpaque(true);

        jLabel174.setBackground(new java.awt.Color(113, 132, 137));
        jLabel174.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(255, 255, 255));
        jLabel174.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel174.setText("Name");
        jLabel174.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel174.setOpaque(true);

        jLabel175.setBackground(new java.awt.Color(113, 132, 137));
        jLabel175.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel175.setForeground(new java.awt.Color(255, 255, 255));
        jLabel175.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel175.setText("Stage");
        jLabel175.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel175.setOpaque(true);

        jLabel176.setBackground(new java.awt.Color(113, 132, 137));
        jLabel176.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(255, 255, 255));
        jLabel176.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel176.setText("Efficiency");
        jLabel176.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel176.setOpaque(true);

        lblSumNYName.setBackground(new java.awt.Color(113, 132, 137));
        lblSumNYName.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumNYName.setForeground(new java.awt.Color(255, 255, 255));
        lblSumNYName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSumNYName.setText(" ");
        lblSumNYName.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumNYName.setOpaque(true);

        lblSumNYStage.setBackground(new java.awt.Color(113, 132, 137));
        lblSumNYStage.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumNYStage.setForeground(new java.awt.Color(255, 255, 255));
        lblSumNYStage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSumNYStage.setText(" ");
        lblSumNYStage.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumNYStage.setOpaque(true);

        lblSumNYEff.setBackground(new java.awt.Color(113, 132, 137));
        lblSumNYEff.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumNYEff.setForeground(new java.awt.Color(255, 255, 255));
        lblSumNYEff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSumNYEff.setText(" ");
        lblSumNYEff.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumNYEff.setOpaque(true);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSumCYTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel169, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lblSumCYName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSumCYHandling, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSumCYProj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblSumNYTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel175, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(lblSumNYName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSumNYStage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSumNYEff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel176, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSumCYTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSumCYName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSumCYHandling, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSumCYProj, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(lblSumNYTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel176, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSumNYName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSumNYStage, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSumNYEff, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8);

        jPanel7.setOpaque(false);

        jLabel144.setBackground(new java.awt.Color(113, 132, 137));
        jLabel144.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(255, 255, 255));
        jLabel144.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel144.setText("Performance");
        jLabel144.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel144.setOpaque(true);

        jLabel145.setBackground(new java.awt.Color(113, 132, 137));
        jLabel145.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(255, 255, 255));
        jLabel145.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel145.setText("Reliability");
        jLabel145.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel145.setMaximumSize(new java.awt.Dimension(98, 24));
        jLabel145.setMinimumSize(new java.awt.Dimension(98, 24));
        jLabel145.setOpaque(true);
        jLabel145.setPreferredSize(new java.awt.Dimension(98, 24));

        jLabel146.setBackground(new java.awt.Color(113, 132, 137));
        jLabel146.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(255, 255, 255));
        jLabel146.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel146.setText("Brakes");
        jLabel146.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel146.setOpaque(true);

        imgSumBrakeP.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSumBrakeP.setForeground(new java.awt.Color(255, 255, 255));
        imgSumBrakeP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSumBrakeP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        imgSumBrakeR.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSumBrakeR.setForeground(new java.awt.Color(255, 255, 255));
        imgSumBrakeR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSumBrakeR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        jLabel149.setBackground(new java.awt.Color(113, 132, 137));
        jLabel149.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(255, 255, 255));
        jLabel149.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel149.setText("Clutch");
        jLabel149.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel149.setOpaque(true);

        imgSumClutchP.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSumClutchP.setForeground(new java.awt.Color(255, 255, 255));
        imgSumClutchP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSumClutchP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        imgSumClutchR.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSumClutchR.setForeground(new java.awt.Color(255, 255, 255));
        imgSumClutchR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSumClutchR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        imgSumGearR.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSumGearR.setForeground(new java.awt.Color(255, 255, 255));
        imgSumGearR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSumGearR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        imgSumGearP.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSumGearP.setForeground(new java.awt.Color(255, 255, 255));
        imgSumGearP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSumGearP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        jLabel157.setBackground(new java.awt.Color(113, 132, 137));
        jLabel157.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel157.setForeground(new java.awt.Color(255, 255, 255));
        jLabel157.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel157.setText("Gearbox");
        jLabel157.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel157.setOpaque(true);

        imgSumHydP.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSumHydP.setForeground(new java.awt.Color(255, 255, 255));
        imgSumHydP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSumHydP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        imgSumHydR.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSumHydR.setForeground(new java.awt.Color(255, 255, 255));
        imgSumHydR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSumHydR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        jLabel160.setBackground(new java.awt.Color(113, 132, 137));
        jLabel160.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel160.setForeground(new java.awt.Color(255, 255, 255));
        jLabel160.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel160.setText("Hydraulics");
        jLabel160.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel160.setOpaque(true);

        imgSumSuspR.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSumSuspR.setForeground(new java.awt.Color(255, 255, 255));
        imgSumSuspR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSumSuspR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        jLabel162.setBackground(new java.awt.Color(113, 132, 137));
        jLabel162.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(255, 255, 255));
        jLabel162.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel162.setText("Suspension");
        jLabel162.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel162.setOpaque(true);

        imgSumSuspP.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSumSuspP.setForeground(new java.awt.Color(255, 255, 255));
        imgSumSuspP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSumSuspP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        jLabel164.setBackground(new java.awt.Color(113, 132, 137));
        jLabel164.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel164.setForeground(new java.awt.Color(255, 255, 255));
        jLabel164.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel164.setText("Throttle");
        jLabel164.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel164.setOpaque(true);

        imgSumThrP.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSumThrP.setForeground(new java.awt.Color(255, 255, 255));
        imgSumThrP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSumThrP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        imgSumThrR.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSumThrR.setForeground(new java.awt.Color(255, 255, 255));
        imgSumThrR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSumThrR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel164, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgSumThrP, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgSumSuspP, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgSumHydP, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgSumGearP, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgSumClutchP, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgSumBrakeP, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumBrakeR, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumClutchR, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumGearR, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumHydR, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumSuspR, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumThrR, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumBrakeP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumBrakeR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumClutchP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumClutchR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumGearP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumGearR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumHydP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumHydR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumSuspP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumSuspR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel164, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumThrP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumThrR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7);

        jPanel9.setOpaque(false);

        jLabel180.setBackground(new java.awt.Color(113, 132, 137));
        jLabel180.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel180.setForeground(new java.awt.Color(255, 255, 255));
        jLabel180.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel180.setText("Driving Aids");
        jLabel180.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel180.setOpaque(true);

        jLabel182.setBackground(new java.awt.Color(113, 132, 137));
        jLabel182.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(255, 255, 255));
        jLabel182.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel182.setText("Level");
        jLabel182.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel182.setOpaque(true);

        jLabel183.setBackground(new java.awt.Color(113, 132, 137));
        jLabel183.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel183.setForeground(new java.awt.Color(255, 255, 255));
        jLabel183.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel183.setText("Legal");
        jLabel183.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel183.setOpaque(true);

        jLabel184.setBackground(new java.awt.Color(113, 132, 137));
        jLabel184.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel184.setForeground(new java.awt.Color(255, 255, 255));
        jLabel184.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel184.setText("Active Suspension");
        jLabel184.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel184.setOpaque(true);

        imgSumASLevel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSumASLevel.setForeground(new java.awt.Color(255, 255, 255));
        imgSumASLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSumASLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        lblSumASLegal.setBackground(new java.awt.Color(113, 132, 137));
        lblSumASLegal.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumASLegal.setForeground(new java.awt.Color(255, 255, 255));
        lblSumASLegal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSumASLegal.setText(" ");
        lblSumASLegal.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumASLegal.setOpaque(true);

        jLabel187.setBackground(new java.awt.Color(113, 132, 137));
        jLabel187.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel187.setForeground(new java.awt.Color(255, 255, 255));
        jLabel187.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel187.setText("Automatic Gears");
        jLabel187.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel187.setOpaque(true);

        imgSumAGLevel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSumAGLevel.setForeground(new java.awt.Color(255, 255, 255));
        imgSumAGLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSumAGLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        lblSumAGLegal.setBackground(new java.awt.Color(113, 132, 137));
        lblSumAGLegal.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumAGLegal.setForeground(new java.awt.Color(255, 255, 255));
        lblSumAGLegal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSumAGLegal.setText(" ");
        lblSumAGLegal.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumAGLegal.setOpaque(true);

        imgSumPBLevel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSumPBLevel.setForeground(new java.awt.Color(255, 255, 255));
        imgSumPBLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSumPBLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        lblSumPBLegal.setBackground(new java.awt.Color(113, 132, 137));
        lblSumPBLegal.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumPBLegal.setForeground(new java.awt.Color(255, 255, 255));
        lblSumPBLegal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSumPBLegal.setText(" ");
        lblSumPBLegal.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumPBLegal.setOpaque(true);

        jLabel192.setBackground(new java.awt.Color(113, 132, 137));
        jLabel192.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel192.setForeground(new java.awt.Color(255, 255, 255));
        jLabel192.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel192.setText("Power Brakes");
        jLabel192.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel192.setOpaque(true);

        imgSumTCLevel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSumTCLevel.setForeground(new java.awt.Color(255, 255, 255));
        imgSumTCLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSumTCLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        lblSumTCLegal.setBackground(new java.awt.Color(113, 132, 137));
        lblSumTCLegal.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSumTCLegal.setForeground(new java.awt.Color(255, 255, 255));
        lblSumTCLegal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSumTCLegal.setText(" ");
        lblSumTCLegal.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSumTCLegal.setOpaque(true);

        jLabel195.setBackground(new java.awt.Color(113, 132, 137));
        jLabel195.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel195.setForeground(new java.awt.Color(255, 255, 255));
        jLabel195.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel195.setText("Traction Control");
        jLabel195.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel195.setOpaque(true);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel180, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel184, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(jLabel187, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel192, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel195, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(imgSumTCLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSumTCLegal, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(imgSumPBLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSumPBLegal, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(imgSumAGLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSumAGLegal, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(imgSumASLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSumASLegal, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel182, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel183, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel180)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel182, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel183, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel184, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumASLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSumASLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel187, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumAGLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSumAGLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel192, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumPBLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSumPBLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSumTCLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSumTCLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9);

        jTabbedPane1.addTab("Summary", jPanel1);

        pnlCYChassis.setBackground(new java.awt.Color(88, 103, 108));
        pnlCYChassis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        pnlCYChassis.setForeground(new java.awt.Color(255, 255, 255));
        pnlCYChassis.setLayout(new java.awt.GridLayout(2, 1, 5, 5));

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.GridLayout(1, 2, 10, 10));

        jPanel12.setOpaque(false);

        jLabel181.setBackground(new java.awt.Color(113, 132, 137));
        jLabel181.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel181.setForeground(new java.awt.Color(255, 255, 255));
        jLabel181.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel181.setText("Designers");
        jLabel181.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel181.setOpaque(true);

        jLabel196.setBackground(new java.awt.Color(113, 132, 137));
        jLabel196.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel196.setForeground(new java.awt.Color(255, 255, 255));
        jLabel196.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel196.setText("Available");
        jLabel196.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel196.setOpaque(true);

        lblCYCYTitle.setBackground(new java.awt.Color(113, 132, 137));
        lblCYCYTitle.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYCYTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblCYCYTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYCYTitle.setText("2019 Chassis");
        lblCYCYTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYCYTitle.setOpaque(true);

        lblCYNYTitle.setBackground(new java.awt.Color(113, 132, 137));
        lblCYNYTitle.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYNYTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblCYNYTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYNYTitle.setText("2020 Chassis");
        lblCYNYTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYNYTitle.setOpaque(true);

        lblCYAvail.setBackground(new java.awt.Color(113, 132, 137));
        lblCYAvail.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYAvail.setForeground(new java.awt.Color(255, 255, 255));
        lblCYAvail.setText(" ");
        lblCYAvail.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYAvail.setOpaque(true);

        lblCYCY.setBackground(new java.awt.Color(113, 132, 137));
        lblCYCY.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYCY.setForeground(new java.awt.Color(255, 255, 255));
        lblCYCY.setText(" ");
        lblCYCY.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYCY.setOpaque(true);

        lblCYNY.setBackground(new java.awt.Color(113, 132, 137));
        lblCYNY.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYNY.setForeground(new java.awt.Color(255, 255, 255));
        lblCYNY.setText(" ");
        lblCYNY.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYNY.setOpaque(true);

        jLabel202.setBackground(new java.awt.Color(113, 132, 137));
        jLabel202.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel202.setForeground(new java.awt.Color(255, 255, 255));
        jLabel202.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel202.setText("Technology");
        jLabel202.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel202.setOpaque(true);

        lblCYTech.setBackground(new java.awt.Color(113, 132, 137));
        lblCYTech.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYTech.setForeground(new java.awt.Color(255, 255, 255));
        lblCYTech.setText(" ");
        lblCYTech.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYTech.setOpaque(true);

        jLabel204.setBackground(new java.awt.Color(113, 132, 137));
        jLabel204.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel204.setForeground(new java.awt.Color(255, 255, 255));
        jLabel204.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel204.setText("Driving Aids");
        jLabel204.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel204.setOpaque(true);

        lblCYAids.setBackground(new java.awt.Color(113, 132, 137));
        lblCYAids.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYAids.setForeground(new java.awt.Color(255, 255, 255));
        lblCYAids.setText(" ");
        lblCYAids.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYAids.setOpaque(true);

        jLabel241.setBackground(new java.awt.Color(113, 132, 137));
        jLabel241.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel241.setForeground(new java.awt.Color(255, 255, 255));
        jLabel241.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel241.setText("Start Work");
        jLabel241.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel241.setOpaque(true);

        btnCYStartWork.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnCYStartWork.setForeground(new java.awt.Color(255, 255, 255));
        btnCYStartWork.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCYStartWork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnCYStartWork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCYStartWorkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel181, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(lblCYNYTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYNY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel196, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYAvail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(lblCYCYTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYCY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel202, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYTech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel204, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYAids, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel241, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCYStartWork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(147, 147, 147)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel181)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel196, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCYAvail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCYCYTitle)
                    .addComponent(lblCYCY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCYNYTitle)
                    .addComponent(lblCYNY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel202)
                    .addComponent(lblCYTech))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel204)
                    .addComponent(lblCYAids))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCYStartWork))
                    .addComponent(jLabel241, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        jPanel10.add(jPanel12);

        jPanel13.setOpaque(false);

        jLabel206.setBackground(new java.awt.Color(113, 132, 137));
        jLabel206.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel206.setForeground(new java.awt.Color(255, 255, 255));
        jLabel206.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel206.setText("Chassis");
        jLabel206.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel206.setOpaque(true);

        jLabel207.setBackground(new java.awt.Color(113, 132, 137));
        jLabel207.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel207.setForeground(new java.awt.Color(255, 255, 255));
        jLabel207.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel207.setText("Testing");
        jLabel207.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel207.setOpaque(true);

        imgCYTesting.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgCYTesting.setForeground(new java.awt.Color(255, 255, 255));
        imgCYTesting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel209.setBackground(new java.awt.Color(113, 132, 137));
        jLabel209.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel209.setForeground(new java.awt.Color(255, 255, 255));
        jLabel209.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel209.setText("Handling");
        jLabel209.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel209.setOpaque(true);

        lblCYHandling.setBackground(new java.awt.Color(113, 132, 137));
        lblCYHandling.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYHandling.setForeground(new java.awt.Color(255, 255, 255));
        lblCYHandling.setText(" ");
        lblCYHandling.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYHandling.setOpaque(true);

        jLabel211.setBackground(new java.awt.Color(113, 132, 137));
        jLabel211.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel211.setForeground(new java.awt.Color(255, 255, 255));
        jLabel211.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel211.setText("Problem");
        jLabel211.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel211.setOpaque(true);

        lblCYProblem.setBackground(new java.awt.Color(113, 132, 137));
        lblCYProblem.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYProblem.setForeground(new java.awt.Color(255, 255, 255));
        lblCYProblem.setText(" ");
        lblCYProblem.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYProblem.setOpaque(true);

        jLabel213.setBackground(new java.awt.Color(113, 132, 137));
        jLabel213.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel213.setForeground(new java.awt.Color(255, 255, 255));
        jLabel213.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel213.setText("Solution");
        jLabel213.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel213.setOpaque(true);

        lblCYSolution.setBackground(new java.awt.Color(113, 132, 137));
        lblCYSolution.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYSolution.setForeground(new java.awt.Color(255, 255, 255));
        lblCYSolution.setText(" ");
        lblCYSolution.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYSolution.setOpaque(true);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel206, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel211, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYProblem, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel207, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgCYTesting))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel209, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYHandling, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel213, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYSolution, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel206)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel207)
                    .addComponent(imgCYTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel209)
                    .addComponent(lblCYHandling))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel211)
                    .addComponent(lblCYProblem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel213)
                    .addComponent(lblCYSolution))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel13);

        pnlCYChassis.add(jPanel10);

        jPanel11.setOpaque(false);

        jLabel215.setBackground(new java.awt.Color(113, 132, 137));
        jLabel215.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel215.setForeground(new java.awt.Color(255, 255, 255));
        jLabel215.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel215.setText("Development");
        jLabel215.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel215.setOpaque(true);

        jLabel216.setBackground(new java.awt.Color(113, 132, 137));
        jLabel216.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel216.setForeground(new java.awt.Color(255, 255, 255));
        jLabel216.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel216.setText("Stage");
        jLabel216.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel216.setOpaque(true);

        jLabel217.setBackground(new java.awt.Color(113, 132, 137));
        jLabel217.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel217.setForeground(new java.awt.Color(255, 255, 255));
        jLabel217.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel217.setText("Progress");
        jLabel217.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel217.setOpaque(true);

        jLabel59.setBackground(new java.awt.Color(113, 132, 137));
        jLabel59.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Finish");
        jLabel59.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel59.setOpaque(true);

        jLabel58.setBackground(new java.awt.Color(113, 132, 137));
        jLabel58.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Facility");
        jLabel58.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel58.setOpaque(true);

        jLabel221.setBackground(new java.awt.Color(113, 132, 137));
        jLabel221.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel221.setForeground(new java.awt.Color(255, 255, 255));
        jLabel221.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel221.setText("Design");
        jLabel221.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel221.setOpaque(true);

        btnCYDecDesign.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnCYDecDesign.setForeground(new java.awt.Color(255, 255, 255));
        btnCYDecDesign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnCYDecDesign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCYDecDesignMouseClicked(evt);
            }
        });

        lblCYDesign.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDesign.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDesign.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDesign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDesign.setText(" ");
        lblCYDesign.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDesign.setOpaque(true);

        btnCYIncDesign.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnCYIncDesign.setForeground(new java.awt.Color(255, 255, 255));
        btnCYIncDesign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnCYIncDesign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCYIncDesignMouseClicked(evt);
            }
        });

        imgCYCAD.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgCYCAD.setForeground(new java.awt.Color(255, 255, 255));
        imgCYCAD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCYCAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        imgCYDesignProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgCYDesignProg.setForeground(new java.awt.Color(255, 255, 255));
        imgCYDesignProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnCYDesignFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnCYDesignFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnCYDesignFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCYDesignFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnCYDesignFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnCYDesignFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCYDesignFinishMouseClicked(evt);
            }
        });

        jLabel226.setBackground(new java.awt.Color(113, 132, 137));
        jLabel226.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel226.setForeground(new java.awt.Color(255, 255, 255));
        jLabel226.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel226.setText("CFD Simulation");
        jLabel226.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel226.setOpaque(true);

        btnCYDecCFD.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnCYDecCFD.setForeground(new java.awt.Color(255, 255, 255));
        btnCYDecCFD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnCYDecCFD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCYDecCFDMouseClicked(evt);
            }
        });

        lblCYCFD.setBackground(new java.awt.Color(113, 132, 137));
        lblCYCFD.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYCFD.setForeground(new java.awt.Color(255, 255, 255));
        lblCYCFD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYCFD.setText(" ");
        lblCYCFD.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYCFD.setOpaque(true);

        btnCYIncCFD.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnCYIncCFD.setForeground(new java.awt.Color(255, 255, 255));
        btnCYIncCFD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnCYIncCFD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCYIncCFDMouseClicked(evt);
            }
        });

        imgCYSupercomp.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgCYSupercomp.setForeground(new java.awt.Color(255, 255, 255));
        imgCYSupercomp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCYSupercomp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        imgCYCFDProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgCYCFDProg.setForeground(new java.awt.Color(255, 255, 255));
        imgCYCFDProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnCYCFDFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnCYCFDFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnCYCFDFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCYCFDFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnCYCFDFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnCYCFDFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCYCFDFinishMouseClicked(evt);
            }
        });

        jLabel231.setBackground(new java.awt.Color(113, 132, 137));
        jLabel231.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel231.setForeground(new java.awt.Color(255, 255, 255));
        jLabel231.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel231.setText("Model Design");
        jLabel231.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel231.setOpaque(true);

        btnCYDecModel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnCYDecModel.setForeground(new java.awt.Color(255, 255, 255));
        btnCYDecModel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnCYDecModel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCYDecModelMouseClicked(evt);
            }
        });

        lblCYModel.setBackground(new java.awt.Color(113, 132, 137));
        lblCYModel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYModel.setForeground(new java.awt.Color(255, 255, 255));
        lblCYModel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYModel.setText(" ");
        lblCYModel.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYModel.setOpaque(true);

        btnCYIncModel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnCYIncModel.setForeground(new java.awt.Color(255, 255, 255));
        btnCYIncModel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnCYIncModel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCYIncModelMouseClicked(evt);
            }
        });

        imgCYCAM.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgCYCAM.setForeground(new java.awt.Color(255, 255, 255));
        imgCYCAM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCYCAM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        imgCYModelProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgCYModelProg.setForeground(new java.awt.Color(255, 255, 255));
        imgCYModelProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnCYModelFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnCYModelFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnCYModelFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCYModelFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnCYModelFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnCYModelFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCYModelFinishMouseClicked(evt);
            }
        });

        jLabel236.setBackground(new java.awt.Color(113, 132, 137));
        jLabel236.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel236.setForeground(new java.awt.Color(255, 255, 255));
        jLabel236.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel236.setText("Wind Tunnel");
        jLabel236.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel236.setOpaque(true);

        btnCYDecWind.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnCYDecWind.setForeground(new java.awt.Color(255, 255, 255));
        btnCYDecWind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnCYDecWind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCYDecWindMouseClicked(evt);
            }
        });

        lblCYWind.setBackground(new java.awt.Color(113, 132, 137));
        lblCYWind.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYWind.setForeground(new java.awt.Color(255, 255, 255));
        lblCYWind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYWind.setText(" ");
        lblCYWind.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYWind.setOpaque(true);

        btnCYIncWind.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnCYIncWind.setForeground(new java.awt.Color(255, 255, 255));
        btnCYIncWind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnCYIncWind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCYIncWindMouseClicked(evt);
            }
        });

        imgCYTunnel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgCYTunnel.setForeground(new java.awt.Color(255, 255, 255));
        imgCYTunnel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCYTunnel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        imgCYWindProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgCYWindProg.setForeground(new java.awt.Color(255, 255, 255));
        imgCYWindProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnCYWindFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnCYWindFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnCYWindFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCYWindFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnCYWindFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnCYWindFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCYWindFinishMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel215, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel236, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCYDecWind)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCYWind, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCYIncWind)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgCYTunnel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgCYWindProg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCYWindFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel231, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCYDecModel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCYModel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCYIncModel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgCYCAM, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgCYModelProg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCYModelFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel226, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCYDecCFD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCYCFD, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCYIncCFD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgCYSupercomp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgCYCFDProg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCYCFDFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel221, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCYDecDesign)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCYDesign, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCYIncDesign)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(imgCYCAD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(imgCYDesignProg))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel216, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(172, 172, 172)
                                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel217, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(btnCYDesignFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel215)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel217, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel216)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCYDesignFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgCYDesignProg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgCYCAD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCYDecDesign)
                    .addComponent(lblCYDesign)
                    .addComponent(btnCYIncDesign)
                    .addComponent(jLabel221))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCYCFDFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgCYCFDProg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgCYSupercomp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCYDecCFD)
                    .addComponent(lblCYCFD)
                    .addComponent(btnCYIncCFD)
                    .addComponent(jLabel226))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCYModelFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgCYModelProg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgCYCAM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCYDecModel)
                    .addComponent(lblCYModel)
                    .addComponent(btnCYIncModel)
                    .addComponent(jLabel231))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCYWindFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(imgCYWindProg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgCYTunnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(btnCYDecWind)
                        .addComponent(lblCYWind)
                        .addComponent(btnCYIncWind))
                    .addComponent(jLabel236))
                .addGap(57, 57, 57))
        );

        pnlCYChassis.add(jPanel11);

        jTabbedPane1.addTab("2019 Chassis", pnlCYChassis);

        pnlNYChassis.setBackground(new java.awt.Color(88, 103, 108));
        pnlNYChassis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        pnlNYChassis.setForeground(new java.awt.Color(255, 255, 255));
        pnlNYChassis.setLayout(new java.awt.GridLayout(2, 1, 10, 10));

        jPanel14.setOpaque(false);
        jPanel14.setLayout(new java.awt.GridLayout(1, 2, 10, 10));

        jPanel15.setOpaque(false);

        jLabel218.setBackground(new java.awt.Color(113, 132, 137));
        jLabel218.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel218.setForeground(new java.awt.Color(255, 255, 255));
        jLabel218.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel218.setText("Designers");
        jLabel218.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel218.setOpaque(true);

        jLabel219.setBackground(new java.awt.Color(113, 132, 137));
        jLabel219.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel219.setForeground(new java.awt.Color(255, 255, 255));
        jLabel219.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel219.setText("Available");
        jLabel219.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel219.setOpaque(true);

        lblNYCYTitle.setBackground(new java.awt.Color(113, 132, 137));
        lblNYCYTitle.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYCYTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblNYCYTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYCYTitle.setText("2019 Chassis");
        lblNYCYTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYCYTitle.setOpaque(true);

        lblNYNYTitle.setBackground(new java.awt.Color(113, 132, 137));
        lblNYNYTitle.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYNYTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblNYNYTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYNYTitle.setText("2020 Chassis");
        lblNYNYTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYNYTitle.setOpaque(true);

        lblNYAvail.setBackground(new java.awt.Color(113, 132, 137));
        lblNYAvail.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYAvail.setForeground(new java.awt.Color(255, 255, 255));
        lblNYAvail.setText(" ");
        lblNYAvail.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYAvail.setOpaque(true);

        lblNYCY.setBackground(new java.awt.Color(113, 132, 137));
        lblNYCY.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYCY.setForeground(new java.awt.Color(255, 255, 255));
        lblNYCY.setText(" ");
        lblNYCY.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYCY.setOpaque(true);

        lblNYNY.setBackground(new java.awt.Color(113, 132, 137));
        lblNYNY.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYNY.setForeground(new java.awt.Color(255, 255, 255));
        lblNYNY.setText(" ");
        lblNYNY.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYNY.setOpaque(true);

        jLabel246.setBackground(new java.awt.Color(113, 132, 137));
        jLabel246.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel246.setForeground(new java.awt.Color(255, 255, 255));
        jLabel246.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel246.setText("Technology");
        jLabel246.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel246.setOpaque(true);

        lblNYTech.setBackground(new java.awt.Color(113, 132, 137));
        lblNYTech.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYTech.setForeground(new java.awt.Color(255, 255, 255));
        lblNYTech.setText(" ");
        lblNYTech.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYTech.setOpaque(true);

        jLabel248.setBackground(new java.awt.Color(113, 132, 137));
        jLabel248.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel248.setForeground(new java.awt.Color(255, 255, 255));
        jLabel248.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel248.setText("Driving Aids");
        jLabel248.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel248.setOpaque(true);

        lblNYAids.setBackground(new java.awt.Color(113, 132, 137));
        lblNYAids.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYAids.setForeground(new java.awt.Color(255, 255, 255));
        lblNYAids.setText(" ");
        lblNYAids.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYAids.setOpaque(true);

        jLabel250.setBackground(new java.awt.Color(113, 132, 137));
        jLabel250.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel250.setForeground(new java.awt.Color(255, 255, 255));
        jLabel250.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel250.setText("Start Work");
        jLabel250.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel250.setOpaque(true);

        btnNYStartWork.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnNYStartWork.setForeground(new java.awt.Color(255, 255, 255));
        btnNYStartWork.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNYStartWork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnNYStartWork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNYStartWorkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel218, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(lblNYNYTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYNY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel219, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYAvail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(lblNYCYTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYCY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel246, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYTech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel248, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYAids, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel250, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNYStartWork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(147, 147, 147)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel218)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel219, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNYAvail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNYCYTitle)
                    .addComponent(lblNYCY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNYNYTitle)
                    .addComponent(lblNYNY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel246)
                    .addComponent(lblNYTech))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel248)
                    .addComponent(lblNYAids))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel250, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNYStartWork))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.add(jPanel15);

        jPanel16.setOpaque(false);

        jLabel251.setBackground(new java.awt.Color(113, 132, 137));
        jLabel251.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel251.setForeground(new java.awt.Color(255, 255, 255));
        jLabel251.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel251.setText("Chassis");
        jLabel251.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel251.setOpaque(true);

        lblNYRegsTitle.setBackground(new java.awt.Color(113, 132, 137));
        lblNYRegsTitle.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYRegsTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblNYRegsTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYRegsTitle.setText("2020 Regulations");
        lblNYRegsTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYRegsTitle.setOpaque(true);

        lblNYRegs.setBackground(new java.awt.Color(113, 132, 137));
        lblNYRegs.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYRegs.setForeground(new java.awt.Color(255, 255, 255));
        lblNYRegs.setText(" ");
        lblNYRegs.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYRegs.setOpaque(true);

        jLabel256.setBackground(new java.awt.Color(113, 132, 137));
        jLabel256.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel256.setForeground(new java.awt.Color(255, 255, 255));
        jLabel256.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel256.setText("Efficiency");
        jLabel256.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel256.setOpaque(true);

        lblNYEff.setBackground(new java.awt.Color(113, 132, 137));
        lblNYEff.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYEff.setForeground(new java.awt.Color(255, 255, 255));
        lblNYEff.setText(" ");
        lblNYEff.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYEff.setOpaque(true);

        jLabel283.setBackground(new java.awt.Color(113, 132, 137));
        jLabel283.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel283.setForeground(new java.awt.Color(255, 255, 255));
        jLabel283.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel283.setText("Name");
        jLabel283.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel283.setOpaque(true);

        lblNYChassisName.setBackground(new java.awt.Color(113, 132, 137));
        lblNYChassisName.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYChassisName.setForeground(new java.awt.Color(255, 255, 255));
        lblNYChassisName.setText(" ");
        lblNYChassisName.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYChassisName.setOpaque(true);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel251, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel256, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYEff, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(lblNYRegsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYRegs, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel283, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYChassisName, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel251)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel283)
                    .addComponent(lblNYChassisName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNYRegsTitle)
                    .addComponent(lblNYRegs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel256)
                    .addComponent(lblNYEff))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jPanel14.add(jPanel16);

        pnlNYChassis.add(jPanel14);

        jPanel17.setOpaque(false);

        jLabel260.setBackground(new java.awt.Color(113, 132, 137));
        jLabel260.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel260.setForeground(new java.awt.Color(255, 255, 255));
        jLabel260.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel260.setText("Development");
        jLabel260.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel260.setOpaque(true);

        jLabel261.setBackground(new java.awt.Color(113, 132, 137));
        jLabel261.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel261.setForeground(new java.awt.Color(255, 255, 255));
        jLabel261.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel261.setText("Stage");
        jLabel261.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel261.setOpaque(true);

        jLabel262.setBackground(new java.awt.Color(113, 132, 137));
        jLabel262.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel262.setForeground(new java.awt.Color(255, 255, 255));
        jLabel262.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel262.setText("Progress");
        jLabel262.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel262.setOpaque(true);

        jLabel70.setBackground(new java.awt.Color(113, 132, 137));
        jLabel70.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("Finish");
        jLabel70.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel70.setOpaque(true);

        jLabel71.setBackground(new java.awt.Color(113, 132, 137));
        jLabel71.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("Facility");
        jLabel71.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel71.setOpaque(true);

        jLabel263.setBackground(new java.awt.Color(113, 132, 137));
        jLabel263.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel263.setForeground(new java.awt.Color(255, 255, 255));
        jLabel263.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel263.setText("Design");
        jLabel263.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel263.setOpaque(true);

        btnNYDecDes.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnNYDecDes.setForeground(new java.awt.Color(255, 255, 255));
        btnNYDecDes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnNYDecDes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNYDecDesMouseClicked(evt);
            }
        });

        lblNYDes.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDes.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDes.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDes.setText(" ");
        lblNYDes.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDes.setOpaque(true);

        btnNYIncDes.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnNYIncDes.setForeground(new java.awt.Color(255, 255, 255));
        btnNYIncDes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnNYIncDes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNYIncDesMouseClicked(evt);
            }
        });

        imgNYCAD.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgNYCAD.setForeground(new java.awt.Color(255, 255, 255));
        imgNYCAD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgNYCAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        imgNYDesProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgNYDesProg.setForeground(new java.awt.Color(255, 255, 255));
        imgNYDesProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnNYDesFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnNYDesFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnNYDesFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNYDesFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnNYDesFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnNYDesFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNYDesFinishMouseClicked(evt);
            }
        });

        jLabel268.setBackground(new java.awt.Color(113, 132, 137));
        jLabel268.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel268.setForeground(new java.awt.Color(255, 255, 255));
        jLabel268.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel268.setText("CFD Simulation");
        jLabel268.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel268.setOpaque(true);

        btnNYDecCFD.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnNYDecCFD.setForeground(new java.awt.Color(255, 255, 255));
        btnNYDecCFD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnNYDecCFD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNYDecCFDMouseClicked(evt);
            }
        });

        lblNYCFD.setBackground(new java.awt.Color(113, 132, 137));
        lblNYCFD.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYCFD.setForeground(new java.awt.Color(255, 255, 255));
        lblNYCFD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYCFD.setText(" ");
        lblNYCFD.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYCFD.setOpaque(true);

        btnNYIncCFD.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnNYIncCFD.setForeground(new java.awt.Color(255, 255, 255));
        btnNYIncCFD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnNYIncCFD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNYIncCFDMouseClicked(evt);
            }
        });

        imgNYSupercomputer.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgNYSupercomputer.setForeground(new java.awt.Color(255, 255, 255));
        imgNYSupercomputer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgNYSupercomputer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        imgNYCFDProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgNYCFDProg.setForeground(new java.awt.Color(255, 255, 255));
        imgNYCFDProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnNYCFDFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnNYCFDFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnNYCFDFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNYCFDFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnNYCFDFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnNYCFDFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNYCFDFinishMouseClicked(evt);
            }
        });

        jLabel273.setBackground(new java.awt.Color(113, 132, 137));
        jLabel273.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel273.setForeground(new java.awt.Color(255, 255, 255));
        jLabel273.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel273.setText("Model Design");
        jLabel273.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel273.setOpaque(true);

        btnNYDecModel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnNYDecModel.setForeground(new java.awt.Color(255, 255, 255));
        btnNYDecModel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnNYDecModel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNYDecModelMouseClicked(evt);
            }
        });

        lblNYModel.setBackground(new java.awt.Color(113, 132, 137));
        lblNYModel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYModel.setForeground(new java.awt.Color(255, 255, 255));
        lblNYModel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYModel.setText(" ");
        lblNYModel.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYModel.setOpaque(true);

        btnNYIncModel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnNYIncModel.setForeground(new java.awt.Color(255, 255, 255));
        btnNYIncModel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnNYIncModel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNYIncModelMouseClicked(evt);
            }
        });

        imgNYCAM.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgNYCAM.setForeground(new java.awt.Color(255, 255, 255));
        imgNYCAM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgNYCAM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        imgNYModelProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgNYModelProg.setForeground(new java.awt.Color(255, 255, 255));
        imgNYModelProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnNYModelFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnNYModelFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnNYModelFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNYModelFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnNYModelFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnNYModelFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNYModelFinishMouseClicked(evt);
            }
        });

        jLabel278.setBackground(new java.awt.Color(113, 132, 137));
        jLabel278.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel278.setForeground(new java.awt.Color(255, 255, 255));
        jLabel278.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel278.setText("Wind Tunnel");
        jLabel278.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel278.setOpaque(true);

        btnNYDecWind.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnNYDecWind.setForeground(new java.awt.Color(255, 255, 255));
        btnNYDecWind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnNYDecWind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNYDecWindMouseClicked(evt);
            }
        });

        lblNYWind.setBackground(new java.awt.Color(113, 132, 137));
        lblNYWind.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYWind.setForeground(new java.awt.Color(255, 255, 255));
        lblNYWind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYWind.setText(" ");
        lblNYWind.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYWind.setOpaque(true);

        btnNYIncWind.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnNYIncWind.setForeground(new java.awt.Color(255, 255, 255));
        btnNYIncWind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnNYIncWind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNYIncWindMouseClicked(evt);
            }
        });

        imgNYTunnel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgNYTunnel.setForeground(new java.awt.Color(255, 255, 255));
        imgNYTunnel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgNYTunnel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        imgNYWindProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgNYWindProg.setForeground(new java.awt.Color(255, 255, 255));
        imgNYWindProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnNYWindFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnNYWindFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnNYWindFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNYWindFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnNYWindFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnNYWindFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNYWindFinishMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel260, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel278, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNYDecWind)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNYWind, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNYIncWind)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgNYTunnel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgNYWindProg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNYWindFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel273, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNYDecModel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNYModel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNYIncModel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgNYCAM, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgNYModelProg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNYModelFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel268, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNYDecCFD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNYCFD, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNYIncCFD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgNYSupercomputer, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgNYCFDProg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNYCFDFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(jLabel263, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNYDecDes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNYDes, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNYIncDes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(imgNYCAD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(imgNYDesProg))
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(jLabel261, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(172, 172, 172)
                                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel262, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(btnNYDesFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel260)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel262, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel261)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNYDesFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgNYDesProg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgNYCAD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNYDecDes)
                    .addComponent(lblNYDes)
                    .addComponent(btnNYIncDes)
                    .addComponent(jLabel263))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNYCFDFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgNYCFDProg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgNYSupercomputer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNYDecCFD)
                    .addComponent(lblNYCFD)
                    .addComponent(btnNYIncCFD)
                    .addComponent(jLabel268))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNYModelFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgNYModelProg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgNYCAM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNYDecModel)
                    .addComponent(lblNYModel)
                    .addComponent(btnNYIncModel)
                    .addComponent(jLabel273))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNYWindFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(imgNYWindProg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgNYTunnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(btnNYDecWind)
                        .addComponent(lblNYWind)
                        .addComponent(btnNYIncWind))
                    .addComponent(jLabel278))
                .addGap(57, 57, 57))
        );

        pnlNYChassis.add(jPanel17);

        jTabbedPane1.addTab("2020 Chassis", pnlNYChassis);

        jPanel4.setBackground(new java.awt.Color(88, 103, 108));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(2, 1));

        jPanel18.setOpaque(false);
        jPanel18.setLayout(new java.awt.GridLayout(1, 2, 10, 10));

        jPanel19.setOpaque(false);

        jLabel252.setBackground(new java.awt.Color(113, 132, 137));
        jLabel252.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel252.setForeground(new java.awt.Color(255, 255, 255));
        jLabel252.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel252.setText("Designers");
        jLabel252.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel252.setOpaque(true);

        jLabel253.setBackground(new java.awt.Color(113, 132, 137));
        jLabel253.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel253.setForeground(new java.awt.Color(255, 255, 255));
        jLabel253.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel253.setText("Available");
        jLabel253.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel253.setOpaque(true);

        lblTechAvail.setBackground(new java.awt.Color(113, 132, 137));
        lblTechAvail.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTechAvail.setForeground(new java.awt.Color(255, 255, 255));
        lblTechAvail.setText(" ");
        lblTechAvail.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTechAvail.setOpaque(true);

        lblTechCYTitle.setBackground(new java.awt.Color(113, 132, 137));
        lblTechCYTitle.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTechCYTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTechCYTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTechCYTitle.setText("2019 Chassis");
        lblTechCYTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTechCYTitle.setOpaque(true);

        lblTechCY.setBackground(new java.awt.Color(113, 132, 137));
        lblTechCY.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTechCY.setForeground(new java.awt.Color(255, 255, 255));
        lblTechCY.setText(" ");
        lblTechCY.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTechCY.setOpaque(true);

        lblTechNYTitle.setBackground(new java.awt.Color(113, 132, 137));
        lblTechNYTitle.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTechNYTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTechNYTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTechNYTitle.setText("2020 Chassis");
        lblTechNYTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTechNYTitle.setOpaque(true);

        lblTechNY.setBackground(new java.awt.Color(113, 132, 137));
        lblTechNY.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTechNY.setForeground(new java.awt.Color(255, 255, 255));
        lblTechNY.setText(" ");
        lblTechNY.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTechNY.setOpaque(true);

        jLabel288.setBackground(new java.awt.Color(113, 132, 137));
        jLabel288.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel288.setForeground(new java.awt.Color(255, 255, 255));
        jLabel288.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel288.setText("Technology");
        jLabel288.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel288.setOpaque(true);

        lblTechTech.setBackground(new java.awt.Color(113, 132, 137));
        lblTechTech.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTechTech.setForeground(new java.awt.Color(255, 255, 255));
        lblTechTech.setText(" ");
        lblTechTech.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTechTech.setOpaque(true);

        jLabel290.setBackground(new java.awt.Color(113, 132, 137));
        jLabel290.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel290.setForeground(new java.awt.Color(255, 255, 255));
        jLabel290.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel290.setText("Driving Aids");
        jLabel290.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel290.setOpaque(true);

        lblTechAids.setBackground(new java.awt.Color(113, 132, 137));
        lblTechAids.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTechAids.setForeground(new java.awt.Color(255, 255, 255));
        lblTechAids.setText(" ");
        lblTechAids.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTechAids.setOpaque(true);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel252, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(lblTechNYTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTechNY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel253, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTechAvail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(lblTechCYTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTechCY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel288, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTechTech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel290, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTechAids, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel252)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel253, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTechAvail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTechCYTitle)
                    .addComponent(lblTechCY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTechNYTitle)
                    .addComponent(lblTechNY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel288)
                    .addComponent(lblTechTech))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel290)
                    .addComponent(lblTechAids))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel18.add(jPanel19);

        jPanel21.setOpaque(false);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );

        jPanel18.add(jPanel21);

        jPanel4.add(jPanel18);

        jPanel20.setOpaque(false);

        imgBrakePerf.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgBrakePerf.setForeground(new java.awt.Color(255, 255, 255));
        imgBrakePerf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgBrakePerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        jLabel321.setBackground(new java.awt.Color(113, 132, 137));
        jLabel321.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel321.setForeground(new java.awt.Color(255, 255, 255));
        jLabel321.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel321.setText("Brakes");
        jLabel321.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel321.setOpaque(true);

        btnDecBrake.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecBrake.setForeground(new java.awt.Color(255, 255, 255));
        btnDecBrake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecBrake.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecBrakeMouseClicked(evt);
            }
        });

        lblBrake.setBackground(new java.awt.Color(113, 132, 137));
        lblBrake.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblBrake.setForeground(new java.awt.Color(255, 255, 255));
        lblBrake.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBrake.setText(" ");
        lblBrake.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblBrake.setOpaque(true);

        btnIncBrake.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncBrake.setForeground(new java.awt.Color(255, 255, 255));
        btnIncBrake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncBrake.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncBrakeMouseClicked(evt);
            }
        });

        btnBrakePerf.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnBrakePerf.setForeground(new java.awt.Color(255, 255, 255));
        btnBrakePerf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBrakePerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnBrakePerf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnBrakePerf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBrakePerfMouseClicked(evt);
            }
        });

        imgBrakeRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgBrakeRel.setForeground(new java.awt.Color(255, 255, 255));
        imgBrakeRel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgBrakeRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        btnBrakeRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnBrakeRel.setForeground(new java.awt.Color(255, 255, 255));
        btnBrakeRel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBrakeRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnBrakeRel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnBrakeRel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBrakeRelMouseClicked(evt);
            }
        });

        imgBrakeProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgBrakeProg.setForeground(new java.awt.Color(255, 255, 255));
        imgBrakeProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnBrakeFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnBrakeFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnBrakeFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBrakeFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnBrakeFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnBrakeFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBrakeFinishMouseClicked(evt);
            }
        });

        jLabel355.setBackground(new java.awt.Color(113, 132, 137));
        jLabel355.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel355.setForeground(new java.awt.Color(255, 255, 255));
        jLabel355.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel355.setText("Component");
        jLabel355.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel355.setOpaque(true);

        jLabel356.setBackground(new java.awt.Color(113, 132, 137));
        jLabel356.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel356.setForeground(new java.awt.Color(255, 255, 255));
        jLabel356.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel356.setText("Reliability");
        jLabel356.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel356.setOpaque(true);

        jLabel357.setBackground(new java.awt.Color(113, 132, 137));
        jLabel357.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel357.setForeground(new java.awt.Color(255, 255, 255));
        jLabel357.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel357.setText("Performance");
        jLabel357.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel357.setOpaque(true);

        jLabel358.setBackground(new java.awt.Color(113, 132, 137));
        jLabel358.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel358.setForeground(new java.awt.Color(255, 255, 255));
        jLabel358.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel358.setText("Progress");
        jLabel358.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel358.setOpaque(true);

        jLabel365.setBackground(new java.awt.Color(113, 132, 137));
        jLabel365.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel365.setForeground(new java.awt.Color(255, 255, 255));
        jLabel365.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel365.setText("Clutch");
        jLabel365.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel365.setOpaque(true);

        btnDecClutch.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecClutch.setForeground(new java.awt.Color(255, 255, 255));
        btnDecClutch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecClutch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecClutchMouseClicked(evt);
            }
        });

        lblClutch.setBackground(new java.awt.Color(113, 132, 137));
        lblClutch.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblClutch.setForeground(new java.awt.Color(255, 255, 255));
        lblClutch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClutch.setText(" ");
        lblClutch.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblClutch.setOpaque(true);

        btnIncClutch.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncClutch.setForeground(new java.awt.Color(255, 255, 255));
        btnIncClutch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncClutch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncClutchMouseClicked(evt);
            }
        });

        imgClutchPerf.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgClutchPerf.setForeground(new java.awt.Color(255, 255, 255));
        imgClutchPerf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgClutchPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        btnClutchPerf.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnClutchPerf.setForeground(new java.awt.Color(255, 255, 255));
        btnClutchPerf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClutchPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnClutchPerf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnClutchPerf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClutchPerfMouseClicked(evt);
            }
        });

        imgClutchRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgClutchRel.setForeground(new java.awt.Color(255, 255, 255));
        imgClutchRel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgClutchRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        btnClutchRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnClutchRel.setForeground(new java.awt.Color(255, 255, 255));
        btnClutchRel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClutchRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnClutchRel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnClutchRel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClutchRelMouseClicked(evt);
            }
        });

        imgClutchProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgClutchProg.setForeground(new java.awt.Color(255, 255, 255));
        imgClutchProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnClutchFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnClutchFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnClutchFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClutchFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnClutchFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnClutchFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClutchFinishMouseClicked(evt);
            }
        });

        btnDecGear.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecGear.setForeground(new java.awt.Color(255, 255, 255));
        btnDecGear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecGear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecGearMouseClicked(evt);
            }
        });

        btnIncGear.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncGear.setForeground(new java.awt.Color(255, 255, 255));
        btnIncGear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncGear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncGearMouseClicked(evt);
            }
        });

        btnGearPerf.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnGearPerf.setForeground(new java.awt.Color(255, 255, 255));
        btnGearPerf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGearPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnGearPerf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnGearPerf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGearPerfMouseClicked(evt);
            }
        });

        imgGearPerf.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgGearPerf.setForeground(new java.awt.Color(255, 255, 255));
        imgGearPerf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgGearPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        btnGearRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnGearRel.setForeground(new java.awt.Color(255, 255, 255));
        btnGearRel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGearRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnGearRel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnGearRel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGearRelMouseClicked(evt);
            }
        });

        btnGearFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnGearFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnGearFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGearFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnGearFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnGearFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGearFinishMouseClicked(evt);
            }
        });

        lblGear.setBackground(new java.awt.Color(113, 132, 137));
        lblGear.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblGear.setForeground(new java.awt.Color(255, 255, 255));
        lblGear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGear.setText(" ");
        lblGear.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblGear.setOpaque(true);

        imgGearRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgGearRel.setForeground(new java.awt.Color(255, 255, 255));
        imgGearRel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgGearRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        jLabel372.setBackground(new java.awt.Color(113, 132, 137));
        jLabel372.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel372.setForeground(new java.awt.Color(255, 255, 255));
        jLabel372.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel372.setText("Gearbox");
        jLabel372.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel372.setOpaque(true);

        imgGearProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgGearProg.setForeground(new java.awt.Color(255, 255, 255));
        imgGearProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnDecHyd.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecHyd.setForeground(new java.awt.Color(255, 255, 255));
        btnDecHyd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecHyd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecHydMouseClicked(evt);
            }
        });

        btnIncHyd.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncHyd.setForeground(new java.awt.Color(255, 255, 255));
        btnIncHyd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncHyd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncHydMouseClicked(evt);
            }
        });

        imgHydProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgHydProg.setForeground(new java.awt.Color(255, 255, 255));
        imgHydProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        imgHydRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgHydRel.setForeground(new java.awt.Color(255, 255, 255));
        imgHydRel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgHydRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        btnHydPerf.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnHydPerf.setForeground(new java.awt.Color(255, 255, 255));
        btnHydPerf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHydPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnHydPerf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnHydPerf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHydPerfMouseClicked(evt);
            }
        });

        btnHydRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnHydRel.setForeground(new java.awt.Color(255, 255, 255));
        btnHydRel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHydRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnHydRel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnHydRel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHydRelMouseClicked(evt);
            }
        });

        btnHydFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnHydFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnHydFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHydFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnHydFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnHydFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHydFinishMouseClicked(evt);
            }
        });

        imgHydPerf.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgHydPerf.setForeground(new java.awt.Color(255, 255, 255));
        imgHydPerf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgHydPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        jLabel397.setBackground(new java.awt.Color(113, 132, 137));
        jLabel397.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel397.setForeground(new java.awt.Color(255, 255, 255));
        jLabel397.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel397.setText("Hydraulics");
        jLabel397.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel397.setOpaque(true);

        lblHyd.setBackground(new java.awt.Color(113, 132, 137));
        lblHyd.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblHyd.setForeground(new java.awt.Color(255, 255, 255));
        lblHyd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHyd.setText(" ");
        lblHyd.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblHyd.setOpaque(true);

        imgSuspRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSuspRel.setForeground(new java.awt.Color(255, 255, 255));
        imgSuspRel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSuspRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        lblSusp.setBackground(new java.awt.Color(113, 132, 137));
        lblSusp.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSusp.setForeground(new java.awt.Color(255, 255, 255));
        lblSusp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSusp.setText(" ");
        lblSusp.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSusp.setOpaque(true);

        btnSuspRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnSuspRel.setForeground(new java.awt.Color(255, 255, 255));
        btnSuspRel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSuspRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnSuspRel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnSuspRel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuspRelMouseClicked(evt);
            }
        });

        btnSuspFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnSuspFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnSuspFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSuspFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnSuspFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnSuspFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuspFinishMouseClicked(evt);
            }
        });

        imgSuspProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSuspProg.setForeground(new java.awt.Color(255, 255, 255));
        imgSuspProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnSuspPerf.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnSuspPerf.setForeground(new java.awt.Color(255, 255, 255));
        btnSuspPerf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSuspPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnSuspPerf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnSuspPerf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuspPerfMouseClicked(evt);
            }
        });

        imgSuspPerf.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSuspPerf.setForeground(new java.awt.Color(255, 255, 255));
        imgSuspPerf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSuspPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        btnIncSusp.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncSusp.setForeground(new java.awt.Color(255, 255, 255));
        btnIncSusp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncSusp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncSuspMouseClicked(evt);
            }
        });

        jLabel401.setBackground(new java.awt.Color(113, 132, 137));
        jLabel401.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel401.setForeground(new java.awt.Color(255, 255, 255));
        jLabel401.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel401.setText("Suspension");
        jLabel401.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel401.setOpaque(true);

        btnDecSusp.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecSusp.setForeground(new java.awt.Color(255, 255, 255));
        btnDecSusp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecSusp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecSuspMouseClicked(evt);
            }
        });

        btnThrPerf.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnThrPerf.setForeground(new java.awt.Color(255, 255, 255));
        btnThrPerf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnThrPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnThrPerf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnThrPerf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThrPerfMouseClicked(evt);
            }
        });

        jLabel403.setBackground(new java.awt.Color(113, 132, 137));
        jLabel403.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel403.setForeground(new java.awt.Color(255, 255, 255));
        jLabel403.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel403.setText("Throttle");
        jLabel403.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel403.setOpaque(true);

        imgThrPerf.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgThrPerf.setForeground(new java.awt.Color(255, 255, 255));
        imgThrPerf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgThrPerf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        imgThrProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgThrProg.setForeground(new java.awt.Color(255, 255, 255));
        imgThrProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnIncThr.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncThr.setForeground(new java.awt.Color(255, 255, 255));
        btnIncThr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncThr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncThrMouseClicked(evt);
            }
        });

        imgThrRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgThrRel.setForeground(new java.awt.Color(255, 255, 255));
        imgThrRel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgThrRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        lblThr.setBackground(new java.awt.Color(113, 132, 137));
        lblThr.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblThr.setForeground(new java.awt.Color(255, 255, 255));
        lblThr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThr.setText(" ");
        lblThr.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblThr.setOpaque(true);

        btnThrFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnThrFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnThrFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnThrFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnThrFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnThrFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThrFinishMouseClicked(evt);
            }
        });

        btnThrRel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnThrRel.setForeground(new java.awt.Color(255, 255, 255));
        btnThrRel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnThrRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnThrRel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnThrRel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThrRelMouseClicked(evt);
            }
        });

        btnDecThr.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecThr.setForeground(new java.awt.Color(255, 255, 255));
        btnDecThr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecThr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecThrMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel321, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecBrake)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBrake, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncBrake))
                    .addComponent(jLabel355, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel365, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecClutch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblClutch, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncClutch))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel372, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecGear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGear, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncGear))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel397, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecHyd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHyd, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncHyd))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel401, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecSusp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSusp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncSusp))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel403, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecThr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblThr, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncThr)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(imgBrakePerf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBrakePerf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel357, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(imgClutchPerf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClutchPerf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(imgGearPerf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGearPerf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(imgHydPerf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHydPerf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(imgSuspPerf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSuspPerf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(imgThrPerf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThrPerf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(imgBrakeRel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBrakeRel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel356, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(imgClutchRel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClutchRel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(imgGearRel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGearRel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(imgHydRel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHydRel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(imgSuspRel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSuspRel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(imgThrRel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThrRel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imgBrakeProg)
                    .addComponent(jLabel358, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgClutchProg)
                    .addComponent(imgGearProg)
                    .addComponent(imgHydProg)
                    .addComponent(imgSuspProg)
                    .addComponent(imgThrProg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBrakeFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClutchFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGearFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHydFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuspFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThrFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel355, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel356, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel357, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel358, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBrakeFinish, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgBrakeProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBrakeRel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgBrakeRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBrakePerf, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgBrakePerf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncBrake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBrake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDecBrake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel321, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnClutchFinish, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgClutchProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClutchRel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgClutchRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClutchPerf, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgClutchPerf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncClutch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblClutch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDecClutch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel365, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGearFinish, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgGearProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGearRel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgGearRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGearPerf, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgGearPerf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncGear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDecGear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel372, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHydFinish, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgHydProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHydRel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgHydRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHydPerf, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgHydPerf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncHyd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHyd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDecHyd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel397, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSuspFinish, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgSuspProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSuspRel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgSuspRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSuspPerf, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgSuspPerf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncSusp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSusp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDecSusp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel401, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThrFinish, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgThrProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThrRel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgThrRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThrPerf, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(imgThrPerf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncThr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblThr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDecThr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel403, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(220, 220, 220))
        );

        jPanel4.add(jPanel20);

        jTabbedPane1.addTab("Technology", jPanel4);

        jPanel5.setBackground(new java.awt.Color(88, 103, 108));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridLayout(2, 1, 10, 10));

        jPanel22.setOpaque(false);
        jPanel22.setLayout(new java.awt.GridLayout(1, 2, 10, 10));

        jPanel24.setOpaque(false);

        jLabel293.setBackground(new java.awt.Color(113, 132, 137));
        jLabel293.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel293.setForeground(new java.awt.Color(255, 255, 255));
        jLabel293.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel293.setText("Designers");
        jLabel293.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel293.setOpaque(true);

        jLabel294.setBackground(new java.awt.Color(113, 132, 137));
        jLabel294.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel294.setForeground(new java.awt.Color(255, 255, 255));
        jLabel294.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel294.setText("Available");
        jLabel294.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel294.setOpaque(true);

        lblAidsAvail.setBackground(new java.awt.Color(113, 132, 137));
        lblAidsAvail.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblAidsAvail.setForeground(new java.awt.Color(255, 255, 255));
        lblAidsAvail.setText(" ");
        lblAidsAvail.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblAidsAvail.setOpaque(true);

        lblAidsCYTitle.setBackground(new java.awt.Color(113, 132, 137));
        lblAidsCYTitle.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblAidsCYTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblAidsCYTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAidsCYTitle.setText("2019 Chassis");
        lblAidsCYTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblAidsCYTitle.setOpaque(true);

        lblAidsCY.setBackground(new java.awt.Color(113, 132, 137));
        lblAidsCY.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblAidsCY.setForeground(new java.awt.Color(255, 255, 255));
        lblAidsCY.setText(" ");
        lblAidsCY.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblAidsCY.setOpaque(true);

        lblAidsNYTitle.setBackground(new java.awt.Color(113, 132, 137));
        lblAidsNYTitle.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblAidsNYTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblAidsNYTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAidsNYTitle.setText("2020 Chassis");
        lblAidsNYTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblAidsNYTitle.setOpaque(true);

        lblAidsNY.setBackground(new java.awt.Color(113, 132, 137));
        lblAidsNY.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblAidsNY.setForeground(new java.awt.Color(255, 255, 255));
        lblAidsNY.setText(" ");
        lblAidsNY.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblAidsNY.setOpaque(true);

        jLabel300.setBackground(new java.awt.Color(113, 132, 137));
        jLabel300.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel300.setForeground(new java.awt.Color(255, 255, 255));
        jLabel300.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel300.setText("Technology");
        jLabel300.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel300.setOpaque(true);

        lblAidsTech.setBackground(new java.awt.Color(113, 132, 137));
        lblAidsTech.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblAidsTech.setForeground(new java.awt.Color(255, 255, 255));
        lblAidsTech.setText(" ");
        lblAidsTech.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblAidsTech.setOpaque(true);

        jLabel302.setBackground(new java.awt.Color(113, 132, 137));
        jLabel302.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel302.setForeground(new java.awt.Color(255, 255, 255));
        jLabel302.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel302.setText("Driving Aids");
        jLabel302.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel302.setOpaque(true);

        lblAidsAids.setBackground(new java.awt.Color(113, 132, 137));
        lblAidsAids.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblAidsAids.setForeground(new java.awt.Color(255, 255, 255));
        lblAidsAids.setText(" ");
        lblAidsAids.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblAidsAids.setOpaque(true);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel293, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(lblAidsNYTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAidsNY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel294, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAidsAvail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(lblAidsCYTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAidsCY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel300, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAidsTech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel302, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAidsAids, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel293)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel294, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAidsAvail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAidsCYTitle)
                    .addComponent(lblAidsCY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAidsNYTitle)
                    .addComponent(lblAidsNY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel300)
                    .addComponent(lblAidsTech))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel302)
                    .addComponent(lblAidsAids))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel22.add(jPanel24);

        jPanel25.setOpaque(false);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel25);

        jPanel5.add(jPanel22);

        jPanel23.setOpaque(false);

        jLabel306.setBackground(new java.awt.Color(113, 132, 137));
        jLabel306.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel306.setForeground(new java.awt.Color(255, 255, 255));
        jLabel306.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel306.setText("Active Suspension");
        jLabel306.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel306.setOpaque(true);

        btnDecAS.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecAS.setForeground(new java.awt.Color(255, 255, 255));
        btnDecAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecASMouseClicked(evt);
            }
        });

        lblAS.setBackground(new java.awt.Color(113, 132, 137));
        lblAS.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblAS.setForeground(new java.awt.Color(255, 255, 255));
        lblAS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAS.setText(" ");
        lblAS.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblAS.setOpaque(true);

        btnIncAS.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncAS.setForeground(new java.awt.Color(255, 255, 255));
        btnIncAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncASMouseClicked(evt);
            }
        });

        imgASLevel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgASLevel.setForeground(new java.awt.Color(255, 255, 255));
        imgASLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgASLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        btnASStart.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnASStart.setForeground(new java.awt.Color(255, 255, 255));
        btnASStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnASStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnASStart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnASStart.setPreferredSize(new java.awt.Dimension(126, 24));
        btnASStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnASStartMouseClicked(evt);
            }
        });

        imgASProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgASProg.setForeground(new java.awt.Color(255, 255, 255));
        imgASProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnASFinish.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnASFinish.setForeground(new java.awt.Color(255, 255, 255));
        btnASFinish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnASFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnASFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnASFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnASFinishMouseClicked(evt);
            }
        });

        btnASLegal.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnASLegal.setForeground(new java.awt.Color(255, 255, 255));
        btnASLegal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnASLegal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnASLegal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        jLabel318.setBackground(new java.awt.Color(113, 132, 137));
        jLabel318.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel318.setForeground(new java.awt.Color(255, 255, 255));
        jLabel318.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel318.setText("Level");
        jLabel318.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel318.setOpaque(true);

        jLabel319.setBackground(new java.awt.Color(113, 132, 137));
        jLabel319.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel319.setForeground(new java.awt.Color(255, 255, 255));
        jLabel319.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel319.setText("Build");
        jLabel319.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel319.setOpaque(true);

        jLabel320.setBackground(new java.awt.Color(113, 132, 137));
        jLabel320.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel320.setForeground(new java.awt.Color(255, 255, 255));
        jLabel320.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel320.setText("FIA");
        jLabel320.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel320.setOpaque(true);

        jLabel359.setBackground(new java.awt.Color(113, 132, 137));
        jLabel359.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel359.setForeground(new java.awt.Color(255, 255, 255));
        jLabel359.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel359.setText("Automatic Gears");
        jLabel359.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel359.setOpaque(true);

        btnDecAG.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecAG.setForeground(new java.awt.Color(255, 255, 255));
        btnDecAG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecAG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecAGMouseClicked(evt);
            }
        });

        lblAG.setBackground(new java.awt.Color(113, 132, 137));
        lblAG.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblAG.setForeground(new java.awt.Color(255, 255, 255));
        lblAG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAG.setText(" ");
        lblAG.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblAG.setOpaque(true);

        btnIncAG.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncAG.setForeground(new java.awt.Color(255, 255, 255));
        btnIncAG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncAG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncAGMouseClicked(evt);
            }
        });

        imgAGLevel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgAGLevel.setForeground(new java.awt.Color(255, 255, 255));
        imgAGLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgAGLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        btnAGStart.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnAGStart.setForeground(new java.awt.Color(255, 255, 255));
        btnAGStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAGStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnAGStart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnAGStart.setPreferredSize(new java.awt.Dimension(126, 24));
        btnAGStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAGStartMouseClicked(evt);
            }
        });

        imgAGProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgAGProg.setForeground(new java.awt.Color(255, 255, 255));
        imgAGProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnAGProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnAGProg.setForeground(new java.awt.Color(255, 255, 255));
        btnAGProg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAGProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnAGProg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnAGProg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAGProgMouseClicked(evt);
            }
        });

        btnAGLegal.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnAGLegal.setForeground(new java.awt.Color(255, 255, 255));
        btnAGLegal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAGLegal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnAGLegal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        btnDecPB.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecPB.setForeground(new java.awt.Color(255, 255, 255));
        btnDecPB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecPB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecPBMouseClicked(evt);
            }
        });

        imgPBLevel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgPBLevel.setForeground(new java.awt.Color(255, 255, 255));
        imgPBLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPBLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        btnPBProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnPBProg.setForeground(new java.awt.Color(255, 255, 255));
        btnPBProg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPBProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnPBProg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnPBProg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPBProgMouseClicked(evt);
            }
        });

        btnPBStart.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnPBStart.setForeground(new java.awt.Color(255, 255, 255));
        btnPBStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPBStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnPBStart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnPBStart.setPreferredSize(new java.awt.Dimension(126, 24));
        btnPBStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPBStartMouseClicked(evt);
            }
        });

        btnIncPB.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncPB.setForeground(new java.awt.Color(255, 255, 255));
        btnIncPB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncPB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncPBMouseClicked(evt);
            }
        });

        jLabel383.setBackground(new java.awt.Color(113, 132, 137));
        jLabel383.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel383.setForeground(new java.awt.Color(255, 255, 255));
        jLabel383.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel383.setText("Power Brakes");
        jLabel383.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel383.setOpaque(true);

        lblPB.setBackground(new java.awt.Color(113, 132, 137));
        lblPB.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblPB.setForeground(new java.awt.Color(255, 255, 255));
        lblPB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPB.setText(" ");
        lblPB.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblPB.setOpaque(true);

        imgPBProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgPBProg.setForeground(new java.awt.Color(255, 255, 255));
        imgPBProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnPBLegal.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnPBLegal.setForeground(new java.awt.Color(255, 255, 255));
        btnPBLegal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPBLegal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnPBLegal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        imgTCProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgTCProg.setForeground(new java.awt.Color(255, 255, 255));
        imgTCProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        imgTCLevel.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgTCLevel.setForeground(new java.awt.Color(255, 255, 255));
        imgTCLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgTCLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N

        btnTCLegal.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTCLegal.setForeground(new java.awt.Color(255, 255, 255));
        btnTCLegal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTCLegal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnTCLegal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        btnTCProg.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTCProg.setForeground(new java.awt.Color(255, 255, 255));
        btnTCProg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTCProg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnTCProg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnTCProg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTCProgMouseClicked(evt);
            }
        });

        btnIncTC.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncTC.setForeground(new java.awt.Color(255, 255, 255));
        btnIncTC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncTC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncTCMouseClicked(evt);
            }
        });

        btnTCStart.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnTCStart.setForeground(new java.awt.Color(255, 255, 255));
        btnTCStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTCStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnTCStart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        btnTCStart.setPreferredSize(new java.awt.Dimension(126, 24));
        btnTCStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTCStartMouseClicked(evt);
            }
        });

        lblTC.setBackground(new java.awt.Color(113, 132, 137));
        lblTC.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTC.setForeground(new java.awt.Color(255, 255, 255));
        lblTC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTC.setText(" ");
        lblTC.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTC.setOpaque(true);

        jLabel394.setBackground(new java.awt.Color(113, 132, 137));
        jLabel394.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel394.setForeground(new java.awt.Color(255, 255, 255));
        jLabel394.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel394.setText("Traction Control");
        jLabel394.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel394.setOpaque(true);

        btnDecTC.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecTC.setForeground(new java.awt.Color(255, 255, 255));
        btnDecTC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecTC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecTCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel306, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecAS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAS, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncAS))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel359, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecAG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAG, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncAG))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel383, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecPB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncPB))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel394, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecTC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTC, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncTC)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(imgASLevel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnASStart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel318, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(imgAGLevel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAGStart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(imgPBLevel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPBStart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(imgTCLevel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTCStart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgASProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgAGProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgPBProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgTCProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel319, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnASFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAGProg, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPBProg, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTCProg, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnASLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnAGLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel320)
                    .addComponent(btnTCLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnPBLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(75, 75, 75))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel318, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel319, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel320, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAS, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnDecAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgASProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnASFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnASLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgASLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnASStart, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel306, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAG, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnDecAG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgAGProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAGProg, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnAGLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncAG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgAGLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAGStart, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel359, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPB, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnDecPB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgPBProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPBProg, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnPBLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncPB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgPBLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPBStart, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel383, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTC, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnDecTC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgTCProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTCProg, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnTCLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncTC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgTCLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTCStart, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel394, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(209, 209, 209))
        );

        jPanel5.add(jPanel23);

        jTabbedPane1.addTab("Driving Aids", jPanel5);

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

    private void btnCYStartWorkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCYStartWorkMouseClicked
        if (FullGame.data.findPlayerTeam().tstResDone == true && FullGame.data.findPlayerTeam().tstDevDone == true && FullGame.data.findPlayerTeam().currentDevCY == null) {
            FullGame.data.findPlayerTeam().tstResDone = false;
            FullGame.data.findPlayerTeam().tstDevDone = false;
            FullGame.data.findPlayerTeam().cyStage = 1;
            FullGame.data.findPlayerTeam().currentDevCY = new ChassisDev(FullGame.data.findPlayerTeam().currentYearChassis);
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnCYStartWorkMouseClicked

    private void btnCYDecDesignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCYDecDesignMouseClicked
        if (FullGame.data.findPlayerTeam().cyStage == 1) {
            if (FullGame.data.findPlayerTeam().desCY > 0) {
                FullGame.data.findPlayerTeam().desCY--;
                FullGame.data.findPlayerTeam().desAvail++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnCYDecDesignMouseClicked

    private void btnCYDecCFDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCYDecCFDMouseClicked
        if (FullGame.data.findPlayerTeam().cyStage == 2) {
            if (FullGame.data.findPlayerTeam().desCY > 0) {
                FullGame.data.findPlayerTeam().desCY--;
                FullGame.data.findPlayerTeam().desAvail++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnCYDecCFDMouseClicked

    private void btnCYDecModelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCYDecModelMouseClicked
        if (FullGame.data.findPlayerTeam().cyStage == 3) {
            if (FullGame.data.findPlayerTeam().desCY > 0) {
                FullGame.data.findPlayerTeam().desCY--;
                FullGame.data.findPlayerTeam().desAvail++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnCYDecModelMouseClicked

    private void btnCYDecWindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCYDecWindMouseClicked
        if (FullGame.data.findPlayerTeam().cyStage == 4) {
            if (FullGame.data.findPlayerTeam().desCY > 0) {
                FullGame.data.findPlayerTeam().desCY--;
                FullGame.data.findPlayerTeam().desAvail++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnCYDecWindMouseClicked

    private void btnCYIncDesignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCYIncDesignMouseClicked
        if (FullGame.data.findPlayerTeam().cyStage == 1) {
            if (FullGame.data.findPlayerTeam().desAvail > 0) {
                FullGame.data.findPlayerTeam().desCY++;
                FullGame.data.findPlayerTeam().desAvail--;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnCYIncDesignMouseClicked

    private void btnCYIncCFDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCYIncCFDMouseClicked
        if (FullGame.data.findPlayerTeam().cyStage == 2) {
            if (FullGame.data.findPlayerTeam().desAvail > 0) {
                FullGame.data.findPlayerTeam().desCY++;
                FullGame.data.findPlayerTeam().desAvail--;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnCYIncCFDMouseClicked

    private void btnCYIncModelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCYIncModelMouseClicked
        if (FullGame.data.findPlayerTeam().cyStage == 3) {
            if (FullGame.data.findPlayerTeam().desAvail > 0) {
                FullGame.data.findPlayerTeam().desCY++;
                FullGame.data.findPlayerTeam().desAvail--;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnCYIncModelMouseClicked

    private void btnCYIncWindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCYIncWindMouseClicked
        if (FullGame.data.findPlayerTeam().cyStage == 4) {
            if (FullGame.data.findPlayerTeam().desAvail > 0) {
                FullGame.data.findPlayerTeam().desCY++;
                FullGame.data.findPlayerTeam().desAvail--;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnCYIncWindMouseClicked

    private void btnCYDesignFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCYDesignFinishMouseClicked
        if (FullGame.data.findPlayerTeam().cyStage == 1) {
            if (FullGame.data.findPlayerTeam().currentDevCY.designProg > 0) {
                FullGame.data.findPlayerTeam().desAvail -= FullGame.data.findPlayerTeam().desCY;
                FullGame.data.findPlayerTeam().desCY = 0;
                FullGame.data.findPlayerTeam().cyStage++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnCYDesignFinishMouseClicked

    private void btnCYCFDFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCYCFDFinishMouseClicked
        if (FullGame.data.findPlayerTeam().cyStage == 2) {
            if (FullGame.data.findPlayerTeam().currentDevCY.cfdProg > 0) {
                FullGame.data.findPlayerTeam().desAvail -= FullGame.data.findPlayerTeam().desCY;
                FullGame.data.findPlayerTeam().desCY = 0;
                FullGame.data.findPlayerTeam().cyStage++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnCYCFDFinishMouseClicked

    private void btnCYModelFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCYModelFinishMouseClicked
        if (FullGame.data.findPlayerTeam().cyStage == 3) {
            if (FullGame.data.findPlayerTeam().currentDevCY.modelProg > 0) {
                FullGame.data.findPlayerTeam().desAvail -= FullGame.data.findPlayerTeam().desCY;
                FullGame.data.findPlayerTeam().desCY = 0;
                FullGame.data.findPlayerTeam().cyStage++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnCYModelFinishMouseClicked

    private void btnCYWindFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCYWindFinishMouseClicked
        if (FullGame.data.findPlayerTeam().cyStage == 4) {
            if (FullGame.data.findPlayerTeam().currentDevCY.windProg > 0) {
                FullGame.data.findPlayerTeam().desAvail -= FullGame.data.findPlayerTeam().desCY;
                FullGame.data.findPlayerTeam().desCY = 0;
                FullGame.data.findPlayerTeam().cyStage = 0;
                FullGame.data.findPlayerTeam().currentDevCY.completeChassis();
                FullGame.data.findPlayerTeam().currentYearChassis = FullGame.data.findPlayerTeam().currentDevCY.chassis;
                FullGame.data.findPlayerTeam().currentDevCY = null;
                FullGame.data.findPlayerTeam().upgradeAvail = 7;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnCYWindFinishMouseClicked

    private void btnNYStartWorkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNYStartWorkMouseClicked
        if (FullGame.data.findPlayerTeam().currentDevNY == null) {
            FullGame.data.findPlayerTeam().nyStage = 1;
            FullGame.data.findPlayerTeam().currentDevNY = new ChassisDev();
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnNYStartWorkMouseClicked

    private void btnNYDecDesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNYDecDesMouseClicked
        if (FullGame.data.findPlayerTeam().nyStage == 1) {
            if (FullGame.data.findPlayerTeam().desNY > 0) {
                FullGame.data.findPlayerTeam().desNY--;
                FullGame.data.findPlayerTeam().desAvail++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnNYDecDesMouseClicked

    private void btnNYDecCFDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNYDecCFDMouseClicked
        if (FullGame.data.findPlayerTeam().nyStage == 2) {
            if (FullGame.data.findPlayerTeam().desNY > 0) {
                FullGame.data.findPlayerTeam().desNY--;
                FullGame.data.findPlayerTeam().desAvail++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnNYDecCFDMouseClicked

    private void btnNYDecModelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNYDecModelMouseClicked
        if (FullGame.data.findPlayerTeam().nyStage == 3) {
            if (FullGame.data.findPlayerTeam().desNY > 0) {
                FullGame.data.findPlayerTeam().desNY--;
                FullGame.data.findPlayerTeam().desAvail++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnNYDecModelMouseClicked

    private void btnNYDecWindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNYDecWindMouseClicked
        if (FullGame.data.findPlayerTeam().nyStage == 4) {
            if (FullGame.data.findPlayerTeam().desNY > 0) {
                FullGame.data.findPlayerTeam().desNY--;
                FullGame.data.findPlayerTeam().desAvail++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnNYDecWindMouseClicked

    private void btnNYIncDesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNYIncDesMouseClicked
        if (FullGame.data.findPlayerTeam().nyStage == 1) {
            if (FullGame.data.findPlayerTeam().desAvail > 0) {
                FullGame.data.findPlayerTeam().desNY++;
                FullGame.data.findPlayerTeam().desAvail--;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnNYIncDesMouseClicked

    private void btnNYIncCFDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNYIncCFDMouseClicked
        if (FullGame.data.findPlayerTeam().nyStage == 2) {
            if (FullGame.data.findPlayerTeam().desAvail > 0) {
                FullGame.data.findPlayerTeam().desNY++;
                FullGame.data.findPlayerTeam().desAvail--;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnNYIncCFDMouseClicked

    private void btnNYIncModelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNYIncModelMouseClicked
        if (FullGame.data.findPlayerTeam().nyStage == 3) {
            if (FullGame.data.findPlayerTeam().desAvail > 0) {
                FullGame.data.findPlayerTeam().desNY++;
                FullGame.data.findPlayerTeam().desAvail--;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnNYIncModelMouseClicked

    private void btnNYIncWindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNYIncWindMouseClicked
        if (FullGame.data.findPlayerTeam().nyStage == 4) {
            if (FullGame.data.findPlayerTeam().desAvail > 0) {
                FullGame.data.findPlayerTeam().desNY++;
                FullGame.data.findPlayerTeam().desAvail--;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnNYIncWindMouseClicked

    private void btnNYDesFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNYDesFinishMouseClicked
        if (FullGame.data.findPlayerTeam().nyStage == 1) {
            if (FullGame.data.findPlayerTeam().currentDevNY.designProg > 0) {
                FullGame.data.findPlayerTeam().desAvail -= FullGame.data.findPlayerTeam().desNY;
                FullGame.data.findPlayerTeam().desNY = 0;
                FullGame.data.findPlayerTeam().nyStage++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnNYDesFinishMouseClicked

    private void btnNYCFDFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNYCFDFinishMouseClicked
        if (FullGame.data.findPlayerTeam().nyStage == 2) {
            if (FullGame.data.findPlayerTeam().currentDevNY.cfdProg > 0) {
                FullGame.data.findPlayerTeam().desAvail -= FullGame.data.findPlayerTeam().desNY;
                FullGame.data.findPlayerTeam().desNY = 0;
                FullGame.data.findPlayerTeam().nyStage++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnNYCFDFinishMouseClicked

    private void btnNYModelFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNYModelFinishMouseClicked
        if (FullGame.data.findPlayerTeam().nyStage == 3) {
            if (FullGame.data.findPlayerTeam().currentDevNY.modelProg > 0) {
                FullGame.data.findPlayerTeam().desAvail -= FullGame.data.findPlayerTeam().desNY;
                FullGame.data.findPlayerTeam().desNY = 0;
                FullGame.data.findPlayerTeam().nyStage++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnNYModelFinishMouseClicked

    private void btnNYWindFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNYWindFinishMouseClicked
        if (FullGame.data.findPlayerTeam().nyStage == 4) {
            if (FullGame.data.findPlayerTeam().currentDevNY.windProg > 0) {
                FullGame.data.findPlayerTeam().desAvail -= FullGame.data.findPlayerTeam().desNY;
                FullGame.data.findPlayerTeam().desNY = 0;
                FullGame.data.findPlayerTeam().nyStage = 0;
                FullGame.data.findPlayerTeam().currentDevNY.completeChassis();
                FullGame.data.findPlayerTeam().nextYearChassis = FullGame.data.findPlayerTeam().currentDevNY.chassis;
                FullGame.data.findPlayerTeam().currentDevNY = null;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnNYWindFinishMouseClicked

    private void btnDecBrakeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecBrakeMouseClicked
        if (FullGame.data.findPlayerTeam().techInProd == 1 || FullGame.data.findPlayerTeam().techInProd == 7) {
            if (FullGame.data.findPlayerTeam().desTech > 0) {
                FullGame.data.findPlayerTeam().desTech--;
                FullGame.data.findPlayerTeam().desAvail++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecBrakeMouseClicked

    private void btnDecClutchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecClutchMouseClicked
        if (FullGame.data.findPlayerTeam().techInProd == 2 || FullGame.data.findPlayerTeam().techInProd == 8) {
            if (FullGame.data.findPlayerTeam().desTech > 0) {
                FullGame.data.findPlayerTeam().desTech--;
                FullGame.data.findPlayerTeam().desAvail++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecClutchMouseClicked

    private void btnDecGearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecGearMouseClicked
        if (FullGame.data.findPlayerTeam().techInProd == 3 || FullGame.data.findPlayerTeam().techInProd == 9) {
            if (FullGame.data.findPlayerTeam().desTech > 0) {
                FullGame.data.findPlayerTeam().desTech--;
                FullGame.data.findPlayerTeam().desAvail++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecGearMouseClicked

    private void btnDecHydMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecHydMouseClicked
        if (FullGame.data.findPlayerTeam().techInProd == 4 || FullGame.data.findPlayerTeam().techInProd == 10) {
            if (FullGame.data.findPlayerTeam().desTech > 0) {
                FullGame.data.findPlayerTeam().desTech--;
                FullGame.data.findPlayerTeam().desAvail++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecHydMouseClicked

    private void btnDecSuspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecSuspMouseClicked
        if (FullGame.data.findPlayerTeam().techInProd == 5 || FullGame.data.findPlayerTeam().techInProd == 11) {
            if (FullGame.data.findPlayerTeam().desTech > 0) {
                FullGame.data.findPlayerTeam().desTech--;
                FullGame.data.findPlayerTeam().desAvail++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecSuspMouseClicked

    private void btnDecThrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecThrMouseClicked
        if (FullGame.data.findPlayerTeam().techInProd == 6 || FullGame.data.findPlayerTeam().techInProd == 12) {
            if (FullGame.data.findPlayerTeam().desTech > 0) {
                FullGame.data.findPlayerTeam().desTech--;
                FullGame.data.findPlayerTeam().desAvail++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecThrMouseClicked

    private void btnIncBrakeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncBrakeMouseClicked
        if (FullGame.data.findPlayerTeam().techInProd == 1 || FullGame.data.findPlayerTeam().techInProd == 7) {
            if (FullGame.data.findPlayerTeam().desAvail > 0) {
                FullGame.data.findPlayerTeam().desAvail--;
                FullGame.data.findPlayerTeam().desTech++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncBrakeMouseClicked

    private void btnIncClutchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncClutchMouseClicked
        if (FullGame.data.findPlayerTeam().techInProd == 2 || FullGame.data.findPlayerTeam().techInProd == 8) {
            if (FullGame.data.findPlayerTeam().desAvail > 0) {
                FullGame.data.findPlayerTeam().desAvail--;
                FullGame.data.findPlayerTeam().desTech++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncClutchMouseClicked

    private void btnIncGearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncGearMouseClicked
        if (FullGame.data.findPlayerTeam().techInProd == 3 || FullGame.data.findPlayerTeam().techInProd == 9) {
            if (FullGame.data.findPlayerTeam().desAvail > 0) {
                FullGame.data.findPlayerTeam().desAvail--;
                FullGame.data.findPlayerTeam().desTech++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncGearMouseClicked

    private void btnIncHydMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncHydMouseClicked
        if (FullGame.data.findPlayerTeam().techInProd == 4 || FullGame.data.findPlayerTeam().techInProd == 10) {
            if (FullGame.data.findPlayerTeam().desAvail > 0) {
                FullGame.data.findPlayerTeam().desAvail--;
                FullGame.data.findPlayerTeam().desTech++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncHydMouseClicked

    private void btnIncSuspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncSuspMouseClicked
        if (FullGame.data.findPlayerTeam().techInProd == 5 || FullGame.data.findPlayerTeam().techInProd == 11) {
            if (FullGame.data.findPlayerTeam().desAvail > 0) {
                FullGame.data.findPlayerTeam().desAvail--;
                FullGame.data.findPlayerTeam().desTech++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncSuspMouseClicked

    private void btnIncThrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncThrMouseClicked
        if (FullGame.data.findPlayerTeam().techInProd == 6 || FullGame.data.findPlayerTeam().techInProd == 12) {
            if (FullGame.data.findPlayerTeam().desAvail > 0) {
                FullGame.data.findPlayerTeam().desAvail--;
                FullGame.data.findPlayerTeam().desTech++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncThrMouseClicked

    private void btnBrakePerfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBrakePerfMouseClicked
        if (FullGame.data.findPlayerTeam().brakes.performance < 5 && FullGame.data.findPlayerTeam().techInProd == 0) {
            FullGame.data.findPlayerTeam().techInProd = 1;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnBrakePerfMouseClicked

    private void btnClutchPerfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClutchPerfMouseClicked
        if (FullGame.data.findPlayerTeam().clutch.performance < 5 && FullGame.data.findPlayerTeam().techInProd == 0) {
            FullGame.data.findPlayerTeam().techInProd = 2;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnClutchPerfMouseClicked

    private void btnGearPerfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGearPerfMouseClicked
        if (FullGame.data.findPlayerTeam().gearbox.performance < 5 && FullGame.data.findPlayerTeam().techInProd == 0) {
            FullGame.data.findPlayerTeam().techInProd = 3;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnGearPerfMouseClicked

    private void btnHydPerfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHydPerfMouseClicked
        if (FullGame.data.findPlayerTeam().hydraulics.performance < 5 && FullGame.data.findPlayerTeam().techInProd == 0) {
            FullGame.data.findPlayerTeam().techInProd = 4;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnHydPerfMouseClicked

    private void btnSuspPerfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuspPerfMouseClicked
        if (FullGame.data.findPlayerTeam().suspension.performance < 5 && FullGame.data.findPlayerTeam().techInProd == 0) {
            FullGame.data.findPlayerTeam().techInProd = 5;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnSuspPerfMouseClicked

    private void btnThrPerfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThrPerfMouseClicked
        if (FullGame.data.findPlayerTeam().throttle.performance < 5 && FullGame.data.findPlayerTeam().techInProd == 0) {
            FullGame.data.findPlayerTeam().techInProd = 6;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnThrPerfMouseClicked

    private void btnBrakeRelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBrakeRelMouseClicked
        if (FullGame.data.findPlayerTeam().brakes.reliability < 5 && FullGame.data.findPlayerTeam().techInProd == 0) {
            FullGame.data.findPlayerTeam().techInProd = 7;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnBrakeRelMouseClicked

    private void btnClutchRelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClutchRelMouseClicked
        if (FullGame.data.findPlayerTeam().clutch.reliability < 5 && FullGame.data.findPlayerTeam().techInProd == 0) {
            FullGame.data.findPlayerTeam().techInProd = 8;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnClutchRelMouseClicked

    private void btnGearRelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGearRelMouseClicked
        if (FullGame.data.findPlayerTeam().gearbox.reliability < 5 && FullGame.data.findPlayerTeam().techInProd == 0) {
            FullGame.data.findPlayerTeam().techInProd = 9;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnGearRelMouseClicked

    private void btnHydRelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHydRelMouseClicked
        if (FullGame.data.findPlayerTeam().hydraulics.reliability < 5 && FullGame.data.findPlayerTeam().techInProd == 0) {
            FullGame.data.findPlayerTeam().techInProd = 10;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnHydRelMouseClicked

    private void btnSuspRelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuspRelMouseClicked
        if (FullGame.data.findPlayerTeam().suspension.reliability < 5 && FullGame.data.findPlayerTeam().techInProd == 0) {
            FullGame.data.findPlayerTeam().techInProd = 11;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnSuspRelMouseClicked

    private void btnThrRelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThrRelMouseClicked
        if (FullGame.data.findPlayerTeam().throttle.reliability < 5 && FullGame.data.findPlayerTeam().techInProd == 0) {
            FullGame.data.findPlayerTeam().techInProd = 12;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnThrRelMouseClicked

    private void btnBrakeFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBrakeFinishMouseClicked
        if (FullGame.data.findPlayerTeam().techInProd == 1 || FullGame.data.findPlayerTeam().techInProd == 7) {
            if (FullGame.data.findPlayerTeam().techProg == 10) {
                if (FullGame.data.findPlayerTeam().techInProd == 1) {
                    FullGame.data.findPlayerTeam().brakes = new Brakes(FullGame.data.findPlayerTeam().brakes.performance + 1, FullGame.data.findPlayerTeam().brakes.reliability);
                }
                if (FullGame.data.findPlayerTeam().techInProd == 7) {
                    FullGame.data.findPlayerTeam().brakes = new Brakes(FullGame.data.findPlayerTeam().brakes.performance, FullGame.data.findPlayerTeam().brakes.reliability + 1);
                }
            
            FullGame.data.findPlayerTeam().techProg = 0;
            FullGame.data.findPlayerTeam().desAvail += FullGame.data.findPlayerTeam().desTech;
            FullGame.data.findPlayerTeam().desTech = 0;
            FullGame.data.findPlayerTeam().techInProd = 0;
            FullGame.data.findPlayerTeam().upgradeAvail = 1;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnBrakeFinishMouseClicked

    private void btnClutchFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClutchFinishMouseClicked
        if (FullGame.data.findPlayerTeam().techInProd == 2 || FullGame.data.findPlayerTeam().techInProd == 8) {
            if (FullGame.data.findPlayerTeam().techProg == 10) {
                if (FullGame.data.findPlayerTeam().techInProd == 2) {
                    FullGame.data.findPlayerTeam().clutch = new Clutch(FullGame.data.findPlayerTeam().clutch.performance + 1, FullGame.data.findPlayerTeam().clutch.reliability);
                }
                if (FullGame.data.findPlayerTeam().techInProd == 8) {
                    FullGame.data.findPlayerTeam().clutch = new Clutch(FullGame.data.findPlayerTeam().clutch.performance, FullGame.data.findPlayerTeam().clutch.reliability + 1);
                }
            
            FullGame.data.findPlayerTeam().techProg = 0;
            FullGame.data.findPlayerTeam().desAvail += FullGame.data.findPlayerTeam().desTech;
            FullGame.data.findPlayerTeam().desTech = 0;
            FullGame.data.findPlayerTeam().techInProd = 0;
            FullGame.data.findPlayerTeam().upgradeAvail = 2;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnClutchFinishMouseClicked

    private void btnGearFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGearFinishMouseClicked
        if (FullGame.data.findPlayerTeam().techInProd == 3 || FullGame.data.findPlayerTeam().techInProd == 9) {
            if (FullGame.data.findPlayerTeam().techProg == 10) {
                if (FullGame.data.findPlayerTeam().techInProd == 3) {
                    FullGame.data.findPlayerTeam().gearbox = new Gearbox(FullGame.data.findPlayerTeam().gearbox.performance + 1, FullGame.data.findPlayerTeam().gearbox.reliability);
                }
                if (FullGame.data.findPlayerTeam().techInProd == 9) {
                    FullGame.data.findPlayerTeam().gearbox = new Gearbox(FullGame.data.findPlayerTeam().gearbox.performance, FullGame.data.findPlayerTeam().gearbox.reliability + 1);
                }
            
            FullGame.data.findPlayerTeam().techProg = 0;
            FullGame.data.findPlayerTeam().desAvail += FullGame.data.findPlayerTeam().desTech;
            FullGame.data.findPlayerTeam().desTech = 0;
            FullGame.data.findPlayerTeam().techInProd = 0;
            FullGame.data.findPlayerTeam().upgradeAvail = 3;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnGearFinishMouseClicked

    private void btnHydFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHydFinishMouseClicked
        if (FullGame.data.findPlayerTeam().techInProd == 4 || FullGame.data.findPlayerTeam().techInProd == 10) {
            if (FullGame.data.findPlayerTeam().techProg == 10) {
                if (FullGame.data.findPlayerTeam().techInProd == 4) {
                    FullGame.data.findPlayerTeam().hydraulics = new Hydraulics(FullGame.data.findPlayerTeam().hydraulics.performance + 1, FullGame.data.findPlayerTeam().hydraulics.reliability);
                }
                if (FullGame.data.findPlayerTeam().techInProd == 10) {
                    FullGame.data.findPlayerTeam().hydraulics = new Hydraulics(FullGame.data.findPlayerTeam().hydraulics.performance, FullGame.data.findPlayerTeam().hydraulics.reliability + 1);
                }
            
            FullGame.data.findPlayerTeam().techProg = 0;
            FullGame.data.findPlayerTeam().desAvail += FullGame.data.findPlayerTeam().desTech;
            FullGame.data.findPlayerTeam().desTech = 0;
            FullGame.data.findPlayerTeam().techInProd = 0;
            FullGame.data.findPlayerTeam().upgradeAvail = 4;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnHydFinishMouseClicked

    private void btnSuspFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuspFinishMouseClicked
        if (FullGame.data.findPlayerTeam().techInProd == 5 || FullGame.data.findPlayerTeam().techInProd == 11) {
            if (FullGame.data.findPlayerTeam().techProg == 10) {
                if (FullGame.data.findPlayerTeam().techInProd == 5) {
                    FullGame.data.findPlayerTeam().suspension = new Suspension(FullGame.data.findPlayerTeam().suspension.performance + 1, FullGame.data.findPlayerTeam().suspension.reliability);
                }
                if (FullGame.data.findPlayerTeam().techInProd == 11) {
                    FullGame.data.findPlayerTeam().suspension = new Suspension(FullGame.data.findPlayerTeam().suspension.performance, FullGame.data.findPlayerTeam().suspension.reliability + 1);
                }
            
            FullGame.data.findPlayerTeam().techProg = 0;
            FullGame.data.findPlayerTeam().desAvail += FullGame.data.findPlayerTeam().desTech;
            FullGame.data.findPlayerTeam().desTech = 0;
            FullGame.data.findPlayerTeam().techInProd = 0;
            FullGame.data.findPlayerTeam().upgradeAvail = 5;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnSuspFinishMouseClicked

    private void btnThrFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThrFinishMouseClicked
        if (FullGame.data.findPlayerTeam().techInProd == 6 || FullGame.data.findPlayerTeam().techInProd == 12) {
            if (FullGame.data.findPlayerTeam().techProg == 10) {
                if (FullGame.data.findPlayerTeam().techInProd == 6) {
                    FullGame.data.findPlayerTeam().throttle = new Throttle(FullGame.data.findPlayerTeam().throttle.performance + 1, FullGame.data.findPlayerTeam().throttle.reliability);
                }
                if (FullGame.data.findPlayerTeam().techInProd == 12) {
                    FullGame.data.findPlayerTeam().throttle = new Throttle(FullGame.data.findPlayerTeam().throttle.performance, FullGame.data.findPlayerTeam().throttle.reliability + 1);
                }
            
            FullGame.data.findPlayerTeam().techProg = 0;
            FullGame.data.findPlayerTeam().desAvail += FullGame.data.findPlayerTeam().desTech;
            FullGame.data.findPlayerTeam().desTech = 0;
            FullGame.data.findPlayerTeam().techInProd = 0;
            FullGame.data.findPlayerTeam().upgradeAvail = 6;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnThrFinishMouseClicked

    private void btnDecASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecASMouseClicked
        if (FullGame.data.findPlayerTeam().aidInProd == 1) {
            if (FullGame.data.findPlayerTeam().desAids > 0) {
                FullGame.data.findPlayerTeam().desAids--;
                FullGame.data.findPlayerTeam().desAvail++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecASMouseClicked

    private void btnDecAGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecAGMouseClicked
        if (FullGame.data.findPlayerTeam().aidInProd == 2) {
            if (FullGame.data.findPlayerTeam().desAids > 0) {
                FullGame.data.findPlayerTeam().desAids--;
                FullGame.data.findPlayerTeam().desAvail++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecAGMouseClicked

    private void btnDecPBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecPBMouseClicked
        if (FullGame.data.findPlayerTeam().aidInProd == 3) {
            if (FullGame.data.findPlayerTeam().desAids > 0) {
                FullGame.data.findPlayerTeam().desAids--;
                FullGame.data.findPlayerTeam().desAvail++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecPBMouseClicked

    private void btnDecTCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecTCMouseClicked
        if (FullGame.data.findPlayerTeam().aidInProd == 4) {
            if (FullGame.data.findPlayerTeam().desAids > 0) {
                FullGame.data.findPlayerTeam().desAids--;
                FullGame.data.findPlayerTeam().desAvail++;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecTCMouseClicked

    private void btnIncASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncASMouseClicked
        if (FullGame.data.findPlayerTeam().aidInProd == 1) {
            if (FullGame.data.findPlayerTeam().desAvail > 0) {
                FullGame.data.findPlayerTeam().desAids++;
                FullGame.data.findPlayerTeam().desAvail--;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncASMouseClicked

    private void btnIncAGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncAGMouseClicked
        if (FullGame.data.findPlayerTeam().aidInProd == 2) {
            if (FullGame.data.findPlayerTeam().desAvail > 0) {
                FullGame.data.findPlayerTeam().desAids++;
                FullGame.data.findPlayerTeam().desAvail--;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncAGMouseClicked

    private void btnIncPBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncPBMouseClicked
        if (FullGame.data.findPlayerTeam().aidInProd == 3) {
            if (FullGame.data.findPlayerTeam().desAvail > 0) {
                FullGame.data.findPlayerTeam().desAids++;
                FullGame.data.findPlayerTeam().desAvail--;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncPBMouseClicked

    private void btnIncTCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncTCMouseClicked
        if (FullGame.data.findPlayerTeam().aidInProd == 4) {
            if (FullGame.data.findPlayerTeam().desAvail > 0) {
                FullGame.data.findPlayerTeam().desAids++;
                FullGame.data.findPlayerTeam().desAvail--;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncTCMouseClicked

    private void btnASStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnASStartMouseClicked
        if (FullGame.data.findPlayerTeam().activesusp.level < 5 && FullGame.data.findPlayerTeam().aidInProd == 0) {
            FullGame.data.findPlayerTeam().aidInProd = 1;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnASStartMouseClicked

    private void btnAGStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAGStartMouseClicked
        if (FullGame.data.findPlayerTeam().autogears.level < 5 && FullGame.data.findPlayerTeam().aidInProd == 0) {
            FullGame.data.findPlayerTeam().aidInProd = 2;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnAGStartMouseClicked

    private void btnPBStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPBStartMouseClicked
        if (FullGame.data.findPlayerTeam().powerbrakes.level < 5 && FullGame.data.findPlayerTeam().aidInProd == 0) {
            FullGame.data.findPlayerTeam().aidInProd = 3;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnPBStartMouseClicked

    private void btnTCStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTCStartMouseClicked
        if (FullGame.data.findPlayerTeam().tractioncontrol.level < 5 && FullGame.data.findPlayerTeam().aidInProd == 0) {
            FullGame.data.findPlayerTeam().aidInProd = 4;
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTCStartMouseClicked

    private void btnASFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnASFinishMouseClicked
        if (FullGame.data.findPlayerTeam().aidInProd == 1) {
            if (FullGame.data.findPlayerTeam().aidProg == 10) {
                FullGame.data.findPlayerTeam().activesusp = new ActiveSusp(FullGame.data.findPlayerTeam().activesusp.level + 1, true);
                FullGame.data.findPlayerTeam().aidInProd = 0;
                FullGame.data.findPlayerTeam().aidAvail = 1;
                FullGame.data.findPlayerTeam().aidProg = 0;
                FullGame.data.findPlayerTeam().desAvail -= FullGame.data.findPlayerTeam().desAids;
                FullGame.data.findPlayerTeam().desAids = 0;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnASFinishMouseClicked

    private void btnAGProgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAGProgMouseClicked
        if (FullGame.data.findPlayerTeam().aidInProd == 2) {
            if (FullGame.data.findPlayerTeam().aidProg == 10) {
                FullGame.data.findPlayerTeam().autogears = new AutoGears(FullGame.data.findPlayerTeam().autogears.level + 1, true);
                FullGame.data.findPlayerTeam().aidInProd = 0;
                FullGame.data.findPlayerTeam().aidAvail = 2;
                FullGame.data.findPlayerTeam().aidProg = 0;
                FullGame.data.findPlayerTeam().desAvail -= FullGame.data.findPlayerTeam().desAids;
                FullGame.data.findPlayerTeam().desAids = 0;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnAGProgMouseClicked

    private void btnPBProgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPBProgMouseClicked
        if (FullGame.data.findPlayerTeam().aidInProd == 3) {
            if (FullGame.data.findPlayerTeam().aidProg == 10) {
                FullGame.data.findPlayerTeam().powerbrakes = new PowerBrakes(FullGame.data.findPlayerTeam().powerbrakes.level + 1, true);
                FullGame.data.findPlayerTeam().aidInProd = 0;
                FullGame.data.findPlayerTeam().aidAvail = 3;
                FullGame.data.findPlayerTeam().aidProg = 0;
                FullGame.data.findPlayerTeam().desAvail -= FullGame.data.findPlayerTeam().desAids;
                FullGame.data.findPlayerTeam().desAids = 0;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnPBProgMouseClicked

    private void btnTCProgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTCProgMouseClicked
        if (FullGame.data.findPlayerTeam().aidInProd == 4) {
            if (FullGame.data.findPlayerTeam().aidProg == 10) {
                FullGame.data.findPlayerTeam().tractioncontrol = new TractionControl(FullGame.data.findPlayerTeam().tractioncontrol.level + 1, true);
                FullGame.data.findPlayerTeam().aidInProd = 0;
                FullGame.data.findPlayerTeam().aidAvail = 4;
                FullGame.data.findPlayerTeam().aidProg = 0;
                FullGame.data.findPlayerTeam().desAvail -= FullGame.data.findPlayerTeam().desAids;
                FullGame.data.findPlayerTeam().desAids = 0;
            }
        }
        FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnTCProgMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAGLegal;
    private javax.swing.JLabel btnAGProg;
    private javax.swing.JLabel btnAGStart;
    private javax.swing.JLabel btnASFinish;
    private javax.swing.JLabel btnASLegal;
    private javax.swing.JLabel btnASStart;
    private javax.swing.JLabel btnBrakeFinish;
    private javax.swing.JLabel btnBrakePerf;
    private javax.swing.JLabel btnBrakeRel;
    private javax.swing.JLabel btnCYCFDFinish;
    private javax.swing.JLabel btnCYDecCFD;
    private javax.swing.JLabel btnCYDecDesign;
    private javax.swing.JLabel btnCYDecModel;
    private javax.swing.JLabel btnCYDecWind;
    private javax.swing.JLabel btnCYDesignFinish;
    private javax.swing.JLabel btnCYIncCFD;
    private javax.swing.JLabel btnCYIncDesign;
    private javax.swing.JLabel btnCYIncModel;
    private javax.swing.JLabel btnCYIncWind;
    private javax.swing.JLabel btnCYModelFinish;
    private javax.swing.JLabel btnCYStartWork;
    private javax.swing.JLabel btnCYWindFinish;
    private javax.swing.JLabel btnClutchFinish;
    private javax.swing.JLabel btnClutchPerf;
    private javax.swing.JLabel btnClutchRel;
    private javax.swing.JLabel btnDecAG;
    private javax.swing.JLabel btnDecAS;
    private javax.swing.JLabel btnDecBrake;
    private javax.swing.JLabel btnDecClutch;
    private javax.swing.JLabel btnDecGear;
    private javax.swing.JLabel btnDecHyd;
    private javax.swing.JLabel btnDecPB;
    private javax.swing.JLabel btnDecSusp;
    private javax.swing.JLabel btnDecTC;
    private javax.swing.JLabel btnDecThr;
    private javax.swing.JLabel btnGearFinish;
    private javax.swing.JLabel btnGearPerf;
    private javax.swing.JLabel btnGearRel;
    private javax.swing.JLabel btnHydFinish;
    private javax.swing.JLabel btnHydPerf;
    private javax.swing.JLabel btnHydRel;
    private javax.swing.JLabel btnIncAG;
    private javax.swing.JLabel btnIncAS;
    private javax.swing.JLabel btnIncBrake;
    private javax.swing.JLabel btnIncClutch;
    private javax.swing.JLabel btnIncGear;
    private javax.swing.JLabel btnIncHyd;
    private javax.swing.JLabel btnIncPB;
    private javax.swing.JLabel btnIncSusp;
    private javax.swing.JLabel btnIncTC;
    private javax.swing.JLabel btnIncThr;
    private javax.swing.JLabel btnNYCFDFinish;
    private javax.swing.JLabel btnNYDecCFD;
    private javax.swing.JLabel btnNYDecDes;
    private javax.swing.JLabel btnNYDecModel;
    private javax.swing.JLabel btnNYDecWind;
    private javax.swing.JLabel btnNYDesFinish;
    private javax.swing.JLabel btnNYIncCFD;
    private javax.swing.JLabel btnNYIncDes;
    private javax.swing.JLabel btnNYIncModel;
    private javax.swing.JLabel btnNYIncWind;
    private javax.swing.JLabel btnNYModelFinish;
    private javax.swing.JLabel btnNYStartWork;
    private javax.swing.JLabel btnNYWindFinish;
    private javax.swing.JLabel btnPBLegal;
    private javax.swing.JLabel btnPBProg;
    private javax.swing.JLabel btnPBStart;
    private javax.swing.JLabel btnSuspFinish;
    private javax.swing.JLabel btnSuspPerf;
    private javax.swing.JLabel btnSuspRel;
    private javax.swing.JLabel btnTCLegal;
    private javax.swing.JLabel btnTCProg;
    private javax.swing.JLabel btnTCStart;
    private javax.swing.JLabel btnThrFinish;
    private javax.swing.JLabel btnThrPerf;
    private javax.swing.JLabel btnThrRel;
    private javax.swing.JLabel imgAGLevel;
    private javax.swing.JLabel imgAGProg;
    private javax.swing.JLabel imgASLevel;
    private javax.swing.JLabel imgASProg;
    private javax.swing.JLabel imgBrakePerf;
    private javax.swing.JLabel imgBrakeProg;
    private javax.swing.JLabel imgBrakeRel;
    private javax.swing.JLabel imgCYCAD;
    private javax.swing.JLabel imgCYCAM;
    private javax.swing.JLabel imgCYCFDProg;
    private javax.swing.JLabel imgCYDesignProg;
    private javax.swing.JLabel imgCYModelProg;
    private javax.swing.JLabel imgCYSupercomp;
    private javax.swing.JLabel imgCYTesting;
    private javax.swing.JLabel imgCYTunnel;
    private javax.swing.JLabel imgCYWindProg;
    private javax.swing.JLabel imgClutchPerf;
    private javax.swing.JLabel imgClutchProg;
    private javax.swing.JLabel imgClutchRel;
    private javax.swing.JLabel imgGearPerf;
    private javax.swing.JLabel imgGearProg;
    private javax.swing.JLabel imgGearRel;
    private javax.swing.JLabel imgHydPerf;
    private javax.swing.JLabel imgHydProg;
    private javax.swing.JLabel imgHydRel;
    private javax.swing.JLabel imgNYCAD;
    private javax.swing.JLabel imgNYCAM;
    private javax.swing.JLabel imgNYCFDProg;
    private javax.swing.JLabel imgNYDesProg;
    private javax.swing.JLabel imgNYModelProg;
    private javax.swing.JLabel imgNYSupercomputer;
    private javax.swing.JLabel imgNYTunnel;
    private javax.swing.JLabel imgNYWindProg;
    private javax.swing.JLabel imgPBLevel;
    private javax.swing.JLabel imgPBProg;
    private javax.swing.JLabel imgSumAGLevel;
    private javax.swing.JLabel imgSumASLevel;
    private javax.swing.JLabel imgSumBrakeP;
    private javax.swing.JLabel imgSumBrakeR;
    private javax.swing.JLabel imgSumClutchP;
    private javax.swing.JLabel imgSumClutchR;
    private javax.swing.JLabel imgSumGearP;
    private javax.swing.JLabel imgSumGearR;
    private javax.swing.JLabel imgSumHydP;
    private javax.swing.JLabel imgSumHydR;
    private javax.swing.JLabel imgSumPBLevel;
    private javax.swing.JLabel imgSumSuspP;
    private javax.swing.JLabel imgSumSuspR;
    private javax.swing.JLabel imgSumTCLevel;
    private javax.swing.JLabel imgSumThrP;
    private javax.swing.JLabel imgSumThrR;
    private javax.swing.JLabel imgSuspPerf;
    private javax.swing.JLabel imgSuspProg;
    private javax.swing.JLabel imgSuspRel;
    private javax.swing.JLabel imgTCLevel;
    private javax.swing.JLabel imgTCProg;
    private javax.swing.JLabel imgThrPerf;
    private javax.swing.JLabel imgThrProg;
    private javax.swing.JLabel imgThrRel;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel300;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel306;
    private javax.swing.JLabel jLabel318;
    private javax.swing.JLabel jLabel319;
    private javax.swing.JLabel jLabel320;
    private javax.swing.JLabel jLabel321;
    private javax.swing.JLabel jLabel355;
    private javax.swing.JLabel jLabel356;
    private javax.swing.JLabel jLabel357;
    private javax.swing.JLabel jLabel358;
    private javax.swing.JLabel jLabel359;
    private javax.swing.JLabel jLabel365;
    private javax.swing.JLabel jLabel372;
    private javax.swing.JLabel jLabel383;
    private javax.swing.JLabel jLabel394;
    private javax.swing.JLabel jLabel397;
    private javax.swing.JLabel jLabel401;
    private javax.swing.JLabel jLabel403;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAG;
    private javax.swing.JLabel lblAS;
    private javax.swing.JLabel lblAidsAids;
    private javax.swing.JLabel lblAidsAvail;
    private javax.swing.JLabel lblAidsCY;
    private javax.swing.JLabel lblAidsCYTitle;
    private javax.swing.JLabel lblAidsNY;
    private javax.swing.JLabel lblAidsNYTitle;
    private javax.swing.JLabel lblAidsTech;
    private javax.swing.JLabel lblBrake;
    private javax.swing.JLabel lblCYAids;
    private javax.swing.JLabel lblCYAvail;
    private javax.swing.JLabel lblCYCFD;
    private javax.swing.JLabel lblCYCY;
    private javax.swing.JLabel lblCYCYTitle;
    private javax.swing.JLabel lblCYDesign;
    private javax.swing.JLabel lblCYHandling;
    private javax.swing.JLabel lblCYModel;
    private javax.swing.JLabel lblCYNY;
    private javax.swing.JLabel lblCYNYTitle;
    private javax.swing.JLabel lblCYProblem;
    private javax.swing.JLabel lblCYSolution;
    private javax.swing.JLabel lblCYTech;
    private javax.swing.JLabel lblCYWind;
    private javax.swing.JLabel lblClutch;
    private javax.swing.JLabel lblGear;
    private javax.swing.JLabel lblHyd;
    private javax.swing.JLabel lblNYAids;
    private javax.swing.JLabel lblNYAvail;
    private javax.swing.JLabel lblNYCFD;
    private javax.swing.JLabel lblNYCY;
    private javax.swing.JLabel lblNYCYTitle;
    private javax.swing.JLabel lblNYChassisName;
    private javax.swing.JLabel lblNYDes;
    private javax.swing.JLabel lblNYEff;
    private javax.swing.JLabel lblNYModel;
    private javax.swing.JLabel lblNYNY;
    private javax.swing.JLabel lblNYNYTitle;
    private javax.swing.JLabel lblNYRegs;
    private javax.swing.JLabel lblNYRegsTitle;
    private javax.swing.JLabel lblNYTech;
    private javax.swing.JLabel lblNYWind;
    private javax.swing.JLabel lblPB;
    private javax.swing.JLabel lblSumAGLegal;
    private javax.swing.JLabel lblSumASLegal;
    private javax.swing.JLabel lblSumAids;
    private javax.swing.JLabel lblSumAvail;
    private javax.swing.JLabel lblSumCY;
    private javax.swing.JLabel lblSumCYAvailTitle;
    private javax.swing.JLabel lblSumCYHandling;
    private javax.swing.JLabel lblSumCYName;
    private javax.swing.JLabel lblSumCYProj;
    private javax.swing.JLabel lblSumCYTitle;
    private javax.swing.JLabel lblSumNY;
    private javax.swing.JLabel lblSumNYAvailTitle;
    private javax.swing.JLabel lblSumNYEff;
    private javax.swing.JLabel lblSumNYName;
    private javax.swing.JLabel lblSumNYStage;
    private javax.swing.JLabel lblSumNYTitle;
    private javax.swing.JLabel lblSumPBLegal;
    private javax.swing.JLabel lblSumTCLegal;
    private javax.swing.JLabel lblSumTech;
    private javax.swing.JLabel lblSusp;
    private javax.swing.JLabel lblTC;
    private javax.swing.JLabel lblTechAids;
    private javax.swing.JLabel lblTechAvail;
    private javax.swing.JLabel lblTechCY;
    private javax.swing.JLabel lblTechCYTitle;
    private javax.swing.JLabel lblTechNY;
    private javax.swing.JLabel lblTechNYTitle;
    private javax.swing.JLabel lblTechTech;
    private javax.swing.JLabel lblThr;
    private javax.swing.JPanel pnlCYChassis;
    private javax.swing.JPanel pnlNYChassis;
    // End of variables declaration//GEN-END:variables
}
