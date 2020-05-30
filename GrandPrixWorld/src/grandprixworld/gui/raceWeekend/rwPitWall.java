/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gui.raceWeekend;

import grandprixworld.gui.FullGame;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.imageio.ImageIO;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author Josh Brookes
 */
public class rwPitWall extends javax.swing.JPanel {

    /**
     * Creates new form rwPitWall
     */
    private static int mode;//1 - gap to next; 2 - tyres; 3 - stops; 4 - best lap; 5 - last lap

    public int d1carnum;
    public int d2carnum;
    public static double lastGap[] = new double[20];
    public static int focus;
    public static boolean d1pit = false;
    public static boolean d2pit = false;

    public rwPitWall() {
        initComponents();
        initOther();
        initMap();
        focus = 0;
        lblRaceName.setText(FullGame.data.currentYear + " FORMULA 1 " + FullGame.data.f1.findNextEvent().eventName.toUpperCase());
        try {
            race = new Race(grandprixworld.gui.FullGame.data.f1.findNextEvent(), map.grid, map.startDir, ImageIO.read(getClass().getResource("/resources/" + FullGame.data.f1.findNextEvent().venue.imageCode + ".jpg")));
            race.start();
        } catch (IOException e) {
            System.out.println(e);
        }
        d1carnum = findCarIndexByDriverNum(FullGame.data.findPlayerTeam().driver1.raceNum);
        d2carnum = findCarIndexByDriverNum(FullGame.data.findPlayerTeam().driver2.raceNum);
        mode = 0;
    }

    public void initOther() {
        btnP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(1);
            }
        });
        btnP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(2);
            }
        });
        btnP3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(3);
            }
        });
        btnP4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(4);
            }
        });
        btnP5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(5);
            }
        });
        btnP6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(6);
            }
        });
        btnP7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(7);
            }
        });
        btnP8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(8);
            }
        });
        btnP9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(9);
            }
        });
        btnP10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(10);
            }
        });
        btnP11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(11);
            }
        });
        btnP12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(12);
            }
        });
        btnP13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(13);
            }
        });
        btnP14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(14);
            }
        });
        btnP15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(15);
            }
        });
        btnP16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(16);
            }
        });
        btnP17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(17);
            }
        });
        btnP18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(18);
            }
        });
        btnP19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(19);
            }
        });
        btnP20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeFocus(20);
            }
        });
    }

    public void initMap() {
        scrCircuit.getViewport().add(map = new rwCircuitMap(FullGame.data.f1.findNextEvent().venue.imageCode));
    }

    private void changeFocus(int pos) {
        focus = race.raceStandings.get(pos - 1).carnum;
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
        btnP1 = new javax.swing.JLabel();
        lblNameP1 = new javax.swing.JLabel();
        lblInfoP1 = new javax.swing.JLabel();
        btnP2 = new javax.swing.JLabel();
        lblNameP2 = new javax.swing.JLabel();
        lblInfoP2 = new javax.swing.JLabel();
        lblNameP3 = new javax.swing.JLabel();
        btnP3 = new javax.swing.JLabel();
        lblInfoP3 = new javax.swing.JLabel();
        lblNameP4 = new javax.swing.JLabel();
        btnP4 = new javax.swing.JLabel();
        lblInfoP4 = new javax.swing.JLabel();
        lblInfoP5 = new javax.swing.JLabel();
        btnP5 = new javax.swing.JLabel();
        lblNameP5 = new javax.swing.JLabel();
        lblNameP6 = new javax.swing.JLabel();
        lblInfoP6 = new javax.swing.JLabel();
        btnP6 = new javax.swing.JLabel();
        lblInfoP7 = new javax.swing.JLabel();
        lblNameP7 = new javax.swing.JLabel();
        btnP7 = new javax.swing.JLabel();
        lblNameP8 = new javax.swing.JLabel();
        btnP8 = new javax.swing.JLabel();
        lblInfoP8 = new javax.swing.JLabel();
        lblNameP9 = new javax.swing.JLabel();
        lblInfoP9 = new javax.swing.JLabel();
        btnP9 = new javax.swing.JLabel();
        lblNameP10 = new javax.swing.JLabel();
        btnP10 = new javax.swing.JLabel();
        lblInfoP10 = new javax.swing.JLabel();
        lblNameP11 = new javax.swing.JLabel();
        lblInfoP11 = new javax.swing.JLabel();
        btnP11 = new javax.swing.JLabel();
        btnP12 = new javax.swing.JLabel();
        lblNameP12 = new javax.swing.JLabel();
        lblInfoP12 = new javax.swing.JLabel();
        lblInfoP13 = new javax.swing.JLabel();
        btnP13 = new javax.swing.JLabel();
        lblNameP13 = new javax.swing.JLabel();
        lblNameP14 = new javax.swing.JLabel();
        lblInfoP14 = new javax.swing.JLabel();
        btnP14 = new javax.swing.JLabel();
        lblNameP15 = new javax.swing.JLabel();
        btnP15 = new javax.swing.JLabel();
        lblInfoP15 = new javax.swing.JLabel();
        lblInfoP16 = new javax.swing.JLabel();
        lblNameP16 = new javax.swing.JLabel();
        btnP16 = new javax.swing.JLabel();
        lblNameP17 = new javax.swing.JLabel();
        lblInfoP17 = new javax.swing.JLabel();
        btnP17 = new javax.swing.JLabel();
        lblInfoP18 = new javax.swing.JLabel();
        lblNameP18 = new javax.swing.JLabel();
        btnP18 = new javax.swing.JLabel();
        btnP19 = new javax.swing.JLabel();
        lblInfoP19 = new javax.swing.JLabel();
        lblNameP19 = new javax.swing.JLabel();
        lblInfoP20 = new javax.swing.JLabel();
        btnP20 = new javax.swing.JLabel();
        lblNameP20 = new javax.swing.JLabel();
        btnToggleMode = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        lblRaceName = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        lblLapCount = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        scrCircuit = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblD1Line1 = new javax.swing.JLabel();
        lblD1Line2 = new javax.swing.JLabel();
        lblD1Line3 = new javax.swing.JLabel();
        btnD1Pit = new javax.swing.JLabel();
        btnD1Soft = new javax.swing.JLabel();
        btnD1Med = new javax.swing.JLabel();
        btnD1Hard = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblD2Line1 = new javax.swing.JLabel();
        lblD2Line2 = new javax.swing.JLabel();
        lblD2Line3 = new javax.swing.JLabel();
        btnD2Pit = new javax.swing.JLabel();
        btnD2Soft = new javax.swing.JLabel();
        btnD2Med = new javax.swing.JLabel();
        btnD2Hard = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        setMaximumSize(new java.awt.Dimension(1428, 788));
        setMinimumSize(new java.awt.Dimension(1428, 788));
        setPreferredSize(new java.awt.Dimension(1428, 788));
        setLayout(new java.awt.BorderLayout(20, 5));

        jPanel1.setBackground(new java.awt.Color(64, 64, 64));
        jPanel1.setMaximumSize(new java.awt.Dimension(325, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(325, 650));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(325, 650));

        btnP1.setBackground(new java.awt.Color(113, 132, 137));
        btnP1.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP1.setForeground(new java.awt.Color(255, 255, 255));
        btnP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP1.setText("1");
        btnP1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP1.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP1.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP1.setOpaque(true);
        btnP1.setPreferredSize(new java.awt.Dimension(55, 26));

        lblNameP1.setBackground(new java.awt.Color(30, 65, 255));
        lblNameP1.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP1.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP1.setText("VER");
        lblNameP1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP1.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP1.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP1.setOpaque(true);
        lblNameP1.setPreferredSize(new java.awt.Dimension(85, 26));

        lblInfoP1.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP1.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP1.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP1.setText("Leader");
        lblInfoP1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP1.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP1.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP1.setName(""); // NOI18N
        lblInfoP1.setOpaque(true);
        lblInfoP1.setPreferredSize(new java.awt.Dimension(160, 26));

        btnP2.setBackground(new java.awt.Color(113, 132, 137));
        btnP2.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP2.setForeground(new java.awt.Color(255, 255, 255));
        btnP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP2.setText("2");
        btnP2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP2.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP2.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP2.setOpaque(true);
        btnP2.setPreferredSize(new java.awt.Dimension(55, 26));

        lblNameP2.setBackground(new java.awt.Color(30, 65, 255));
        lblNameP2.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP2.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP2.setText("GAS");
        lblNameP2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP2.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP2.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP2.setOpaque(true);
        lblNameP2.setPreferredSize(new java.awt.Dimension(85, 26));

        lblInfoP2.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP2.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP2.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP2.setText("+1.000");
        lblInfoP2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP2.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP2.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP2.setName(""); // NOI18N
        lblInfoP2.setOpaque(true);
        lblInfoP2.setPreferredSize(new java.awt.Dimension(160, 26));

        lblNameP3.setBackground(new java.awt.Color(255, 135, 0));
        lblNameP3.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP3.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP3.setText("SAI");
        lblNameP3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP3.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP3.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP3.setOpaque(true);
        lblNameP3.setPreferredSize(new java.awt.Dimension(85, 26));

        btnP3.setBackground(new java.awt.Color(113, 132, 137));
        btnP3.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP3.setForeground(new java.awt.Color(255, 255, 255));
        btnP3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP3.setText("3");
        btnP3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP3.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP3.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP3.setOpaque(true);
        btnP3.setPreferredSize(new java.awt.Dimension(55, 26));

        lblInfoP3.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP3.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP3.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP3.setText("+1.000");
        lblInfoP3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP3.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP3.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP3.setName(""); // NOI18N
        lblInfoP3.setOpaque(true);
        lblInfoP3.setPreferredSize(new java.awt.Dimension(160, 26));

        lblNameP4.setBackground(new java.awt.Color(155, 0, 0));
        lblNameP4.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP4.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP4.setText("RAI");
        lblNameP4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP4.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP4.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP4.setOpaque(true);
        lblNameP4.setPreferredSize(new java.awt.Dimension(85, 26));

        btnP4.setBackground(new java.awt.Color(113, 132, 137));
        btnP4.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP4.setForeground(new java.awt.Color(255, 255, 255));
        btnP4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP4.setText("4");
        btnP4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP4.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP4.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP4.setOpaque(true);
        btnP4.setPreferredSize(new java.awt.Dimension(55, 26));

        lblInfoP4.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP4.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP4.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP4.setText("+1.000");
        lblInfoP4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP4.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP4.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP4.setName(""); // NOI18N
        lblInfoP4.setOpaque(true);
        lblInfoP4.setPreferredSize(new java.awt.Dimension(160, 26));

        lblInfoP5.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP5.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP5.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP5.setText("+1.000");
        lblInfoP5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP5.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP5.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP5.setName(""); // NOI18N
        lblInfoP5.setOpaque(true);
        lblInfoP5.setPreferredSize(new java.awt.Dimension(160, 26));

        btnP5.setBackground(new java.awt.Color(113, 132, 137));
        btnP5.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP5.setForeground(new java.awt.Color(255, 255, 255));
        btnP5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP5.setText("5");
        btnP5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP5.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP5.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP5.setOpaque(true);
        btnP5.setPreferredSize(new java.awt.Dimension(55, 26));

        lblNameP5.setBackground(new java.awt.Color(155, 0, 0));
        lblNameP5.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP5.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP5.setText("GIO");
        lblNameP5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP5.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP5.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP5.setOpaque(true);
        lblNameP5.setPreferredSize(new java.awt.Dimension(85, 26));

        lblNameP6.setBackground(new java.awt.Color(255, 225, 0));
        lblNameP6.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP6.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP6.setText("RIC");
        lblNameP6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP6.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP6.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP6.setOpaque(true);
        lblNameP6.setPreferredSize(new java.awt.Dimension(85, 26));

        lblInfoP6.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP6.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP6.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP6.setText("+1.000");
        lblInfoP6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP6.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP6.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP6.setName(""); // NOI18N
        lblInfoP6.setOpaque(true);
        lblInfoP6.setPreferredSize(new java.awt.Dimension(160, 26));

        btnP6.setBackground(new java.awt.Color(113, 132, 137));
        btnP6.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP6.setForeground(new java.awt.Color(255, 255, 255));
        btnP6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP6.setText("6");
        btnP6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP6.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP6.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP6.setOpaque(true);
        btnP6.setPreferredSize(new java.awt.Dimension(55, 26));

        lblInfoP7.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP7.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP7.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP7.setText("+1.000");
        lblInfoP7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP7.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP7.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP7.setName(""); // NOI18N
        lblInfoP7.setOpaque(true);
        lblInfoP7.setPreferredSize(new java.awt.Dimension(160, 26));

        lblNameP7.setBackground(new java.awt.Color(0, 210, 190));
        lblNameP7.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP7.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP7.setText("HAM");
        lblNameP7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP7.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP7.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP7.setOpaque(true);
        lblNameP7.setPreferredSize(new java.awt.Dimension(85, 26));

        btnP7.setBackground(new java.awt.Color(113, 132, 137));
        btnP7.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP7.setForeground(new java.awt.Color(255, 255, 255));
        btnP7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP7.setText("7");
        btnP7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP7.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP7.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP7.setOpaque(true);
        btnP7.setPreferredSize(new java.awt.Dimension(55, 26));

        lblNameP8.setBackground(new java.awt.Color(255, 135, 0));
        lblNameP8.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP8.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP8.setText("NOR");
        lblNameP8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP8.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP8.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP8.setOpaque(true);
        lblNameP8.setPreferredSize(new java.awt.Dimension(85, 26));

        btnP8.setBackground(new java.awt.Color(113, 132, 137));
        btnP8.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP8.setForeground(new java.awt.Color(255, 255, 255));
        btnP8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP8.setText("8");
        btnP8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP8.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP8.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP8.setOpaque(true);
        btnP8.setPreferredSize(new java.awt.Dimension(55, 26));

        lblInfoP8.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP8.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP8.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP8.setText("+1.000");
        lblInfoP8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP8.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP8.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP8.setName(""); // NOI18N
        lblInfoP8.setOpaque(true);
        lblInfoP8.setPreferredSize(new java.awt.Dimension(160, 26));

        lblNameP9.setBackground(new java.awt.Color(245, 150, 200));
        lblNameP9.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP9.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP9.setText("PER");
        lblNameP9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP9.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP9.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP9.setOpaque(true);
        lblNameP9.setPreferredSize(new java.awt.Dimension(85, 26));

        lblInfoP9.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP9.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP9.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP9.setText("+1.000");
        lblInfoP9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP9.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP9.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP9.setName(""); // NOI18N
        lblInfoP9.setOpaque(true);
        lblInfoP9.setPreferredSize(new java.awt.Dimension(160, 26));

        btnP9.setBackground(new java.awt.Color(113, 132, 137));
        btnP9.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP9.setForeground(new java.awt.Color(255, 255, 255));
        btnP9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP9.setText("9");
        btnP9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP9.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP9.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP9.setOpaque(true);
        btnP9.setPreferredSize(new java.awt.Dimension(55, 26));

        lblNameP10.setBackground(new java.awt.Color(70, 155, 255));
        lblNameP10.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP10.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP10.setText("KVY");
        lblNameP10.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP10.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP10.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP10.setOpaque(true);
        lblNameP10.setPreferredSize(new java.awt.Dimension(85, 26));

        btnP10.setBackground(new java.awt.Color(113, 132, 137));
        btnP10.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP10.setForeground(new java.awt.Color(255, 255, 255));
        btnP10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP10.setText("10");
        btnP10.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP10.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP10.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP10.setOpaque(true);
        btnP10.setPreferredSize(new java.awt.Dimension(55, 26));

        lblInfoP10.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP10.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP10.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP10.setText("+1.000");
        lblInfoP10.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP10.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP10.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP10.setName(""); // NOI18N
        lblInfoP10.setOpaque(true);
        lblInfoP10.setPreferredSize(new java.awt.Dimension(160, 26));

        lblNameP11.setBackground(new java.awt.Color(240, 215, 135));
        lblNameP11.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP11.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP11.setText("MAG");
        lblNameP11.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP11.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP11.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP11.setOpaque(true);
        lblNameP11.setPreferredSize(new java.awt.Dimension(85, 26));

        lblInfoP11.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP11.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP11.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP11.setText("+1.000");
        lblInfoP11.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP11.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP11.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP11.setName(""); // NOI18N
        lblInfoP11.setOpaque(true);
        lblInfoP11.setPreferredSize(new java.awt.Dimension(160, 26));

        btnP11.setBackground(new java.awt.Color(113, 132, 137));
        btnP11.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP11.setForeground(new java.awt.Color(255, 255, 255));
        btnP11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP11.setText("11");
        btnP11.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP11.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP11.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP11.setOpaque(true);
        btnP11.setPreferredSize(new java.awt.Dimension(55, 26));

        btnP12.setBackground(new java.awt.Color(113, 132, 137));
        btnP12.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP12.setForeground(new java.awt.Color(255, 255, 255));
        btnP12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP12.setText("12");
        btnP12.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP12.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP12.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP12.setOpaque(true);
        btnP12.setPreferredSize(new java.awt.Dimension(55, 26));

        lblNameP12.setBackground(new java.awt.Color(0, 130, 250));
        lblNameP12.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP12.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP12.setText("RUS");
        lblNameP12.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP12.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP12.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP12.setOpaque(true);
        lblNameP12.setPreferredSize(new java.awt.Dimension(85, 26));

        lblInfoP12.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP12.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP12.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP12.setText("+1.000");
        lblInfoP12.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP12.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP12.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP12.setName(""); // NOI18N
        lblInfoP12.setOpaque(true);
        lblInfoP12.setPreferredSize(new java.awt.Dimension(160, 26));

        lblInfoP13.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP13.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP13.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP13.setText("+1.000");
        lblInfoP13.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP13.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP13.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP13.setName(""); // NOI18N
        lblInfoP13.setOpaque(true);
        lblInfoP13.setPreferredSize(new java.awt.Dimension(160, 26));

        btnP13.setBackground(new java.awt.Color(113, 132, 137));
        btnP13.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP13.setForeground(new java.awt.Color(255, 255, 255));
        btnP13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP13.setText("13");
        btnP13.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP13.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP13.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP13.setOpaque(true);
        btnP13.setPreferredSize(new java.awt.Dimension(55, 26));

        lblNameP13.setBackground(new java.awt.Color(240, 215, 135));
        lblNameP13.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP13.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP13.setText("GRO");
        lblNameP13.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP13.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP13.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP13.setOpaque(true);
        lblNameP13.setPreferredSize(new java.awt.Dimension(85, 26));

        lblNameP14.setBackground(new java.awt.Color(70, 155, 255));
        lblNameP14.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP14.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP14.setText("ALB");
        lblNameP14.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP14.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP14.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP14.setOpaque(true);
        lblNameP14.setPreferredSize(new java.awt.Dimension(85, 26));

        lblInfoP14.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP14.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP14.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP14.setText("+1.000");
        lblInfoP14.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP14.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP14.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP14.setName(""); // NOI18N
        lblInfoP14.setOpaque(true);
        lblInfoP14.setPreferredSize(new java.awt.Dimension(160, 26));

        btnP14.setBackground(new java.awt.Color(113, 132, 137));
        btnP14.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP14.setForeground(new java.awt.Color(255, 255, 255));
        btnP14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP14.setText("14");
        btnP14.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP14.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP14.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP14.setOpaque(true);
        btnP14.setPreferredSize(new java.awt.Dimension(55, 26));

        lblNameP15.setBackground(new java.awt.Color(255, 225, 0));
        lblNameP15.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP15.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP15.setText("HUL");
        lblNameP15.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP15.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP15.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP15.setOpaque(true);
        lblNameP15.setPreferredSize(new java.awt.Dimension(85, 26));

        btnP15.setBackground(new java.awt.Color(113, 132, 137));
        btnP15.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP15.setForeground(new java.awt.Color(255, 255, 255));
        btnP15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP15.setText("15");
        btnP15.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP15.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP15.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP15.setOpaque(true);
        btnP15.setPreferredSize(new java.awt.Dimension(55, 26));

        lblInfoP15.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP15.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP15.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP15.setText("+1.000");
        lblInfoP15.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP15.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP15.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP15.setName(""); // NOI18N
        lblInfoP15.setOpaque(true);
        lblInfoP15.setPreferredSize(new java.awt.Dimension(160, 26));

        lblInfoP16.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP16.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP16.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP16.setText("+1.000");
        lblInfoP16.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP16.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP16.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP16.setName(""); // NOI18N
        lblInfoP16.setOpaque(true);
        lblInfoP16.setPreferredSize(new java.awt.Dimension(160, 26));

        lblNameP16.setBackground(new java.awt.Color(0, 130, 250));
        lblNameP16.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP16.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP16.setText("KUB");
        lblNameP16.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP16.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP16.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP16.setOpaque(true);
        lblNameP16.setPreferredSize(new java.awt.Dimension(85, 26));

        btnP16.setBackground(new java.awt.Color(113, 132, 137));
        btnP16.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP16.setForeground(new java.awt.Color(255, 255, 255));
        btnP16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP16.setText("16");
        btnP16.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP16.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP16.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP16.setOpaque(true);
        btnP16.setPreferredSize(new java.awt.Dimension(55, 26));

        lblNameP17.setBackground(new java.awt.Color(220, 0, 0));
        lblNameP17.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP17.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP17.setText("VET");
        lblNameP17.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP17.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP17.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP17.setOpaque(true);
        lblNameP17.setPreferredSize(new java.awt.Dimension(85, 26));

        lblInfoP17.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP17.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP17.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP17.setText("+1.000");
        lblInfoP17.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP17.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP17.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP17.setName(""); // NOI18N
        lblInfoP17.setOpaque(true);
        lblInfoP17.setPreferredSize(new java.awt.Dimension(160, 26));

        btnP17.setBackground(new java.awt.Color(113, 132, 137));
        btnP17.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP17.setForeground(new java.awt.Color(255, 255, 255));
        btnP17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP17.setText("17");
        btnP17.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP17.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP17.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP17.setOpaque(true);
        btnP17.setPreferredSize(new java.awt.Dimension(55, 26));

        lblInfoP18.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP18.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP18.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP18.setText("+1.000");
        lblInfoP18.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP18.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP18.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP18.setName(""); // NOI18N
        lblInfoP18.setOpaque(true);
        lblInfoP18.setPreferredSize(new java.awt.Dimension(160, 26));

        lblNameP18.setBackground(new java.awt.Color(220, 0, 0));
        lblNameP18.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP18.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP18.setText("LEC");
        lblNameP18.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP18.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP18.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP18.setOpaque(true);
        lblNameP18.setPreferredSize(new java.awt.Dimension(85, 26));

        btnP18.setBackground(new java.awt.Color(113, 132, 137));
        btnP18.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP18.setForeground(new java.awt.Color(255, 255, 255));
        btnP18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP18.setText("18");
        btnP18.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP18.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP18.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP18.setOpaque(true);
        btnP18.setPreferredSize(new java.awt.Dimension(55, 26));

        btnP19.setBackground(new java.awt.Color(113, 132, 137));
        btnP19.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP19.setForeground(new java.awt.Color(255, 255, 255));
        btnP19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP19.setText("19");
        btnP19.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP19.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP19.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP19.setOpaque(true);
        btnP19.setPreferredSize(new java.awt.Dimension(55, 26));

        lblInfoP19.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP19.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP19.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP19.setText("+1.000");
        lblInfoP19.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP19.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP19.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP19.setName(""); // NOI18N
        lblInfoP19.setOpaque(true);
        lblInfoP19.setPreferredSize(new java.awt.Dimension(160, 26));

        lblNameP19.setBackground(new java.awt.Color(245, 150, 200));
        lblNameP19.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP19.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP19.setText("STR");
        lblNameP19.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP19.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP19.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP19.setOpaque(true);
        lblNameP19.setPreferredSize(new java.awt.Dimension(85, 26));

        lblInfoP20.setBackground(new java.awt.Color(113, 132, 137));
        lblInfoP20.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblInfoP20.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoP20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoP20.setText("+1.000");
        lblInfoP20.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblInfoP20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInfoP20.setMaximumSize(new java.awt.Dimension(160, 26));
        lblInfoP20.setMinimumSize(new java.awt.Dimension(160, 26));
        lblInfoP20.setName(""); // NOI18N
        lblInfoP20.setOpaque(true);
        lblInfoP20.setPreferredSize(new java.awt.Dimension(160, 26));

        btnP20.setBackground(new java.awt.Color(113, 132, 137));
        btnP20.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        btnP20.setForeground(new java.awt.Color(255, 255, 255));
        btnP20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnP20.setText("20");
        btnP20.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnP20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnP20.setMaximumSize(new java.awt.Dimension(55, 26));
        btnP20.setMinimumSize(new java.awt.Dimension(55, 26));
        btnP20.setOpaque(true);
        btnP20.setPreferredSize(new java.awt.Dimension(55, 26));

        lblNameP20.setBackground(new java.awt.Color(0, 210, 190));
        lblNameP20.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblNameP20.setForeground(new java.awt.Color(255, 255, 255));
        lblNameP20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameP20.setText("BOT");
        lblNameP20.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNameP20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblNameP20.setMaximumSize(new java.awt.Dimension(85, 26));
        lblNameP20.setMinimumSize(new java.awt.Dimension(85, 26));
        lblNameP20.setOpaque(true);
        lblNameP20.setPreferredSize(new java.awt.Dimension(85, 26));

        btnToggleMode.setBackground(new java.awt.Color(113, 132, 137));
        btnToggleMode.setFont(new java.awt.Font("Formula1 Display Bold", 0, 12)); // NOI18N
        btnToggleMode.setForeground(new java.awt.Color(255, 255, 255));
        btnToggleMode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnToggleMode.setText("Toggle Mode");
        btnToggleMode.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnToggleMode.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnToggleMode.setMaximumSize(new java.awt.Dimension(160, 26));
        btnToggleMode.setMinimumSize(new java.awt.Dimension(160, 26));
        btnToggleMode.setName(""); // NOI18N
        btnToggleMode.setOpaque(true);
        btnToggleMode.setPreferredSize(new java.awt.Dimension(160, 26));
        btnToggleMode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnToggleModeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnP3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameP3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfoP3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnP4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameP4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfoP4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnP5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameP5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfoP5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnP6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameP6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfoP6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnP7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameP7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfoP7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnP8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameP8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfoP8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnP9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameP9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfoP9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnP10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameP10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfoP10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnP11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameP11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfoP11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnP12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameP12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfoP12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnP13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameP13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfoP13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnP14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameP14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfoP14, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnP15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameP15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfoP15, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnP16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameP16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfoP16, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnP17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameP17, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfoP17, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnP18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameP18, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfoP18, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnP19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameP19, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfoP19, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnP20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNameP20, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfoP20, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNameP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNameP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblInfoP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblInfoP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnToggleMode, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameP9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoP9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameP10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoP10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameP11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoP11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameP12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoP12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameP13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoP13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameP14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoP14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameP15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoP15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameP16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoP16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameP17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoP17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameP18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoP18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameP19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoP19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblInfoP20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnToggleMode, javax.swing.GroupLayout.PREFERRED_SIZE, 14, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnP20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNameP20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setMaximumSize(new java.awt.Dimension(1440, 98));
        jPanel2.setMinimumSize(new java.awt.Dimension(1440, 98));
        jPanel2.setOpaque(false);

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/accept.png"))); // NOI18N
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel61MouseClicked(evt);
            }
        });

        lblRaceName.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        lblRaceName.setForeground(new java.awt.Color(255, 255, 255));
        lblRaceName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRaceName.setText(" ");
        lblRaceName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblRaceName.setMaximumSize(new java.awt.Dimension(750, 26));
        lblRaceName.setMinimumSize(new java.awt.Dimension(750, 26));
        lblRaceName.setName(""); // NOI18N
        lblRaceName.setPreferredSize(new java.awt.Dimension(750, 26));

        jLabel63.setFont(new java.awt.Font("Formula1 Display Bold", 0, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("RACE");
        jLabel63.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel63.setMaximumSize(new java.awt.Dimension(160, 26));
        jLabel63.setMinimumSize(new java.awt.Dimension(160, 26));
        jLabel63.setName(""); // NOI18N
        jLabel63.setPreferredSize(new java.awt.Dimension(160, 26));

        lblLapCount.setFont(new java.awt.Font("Formula1 Display Bold", 0, 30)); // NOI18N
        lblLapCount.setForeground(new java.awt.Color(255, 255, 255));
        lblLapCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLapCount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lapcount.png"))); // NOI18N
        lblLapCount.setText("Lap 58/58");
        lblLapCount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel65.setFont(new java.awt.Font("Formula1 Display Bold", 0, 30)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/safetycar.png"))); // NOI18N
        jLabel65.setText("VSC     ");
        jLabel65.setFocusable(false);
        jLabel65.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel65.setVisible(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLapCount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRaceName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel61)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65)
                    .addComponent(lblLapCount)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblRaceName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel61))
                .addContainerGap())
        );

        add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel5.setBackground(new java.awt.Color(0, 204, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.CardLayout());

        scrCircuit.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrCircuit.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrCircuit.setEnabled(false);
        jPanel5.add(scrCircuit, "card2");

        add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.setBackground(new java.awt.Color(0, 204, 0));
        jPanel6.setMaximumSize(new java.awt.Dimension(200, 650));
        jPanel6.setMinimumSize(new java.awt.Dimension(200, 650));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(200, 650));
        jPanel6.setLayout(new java.awt.GridLayout(2, 1, 5, 5));

        jPanel3.setOpaque(false);

        lblD1Line1.setBackground(new java.awt.Color(113, 132, 137));
        lblD1Line1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 14)); // NOI18N
        lblD1Line1.setForeground(new java.awt.Color(255, 255, 255));
        lblD1Line1.setText(" ");
        lblD1Line1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblD1Line1.setOpaque(true);

        lblD1Line2.setBackground(new java.awt.Color(113, 132, 137));
        lblD1Line2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 14)); // NOI18N
        lblD1Line2.setForeground(new java.awt.Color(255, 255, 255));
        lblD1Line2.setText(" ");
        lblD1Line2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblD1Line2.setOpaque(true);

        lblD1Line3.setBackground(new java.awt.Color(113, 132, 137));
        lblD1Line3.setFont(new java.awt.Font("Formula1 Display Regular", 0, 14)); // NOI18N
        lblD1Line3.setForeground(new java.awt.Color(255, 255, 255));
        lblD1Line3.setText(" ");
        lblD1Line3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblD1Line3.setOpaque(true);

        btnD1Pit.setBackground(new java.awt.Color(113, 132, 137));
        btnD1Pit.setFont(new java.awt.Font("Formula1 Display Bold", 1, 18)); // NOI18N
        btnD1Pit.setForeground(new java.awt.Color(255, 255, 255));
        btnD1Pit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1Pit.setText("PIT");
        btnD1Pit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnD1Pit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnD1Pit.setMaximumSize(new java.awt.Dimension(111, 111));
        btnD1Pit.setMinimumSize(new java.awt.Dimension(111, 111));
        btnD1Pit.setOpaque(true);
        btnD1Pit.setPreferredSize(new java.awt.Dimension(111, 111));
        btnD1Pit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnD1PitMouseClicked(evt);
            }
        });

        btnD1Soft.setBackground(new java.awt.Color(113, 132, 137));
        btnD1Soft.setFont(new java.awt.Font("Formula1 Display Regular", 1, 12)); // NOI18N
        btnD1Soft.setForeground(new java.awt.Color(0, 0, 0));
        btnD1Soft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1Soft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre1.png"))); // NOI18N
        btnD1Soft.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnD1Soft.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnD1Soft.setMaximumSize(new java.awt.Dimension(111, 111));
        btnD1Soft.setMinimumSize(new java.awt.Dimension(111, 111));
        btnD1Soft.setOpaque(true);
        btnD1Soft.setPreferredSize(new java.awt.Dimension(111, 111));
        btnD1Soft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnD1SoftMouseClicked(evt);
            }
        });

        btnD1Med.setBackground(new java.awt.Color(113, 132, 137));
        btnD1Med.setFont(new java.awt.Font("Formula1 Display Regular", 1, 12)); // NOI18N
        btnD1Med.setForeground(new java.awt.Color(0, 0, 0));
        btnD1Med.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1Med.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre2.png"))); // NOI18N
        btnD1Med.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnD1Med.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnD1Med.setMaximumSize(new java.awt.Dimension(111, 111));
        btnD1Med.setMinimumSize(new java.awt.Dimension(111, 111));
        btnD1Med.setOpaque(true);
        btnD1Med.setPreferredSize(new java.awt.Dimension(111, 111));
        btnD1Med.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnD1MedMouseClicked(evt);
            }
        });

        btnD1Hard.setBackground(new java.awt.Color(113, 132, 137));
        btnD1Hard.setFont(new java.awt.Font("Formula1 Display Regular", 1, 12)); // NOI18N
        btnD1Hard.setForeground(new java.awt.Color(0, 0, 0));
        btnD1Hard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD1Hard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre3.png"))); // NOI18N
        btnD1Hard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnD1Hard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnD1Hard.setMaximumSize(new java.awt.Dimension(111, 111));
        btnD1Hard.setMinimumSize(new java.awt.Dimension(111, 111));
        btnD1Hard.setOpaque(true);
        btnD1Hard.setPreferredSize(new java.awt.Dimension(111, 111));
        btnD1Hard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnD1HardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnD1Pit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblD1Line1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblD1Line2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblD1Line3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnD1Soft, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD1Med, javax.swing.GroupLayout.PREFERRED_SIZE, 54, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD1Hard, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD1Line1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblD1Line2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblD1Line3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnD1Soft, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD1Med, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD1Hard, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btnD1Pit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel3);

        jPanel4.setOpaque(false);

        lblD2Line1.setBackground(new java.awt.Color(113, 132, 137));
        lblD2Line1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 14)); // NOI18N
        lblD2Line1.setForeground(new java.awt.Color(255, 255, 255));
        lblD2Line1.setText(" ");
        lblD2Line1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblD2Line1.setOpaque(true);

        lblD2Line2.setBackground(new java.awt.Color(113, 132, 137));
        lblD2Line2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 14)); // NOI18N
        lblD2Line2.setForeground(new java.awt.Color(255, 255, 255));
        lblD2Line2.setText(" ");
        lblD2Line2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblD2Line2.setOpaque(true);

        lblD2Line3.setBackground(new java.awt.Color(113, 132, 137));
        lblD2Line3.setFont(new java.awt.Font("Formula1 Display Regular", 0, 14)); // NOI18N
        lblD2Line3.setForeground(new java.awt.Color(255, 255, 255));
        lblD2Line3.setText(" ");
        lblD2Line3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblD2Line3.setOpaque(true);

        btnD2Pit.setBackground(new java.awt.Color(113, 132, 137));
        btnD2Pit.setFont(new java.awt.Font("Formula1 Display Bold", 1, 18)); // NOI18N
        btnD2Pit.setForeground(new java.awt.Color(255, 255, 255));
        btnD2Pit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2Pit.setText("PIT");
        btnD2Pit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnD2Pit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnD2Pit.setMaximumSize(new java.awt.Dimension(111, 111));
        btnD2Pit.setMinimumSize(new java.awt.Dimension(111, 111));
        btnD2Pit.setOpaque(true);
        btnD2Pit.setPreferredSize(new java.awt.Dimension(111, 111));
        btnD2Pit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnD2PitMouseClicked(evt);
            }
        });

        btnD2Soft.setBackground(new java.awt.Color(113, 132, 137));
        btnD2Soft.setFont(new java.awt.Font("Formula1 Display Regular", 1, 12)); // NOI18N
        btnD2Soft.setForeground(new java.awt.Color(0, 0, 0));
        btnD2Soft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2Soft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre1.png"))); // NOI18N
        btnD2Soft.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnD2Soft.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnD2Soft.setMaximumSize(new java.awt.Dimension(111, 111));
        btnD2Soft.setMinimumSize(new java.awt.Dimension(111, 111));
        btnD2Soft.setOpaque(true);
        btnD2Soft.setPreferredSize(new java.awt.Dimension(111, 111));
        btnD2Soft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnD2SoftMouseClicked(evt);
            }
        });

        btnD2Med.setBackground(new java.awt.Color(113, 132, 137));
        btnD2Med.setFont(new java.awt.Font("Formula1 Display Regular", 1, 12)); // NOI18N
        btnD2Med.setForeground(new java.awt.Color(0, 0, 0));
        btnD2Med.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2Med.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre2.png"))); // NOI18N
        btnD2Med.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnD2Med.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnD2Med.setMaximumSize(new java.awt.Dimension(111, 111));
        btnD2Med.setMinimumSize(new java.awt.Dimension(111, 111));
        btnD2Med.setOpaque(true);
        btnD2Med.setPreferredSize(new java.awt.Dimension(111, 111));
        btnD2Med.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnD2MedMouseClicked(evt);
            }
        });

        btnD2Hard.setBackground(new java.awt.Color(113, 132, 137));
        btnD2Hard.setFont(new java.awt.Font("Formula1 Display Regular", 1, 12)); // NOI18N
        btnD2Hard.setForeground(new java.awt.Color(0, 0, 0));
        btnD2Hard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnD2Hard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tyre3.png"))); // NOI18N
        btnD2Hard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnD2Hard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnD2Hard.setMaximumSize(new java.awt.Dimension(111, 111));
        btnD2Hard.setMinimumSize(new java.awt.Dimension(111, 111));
        btnD2Hard.setOpaque(true);
        btnD2Hard.setPreferredSize(new java.awt.Dimension(111, 111));
        btnD2Hard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnD2HardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnD2Pit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblD2Line1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblD2Line2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblD2Line3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnD2Soft, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD2Med, javax.swing.GroupLayout.PREFERRED_SIZE, 54, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD2Hard, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblD2Line1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblD2Line2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblD2Line3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnD2Soft, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD2Med, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD2Hard, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btnD2Pit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel4);

        add(jPanel6, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked
        FullGame.exitRaceWeekend();
    }//GEN-LAST:event_jLabel61MouseClicked

    private void btnD1PitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnD1PitMouseClicked
        if (race.cars[d1carnum].nextTyreIndex != -1) {
            if (d1pit == true) {
                race.cars[d1carnum].pitThisLap = false;
                btnD1Pit.setBorder(new EmptyBorder(1, 1, 1, 1));
            } else {
                race.cars[d1carnum].pitThisLap = true;
                btnD1Pit.setBorder(new LineBorder(new Color(255, 0, 0), 2));
            }
            d1pit = !d1pit;
        }
    }//GEN-LAST:event_btnD1PitMouseClicked

    private void btnD2PitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnD2PitMouseClicked
        if (race.cars[d2carnum].nextTyreIndex != -1) {
            if (d2pit == true) {
                race.cars[d2carnum].pitThisLap = false;
                btnD2Pit.setBorder(new EmptyBorder(1, 1, 1, 1));
            } else {
                race.cars[d2carnum].pitThisLap = true;
                btnD2Pit.setBorder(new LineBorder(new Color(255, 0, 0), 2));
            }
            d2pit = !d2pit;
        }
    }//GEN-LAST:event_btnD2PitMouseClicked

    private void btnD1SoftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnD1SoftMouseClicked
        int bestindex = -1;
        int bestage = 1000;
        for (int i = 0; i < 13; i++) {
            if (race.cars[d1carnum].raceTyres[i].usable == true && race.cars[d1carnum].raceTyres[i].age < bestage
                    && race.cars[d1carnum].raceTyres[i].compound == race.softComp) {
                bestage = race.cars[d1carnum].raceTyres[i].age;
                bestindex = i;
            }
        }
        if (bestindex != -1) {
            race.cars[d1carnum].nextTyreIndex = bestindex;
            btnD1Soft.setBorder(new LineBorder(new Color(255, 0, 0), 2));
            btnD1Med.setBorder(new EmptyBorder(1, 1, 1, 1));
            btnD1Hard.setBorder(new EmptyBorder(1, 1, 1, 1));
        }
    }//GEN-LAST:event_btnD1SoftMouseClicked

    private void btnD1MedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnD1MedMouseClicked
        int bestindex = -1;
        int bestage = 1000;
        for (int i = 0; i < 13; i++) {
            if (race.cars[d1carnum].raceTyres[i].usable == true && race.cars[d1carnum].raceTyres[i].age < bestage
                    && race.cars[d1carnum].raceTyres[i].compound == race.medComp) {
                bestage = race.cars[d1carnum].raceTyres[i].age;
                bestindex = i;
            }
        }
        if (bestindex != -1) {
            race.cars[d1carnum].nextTyreIndex = bestindex;
            btnD1Med.setBorder(new LineBorder(new Color(255, 0, 0), 2));
            btnD1Soft.setBorder(new EmptyBorder(1, 1, 1, 1));
            btnD1Hard.setBorder(new EmptyBorder(1, 1, 1, 1));
        }
    }//GEN-LAST:event_btnD1MedMouseClicked

    private void btnD1HardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnD1HardMouseClicked
        int bestindex = -1;
        int bestage = 1000;
        for (int i = 0; i < 13; i++) {
            if (race.cars[d1carnum].raceTyres[i].usable == true && race.cars[d1carnum].raceTyres[i].age < bestage
                    && race.cars[d1carnum].raceTyres[i].compound == race.hardComp) {
                bestage = race.cars[d1carnum].raceTyres[i].age;
                bestindex = i;
            }
        }
        if (bestindex != -1) {
            race.cars[d1carnum].nextTyreIndex = bestindex;
            btnD1Hard.setBorder(new LineBorder(new Color(255, 0, 0), 2));
            btnD1Med.setBorder(new EmptyBorder(1, 1, 1, 1));
            btnD1Soft.setBorder(new EmptyBorder(1, 1, 1, 1));
        }
    }//GEN-LAST:event_btnD1HardMouseClicked

    private void btnD2SoftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnD2SoftMouseClicked
        int bestindex = -1;
        int bestage = 1000;
        for (int i = 0; i < 13; i++) {
            if (race.cars[d2carnum].raceTyres[i].usable == true && race.cars[d2carnum].raceTyres[i].age < bestage
                    && race.cars[d2carnum].raceTyres[i].compound == race.softComp) {
                bestage = race.cars[d2carnum].raceTyres[i].age;
                bestindex = i;
            }
        }
        if (bestindex != -1) {
            race.cars[d2carnum].nextTyreIndex = bestindex;
            btnD2Soft.setBorder(new LineBorder(new Color(255, 0, 0), 2));
            btnD2Med.setBorder(new EmptyBorder(1, 1, 1, 1));
            btnD2Hard.setBorder(new EmptyBorder(1, 1, 1, 1));
        }
    }//GEN-LAST:event_btnD2SoftMouseClicked

    private void btnD2MedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnD2MedMouseClicked
        int bestindex = -1;
        int bestage = 1000;
        for (int i = 0; i < 13; i++) {
            if (race.cars[d2carnum].raceTyres[i].usable == true && race.cars[d2carnum].raceTyres[i].age < bestage
                    && race.cars[d2carnum].raceTyres[i].compound == race.medComp) {
                bestage = race.cars[d2carnum].raceTyres[i].age;
                bestindex = i;
            }
        }
        if (bestindex != -1) {
            race.cars[d2carnum].nextTyreIndex = bestindex;
            btnD2Med.setBorder(new LineBorder(new Color(255, 0, 0), 2));
            btnD2Soft.setBorder(new EmptyBorder(1, 1, 1, 1));
            btnD2Hard.setBorder(new EmptyBorder(1, 1, 1, 1));
        }
    }//GEN-LAST:event_btnD2MedMouseClicked

    private void btnD2HardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnD2HardMouseClicked
        int bestindex = -1;
        int bestage = 1000;
        for (int i = 0; i < 13; i++) {
            if (race.cars[d2carnum].raceTyres[i].usable == true && race.cars[d2carnum].raceTyres[i].age < bestage
                    && race.cars[d2carnum].raceTyres[i].compound == race.hardComp) {
                bestage = race.cars[d2carnum].raceTyres[i].age;
                bestindex = i;
            }
        }
        if (bestindex != -1) {
            race.cars[d2carnum].nextTyreIndex = bestindex;
            btnD2Hard.setBorder(new LineBorder(new Color(255, 0, 0), 2));
            btnD2Med.setBorder(new EmptyBorder(1, 1, 1, 1));
            btnD2Soft.setBorder(new EmptyBorder(1, 1, 1, 1));
        }
    }//GEN-LAST:event_btnD2HardMouseClicked

    private void btnToggleModeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnToggleModeMouseClicked
        mode = (mode + 1) % 5;
        updateStandings();
    }//GEN-LAST:event_btnToggleModeMouseClicked

    public static int findCarIndexByDriverNum(int num) {
        for (rwCar c : race.cars) {
            if (num == c.driver.raceNum) {
                return c.num;
            }
        }
        return -1;
    }

    public static void updateStandings() {
        lblLapCount.setText("Lap " + (race.lapsCompleted + 1) + "/" + race.raceLaps);

        race.raceStandings.sort(new SortRaceStandings());

        lblNameP1.setText(race.raceStandings.get(0).driver.raceCode);
        lblNameP2.setText(race.raceStandings.get(1).driver.raceCode);
        lblNameP3.setText(race.raceStandings.get(2).driver.raceCode);
        lblNameP4.setText(race.raceStandings.get(3).driver.raceCode);
        lblNameP5.setText(race.raceStandings.get(4).driver.raceCode);
        lblNameP6.setText(race.raceStandings.get(5).driver.raceCode);
        lblNameP7.setText(race.raceStandings.get(6).driver.raceCode);
        lblNameP8.setText(race.raceStandings.get(7).driver.raceCode);
        lblNameP9.setText(race.raceStandings.get(8).driver.raceCode);
        lblNameP10.setText(race.raceStandings.get(9).driver.raceCode);
        lblNameP11.setText(race.raceStandings.get(10).driver.raceCode);
        lblNameP12.setText(race.raceStandings.get(11).driver.raceCode);
        lblNameP13.setText(race.raceStandings.get(12).driver.raceCode);
        lblNameP14.setText(race.raceStandings.get(13).driver.raceCode);
        lblNameP15.setText(race.raceStandings.get(14).driver.raceCode);
        lblNameP16.setText(race.raceStandings.get(15).driver.raceCode);
        lblNameP17.setText(race.raceStandings.get(16).driver.raceCode);
        lblNameP18.setText(race.raceStandings.get(17).driver.raceCode);
        lblNameP19.setText(race.raceStandings.get(18).driver.raceCode);
        lblNameP20.setText(race.raceStandings.get(19).driver.raceCode);

        lblNameP1.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(0).driver.raceNum).teamColor);
        lblNameP2.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(1).driver.raceNum).teamColor);
        lblNameP3.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(2).driver.raceNum).teamColor);
        lblNameP4.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(3).driver.raceNum).teamColor);
        lblNameP5.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(4).driver.raceNum).teamColor);
        lblNameP6.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(5).driver.raceNum).teamColor);
        lblNameP7.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(6).driver.raceNum).teamColor);
        lblNameP8.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(7).driver.raceNum).teamColor);
        lblNameP9.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(8).driver.raceNum).teamColor);
        lblNameP10.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(9).driver.raceNum).teamColor);
        lblNameP11.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(10).driver.raceNum).teamColor);
        lblNameP12.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(11).driver.raceNum).teamColor);
        lblNameP13.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(12).driver.raceNum).teamColor);
        lblNameP14.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(13).driver.raceNum).teamColor);
        lblNameP15.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(14).driver.raceNum).teamColor);
        lblNameP16.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(15).driver.raceNum).teamColor);
        lblNameP17.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(16).driver.raceNum).teamColor);
        lblNameP18.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(17).driver.raceNum).teamColor);
        lblNameP19.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(18).driver.raceNum).teamColor);
        lblNameP20.setBackground(FullGame.data.findTeamByDriver(race.raceStandings.get(19).driver.raceNum).teamColor);

        switch (mode) {
            case 4:
                standingGaps();
                btnToggleMode.setText("Gap to Next");
                break;
            case 1:
                standingTyres();
                btnToggleMode.setText("Current Tyres");
                break;
            case 2:
                standingStops();
                btnToggleMode.setText("Pit Stops");
                break;
            case 3:
                standingBestLap();
                btnToggleMode.setText("Best Lap");
                break;
            case 0:
                standingLastLap();
                btnToggleMode.setText("Last Lap");
                break;
        }

        lblD1Line1.setText(FullGame.data.findPlayerTeam().driver1.fname.charAt(0) + " " + FullGame.data.findPlayerTeam().driver1.lname);
        lblD2Line1.setText(FullGame.data.findPlayerTeam().driver2.fname.charAt(0) + " " + FullGame.data.findPlayerTeam().driver2.lname);

        lblD1Line2.setText("Started: P" + race.cars[findCarIndexByDriverNum(FullGame.data.findPlayerTeam().driver1.raceNum)].gridpos);
        lblD2Line2.setText("Started: P" + race.cars[findCarIndexByDriverNum(FullGame.data.findPlayerTeam().driver2.raceNum)].gridpos);

        lblD1Line3.setText("Tyres: " + race.cars[findCarIndexByDriverNum(
                FullGame.data.findPlayerTeam().driver1.raceNum)].raceTyres[race.cars[findCarIndexByDriverNum(FullGame.data.findPlayerTeam().driver1.raceNum)].currentTyreIndex].compound.toString()
                + " (" + race.cars[findCarIndexByDriverNum(FullGame.data.
                        findPlayerTeam().driver1.raceNum)].raceTyres[race.cars[findCarIndexByDriverNum(FullGame.data.
                        findPlayerTeam().driver1.raceNum)].currentTyreIndex].age + ")");
        lblD2Line3.setText("Tyres: " + race.cars[findCarIndexByDriverNum(
                FullGame.data.findPlayerTeam().driver2.raceNum)].raceTyres[race.cars[findCarIndexByDriverNum(FullGame.data.findPlayerTeam().driver2.raceNum)].currentTyreIndex].compound.toString()
                + " (" + race.cars[findCarIndexByDriverNum(FullGame.data.
                        findPlayerTeam().driver2.raceNum)].raceTyres[race.cars[findCarIndexByDriverNum(FullGame.data.
                        findPlayerTeam().driver2.raceNum)].currentTyreIndex].age + ")");

        btnD1Soft.setText(Integer.toString(race.cars[findCarIndexByDriverNum(
                FullGame.data.findPlayerTeam().driver1.raceNum)].availTyres[0]));
        btnD1Med.setText(Integer.toString(race.cars[findCarIndexByDriverNum(
                FullGame.data.findPlayerTeam().driver1.raceNum)].availTyres[1]));
        btnD1Hard.setText(Integer.toString(race.cars[findCarIndexByDriverNum(
                FullGame.data.findPlayerTeam().driver1.raceNum)].availTyres[2]));
        btnD2Soft.setText(Integer.toString(race.cars[findCarIndexByDriverNum(
                FullGame.data.findPlayerTeam().driver2.raceNum)].availTyres[0]));
        btnD2Med.setText(Integer.toString(race.cars[findCarIndexByDriverNum(
                FullGame.data.findPlayerTeam().driver2.raceNum)].availTyres[1]));
        btnD2Hard.setText(Integer.toString(race.cars[findCarIndexByDriverNum(
                FullGame.data.findPlayerTeam().driver2.raceNum)].availTyres[2]));
    }

    public static void updateView() {
        scrCircuit.getHorizontalScrollBar().setValue((int) race.cars[focus].locationx - 400);
        scrCircuit.getVerticalScrollBar().setValue((int) race.cars[focus].locationy - 300);
    }

    private static void standingGaps() {
        for (int i = 1; i < 20; i++) {
            double gap = 0;
            if (race.raceStandings.get(i).lapsCompleted > 0) {
                gap = race.gapToNext(i);
            }
            if (gap >= 0) {
                lastGap[i] = gap;
            }
        }

        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.FLOOR);
        lblInfoP1.setText("Leader");
        lblInfoP2.setText("+" + df.format(lastGap[1]));
        lblInfoP3.setText("+" + df.format(lastGap[2]));
        lblInfoP4.setText("+" + df.format(lastGap[3]));
        lblInfoP5.setText("+" + df.format(lastGap[4]));
        lblInfoP6.setText("+" + df.format(lastGap[5]));
        lblInfoP7.setText("+" + df.format(lastGap[6]));
        lblInfoP8.setText("+" + df.format(lastGap[7]));
        lblInfoP9.setText("+" + df.format(lastGap[8]));
        lblInfoP10.setText("+" + df.format(lastGap[9]));
        lblInfoP11.setText("+" + df.format(lastGap[10]));
        lblInfoP12.setText("+" + df.format(lastGap[11]));
        lblInfoP13.setText("+" + df.format(lastGap[12]));
        lblInfoP14.setText("+" + df.format(lastGap[13]));
        lblInfoP15.setText("+" + df.format(lastGap[14]));
        lblInfoP16.setText("+" + df.format(lastGap[15]));
        lblInfoP17.setText("+" + df.format(lastGap[16]));
        lblInfoP18.setText("+" + df.format(lastGap[17]));
        lblInfoP19.setText("+" + df.format(lastGap[18]));
        lblInfoP20.setText("+" + df.format(lastGap[19]));
    }

    public static void standingTyres() {
        lblInfoP1.setText(race.cars[race.raceStandings.get(0).carnum].raceTyres[race.cars[race.raceStandings.get(0).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(0).carnum].raceTyres[race.cars[race.raceStandings.get(0).carnum].currentTyreIndex].age + ")");
        lblInfoP2.setText(race.cars[race.raceStandings.get(1).carnum].raceTyres[race.cars[race.raceStandings.get(1).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(1).carnum].raceTyres[race.cars[race.raceStandings.get(1).carnum].currentTyreIndex].age + ")");
        lblInfoP3.setText(race.cars[race.raceStandings.get(2).carnum].raceTyres[race.cars[race.raceStandings.get(2).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(2).carnum].raceTyres[race.cars[race.raceStandings.get(2).carnum].currentTyreIndex].age + ")");
        lblInfoP4.setText(race.cars[race.raceStandings.get(3).carnum].raceTyres[race.cars[race.raceStandings.get(3).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(3).carnum].raceTyres[race.cars[race.raceStandings.get(3).carnum].currentTyreIndex].age + ")");
        lblInfoP5.setText(race.cars[race.raceStandings.get(4).carnum].raceTyres[race.cars[race.raceStandings.get(4).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(4).carnum].raceTyres[race.cars[race.raceStandings.get(4).carnum].currentTyreIndex].age + ")");
        lblInfoP6.setText(race.cars[race.raceStandings.get(5).carnum].raceTyres[race.cars[race.raceStandings.get(5).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(5).carnum].raceTyres[race.cars[race.raceStandings.get(5).carnum].currentTyreIndex].age + ")");
        lblInfoP7.setText(race.cars[race.raceStandings.get(6).carnum].raceTyres[race.cars[race.raceStandings.get(6).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(6).carnum].raceTyres[race.cars[race.raceStandings.get(6).carnum].currentTyreIndex].age + ")");
        lblInfoP8.setText(race.cars[race.raceStandings.get(7).carnum].raceTyres[race.cars[race.raceStandings.get(7).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(7).carnum].raceTyres[race.cars[race.raceStandings.get(7).carnum].currentTyreIndex].age + ")");
        lblInfoP9.setText(race.cars[race.raceStandings.get(8).carnum].raceTyres[race.cars[race.raceStandings.get(8).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(8).carnum].raceTyres[race.cars[race.raceStandings.get(8).carnum].currentTyreIndex].age + ")");
        lblInfoP10.setText(race.cars[race.raceStandings.get(9).carnum].raceTyres[race.cars[race.raceStandings.get(9).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(9).carnum].raceTyres[race.cars[race.raceStandings.get(9).carnum].currentTyreIndex].age + ")");
        lblInfoP11.setText(race.cars[race.raceStandings.get(10).carnum].raceTyres[race.cars[race.raceStandings.get(10).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(10).carnum].raceTyres[race.cars[race.raceStandings.get(10).carnum].currentTyreIndex].age + ")");
        lblInfoP12.setText(race.cars[race.raceStandings.get(11).carnum].raceTyres[race.cars[race.raceStandings.get(11).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(11).carnum].raceTyres[race.cars[race.raceStandings.get(11).carnum].currentTyreIndex].age + ")");
        lblInfoP13.setText(race.cars[race.raceStandings.get(12).carnum].raceTyres[race.cars[race.raceStandings.get(12).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(12).carnum].raceTyres[race.cars[race.raceStandings.get(12).carnum].currentTyreIndex].age + ")");
        lblInfoP14.setText(race.cars[race.raceStandings.get(13).carnum].raceTyres[race.cars[race.raceStandings.get(13).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(13).carnum].raceTyres[race.cars[race.raceStandings.get(13).carnum].currentTyreIndex].age + ")");
        lblInfoP15.setText(race.cars[race.raceStandings.get(14).carnum].raceTyres[race.cars[race.raceStandings.get(14).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(14).carnum].raceTyres[race.cars[race.raceStandings.get(14).carnum].currentTyreIndex].age + ")");
        lblInfoP16.setText(race.cars[race.raceStandings.get(15).carnum].raceTyres[race.cars[race.raceStandings.get(15).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(15).carnum].raceTyres[race.cars[race.raceStandings.get(15).carnum].currentTyreIndex].age + ")");
        lblInfoP17.setText(race.cars[race.raceStandings.get(16).carnum].raceTyres[race.cars[race.raceStandings.get(16).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(16).carnum].raceTyres[race.cars[race.raceStandings.get(16).carnum].currentTyreIndex].age + ")");
        lblInfoP18.setText(race.cars[race.raceStandings.get(17).carnum].raceTyres[race.cars[race.raceStandings.get(17).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(17).carnum].raceTyres[race.cars[race.raceStandings.get(17).carnum].currentTyreIndex].age + ")");
        lblInfoP19.setText(race.cars[race.raceStandings.get(18).carnum].raceTyres[race.cars[race.raceStandings.get(18).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(18).carnum].raceTyres[race.cars[race.raceStandings.get(18).carnum].currentTyreIndex].age + ")");
        lblInfoP20.setText(race.cars[race.raceStandings.get(19).carnum].raceTyres[race.cars[race.raceStandings.get(19).carnum].currentTyreIndex].compound.toString() + " (" + race.cars[race.raceStandings.get(19).carnum].raceTyres[race.cars[race.raceStandings.get(19).carnum].currentTyreIndex].age + ")");
    }

    public static void standingStops() {
        lblInfoP1.setText(race.cars[race.raceStandings.get(0).carnum].pitstopsCompleted + " Stop(s)");
        lblInfoP2.setText(race.cars[race.raceStandings.get(1).carnum].pitstopsCompleted + " Stop(s)");
        lblInfoP3.setText(race.cars[race.raceStandings.get(2).carnum].pitstopsCompleted + " Stop(s)");
        lblInfoP4.setText(race.cars[race.raceStandings.get(3).carnum].pitstopsCompleted + " Stop(s)");
        lblInfoP5.setText(race.cars[race.raceStandings.get(4).carnum].pitstopsCompleted + " Stop(s)");
        lblInfoP6.setText(race.cars[race.raceStandings.get(5).carnum].pitstopsCompleted + " Stop(s)");
        lblInfoP7.setText(race.cars[race.raceStandings.get(6).carnum].pitstopsCompleted + " Stop(s)");
        lblInfoP8.setText(race.cars[race.raceStandings.get(7).carnum].pitstopsCompleted + " Stop(s)");
        lblInfoP9.setText(race.cars[race.raceStandings.get(8).carnum].pitstopsCompleted + " Stop(s)");
        lblInfoP10.setText(race.cars[race.raceStandings.get(9).carnum].pitstopsCompleted + " Stop(s)");
        lblInfoP11.setText(race.cars[race.raceStandings.get(10).carnum].pitstopsCompleted + " Stop(s)");
        lblInfoP12.setText(race.cars[race.raceStandings.get(11).carnum].pitstopsCompleted + " Stop(s)");
        lblInfoP13.setText(race.cars[race.raceStandings.get(12).carnum].pitstopsCompleted + " Stop(s)");
        lblInfoP14.setText(race.cars[race.raceStandings.get(13).carnum].pitstopsCompleted + " Stop(s)");
        lblInfoP15.setText(race.cars[race.raceStandings.get(14).carnum].pitstopsCompleted + " Stop(s)");
        lblInfoP16.setText(race.cars[race.raceStandings.get(15).carnum].pitstopsCompleted + " Stop(s)");
        lblInfoP17.setText(race.cars[race.raceStandings.get(16).carnum].pitstopsCompleted + " Stop(s)");
        lblInfoP18.setText(race.cars[race.raceStandings.get(17).carnum].pitstopsCompleted + " Stop(s)");
        lblInfoP19.setText(race.cars[race.raceStandings.get(18).carnum].pitstopsCompleted + " Stop(s)");
        lblInfoP20.setText(race.cars[race.raceStandings.get(19).carnum].pitstopsCompleted + " Stop(s)");
    }
    
    public static void standingBestLap() {
        
        lblInfoP1.setText((race.raceStandings.get(0).bestlapindex == -1 ? "-" : race.raceStandings.get(0).lapTimes.get(race.raceStandings.get(0).bestlapindex)));
        lblInfoP2.setText((race.raceStandings.get(1).bestlapindex == -1 ? "-" : race.raceStandings.get(1).lapTimes.get(race.raceStandings.get(1).bestlapindex)));
        lblInfoP3.setText((race.raceStandings.get(2).bestlapindex == -1 ? "-" : race.raceStandings.get(2).lapTimes.get(race.raceStandings.get(2).bestlapindex)));
        lblInfoP4.setText((race.raceStandings.get(3).bestlapindex == -1 ? "-" : race.raceStandings.get(3).lapTimes.get(race.raceStandings.get(3).bestlapindex)));
        lblInfoP5.setText((race.raceStandings.get(4).bestlapindex == -1 ? "-" : race.raceStandings.get(4).lapTimes.get(race.raceStandings.get(4).bestlapindex)));
        lblInfoP6.setText((race.raceStandings.get(5).bestlapindex == -1 ? "-" : race.raceStandings.get(5).lapTimes.get(race.raceStandings.get(5).bestlapindex)));
        lblInfoP7.setText((race.raceStandings.get(6).bestlapindex == -1 ? "-" : race.raceStandings.get(6).lapTimes.get(race.raceStandings.get(6).bestlapindex)));
        lblInfoP8.setText((race.raceStandings.get(7).bestlapindex == -1 ? "-" : race.raceStandings.get(7).lapTimes.get(race.raceStandings.get(7).bestlapindex)));
        lblInfoP9.setText((race.raceStandings.get(8).bestlapindex == -1 ? "-" : race.raceStandings.get(8).lapTimes.get(race.raceStandings.get(8).bestlapindex)));
        lblInfoP10.setText((race.raceStandings.get(9).bestlapindex == -1 ? "-" : race.raceStandings.get(9).lapTimes.get(race.raceStandings.get(9).bestlapindex)));
        lblInfoP11.setText((race.raceStandings.get(10).bestlapindex == -1 ? "-" : race.raceStandings.get(10).lapTimes.get(race.raceStandings.get(10).bestlapindex)));
        lblInfoP12.setText((race.raceStandings.get(11).bestlapindex == -1 ? "-" : race.raceStandings.get(11).lapTimes.get(race.raceStandings.get(11).bestlapindex)));
        lblInfoP13.setText((race.raceStandings.get(12).bestlapindex == -1 ? "-" : race.raceStandings.get(12).lapTimes.get(race.raceStandings.get(12).bestlapindex)));
        lblInfoP14.setText((race.raceStandings.get(13).bestlapindex == -1 ? "-" : race.raceStandings.get(13).lapTimes.get(race.raceStandings.get(13).bestlapindex)));
        lblInfoP15.setText((race.raceStandings.get(14).bestlapindex == -1 ? "-" : race.raceStandings.get(14).lapTimes.get(race.raceStandings.get(14).bestlapindex)));
        lblInfoP16.setText((race.raceStandings.get(15).bestlapindex == -1 ? "-" : race.raceStandings.get(15).lapTimes.get(race.raceStandings.get(15).bestlapindex)));
        lblInfoP17.setText((race.raceStandings.get(16).bestlapindex == -1 ? "-" : race.raceStandings.get(16).lapTimes.get(race.raceStandings.get(16).bestlapindex)));
        lblInfoP18.setText((race.raceStandings.get(17).bestlapindex == -1 ? "-" : race.raceStandings.get(17).lapTimes.get(race.raceStandings.get(17).bestlapindex)));
        lblInfoP19.setText((race.raceStandings.get(18).bestlapindex == -1 ? "-" : race.raceStandings.get(18).lapTimes.get(race.raceStandings.get(18).bestlapindex)));
        lblInfoP20.setText((race.raceStandings.get(19).bestlapindex == -1 ? "-" : race.raceStandings.get(19).lapTimes.get(race.raceStandings.get(19).bestlapindex)));
    }
    
    public static void standingLastLap() {
        lblInfoP1.setText((race.raceStandings.get(0).lapTimes.isEmpty() ? "-" : race.raceStandings.get(0).lapTimes.get(race.raceStandings.get(0).lapTimes.size() - 1)));
        lblInfoP2.setText((race.raceStandings.get(1).lapTimes.isEmpty() ? "-" : race.raceStandings.get(1).lapTimes.get(race.raceStandings.get(1).lapTimes.size() - 1)));
        lblInfoP3.setText((race.raceStandings.get(2).lapTimes.isEmpty() ? "-" : race.raceStandings.get(2).lapTimes.get(race.raceStandings.get(2).lapTimes.size() - 1)));
        lblInfoP4.setText((race.raceStandings.get(3).lapTimes.isEmpty() ? "-" : race.raceStandings.get(3).lapTimes.get(race.raceStandings.get(3).lapTimes.size() - 1)));
        lblInfoP5.setText((race.raceStandings.get(4).lapTimes.isEmpty() ? "-" : race.raceStandings.get(4).lapTimes.get(race.raceStandings.get(4).lapTimes.size() - 1)));
        lblInfoP6.setText((race.raceStandings.get(5).lapTimes.isEmpty() ? "-" : race.raceStandings.get(5).lapTimes.get(race.raceStandings.get(5).lapTimes.size() - 1)));
        lblInfoP7.setText((race.raceStandings.get(6).lapTimes.isEmpty() ? "-" : race.raceStandings.get(6).lapTimes.get(race.raceStandings.get(6).lapTimes.size() - 1)));
        lblInfoP8.setText((race.raceStandings.get(7).lapTimes.isEmpty() ? "-" : race.raceStandings.get(7).lapTimes.get(race.raceStandings.get(7).lapTimes.size() - 1)));
        lblInfoP9.setText((race.raceStandings.get(8).lapTimes.isEmpty() ? "-" : race.raceStandings.get(8).lapTimes.get(race.raceStandings.get(8).lapTimes.size() - 1)));
        lblInfoP10.setText((race.raceStandings.get(9).lapTimes.isEmpty() ? "-" : race.raceStandings.get(9).lapTimes.get(race.raceStandings.get(9).lapTimes.size() - 1)));
        lblInfoP11.setText((race.raceStandings.get(10).lapTimes.isEmpty() ? "-" : race.raceStandings.get(10).lapTimes.get(race.raceStandings.get(10).lapTimes.size() - 1)));
        lblInfoP12.setText((race.raceStandings.get(11).lapTimes.isEmpty() ? "-" : race.raceStandings.get(11).lapTimes.get(race.raceStandings.get(11).lapTimes.size() - 1)));
        lblInfoP13.setText((race.raceStandings.get(12).lapTimes.isEmpty() ? "-" : race.raceStandings.get(12).lapTimes.get(race.raceStandings.get(12).lapTimes.size() - 1)));
        lblInfoP14.setText((race.raceStandings.get(13).lapTimes.isEmpty() ? "-" : race.raceStandings.get(13).lapTimes.get(race.raceStandings.get(13).lapTimes.size() - 1)));
        lblInfoP15.setText((race.raceStandings.get(14).lapTimes.isEmpty() ? "-" : race.raceStandings.get(14).lapTimes.get(race.raceStandings.get(14).lapTimes.size() - 1)));
        lblInfoP16.setText((race.raceStandings.get(15).lapTimes.isEmpty() ? "-" : race.raceStandings.get(15).lapTimes.get(race.raceStandings.get(15).lapTimes.size() - 1)));
        lblInfoP17.setText((race.raceStandings.get(16).lapTimes.isEmpty() ? "-" : race.raceStandings.get(16).lapTimes.get(race.raceStandings.get(16).lapTimes.size() - 1)));
        lblInfoP18.setText((race.raceStandings.get(17).lapTimes.isEmpty() ? "-" : race.raceStandings.get(17).lapTimes.get(race.raceStandings.get(17).lapTimes.size() - 1)));
        lblInfoP19.setText((race.raceStandings.get(18).lapTimes.isEmpty() ? "-" : race.raceStandings.get(18).lapTimes.get(race.raceStandings.get(18).lapTimes.size() - 1)));
        lblInfoP20.setText((race.raceStandings.get(19).lapTimes.isEmpty() ? "-" : race.raceStandings.get(19).lapTimes.get(race.raceStandings.get(19).lapTimes.size() - 1)));
    }

    public static rwCircuitMap map;
    public static Race race;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel btnD1Hard;
    public static javax.swing.JLabel btnD1Med;
    public static javax.swing.JLabel btnD1Pit;
    public static javax.swing.JLabel btnD1Soft;
    public static javax.swing.JLabel btnD2Hard;
    public static javax.swing.JLabel btnD2Med;
    public static javax.swing.JLabel btnD2Pit;
    public static javax.swing.JLabel btnD2Soft;
    private static javax.swing.JLabel btnP1;
    private static javax.swing.JLabel btnP10;
    private static javax.swing.JLabel btnP11;
    private static javax.swing.JLabel btnP12;
    private static javax.swing.JLabel btnP13;
    private static javax.swing.JLabel btnP14;
    private static javax.swing.JLabel btnP15;
    private static javax.swing.JLabel btnP16;
    private static javax.swing.JLabel btnP17;
    private static javax.swing.JLabel btnP18;
    private static javax.swing.JLabel btnP19;
    private static javax.swing.JLabel btnP2;
    private static javax.swing.JLabel btnP20;
    private static javax.swing.JLabel btnP3;
    private static javax.swing.JLabel btnP4;
    private static javax.swing.JLabel btnP5;
    private static javax.swing.JLabel btnP6;
    private static javax.swing.JLabel btnP7;
    private static javax.swing.JLabel btnP8;
    private static javax.swing.JLabel btnP9;
    private static javax.swing.JLabel btnToggleMode;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private static javax.swing.JLabel lblD1Line1;
    private static javax.swing.JLabel lblD1Line2;
    private static javax.swing.JLabel lblD1Line3;
    private static javax.swing.JLabel lblD2Line1;
    private static javax.swing.JLabel lblD2Line2;
    private static javax.swing.JLabel lblD2Line3;
    private static javax.swing.JLabel lblInfoP1;
    private static javax.swing.JLabel lblInfoP10;
    private static javax.swing.JLabel lblInfoP11;
    private static javax.swing.JLabel lblInfoP12;
    private static javax.swing.JLabel lblInfoP13;
    private static javax.swing.JLabel lblInfoP14;
    private static javax.swing.JLabel lblInfoP15;
    private static javax.swing.JLabel lblInfoP16;
    private static javax.swing.JLabel lblInfoP17;
    private static javax.swing.JLabel lblInfoP18;
    private static javax.swing.JLabel lblInfoP19;
    private static javax.swing.JLabel lblInfoP2;
    private static javax.swing.JLabel lblInfoP20;
    private static javax.swing.JLabel lblInfoP3;
    private static javax.swing.JLabel lblInfoP4;
    private static javax.swing.JLabel lblInfoP5;
    private static javax.swing.JLabel lblInfoP6;
    private static javax.swing.JLabel lblInfoP7;
    private static javax.swing.JLabel lblInfoP8;
    private static javax.swing.JLabel lblInfoP9;
    private static javax.swing.JLabel lblLapCount;
    private static javax.swing.JLabel lblNameP1;
    private static javax.swing.JLabel lblNameP10;
    private static javax.swing.JLabel lblNameP11;
    private static javax.swing.JLabel lblNameP12;
    private static javax.swing.JLabel lblNameP13;
    private static javax.swing.JLabel lblNameP14;
    private static javax.swing.JLabel lblNameP15;
    private static javax.swing.JLabel lblNameP16;
    private static javax.swing.JLabel lblNameP17;
    private static javax.swing.JLabel lblNameP18;
    private static javax.swing.JLabel lblNameP19;
    private static javax.swing.JLabel lblNameP2;
    private static javax.swing.JLabel lblNameP20;
    private static javax.swing.JLabel lblNameP3;
    private static javax.swing.JLabel lblNameP4;
    private static javax.swing.JLabel lblNameP5;
    private static javax.swing.JLabel lblNameP6;
    private static javax.swing.JLabel lblNameP7;
    private static javax.swing.JLabel lblNameP8;
    private static javax.swing.JLabel lblNameP9;
    private javax.swing.JLabel lblRaceName;
    public static javax.swing.JScrollPane scrCircuit;
    // End of variables declaration//GEN-END:variables
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        Color c1 = Color.BLACK;
        Color c2 = new Color(100, 100, 100);
        GradientPaint gp = new GradientPaint(0, 0, c1, getWidth(), 0, c2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
}
