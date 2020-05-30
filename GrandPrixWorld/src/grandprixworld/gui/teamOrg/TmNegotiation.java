/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gui.teamOrg;

import grandprixworld.gamedata.ChiefDesigner;
import grandprixworld.gamedata.ChiefMechanic;
import grandprixworld.gamedata.CommercialDirector;
import grandprixworld.gamedata.CommercialNegotiation;
import grandprixworld.gamedata.DesignerNegotiation;
import grandprixworld.gamedata.Driver;
import grandprixworld.gamedata.DriverNegotiation;
import grandprixworld.gamedata.MechanicNegotiation;
import grandprixworld.gamedata.TechnicalDirector;
import grandprixworld.gamedata.TechnicalNegotiation;
import grandprixworld.gui.FullGame;
import java.awt.Color;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josh Brookes
 */
public class TmNegotiation extends javax.swing.JPanel {

    public int negotiationPos;
    public boolean signed = false;
    String name = "";
    Driver d = null;
    CommercialDirector comm = null;
    ChiefDesigner des = null;
    TechnicalDirector tech = null;
    ChiefMechanic mech = null;
    int salary = -1;
    int racebonus = -1;
    int champbonus = -1;
    int royalty = -1;
    int finalSeason = -1;

    /**
     * Creates new form TmNegotiation
     */
    public TmNegotiation(int pos) {
        initComponents();
        negotiationPos = pos;
        updateScreenData(null);
        initOther();
    }

    private void initOther() {
        tblAllStaff.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                updateScreenData(tblAllStaff.getValueAt(tblAllStaff.getSelectedRow(), 1).toString());
            }
        });
    }

    private int calculateAge(LocalDate dob) {
        Period diff = Period.between(dob, grandprixworld.gui.FullGame.data.currentDate);
        return diff.getYears();
    }

    public void updateScreenData(String name) {
        DefaultTableModel model = (DefaultTableModel) tblAllStaff.getModel();
        Object rowData[] = new Object[3];
        switch (negotiationPos) {
            case 1:
                lblOfferRoyalty.setVisible(false);
                lblNegoRoyalty.setVisible(false);
                lblNegoCurrentRoyalty.setVisible(false);
                btnDecRoyalty.setVisible(false);
                btnIncRoyalty.setVisible(false);
                lblCurrentName.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().driver1.fname.charAt(0) + " " + grandprixworld.gui.FullGame.data.findPlayerTeam().driver1.lname);
                lblCurrentAge.setText("Age: " + Integer.toString(calculateAge(grandprixworld.gui.FullGame.data.findPlayerTeam().driver1.dob)));
                lblCurrentNation.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().driver1.nation.toString());
                lblCurrentSalary.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().driver1.salary));
                lblCurrentRaceBonus.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().driver1.racebonus));
                lblCurrentChampBonus.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().driver1.champbonus));
                imgCurrentSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().driver1.attributes[0] + ".png")));
                imgCurrentSkill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().driver1.attributes[1] + ".png")));
                imgCurrentOvertaking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().driver1.attributes[2] + ".png")));
                imgCurrentWet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().driver1.attributes[3] + ".png")));
                imgCurrentStamina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().driver1.attributes[4] + ".png")));
                imgCurrentExperience.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().driver1.attributes[5] + ".png")));
                if (name == null) {
                    imgNextSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextSkill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextOvertaking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextWet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextStamina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextExperience.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    for (int i = 0; i < grandprixworld.gui.FullGame.data.drivers.size(); i++) {
                        if (grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.drivers.get(i).raceNum) == null) {
                            rowData[0] = "None";
                        } else {
                            rowData[0] = grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.drivers.get(i).raceNum).name;
                        }
                        rowData[1] = grandprixworld.gui.FullGame.data.drivers.get(i).fname.charAt(0) + " " + grandprixworld.gui.FullGame.data.drivers.get(i).lname;
                        rowData[2] = grandprixworld.gui.FullGame.data.drivers.get(i).finalSeason;
                        model.addRow(rowData);
                    }
                }
                break;
            case 2:
                lblOfferRoyalty.setVisible(false);
                lblNegoRoyalty.setVisible(false);
                lblNegoCurrentRoyalty.setVisible(false);
                btnDecRoyalty.setVisible(false);
                btnIncRoyalty.setVisible(false);
                lblCurrentName.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().driver2.fname.charAt(0) + " " + grandprixworld.gui.FullGame.data.findPlayerTeam().driver2.lname);
                lblCurrentAge.setText("Age: " + Integer.toString(calculateAge(grandprixworld.gui.FullGame.data.findPlayerTeam().driver2.dob)));
                lblCurrentNation.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().driver2.nation.toString());
                lblCurrentSalary.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().driver2.salary));
                lblCurrentRaceBonus.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().driver2.racebonus));
                lblCurrentChampBonus.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().driver2.champbonus));
                imgCurrentSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().driver2.attributes[0] + ".png")));
                imgCurrentSkill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().driver2.attributes[1] + ".png")));
                imgCurrentOvertaking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().driver2.attributes[2] + ".png")));
                imgCurrentWet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().driver2.attributes[3] + ".png")));
                imgCurrentStamina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().driver2.attributes[4] + ".png")));
                imgCurrentExperience.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().driver2.attributes[5] + ".png")));
                if (name == null) {
                    imgNextSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextSkill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextOvertaking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextWet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextStamina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextExperience.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    for (int i = 0; i < grandprixworld.gui.FullGame.data.drivers.size(); i++) {
                        if (grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.drivers.get(i).raceNum) == null) {
                            rowData[0] = "None";
                        } else {
                            rowData[0] = grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.drivers.get(i).raceNum).name;
                        }
                        rowData[1] = grandprixworld.gui.FullGame.data.drivers.get(i).fname.charAt(0) + " " + grandprixworld.gui.FullGame.data.drivers.get(i).lname;
                        rowData[2] = grandprixworld.gui.FullGame.data.drivers.get(i).finalSeason;
                        model.addRow(rowData);
                    }
                }
                break;
            case 3:
                lblOfferRoyalty.setVisible(false);
                lblNegoRoyalty.setVisible(false);
                lblNegoCurrentRoyalty.setVisible(false);
                btnDecRoyalty.setVisible(false);
                btnIncRoyalty.setVisible(false);
                if (grandprixworld.gui.FullGame.data.findPlayerTeam().youth1 != null) {
                    lblCurrentName.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().youth1.fname.charAt(0) + " " + grandprixworld.gui.FullGame.data.findPlayerTeam().youth1.lname);
                    lblCurrentAge.setText("Age: " + Integer.toString(calculateAge(grandprixworld.gui.FullGame.data.findPlayerTeam().youth1.dob)));
                    lblCurrentNation.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().youth1.nation.toString());
                    lblCurrentSalary.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().youth1.salary));
                    lblCurrentRaceBonus.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().youth1.racebonus));
                    lblCurrentChampBonus.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().youth1.champbonus));
                    imgCurrentSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().youth1.attributes[0] + ".png")));
                    imgCurrentSkill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().youth1.attributes[1] + ".png")));
                    imgCurrentOvertaking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().youth1.attributes[2] + ".png")));
                    imgCurrentWet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().youth1.attributes[3] + ".png")));
                    imgCurrentStamina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().youth1.attributes[4] + ".png")));
                    imgCurrentExperience.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().youth1.attributes[5] + ".png")));
                } else {
                    lblCurrentName.setText("None");
                    lblCurrentSalary.setText("$0");
                    lblCurrentRaceBonus.setText("$0");
                    lblCurrentChampBonus.setText("$0");
                }
                if (name == null) {
                    imgNextSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextSkill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextOvertaking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextWet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextStamina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextExperience.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    for (int i = 0; i < grandprixworld.gui.FullGame.data.drivers.size(); i++) {
                        if (grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.drivers.get(i).raceNum) == null) {
                            rowData[0] = "None";
                        } else {
                            rowData[0] = grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.drivers.get(i).raceNum).name;
                        }
                        rowData[1] = grandprixworld.gui.FullGame.data.drivers.get(i).fname.charAt(0) + " " + grandprixworld.gui.FullGame.data.drivers.get(i).lname;
                        rowData[2] = grandprixworld.gui.FullGame.data.drivers.get(i).finalSeason;
                        model.addRow(rowData);
                    }
                }
                break;
            case 4:
                lblOfferRoyalty.setVisible(false);
                lblNegoRoyalty.setVisible(false);
                lblNegoCurrentRoyalty.setVisible(false);
                btnDecRoyalty.setVisible(false);
                btnIncRoyalty.setVisible(false);
                if (grandprixworld.gui.FullGame.data.findPlayerTeam().youth2 != null) {
                    lblCurrentName.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().youth2.fname.charAt(0) + " " + grandprixworld.gui.FullGame.data.findPlayerTeam().youth2.lname);
                    lblCurrentAge.setText("Age: " + Integer.toString(calculateAge(grandprixworld.gui.FullGame.data.findPlayerTeam().youth2.dob)));
                    lblCurrentNation.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().youth2.nation.toString());
                    lblCurrentSalary.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().youth2.salary));
                    lblCurrentRaceBonus.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().youth2.racebonus));
                    lblCurrentChampBonus.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().youth2.champbonus));
                    imgCurrentSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().youth2.attributes[0] + ".png")));
                    imgCurrentSkill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().youth2.attributes[1] + ".png")));
                    imgCurrentOvertaking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().youth2.attributes[2] + ".png")));
                    imgCurrentWet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().youth2.attributes[3] + ".png")));
                    imgCurrentStamina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().youth2.attributes[4] + ".png")));
                    imgCurrentExperience.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().youth2.attributes[5] + ".png")));
                } else {
                    lblCurrentName.setText("None");
                    lblCurrentSalary.setText("$0");
                    lblCurrentRaceBonus.setText("$0");
                    lblCurrentChampBonus.setText("$0");
                }
                if (name == null) {
                    imgNextSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextSkill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextOvertaking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextWet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextStamina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextExperience.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    for (int i = 0; i < grandprixworld.gui.FullGame.data.drivers.size(); i++) {
                        if (grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.drivers.get(i).raceNum) == null) {
                            rowData[0] = "None";
                        } else {
                            rowData[0] = grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.drivers.get(i).raceNum).name;
                        }
                        rowData[1] = grandprixworld.gui.FullGame.data.drivers.get(i).fname.charAt(0) + " " + grandprixworld.gui.FullGame.data.drivers.get(i).lname;
                        rowData[2] = grandprixworld.gui.FullGame.data.drivers.get(i).finalSeason;
                        model.addRow(rowData);
                    }
                }
                break;
            case 5:
                lblOfferRoyalty.setVisible(false);
                lblNegoRoyalty.setVisible(false);
                lblNegoCurrentRoyalty.setVisible(false);
                btnDecRoyalty.setVisible(false);
                btnIncRoyalty.setVisible(false);
                if (grandprixworld.gui.FullGame.data.findPlayerTeam().youth3 != null) {
                    lblCurrentName.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().youth3.fname.charAt(0) + " " + grandprixworld.gui.FullGame.data.findPlayerTeam().youth3.lname);
                    lblCurrentAge.setText("Age: " + Integer.toString(calculateAge(grandprixworld.gui.FullGame.data.findPlayerTeam().youth3.dob)));
                    lblCurrentNation.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().youth3.nation.toString());
                    lblCurrentSalary.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().youth3.salary));
                    lblCurrentRaceBonus.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().youth3.racebonus));
                    lblCurrentChampBonus.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().youth3.champbonus));
                    imgCurrentSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().youth3.attributes[0] + ".png")));
                    imgCurrentSkill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().youth3.attributes[1] + ".png")));
                    imgCurrentOvertaking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().youth3.attributes[2] + ".png")));
                    imgCurrentWet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().youth3.attributes[3] + ".png")));
                    imgCurrentStamina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().youth3.attributes[4] + ".png")));
                    imgCurrentExperience.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().youth3.attributes[5] + ".png")));
                } else {
                    lblCurrentName.setText("None");
                    lblCurrentSalary.setText("$0");
                    lblCurrentRaceBonus.setText("$0");
                    lblCurrentChampBonus.setText("$0");
                }
                if (name == null) {
                    imgNextSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextSkill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextOvertaking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextWet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextStamina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    imgNextExperience.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    for (int i = 0; i < grandprixworld.gui.FullGame.data.drivers.size(); i++) {
                        if (grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.drivers.get(i).raceNum) == null) {
                            rowData[0] = "None";
                        } else {
                            rowData[0] = grandprixworld.gui.FullGame.data.findTeamByDriver(grandprixworld.gui.FullGame.data.drivers.get(i).raceNum).name;
                        }
                        rowData[1] = grandprixworld.gui.FullGame.data.drivers.get(i).fname.charAt(0) + " " + grandprixworld.gui.FullGame.data.drivers.get(i).lname;
                        rowData[2] = grandprixworld.gui.FullGame.data.drivers.get(i).finalSeason;
                        model.addRow(rowData);
                    }
                }
                break;
            case 6:
                lblCurrentAge.setVisible(false);
                lblCurrentNation.setVisible(false);
                lblNextAge.setVisible(false);
                lblNextNation.setVisible(false);
                lblOfferRaceBonus.setVisible(false);
                lblOfferChampBonus.setVisible(false);
                lblNegoRaceBonus.setVisible(false);
                lblNegoChampBonus.setVisible(false);
                lblNegoCurrentRaceBonus.setVisible(false);
                lblNegoCurrentChampBonus.setVisible(false);
                btnDecRaceBonus.setVisible(false);
                btnIncRaceBonus.setVisible(false);
                btnDecChampBonus.setVisible(false);
                btnIncChampBonus.setVisible(false);
                lblChampBonus.setVisible(false);
                lblCurrentChampBonus.setVisible(false);
                lblNextChampBonus.setVisible(false);
                lblRaceBonus.setText("Royalty %");
                lblSkill.setVisible(false);
                lblOvertaking.setVisible(false);
                lblWet.setVisible(false);
                lblStamina.setVisible(false);
                lblExperience.setVisible(false);
                imgCurrentSkill.setVisible(false);
                imgCurrentOvertaking.setVisible(false);
                imgCurrentWet.setVisible(false);
                imgCurrentStamina.setVisible(false);
                imgCurrentExperience.setVisible(false);
                imgNextSkill.setVisible(false);
                imgNextOvertaking.setVisible(false);
                imgNextWet.setVisible(false);
                imgNextStamina.setVisible(false);
                imgNextExperience.setVisible(false);
                lblSpeed.setText("Ability");
                lblCurrentName.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().commDir.name);
                lblCurrentSalary.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().commDir.salary));
                lblCurrentRaceBonus.setText(Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().commDir.royalty) + "%");
                imgCurrentSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().commDir.ability + ".png")));
                if (name == null) {
                    imgNextSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    for (int i = 0; i < grandprixworld.gui.FullGame.data.commercialDirectors.size(); i++) {
                        if (grandprixworld.gui.FullGame.data.findTeamByCommDir(grandprixworld.gui.FullGame.data.commercialDirectors.get(i).name) == null) {
                            rowData[0] = "None";
                        } else {
                            rowData[0] = grandprixworld.gui.FullGame.data.findTeamByCommDir(grandprixworld.gui.FullGame.data.commercialDirectors.get(i).name).name;
                        }
                        rowData[1] = grandprixworld.gui.FullGame.data.commercialDirectors.get(i).name;
                        rowData[2] = grandprixworld.gui.FullGame.data.commercialDirectors.get(i).finalSeason;
                        model.addRow(rowData);
                    }
                }
                break;
            case 7:
                lblCurrentAge.setVisible(false);
                lblCurrentNation.setVisible(false);
                lblNextAge.setVisible(false);
                lblNextNation.setVisible(false);
                lblOfferRoyalty.setVisible(false);
                lblNegoRoyalty.setVisible(false);
                lblNegoCurrentRoyalty.setVisible(false);
                btnDecRoyalty.setVisible(false);
                btnIncRoyalty.setVisible(false);
                lblSkill.setVisible(false);
                lblOvertaking.setVisible(false);
                lblWet.setVisible(false);
                lblStamina.setVisible(false);
                lblExperience.setVisible(false);
                imgCurrentSkill.setVisible(false);
                imgCurrentOvertaking.setVisible(false);
                imgCurrentWet.setVisible(false);
                imgCurrentStamina.setVisible(false);
                imgCurrentExperience.setVisible(false);
                imgNextSkill.setVisible(false);
                imgNextOvertaking.setVisible(false);
                imgNextWet.setVisible(false);
                imgNextStamina.setVisible(false);
                imgNextExperience.setVisible(false);
                lblSpeed.setText("Ability");
                lblCurrentName.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().chiefDes.name);
                lblCurrentSalary.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().chiefDes.salary));
                lblCurrentRaceBonus.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().chiefDes.racebonus));
                lblCurrentChampBonus.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().chiefDes.champbonus));
                imgCurrentSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().chiefDes.ability + ".png")));
                if (name == null) {
                    imgNextSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    for (int i = 0; i < grandprixworld.gui.FullGame.data.chiefDesigners.size(); i++) {
                        if (grandprixworld.gui.FullGame.data.findTeamByChiefDes(grandprixworld.gui.FullGame.data.chiefDesigners.get(i).name) == null) {
                            rowData[0] = "None";
                        } else {
                            rowData[0] = grandprixworld.gui.FullGame.data.findTeamByChiefDes(grandprixworld.gui.FullGame.data.chiefDesigners.get(i).name).name;
                        }
                        rowData[1] = grandprixworld.gui.FullGame.data.chiefDesigners.get(i).name;
                        rowData[2] = grandprixworld.gui.FullGame.data.chiefDesigners.get(i).finalSeason;
                        model.addRow(rowData);
                    }
                }
                break;
            case 8:
                lblCurrentAge.setVisible(false);
                lblCurrentNation.setVisible(false);
                lblNextAge.setVisible(false);
                lblNextNation.setVisible(false);
                lblOfferRoyalty.setVisible(false);
                lblNegoRoyalty.setVisible(false);
                lblNegoCurrentRoyalty.setVisible(false);
                btnDecRoyalty.setVisible(false);
                btnIncRoyalty.setVisible(false);
                lblSkill.setVisible(false);
                lblOvertaking.setVisible(false);
                lblWet.setVisible(false);
                lblStamina.setVisible(false);
                lblExperience.setVisible(false);
                imgCurrentSkill.setVisible(false);
                imgCurrentOvertaking.setVisible(false);
                imgCurrentWet.setVisible(false);
                imgCurrentStamina.setVisible(false);
                imgCurrentExperience.setVisible(false);
                imgNextSkill.setVisible(false);
                imgNextOvertaking.setVisible(false);
                imgNextWet.setVisible(false);
                imgNextStamina.setVisible(false);
                imgNextExperience.setVisible(false);
                lblSpeed.setText("Ability");
                lblCurrentName.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().chiefDes.name);
                lblCurrentSalary.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().chiefDes.salary));
                lblCurrentRaceBonus.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().chiefDes.racebonus));
                lblCurrentChampBonus.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().chiefDes.champbonus));
                imgCurrentSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().techDir.ability + ".png")));
                if (name == null) {
                    imgNextSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    for (int i = 0; i < grandprixworld.gui.FullGame.data.technicalDirectors.size(); i++) {
                        if (grandprixworld.gui.FullGame.data.findTeamByTechDir(grandprixworld.gui.FullGame.data.technicalDirectors.get(i).name) == null) {
                            rowData[0] = "None";
                        } else {
                            rowData[0] = grandprixworld.gui.FullGame.data.findTeamByTechDir(grandprixworld.gui.FullGame.data.technicalDirectors.get(i).name).name;
                        }
                        rowData[1] = grandprixworld.gui.FullGame.data.technicalDirectors.get(i).name;
                        rowData[2] = grandprixworld.gui.FullGame.data.technicalDirectors.get(i).finalSeason;
                        model.addRow(rowData);
                    }
                }
                break;
            case 9:
                lblCurrentAge.setVisible(false);
                lblCurrentNation.setVisible(false);
                lblNextAge.setVisible(false);
                lblNextNation.setVisible(false);
                lblOfferRoyalty.setVisible(false);
                lblNegoRoyalty.setVisible(false);
                lblNegoCurrentRoyalty.setVisible(false);
                btnDecRoyalty.setVisible(false);
                btnIncRoyalty.setVisible(false);
                lblSkill.setVisible(false);
                lblOvertaking.setVisible(false);
                lblWet.setVisible(false);
                lblStamina.setVisible(false);
                lblExperience.setVisible(false);
                imgCurrentSkill.setVisible(false);
                imgCurrentOvertaking.setVisible(false);
                imgCurrentWet.setVisible(false);
                imgCurrentStamina.setVisible(false);
                imgCurrentExperience.setVisible(false);
                imgNextSkill.setVisible(false);
                imgNextOvertaking.setVisible(false);
                imgNextWet.setVisible(false);
                imgNextStamina.setVisible(false);
                imgNextExperience.setVisible(false);
                lblSpeed.setText("Ability");
                lblCurrentName.setText(grandprixworld.gui.FullGame.data.findPlayerTeam().chiefDes.name);
                lblCurrentSalary.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().chiefDes.salary));
                lblCurrentRaceBonus.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().chiefDes.racebonus));
                lblCurrentChampBonus.setText("$" + Integer.toString(grandprixworld.gui.FullGame.data.findPlayerTeam().chiefDes.champbonus));
                imgCurrentSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + FullGame.data.findPlayerTeam().chiefDes.ability + ".png")));
                if (name == null) {
                    imgNextSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability0.png")));
                    for (int i = 0; i < grandprixworld.gui.FullGame.data.chiefMechanics.size(); i++) {
                        if (grandprixworld.gui.FullGame.data.findTeamByChiefMech(grandprixworld.gui.FullGame.data.chiefMechanics.get(i).name) == null) {
                            rowData[0] = "None";
                        } else {
                            rowData[0] = grandprixworld.gui.FullGame.data.findTeamByChiefMech(grandprixworld.gui.FullGame.data.chiefMechanics.get(i).name).name;
                        }
                        rowData[1] = grandprixworld.gui.FullGame.data.chiefMechanics.get(i).name;
                        rowData[2] = grandprixworld.gui.FullGame.data.chiefMechanics.get(i).finalSeason;
                        model.addRow(rowData);
                    }
                }
                break;
        }
        boolean f = true;
        if (name != null) {
            if (!this.name.equals(name)) {
                switch (negotiationPos) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        d = grandprixworld.gui.FullGame.data.findDriverByName(name);
                        if (grandprixworld.gui.FullGame.data.findDriverNegotiationByDriver(d, grandprixworld.gui.FullGame.data.findPlayerTeam()) == null) {
                            this.name = name;
                            salary = d.salary;
                            racebonus = d.racebonus;
                            champbonus = d.champbonus;
                            finalSeason = grandprixworld.gui.FullGame.data.currentYear + 1;
                            lblOfferSalary.setText("$" + Integer.toString(d.salary));
                            lblOfferRaceBonus.setText("$" + Integer.toString(d.racebonus));
                            lblOfferChampBonus.setText("$" + Integer.toString(d.champbonus));
                            lblOfferFinalSeason.setText(Integer.toString((grandprixworld.gui.FullGame.data.currentYear + 1)));
                        } else {
                            DriverNegotiation n = grandprixworld.gui.FullGame.data.findDriverNegotiationByDriver(d, grandprixworld.gui.FullGame.data.findPlayerTeam());
                            salary = n.lastOfferSalary;
                            racebonus = n.lastOfferRaceBonus;
                            champbonus = n.lastOfferChampBonus;
                            finalSeason = n.lastOfferFinalSeason;
                            lblOfferSalary.setText("$" + Integer.toString(n.lastOfferSalary));
                            lblOfferRaceBonus.setText("$" + Integer.toString(n.lastOfferRaceBonus));
                            lblOfferChampBonus.setText("$" + Integer.toString(n.lastOfferChampBonus));
                            lblOfferFinalSeason.setText(Integer.toString(n.lastOfferFinalSeason));
                            if (n.lastOfferResults[0] == 1) {
                                lblOfferSalary.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferSalary.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[1] == 1) {
                                lblOfferRaceBonus.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferRaceBonus.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[2] == 1) {
                                lblOfferChampBonus.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferChampBonus.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[3] == 0 || n.lastOfferResults[3] == 2) {
                                lblOfferFinalSeason.setBackground(new Color(190, 132, 137));
                            } else {
                                lblOfferFinalSeason.setBackground(new Color(113, 190, 137));
                            }
                            if (grandprixworld.gui.FullGame.data.currentDate.equals(n.lastOfferDate) || n.lastOfferResults[4] == 0) {
                                btnOffer.setEnabled(false);
                                btnIncSalary.setEnabled(false);
                                btnIncRaceBonus.setEnabled(false);
                                btnIncChampBonus.setEnabled(false);
                                btnIncFinalSeason.setEnabled(false);
                                btnDecSalary.setEnabled(false);
                                btnDecRaceBonus.setEnabled(false);
                                btnDecChampBonus.setEnabled(false);
                                btnDecFinalSeason.setEnabled(false);
                                f = false;
                            } else {
                                btnOffer.setEnabled(true);
                                btnIncSalary.setEnabled(true);
                                btnIncRaceBonus.setEnabled(true);
                                btnIncChampBonus.setEnabled(true);
                                btnIncFinalSeason.setEnabled(true);
                                btnDecSalary.setEnabled(true);
                                btnDecRaceBonus.setEnabled(true);
                                btnDecChampBonus.setEnabled(true);
                                btnDecFinalSeason.setEnabled(true);
                            }
                            if (n.canSign() == true) {
                                btnOffer.setEnabled(false);
                                btnSign.setEnabled(true);
                            } else {
                                btnSign.setEnabled(false);
                            }
                        }
                        lblNextName.setText(name);
                        lblNextAge.setText("Age: " + calculateAge(d.dob));
                        lblNextNation.setText(d.nation.toString());
                        lblNextSalary.setText("$" + Integer.toString(d.salary));
                        lblNextRaceBonus.setText("$" + Integer.toString(d.racebonus));
                        lblNextChampBonus.setText("$" + Integer.toString(d.champbonus));
                        imgNextSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + d.attributes[0] + ".png")));
                        imgNextSkill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + d.attributes[1] + ".png")));
                        imgNextOvertaking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + d.attributes[2] + ".png")));
                        imgNextWet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + d.attributes[3] + ".png")));
                        imgNextStamina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + d.attributes[4] + ".png")));
                        imgNextExperience.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + d.attributes[5] + ".png")));
                        lblNegoCurrentSalary.setText("$" + Integer.toString(d.salary));
                        lblNegoCurrentRaceBonus.setText("$" + Integer.toString(d.racebonus));
                        lblNegoCurrentChampBonus.setText("$" + Integer.toString(d.champbonus));
                        if (f == true) {
                            btnOffer.setEnabled(true);
                            btnIncSalary.setEnabled(true);
                            btnIncRaceBonus.setEnabled(true);
                            btnIncChampBonus.setEnabled(true);
                            btnIncFinalSeason.setEnabled(true);
                            btnDecSalary.setEnabled(true);
                            btnDecRaceBonus.setEnabled(true);
                            btnDecChampBonus.setEnabled(true);
                            btnDecFinalSeason.setEnabled(true);
                        }
                        break;
                    case 6:
                        comm = grandprixworld.gui.FullGame.data.findCommDirByName(name);
                        if (grandprixworld.gui.FullGame.data.findCommercialNegotiationByCommDir(comm, grandprixworld.gui.FullGame.data.findPlayerTeam()) == null) {
                            this.name = name;
                            salary = comm.salary;
                            royalty = comm.royalty;
                            finalSeason = grandprixworld.gui.FullGame.data.currentYear + 1;
                            lblOfferSalary.setText("$" + Integer.toString(comm.salary));
                            lblOfferRoyalty.setText(Integer.toString(comm.royalty) + "%");
                            lblOfferFinalSeason.setText(Integer.toString((grandprixworld.gui.FullGame.data.currentYear + 1)));
                        } else {
                            CommercialNegotiation n = grandprixworld.gui.FullGame.data.findCommercialNegotiationByCommDir(comm, grandprixworld.gui.FullGame.data.findPlayerTeam());
                            salary = n.lastOfferSalary;
                            royalty = n.lastOfferRoyalty;
                            finalSeason = n.lastOfferFinalSeason;
                            lblOfferSalary.setText("$" + Integer.toString(n.lastOfferSalary));
                            lblOfferRoyalty.setText(Integer.toString(n.lastOfferRoyalty) + "%");
                            lblOfferFinalSeason.setText(Integer.toString(n.lastOfferFinalSeason));
                            if (n.lastOfferResults[0] == 1) {
                                lblOfferSalary.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferSalary.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[1] == 1) {
                                lblOfferRoyalty.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferRoyalty.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[2] == 0 || n.lastOfferResults[2] == 2) {
                                lblOfferFinalSeason.setBackground(new Color(190, 132, 137));
                            } else {
                                lblOfferFinalSeason.setBackground(new Color(113, 190, 137));
                            }
                            if (grandprixworld.gui.FullGame.data.currentDate.equals(n.lastOfferDate)) {
                                btnOffer.setEnabled(false);
                                btnIncSalary.setEnabled(false);
                                btnIncRoyalty.setEnabled(false);
                                btnIncFinalSeason.setEnabled(false);
                                btnDecSalary.setEnabled(false);
                                btnDecRoyalty.setEnabled(false);
                                btnDecFinalSeason.setEnabled(false);
                                f = false;
                            } else {
                                btnOffer.setEnabled(true);
                                btnIncSalary.setEnabled(true);
                                btnIncRoyalty.setEnabled(true);
                                btnIncFinalSeason.setEnabled(true);
                                btnDecSalary.setEnabled(true);
                                btnDecRoyalty.setEnabled(true);
                                btnDecFinalSeason.setEnabled(true);
                            }
                            if (n.canSign() == true) {
                                btnOffer.setEnabled(false);
                                btnSign.setEnabled(true);
                            } else {
                                btnSign.setEnabled(false);
                            }
                        }
                        lblNextName.setText(name);
                        lblNextSalary.setText("$" + Integer.toString(comm.salary));
                        lblNextRaceBonus.setText(Integer.toString(comm.royalty) + "%");
                        lblNegoCurrentSalary.setText("$" + Integer.toString(comm.salary));
                        lblNegoCurrentRoyalty.setText(Integer.toString(comm.royalty) + "%");
                        imgNextSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + comm.ability + ".png")));
                        if (f == true) {
                            btnOffer.setEnabled(true);
                            btnIncSalary.setEnabled(true);
                            btnIncRoyalty.setEnabled(true);
                            btnIncFinalSeason.setEnabled(true);
                            btnDecSalary.setEnabled(true);
                            btnDecRoyalty.setEnabled(true);
                            btnDecFinalSeason.setEnabled(true);
                        }
                        break;
                    case 7:
                        des = grandprixworld.gui.FullGame.data.findChiefDesByName(name);
                        if (grandprixworld.gui.FullGame.data.findDesignerNegotiationByChiefDes(des, grandprixworld.gui.FullGame.data.findPlayerTeam()) == null) {
                            this.name = name;
                            salary = des.salary;
                            racebonus = des.racebonus;
                            champbonus = des.champbonus;
                            finalSeason = grandprixworld.gui.FullGame.data.currentYear + 1;
                            lblOfferSalary.setText("$" + Integer.toString(des.salary));
                            lblOfferRaceBonus.setText("$" + Integer.toString(des.racebonus));
                            lblOfferChampBonus.setText("$" + Integer.toString(des.champbonus));
                            lblOfferFinalSeason.setText(Integer.toString((grandprixworld.gui.FullGame.data.currentYear + 1)));
                        } else {
                            DesignerNegotiation n = grandprixworld.gui.FullGame.data.findDesignerNegotiationByChiefDes(des, grandprixworld.gui.FullGame.data.findPlayerTeam());
                            salary = n.lastOfferSalary;
                            racebonus = n.lastOfferRaceBonus;
                            champbonus = n.lastOfferChampBonus;
                            finalSeason = n.lastOfferFinalSeason;
                            lblOfferSalary.setText("$" + Integer.toString(n.lastOfferSalary));
                            lblOfferRaceBonus.setText("$" + Integer.toString(n.lastOfferRaceBonus));
                            lblOfferChampBonus.setText("$" + Integer.toString(n.lastOfferChampBonus));
                            lblOfferFinalSeason.setText(Integer.toString(n.lastOfferFinalSeason));
                            if (n.lastOfferResults[0] == 1) {
                                lblOfferSalary.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferSalary.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[1] == 1) {
                                lblOfferRaceBonus.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferRaceBonus.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[2] == 1) {
                                lblOfferChampBonus.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferChampBonus.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[3] == 0 || n.lastOfferResults[3] == 2) {
                                lblOfferFinalSeason.setBackground(new Color(190, 132, 137));
                            } else {
                                lblOfferFinalSeason.setBackground(new Color(113, 190, 137));
                            }
                            if (grandprixworld.gui.FullGame.data.currentDate.equals(n.lastOfferDate)) {
                                btnOffer.setEnabled(false);
                                btnIncSalary.setEnabled(false);
                                btnIncRaceBonus.setEnabled(false);
                                btnIncChampBonus.setEnabled(false);
                                btnIncFinalSeason.setEnabled(false);
                                btnDecSalary.setEnabled(false);
                                btnDecRaceBonus.setEnabled(false);
                                btnDecChampBonus.setEnabled(false);
                                btnDecFinalSeason.setEnabled(false);
                                f = false;
                            } else {
                                btnOffer.setEnabled(true);
                                btnIncSalary.setEnabled(true);
                                btnIncRaceBonus.setEnabled(true);
                                btnIncChampBonus.setEnabled(true);
                                btnIncFinalSeason.setEnabled(true);
                                btnDecSalary.setEnabled(true);
                                btnDecRaceBonus.setEnabled(true);
                                btnDecChampBonus.setEnabled(true);
                                btnDecFinalSeason.setEnabled(true);
                            }
                            if (n.canSign() == true) {
                                btnOffer.setEnabled(false);
                                btnSign.setEnabled(true);
                            } else {
                                btnSign.setEnabled(false);
                            }
                        }
                        lblNextName.setText(name);
                        lblNextSalary.setText("$" + Integer.toString(des.salary));
                        lblNextRaceBonus.setText("$" + Integer.toString(des.racebonus));
                        lblNextChampBonus.setText("$" + Integer.toString(des.champbonus));
                        imgNextSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + des.ability + ".png")));
                        lblNegoCurrentSalary.setText("$" + Integer.toString(des.salary));
                        lblNegoCurrentRaceBonus.setText("$" + Integer.toString(des.racebonus));
                        lblNegoCurrentChampBonus.setText("$" + Integer.toString(des.champbonus));
                        if (f == true) {
                            btnOffer.setEnabled(true);
                            btnIncSalary.setEnabled(true);
                            btnIncRaceBonus.setEnabled(true);
                            btnIncChampBonus.setEnabled(true);
                            btnIncFinalSeason.setEnabled(true);
                            btnDecSalary.setEnabled(true);
                            btnDecRaceBonus.setEnabled(true);
                            btnDecChampBonus.setEnabled(true);
                            btnDecFinalSeason.setEnabled(true);
                        }
                        break;
                    case 8:
                        tech = grandprixworld.gui.FullGame.data.findTechDirByName(name);
                        if (grandprixworld.gui.FullGame.data.findTechnicalNegotiationByTechDir(tech, grandprixworld.gui.FullGame.data.findPlayerTeam()) == null) {
                            this.name = name;
                            salary = tech.salary;
                            racebonus = tech.racebonus;
                            champbonus = tech.champbonus;
                            finalSeason = grandprixworld.gui.FullGame.data.currentYear + 1;
                            lblOfferSalary.setText("$" + Integer.toString(tech.salary));
                            lblOfferRaceBonus.setText("$" + Integer.toString(tech.racebonus));
                            lblOfferChampBonus.setText("$" + Integer.toString(tech.champbonus));
                            lblOfferFinalSeason.setText(Integer.toString((grandprixworld.gui.FullGame.data.currentYear + 1)));
                        } else {
                            TechnicalNegotiation n = grandprixworld.gui.FullGame.data.findTechnicalNegotiationByTechDir(tech, grandprixworld.gui.FullGame.data.findPlayerTeam());
                            salary = n.lastOfferSalary;
                            racebonus = n.lastOfferRaceBonus;
                            champbonus = n.lastOfferChampBonus;
                            finalSeason = n.lastOfferFinalSeason;
                            lblOfferSalary.setText("$" + Integer.toString(n.lastOfferSalary));
                            lblOfferRaceBonus.setText("$" + Integer.toString(n.lastOfferRaceBonus));
                            lblOfferChampBonus.setText("$" + Integer.toString(n.lastOfferChampBonus));
                            lblOfferFinalSeason.setText(Integer.toString(n.lastOfferFinalSeason));
                            if (n.lastOfferResults[0] == 1) {
                                lblOfferSalary.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferSalary.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[1] == 1) {
                                lblOfferRaceBonus.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferRaceBonus.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[2] == 1) {
                                lblOfferChampBonus.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferChampBonus.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[3] == 0 || n.lastOfferResults[3] == 2) {
                                lblOfferFinalSeason.setBackground(new Color(190, 132, 137));
                            } else {
                                lblOfferFinalSeason.setBackground(new Color(113, 190, 137));
                            }
                            if (grandprixworld.gui.FullGame.data.currentDate.equals(n.lastOfferDate)) {
                                btnOffer.setEnabled(false);
                                btnIncSalary.setEnabled(false);
                                btnIncRaceBonus.setEnabled(false);
                                btnIncChampBonus.setEnabled(false);
                                btnIncFinalSeason.setEnabled(false);
                                btnDecSalary.setEnabled(false);
                                btnDecRaceBonus.setEnabled(false);
                                btnDecChampBonus.setEnabled(false);
                                btnDecFinalSeason.setEnabled(false);
                                f = false;
                            } else {
                                btnOffer.setEnabled(true);
                                btnIncSalary.setEnabled(true);
                                btnIncRaceBonus.setEnabled(true);
                                btnIncChampBonus.setEnabled(true);
                                btnIncFinalSeason.setEnabled(true);
                                btnDecSalary.setEnabled(true);
                                btnDecRaceBonus.setEnabled(true);
                                btnDecChampBonus.setEnabled(true);
                                btnDecFinalSeason.setEnabled(true);
                            }
                            if (n.canSign() == true) {
                                btnOffer.setEnabled(false);
                                btnSign.setEnabled(true);
                            } else {
                                btnSign.setEnabled(false);
                            }
                        }
                        lblNextName.setText(name);
                        lblNextSalary.setText("$" + Integer.toString(tech.salary));
                        lblNextRaceBonus.setText("$" + Integer.toString(tech.racebonus));
                        lblNextChampBonus.setText("$" + Integer.toString(tech.champbonus));
                        imgNextSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + tech.ability + ".png")));
                        lblNegoCurrentSalary.setText("$" + Integer.toString(tech.salary));
                        lblNegoCurrentRaceBonus.setText("$" + Integer.toString(tech.racebonus));
                        lblNegoCurrentChampBonus.setText("$" + Integer.toString(tech.champbonus));
                        if (f == true) {
                            btnOffer.setEnabled(true);
                            btnIncSalary.setEnabled(true);
                            btnIncRaceBonus.setEnabled(true);
                            btnIncChampBonus.setEnabled(true);
                            btnIncFinalSeason.setEnabled(true);
                            btnDecSalary.setEnabled(true);
                            btnDecRaceBonus.setEnabled(true);
                            btnDecChampBonus.setEnabled(true);
                            btnDecFinalSeason.setEnabled(true);
                        }
                        break;
                    case 9:
                        mech = grandprixworld.gui.FullGame.data.findChiefMechByName(name);
                        if (grandprixworld.gui.FullGame.data.findMechanicNegotiationByChiefMech(mech, grandprixworld.gui.FullGame.data.findPlayerTeam()) == null) {
                            this.name = name;
                            salary = mech.salary;
                            racebonus = mech.racebonus;
                            champbonus = mech.champbonus;
                            finalSeason = grandprixworld.gui.FullGame.data.currentYear + 1;
                            lblOfferSalary.setText("$" + Integer.toString(mech.salary));
                            lblOfferRaceBonus.setText("$" + Integer.toString(mech.racebonus));
                            lblOfferChampBonus.setText("$" + Integer.toString(mech.champbonus));
                            lblOfferFinalSeason.setText(Integer.toString((grandprixworld.gui.FullGame.data.currentYear + 1)));
                        } else {
                            MechanicNegotiation n = grandprixworld.gui.FullGame.data.findMechanicNegotiationByChiefMech(mech, grandprixworld.gui.FullGame.data.findPlayerTeam());
                            salary = n.lastOfferSalary;
                            racebonus = n.lastOfferRaceBonus;
                            champbonus = n.lastOfferChampBonus;
                            finalSeason = n.lastOfferFinalSeason;
                            lblOfferSalary.setText("$" + Integer.toString(n.lastOfferSalary));
                            lblOfferRaceBonus.setText("$" + Integer.toString(n.lastOfferRaceBonus));
                            lblOfferChampBonus.setText("$" + Integer.toString(n.lastOfferChampBonus));
                            lblOfferFinalSeason.setText(Integer.toString(n.lastOfferFinalSeason));
                            if (n.lastOfferResults[0] == 1) {
                                lblOfferSalary.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferSalary.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[1] == 1) {
                                lblOfferRaceBonus.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferRaceBonus.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[2] == 1) {
                                lblOfferChampBonus.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferChampBonus.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[3] == 0 || n.lastOfferResults[3] == 2) {
                                lblOfferFinalSeason.setBackground(new Color(190, 132, 137));
                            } else {
                                lblOfferFinalSeason.setBackground(new Color(113, 190, 137));
                            }
                            if (grandprixworld.gui.FullGame.data.currentDate.equals(n.lastOfferDate)) {
                                btnOffer.setEnabled(false);
                                btnIncSalary.setEnabled(false);
                                btnIncRaceBonus.setEnabled(false);
                                btnIncChampBonus.setEnabled(false);
                                btnIncFinalSeason.setEnabled(false);
                                btnDecSalary.setEnabled(false);
                                btnDecRaceBonus.setEnabled(false);
                                btnDecChampBonus.setEnabled(false);
                                btnDecFinalSeason.setEnabled(false);
                                f = false;
                            } else {
                                btnOffer.setEnabled(true);
                                btnIncSalary.setEnabled(true);
                                btnIncRaceBonus.setEnabled(true);
                                btnIncChampBonus.setEnabled(true);
                                btnIncFinalSeason.setEnabled(true);
                                btnDecSalary.setEnabled(true);
                                btnDecRaceBonus.setEnabled(true);
                                btnDecChampBonus.setEnabled(true);
                                btnDecFinalSeason.setEnabled(true);
                            }
                            if (n.canSign() == true) {
                                btnOffer.setEnabled(false);
                                btnSign.setEnabled(true);
                            } else {
                                btnSign.setEnabled(false);
                            }
                        }
                        lblNextName.setText(name);
                        lblNextSalary.setText("$" + Integer.toString(mech.salary));
                        lblNextRaceBonus.setText("$" + Integer.toString(mech.racebonus));
                        lblNextChampBonus.setText("$" + Integer.toString(mech.champbonus));
                        imgNextSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability" + mech.ability + ".png")));
                        lblNegoCurrentSalary.setText("$" + Integer.toString(mech.salary));
                        lblNegoCurrentRaceBonus.setText("$" + Integer.toString(mech.racebonus));
                        lblNegoCurrentChampBonus.setText("$" + Integer.toString(mech.champbonus));
                        if (f == true) {
                            btnOffer.setEnabled(true);
                            btnIncSalary.setEnabled(true);
                            btnIncRaceBonus.setEnabled(true);
                            btnIncChampBonus.setEnabled(true);
                            btnIncFinalSeason.setEnabled(true);
                            btnDecSalary.setEnabled(true);
                            btnDecRaceBonus.setEnabled(true);
                            btnDecChampBonus.setEnabled(true);
                            btnDecFinalSeason.setEnabled(true);
                        }
                        break;
                }
            } else {
                switch (negotiationPos) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        lblOfferSalary.setText("$" + Integer.toString(salary));
                        lblOfferRaceBonus.setText("$" + Integer.toString(racebonus));
                        lblOfferChampBonus.setText("$" + Integer.toString(champbonus));
                        lblOfferFinalSeason.setText(Integer.toString(finalSeason));
                        if (grandprixworld.gui.FullGame.data.findDriverNegotiationByDriver(d, grandprixworld.gui.FullGame.data.findPlayerTeam()) != null) {
                            DriverNegotiation n = grandprixworld.gui.FullGame.data.findDriverNegotiationByDriver(d, grandprixworld.gui.FullGame.data.findPlayerTeam());
                            if (n.lastOfferResults[0] == 1) {
                                lblOfferSalary.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferSalary.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[1] == 1) {
                                lblOfferRaceBonus.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferRaceBonus.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[2] == 1) {
                                lblOfferChampBonus.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferChampBonus.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[3] == 0 || n.lastOfferResults[3] == 2) {
                                lblOfferFinalSeason.setBackground(new Color(190, 132, 137));
                            } else {
                                lblOfferFinalSeason.setBackground(new Color(113, 190, 137));
                            }
                            if (grandprixworld.gui.FullGame.data.currentDate.equals(n.lastOfferDate) || n.lastOfferResults[4] == 0) {
                                btnOffer.setEnabled(false);
                                btnIncSalary.setEnabled(false);
                                btnIncRaceBonus.setEnabled(false);
                                btnIncChampBonus.setEnabled(false);
                                btnIncFinalSeason.setEnabled(false);
                                btnDecSalary.setEnabled(false);
                                btnDecRaceBonus.setEnabled(false);
                                btnDecChampBonus.setEnabled(false);
                                btnDecFinalSeason.setEnabled(false);
                            } else {
                                btnOffer.setEnabled(true);
                                btnIncSalary.setEnabled(true);
                                btnIncRaceBonus.setEnabled(true);
                                btnIncChampBonus.setEnabled(true);
                                btnIncFinalSeason.setEnabled(true);
                                btnDecSalary.setEnabled(true);
                                btnDecRaceBonus.setEnabled(true);
                                btnDecChampBonus.setEnabled(true);
                                btnDecFinalSeason.setEnabled(true);
                            }
                            if (n.canSign() == true) {
                                btnOffer.setEnabled(false);
                                btnSign.setEnabled(true);
                            } else {
                                btnSign.setEnabled(false);
                            }
                        } else {
                            lblOfferSalary.setBackground(new Color(113, 132, 137));
                            lblOfferRaceBonus.setBackground(new Color(113, 132, 137));
                            lblOfferChampBonus.setBackground(new Color(113, 132, 137));
                            lblOfferFinalSeason.setBackground(new Color(113, 132, 137));
                        }
                        break;
                    case 6:
                        lblOfferSalary.setText("$" + Integer.toString(salary));
                        lblOfferRoyalty.setText(Integer.toString(royalty) + "%");
                        lblOfferFinalSeason.setText(Integer.toString(finalSeason));
                        if (grandprixworld.gui.FullGame.data.findCommercialNegotiationByCommDir(comm, grandprixworld.gui.FullGame.data.findPlayerTeam()) != null) {
                            CommercialNegotiation n = grandprixworld.gui.FullGame.data.findCommercialNegotiationByCommDir(comm, grandprixworld.gui.FullGame.data.findPlayerTeam());
                            if (n.lastOfferResults[0] == 1) {
                                lblOfferSalary.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferSalary.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[1] == 1) {
                                lblOfferRoyalty.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferRoyalty.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[2] == 0 || n.lastOfferResults[2] == 2) {
                                lblOfferFinalSeason.setBackground(new Color(190, 132, 137));
                            } else {
                                lblOfferFinalSeason.setBackground(new Color(113, 190, 137));
                            }
                            if (grandprixworld.gui.FullGame.data.currentDate.equals(n.lastOfferDate)) {
                                btnOffer.setEnabled(false);
                                btnIncSalary.setEnabled(false);
                                btnIncRoyalty.setEnabled(false);
                                btnIncFinalSeason.setEnabled(false);
                                btnDecSalary.setEnabled(false);
                                btnDecRoyalty.setEnabled(false);
                                btnDecFinalSeason.setEnabled(false);
                            } else {
                                btnOffer.setEnabled(true);
                                btnIncSalary.setEnabled(true);
                                btnIncRoyalty.setEnabled(true);
                                btnIncFinalSeason.setEnabled(true);
                                btnDecSalary.setEnabled(true);
                                btnDecRoyalty.setEnabled(true);
                                btnDecFinalSeason.setEnabled(true);
                            }
                            if (n.canSign() == true) {
                                btnOffer.setEnabled(false);
                                btnSign.setEnabled(true);
                            } else {
                                btnSign.setEnabled(false);
                            }
                        } else {
                            lblOfferSalary.setBackground(new Color(113, 132, 137));
                            lblOfferRoyalty.setBackground(new Color(113, 132, 137));
                            lblOfferFinalSeason.setBackground(new Color(113, 132, 137));
                        }
                        break;
                    case 7:
                        lblOfferSalary.setText("$" + Integer.toString(salary));
                        lblOfferRaceBonus.setText("$" + Integer.toString(racebonus));
                        lblOfferChampBonus.setText("$" + Integer.toString(champbonus));
                        lblOfferFinalSeason.setText(Integer.toString(finalSeason));
                        if (grandprixworld.gui.FullGame.data.findDesignerNegotiationByChiefDes(des, grandprixworld.gui.FullGame.data.findPlayerTeam()) != null) {
                            DesignerNegotiation n = grandprixworld.gui.FullGame.data.findDesignerNegotiationByChiefDes(des, grandprixworld.gui.FullGame.data.findPlayerTeam());
                            if (n.lastOfferResults[0] == 1) {
                                lblOfferSalary.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferSalary.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[1] == 1) {
                                lblOfferRaceBonus.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferRaceBonus.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[2] == 1) {
                                lblOfferChampBonus.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferChampBonus.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[3] == 0 || n.lastOfferResults[3] == 2) {
                                lblOfferFinalSeason.setBackground(new Color(190, 132, 137));
                            } else {
                                lblOfferFinalSeason.setBackground(new Color(113, 190, 137));
                            }
                            if (grandprixworld.gui.FullGame.data.currentDate.equals(n.lastOfferDate)) {
                                btnOffer.setEnabled(false);
                                btnIncSalary.setEnabled(false);
                                btnIncRaceBonus.setEnabled(false);
                                btnIncChampBonus.setEnabled(false);
                                btnIncFinalSeason.setEnabled(false);
                                btnDecSalary.setEnabled(false);
                                btnDecRaceBonus.setEnabled(false);
                                btnDecChampBonus.setEnabled(false);
                                btnDecFinalSeason.setEnabled(false);
                            } else {
                                btnOffer.setEnabled(true);
                                btnIncSalary.setEnabled(true);
                                btnIncRaceBonus.setEnabled(true);
                                btnIncChampBonus.setEnabled(true);
                                btnIncFinalSeason.setEnabled(true);
                                btnDecSalary.setEnabled(true);
                                btnDecRaceBonus.setEnabled(true);
                                btnDecChampBonus.setEnabled(true);
                                btnDecFinalSeason.setEnabled(true);
                            }
                            if (n.canSign() == true) {
                                btnOffer.setEnabled(false);
                                btnSign.setEnabled(true);
                            } else {
                                btnSign.setEnabled(false);
                            }
                        } else {
                            lblOfferSalary.setBackground(new Color(113, 132, 137));
                            lblOfferRaceBonus.setBackground(new Color(113, 132, 137));
                            lblOfferChampBonus.setBackground(new Color(113, 132, 137));
                            lblOfferFinalSeason.setBackground(new Color(113, 132, 137));
                        }
                        break;
                    case 8:
                        lblOfferSalary.setText("$" + Integer.toString(salary));
                        lblOfferRaceBonus.setText("$" + Integer.toString(racebonus));
                        lblOfferChampBonus.setText("$" + Integer.toString(champbonus));
                        lblOfferFinalSeason.setText(Integer.toString(finalSeason));
                        if (grandprixworld.gui.FullGame.data.findTechnicalNegotiationByTechDir(tech, grandprixworld.gui.FullGame.data.findPlayerTeam()) != null) {
                            TechnicalNegotiation n = grandprixworld.gui.FullGame.data.findTechnicalNegotiationByTechDir(tech, grandprixworld.gui.FullGame.data.findPlayerTeam());
                            if (n.lastOfferResults[0] == 1) {
                                lblOfferSalary.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferSalary.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[1] == 1) {
                                lblOfferRaceBonus.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferRaceBonus.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[2] == 1) {
                                lblOfferChampBonus.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferChampBonus.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[3] == 0 || n.lastOfferResults[3] == 2) {
                                lblOfferFinalSeason.setBackground(new Color(190, 132, 137));
                            } else {
                                lblOfferFinalSeason.setBackground(new Color(113, 190, 137));
                            }
                            if (grandprixworld.gui.FullGame.data.currentDate.equals(n.lastOfferDate)) {
                                btnOffer.setEnabled(false);
                                btnIncSalary.setEnabled(false);
                                btnIncRaceBonus.setEnabled(false);
                                btnIncChampBonus.setEnabled(false);
                                btnIncFinalSeason.setEnabled(false);
                                btnDecSalary.setEnabled(false);
                                btnDecRaceBonus.setEnabled(false);
                                btnDecChampBonus.setEnabled(false);
                                btnDecFinalSeason.setEnabled(false);
                            } else {
                                btnOffer.setEnabled(true);
                                btnIncSalary.setEnabled(true);
                                btnIncRaceBonus.setEnabled(true);
                                btnIncChampBonus.setEnabled(true);
                                btnIncFinalSeason.setEnabled(true);
                                btnDecSalary.setEnabled(true);
                                btnDecRaceBonus.setEnabled(true);
                                btnDecChampBonus.setEnabled(true);
                                btnDecFinalSeason.setEnabled(true);
                            }
                            if (n.canSign() == true) {
                                btnOffer.setEnabled(false);
                                btnSign.setEnabled(true);
                            } else {
                                btnSign.setEnabled(false);
                            }
                        } else {
                            lblOfferSalary.setBackground(new Color(113, 132, 137));
                            lblOfferRaceBonus.setBackground(new Color(113, 132, 137));
                            lblOfferChampBonus.setBackground(new Color(113, 132, 137));
                            lblOfferFinalSeason.setBackground(new Color(113, 132, 137));
                        }
                        break;
                    case 9:
                        lblOfferSalary.setText("$" + Integer.toString(salary));
                        lblOfferRaceBonus.setText("$" + Integer.toString(racebonus));
                        lblOfferChampBonus.setText("$" + Integer.toString(champbonus));
                        lblOfferFinalSeason.setText(Integer.toString(finalSeason));
                        if (grandprixworld.gui.FullGame.data.findMechanicNegotiationByChiefMech(mech, grandprixworld.gui.FullGame.data.findPlayerTeam()) != null) {
                            MechanicNegotiation n = grandprixworld.gui.FullGame.data.findMechanicNegotiationByChiefMech(mech, grandprixworld.gui.FullGame.data.findPlayerTeam());
                            if (n.lastOfferResults[0] == 1) {
                                lblOfferSalary.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferSalary.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[1] == 1) {
                                lblOfferRaceBonus.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferRaceBonus.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[2] == 1) {
                                lblOfferChampBonus.setBackground(new Color(113, 190, 137));
                            } else {
                                lblOfferChampBonus.setBackground(new Color(190, 132, 137));
                            }
                            if (n.lastOfferResults[3] == 0 || n.lastOfferResults[3] == 2) {
                                lblOfferFinalSeason.setBackground(new Color(190, 132, 137));
                            } else {
                                lblOfferFinalSeason.setBackground(new Color(113, 190, 137));
                            }
                            if (grandprixworld.gui.FullGame.data.currentDate.equals(n.lastOfferDate)) {
                                btnOffer.setEnabled(false);
                                btnIncSalary.setEnabled(false);
                                btnIncRaceBonus.setEnabled(false);
                                btnIncChampBonus.setEnabled(false);
                                btnIncFinalSeason.setEnabled(false);
                                btnDecSalary.setEnabled(false);
                                btnDecRaceBonus.setEnabled(false);
                                btnDecChampBonus.setEnabled(false);
                                btnDecFinalSeason.setEnabled(false);
                            } else {
                                btnOffer.setEnabled(true);
                                btnIncSalary.setEnabled(true);
                                btnIncRaceBonus.setEnabled(true);
                                btnIncChampBonus.setEnabled(true);
                                btnIncFinalSeason.setEnabled(true);
                                btnDecSalary.setEnabled(true);
                                btnDecRaceBonus.setEnabled(true);
                                btnDecChampBonus.setEnabled(true);
                                btnDecFinalSeason.setEnabled(true);
                            }
                            if (n.canSign() == true) {
                                btnOffer.setEnabled(false);
                                btnSign.setEnabled(true);
                            } else {
                                btnSign.setEnabled(false);
                            }
                        } else {
                            lblOfferSalary.setBackground(new Color(113, 132, 137));
                            lblOfferRaceBonus.setBackground(new Color(113, 132, 137));
                            lblOfferChampBonus.setBackground(new Color(113, 132, 137));
                            lblOfferFinalSeason.setBackground(new Color(113, 132, 137));
                        }
                        break;
                }
            }
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
        lblCurrentName = new javax.swing.JLabel();
        lblNextName = new javax.swing.JLabel();
        lblCurrentAge = new javax.swing.JLabel();
        lblNextAge = new javax.swing.JLabel();
        lblNextNation = new javax.swing.JLabel();
        lblCurrentNation = new javax.swing.JLabel();
        lblNextSalary = new javax.swing.JLabel();
        lblCurrentSalary = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        lblNextRaceBonus = new javax.swing.JLabel();
        lblCurrentRaceBonus = new javax.swing.JLabel();
        lblRaceBonus = new javax.swing.JLabel();
        lblNextChampBonus = new javax.swing.JLabel();
        lblCurrentChampBonus = new javax.swing.JLabel();
        lblChampBonus = new javax.swing.JLabel();
        lblAttributes = new javax.swing.JLabel();
        imgCurrentSpeed = new javax.swing.JLabel();
        lblSpeed = new javax.swing.JLabel();
        imgNextSpeed = new javax.swing.JLabel();
        imgNextSkill = new javax.swing.JLabel();
        lblSkill = new javax.swing.JLabel();
        imgCurrentSkill = new javax.swing.JLabel();
        imgCurrentOvertaking = new javax.swing.JLabel();
        imgNextOvertaking = new javax.swing.JLabel();
        lblOvertaking = new javax.swing.JLabel();
        imgCurrentWet = new javax.swing.JLabel();
        lblWet = new javax.swing.JLabel();
        imgNextWet = new javax.swing.JLabel();
        lblStamina = new javax.swing.JLabel();
        imgNextStamina = new javax.swing.JLabel();
        imgCurrentStamina = new javax.swing.JLabel();
        lblExperience = new javax.swing.JLabel();
        imgCurrentExperience = new javax.swing.JLabel();
        imgNextExperience = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllStaff = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        lblCurrent = new javax.swing.JLabel();
        lblNegoSalary = new javax.swing.JLabel();
        lblNegoCurrentSalary = new javax.swing.JLabel();
        lblOfferSalary = new javax.swing.JLabel();
        btnDecSalary = new javax.swing.JLabel();
        btnIncSalary = new javax.swing.JLabel();
        lblOffer = new javax.swing.JLabel();
        lblNegoRaceBonus = new javax.swing.JLabel();
        lblNegoCurrentRaceBonus = new javax.swing.JLabel();
        btnDecRaceBonus = new javax.swing.JLabel();
        lblOfferRaceBonus = new javax.swing.JLabel();
        btnIncRaceBonus = new javax.swing.JLabel();
        lblNegoChampBonus = new javax.swing.JLabel();
        btnDecChampBonus = new javax.swing.JLabel();
        lblNegoCurrentChampBonus = new javax.swing.JLabel();
        btnIncChampBonus = new javax.swing.JLabel();
        lblOfferChampBonus = new javax.swing.JLabel();
        lblNegoRoyalty = new javax.swing.JLabel();
        btnIncRoyalty = new javax.swing.JLabel();
        btnDecRoyalty = new javax.swing.JLabel();
        lblOfferRoyalty = new javax.swing.JLabel();
        lblNegoCurrentRoyalty = new javax.swing.JLabel();
        btnDecFinalSeason = new javax.swing.JLabel();
        lblOfferFinalSeason = new javax.swing.JLabel();
        btnOffer = new javax.swing.JLabel();
        lblNegoFinalSeason = new javax.swing.JLabel();
        btnIncFinalSeason = new javax.swing.JLabel();
        lblNegoCurrentFinalSeason = new javax.swing.JLabel();
        btnSign = new javax.swing.JLabel();

        setBackground(new java.awt.Color(88, 103, 108));
        setForeground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1100, 550));
        setMinimumSize(new java.awt.Dimension(1100, 550));
        setPreferredSize(new java.awt.Dimension(1100, 550));
        setLayout(new java.awt.GridLayout(1, 2, 10, 10));

        jPanel1.setOpaque(false);

        lblCurrentName.setBackground(new java.awt.Color(113, 132, 137));
        lblCurrentName.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCurrentName.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrentName.setText(" ");
        lblCurrentName.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCurrentName.setOpaque(true);

        lblNextName.setBackground(new java.awt.Color(113, 132, 137));
        lblNextName.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNextName.setForeground(new java.awt.Color(255, 255, 255));
        lblNextName.setText(" ");
        lblNextName.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNextName.setOpaque(true);

        lblCurrentAge.setBackground(new java.awt.Color(113, 132, 137));
        lblCurrentAge.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCurrentAge.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrentAge.setText("Age: ");
        lblCurrentAge.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCurrentAge.setOpaque(true);

        lblNextAge.setBackground(new java.awt.Color(113, 132, 137));
        lblNextAge.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNextAge.setForeground(new java.awt.Color(255, 255, 255));
        lblNextAge.setText("Age: ");
        lblNextAge.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNextAge.setOpaque(true);

        lblNextNation.setBackground(new java.awt.Color(113, 132, 137));
        lblNextNation.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNextNation.setForeground(new java.awt.Color(255, 255, 255));
        lblNextNation.setText(" ");
        lblNextNation.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNextNation.setOpaque(true);

        lblCurrentNation.setBackground(new java.awt.Color(113, 132, 137));
        lblCurrentNation.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCurrentNation.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrentNation.setText(" ");
        lblCurrentNation.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCurrentNation.setOpaque(true);

        lblNextSalary.setBackground(new java.awt.Color(113, 132, 137));
        lblNextSalary.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNextSalary.setForeground(new java.awt.Color(255, 255, 255));
        lblNextSalary.setText(" ");
        lblNextSalary.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNextSalary.setOpaque(true);

        lblCurrentSalary.setBackground(new java.awt.Color(113, 132, 137));
        lblCurrentSalary.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCurrentSalary.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrentSalary.setText(" ");
        lblCurrentSalary.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCurrentSalary.setOpaque(true);

        lblSalary.setBackground(new java.awt.Color(113, 132, 137));
        lblSalary.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSalary.setForeground(new java.awt.Color(255, 255, 255));
        lblSalary.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSalary.setText("Salary");
        lblSalary.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSalary.setOpaque(true);

        lblNextRaceBonus.setBackground(new java.awt.Color(113, 132, 137));
        lblNextRaceBonus.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNextRaceBonus.setForeground(new java.awt.Color(255, 255, 255));
        lblNextRaceBonus.setText(" ");
        lblNextRaceBonus.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNextRaceBonus.setOpaque(true);

        lblCurrentRaceBonus.setBackground(new java.awt.Color(113, 132, 137));
        lblCurrentRaceBonus.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCurrentRaceBonus.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrentRaceBonus.setText(" ");
        lblCurrentRaceBonus.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCurrentRaceBonus.setOpaque(true);

        lblRaceBonus.setBackground(new java.awt.Color(113, 132, 137));
        lblRaceBonus.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblRaceBonus.setForeground(new java.awt.Color(255, 255, 255));
        lblRaceBonus.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblRaceBonus.setText("Race Bonus");
        lblRaceBonus.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblRaceBonus.setOpaque(true);

        lblNextChampBonus.setBackground(new java.awt.Color(113, 132, 137));
        lblNextChampBonus.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNextChampBonus.setForeground(new java.awt.Color(255, 255, 255));
        lblNextChampBonus.setText(" ");
        lblNextChampBonus.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNextChampBonus.setOpaque(true);

        lblCurrentChampBonus.setBackground(new java.awt.Color(113, 132, 137));
        lblCurrentChampBonus.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCurrentChampBonus.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrentChampBonus.setText(" ");
        lblCurrentChampBonus.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCurrentChampBonus.setOpaque(true);

        lblChampBonus.setBackground(new java.awt.Color(113, 132, 137));
        lblChampBonus.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblChampBonus.setForeground(new java.awt.Color(255, 255, 255));
        lblChampBonus.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblChampBonus.setText("Champ. Bonus");
        lblChampBonus.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblChampBonus.setOpaque(true);

        lblAttributes.setBackground(new java.awt.Color(113, 132, 137));
        lblAttributes.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblAttributes.setForeground(new java.awt.Color(255, 255, 255));
        lblAttributes.setText("Attributes");
        lblAttributes.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblAttributes.setOpaque(true);

        imgCurrentSpeed.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgCurrentSpeed.setForeground(new java.awt.Color(255, 255, 255));
        imgCurrentSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N
        imgCurrentSpeed.setText(" ");
        imgCurrentSpeed.setMaximumSize(new java.awt.Dimension(134, 26));
        imgCurrentSpeed.setMinimumSize(new java.awt.Dimension(134, 26));
        imgCurrentSpeed.setPreferredSize(new java.awt.Dimension(134, 26));

        lblSpeed.setBackground(new java.awt.Color(113, 132, 137));
        lblSpeed.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSpeed.setForeground(new java.awt.Color(255, 255, 255));
        lblSpeed.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSpeed.setText("Speed");
        lblSpeed.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSpeed.setOpaque(true);

        imgNextSpeed.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgNextSpeed.setForeground(new java.awt.Color(255, 255, 255));
        imgNextSpeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N
        imgNextSpeed.setText(" ");
        imgNextSpeed.setMaximumSize(new java.awt.Dimension(134, 26));
        imgNextSpeed.setMinimumSize(new java.awt.Dimension(134, 26));
        imgNextSpeed.setPreferredSize(new java.awt.Dimension(134, 26));

        imgNextSkill.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgNextSkill.setForeground(new java.awt.Color(255, 255, 255));
        imgNextSkill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N
        imgNextSkill.setText(" ");
        imgNextSkill.setMaximumSize(new java.awt.Dimension(134, 26));
        imgNextSkill.setMinimumSize(new java.awt.Dimension(134, 26));
        imgNextSkill.setPreferredSize(new java.awt.Dimension(134, 26));

        lblSkill.setBackground(new java.awt.Color(113, 132, 137));
        lblSkill.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblSkill.setForeground(new java.awt.Color(255, 255, 255));
        lblSkill.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSkill.setText("Skill");
        lblSkill.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblSkill.setOpaque(true);

        imgCurrentSkill.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgCurrentSkill.setForeground(new java.awt.Color(255, 255, 255));
        imgCurrentSkill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N
        imgCurrentSkill.setText(" ");
        imgCurrentSkill.setMaximumSize(new java.awt.Dimension(134, 26));
        imgCurrentSkill.setMinimumSize(new java.awt.Dimension(134, 26));
        imgCurrentSkill.setPreferredSize(new java.awt.Dimension(134, 26));

        imgCurrentOvertaking.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgCurrentOvertaking.setForeground(new java.awt.Color(255, 255, 255));
        imgCurrentOvertaking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N
        imgCurrentOvertaking.setText(" ");
        imgCurrentOvertaking.setMaximumSize(new java.awt.Dimension(134, 26));
        imgCurrentOvertaking.setMinimumSize(new java.awt.Dimension(134, 26));
        imgCurrentOvertaking.setPreferredSize(new java.awt.Dimension(134, 26));

        imgNextOvertaking.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgNextOvertaking.setForeground(new java.awt.Color(255, 255, 255));
        imgNextOvertaking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N
        imgNextOvertaking.setText(" ");
        imgNextOvertaking.setMaximumSize(new java.awt.Dimension(134, 26));
        imgNextOvertaking.setMinimumSize(new java.awt.Dimension(134, 26));
        imgNextOvertaking.setPreferredSize(new java.awt.Dimension(134, 26));

        lblOvertaking.setBackground(new java.awt.Color(113, 132, 137));
        lblOvertaking.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblOvertaking.setForeground(new java.awt.Color(255, 255, 255));
        lblOvertaking.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblOvertaking.setText("Overtaking");
        lblOvertaking.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblOvertaking.setOpaque(true);

        imgCurrentWet.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgCurrentWet.setForeground(new java.awt.Color(255, 255, 255));
        imgCurrentWet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N
        imgCurrentWet.setText(" ");
        imgCurrentWet.setMaximumSize(new java.awt.Dimension(134, 26));
        imgCurrentWet.setMinimumSize(new java.awt.Dimension(134, 26));
        imgCurrentWet.setPreferredSize(new java.awt.Dimension(134, 26));

        lblWet.setBackground(new java.awt.Color(113, 132, 137));
        lblWet.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblWet.setForeground(new java.awt.Color(255, 255, 255));
        lblWet.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblWet.setText("Wet Weather");
        lblWet.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblWet.setOpaque(true);

        imgNextWet.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgNextWet.setForeground(new java.awt.Color(255, 255, 255));
        imgNextWet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N
        imgNextWet.setText(" ");
        imgNextWet.setMaximumSize(new java.awt.Dimension(134, 26));
        imgNextWet.setMinimumSize(new java.awt.Dimension(134, 26));
        imgNextWet.setPreferredSize(new java.awt.Dimension(134, 26));

        lblStamina.setBackground(new java.awt.Color(113, 132, 137));
        lblStamina.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblStamina.setForeground(new java.awt.Color(255, 255, 255));
        lblStamina.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblStamina.setText("Stamina");
        lblStamina.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblStamina.setOpaque(true);

        imgNextStamina.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgNextStamina.setForeground(new java.awt.Color(255, 255, 255));
        imgNextStamina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N
        imgNextStamina.setText(" ");
        imgNextStamina.setMaximumSize(new java.awt.Dimension(134, 26));
        imgNextStamina.setMinimumSize(new java.awt.Dimension(134, 26));
        imgNextStamina.setPreferredSize(new java.awt.Dimension(134, 26));

        imgCurrentStamina.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgCurrentStamina.setForeground(new java.awt.Color(255, 255, 255));
        imgCurrentStamina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N
        imgCurrentStamina.setText(" ");
        imgCurrentStamina.setMaximumSize(new java.awt.Dimension(134, 26));
        imgCurrentStamina.setMinimumSize(new java.awt.Dimension(134, 26));
        imgCurrentStamina.setPreferredSize(new java.awt.Dimension(134, 26));

        lblExperience.setBackground(new java.awt.Color(113, 132, 137));
        lblExperience.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblExperience.setForeground(new java.awt.Color(255, 255, 255));
        lblExperience.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblExperience.setText("Experience");
        lblExperience.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblExperience.setOpaque(true);

        imgCurrentExperience.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgCurrentExperience.setForeground(new java.awt.Color(255, 255, 255));
        imgCurrentExperience.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N
        imgCurrentExperience.setText(" ");
        imgCurrentExperience.setMaximumSize(new java.awt.Dimension(134, 26));
        imgCurrentExperience.setMinimumSize(new java.awt.Dimension(134, 26));
        imgCurrentExperience.setPreferredSize(new java.awt.Dimension(134, 26));

        imgNextExperience.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        imgNextExperience.setForeground(new java.awt.Color(255, 255, 255));
        imgNextExperience.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/5ability5.png"))); // NOI18N
        imgNextExperience.setText(" ");
        imgNextExperience.setMaximumSize(new java.awt.Dimension(134, 26));
        imgNextExperience.setMinimumSize(new java.awt.Dimension(134, 26));
        imgNextExperience.setPreferredSize(new java.awt.Dimension(134, 26));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cancel.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCurrentSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNextSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRaceBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCurrentRaceBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNextRaceBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAttributes, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCurrentName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNextName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCurrentAge, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNextAge, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCurrentNation, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNextNation, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imgCurrentSkill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imgCurrentExperience, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblStamina, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imgCurrentStamina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblWet, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imgCurrentWet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblOvertaking, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imgCurrentOvertaking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imgCurrentSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(imgNextStamina, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imgNextWet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imgNextOvertaking, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imgNextSkill, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(imgNextSpeed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(imgNextExperience, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblChampBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCurrentChampBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNextChampBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCurrentName)
                            .addComponent(lblNextName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCurrentAge)
                            .addComponent(lblNextAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCurrentNation)
                            .addComponent(lblNextNation)))
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalary)
                    .addComponent(lblCurrentSalary)
                    .addComponent(lblNextSalary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaceBonus)
                    .addComponent(lblCurrentRaceBonus)
                    .addComponent(lblNextRaceBonus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChampBonus)
                    .addComponent(lblCurrentChampBonus)
                    .addComponent(lblNextChampBonus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAttributes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgCurrentSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSpeed)
                        .addComponent(imgNextSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSkill)
                    .addComponent(imgCurrentSkill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgNextSkill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOvertaking)
                    .addComponent(imgCurrentOvertaking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgNextOvertaking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWet)
                    .addComponent(imgCurrentWet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgNextWet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStamina)
                    .addComponent(imgCurrentStamina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgNextStamina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExperience)
                    .addComponent(imgCurrentExperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgNextExperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        add(jPanel1);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(2, 1, 10, 10));

        jPanel4.setOpaque(false);

        tblAllStaff.setBackground(new java.awt.Color(64, 64, 64));
        tblAllStaff.setFont(new java.awt.Font("Formula1 Display Regular", 0, 14)); // NOI18N
        tblAllStaff.setForeground(new java.awt.Color(255, 255, 255));
        tblAllStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Current Team", "Name", "Final Season"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAllStaff);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel4);

        jPanel5.setOpaque(false);

        lblCurrent.setBackground(new java.awt.Color(113, 132, 137));
        lblCurrent.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCurrent.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCurrent.setText("Current");
        lblCurrent.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCurrent.setOpaque(true);

        lblNegoSalary.setBackground(new java.awt.Color(113, 132, 137));
        lblNegoSalary.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNegoSalary.setForeground(new java.awt.Color(255, 255, 255));
        lblNegoSalary.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNegoSalary.setText("Salary");
        lblNegoSalary.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNegoSalary.setOpaque(true);

        lblNegoCurrentSalary.setBackground(new java.awt.Color(113, 132, 137));
        lblNegoCurrentSalary.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNegoCurrentSalary.setForeground(new java.awt.Color(255, 255, 255));
        lblNegoCurrentSalary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNegoCurrentSalary.setText(" ");
        lblNegoCurrentSalary.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNegoCurrentSalary.setOpaque(true);

        lblOfferSalary.setBackground(new java.awt.Color(113, 132, 137));
        lblOfferSalary.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblOfferSalary.setForeground(new java.awt.Color(255, 255, 255));
        lblOfferSalary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOfferSalary.setText(" ");
        lblOfferSalary.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblOfferSalary.setOpaque(true);

        btnDecSalary.setFont(new java.awt.Font("Formula1 Display Bold", 0, 16)); // NOI18N
        btnDecSalary.setForeground(new java.awt.Color(255, 255, 255));
        btnDecSalary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDecSalary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecSalary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecSalaryMouseClicked(evt);
            }
        });

        btnIncSalary.setFont(new java.awt.Font("Formula1 Display Bold", 0, 16)); // NOI18N
        btnIncSalary.setForeground(new java.awt.Color(255, 255, 255));
        btnIncSalary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIncSalary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncSalary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncSalaryMouseClicked(evt);
            }
        });

        lblOffer.setBackground(new java.awt.Color(113, 132, 137));
        lblOffer.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblOffer.setForeground(new java.awt.Color(255, 255, 255));
        lblOffer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOffer.setText("Your Offer");
        lblOffer.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblOffer.setOpaque(true);

        lblNegoRaceBonus.setBackground(new java.awt.Color(113, 132, 137));
        lblNegoRaceBonus.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNegoRaceBonus.setForeground(new java.awt.Color(255, 255, 255));
        lblNegoRaceBonus.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNegoRaceBonus.setText("Race Bonus");
        lblNegoRaceBonus.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNegoRaceBonus.setOpaque(true);

        lblNegoCurrentRaceBonus.setBackground(new java.awt.Color(113, 132, 137));
        lblNegoCurrentRaceBonus.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNegoCurrentRaceBonus.setForeground(new java.awt.Color(255, 255, 255));
        lblNegoCurrentRaceBonus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNegoCurrentRaceBonus.setText(" ");
        lblNegoCurrentRaceBonus.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNegoCurrentRaceBonus.setOpaque(true);

        btnDecRaceBonus.setFont(new java.awt.Font("Formula1 Display Bold", 0, 16)); // NOI18N
        btnDecRaceBonus.setForeground(new java.awt.Color(255, 255, 255));
        btnDecRaceBonus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDecRaceBonus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecRaceBonus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecRaceBonusMouseClicked(evt);
            }
        });

        lblOfferRaceBonus.setBackground(new java.awt.Color(113, 132, 137));
        lblOfferRaceBonus.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblOfferRaceBonus.setForeground(new java.awt.Color(255, 255, 255));
        lblOfferRaceBonus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOfferRaceBonus.setText(" ");
        lblOfferRaceBonus.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblOfferRaceBonus.setOpaque(true);

        btnIncRaceBonus.setFont(new java.awt.Font("Formula1 Display Bold", 0, 16)); // NOI18N
        btnIncRaceBonus.setForeground(new java.awt.Color(255, 255, 255));
        btnIncRaceBonus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIncRaceBonus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncRaceBonus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncRaceBonusMouseClicked(evt);
            }
        });

        lblNegoChampBonus.setBackground(new java.awt.Color(113, 132, 137));
        lblNegoChampBonus.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNegoChampBonus.setForeground(new java.awt.Color(255, 255, 255));
        lblNegoChampBonus.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNegoChampBonus.setText("Champ Bonus");
        lblNegoChampBonus.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNegoChampBonus.setOpaque(true);

        btnDecChampBonus.setFont(new java.awt.Font("Formula1 Display Bold", 0, 16)); // NOI18N
        btnDecChampBonus.setForeground(new java.awt.Color(255, 255, 255));
        btnDecChampBonus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDecChampBonus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecChampBonus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecChampBonusMouseClicked(evt);
            }
        });

        lblNegoCurrentChampBonus.setBackground(new java.awt.Color(113, 132, 137));
        lblNegoCurrentChampBonus.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNegoCurrentChampBonus.setForeground(new java.awt.Color(255, 255, 255));
        lblNegoCurrentChampBonus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNegoCurrentChampBonus.setText(" ");
        lblNegoCurrentChampBonus.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNegoCurrentChampBonus.setOpaque(true);

        btnIncChampBonus.setFont(new java.awt.Font("Formula1 Display Bold", 0, 16)); // NOI18N
        btnIncChampBonus.setForeground(new java.awt.Color(255, 255, 255));
        btnIncChampBonus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIncChampBonus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncChampBonus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncChampBonusMouseClicked(evt);
            }
        });

        lblOfferChampBonus.setBackground(new java.awt.Color(113, 132, 137));
        lblOfferChampBonus.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblOfferChampBonus.setForeground(new java.awt.Color(255, 255, 255));
        lblOfferChampBonus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOfferChampBonus.setText(" ");
        lblOfferChampBonus.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblOfferChampBonus.setOpaque(true);

        lblNegoRoyalty.setBackground(new java.awt.Color(113, 132, 137));
        lblNegoRoyalty.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNegoRoyalty.setForeground(new java.awt.Color(255, 255, 255));
        lblNegoRoyalty.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNegoRoyalty.setText("Royalty %");
        lblNegoRoyalty.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNegoRoyalty.setOpaque(true);

        btnIncRoyalty.setFont(new java.awt.Font("Formula1 Display Bold", 0, 16)); // NOI18N
        btnIncRoyalty.setForeground(new java.awt.Color(255, 255, 255));
        btnIncRoyalty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIncRoyalty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncRoyalty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncRoyaltyMouseClicked(evt);
            }
        });

        btnDecRoyalty.setFont(new java.awt.Font("Formula1 Display Bold", 0, 16)); // NOI18N
        btnDecRoyalty.setForeground(new java.awt.Color(255, 255, 255));
        btnDecRoyalty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDecRoyalty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecRoyalty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecRoyaltyMouseClicked(evt);
            }
        });

        lblOfferRoyalty.setBackground(new java.awt.Color(113, 132, 137));
        lblOfferRoyalty.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblOfferRoyalty.setForeground(new java.awt.Color(255, 255, 255));
        lblOfferRoyalty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOfferRoyalty.setText(" ");
        lblOfferRoyalty.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblOfferRoyalty.setOpaque(true);

        lblNegoCurrentRoyalty.setBackground(new java.awt.Color(113, 132, 137));
        lblNegoCurrentRoyalty.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNegoCurrentRoyalty.setForeground(new java.awt.Color(255, 255, 255));
        lblNegoCurrentRoyalty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNegoCurrentRoyalty.setText(" ");
        lblNegoCurrentRoyalty.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNegoCurrentRoyalty.setOpaque(true);

        btnDecFinalSeason.setFont(new java.awt.Font("Formula1 Display Bold", 0, 16)); // NOI18N
        btnDecFinalSeason.setForeground(new java.awt.Color(255, 255, 255));
        btnDecFinalSeason.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDecFinalSeason.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnDecrease.png"))); // NOI18N
        btnDecFinalSeason.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecFinalSeasonMouseClicked(evt);
            }
        });

        lblOfferFinalSeason.setBackground(new java.awt.Color(113, 132, 137));
        lblOfferFinalSeason.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblOfferFinalSeason.setForeground(new java.awt.Color(255, 255, 255));
        lblOfferFinalSeason.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOfferFinalSeason.setText(" ");
        lblOfferFinalSeason.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblOfferFinalSeason.setOpaque(true);

        btnOffer.setBackground(new java.awt.Color(113, 132, 137));
        btnOffer.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnOffer.setForeground(new java.awt.Color(255, 255, 255));
        btnOffer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnOffer.setText("Offer Contract");
        btnOffer.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnOffer.setOpaque(true);
        btnOffer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOfferMouseClicked(evt);
            }
        });

        lblNegoFinalSeason.setBackground(new java.awt.Color(113, 132, 137));
        lblNegoFinalSeason.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNegoFinalSeason.setForeground(new java.awt.Color(255, 255, 255));
        lblNegoFinalSeason.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNegoFinalSeason.setText("Final Season");
        lblNegoFinalSeason.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNegoFinalSeason.setOpaque(true);

        btnIncFinalSeason.setFont(new java.awt.Font("Formula1 Display Bold", 0, 16)); // NOI18N
        btnIncFinalSeason.setForeground(new java.awt.Color(255, 255, 255));
        btnIncFinalSeason.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIncFinalSeason.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/btnIncrease.png"))); // NOI18N
        btnIncFinalSeason.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncFinalSeasonMouseClicked(evt);
            }
        });

        lblNegoCurrentFinalSeason.setBackground(new java.awt.Color(113, 132, 137));
        lblNegoCurrentFinalSeason.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNegoCurrentFinalSeason.setForeground(new java.awt.Color(255, 255, 255));
        lblNegoCurrentFinalSeason.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNegoCurrentFinalSeason.setText(" ");
        lblNegoCurrentFinalSeason.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNegoCurrentFinalSeason.setOpaque(true);

        btnSign.setBackground(new java.awt.Color(113, 132, 137));
        btnSign.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        btnSign.setForeground(new java.awt.Color(255, 255, 255));
        btnSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSign.setText("Sign Deal");
        btnSign.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        btnSign.setEnabled(false);
        btnSign.setOpaque(true);
        btnSign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNegoSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNegoRaceBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNegoChampBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNegoRoyalty, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNegoFinalSeason, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblNegoCurrentSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecSalary)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOfferSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncSalary))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOffer, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblNegoCurrentRaceBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecRaceBonus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOfferRaceBonus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncRaceBonus))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblNegoCurrentChampBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecChampBonus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOfferChampBonus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncChampBonus))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblNegoCurrentRoyalty, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecRoyalty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOfferRoyalty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIncRoyalty))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblNegoCurrentFinalSeason, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnDecFinalSeason)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOfferFinalSeason, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIncFinalSeason))
                            .addComponent(btnOffer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurrent)
                    .addComponent(lblOffer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNegoCurrentSalary)
                        .addComponent(lblOfferSalary)
                        .addComponent(lblNegoSalary))
                    .addComponent(btnDecSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNegoCurrentRaceBonus)
                        .addComponent(lblOfferRaceBonus)
                        .addComponent(lblNegoRaceBonus))
                    .addComponent(btnDecRaceBonus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncRaceBonus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNegoCurrentChampBonus)
                        .addComponent(lblOfferChampBonus)
                        .addComponent(lblNegoChampBonus))
                    .addComponent(btnDecChampBonus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncChampBonus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNegoCurrentRoyalty)
                        .addComponent(lblOfferRoyalty)
                        .addComponent(lblNegoRoyalty))
                    .addComponent(btnDecRoyalty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncRoyalty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblOfferFinalSeason)
                        .addComponent(lblNegoFinalSeason)
                        .addComponent(lblNegoCurrentFinalSeason))
                    .addComponent(btnDecFinalSeason, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIncFinalSeason, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOffer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSign)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5);

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncSalaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncSalaryMouseClicked
        if (btnIncSalary.isEnabled() == true) {
            if (salary < 200000) {
                salary += 20000;
            } else if (salary < 1000000) {
                salary += 50000;
            } else {
                salary += 100000;
            }
            updateScreenData(name);
        }
    }//GEN-LAST:event_btnIncSalaryMouseClicked

    private void btnIncRaceBonusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncRaceBonusMouseClicked
        if (btnIncRaceBonus.isEnabled() == true) {
            if (racebonus < 200000) {
                racebonus += 20000;
            } else if (racebonus < 1000000) {
                racebonus += 50000;
            } else {
                racebonus += 100000;
            }
            updateScreenData(name);
        }
    }//GEN-LAST:event_btnIncRaceBonusMouseClicked

    private void btnIncChampBonusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncChampBonusMouseClicked
        if (btnIncChampBonus.isEnabled() == true) {
            if (champbonus <= 200000) {
                champbonus += 20000;
            } else if (champbonus < 1000000) {
                champbonus += 50000;
            } else {
                champbonus += 100000;
            }
            updateScreenData(name);
        }
    }//GEN-LAST:event_btnIncChampBonusMouseClicked

    private void btnIncRoyaltyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncRoyaltyMouseClicked
        if (btnIncRoyalty.isEnabled() == true) {
            if (royalty < 100) {
                royalty++;
            }
            updateScreenData(name);
        }
    }//GEN-LAST:event_btnIncRoyaltyMouseClicked

    private void btnIncFinalSeasonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncFinalSeasonMouseClicked
        if (btnIncFinalSeason.isEnabled() == true) {
            if (finalSeason < 2028) {
                finalSeason++;
            }
            updateScreenData(name);
        }
    }//GEN-LAST:event_btnIncFinalSeasonMouseClicked

    private void btnDecSalaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecSalaryMouseClicked
        if (btnDecSalary.isEnabled() == true) {
            if (salary > 20000) {
                if (salary <= 200000) {
                    salary -= 20000;
                } else {
                    salary -= 50000;
                }
            } else {
                salary = 0;
            }
            updateScreenData(name);
        }
    }//GEN-LAST:event_btnDecSalaryMouseClicked

    private void btnDecRaceBonusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecRaceBonusMouseClicked
        if (btnDecRaceBonus.isEnabled() == true) {
            if (racebonus > 20000) {
                if (racebonus <= 200000) {
                    racebonus -= 20000;
                } else {
                    racebonus -= 50000;
                }
            } else {
                racebonus = 0;
            }
            updateScreenData(name);
        }
    }//GEN-LAST:event_btnDecRaceBonusMouseClicked

    private void btnDecChampBonusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecChampBonusMouseClicked
        if (btnDecChampBonus.isEnabled() == true) {
            if (champbonus > 20000) {
                if (champbonus <= 200000) {
                    champbonus -= 20000;
                } else {
                    champbonus -= 50000;
                }
            } else {
                champbonus = 0;
            }
            updateScreenData(name);
        }
    }//GEN-LAST:event_btnDecChampBonusMouseClicked

    private void btnDecRoyaltyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecRoyaltyMouseClicked
        if (btnDecRoyalty.isEnabled() == true) {
            if (royalty > 0) {
                royalty--;
            }
            updateScreenData(name);
        }
    }//GEN-LAST:event_btnDecRoyaltyMouseClicked

    private void btnDecFinalSeasonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecFinalSeasonMouseClicked
        if (btnDecFinalSeason.isEnabled() == true) {
            if (finalSeason > (grandprixworld.gui.FullGame.data.currentYear + 1)) {
                finalSeason--;
            }
            updateScreenData(name);
        }
    }//GEN-LAST:event_btnDecFinalSeasonMouseClicked

    private void btnOfferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOfferMouseClicked
        if (btnOffer.isEnabled() == true) {
            switch (negotiationPos) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    if (grandprixworld.gui.FullGame.data.findDriverNegotiationByDriver(d, grandprixworld.gui.FullGame.data.findPlayerTeam()) == null) {
                        DriverNegotiation n = new DriverNegotiation(d, grandprixworld.gui.FullGame.data.findPlayerTeam(), salary, racebonus, champbonus, finalSeason);
                        grandprixworld.gui.FullGame.data.findPlayerTeam().driverTalks.add(n);
                    } else {
                        grandprixworld.gui.FullGame.data.findDriverNegotiationByDriver(d, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferSalary = salary;
                        grandprixworld.gui.FullGame.data.findDriverNegotiationByDriver(d, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferRaceBonus = racebonus;
                        grandprixworld.gui.FullGame.data.findDriverNegotiationByDriver(d, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferChampBonus = champbonus;
                        grandprixworld.gui.FullGame.data.findDriverNegotiationByDriver(d, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferFinalSeason = finalSeason;
                        grandprixworld.gui.FullGame.data.findDriverNegotiationByDriver(d, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferResults = grandprixworld.gui.FullGame.data.findDriverNegotiationByDriver(d, grandprixworld.gui.FullGame.data.findPlayerTeam()).checkTargets();
                    }
                    updateScreenData(name);
                    showResultDialog(grandprixworld.gui.FullGame.data.findDriverNegotiationByDriver(d, grandprixworld.gui.FullGame.data.findPlayerTeam()), false);
                    break;
                case 6:
                    if (grandprixworld.gui.FullGame.data.findCommercialNegotiationByCommDir(comm, grandprixworld.gui.FullGame.data.findPlayerTeam()) == null) {
                        CommercialNegotiation n = new CommercialNegotiation(comm, grandprixworld.gui.FullGame.data.findPlayerTeam(), salary, royalty, finalSeason);
                        grandprixworld.gui.FullGame.data.findPlayerTeam().commTalks.add(n);
                    } else {
                        grandprixworld.gui.FullGame.data.findCommercialNegotiationByCommDir(comm, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferSalary = salary;
                        grandprixworld.gui.FullGame.data.findCommercialNegotiationByCommDir(comm, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferRoyalty = royalty;
                        grandprixworld.gui.FullGame.data.findCommercialNegotiationByCommDir(comm, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferFinalSeason = finalSeason;
                        grandprixworld.gui.FullGame.data.findCommercialNegotiationByCommDir(comm, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferResults = grandprixworld.gui.FullGame.data.findCommercialNegotiationByCommDir(comm, grandprixworld.gui.FullGame.data.findPlayerTeam()).checkTargets();
                    }
                    updateScreenData(name);
                    break;
                case 7:
                    if (grandprixworld.gui.FullGame.data.findDesignerNegotiationByChiefDes(des, grandprixworld.gui.FullGame.data.findPlayerTeam()) == null) {
                        DesignerNegotiation n = new DesignerNegotiation(des, grandprixworld.gui.FullGame.data.findPlayerTeam(), salary, racebonus, champbonus, finalSeason);
                        grandprixworld.gui.FullGame.data.findPlayerTeam().desTalks.add(n);
                    } else {
                        grandprixworld.gui.FullGame.data.findDesignerNegotiationByChiefDes(des, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferSalary = salary;
                        grandprixworld.gui.FullGame.data.findDesignerNegotiationByChiefDes(des, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferRaceBonus = racebonus;
                        grandprixworld.gui.FullGame.data.findDesignerNegotiationByChiefDes(des, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferChampBonus = champbonus;
                        grandprixworld.gui.FullGame.data.findDesignerNegotiationByChiefDes(des, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferFinalSeason = finalSeason;
                        grandprixworld.gui.FullGame.data.findDesignerNegotiationByChiefDes(des, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferResults = grandprixworld.gui.FullGame.data.findDesignerNegotiationByChiefDes(des, grandprixworld.gui.FullGame.data.findPlayerTeam()).checkTargets();
                    }
                    updateScreenData(name);
                    break;
                case 8:
                    if (grandprixworld.gui.FullGame.data.findTechnicalNegotiationByTechDir(tech, grandprixworld.gui.FullGame.data.findPlayerTeam()) == null) {
                        TechnicalNegotiation n = new TechnicalNegotiation(tech, grandprixworld.gui.FullGame.data.findPlayerTeam(), salary, racebonus, champbonus, finalSeason);
                        grandprixworld.gui.FullGame.data.findPlayerTeam().techTalks.add(n);
                    } else {
                        grandprixworld.gui.FullGame.data.findTechnicalNegotiationByTechDir(tech, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferSalary = salary;
                        grandprixworld.gui.FullGame.data.findTechnicalNegotiationByTechDir(tech, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferRaceBonus = racebonus;
                        grandprixworld.gui.FullGame.data.findTechnicalNegotiationByTechDir(tech, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferChampBonus = champbonus;
                        grandprixworld.gui.FullGame.data.findTechnicalNegotiationByTechDir(tech, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferFinalSeason = finalSeason;
                        grandprixworld.gui.FullGame.data.findTechnicalNegotiationByTechDir(tech, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferResults = grandprixworld.gui.FullGame.data.findTechnicalNegotiationByTechDir(tech, grandprixworld.gui.FullGame.data.findPlayerTeam()).checkTargets();
                    }
                    updateScreenData(name);
                    break;
                case 9:
                    if (grandprixworld.gui.FullGame.data.findMechanicNegotiationByChiefMech(mech, grandprixworld.gui.FullGame.data.findPlayerTeam()) == null) {
                        MechanicNegotiation n = new MechanicNegotiation(mech, grandprixworld.gui.FullGame.data.findPlayerTeam(), salary, racebonus, champbonus, finalSeason);
                        grandprixworld.gui.FullGame.data.findPlayerTeam().mechTalks.add(n);
                    } else {
                        grandprixworld.gui.FullGame.data.findMechanicNegotiationByChiefMech(mech, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferSalary = salary;
                        grandprixworld.gui.FullGame.data.findMechanicNegotiationByChiefMech(mech, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferRaceBonus = racebonus;
                        grandprixworld.gui.FullGame.data.findMechanicNegotiationByChiefMech(mech, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferChampBonus = champbonus;
                        grandprixworld.gui.FullGame.data.findMechanicNegotiationByChiefMech(mech, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferFinalSeason = finalSeason;
                        grandprixworld.gui.FullGame.data.findMechanicNegotiationByChiefMech(mech, grandprixworld.gui.FullGame.data.findPlayerTeam()).lastOfferResults = grandprixworld.gui.FullGame.data.findMechanicNegotiationByChiefMech(mech, grandprixworld.gui.FullGame.data.findPlayerTeam()).checkTargets();
                    }
                    updateScreenData(name);
                    break;
            }
        }
    }//GEN-LAST:event_btnOfferMouseClicked

    private void btnSignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignMouseClicked
        if (btnSign.isEnabled() == true) {

            switch (negotiationPos) {
                case 1:
                    DriverNegotiation n1 = grandprixworld.gui.FullGame.data.findDriverNegotiationByDriver(d, grandprixworld.gui.FullGame.data.findPlayerTeam());
                    d.nextsalary = n1.lastOfferSalary;
                    d.nextracebonus = n1.lastOfferRaceBonus;
                    d.nextchampbonus = n1.lastOfferChampBonus;
                    d.nextfinalSeason = n1.lastOfferFinalSeason;
                    grandprixworld.gui.FullGame.data.findPlayerTeam().nextDriver1 = d;
                    showResultDialog(n1, true);
                    break;
                case 2:
                    DriverNegotiation n2 = grandprixworld.gui.FullGame.data.findDriverNegotiationByDriver(d, grandprixworld.gui.FullGame.data.findPlayerTeam());
                    d.nextsalary = n2.lastOfferSalary;
                    d.nextracebonus = n2.lastOfferRaceBonus;
                    d.nextchampbonus = n2.lastOfferChampBonus;
                    d.nextfinalSeason = n2.lastOfferFinalSeason;
                    grandprixworld.gui.FullGame.data.findPlayerTeam().nextDriver2 = d;
                    showResultDialog(n2, true);
                    break;
                case 3:
                    DriverNegotiation n3 = grandprixworld.gui.FullGame.data.findDriverNegotiationByDriver(d, grandprixworld.gui.FullGame.data.findPlayerTeam());
                    d.nextsalary = n3.lastOfferSalary;
                    d.nextracebonus = n3.lastOfferRaceBonus;
                    d.nextchampbonus = n3.lastOfferChampBonus;
                    d.nextfinalSeason = n3.lastOfferFinalSeason;
                    grandprixworld.gui.FullGame.data.findPlayerTeam().nextYouth1 = d;
                    showResultDialog(n3, true);
                    break;
                case 4:
                    DriverNegotiation n4 = grandprixworld.gui.FullGame.data.findDriverNegotiationByDriver(d, grandprixworld.gui.FullGame.data.findPlayerTeam());
                    d.nextsalary = n4.lastOfferSalary;
                    d.nextracebonus = n4.lastOfferRaceBonus;
                    d.nextchampbonus = n4.lastOfferChampBonus;
                    d.nextfinalSeason = n4.lastOfferFinalSeason;
                    grandprixworld.gui.FullGame.data.findPlayerTeam().nextYouth2 = d;
                    showResultDialog(n4, true);
                    break;
                case 5:
                    DriverNegotiation n5 = grandprixworld.gui.FullGame.data.findDriverNegotiationByDriver(d, grandprixworld.gui.FullGame.data.findPlayerTeam());
                    d.nextsalary = n5.lastOfferSalary;
                    d.nextracebonus = n5.lastOfferRaceBonus;
                    d.nextchampbonus = n5.lastOfferChampBonus;
                    d.nextfinalSeason = n5.lastOfferFinalSeason;
                    grandprixworld.gui.FullGame.data.findPlayerTeam().nextYouth3 = d;
                    showResultDialog(n5, true);
                    break;
                case 6:
                    CommercialNegotiation n6 = grandprixworld.gui.FullGame.data.findCommercialNegotiationByCommDir(comm, grandprixworld.gui.FullGame.data.findPlayerTeam());
                    comm.nextsalary = n6.lastOfferSalary;
                    comm.nextroyalty = n6.lastOfferRoyalty;
                    comm.nextfinalSeason = n6.lastOfferFinalSeason;
                    grandprixworld.gui.FullGame.data.findPlayerTeam().nextCommDir = comm;
                    //showResultDialog(n6, true);
                    break;
                case 7:
                    DesignerNegotiation n7 = grandprixworld.gui.FullGame.data.findDesignerNegotiationByChiefDes(des, grandprixworld.gui.FullGame.data.findPlayerTeam());
                    des.nextSalary = n7.lastOfferSalary;
                    des.nextRaceBonus = n7.lastOfferRaceBonus;
                    des.nextChampBonus = n7.lastOfferChampBonus;
                    des.nextFinalSeason = n7.lastOfferFinalSeason;
                    grandprixworld.gui.FullGame.data.findPlayerTeam().nextChiefDes = des;
                    //showResultDialog(n7, true);
                    break;
                case 8:
                    TechnicalNegotiation n8 = grandprixworld.gui.FullGame.data.findTechnicalNegotiationByTechDir(tech, grandprixworld.gui.FullGame.data.findPlayerTeam());
                    tech.nextSalary = n8.lastOfferSalary;
                    tech.nextRaceBonus = n8.lastOfferRaceBonus;
                    tech.nextChampBonus = n8.lastOfferChampBonus;
                    tech.nextFinalSeason = n8.lastOfferFinalSeason;
                    grandprixworld.gui.FullGame.data.findPlayerTeam().nextTechDir = tech;
                    //showResultDialog(n8, true);
                    break;
                case 9:
                    MechanicNegotiation n9 = grandprixworld.gui.FullGame.data.findMechanicNegotiationByChiefMech(mech, grandprixworld.gui.FullGame.data.findPlayerTeam());
                    mech.nextSalary = n9.lastOfferSalary;
                    mech.nextRaceBonus = n9.lastOfferRaceBonus;
                    mech.nextChampBonus = n9.lastOfferChampBonus;
                    mech.nextFinalSeason = n9.lastOfferFinalSeason;
                    grandprixworld.gui.FullGame.data.findPlayerTeam().nextChiefMech = mech;
                    //showResultDialog(n9, true);
                    break;
            }
            btnSign.setEnabled(false);
            tblAllStaff.setEnabled(false);
            signed = true;
        }
    }//GEN-LAST:event_btnSignMouseClicked

    private void showResultDialog(DriverNegotiation n, boolean signed) {
        resultDialog = new TmNegotiationResult(n, signed);
        resultDialog.setVisible(true);
    }

    public static void closeResultDialog() {
        resultDialog.removeAll();
        resultDialog = null;
    }

    static TmNegotiationResult resultDialog;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnDecChampBonus;
    private javax.swing.JLabel btnDecFinalSeason;
    private javax.swing.JLabel btnDecRaceBonus;
    private javax.swing.JLabel btnDecRoyalty;
    private javax.swing.JLabel btnDecSalary;
    private javax.swing.JLabel btnIncChampBonus;
    private javax.swing.JLabel btnIncFinalSeason;
    private javax.swing.JLabel btnIncRaceBonus;
    private javax.swing.JLabel btnIncRoyalty;
    private javax.swing.JLabel btnIncSalary;
    private javax.swing.JLabel btnOffer;
    private javax.swing.JLabel btnSign;
    private javax.swing.JLabel imgCurrentExperience;
    private javax.swing.JLabel imgCurrentOvertaking;
    private javax.swing.JLabel imgCurrentSkill;
    private javax.swing.JLabel imgCurrentSpeed;
    private javax.swing.JLabel imgCurrentStamina;
    private javax.swing.JLabel imgCurrentWet;
    private javax.swing.JLabel imgNextExperience;
    private javax.swing.JLabel imgNextOvertaking;
    private javax.swing.JLabel imgNextSkill;
    private javax.swing.JLabel imgNextSpeed;
    private javax.swing.JLabel imgNextStamina;
    private javax.swing.JLabel imgNextWet;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAttributes;
    private javax.swing.JLabel lblChampBonus;
    private javax.swing.JLabel lblCurrent;
    private javax.swing.JLabel lblCurrentAge;
    private javax.swing.JLabel lblCurrentChampBonus;
    private javax.swing.JLabel lblCurrentName;
    private javax.swing.JLabel lblCurrentNation;
    private javax.swing.JLabel lblCurrentRaceBonus;
    private javax.swing.JLabel lblCurrentSalary;
    private javax.swing.JLabel lblExperience;
    private javax.swing.JLabel lblNegoChampBonus;
    private javax.swing.JLabel lblNegoCurrentChampBonus;
    private javax.swing.JLabel lblNegoCurrentFinalSeason;
    private javax.swing.JLabel lblNegoCurrentRaceBonus;
    private javax.swing.JLabel lblNegoCurrentRoyalty;
    private javax.swing.JLabel lblNegoCurrentSalary;
    private javax.swing.JLabel lblNegoFinalSeason;
    private javax.swing.JLabel lblNegoRaceBonus;
    private javax.swing.JLabel lblNegoRoyalty;
    private javax.swing.JLabel lblNegoSalary;
    private javax.swing.JLabel lblNextAge;
    private javax.swing.JLabel lblNextChampBonus;
    private javax.swing.JLabel lblNextName;
    private javax.swing.JLabel lblNextNation;
    private javax.swing.JLabel lblNextRaceBonus;
    private javax.swing.JLabel lblNextSalary;
    private javax.swing.JLabel lblOffer;
    private javax.swing.JLabel lblOfferChampBonus;
    private javax.swing.JLabel lblOfferFinalSeason;
    private javax.swing.JLabel lblOfferRaceBonus;
    private javax.swing.JLabel lblOfferRoyalty;
    private javax.swing.JLabel lblOfferSalary;
    private javax.swing.JLabel lblOvertaking;
    private javax.swing.JLabel lblRaceBonus;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblSkill;
    private javax.swing.JLabel lblSpeed;
    private javax.swing.JLabel lblStamina;
    private javax.swing.JLabel lblWet;
    private javax.swing.JTable tblAllStaff;
    // End of variables declaration//GEN-END:variables
}
