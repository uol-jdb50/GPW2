/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gui.engineering;

import grandprixworld.gamedata.car.Car;
import grandprixworld.gui.FullGame;
import java.text.DecimalFormat;

/**
 *
 * @author Josh Brookes
 */
public class EnConstruction extends javax.swing.JPanel {
    
    public static int currentCar;
    public static int nextCar;
    public static int chassis;
    public static int tech;
    public static int drivingAids;
    public static int spares;
    
    public static int currentCarReq;
    public static int nextCarReq;
    public static int chassisReq;
    public static int techReq;
    public static int drivingAidsReq;
    public static int sparesReq;
    
    public static int compCurrentCar;
    public static int compNextCar;
    public static int compChassis;
    public static int compTech;
    public static int compDrivingAids;
    public static int compSpares;
    
    private int currentCarCost;
    private int nextCarCost;
    private int chassisCost;
    private int techCost;
    private int aidCost;
    private int spareCost;
    
    /**
     * Creates new form EnConstruction
     */
    public EnConstruction() {
        initComponents();
        currentCar = 0;
        nextCar = 0;
        chassis = 0;
        tech = 0;
        drivingAids = 0;
        spares = 0;
        currentCarCost = 250000;
        nextCarCost = 400000;
        chassisCost = 150000;
        techCost = 50000;
        aidCost = 60000;
        spareCost = 40000;
        updateScreenData();
    }
    
    public static void resetNewWeek() {
        currentCar = 0;
        nextCar = 0;
        chassis = 0;
        tech = 0;
        drivingAids = 0;
        spares = 0;
    }

    public void updateScreenData() {
        DecimalFormat df = new DecimalFormat("$###,###,###");
        lblTechAvail.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().techAvail) + "%");
        lblTechConst.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().cnstStaffUsed) + "%");
        lblCurrentCar.setText("Build " + Integer.toString(grandprixworld.gui.FullGame.data.currentYear) + " Car");
        lblNextCar.setText("Build " + Integer.toString(grandprixworld.gui.FullGame.data.currentYear + 1) + " Car");
        lblChassis.setText("Upgrade " + Integer.toString(grandprixworld.gui.FullGame.data.currentYear) + " Chassis");
        imgSparesAvail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + grandprixworld.gui.FullGame.data.findPlayerTeam().spares + ".png")));
        lblTechCurrentCar.setText(Integer.toString(currentCar) + "%");
        lblTechNextCar.setText(Integer.toString(nextCar) + "%");
        lblTechChassis.setText(Integer.toString(chassis) + "%");
        lblTechTech.setText(Integer.toString(tech) + "%");
        lblTechAids.setText(Integer.toString(drivingAids) + "%");
        lblTechSpares.setText(Integer.toString(spares) + "%");
        
        if (currentCar > 0) lblCostCurrentCar.setText(df.format(currentCarCost));
        else lblCostCurrentCar.setText("$0");
        if (nextCar > 0) lblCostNextCar.setText(df.format(nextCarCost));
        else lblCostNextCar.setText("$0");
        if (chassis > 0) lblCostChassis.setText(df.format(chassisCost));
        else lblCostChassis.setText("$0");
        if (tech > 0) lblCostTech.setText(df.format(techCost));
        else lblCostTech.setText("$0");
        if (drivingAids > 0) lblCostAids.setText(df.format(aidCost));
        else lblCostAids.setText("$0");
        if (spares > 0) lblCostSpares.setText(df.format(spareCost));
        else lblCostSpares.setText("$0");
        
        currentCarReq = techReqConst(1);
        nextCarReq = techReqConst(2);
        chassisReq = techReqConst(3);
        techReq = techReqConst(4);
        drivingAidsReq = techReqConst(5);
        sparesReq = techReqConst(6);
        
        compCurrentCar = currentCar * 100 / currentCarReq;
        compNextCar = nextCar * 100 / nextCarReq;
        compChassis = chassis * 100 / chassisReq;
        compTech = tech * 100 / techReq;
        compDrivingAids = drivingAids * 100 / drivingAidsReq;
        compSpares = spares * 100 / sparesReq;
        
        lblCompCurrentCar.setText(Integer.toString(compCurrentCar) + "%");
        lblCompNextCar.setText(Integer.toString(compNextCar) + "%");
        lblCompChassis.setText(Integer.toString(compChassis) + "%");
        lblCompTech.setText(Integer.toString(compTech) + "%");
        lblCompAids.setText(Integer.toString(compDrivingAids) + "%");
        lblCompSpares.setText(Integer.toString(compSpares) + "%");
    }
    
    private static int techReqConst(int part) {
        switch (part) {
            case 1:
                return (120 * 100) / grandprixworld.gui.FullGame.data.findPlayerTeam().getWorkforce(3);
            case 2:
                return (140 * 100) / grandprixworld.gui.FullGame.data.findPlayerTeam().getWorkforce(3);
            case 3:
                return (90 * 100) / grandprixworld.gui.FullGame.data.findPlayerTeam().getWorkforce(3);
            case 4:
                return (55 * 100) / grandprixworld.gui.FullGame.data.findPlayerTeam().getWorkforce(3);
            case 5:
                return (60 * 100) / grandprixworld.gui.FullGame.data.findPlayerTeam().getWorkforce(3);
            case 6:
                return (20 * 100) / grandprixworld.gui.FullGame.data.findPlayerTeam().getWorkforce(3);
            default:
                return 0;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel293 = new javax.swing.JLabel();
        jLabel294 = new javax.swing.JLabel();
        lblTechAvail = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        lblTechConst = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        imgSparesAvail = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel298 = new javax.swing.JLabel();
        jLabel366 = new javax.swing.JLabel();
        jLabel368 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        lblCurrentCar = new javax.swing.JLabel();
        btnDecTechCurrentCar = new javax.swing.JLabel();
        lblTechCurrentCar = new javax.swing.JLabel();
        btnIncTechCurrentCar = new javax.swing.JLabel();
        lblCostCurrentCar = new javax.swing.JLabel();
        lblCompCurrentCar = new javax.swing.JLabel();
        btnFinishCurrentCar = new javax.swing.JLabel();
        btnIncTechNextCar = new javax.swing.JLabel();
        lblNextCar = new javax.swing.JLabel();
        btnFinishNextCar = new javax.swing.JLabel();
        lblCostNextCar = new javax.swing.JLabel();
        lblCompNextCar = new javax.swing.JLabel();
        btnDecTechNextCar = new javax.swing.JLabel();
        lblTechNextCar = new javax.swing.JLabel();
        btnFinishChassis = new javax.swing.JLabel();
        btnDecTechChassis = new javax.swing.JLabel();
        lblCostChassis = new javax.swing.JLabel();
        lblCompChassis = new javax.swing.JLabel();
        btnIncTechChassis = new javax.swing.JLabel();
        lblTechChassis = new javax.swing.JLabel();
        lblChassis = new javax.swing.JLabel();
        lblCompTech = new javax.swing.JLabel();
        btnDecTechTech = new javax.swing.JLabel();
        btnIncTechTech = new javax.swing.JLabel();
        lblTechTech = new javax.swing.JLabel();
        lblCostTech = new javax.swing.JLabel();
        jLabel303 = new javax.swing.JLabel();
        btnFinishTech = new javax.swing.JLabel();
        btnFinishAids = new javax.swing.JLabel();
        btnDecTechAids = new javax.swing.JLabel();
        btnIncTechAids = new javax.swing.JLabel();
        lblCostAids = new javax.swing.JLabel();
        jLabel304 = new javax.swing.JLabel();
        lblCompAids = new javax.swing.JLabel();
        lblTechAids = new javax.swing.JLabel();
        lblCostSpares = new javax.swing.JLabel();
        lblTechSpares = new javax.swing.JLabel();
        btnFinishSpares = new javax.swing.JLabel();
        btnDecTechSpares = new javax.swing.JLabel();
        btnIncTechSpares = new javax.swing.JLabel();
        lblCompSpares = new javax.swing.JLabel();
        jLabel305 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(88, 103, 108));
        setForeground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1100, 550));
        setMinimumSize(new java.awt.Dimension(1100, 550));
        setPreferredSize(new java.awt.Dimension(1100, 550));
        setLayout(new java.awt.GridLayout(2, 1, 10, 10));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(1, 2, 10, 10));

        jPanel3.setOpaque(false);

        jLabel293.setBackground(new java.awt.Color(113, 132, 137));
        jLabel293.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel293.setForeground(new java.awt.Color(255, 255, 255));
        jLabel293.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel293.setText("Engineers");
        jLabel293.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel293.setOpaque(true);

        jLabel294.setBackground(new java.awt.Color(113, 132, 137));
        jLabel294.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel294.setForeground(new java.awt.Color(255, 255, 255));
        jLabel294.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel294.setText("Available");
        jLabel294.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel294.setOpaque(true);

        lblTechAvail.setBackground(new java.awt.Color(113, 132, 137));
        lblTechAvail.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTechAvail.setForeground(new java.awt.Color(255, 255, 255));
        lblTechAvail.setText(" ");
        lblTechAvail.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTechAvail.setOpaque(true);

        jLabel296.setBackground(new java.awt.Color(113, 132, 137));
        jLabel296.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel296.setForeground(new java.awt.Color(255, 255, 255));
        jLabel296.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel296.setText("Construction");
        jLabel296.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel296.setOpaque(true);

        lblTechConst.setBackground(new java.awt.Color(113, 132, 137));
        lblTechConst.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTechConst.setForeground(new java.awt.Color(255, 255, 255));
        lblTechConst.setText(" ");
        lblTechConst.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTechConst.setOpaque(true);

        jLabel118.setBackground(new java.awt.Color(113, 132, 137));
        jLabel118.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel118.setText("Spares Available");
        jLabel118.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel118.setOpaque(true);

        imgSparesAvail.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgSparesAvail.setForeground(new java.awt.Color(255, 255, 255));
        imgSparesAvail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSparesAvail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel293, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel296, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(jLabel294, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTechAvail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTechConst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imgSparesAvail)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel293)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel294)
                    .addComponent(lblTechAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel296)
                    .addComponent(lblTechConst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel118, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imgSparesAvail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel3);

        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);

        add(jPanel1);

        jPanel2.setOpaque(false);

        jLabel298.setBackground(new java.awt.Color(113, 132, 137));
        jLabel298.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel298.setForeground(new java.awt.Color(255, 255, 255));
        jLabel298.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel298.setText("Construction");
        jLabel298.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel298.setOpaque(true);

        jLabel366.setBackground(new java.awt.Color(113, 132, 137));
        jLabel366.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel366.setForeground(new java.awt.Color(255, 255, 255));
        jLabel366.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel366.setText("Cost");
        jLabel366.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel366.setOpaque(true);

        jLabel368.setBackground(new java.awt.Color(113, 132, 137));
        jLabel368.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel368.setForeground(new java.awt.Color(255, 255, 255));
        jLabel368.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel368.setText("Completion");
        jLabel368.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel368.setOpaque(true);

        jLabel61.setBackground(new java.awt.Color(113, 132, 137));
        jLabel61.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Build");
        jLabel61.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel61.setOpaque(true);

        lblCurrentCar.setBackground(new java.awt.Color(113, 132, 137));
        lblCurrentCar.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCurrentCar.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrentCar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCurrentCar.setText("Build 2019 Car");
        lblCurrentCar.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCurrentCar.setOpaque(true);

        btnDecTechCurrentCar.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecTechCurrentCar.setForeground(new java.awt.Color(255, 255, 255));
        btnDecTechCurrentCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecTechCurrentCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecTechCurrentCarMouseClicked(evt);
            }
        });

        lblTechCurrentCar.setBackground(new java.awt.Color(113, 132, 137));
        lblTechCurrentCar.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTechCurrentCar.setForeground(new java.awt.Color(255, 255, 255));
        lblTechCurrentCar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTechCurrentCar.setText(" ");
        lblTechCurrentCar.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTechCurrentCar.setOpaque(true);

        btnIncTechCurrentCar.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncTechCurrentCar.setForeground(new java.awt.Color(255, 255, 255));
        btnIncTechCurrentCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncTechCurrentCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncTechCurrentCarMouseClicked(evt);
            }
        });

        lblCostCurrentCar.setBackground(new java.awt.Color(113, 132, 137));
        lblCostCurrentCar.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCostCurrentCar.setForeground(new java.awt.Color(255, 255, 255));
        lblCostCurrentCar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCostCurrentCar.setText(" ");
        lblCostCurrentCar.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCostCurrentCar.setOpaque(true);

        lblCompCurrentCar.setBackground(new java.awt.Color(113, 132, 137));
        lblCompCurrentCar.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCompCurrentCar.setForeground(new java.awt.Color(255, 255, 255));
        lblCompCurrentCar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompCurrentCar.setText(" ");
        lblCompCurrentCar.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCompCurrentCar.setOpaque(true);

        btnFinishCurrentCar.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnFinishCurrentCar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinishCurrentCar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFinishCurrentCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnFinishCurrentCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinishCurrentCarMouseClicked(evt);
            }
        });

        btnIncTechNextCar.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncTechNextCar.setForeground(new java.awt.Color(255, 255, 255));
        btnIncTechNextCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncTechNextCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncTechNextCarMouseClicked(evt);
            }
        });

        lblNextCar.setBackground(new java.awt.Color(113, 132, 137));
        lblNextCar.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNextCar.setForeground(new java.awt.Color(255, 255, 255));
        lblNextCar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNextCar.setText("Build 2020 Car");
        lblNextCar.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNextCar.setOpaque(true);

        btnFinishNextCar.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnFinishNextCar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinishNextCar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFinishNextCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnFinishNextCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinishNextCarMouseClicked(evt);
            }
        });

        lblCostNextCar.setBackground(new java.awt.Color(113, 132, 137));
        lblCostNextCar.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCostNextCar.setForeground(new java.awt.Color(255, 255, 255));
        lblCostNextCar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCostNextCar.setText(" ");
        lblCostNextCar.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCostNextCar.setOpaque(true);

        lblCompNextCar.setBackground(new java.awt.Color(113, 132, 137));
        lblCompNextCar.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCompNextCar.setForeground(new java.awt.Color(255, 255, 255));
        lblCompNextCar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompNextCar.setText(" ");
        lblCompNextCar.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCompNextCar.setOpaque(true);

        btnDecTechNextCar.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecTechNextCar.setForeground(new java.awt.Color(255, 255, 255));
        btnDecTechNextCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecTechNextCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecTechNextCarMouseClicked(evt);
            }
        });

        lblTechNextCar.setBackground(new java.awt.Color(113, 132, 137));
        lblTechNextCar.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTechNextCar.setForeground(new java.awt.Color(255, 255, 255));
        lblTechNextCar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTechNextCar.setText(" ");
        lblTechNextCar.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTechNextCar.setOpaque(true);

        btnFinishChassis.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnFinishChassis.setForeground(new java.awt.Color(255, 255, 255));
        btnFinishChassis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFinishChassis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnFinishChassis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinishChassisMouseClicked(evt);
            }
        });

        btnDecTechChassis.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecTechChassis.setForeground(new java.awt.Color(255, 255, 255));
        btnDecTechChassis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecTechChassis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecTechChassisMouseClicked(evt);
            }
        });

        lblCostChassis.setBackground(new java.awt.Color(113, 132, 137));
        lblCostChassis.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCostChassis.setForeground(new java.awt.Color(255, 255, 255));
        lblCostChassis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCostChassis.setText(" ");
        lblCostChassis.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCostChassis.setOpaque(true);

        lblCompChassis.setBackground(new java.awt.Color(113, 132, 137));
        lblCompChassis.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCompChassis.setForeground(new java.awt.Color(255, 255, 255));
        lblCompChassis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompChassis.setText(" ");
        lblCompChassis.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCompChassis.setOpaque(true);

        btnIncTechChassis.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncTechChassis.setForeground(new java.awt.Color(255, 255, 255));
        btnIncTechChassis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncTechChassis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncTechChassisMouseClicked(evt);
            }
        });

        lblTechChassis.setBackground(new java.awt.Color(113, 132, 137));
        lblTechChassis.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTechChassis.setForeground(new java.awt.Color(255, 255, 255));
        lblTechChassis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTechChassis.setText(" ");
        lblTechChassis.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTechChassis.setOpaque(true);

        lblChassis.setBackground(new java.awt.Color(113, 132, 137));
        lblChassis.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblChassis.setForeground(new java.awt.Color(255, 255, 255));
        lblChassis.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblChassis.setText("Upgrade 2019 Chassis");
        lblChassis.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblChassis.setOpaque(true);

        lblCompTech.setBackground(new java.awt.Color(113, 132, 137));
        lblCompTech.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCompTech.setForeground(new java.awt.Color(255, 255, 255));
        lblCompTech.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompTech.setText(" ");
        lblCompTech.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCompTech.setOpaque(true);

        btnDecTechTech.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecTechTech.setForeground(new java.awt.Color(255, 255, 255));
        btnDecTechTech.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecTechTech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecTechTechMouseClicked(evt);
            }
        });

        btnIncTechTech.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncTechTech.setForeground(new java.awt.Color(255, 255, 255));
        btnIncTechTech.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncTechTech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncTechTechMouseClicked(evt);
            }
        });

        lblTechTech.setBackground(new java.awt.Color(113, 132, 137));
        lblTechTech.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTechTech.setForeground(new java.awt.Color(255, 255, 255));
        lblTechTech.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTechTech.setText(" ");
        lblTechTech.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTechTech.setOpaque(true);

        lblCostTech.setBackground(new java.awt.Color(113, 132, 137));
        lblCostTech.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCostTech.setForeground(new java.awt.Color(255, 255, 255));
        lblCostTech.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCostTech.setText(" ");
        lblCostTech.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCostTech.setOpaque(true);

        jLabel303.setBackground(new java.awt.Color(113, 132, 137));
        jLabel303.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel303.setForeground(new java.awt.Color(255, 255, 255));
        jLabel303.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel303.setText("Upgrade Technology");
        jLabel303.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel303.setOpaque(true);

        btnFinishTech.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnFinishTech.setForeground(new java.awt.Color(255, 255, 255));
        btnFinishTech.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFinishTech.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnFinishTech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinishTechMouseClicked(evt);
            }
        });

        btnFinishAids.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnFinishAids.setForeground(new java.awt.Color(255, 255, 255));
        btnFinishAids.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFinishAids.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnFinishAids.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinishAidsMouseClicked(evt);
            }
        });

        btnDecTechAids.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecTechAids.setForeground(new java.awt.Color(255, 255, 255));
        btnDecTechAids.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecTechAids.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecTechAidsMouseClicked(evt);
            }
        });

        btnIncTechAids.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncTechAids.setForeground(new java.awt.Color(255, 255, 255));
        btnIncTechAids.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncTechAids.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncTechAidsMouseClicked(evt);
            }
        });

        lblCostAids.setBackground(new java.awt.Color(113, 132, 137));
        lblCostAids.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCostAids.setForeground(new java.awt.Color(255, 255, 255));
        lblCostAids.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCostAids.setText(" ");
        lblCostAids.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCostAids.setOpaque(true);

        jLabel304.setBackground(new java.awt.Color(113, 132, 137));
        jLabel304.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel304.setForeground(new java.awt.Color(255, 255, 255));
        jLabel304.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel304.setText("Upgrade Driving Aids");
        jLabel304.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel304.setOpaque(true);

        lblCompAids.setBackground(new java.awt.Color(113, 132, 137));
        lblCompAids.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCompAids.setForeground(new java.awt.Color(255, 255, 255));
        lblCompAids.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompAids.setText(" ");
        lblCompAids.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCompAids.setOpaque(true);

        lblTechAids.setBackground(new java.awt.Color(113, 132, 137));
        lblTechAids.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTechAids.setForeground(new java.awt.Color(255, 255, 255));
        lblTechAids.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTechAids.setText(" ");
        lblTechAids.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTechAids.setOpaque(true);

        lblCostSpares.setBackground(new java.awt.Color(113, 132, 137));
        lblCostSpares.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCostSpares.setForeground(new java.awt.Color(255, 255, 255));
        lblCostSpares.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCostSpares.setText(" ");
        lblCostSpares.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCostSpares.setOpaque(true);

        lblTechSpares.setBackground(new java.awt.Color(113, 132, 137));
        lblTechSpares.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblTechSpares.setForeground(new java.awt.Color(255, 255, 255));
        lblTechSpares.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTechSpares.setText(" ");
        lblTechSpares.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblTechSpares.setOpaque(true);

        btnFinishSpares.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnFinishSpares.setForeground(new java.awt.Color(255, 255, 255));
        btnFinishSpares.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFinishSpares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        btnFinishSpares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinishSparesMouseClicked(evt);
            }
        });

        btnDecTechSpares.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnDecTechSpares.setForeground(new java.awt.Color(255, 255, 255));
        btnDecTechSpares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecTechSpares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecTechSparesMouseClicked(evt);
            }
        });

        btnIncTechSpares.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnIncTechSpares.setForeground(new java.awt.Color(255, 255, 255));
        btnIncTechSpares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncTechSpares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncTechSparesMouseClicked(evt);
            }
        });

        lblCompSpares.setBackground(new java.awt.Color(113, 132, 137));
        lblCompSpares.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCompSpares.setForeground(new java.awt.Color(255, 255, 255));
        lblCompSpares.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompSpares.setText(" ");
        lblCompSpares.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCompSpares.setOpaque(true);

        jLabel305.setBackground(new java.awt.Color(113, 132, 137));
        jLabel305.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel305.setForeground(new java.awt.Color(255, 255, 255));
        jLabel305.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel305.setText("Build Spares");
        jLabel305.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel305.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel298, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(jLabel366, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel368, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCurrentCar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecTechCurrentCar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTechCurrentCar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncTechCurrentCar)
                        .addGap(18, 18, 18)
                        .addComponent(lblCostCurrentCar, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCompCurrentCar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinishCurrentCar, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNextCar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecTechNextCar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTechNextCar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncTechNextCar)
                        .addGap(18, 18, 18)
                        .addComponent(lblCostNextCar, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCompNextCar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinishNextCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblChassis, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecTechChassis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTechChassis, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncTechChassis)
                        .addGap(18, 18, 18)
                        .addComponent(lblCostChassis, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCompChassis, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinishChassis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel303, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecTechTech)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTechTech, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncTechTech)
                        .addGap(18, 18, 18)
                        .addComponent(lblCostTech, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCompTech, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinishTech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel304, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecTechAids)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTechAids, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncTechAids)
                        .addGap(18, 18, 18)
                        .addComponent(lblCostAids, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCompAids, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinishAids, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel305, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecTechSpares)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTechSpares, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncTechSpares)
                        .addGap(18, 18, 18)
                        .addComponent(lblCostSpares, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCompSpares, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinishSpares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel298)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel366)
                        .addComponent(jLabel368))
                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCurrentCar)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnDecTechCurrentCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIncTechCurrentCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTechCurrentCar))
                            .addComponent(lblCostCurrentCar))
                        .addComponent(lblCompCurrentCar))
                    .addComponent(btnFinishCurrentCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNextCar)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnDecTechNextCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIncTechNextCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTechNextCar))
                            .addComponent(lblCostNextCar))
                        .addComponent(lblCompNextCar))
                    .addComponent(btnFinishNextCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblChassis)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnDecTechChassis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIncTechChassis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTechChassis))
                            .addComponent(lblCostChassis))
                        .addComponent(lblCompChassis))
                    .addComponent(btnFinishChassis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel303)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnDecTechTech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIncTechTech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTechTech))
                            .addComponent(lblCostTech))
                        .addComponent(lblCompTech))
                    .addComponent(btnFinishTech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel304)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnDecTechAids, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIncTechAids, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTechAids))
                            .addComponent(lblCostAids))
                        .addComponent(lblCompAids))
                    .addComponent(btnFinishAids, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel305)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnDecTechSpares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIncTechSpares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTechSpares))
                            .addComponent(lblCostSpares))
                        .addComponent(lblCompSpares))
                    .addComponent(btnFinishSpares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(201, 201, 201))
        );

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDecTechCurrentCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecTechCurrentCarMouseClicked
        if (currentCar > 0 && grandprixworld.gui.FullGame.data.findPlayerTeam().currentCars < 4) {
            currentCar--;
            grandprixworld.gui.FullGame.data.findPlayerTeam().techAvail++;
            grandprixworld.gui.FullGame.data.findPlayerTeam().cnstStaffUsed--;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecTechCurrentCarMouseClicked

    private void btnDecTechNextCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecTechNextCarMouseClicked
        if (nextCar > 0 && grandprixworld.gui.FullGame.data.findPlayerTeam().nextCars < 4 && grandprixworld.gui.FullGame.data.findPlayerTeam().nextYearChassis != null) {
            nextCar--;
            grandprixworld.gui.FullGame.data.findPlayerTeam().techAvail++;
            grandprixworld.gui.FullGame.data.findPlayerTeam().cnstStaffUsed--;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecTechNextCarMouseClicked

    private void btnDecTechChassisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecTechChassisMouseClicked
        if (chassis > 0 && grandprixworld.gui.FullGame.data.findPlayerTeam().upgradeAvail == 7) {
            chassis--;
            grandprixworld.gui.FullGame.data.findPlayerTeam().techAvail++;
            grandprixworld.gui.FullGame.data.findPlayerTeam().cnstStaffUsed--;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecTechChassisMouseClicked

    private void btnDecTechTechMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecTechTechMouseClicked
        if (tech > 0 && grandprixworld.gui.FullGame.data.findPlayerTeam().upgradeAvail > 0 && grandprixworld.gui.FullGame.data.findPlayerTeam().upgradeAvail < 7) {
            tech--;
            grandprixworld.gui.FullGame.data.findPlayerTeam().techAvail++;
            grandprixworld.gui.FullGame.data.findPlayerTeam().cnstStaffUsed--;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecTechTechMouseClicked

    private void btnDecTechAidsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecTechAidsMouseClicked
        if (drivingAids > 0 && grandprixworld.gui.FullGame.data.findPlayerTeam().aidAvail > 0) {
            drivingAids--;
            grandprixworld.gui.FullGame.data.findPlayerTeam().techAvail++;
            grandprixworld.gui.FullGame.data.findPlayerTeam().cnstStaffUsed--;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecTechAidsMouseClicked

    private void btnDecTechSparesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecTechSparesMouseClicked
        if (spares > 0 && grandprixworld.gui.FullGame.data.findPlayerTeam().spares < 10) {
            spares--;
            grandprixworld.gui.FullGame.data.findPlayerTeam().techAvail++;
            grandprixworld.gui.FullGame.data.findPlayerTeam().cnstStaffUsed--;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnDecTechSparesMouseClicked

    private void btnIncTechCurrentCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncTechCurrentCarMouseClicked
        if (currentCar < currentCarReq && grandprixworld.gui.FullGame.data.findPlayerTeam().currentCars < 4) {
            if (grandprixworld.gui.FullGame.data.findPlayerTeam().techAvail > 0) {
                currentCar++;
                grandprixworld.gui.FullGame.data.findPlayerTeam().techAvail--;
                grandprixworld.gui.FullGame.data.findPlayerTeam().cnstStaffUsed++;
            }
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncTechCurrentCarMouseClicked

    private void btnIncTechNextCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncTechNextCarMouseClicked
        if (nextCar < nextCarReq && grandprixworld.gui.FullGame.data.findPlayerTeam().nextCars < 4) {
            if (grandprixworld.gui.FullGame.data.findPlayerTeam().techAvail > 0 && grandprixworld.gui.FullGame.data.findPlayerTeam().nextYearChassis != null) {
                nextCar++;
                grandprixworld.gui.FullGame.data.findPlayerTeam().techAvail--;
                grandprixworld.gui.FullGame.data.findPlayerTeam().cnstStaffUsed++;
            }
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncTechNextCarMouseClicked

    private void btnIncTechChassisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncTechChassisMouseClicked
        if (chassis < chassisReq && grandprixworld.gui.FullGame.data.findPlayerTeam().upgradeAvail == 7) {
            if (grandprixworld.gui.FullGame.data.findPlayerTeam().techAvail > 0) {
                chassis++;
                grandprixworld.gui.FullGame.data.findPlayerTeam().techAvail--;
                grandprixworld.gui.FullGame.data.findPlayerTeam().cnstStaffUsed++;
            }
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncTechChassisMouseClicked

    private void btnIncTechTechMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncTechTechMouseClicked
        if (tech < techReq && grandprixworld.gui.FullGame.data.findPlayerTeam().upgradeAvail > 0 && grandprixworld.gui.FullGame.data.findPlayerTeam().upgradeAvail < 7) {
            if (grandprixworld.gui.FullGame.data.findPlayerTeam().techAvail > 0) {
                tech++;
                grandprixworld.gui.FullGame.data.findPlayerTeam().techAvail--;
                grandprixworld.gui.FullGame.data.findPlayerTeam().cnstStaffUsed++;
            }
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncTechTechMouseClicked

    private void btnIncTechAidsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncTechAidsMouseClicked
        if (drivingAids < drivingAidsReq && grandprixworld.gui.FullGame.data.findPlayerTeam().aidAvail > 0) {
            if (grandprixworld.gui.FullGame.data.findPlayerTeam().techAvail > 0) {
                drivingAids++;
                grandprixworld.gui.FullGame.data.findPlayerTeam().techAvail--;
                grandprixworld.gui.FullGame.data.findPlayerTeam().cnstStaffUsed++;
            }
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncTechAidsMouseClicked

    private void btnIncTechSparesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncTechSparesMouseClicked
        if (spares < sparesReq && grandprixworld.gui.FullGame.data.findPlayerTeam().spares < 10) {
            if (grandprixworld.gui.FullGame.data.findPlayerTeam().techAvail > 0) {
                spares++;
                grandprixworld.gui.FullGame.data.findPlayerTeam().techAvail--;
                grandprixworld.gui.FullGame.data.findPlayerTeam().cnstStaffUsed++;
            }
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
    }//GEN-LAST:event_btnIncTechSparesMouseClicked

    private void btnFinishCurrentCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishCurrentCarMouseClicked
        if (compCurrentCar == 100) {
            currentCar = 0;
            grandprixworld.gui.FullGame.data.findPlayerTeam().currentYearCars[grandprixworld.gui.FullGame.data.findPlayerTeam().currentCars] = new Car(grandprixworld.gui.FullGame.data.findPlayerTeam().currentCar);
            compCurrentCar = 0;
            FullGame.data.findPlayerTeam().balance -= currentCarCost;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
        FullGame.gameScreen.updateScreenData();
    }//GEN-LAST:event_btnFinishCurrentCarMouseClicked

    private void btnFinishNextCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishNextCarMouseClicked
        if (compNextCar == 100) {
            nextCar = 0;
            grandprixworld.gui.FullGame.data.findPlayerTeam().nextYearCars[grandprixworld.gui.FullGame.data.findPlayerTeam().nextCars] = new Car(grandprixworld.gui.FullGame.data.findPlayerTeam().nextCar);
            compNextCar = 0;
            FullGame.data.findPlayerTeam().balance -= nextCarCost;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
        FullGame.gameScreen.updateScreenData();
    }//GEN-LAST:event_btnFinishNextCarMouseClicked

    private void btnFinishChassisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishChassisMouseClicked
        if (compChassis == 100) {
            chassis = 0;
            compChassis = 0;
            FullGame.data.findPlayerTeam().balance -= chassisCost;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
        FullGame.gameScreen.updateScreenData();
    }//GEN-LAST:event_btnFinishChassisMouseClicked

    private void btnFinishTechMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishTechMouseClicked
        if (compTech == 100) {
            tech = 0;
            compTech = 0;
            FullGame.data.findPlayerTeam().balance -= techCost;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
        FullGame.gameScreen.updateScreenData();
    }//GEN-LAST:event_btnFinishTechMouseClicked

    private void btnFinishAidsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishAidsMouseClicked
        if (compDrivingAids == 100) {
            drivingAids = 0;
            compDrivingAids = 0;
            FullGame.data.findPlayerTeam().balance -= aidCost;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
        FullGame.gameScreen.updateScreenData();
    }//GEN-LAST:event_btnFinishAidsMouseClicked

    private void btnFinishSparesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinishSparesMouseClicked
        if (compSpares == 100) {
            spares = 0;
            grandprixworld.gui.FullGame.data.findPlayerTeam().spares++;
            compSpares = 0;
            FullGame.data.findPlayerTeam().balance -= spareCost;
        }
        grandprixworld.gui.FullGame.gameScreen.enAll1.updateScreenData();
        FullGame.gameScreen.updateScreenData();
    }//GEN-LAST:event_btnFinishSparesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDecTechAids;
    private javax.swing.JLabel btnDecTechChassis;
    private javax.swing.JLabel btnDecTechCurrentCar;
    private javax.swing.JLabel btnDecTechNextCar;
    private javax.swing.JLabel btnDecTechSpares;
    private javax.swing.JLabel btnDecTechTech;
    private javax.swing.JLabel btnFinishAids;
    private javax.swing.JLabel btnFinishChassis;
    private javax.swing.JLabel btnFinishCurrentCar;
    private javax.swing.JLabel btnFinishNextCar;
    private javax.swing.JLabel btnFinishSpares;
    private javax.swing.JLabel btnFinishTech;
    private javax.swing.JLabel btnIncTechAids;
    private javax.swing.JLabel btnIncTechChassis;
    private javax.swing.JLabel btnIncTechCurrentCar;
    private javax.swing.JLabel btnIncTechNextCar;
    private javax.swing.JLabel btnIncTechSpares;
    private javax.swing.JLabel btnIncTechTech;
    private static javax.swing.JLabel imgSparesAvail;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel303;
    private javax.swing.JLabel jLabel304;
    private javax.swing.JLabel jLabel305;
    private javax.swing.JLabel jLabel366;
    private javax.swing.JLabel jLabel368;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private static javax.swing.JLabel lblChassis;
    private static javax.swing.JLabel lblCompAids;
    private static javax.swing.JLabel lblCompChassis;
    private static javax.swing.JLabel lblCompCurrentCar;
    private static javax.swing.JLabel lblCompNextCar;
    private static javax.swing.JLabel lblCompSpares;
    private static javax.swing.JLabel lblCompTech;
    private static javax.swing.JLabel lblCostAids;
    private static javax.swing.JLabel lblCostChassis;
    private static javax.swing.JLabel lblCostCurrentCar;
    private static javax.swing.JLabel lblCostNextCar;
    private static javax.swing.JLabel lblCostSpares;
    private static javax.swing.JLabel lblCostTech;
    private static javax.swing.JLabel lblCurrentCar;
    private static javax.swing.JLabel lblNextCar;
    private static javax.swing.JLabel lblTechAids;
    private static javax.swing.JLabel lblTechAvail;
    private static javax.swing.JLabel lblTechChassis;
    private static javax.swing.JLabel lblTechConst;
    private static javax.swing.JLabel lblTechCurrentCar;
    private static javax.swing.JLabel lblTechNextCar;
    private static javax.swing.JLabel lblTechSpares;
    private static javax.swing.JLabel lblTechTech;
    // End of variables declaration//GEN-END:variables
}
