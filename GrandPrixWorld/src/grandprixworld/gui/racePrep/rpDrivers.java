/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gui.racePrep;

import grandprixworld.gui.FullGame;

/**
 *
 * @author Josh Brookes
 */
public class rpDrivers extends javax.swing.JPanel {

    /**
     * Creates new form rpDrivers
     */
    public rpDrivers() {
        initComponents();
        initOther();
        updateScreenData();
    }
    
    public void initOther() {
        btnD1AccInc.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 1, 1, 1);
            }
        });
        btnD1BrkInc.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 1, 2, 1);
            }
        });
        btnD1TopInc.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 1, 3, 1);
            }
        });
        btnD1KerInc.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 1, 4, 1);
            }
        });
        btnD1ORLInc.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 1, 5, 1);
            }
        });
        btnD1DefInc.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 1, 6, 1);
            }
        });
        btnD1PosInc.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 1, 7, 1);
            }
        });
        btnD1LapInc.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 1, 8, 1);
            }
        });
        
        btnD1AccDec.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 1, 1, -1);
            }
        });
        btnD1BrkDec.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 1, 2, -1);
            }
        });
        btnD1TopDec.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 1, 3, -1);
            }
        });
        btnD1KerDec.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 1, 4, -1);
            }
        });
        btnD1ORLDec.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 1, 5, -1);
            }
        });
        btnD1DefDec.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 1, 6, -1);
            }
        });
        btnD1PosDec.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 1, 7, -1);
            }
        });
        btnD1LapDec.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 1, 8, -1);
            }
        });
        
        btnD2AccInc.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 2, 1, 1);
            }
        });
        btnD2BrkInc.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 2, 2, 1);
            }
        });
        btnD2TopInc.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 2, 3, 1);
            }
        });
        btnD2KerInc.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 2, 4, 1);
            }
        });
        btnD2ORLInc.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 2, 5, 1);
            }
        });
        btnD2DefInc.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 2, 6, 1);
            }
        });
        btnD2PosInc.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 2, 7, 1);
            }
        });
        btnD2LapInc.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 2, 8, 1);
            }
        });
        
        btnD2AccDec.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 2, 1, -1);
            }
        });
        btnD2BrkDec.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 2, 2, -1);
            }
        });
        btnD2TopDec.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 2, 3, -1);
            }
        });
        btnD2KerDec.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 2, 4, -1);
            }
        });
        btnD2ORLDec.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 2, 5, -1);
            }
        });
        btnD2DefDec.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 2, 6, -1);
            }
        });
        btnD2PosDec.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 2, 7, -1);
            }
        });
        btnD2LapDec.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAttribute(evt, 2, 8, -1);
            }
        });
    }
    
    public void updateScreenData() {
        imgD1Acc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().driver1.attAcceleration + ".png")));
        imgD1Brk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().driver1.attBraking + ".png")));
        imgD1Top.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().driver1.attTopSpeed + ".png")));
        imgD1Ker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().driver1.attKerbs + ".png")));
        imgD1ORL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().driver1.attOffLine + ".png")));
        imgD1Def.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().driver1.attDefence + ".png")));
        imgD1Pos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().driver1.attOvertaking + ".png")));
        imgD1Lap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().driver1.attLapping + ".png")));
        imgD2Acc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().driver2.attAcceleration + ".png")));
        imgD2Brk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().driver2.attBraking + ".png")));
        imgD2Top.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().driver2.attTopSpeed + ".png")));
        imgD2Ker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().driver2.attKerbs + ".png")));
        imgD2ORL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().driver2.attOffLine + ".png")));
        imgD2Def.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().driver2.attDefence + ".png")));
        imgD2Pos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().driver2.attOvertaking + ".png")));
        imgD2Lap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability" + FullGame.data.findPlayerTeam().driver2.attLapping + ".png")));
    }
    
    private void changeAttribute(java.awt.event.MouseEvent evt, int driver, int att, int dir) {
        switch (att) {
            case 1:
                if (driver == 1) {
                    if (dir == 1) {
                        if (FullGame.data.findPlayerTeam().driver1.attAcceleration < 10) FullGame.data.findPlayerTeam().driver1.attAcceleration++;
                    } else {
                        if (FullGame.data.findPlayerTeam().driver1.attAcceleration > 1) FullGame.data.findPlayerTeam().driver1.attAcceleration--;
                    }
                } else {
                    if (dir == 1) {
                        if (FullGame.data.findPlayerTeam().driver2.attAcceleration < 10) FullGame.data.findPlayerTeam().driver2.attAcceleration++;
                    } else {
                        if (FullGame.data.findPlayerTeam().driver2.attAcceleration > 1)FullGame.data.findPlayerTeam().driver2.attAcceleration--;
                    }
                }
                break;
            case 2:
                if (driver == 1) {
                    if (dir == 1) {
                        if (FullGame.data.findPlayerTeam().driver1.attBraking < 10) FullGame.data.findPlayerTeam().driver1.attBraking++;
                    } else {
                        if (FullGame.data.findPlayerTeam().driver1.attBraking > 1) FullGame.data.findPlayerTeam().driver1.attBraking--;
                    }
                } else {
                    if (dir == 1) {
                        if (FullGame.data.findPlayerTeam().driver2.attBraking < 10) FullGame.data.findPlayerTeam().driver2.attBraking++;
                    } else {
                        if (FullGame.data.findPlayerTeam().driver2.attBraking > 1)FullGame.data.findPlayerTeam().driver2.attBraking--;
                    }
                }
                break;
            case 3:
                if (driver == 1) {
                    if (dir == 1) {
                        if (FullGame.data.findPlayerTeam().driver1.attTopSpeed < 10) FullGame.data.findPlayerTeam().driver1.attTopSpeed++;
                    } else {
                        if (FullGame.data.findPlayerTeam().driver1.attTopSpeed > 1) FullGame.data.findPlayerTeam().driver1.attTopSpeed--;
                    }
                } else {
                    if (dir == 1) {
                        if (FullGame.data.findPlayerTeam().driver2.attTopSpeed < 10) FullGame.data.findPlayerTeam().driver2.attTopSpeed++;
                    } else {
                        if (FullGame.data.findPlayerTeam().driver2.attTopSpeed > 1)FullGame.data.findPlayerTeam().driver2.attTopSpeed--;
                    }
                }
                break;
            case 4:
                if (driver == 1) {
                    if (dir == 1) {
                        if (FullGame.data.findPlayerTeam().driver1.attKerbs < 10) FullGame.data.findPlayerTeam().driver1.attKerbs++;
                    } else {
                        if (FullGame.data.findPlayerTeam().driver1.attKerbs > 1) FullGame.data.findPlayerTeam().driver1.attKerbs--;
                    }
                } else {
                    if (dir == 1) {
                        if (FullGame.data.findPlayerTeam().driver2.attKerbs < 10) FullGame.data.findPlayerTeam().driver2.attKerbs++;
                    } else {
                        if (FullGame.data.findPlayerTeam().driver2.attKerbs > 1)FullGame.data.findPlayerTeam().driver2.attKerbs--;
                    }
                }
                break;
            case 5:
                if (driver == 1) {
                    if (dir == 1) {
                        if (FullGame.data.findPlayerTeam().driver1.attOffLine < 10) FullGame.data.findPlayerTeam().driver1.attOffLine++;
                    } else {
                        if (FullGame.data.findPlayerTeam().driver1.attOffLine > 1) FullGame.data.findPlayerTeam().driver1.attOffLine--;
                    }
                } else {
                    if (dir == 1) {
                        if (FullGame.data.findPlayerTeam().driver2.attOffLine < 10) FullGame.data.findPlayerTeam().driver2.attOffLine++;
                    } else {
                        if (FullGame.data.findPlayerTeam().driver2.attOffLine > 1)FullGame.data.findPlayerTeam().driver2.attOffLine--;
                    }
                }
                break;
            case 6:
                if (driver == 1) {
                    if (dir == 1) {
                        if (FullGame.data.findPlayerTeam().driver1.attDefence < 10) FullGame.data.findPlayerTeam().driver1.attDefence++;
                    } else {
                        if (FullGame.data.findPlayerTeam().driver1.attDefence > 1) FullGame.data.findPlayerTeam().driver1.attDefence--;
                    }
                } else {
                    if (dir == 1) {
                        if (FullGame.data.findPlayerTeam().driver2.attDefence < 10) FullGame.data.findPlayerTeam().driver2.attDefence++;
                    } else {
                        if (FullGame.data.findPlayerTeam().driver2.attDefence > 1)FullGame.data.findPlayerTeam().driver2.attDefence--;
                    }
                }
                break;
            case 7:
                if (driver == 1) {
                    if (dir == 1) {
                        if (FullGame.data.findPlayerTeam().driver1.attOvertaking < 10) FullGame.data.findPlayerTeam().driver1.attOvertaking++;
                    } else {
                        if (FullGame.data.findPlayerTeam().driver1.attOvertaking > 1) FullGame.data.findPlayerTeam().driver1.attOvertaking--;
                    }
                } else {
                    if (dir == 1) {
                        if (FullGame.data.findPlayerTeam().driver2.attOvertaking < 10) FullGame.data.findPlayerTeam().driver2.attOvertaking++;
                    } else {
                        if (FullGame.data.findPlayerTeam().driver2.attOvertaking > 1)FullGame.data.findPlayerTeam().driver2.attOvertaking--;
                    }
                }
                break;
            case 8:
                if (driver == 1) {
                    if (dir == 1) {
                        if (FullGame.data.findPlayerTeam().driver1.attLapping < 10) FullGame.data.findPlayerTeam().driver1.attLapping++;
                    } else {
                        if (FullGame.data.findPlayerTeam().driver1.attLapping > 1) FullGame.data.findPlayerTeam().driver1.attLapping--;
                    }
                } else {
                    if (dir == 1) {
                        if (FullGame.data.findPlayerTeam().driver2.attLapping < 10) FullGame.data.findPlayerTeam().driver2.attLapping++;
                    } else {
                        if (FullGame.data.findPlayerTeam().driver2.attLapping > 1)FullGame.data.findPlayerTeam().driver2.attLapping--;
                    }
                }
                break;
        }
        updateScreenData();
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
        jLabel8 = new javax.swing.JLabel();
        btnD1AccDec = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        btnD1AccInc = new javax.swing.JLabel();
        imgD1Acc = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        btnD1BrkDec = new javax.swing.JLabel();
        imgD1Brk = new javax.swing.JLabel();
        btnD1BrkInc = new javax.swing.JLabel();
        btnD1TopInc = new javax.swing.JLabel();
        btnD1TopDec = new javax.swing.JLabel();
        imgD1Top = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        btnD1KerDec = new javax.swing.JLabel();
        btnD1KerInc = new javax.swing.JLabel();
        imgD1Ker = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        btnD1ORLInc = new javax.swing.JLabel();
        btnD1ORLDec = new javax.swing.JLabel();
        imgD1ORL = new javax.swing.JLabel();
        btnD1DefInc = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        imgD1Def = new javax.swing.JLabel();
        btnD1DefDec = new javax.swing.JLabel();
        btnD1PosDec = new javax.swing.JLabel();
        imgD1Pos = new javax.swing.JLabel();
        btnD1PosInc = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        btnD1LapDec = new javax.swing.JLabel();
        btnD1LapInc = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        imgD1Lap = new javax.swing.JLabel();
        lblD1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnD2AccDec = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        btnD2AccInc = new javax.swing.JLabel();
        imgD2Acc = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        btnD2BrkDec = new javax.swing.JLabel();
        imgD2Brk = new javax.swing.JLabel();
        btnD2BrkInc = new javax.swing.JLabel();
        btnD2TopInc = new javax.swing.JLabel();
        btnD2TopDec = new javax.swing.JLabel();
        imgD2Top = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        btnD2KerDec = new javax.swing.JLabel();
        btnD2KerInc = new javax.swing.JLabel();
        imgD2Ker = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        btnD2ORLInc = new javax.swing.JLabel();
        btnD2ORLDec = new javax.swing.JLabel();
        imgD2ORL = new javax.swing.JLabel();
        btnD2DefInc = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        imgD2Def = new javax.swing.JLabel();
        btnD2DefDec = new javax.swing.JLabel();
        btnD2PosDec = new javax.swing.JLabel();
        imgD2Pos = new javax.swing.JLabel();
        btnD2PosInc = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        btnD2LapDec = new javax.swing.JLabel();
        btnD2LapInc = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        imgD2Lap = new javax.swing.JLabel();
        lblD2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(88, 103, 108));
        setForeground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1100, 550));
        setMinimumSize(new java.awt.Dimension(1100, 550));
        setLayout(new java.awt.GridLayout(1, 2, 10, 10));

        jPanel1.setOpaque(false);

        jLabel8.setBackground(new java.awt.Color(113, 132, 137));
        jLabel8.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Driver 1");
        jLabel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel8.setOpaque(true);

        btnD1AccDec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD1AccDec.setForeground(new java.awt.Color(255, 255, 255));
        btnD1AccDec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1AccDec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N

        jLabel57.setBackground(new java.awt.Color(113, 132, 137));
        jLabel57.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Acceleration");
        jLabel57.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel57.setOpaque(true);

        btnD1AccInc.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD1AccInc.setForeground(new java.awt.Color(255, 255, 255));
        btnD1AccInc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1AccInc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgD1Acc.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgD1Acc.setForeground(new java.awt.Color(255, 255, 255));
        imgD1Acc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1Acc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel59.setBackground(new java.awt.Color(113, 132, 137));
        jLabel59.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Braking");
        jLabel59.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel59.setOpaque(true);

        btnD1BrkDec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD1BrkDec.setForeground(new java.awt.Color(255, 255, 255));
        btnD1BrkDec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1BrkDec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N

        imgD1Brk.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgD1Brk.setForeground(new java.awt.Color(255, 255, 255));
        imgD1Brk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1Brk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnD1BrkInc.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD1BrkInc.setForeground(new java.awt.Color(255, 255, 255));
        btnD1BrkInc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1BrkInc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        btnD1TopInc.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD1TopInc.setForeground(new java.awt.Color(255, 255, 255));
        btnD1TopInc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1TopInc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        btnD1TopDec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD1TopDec.setForeground(new java.awt.Color(255, 255, 255));
        btnD1TopDec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1TopDec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N

        imgD1Top.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgD1Top.setForeground(new java.awt.Color(255, 255, 255));
        imgD1Top.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1Top.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel60.setBackground(new java.awt.Color(113, 132, 137));
        jLabel60.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Top Speed");
        jLabel60.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel60.setOpaque(true);

        jLabel61.setBackground(new java.awt.Color(113, 132, 137));
        jLabel61.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Kerb Use");
        jLabel61.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel61.setOpaque(true);

        btnD1KerDec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD1KerDec.setForeground(new java.awt.Color(255, 255, 255));
        btnD1KerDec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1KerDec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N

        btnD1KerInc.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD1KerInc.setForeground(new java.awt.Color(255, 255, 255));
        btnD1KerInc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1KerInc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgD1Ker.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgD1Ker.setForeground(new java.awt.Color(255, 255, 255));
        imgD1Ker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1Ker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel62.setBackground(new java.awt.Color(113, 132, 137));
        jLabel62.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Off Racing Line");
        jLabel62.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel62.setOpaque(true);

        btnD1ORLInc.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD1ORLInc.setForeground(new java.awt.Color(255, 255, 255));
        btnD1ORLInc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1ORLInc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        btnD1ORLDec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD1ORLDec.setForeground(new java.awt.Color(255, 255, 255));
        btnD1ORLDec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1ORLDec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N

        imgD1ORL.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgD1ORL.setForeground(new java.awt.Color(255, 255, 255));
        imgD1ORL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1ORL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnD1DefInc.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD1DefInc.setForeground(new java.awt.Color(255, 255, 255));
        btnD1DefInc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1DefInc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel63.setBackground(new java.awt.Color(113, 132, 137));
        jLabel63.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Line Defence");
        jLabel63.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel63.setOpaque(true);

        imgD1Def.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgD1Def.setForeground(new java.awt.Color(255, 255, 255));
        imgD1Def.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1Def.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnD1DefDec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD1DefDec.setForeground(new java.awt.Color(255, 255, 255));
        btnD1DefDec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1DefDec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N

        btnD1PosDec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD1PosDec.setForeground(new java.awt.Color(255, 255, 255));
        btnD1PosDec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1PosDec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N

        imgD1Pos.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgD1Pos.setForeground(new java.awt.Color(255, 255, 255));
        imgD1Pos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1Pos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnD1PosInc.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD1PosInc.setForeground(new java.awt.Color(255, 255, 255));
        btnD1PosInc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1PosInc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel64.setBackground(new java.awt.Color(113, 132, 137));
        jLabel64.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Overtake - Position");
        jLabel64.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel64.setOpaque(true);

        btnD1LapDec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD1LapDec.setForeground(new java.awt.Color(255, 255, 255));
        btnD1LapDec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1LapDec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N

        btnD1LapInc.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD1LapInc.setForeground(new java.awt.Color(255, 255, 255));
        btnD1LapInc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1LapInc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel65.setBackground(new java.awt.Color(113, 132, 137));
        jLabel65.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("Overtake - Lapping");
        jLabel65.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel65.setOpaque(true);

        imgD1Lap.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgD1Lap.setForeground(new java.awt.Color(255, 255, 255));
        imgD1Lap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD1Lap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        lblD1.setBackground(new java.awt.Color(113, 132, 137));
        lblD1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblD1.setForeground(new java.awt.Color(255, 255, 255));
        lblD1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblD1.setText(" ");
        lblD1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblD1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnD1AccDec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1Acc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnD1AccInc))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnD1BrkDec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1Brk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnD1BrkInc))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnD1TopDec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1Top)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnD1TopInc))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnD1KerDec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1Ker)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnD1KerInc))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnD1ORLDec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1ORL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnD1ORLInc))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnD1DefDec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1Def)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnD1DefInc))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnD1PosDec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1Pos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnD1PosInc))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnD1LapDec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imgD1Lap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnD1LapInc)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD1AccInc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imgD1Acc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnD1AccDec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD1BrkInc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imgD1Brk, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnD1BrkDec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD1TopInc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imgD1Top, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnD1TopDec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD1KerInc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imgD1Ker, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnD1KerDec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD1ORLInc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imgD1ORL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnD1ORLDec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD1DefInc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imgD1Def, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnD1DefDec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD1PosInc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imgD1Pos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnD1PosDec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD1LapInc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imgD1Lap, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnD1LapDec))
                .addGap(187, 187, 187))
        );

        add(jPanel1);

        jPanel2.setOpaque(false);

        jLabel9.setBackground(new java.awt.Color(113, 132, 137));
        jLabel9.setFont(new java.awt.Font("Formula1 Display Bold", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Driver 2");
        jLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel9.setOpaque(true);

        btnD2AccDec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD2AccDec.setForeground(new java.awt.Color(255, 255, 255));
        btnD2AccDec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2AccDec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N

        jLabel66.setBackground(new java.awt.Color(113, 132, 137));
        jLabel66.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Acceleration");
        jLabel66.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel66.setOpaque(true);

        btnD2AccInc.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD2AccInc.setForeground(new java.awt.Color(255, 255, 255));
        btnD2AccInc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2AccInc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgD2Acc.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgD2Acc.setForeground(new java.awt.Color(255, 255, 255));
        imgD2Acc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2Acc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel68.setBackground(new java.awt.Color(113, 132, 137));
        jLabel68.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("Braking");
        jLabel68.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel68.setOpaque(true);

        btnD2BrkDec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD2BrkDec.setForeground(new java.awt.Color(255, 255, 255));
        btnD2BrkDec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2BrkDec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N

        imgD2Brk.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgD2Brk.setForeground(new java.awt.Color(255, 255, 255));
        imgD2Brk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2Brk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnD2BrkInc.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD2BrkInc.setForeground(new java.awt.Color(255, 255, 255));
        btnD2BrkInc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2BrkInc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        btnD2TopInc.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD2TopInc.setForeground(new java.awt.Color(255, 255, 255));
        btnD2TopInc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2TopInc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        btnD2TopDec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD2TopDec.setForeground(new java.awt.Color(255, 255, 255));
        btnD2TopDec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2TopDec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N

        imgD2Top.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgD2Top.setForeground(new java.awt.Color(255, 255, 255));
        imgD2Top.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2Top.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel69.setBackground(new java.awt.Color(113, 132, 137));
        jLabel69.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("Top Speed");
        jLabel69.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel69.setOpaque(true);

        jLabel70.setBackground(new java.awt.Color(113, 132, 137));
        jLabel70.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("Kerb Use");
        jLabel70.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel70.setOpaque(true);

        btnD2KerDec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD2KerDec.setForeground(new java.awt.Color(255, 255, 255));
        btnD2KerDec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2KerDec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N

        btnD2KerInc.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD2KerInc.setForeground(new java.awt.Color(255, 255, 255));
        btnD2KerInc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2KerInc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        imgD2Ker.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgD2Ker.setForeground(new java.awt.Color(255, 255, 255));
        imgD2Ker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2Ker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        jLabel71.setBackground(new java.awt.Color(113, 132, 137));
        jLabel71.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("Off Racing Line");
        jLabel71.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel71.setOpaque(true);

        btnD2ORLInc.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD2ORLInc.setForeground(new java.awt.Color(255, 255, 255));
        btnD2ORLInc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2ORLInc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        btnD2ORLDec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD2ORLDec.setForeground(new java.awt.Color(255, 255, 255));
        btnD2ORLDec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2ORLDec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N

        imgD2ORL.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgD2ORL.setForeground(new java.awt.Color(255, 255, 255));
        imgD2ORL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2ORL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnD2DefInc.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD2DefInc.setForeground(new java.awt.Color(255, 255, 255));
        btnD2DefInc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2DefInc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel112.setBackground(new java.awt.Color(113, 132, 137));
        jLabel112.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel112.setText("Line Defence");
        jLabel112.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel112.setOpaque(true);

        imgD2Def.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgD2Def.setForeground(new java.awt.Color(255, 255, 255));
        imgD2Def.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2Def.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnD2DefDec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD2DefDec.setForeground(new java.awt.Color(255, 255, 255));
        btnD2DefDec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2DefDec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N

        btnD2PosDec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD2PosDec.setForeground(new java.awt.Color(255, 255, 255));
        btnD2PosDec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2PosDec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N

        imgD2Pos.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgD2Pos.setForeground(new java.awt.Color(255, 255, 255));
        imgD2Pos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2Pos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        btnD2PosInc.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD2PosInc.setForeground(new java.awt.Color(255, 255, 255));
        btnD2PosInc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2PosInc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel118.setBackground(new java.awt.Color(113, 132, 137));
        jLabel118.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel118.setText("Overtake - Position");
        jLabel118.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel118.setOpaque(true);

        btnD2LapDec.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD2LapDec.setForeground(new java.awt.Color(255, 255, 255));
        btnD2LapDec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2LapDec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N

        btnD2LapInc.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnD2LapInc.setForeground(new java.awt.Color(255, 255, 255));
        btnD2LapInc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2LapInc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N

        jLabel121.setBackground(new java.awt.Color(113, 132, 137));
        jLabel121.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel121.setText("Overtake - Lapping");
        jLabel121.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        jLabel121.setOpaque(true);

        imgD2Lap.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgD2Lap.setForeground(new java.awt.Color(255, 255, 255));
        imgD2Lap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgD2Lap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/10ability10.png"))); // NOI18N

        lblD2.setBackground(new java.awt.Color(113, 132, 137));
        lblD2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblD2.setForeground(new java.awt.Color(255, 255, 255));
        lblD2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblD2.setText(" ");
        lblD2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblD2.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD2AccDec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgD2Acc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD2AccInc))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD2BrkDec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgD2Brk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD2BrkInc))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD2TopDec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgD2Top)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD2TopInc))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD2KerDec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgD2Ker)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD2KerInc))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD2ORLDec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgD2ORL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD2ORLInc))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD2DefDec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgD2Def)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD2DefInc))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel118, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD2PosDec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgD2Pos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD2PosInc))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD2LapDec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgD2Lap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD2LapInc))
                    .addComponent(lblD2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblD2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD2AccInc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imgD2Acc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnD2AccDec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD2BrkInc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imgD2Brk, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnD2BrkDec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD2TopInc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imgD2Top, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnD2TopDec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD2KerInc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imgD2Ker, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnD2KerDec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD2ORLInc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imgD2ORL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnD2ORLDec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD2DefInc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imgD2Def, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnD2DefDec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel118, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD2PosInc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imgD2Pos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnD2PosDec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnD2LapInc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imgD2Lap, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnD2LapDec))
                .addGap(187, 187, 187))
        );

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnD1AccDec;
    private javax.swing.JLabel btnD1AccInc;
    private javax.swing.JLabel btnD1BrkDec;
    private javax.swing.JLabel btnD1BrkInc;
    private javax.swing.JLabel btnD1DefDec;
    private javax.swing.JLabel btnD1DefInc;
    private javax.swing.JLabel btnD1KerDec;
    private javax.swing.JLabel btnD1KerInc;
    private javax.swing.JLabel btnD1LapDec;
    private javax.swing.JLabel btnD1LapInc;
    private javax.swing.JLabel btnD1ORLDec;
    private javax.swing.JLabel btnD1ORLInc;
    private javax.swing.JLabel btnD1PosDec;
    private javax.swing.JLabel btnD1PosInc;
    private javax.swing.JLabel btnD1TopDec;
    private javax.swing.JLabel btnD1TopInc;
    private javax.swing.JLabel btnD2AccDec;
    private javax.swing.JLabel btnD2AccInc;
    private javax.swing.JLabel btnD2BrkDec;
    private javax.swing.JLabel btnD2BrkInc;
    private javax.swing.JLabel btnD2DefDec;
    private javax.swing.JLabel btnD2DefInc;
    private javax.swing.JLabel btnD2KerDec;
    private javax.swing.JLabel btnD2KerInc;
    private javax.swing.JLabel btnD2LapDec;
    private javax.swing.JLabel btnD2LapInc;
    private javax.swing.JLabel btnD2ORLDec;
    private javax.swing.JLabel btnD2ORLInc;
    private javax.swing.JLabel btnD2PosDec;
    private javax.swing.JLabel btnD2PosInc;
    private javax.swing.JLabel btnD2TopDec;
    private javax.swing.JLabel btnD2TopInc;
    private javax.swing.JLabel imgD1Acc;
    private javax.swing.JLabel imgD1Brk;
    private javax.swing.JLabel imgD1Def;
    private javax.swing.JLabel imgD1Ker;
    private javax.swing.JLabel imgD1Lap;
    private javax.swing.JLabel imgD1ORL;
    private javax.swing.JLabel imgD1Pos;
    private javax.swing.JLabel imgD1Top;
    private javax.swing.JLabel imgD2Acc;
    private javax.swing.JLabel imgD2Brk;
    private javax.swing.JLabel imgD2Def;
    private javax.swing.JLabel imgD2Ker;
    private javax.swing.JLabel imgD2Lap;
    private javax.swing.JLabel imgD2ORL;
    private javax.swing.JLabel imgD2Pos;
    private javax.swing.JLabel imgD2Top;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblD1;
    private javax.swing.JLabel lblD2;
    // End of variables declaration//GEN-END:variables
}
