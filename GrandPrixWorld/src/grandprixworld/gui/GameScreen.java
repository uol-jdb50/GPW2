/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author jdb50
 */
public class GameScreen extends javax.swing.JPanel {

    /**
     * Creates new form MainMenu
     */
    CardLayout sections;
    CardLayout teamScreens;
    CardLayout engineeringScreens;
    CardLayout commercialScreens;
    CardLayout racePrepScreens;
    CardLayout optionsScreens;

    int currentSection = 1;

    DateTimeFormatter formatter;

    public GameScreen() {
        formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        initComponents();
        initOther();
        sections = (CardLayout) (pnlMain.getLayout());
        sections.show(pnlMain, "Home");

        btnOption6.setVisible(false);

        currentSection = 1;

        teamScreens = (CardLayout) (tmAll1.getLayout());
        teamScreens.show(tmAll1, "Summary");
        lblToolTip.setText("Team Organisation: Summary");

        engineeringScreens = (CardLayout) (enAll1.getLayout());
        commercialScreens = (CardLayout) (coAll1.getLayout());
        racePrepScreens = (CardLayout) (rpAll1.getLayout());

        rpAll1.rpChampionship1.updateScreenData();
        tmAll1.tmSummary1.updateScreenData();
        updateScreenData();
        btnOption1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TmSummary.png")));
        btnOption2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TmNews.png")));
        btnOption3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TmEmail.png")));
        btnOption4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TmFinance.png")));
        btnOption5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TmStaff.png")));

    }

    public void initOther() {
        tmAll1 = new grandprixworld.gui.teamOrg.TmAll();
        enAll1 = new grandprixworld.gui.engineering.EnAll();
        coAll1 = new grandprixworld.gui.commercial.CoAll();
        rpAll1 = new grandprixworld.gui.racePrep.rpAll();
        saveGame1 = new grandprixworld.gui.SaveGame();
        pnlMain.add(tmAll1, "Team");
        pnlMain.add(enAll1, "Engineering");
        pnlMain.add(coAll1, "Commercial");
        pnlMain.add(rpAll1, "RacePrep");
        pnlMain.add(saveGame1, "Options");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblToolTip = new javax.swing.JLabel();
        btnTeam = new javax.swing.JLabel();
        btnEngineering = new javax.swing.JLabel();
        btnCommercial = new javax.swing.JLabel();
        btnRacePrep = new javax.swing.JLabel();
        btnOptions = new javax.swing.JLabel();
        btnAdvance = new javax.swing.JLabel();
        imgTeam = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblMoney = new javax.swing.JLabel();
        lblNextWeek = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        btnOption1 = new javax.swing.JLabel();
        btnOption2 = new javax.swing.JLabel();
        btnOption3 = new javax.swing.JLabel();
        btnOption4 = new javax.swing.JLabel();
        btnOption5 = new javax.swing.JLabel();
        btnOption6 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1440, 800));
        setMinimumSize(new java.awt.Dimension(1440, 800));
        setPreferredSize(new java.awt.Dimension(1440, 800));

        lblToolTip.setBackground(new java.awt.Color(100, 100, 100));
        lblToolTip.setFont(new java.awt.Font("Formula1 Display Regular", 0, 22)); // NOI18N
        lblToolTip.setForeground(new java.awt.Color(255, 255, 255));
        lblToolTip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/contextbanner.png"))); // NOI18N
        lblToolTip.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnTeam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/team.png"))); // NOI18N
        btnTeam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTeamMouseClicked(evt);
            }
        });

        btnEngineering.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/engineering.png"))); // NOI18N
        btnEngineering.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEngineeringMouseClicked(evt);
            }
        });

        btnCommercial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/commercial.png"))); // NOI18N
        btnCommercial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCommercialMouseClicked(evt);
            }
        });

        btnRacePrep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/raceprep.png"))); // NOI18N
        btnRacePrep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRacePrepMouseClicked(evt);
            }
        });

        btnOptions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/save.png"))); // NOI18N
        btnOptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOptionsMouseClicked(evt);
            }
        });

        btnAdvance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/advanceALT.png"))); // NOI18N
        btnAdvance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdvanceMouseClicked(evt);
            }
        });

        imgTeam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgTeam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/teamplain.png"))); // NOI18N
        imgTeam.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblDate.setFont(new java.awt.Font("Formula1 Display Regular", 0, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/label.png"))); // NOI18N
        lblDate.setText(FullGame.data.currentDate.format(formatter));
        lblDate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblMoney.setFont(new java.awt.Font("Formula1 Display Regular", 0, 18)); // NOI18N
        lblMoney.setForeground(new java.awt.Color(255, 255, 255));
        lblMoney.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMoney.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/label.png"))); // NOI18N
        lblMoney.setText("$" + FullGame.data.findPlayerTeam().balance);
        lblMoney.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblNextWeek.setFont(new java.awt.Font("Formula1 Display Regular", 0, 18)); // NOI18N
        lblNextWeek.setForeground(new java.awt.Color(255, 255, 255));
        lblNextWeek.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNextWeek.setText("Next Week");
        lblNextWeek.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        pnlMain.setBackground(new java.awt.Color(113, 132, 137));
        pnlMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        pnlMain.setMaximumSize(new java.awt.Dimension(1127, 568));
        pnlMain.setMinimumSize(new java.awt.Dimension(1127, 568));
        pnlMain.setPreferredSize(new java.awt.Dimension(1127, 568));
        pnlMain.setLayout(new java.awt.CardLayout());

        btnOption1.setForeground(new java.awt.Color(255, 255, 255));
        btnOption1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOption1MouseClicked(evt);
            }
        });

        btnOption2.setForeground(new java.awt.Color(255, 255, 255));
        btnOption2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOption2MouseClicked(evt);
            }
        });

        btnOption3.setForeground(new java.awt.Color(255, 255, 255));
        btnOption3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOption3MouseClicked(evt);
            }
        });

        btnOption4.setForeground(new java.awt.Color(255, 255, 255));
        btnOption4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOption4MouseClicked(evt);
            }
        });

        btnOption5.setForeground(new java.awt.Color(255, 255, 255));
        btnOption5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOption5MouseClicked(evt);
            }
        });

        btnOption6.setForeground(new java.awt.Color(255, 255, 255));
        btnOption6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOption6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imgTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDate)
                            .addComponent(lblMoney))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNextWeek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdvance, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblToolTip, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOption1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOption2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOption5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOption6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 156, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCommercial)
                                    .addComponent(btnRacePrep)
                                    .addComponent(btnTeam)
                                    .addComponent(btnEngineering)
                                    .addComponent(btnOptions))
                                .addGap(18, 18, 18)
                                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblToolTip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOption2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOption5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOption6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOption1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEngineering, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCommercial, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRacePrep, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdvance)
                            .addComponent(lblNextWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(imgTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTeamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTeamMouseClicked
        sections.show(pnlMain, "Team");
        teamScreens.show(tmAll1, "Summary");
        currentSection = 1;
        btnOption4.setVisible(true);
        btnOption5.setVisible(true);
        btnOption6.setVisible(false);
        lblToolTip.setText("Team Organisation: Summary");
        btnOption1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TmSummary.png")));
        btnOption2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TmNews.png")));
        btnOption3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TmEmail.png")));
        btnOption4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TmFinance.png")));
        btnOption5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TmStaff.png")));
    }//GEN-LAST:event_btnTeamMouseClicked

    private void btnCommercialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCommercialMouseClicked
        sections.show(pnlMain, "Commercial");
        commercialScreens.show(coAll1, "Sponsors");
        currentSection = 3;
        btnOption4.setVisible(false);
        btnOption5.setVisible(false);
        btnOption6.setVisible(false);
        lblToolTip.setText("Commercial: Sponsors");
        btnOption1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CoSponsors.png")));
        btnOption2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CoNegotiation.png")));
        btnOption3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CoMerchandising.png")));
    }//GEN-LAST:event_btnCommercialMouseClicked

    private void btnRacePrepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRacePrepMouseClicked
        sections.show(pnlMain, "RacePrep");
        racePrepScreens.show(rpAll1, "Drivers");
        currentSection = 4;
        btnOption4.setVisible(true);
        btnOption5.setVisible(true);
        btnOption6.setVisible(false);
        lblToolTip.setText("Racing: Attitude");
        btnOption1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/RpAttitude.png")));
        btnOption2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/RpAssembly.png")));
        btnOption3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/RpChampionship.png")));
        btnOption4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/RpCalendar.png")));
        btnOption5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/RpRegulations.png")));
    }//GEN-LAST:event_btnRacePrepMouseClicked

    private void btnOptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOptionsMouseClicked
        sections.show(pnlMain, "Options");
        currentSection = 5;
        btnOption4.setVisible(false);
        btnOption5.setVisible(false);
        btnOption6.setVisible(false);
        lblToolTip.setText("Load/Save/Quit Game");
        btnOption1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OpLoad.png")));
        btnOption2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OpSave.png")));
        btnOption3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OpClose.png")));
    }//GEN-LAST:event_btnOptionsMouseClicked

    private void btnEngineeringMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEngineeringMouseClicked
        sections.show(pnlMain, "Engineering");
        engineeringScreens.show(enAll1, "Garage");
        currentSection = 2;
        btnOption4.setVisible(true);
        btnOption5.setVisible(true);
        btnOption6.setVisible(true);
        lblToolTip.setText("Engineering: Garage");
        btnOption1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EnGarage.png")));
        btnOption2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EnTesting.png")));
        btnOption3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EnDesign.png")));
        btnOption4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EnConstruction.png")));
        btnOption5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EnContracts.png")));
        btnOption6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EnFactory.png")));
    }//GEN-LAST:event_btnEngineeringMouseClicked

    private void btnOption1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOption1MouseClicked
        switch (currentSection) {
            case 1:
                teamScreens.show(tmAll1, "Summary");
                lblToolTip.setText("Team Organisation: Summary");
                break;
            case 2:
                engineeringScreens.show(enAll1, "Garage");
                lblToolTip.setText("Engineering: Garage");
                break;
            case 3:
                commercialScreens.show(coAll1, "Sponsors");
                lblToolTip.setText("Commercial: Sponsors");
                break;
            case 4:
                racePrepScreens.show(rpAll1, "Drivers");
                lblToolTip.setText("Racing: Attitude");
                break;
            case 5:
                //  Save Game
                break;
        }
    }//GEN-LAST:event_btnOption1MouseClicked

    private void btnOption2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOption2MouseClicked
        switch (currentSection) {
            case 1:
                teamScreens.show(tmAll1, "News");
                lblToolTip.setText("Team Organisation: News");
                break;
            case 2:
                engineeringScreens.show(enAll1, "Testing");
                lblToolTip.setText("Engineering: Testing");
                break;
            case 3:
                commercialScreens.show(coAll1, "Negotiations");
                lblToolTip.setText("Commercial: Negotiations");
                break;
            case 4:
                racePrepScreens.show(rpAll1, "Assembly");
                lblToolTip.setText("Racing: Assembly");
                break;
            case 5:
                //  Load Game
                break;
        }
    }//GEN-LAST:event_btnOption2MouseClicked

    private void btnOption3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOption3MouseClicked
        switch (currentSection) {
            case 1:
                teamScreens.show(tmAll1, "Email");
                lblToolTip.setText("Team Organisation: Email");
                break;
            case 2:
                engineeringScreens.show(enAll1, "Design");
                lblToolTip.setText("Engineering: Design");
                break;
            case 3:
                commercialScreens.show(coAll1, "Merchandising");
                lblToolTip.setText("Commercial: Merchandising");
                break;
            case 4:
                racePrepScreens.show(rpAll1, "Championship");
                lblToolTip.setText("Racing: Championship");
                break;
            case 5:
                System.exit(0);
        }
    }//GEN-LAST:event_btnOption3MouseClicked

    private void btnOption4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOption4MouseClicked
        switch (currentSection) {
            case 1:
                teamScreens.show(tmAll1, "Finance");
                lblToolTip.setText("Team Organisation: Finance");
                break;
            case 2:
                engineeringScreens.show(enAll1, "Construction");
                lblToolTip.setText("Engineering: Construction");
                break;
            case 4:
                racePrepScreens.show(rpAll1, "Calendar");
                lblToolTip.setText("Racing: Calendar");
                break;
        }
    }//GEN-LAST:event_btnOption4MouseClicked

    private void btnOption5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOption5MouseClicked
        switch (currentSection) {
            case 1:
                teamScreens.show(tmAll1, "Staff");
                lblToolTip.setText("Team Organisation: Staff");
                break;
            case 2:
                engineeringScreens.show(enAll1, "Contracts");
                lblToolTip.setText("Engineering: Contracts");
                break;
            case 4:
                racePrepScreens.show(rpAll1, "Regulations");
                lblToolTip.setText("Racing: Regulations");
                break;
        }
    }//GEN-LAST:event_btnOption5MouseClicked

    private void btnOption6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOption6MouseClicked
        switch (currentSection) {
            case 2:
                engineeringScreens.show(enAll1, "Factory");
                lblToolTip.setText("Engineering: Factory");
                break;
        }
    }//GEN-LAST:event_btnOption6MouseClicked
    private void btnAdvanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdvanceMouseClicked
        if (FullGame.data.currentDate.equals(FullGame.data.f1.findNextEvent().eventStart)) {
            FullGame.raceStart();
        }
        FullGame.data.currentDate = FullGame.data.currentDate.plusDays(7);
        if (FullGame.data.currentDate.getYear() > FullGame.data.currentYear) {
            FullGame.data.newYear();
        }
        grandprixworld.gui.FullGame.data.newWeek();
        tmAll1.tmStaff1.hired = new boolean[]{false, false, false, false};
        //System.out.println(FullGame.data.currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        updateScreenData();
        tmAll1.tmSummary1.updateScreenData();
        tmAll1.tmStaff1.updateScreenData();
        rpAll1.rpChampionship1.updateScreenData();
        rpAll1.rpCalendar1.updateScreenData();

    }//GEN-LAST:event_btnAdvanceMouseClicked

    public void updateScreenData() {
        DecimalFormat df = new DecimalFormat("$###,###,###");
        lblDate.setText(FullGame.data.currentDate.format(formatter));
        lblMoney.setText(df.format(FullGame.data.findPlayerTeam().balance));
        if (FullGame.data.currentDate.equals(FullGame.data.f1.findNextEvent().eventStart)) {
            lblNextWeek.setText("Go To Race");
        } else {
            lblNextWeek.setText("Go To Next Week");
        }
    }

    public grandprixworld.gui.teamOrg.TmAll tmAll1;
    private grandprixworld.gui.commercial.CoAll coAll1;
    public grandprixworld.gui.engineering.EnAll enAll1;
    public grandprixworld.gui.racePrep.rpAll rpAll1;
    private grandprixworld.gui.SaveGame saveGame1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdvance;
    private javax.swing.JLabel btnCommercial;
    private javax.swing.JLabel btnEngineering;
    private javax.swing.JLabel btnOption1;
    private javax.swing.JLabel btnOption2;
    private javax.swing.JLabel btnOption3;
    private javax.swing.JLabel btnOption4;
    private javax.swing.JLabel btnOption5;
    private javax.swing.JLabel btnOption6;
    private javax.swing.JLabel btnOptions;
    private javax.swing.JLabel btnRacePrep;
    private javax.swing.JLabel btnTeam;
    private javax.swing.JLabel imgTeam;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblMoney;
    private javax.swing.JLabel lblNextWeek;
    private javax.swing.JLabel lblToolTip;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        Color c1 = Color.BLACK;
        Color c2 = new Color(88, 103, 108);
        GradientPaint gp = new GradientPaint(0, 0, c1, getWidth(), 0, c2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
}