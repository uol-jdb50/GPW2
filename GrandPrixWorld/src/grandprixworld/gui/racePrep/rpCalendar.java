/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gui.racePrep;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author Josh Brookes
 */
public class rpCalendar extends javax.swing.JPanel {

    /**
     * Creates new form rpCalendar
     */
    public rpCalendar() {
        initComponents();
        updateScreenData();
    }

    public void updateScreenData() {
        jTabbedPane1.setTitleAt(0, Integer.toString(grandprixworld.gui.FullGame.data.currentYear));
        jTabbedPane1.setTitleAt(1, Integer.toString(grandprixworld.gui.FullGame.data.currentYear + 1));
        //This Year's Calendar
        lblCYVenueR1.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(0).venue.shortName);
        lblCYVenueR2.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(1).venue.shortName);
        lblCYVenueR3.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(2).venue.shortName);
        lblCYVenueR4.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(3).venue.shortName);
        lblCYVenueR5.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(4).venue.shortName);
        lblCYVenueR6.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(5).venue.shortName);
        lblCYVenueR7.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(6).venue.shortName);
        lblCYVenueR8.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(7).venue.shortName);
        lblCYVenueR9.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(8).venue.shortName);
        lblCYVenueR10.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(9).venue.shortName);
        lblCYVenueR11.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(10).venue.shortName);
        lblCYVenueR12.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(11).venue.shortName);
        lblCYVenueR13.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(12).venue.shortName);
        lblCYVenueR14.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(13).venue.shortName);
        lblCYVenueR15.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(14).venue.shortName);
        lblCYVenueR16.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(15).venue.shortName);
        lblCYVenueR17.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(16).venue.shortName);
        lblCYVenueR18.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(17).venue.shortName);
        
        lblCYDateR1.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(0).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblCYDateR2.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(1).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblCYDateR3.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(2).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblCYDateR4.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(3).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblCYDateR5.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(4).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblCYDateR6.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(5).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblCYDateR7.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(6).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblCYDateR8.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(7).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblCYDateR9.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(8).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblCYDateR10.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(9).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblCYDateR11.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(10).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblCYDateR12.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(11).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblCYDateR13.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(12).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblCYDateR14.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(13).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblCYDateR15.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(14).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblCYDateR16.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(15).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblCYDateR17.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(16).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblCYDateR18.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(17).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        
        switch (grandprixworld.gui.FullGame.data.f1.findCalendarLength()) {
            case 18:
                lblCYR19.setVisible(false);
                lblCYVenueR19.setVisible(false);
                lblCYDateR19.setVisible(false);
                lblCYR20.setVisible(false);
                lblCYVenueR20.setVisible(false);
                lblCYDateR20.setVisible(false);
                lblCYR21.setVisible(false);
                lblCYVenueR21.setVisible(false);
                lblCYDateR21.setVisible(false);
                lblCYR22.setVisible(false);
                lblCYVenueR22.setVisible(false);
                lblCYDateR22.setVisible(false);
                lblCYR23.setVisible(false);
                lblCYVenueR23.setVisible(false);
                lblCYDateR23.setVisible(false);
                break;
            case 19:
                lblCYVenueR19.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(18).venue.shortName);
                lblCYDateR19.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(18).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblCYR19.setVisible(true);
                lblCYVenueR19.setVisible(true);
                lblCYDateR19.setVisible(true);
                lblCYR20.setVisible(false);
                lblCYVenueR20.setVisible(false);
                lblCYDateR20.setVisible(false);
                lblCYR21.setVisible(false);
                lblCYVenueR21.setVisible(false);
                lblCYDateR21.setVisible(false);
                lblCYR22.setVisible(false);
                lblCYVenueR22.setVisible(false);
                lblCYDateR22.setVisible(false);
                lblCYR23.setVisible(false);
                lblCYVenueR23.setVisible(false);
                lblCYDateR23.setVisible(false);
                break;
            case 20:
                lblCYVenueR19.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(18).venue.shortName);
                lblCYVenueR20.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(19).venue.shortName);
                lblCYDateR19.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(18).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblCYDateR20.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(19).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblCYR19.setVisible(true);
                lblCYVenueR19.setVisible(true);
                lblCYDateR19.setVisible(true);
                lblCYR20.setVisible(true);
                lblCYVenueR20.setVisible(true);
                lblCYDateR20.setVisible(true);
                lblCYR21.setVisible(false);
                lblCYVenueR21.setVisible(false);
                lblCYDateR21.setVisible(false);
                lblCYR22.setVisible(false);
                lblCYVenueR22.setVisible(false);
                lblCYDateR22.setVisible(false);
                lblCYR23.setVisible(false);
                lblCYVenueR23.setVisible(false);
                lblCYDateR23.setVisible(false);
                break;
            case 21:
                lblCYVenueR19.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(18).venue.shortName);
                lblCYVenueR20.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(19).venue.shortName);
                lblCYVenueR21.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(20).venue.shortName);
                lblCYDateR19.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(18).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblCYDateR20.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(19).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblCYDateR21.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(20).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblCYR19.setVisible(true);
                lblCYVenueR19.setVisible(true);
                lblCYDateR19.setVisible(true);
                lblCYR20.setVisible(true);
                lblCYVenueR20.setVisible(true);
                lblCYDateR20.setVisible(true);
                lblCYR21.setVisible(true);
                lblCYVenueR21.setVisible(true);
                lblCYDateR21.setVisible(true);
                lblCYR22.setVisible(false);
                lblCYVenueR22.setVisible(false);
                lblCYDateR22.setVisible(false);
                lblCYR23.setVisible(false);
                lblCYVenueR23.setVisible(false);
                lblCYDateR23.setVisible(false);
                break;
            case 22:
                lblCYVenueR19.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(18).venue.shortName);
                lblCYVenueR20.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(19).venue.shortName);
                lblCYVenueR21.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(20).venue.shortName);
                lblCYVenueR22.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(21).venue.shortName);
                lblCYDateR19.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(18).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblCYDateR20.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(19).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblCYDateR21.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(20).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblCYDateR22.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(21).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblCYR19.setVisible(true);
                lblCYVenueR19.setVisible(true);
                lblCYDateR19.setVisible(true);
                lblCYR20.setVisible(true);
                lblCYVenueR20.setVisible(true);
                lblCYDateR20.setVisible(true);
                lblCYR21.setVisible(true);
                lblCYVenueR21.setVisible(true);
                lblCYDateR21.setVisible(true);
                lblCYR22.setVisible(true);
                lblCYVenueR22.setVisible(true);
                lblCYDateR22.setVisible(true);
                lblCYR23.setVisible(false);
                lblCYVenueR23.setVisible(false);
                lblCYDateR23.setVisible(false);
                break;
            case 23:
                lblCYVenueR19.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(18).venue.shortName);
                lblCYVenueR20.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(19).venue.shortName);
                lblCYVenueR21.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(20).venue.shortName);
                lblCYVenueR22.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(21).venue.shortName);
                lblCYVenueR23.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(22).venue.shortName);
                lblCYDateR19.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(18).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblCYDateR20.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(19).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblCYDateR21.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(20).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblCYDateR22.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(21).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblCYDateR23.setText(grandprixworld.gui.FullGame.data.f1.calendar.get(22).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblCYR19.setVisible(true);
                lblCYVenueR19.setVisible(true);
                lblCYDateR19.setVisible(true);
                lblCYR20.setVisible(true);
                lblCYVenueR20.setVisible(true);
                lblCYDateR20.setVisible(true);
                lblCYR21.setVisible(true);
                lblCYVenueR21.setVisible(true);
                lblCYDateR21.setVisible(true);
                lblCYR22.setVisible(true);
                lblCYVenueR22.setVisible(true);
                lblCYDateR22.setVisible(true);
                lblCYR23.setVisible(true);
                lblCYVenueR23.setVisible(true);
                lblCYDateR23.setVisible(true);
                break;
            default:
                lblCYR19.setVisible(false);
                lblCYVenueR19.setVisible(false);
                lblCYDateR19.setVisible(false);
                lblCYR20.setVisible(false);
                lblCYVenueR20.setVisible(false);
                lblCYDateR20.setVisible(false);
                lblCYR21.setVisible(false);
                lblCYVenueR21.setVisible(false);
                lblCYDateR21.setVisible(false);
                lblCYR22.setVisible(false);
                lblCYVenueR22.setVisible(false);
                lblCYDateR22.setVisible(false);
                lblCYR23.setVisible(false);
                lblCYVenueR23.setVisible(false);
                lblCYDateR23.setVisible(false);
                break;
        }
        //Next Year's Calendar
        lblNYVenueR1.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(0).venue.shortName);
        lblNYVenueR2.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(1).venue.shortName);
        lblNYVenueR3.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(2).venue.shortName);
        lblNYVenueR4.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(3).venue.shortName);
        lblNYVenueR5.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(4).venue.shortName);
        lblNYVenueR6.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(5).venue.shortName);
        lblNYVenueR7.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(6).venue.shortName);
        lblNYVenueR8.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(7).venue.shortName);
        lblNYVenueR9.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(8).venue.shortName);
        lblNYVenueR10.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(9).venue.shortName);
        lblNYVenueR11.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(10).venue.shortName);
        lblNYVenueR12.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(11).venue.shortName);
        lblNYVenueR13.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(12).venue.shortName);
        lblNYVenueR14.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(13).venue.shortName);
        lblNYVenueR15.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(14).venue.shortName);
        lblNYVenueR16.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(15).venue.shortName);
        lblNYVenueR17.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(16).venue.shortName);
        lblNYVenueR18.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(17).venue.shortName);
        
        lblNYDateR1.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(0).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblNYDateR2.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(1).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblNYDateR3.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(2).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblNYDateR4.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(3).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblNYDateR5.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(4).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblNYDateR6.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(5).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblNYDateR7.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(6).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblNYDateR8.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(7).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblNYDateR9.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(8).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblNYDateR10.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(9).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblNYDateR11.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(10).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblNYDateR12.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(11).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblNYDateR13.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(12).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblNYDateR14.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(13).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblNYDateR15.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(14).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblNYDateR16.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(15).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblNYDateR17.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(16).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        lblNYDateR18.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(17).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
        switch (grandprixworld.gui.FullGame.data.nextYearCalendar.size()) {
            case 18:
                lblNYR19.setVisible(false);
                lblNYVenueR19.setVisible(false);
                lblNYDateR19.setVisible(false);
                lblNYR20.setVisible(false);
                lblNYVenueR20.setVisible(false);
                lblNYDateR20.setVisible(false);
                lblNYR21.setVisible(false);
                lblNYVenueR21.setVisible(false);
                lblNYDateR21.setVisible(false);
                lblNYR22.setVisible(false);
                lblNYVenueR22.setVisible(false);
                lblNYDateR22.setVisible(false);
                lblNYR23.setVisible(false);
                lblNYVenueR23.setVisible(false);
                lblNYDateR23.setVisible(false);
                break;
            case 19:
                lblNYVenueR19.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(18).venue.shortName);
                lblNYDateR19.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(18).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblNYR19.setVisible(true);
                lblNYVenueR19.setVisible(true);
                lblNYDateR19.setVisible(true);
                lblNYR20.setVisible(false);
                lblNYVenueR20.setVisible(false);
                lblNYDateR20.setVisible(false);
                lblNYR21.setVisible(false);
                lblNYVenueR21.setVisible(false);
                lblNYDateR21.setVisible(false);
                lblNYR22.setVisible(false);
                lblNYVenueR22.setVisible(false);
                lblNYDateR22.setVisible(false);
                lblNYR23.setVisible(false);
                lblNYVenueR23.setVisible(false);
                lblNYDateR23.setVisible(false);
                break;
            case 20:
                lblNYVenueR19.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(18).venue.shortName);
                lblNYVenueR20.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(19).venue.shortName);
                lblNYDateR19.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(18).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblNYDateR20.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(19).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblNYR19.setVisible(true);
                lblNYVenueR19.setVisible(true);
                lblNYDateR19.setVisible(true);
                lblNYR20.setVisible(true);
                lblNYVenueR20.setVisible(true);
                lblNYDateR20.setVisible(true);
                lblNYR21.setVisible(false);
                lblNYVenueR21.setVisible(false);
                lblNYDateR21.setVisible(false);
                lblNYR22.setVisible(false);
                lblNYVenueR22.setVisible(false);
                lblNYDateR22.setVisible(false);
                lblNYR23.setVisible(false);
                lblNYVenueR23.setVisible(false);
                lblNYDateR23.setVisible(false);
                break;
            case 21:
                lblNYVenueR19.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(18).venue.shortName);
                lblNYVenueR20.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(19).venue.shortName);
                lblNYVenueR21.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(20).venue.shortName);
                lblNYDateR19.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(18).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblNYDateR20.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(19).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblNYDateR21.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(20).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblNYR19.setVisible(true);
                lblNYVenueR19.setVisible(true);
                lblNYDateR19.setVisible(true);
                lblNYR20.setVisible(true);
                lblNYVenueR20.setVisible(true);
                lblNYDateR20.setVisible(true);
                lblNYR21.setVisible(true);
                lblNYVenueR21.setVisible(true);
                lblNYDateR21.setVisible(true);
                lblNYR22.setVisible(false);
                lblNYVenueR22.setVisible(false);
                lblNYDateR22.setVisible(false);
                lblNYR23.setVisible(false);
                lblNYVenueR23.setVisible(false);
                lblNYDateR23.setVisible(false);
                break;
            case 22:
                lblNYVenueR19.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(18).venue.shortName);
                lblNYVenueR20.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(19).venue.shortName);
                lblNYVenueR21.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(20).venue.shortName);
                lblNYVenueR22.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(21).venue.shortName);
                lblNYDateR19.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(18).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblNYDateR20.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(19).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblNYDateR21.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(20).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblNYDateR22.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(21).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblNYR19.setVisible(true);
                lblNYVenueR19.setVisible(true);
                lblNYDateR19.setVisible(true);
                lblNYR20.setVisible(true);
                lblNYVenueR20.setVisible(true);
                lblNYDateR20.setVisible(true);
                lblNYR21.setVisible(true);
                lblNYVenueR21.setVisible(true);
                lblNYDateR21.setVisible(true);
                lblNYR22.setVisible(true);
                lblNYVenueR22.setVisible(true);
                lblNYDateR22.setVisible(true);
                lblNYR23.setVisible(false);
                lblNYVenueR23.setVisible(false);
                lblNYDateR23.setVisible(false);
                break;
            case 23:
                lblNYVenueR19.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(18).venue.shortName);
                lblNYVenueR20.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(19).venue.shortName);
                lblNYVenueR21.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(20).venue.shortName);
                lblNYVenueR22.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(21).venue.shortName);
                lblNYVenueR23.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(22).venue.shortName);
                lblNYDateR19.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(18).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblNYDateR20.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(19).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblNYDateR21.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(20).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblNYDateR22.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(21).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblNYDateR23.setText(grandprixworld.gui.FullGame.data.nextYearCalendar.get(22).eventStart.plusDays(2).format(DateTimeFormatter.ofPattern("d MMM yyyy")));
                lblNYR19.setVisible(true);
                lblNYVenueR19.setVisible(true);
                lblNYDateR19.setVisible(true);
                lblNYR20.setVisible(true);
                lblNYVenueR20.setVisible(true);
                lblNYDateR20.setVisible(true);
                lblNYR21.setVisible(true);
                lblNYVenueR21.setVisible(true);
                lblNYDateR21.setVisible(true);
                lblNYR22.setVisible(true);
                lblNYVenueR22.setVisible(true);
                lblNYDateR22.setVisible(true);
                lblNYR23.setVisible(true);
                lblNYVenueR23.setVisible(true);
                lblNYDateR23.setVisible(true);
                break;
            default:
                lblNYR19.setVisible(false);
                lblNYVenueR19.setVisible(false);
                lblNYDateR19.setVisible(false);
                lblNYR20.setVisible(false);
                lblNYVenueR20.setVisible(false);
                lblNYDateR20.setVisible(false);
                lblNYR21.setVisible(false);
                lblNYVenueR21.setVisible(false);
                lblNYDateR21.setVisible(false);
                lblNYR22.setVisible(false);
                lblNYVenueR22.setVisible(false);
                lblNYDateR22.setVisible(false);
                lblNYR23.setVisible(false);
                lblNYVenueR23.setVisible(false);
                lblNYDateR23.setVisible(false);
                break;
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlCurrentYear = new javax.swing.JPanel();
        lblCYR1 = new javax.swing.JLabel();
        lblCYVenueR1 = new javax.swing.JLabel();
        lblCYDateR1 = new javax.swing.JLabel();
        lblCYR13 = new javax.swing.JLabel();
        lblCYVenueR13 = new javax.swing.JLabel();
        lblCYDateR13 = new javax.swing.JLabel();
        lblCYR2 = new javax.swing.JLabel();
        lblCYVenueR2 = new javax.swing.JLabel();
        lblCYDateR2 = new javax.swing.JLabel();
        lblCYR14 = new javax.swing.JLabel();
        lblCYVenueR14 = new javax.swing.JLabel();
        lblCYDateR14 = new javax.swing.JLabel();
        lblCYVenueR15 = new javax.swing.JLabel();
        lblCYDateR15 = new javax.swing.JLabel();
        lblCYVenueR3 = new javax.swing.JLabel();
        lblCYR3 = new javax.swing.JLabel();
        lblCYDateR3 = new javax.swing.JLabel();
        lblCYR15 = new javax.swing.JLabel();
        lblCYVenueR16 = new javax.swing.JLabel();
        lblCYR4 = new javax.swing.JLabel();
        lblCYDateR4 = new javax.swing.JLabel();
        lblCYR16 = new javax.swing.JLabel();
        lblCYDateR16 = new javax.swing.JLabel();
        lblCYVenueR4 = new javax.swing.JLabel();
        lblCYR5 = new javax.swing.JLabel();
        lblCYR17 = new javax.swing.JLabel();
        lblCYDateR5 = new javax.swing.JLabel();
        lblCYVenueR17 = new javax.swing.JLabel();
        lblCYVenueR5 = new javax.swing.JLabel();
        lblCYDateR17 = new javax.swing.JLabel();
        lblCYVenueR18 = new javax.swing.JLabel();
        lblCYR6 = new javax.swing.JLabel();
        lblCYDateR6 = new javax.swing.JLabel();
        lblCYVenueR6 = new javax.swing.JLabel();
        lblCYR18 = new javax.swing.JLabel();
        lblCYDateR18 = new javax.swing.JLabel();
        lblCYVenueR19 = new javax.swing.JLabel();
        lblCYDateR19 = new javax.swing.JLabel();
        lblCYR19 = new javax.swing.JLabel();
        lblCYDateR7 = new javax.swing.JLabel();
        lblCYVenueR7 = new javax.swing.JLabel();
        lblCYR7 = new javax.swing.JLabel();
        lblCYDateR20 = new javax.swing.JLabel();
        lblCYDateR8 = new javax.swing.JLabel();
        lblCYR20 = new javax.swing.JLabel();
        lblCYR8 = new javax.swing.JLabel();
        lblCYVenueR20 = new javax.swing.JLabel();
        lblCYVenueR8 = new javax.swing.JLabel();
        lblCYVenueR21 = new javax.swing.JLabel();
        lblCYVenueR9 = new javax.swing.JLabel();
        lblCYDateR21 = new javax.swing.JLabel();
        lblCYR21 = new javax.swing.JLabel();
        lblCYDateR9 = new javax.swing.JLabel();
        lblCYR9 = new javax.swing.JLabel();
        lblCYVenueR22 = new javax.swing.JLabel();
        lblCYDateR22 = new javax.swing.JLabel();
        lblCYR22 = new javax.swing.JLabel();
        lblCYDateR10 = new javax.swing.JLabel();
        lblCYVenueR10 = new javax.swing.JLabel();
        lblCYR10 = new javax.swing.JLabel();
        lblCYDateR11 = new javax.swing.JLabel();
        lblCYVenueR11 = new javax.swing.JLabel();
        lblCYVenueR23 = new javax.swing.JLabel();
        lblCYR11 = new javax.swing.JLabel();
        lblCYR23 = new javax.swing.JLabel();
        lblCYDateR23 = new javax.swing.JLabel();
        lblCYVenueR12 = new javax.swing.JLabel();
        lblCYDateR12 = new javax.swing.JLabel();
        lblCYR12 = new javax.swing.JLabel();
        pnlNextYear = new javax.swing.JPanel();
        lblNYR1 = new javax.swing.JLabel();
        lblNYVenueR1 = new javax.swing.JLabel();
        lblNYDateR1 = new javax.swing.JLabel();
        lblNYR13 = new javax.swing.JLabel();
        lblNYVenueR13 = new javax.swing.JLabel();
        lblNYDateR13 = new javax.swing.JLabel();
        lblNYR2 = new javax.swing.JLabel();
        lblNYVenueR2 = new javax.swing.JLabel();
        lblNYDateR2 = new javax.swing.JLabel();
        lblNYR14 = new javax.swing.JLabel();
        lblNYVenueR14 = new javax.swing.JLabel();
        lblNYDateR14 = new javax.swing.JLabel();
        lblNYVenueR15 = new javax.swing.JLabel();
        lblNYDateR15 = new javax.swing.JLabel();
        lblNYVenueR3 = new javax.swing.JLabel();
        lblNYR3 = new javax.swing.JLabel();
        lblNYDateR3 = new javax.swing.JLabel();
        lblNYR15 = new javax.swing.JLabel();
        lblNYVenueR16 = new javax.swing.JLabel();
        lblNYR4 = new javax.swing.JLabel();
        lblNYDateR4 = new javax.swing.JLabel();
        lblNYR16 = new javax.swing.JLabel();
        lblNYDateR16 = new javax.swing.JLabel();
        lblNYVenueR4 = new javax.swing.JLabel();
        lblNYR5 = new javax.swing.JLabel();
        lblNYR17 = new javax.swing.JLabel();
        lblNYDateR5 = new javax.swing.JLabel();
        lblNYVenueR17 = new javax.swing.JLabel();
        lblNYVenueR5 = new javax.swing.JLabel();
        lblNYDateR17 = new javax.swing.JLabel();
        lblNYVenueR18 = new javax.swing.JLabel();
        lblNYR6 = new javax.swing.JLabel();
        lblNYDateR6 = new javax.swing.JLabel();
        lblNYVenueR6 = new javax.swing.JLabel();
        lblNYR18 = new javax.swing.JLabel();
        lblNYDateR18 = new javax.swing.JLabel();
        lblNYVenueR19 = new javax.swing.JLabel();
        lblNYDateR19 = new javax.swing.JLabel();
        lblNYR19 = new javax.swing.JLabel();
        lblNYDateR7 = new javax.swing.JLabel();
        lblNYVenueR7 = new javax.swing.JLabel();
        lblNYR7 = new javax.swing.JLabel();
        lblNYDateR20 = new javax.swing.JLabel();
        lblNYDateR8 = new javax.swing.JLabel();
        lblNYR20 = new javax.swing.JLabel();
        lblNYR8 = new javax.swing.JLabel();
        lblNYVenueR20 = new javax.swing.JLabel();
        lblNYVenueR8 = new javax.swing.JLabel();
        lblNYVenueR21 = new javax.swing.JLabel();
        lblNYVenueR9 = new javax.swing.JLabel();
        lblNYDateR21 = new javax.swing.JLabel();
        lblNYR21 = new javax.swing.JLabel();
        lblNYDateR9 = new javax.swing.JLabel();
        lblNYR9 = new javax.swing.JLabel();
        lblNYVenueR22 = new javax.swing.JLabel();
        lblNYDateR22 = new javax.swing.JLabel();
        lblNYR22 = new javax.swing.JLabel();
        lblNYDateR10 = new javax.swing.JLabel();
        lblNYVenueR10 = new javax.swing.JLabel();
        lblNYR10 = new javax.swing.JLabel();
        lblNYDateR11 = new javax.swing.JLabel();
        lblNYVenueR11 = new javax.swing.JLabel();
        lblNYVenueR23 = new javax.swing.JLabel();
        lblNYR11 = new javax.swing.JLabel();
        lblNYR23 = new javax.swing.JLabel();
        lblNYDateR23 = new javax.swing.JLabel();
        lblNYVenueR12 = new javax.swing.JLabel();
        lblNYDateR12 = new javax.swing.JLabel();
        lblNYR12 = new javax.swing.JLabel();

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

        pnlCurrentYear.setBackground(new java.awt.Color(88, 103, 108));
        pnlCurrentYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        lblCYR1.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR1.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR1.setText("Round 1");
        lblCYR1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR1.setOpaque(true);

        lblCYVenueR1.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR1.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR1.setText(" ");
        lblCYVenueR1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR1.setOpaque(true);

        lblCYDateR1.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR1.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR1.setText(" ");
        lblCYDateR1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR1.setOpaque(true);

        lblCYR13.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR13.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR13.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR13.setText("Round 13");
        lblCYR13.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR13.setOpaque(true);

        lblCYVenueR13.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR13.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR13.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR13.setText(" ");
        lblCYVenueR13.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR13.setOpaque(true);

        lblCYDateR13.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR13.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR13.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR13.setText(" ");
        lblCYDateR13.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR13.setOpaque(true);

        lblCYR2.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR2.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR2.setText("Round 2");
        lblCYR2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR2.setOpaque(true);

        lblCYVenueR2.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR2.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR2.setText(" ");
        lblCYVenueR2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR2.setOpaque(true);

        lblCYDateR2.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR2.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR2.setText(" ");
        lblCYDateR2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR2.setOpaque(true);

        lblCYR14.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR14.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR14.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR14.setText("Round 14");
        lblCYR14.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR14.setOpaque(true);

        lblCYVenueR14.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR14.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR14.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR14.setText(" ");
        lblCYVenueR14.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR14.setOpaque(true);

        lblCYDateR14.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR14.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR14.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR14.setText(" ");
        lblCYDateR14.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR14.setOpaque(true);

        lblCYVenueR15.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR15.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR15.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR15.setText(" ");
        lblCYVenueR15.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR15.setOpaque(true);

        lblCYDateR15.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR15.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR15.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR15.setText(" ");
        lblCYDateR15.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR15.setOpaque(true);

        lblCYVenueR3.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR3.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR3.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR3.setText(" ");
        lblCYVenueR3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR3.setOpaque(true);

        lblCYR3.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR3.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR3.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR3.setText("Round 3");
        lblCYR3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR3.setOpaque(true);

        lblCYDateR3.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR3.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR3.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR3.setText(" ");
        lblCYDateR3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR3.setOpaque(true);

        lblCYR15.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR15.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR15.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR15.setText("Round 15");
        lblCYR15.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR15.setOpaque(true);

        lblCYVenueR16.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR16.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR16.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR16.setText(" ");
        lblCYVenueR16.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR16.setOpaque(true);

        lblCYR4.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR4.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR4.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR4.setText("Round 4");
        lblCYR4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR4.setOpaque(true);

        lblCYDateR4.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR4.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR4.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR4.setText(" ");
        lblCYDateR4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR4.setOpaque(true);

        lblCYR16.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR16.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR16.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR16.setText("Round 16");
        lblCYR16.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR16.setOpaque(true);

        lblCYDateR16.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR16.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR16.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR16.setText(" ");
        lblCYDateR16.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR16.setOpaque(true);

        lblCYVenueR4.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR4.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR4.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR4.setText(" ");
        lblCYVenueR4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR4.setOpaque(true);

        lblCYR5.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR5.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR5.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR5.setText("Round 5");
        lblCYR5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR5.setOpaque(true);

        lblCYR17.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR17.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR17.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR17.setText("Round 17");
        lblCYR17.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR17.setOpaque(true);

        lblCYDateR5.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR5.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR5.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR5.setText(" ");
        lblCYDateR5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR5.setOpaque(true);

        lblCYVenueR17.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR17.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR17.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR17.setText(" ");
        lblCYVenueR17.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR17.setOpaque(true);

        lblCYVenueR5.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR5.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR5.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR5.setText(" ");
        lblCYVenueR5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR5.setOpaque(true);

        lblCYDateR17.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR17.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR17.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR17.setText(" ");
        lblCYDateR17.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR17.setOpaque(true);

        lblCYVenueR18.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR18.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR18.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR18.setText(" ");
        lblCYVenueR18.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR18.setOpaque(true);

        lblCYR6.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR6.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR6.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR6.setText("Round 6");
        lblCYR6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR6.setOpaque(true);

        lblCYDateR6.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR6.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR6.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR6.setText(" ");
        lblCYDateR6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR6.setOpaque(true);

        lblCYVenueR6.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR6.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR6.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR6.setText(" ");
        lblCYVenueR6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR6.setOpaque(true);

        lblCYR18.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR18.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR18.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR18.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR18.setText("Round 18");
        lblCYR18.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR18.setOpaque(true);

        lblCYDateR18.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR18.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR18.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR18.setText(" ");
        lblCYDateR18.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR18.setOpaque(true);

        lblCYVenueR19.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR19.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR19.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR19.setText(" ");
        lblCYVenueR19.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR19.setOpaque(true);

        lblCYDateR19.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR19.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR19.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR19.setText(" ");
        lblCYDateR19.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR19.setOpaque(true);

        lblCYR19.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR19.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR19.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR19.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR19.setText("Round 19");
        lblCYR19.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR19.setOpaque(true);

        lblCYDateR7.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR7.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR7.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR7.setText(" ");
        lblCYDateR7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR7.setOpaque(true);

        lblCYVenueR7.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR7.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR7.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR7.setText(" ");
        lblCYVenueR7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR7.setOpaque(true);

        lblCYR7.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR7.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR7.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR7.setText("Round 7");
        lblCYR7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR7.setOpaque(true);

        lblCYDateR20.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR20.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR20.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR20.setText(" ");
        lblCYDateR20.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR20.setOpaque(true);

        lblCYDateR8.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR8.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR8.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR8.setText(" ");
        lblCYDateR8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR8.setOpaque(true);

        lblCYR20.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR20.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR20.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR20.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR20.setText("Round 20");
        lblCYR20.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR20.setOpaque(true);

        lblCYR8.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR8.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR8.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR8.setText("Round 8");
        lblCYR8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR8.setOpaque(true);

        lblCYVenueR20.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR20.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR20.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR20.setText(" ");
        lblCYVenueR20.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR20.setOpaque(true);

        lblCYVenueR8.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR8.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR8.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR8.setText(" ");
        lblCYVenueR8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR8.setOpaque(true);

        lblCYVenueR21.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR21.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR21.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR21.setText(" ");
        lblCYVenueR21.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR21.setOpaque(true);

        lblCYVenueR9.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR9.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR9.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR9.setText(" ");
        lblCYVenueR9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR9.setOpaque(true);

        lblCYDateR21.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR21.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR21.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR21.setText(" ");
        lblCYDateR21.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR21.setOpaque(true);

        lblCYR21.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR21.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR21.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR21.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR21.setText("Round 21");
        lblCYR21.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR21.setOpaque(true);

        lblCYDateR9.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR9.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR9.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR9.setText(" ");
        lblCYDateR9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR9.setOpaque(true);

        lblCYR9.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR9.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR9.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR9.setText("Round 9");
        lblCYR9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR9.setOpaque(true);

        lblCYVenueR22.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR22.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR22.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR22.setText(" ");
        lblCYVenueR22.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR22.setOpaque(true);

        lblCYDateR22.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR22.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR22.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR22.setText(" ");
        lblCYDateR22.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR22.setOpaque(true);

        lblCYR22.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR22.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR22.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR22.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR22.setText("Round 22");
        lblCYR22.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR22.setOpaque(true);

        lblCYDateR10.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR10.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR10.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR10.setText(" ");
        lblCYDateR10.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR10.setOpaque(true);

        lblCYVenueR10.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR10.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR10.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR10.setText(" ");
        lblCYVenueR10.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR10.setOpaque(true);

        lblCYR10.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR10.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR10.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR10.setText("Round 10");
        lblCYR10.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR10.setOpaque(true);

        lblCYDateR11.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR11.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR11.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR11.setText(" ");
        lblCYDateR11.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR11.setOpaque(true);

        lblCYVenueR11.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR11.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR11.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR11.setText(" ");
        lblCYVenueR11.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR11.setOpaque(true);

        lblCYVenueR23.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR23.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR23.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR23.setText(" ");
        lblCYVenueR23.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR23.setOpaque(true);

        lblCYR11.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR11.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR11.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR11.setText("Round 11");
        lblCYR11.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR11.setOpaque(true);

        lblCYR23.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR23.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR23.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR23.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR23.setText("Round 23");
        lblCYR23.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR23.setOpaque(true);

        lblCYDateR23.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR23.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR23.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR23.setText(" ");
        lblCYDateR23.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR23.setOpaque(true);

        lblCYVenueR12.setBackground(new java.awt.Color(113, 132, 137));
        lblCYVenueR12.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYVenueR12.setForeground(new java.awt.Color(255, 255, 255));
        lblCYVenueR12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYVenueR12.setText(" ");
        lblCYVenueR12.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYVenueR12.setOpaque(true);

        lblCYDateR12.setBackground(new java.awt.Color(113, 132, 137));
        lblCYDateR12.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYDateR12.setForeground(new java.awt.Color(255, 255, 255));
        lblCYDateR12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCYDateR12.setText(" ");
        lblCYDateR12.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYDateR12.setOpaque(true);

        lblCYR12.setBackground(new java.awt.Color(113, 132, 137));
        lblCYR12.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblCYR12.setForeground(new java.awt.Color(255, 255, 255));
        lblCYR12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCYR12.setText("Round 12");
        lblCYR12.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblCYR12.setOpaque(true);

        javax.swing.GroupLayout pnlCurrentYearLayout = new javax.swing.GroupLayout(pnlCurrentYear);
        pnlCurrentYear.setLayout(pnlCurrentYearLayout);
        pnlCurrentYearLayout.setHorizontalGroup(
            pnlCurrentYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCurrentYearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCurrentYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCurrentYearLayout.createSequentialGroup()
                        .addComponent(lblCYR1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCYR13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR13, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR13, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCurrentYearLayout.createSequentialGroup()
                        .addComponent(lblCYR2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCYR14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR14, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR14, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCurrentYearLayout.createSequentialGroup()
                        .addComponent(lblCYR3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCYR15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR15, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR15, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCurrentYearLayout.createSequentialGroup()
                        .addComponent(lblCYR4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCYR16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR16, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR16, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCurrentYearLayout.createSequentialGroup()
                        .addComponent(lblCYR5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCYR17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR17, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR17, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCurrentYearLayout.createSequentialGroup()
                        .addComponent(lblCYR6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCYR18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR18, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR18, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCurrentYearLayout.createSequentialGroup()
                        .addComponent(lblCYR7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR7, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCYR19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR19, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR19, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCurrentYearLayout.createSequentialGroup()
                        .addComponent(lblCYR8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR8, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCYR20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR20, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR20, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCurrentYearLayout.createSequentialGroup()
                        .addComponent(lblCYR9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR9, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCYR21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR21, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR21, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCurrentYearLayout.createSequentialGroup()
                        .addComponent(lblCYR10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR10, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR10, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCYR22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR22, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR22, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCurrentYearLayout.createSequentialGroup()
                        .addComponent(lblCYR11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR11, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR11, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCYR23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR23, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR23, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCurrentYearLayout.createSequentialGroup()
                        .addComponent(lblCYR12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYVenueR12, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCYDateR12, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlCurrentYearLayout.setVerticalGroup(
            pnlCurrentYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCurrentYearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCurrentYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCYR1)
                    .addComponent(lblCYVenueR1)
                    .addComponent(lblCYDateR1)
                    .addComponent(lblCYR13)
                    .addComponent(lblCYVenueR13)
                    .addComponent(lblCYDateR13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCurrentYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCYR2)
                    .addComponent(lblCYVenueR2)
                    .addComponent(lblCYDateR2)
                    .addComponent(lblCYR14)
                    .addComponent(lblCYVenueR14)
                    .addComponent(lblCYDateR14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCurrentYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCYR3)
                    .addComponent(lblCYVenueR3)
                    .addComponent(lblCYDateR3)
                    .addComponent(lblCYR15)
                    .addComponent(lblCYVenueR15)
                    .addComponent(lblCYDateR15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCurrentYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCYR4)
                    .addComponent(lblCYVenueR4)
                    .addComponent(lblCYDateR4)
                    .addComponent(lblCYR16)
                    .addComponent(lblCYVenueR16)
                    .addComponent(lblCYDateR16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCurrentYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCYR5)
                    .addComponent(lblCYVenueR5)
                    .addComponent(lblCYDateR5)
                    .addComponent(lblCYR17)
                    .addComponent(lblCYVenueR17)
                    .addComponent(lblCYDateR17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCurrentYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCYR6)
                    .addComponent(lblCYVenueR6)
                    .addComponent(lblCYDateR6)
                    .addComponent(lblCYR18)
                    .addComponent(lblCYVenueR18)
                    .addComponent(lblCYDateR18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCurrentYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCYR7)
                    .addComponent(lblCYVenueR7)
                    .addComponent(lblCYDateR7)
                    .addComponent(lblCYR19)
                    .addComponent(lblCYVenueR19)
                    .addComponent(lblCYDateR19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCurrentYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCYR8)
                    .addComponent(lblCYVenueR8)
                    .addComponent(lblCYDateR8)
                    .addComponent(lblCYR20)
                    .addComponent(lblCYVenueR20)
                    .addComponent(lblCYDateR20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCurrentYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCYR9)
                    .addComponent(lblCYVenueR9)
                    .addComponent(lblCYDateR9)
                    .addComponent(lblCYR21)
                    .addComponent(lblCYVenueR21)
                    .addComponent(lblCYDateR21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCurrentYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCYR10)
                    .addComponent(lblCYVenueR10)
                    .addComponent(lblCYDateR10)
                    .addComponent(lblCYR22)
                    .addComponent(lblCYVenueR22)
                    .addComponent(lblCYDateR22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCurrentYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCYR11)
                    .addComponent(lblCYVenueR11)
                    .addComponent(lblCYDateR11)
                    .addComponent(lblCYR23)
                    .addComponent(lblCYVenueR23)
                    .addComponent(lblCYDateR23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCurrentYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCYR12)
                    .addComponent(lblCYVenueR12)
                    .addComponent(lblCYDateR12))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(Integer.toString(grandprixworld.gui.FullGame.data.currentYear), pnlCurrentYear);

        pnlNextYear.setBackground(new java.awt.Color(88, 103, 108));
        pnlNextYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));

        lblNYR1.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR1.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR1.setText("Round 1");
        lblNYR1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR1.setOpaque(true);

        lblNYVenueR1.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR1.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR1.setText(" ");
        lblNYVenueR1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR1.setOpaque(true);

        lblNYDateR1.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR1.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR1.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR1.setText(" ");
        lblNYDateR1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR1.setOpaque(true);

        lblNYR13.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR13.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR13.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR13.setText("Round 13");
        lblNYR13.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR13.setOpaque(true);

        lblNYVenueR13.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR13.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR13.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR13.setText(" ");
        lblNYVenueR13.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR13.setOpaque(true);

        lblNYDateR13.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR13.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR13.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR13.setText(" ");
        lblNYDateR13.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR13.setOpaque(true);

        lblNYR2.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR2.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR2.setText("Round 2");
        lblNYR2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR2.setOpaque(true);

        lblNYVenueR2.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR2.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR2.setText(" ");
        lblNYVenueR2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR2.setOpaque(true);

        lblNYDateR2.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR2.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR2.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR2.setText(" ");
        lblNYDateR2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR2.setOpaque(true);

        lblNYR14.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR14.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR14.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR14.setText("Round 14");
        lblNYR14.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR14.setOpaque(true);

        lblNYVenueR14.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR14.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR14.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR14.setText(" ");
        lblNYVenueR14.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR14.setOpaque(true);

        lblNYDateR14.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR14.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR14.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR14.setText(" ");
        lblNYDateR14.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR14.setOpaque(true);

        lblNYVenueR15.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR15.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR15.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR15.setText(" ");
        lblNYVenueR15.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR15.setOpaque(true);

        lblNYDateR15.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR15.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR15.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR15.setText(" ");
        lblNYDateR15.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR15.setOpaque(true);

        lblNYVenueR3.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR3.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR3.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR3.setText(" ");
        lblNYVenueR3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR3.setOpaque(true);

        lblNYR3.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR3.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR3.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR3.setText("Round 3");
        lblNYR3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR3.setOpaque(true);

        lblNYDateR3.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR3.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR3.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR3.setText(" ");
        lblNYDateR3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR3.setOpaque(true);

        lblNYR15.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR15.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR15.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR15.setText("Round 15");
        lblNYR15.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR15.setOpaque(true);

        lblNYVenueR16.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR16.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR16.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR16.setText(" ");
        lblNYVenueR16.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR16.setOpaque(true);

        lblNYR4.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR4.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR4.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR4.setText("Round 4");
        lblNYR4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR4.setOpaque(true);

        lblNYDateR4.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR4.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR4.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR4.setText(" ");
        lblNYDateR4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR4.setOpaque(true);

        lblNYR16.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR16.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR16.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR16.setText("Round 16");
        lblNYR16.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR16.setOpaque(true);

        lblNYDateR16.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR16.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR16.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR16.setText(" ");
        lblNYDateR16.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR16.setOpaque(true);

        lblNYVenueR4.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR4.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR4.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR4.setText(" ");
        lblNYVenueR4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR4.setOpaque(true);

        lblNYR5.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR5.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR5.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR5.setText("Round 5");
        lblNYR5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR5.setOpaque(true);

        lblNYR17.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR17.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR17.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR17.setText("Round 17");
        lblNYR17.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR17.setOpaque(true);

        lblNYDateR5.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR5.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR5.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR5.setText(" ");
        lblNYDateR5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR5.setOpaque(true);

        lblNYVenueR17.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR17.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR17.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR17.setText(" ");
        lblNYVenueR17.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR17.setOpaque(true);

        lblNYVenueR5.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR5.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR5.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR5.setText(" ");
        lblNYVenueR5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR5.setOpaque(true);

        lblNYDateR17.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR17.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR17.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR17.setText(" ");
        lblNYDateR17.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR17.setOpaque(true);

        lblNYVenueR18.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR18.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR18.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR18.setText(" ");
        lblNYVenueR18.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR18.setOpaque(true);

        lblNYR6.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR6.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR6.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR6.setText("Round 6");
        lblNYR6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR6.setOpaque(true);

        lblNYDateR6.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR6.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR6.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR6.setText(" ");
        lblNYDateR6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR6.setOpaque(true);

        lblNYVenueR6.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR6.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR6.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR6.setText(" ");
        lblNYVenueR6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR6.setOpaque(true);

        lblNYR18.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR18.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR18.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR18.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR18.setText("Round 18");
        lblNYR18.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR18.setOpaque(true);

        lblNYDateR18.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR18.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR18.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR18.setText(" ");
        lblNYDateR18.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR18.setOpaque(true);

        lblNYVenueR19.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR19.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR19.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR19.setText(" ");
        lblNYVenueR19.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR19.setOpaque(true);

        lblNYDateR19.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR19.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR19.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR19.setText(" ");
        lblNYDateR19.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR19.setOpaque(true);

        lblNYR19.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR19.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR19.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR19.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR19.setText("Round 19");
        lblNYR19.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR19.setOpaque(true);

        lblNYDateR7.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR7.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR7.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR7.setText(" ");
        lblNYDateR7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR7.setOpaque(true);

        lblNYVenueR7.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR7.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR7.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR7.setText(" ");
        lblNYVenueR7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR7.setOpaque(true);

        lblNYR7.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR7.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR7.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR7.setText("Round 7");
        lblNYR7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR7.setOpaque(true);

        lblNYDateR20.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR20.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR20.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR20.setText(" ");
        lblNYDateR20.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR20.setOpaque(true);

        lblNYDateR8.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR8.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR8.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR8.setText(" ");
        lblNYDateR8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR8.setOpaque(true);

        lblNYR20.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR20.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR20.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR20.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR20.setText("Round 20");
        lblNYR20.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR20.setOpaque(true);

        lblNYR8.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR8.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR8.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR8.setText("Round 8");
        lblNYR8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR8.setOpaque(true);

        lblNYVenueR20.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR20.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR20.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR20.setText(" ");
        lblNYVenueR20.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR20.setOpaque(true);

        lblNYVenueR8.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR8.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR8.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR8.setText(" ");
        lblNYVenueR8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR8.setOpaque(true);

        lblNYVenueR21.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR21.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR21.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR21.setText(" ");
        lblNYVenueR21.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR21.setOpaque(true);

        lblNYVenueR9.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR9.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR9.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR9.setText(" ");
        lblNYVenueR9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR9.setOpaque(true);

        lblNYDateR21.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR21.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR21.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR21.setText(" ");
        lblNYDateR21.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR21.setOpaque(true);

        lblNYR21.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR21.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR21.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR21.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR21.setText("Round 21");
        lblNYR21.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR21.setOpaque(true);

        lblNYDateR9.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR9.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR9.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR9.setText(" ");
        lblNYDateR9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR9.setOpaque(true);

        lblNYR9.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR9.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR9.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR9.setText("Round 9");
        lblNYR9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR9.setOpaque(true);

        lblNYVenueR22.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR22.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR22.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR22.setText(" ");
        lblNYVenueR22.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR22.setOpaque(true);

        lblNYDateR22.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR22.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR22.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR22.setText(" ");
        lblNYDateR22.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR22.setOpaque(true);

        lblNYR22.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR22.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR22.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR22.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR22.setText("Round 22");
        lblNYR22.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR22.setOpaque(true);

        lblNYDateR10.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR10.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR10.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR10.setText(" ");
        lblNYDateR10.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR10.setOpaque(true);

        lblNYVenueR10.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR10.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR10.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR10.setText(" ");
        lblNYVenueR10.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR10.setOpaque(true);

        lblNYR10.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR10.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR10.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR10.setText("Round 10");
        lblNYR10.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR10.setOpaque(true);

        lblNYDateR11.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR11.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR11.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR11.setText(" ");
        lblNYDateR11.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR11.setOpaque(true);

        lblNYVenueR11.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR11.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR11.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR11.setText(" ");
        lblNYVenueR11.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR11.setOpaque(true);

        lblNYVenueR23.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR23.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR23.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR23.setText(" ");
        lblNYVenueR23.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR23.setOpaque(true);

        lblNYR11.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR11.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR11.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR11.setText("Round 11");
        lblNYR11.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR11.setOpaque(true);

        lblNYR23.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR23.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR23.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR23.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR23.setText("Round 23");
        lblNYR23.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR23.setOpaque(true);

        lblNYDateR23.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR23.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR23.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR23.setText(" ");
        lblNYDateR23.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR23.setOpaque(true);

        lblNYVenueR12.setBackground(new java.awt.Color(113, 132, 137));
        lblNYVenueR12.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYVenueR12.setForeground(new java.awt.Color(255, 255, 255));
        lblNYVenueR12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYVenueR12.setText(" ");
        lblNYVenueR12.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYVenueR12.setOpaque(true);

        lblNYDateR12.setBackground(new java.awt.Color(113, 132, 137));
        lblNYDateR12.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYDateR12.setForeground(new java.awt.Color(255, 255, 255));
        lblNYDateR12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNYDateR12.setText(" ");
        lblNYDateR12.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYDateR12.setOpaque(true);

        lblNYR12.setBackground(new java.awt.Color(113, 132, 137));
        lblNYR12.setFont(new java.awt.Font("Formula1 Display Regular", 0, 16)); // NOI18N
        lblNYR12.setForeground(new java.awt.Color(255, 255, 255));
        lblNYR12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNYR12.setText("Round 12");
        lblNYR12.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 5, 4, 5));
        lblNYR12.setOpaque(true);

        javax.swing.GroupLayout pnlNextYearLayout = new javax.swing.GroupLayout(pnlNextYear);
        pnlNextYear.setLayout(pnlNextYearLayout);
        pnlNextYearLayout.setHorizontalGroup(
            pnlNextYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNextYearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNextYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNextYearLayout.createSequentialGroup()
                        .addComponent(lblNYR1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNYR13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR13, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR13, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNextYearLayout.createSequentialGroup()
                        .addComponent(lblNYR2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNYR14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR14, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR14, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNextYearLayout.createSequentialGroup()
                        .addComponent(lblNYR3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNYR15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR15, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR15, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNextYearLayout.createSequentialGroup()
                        .addComponent(lblNYR4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNYR16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR16, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR16, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNextYearLayout.createSequentialGroup()
                        .addComponent(lblNYR5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNYR17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR17, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR17, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNextYearLayout.createSequentialGroup()
                        .addComponent(lblNYR6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNYR18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR18, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR18, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNextYearLayout.createSequentialGroup()
                        .addComponent(lblNYR7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR7, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNYR19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR19, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR19, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNextYearLayout.createSequentialGroup()
                        .addComponent(lblNYR8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR8, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNYR20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR20, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR20, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNextYearLayout.createSequentialGroup()
                        .addComponent(lblNYR9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR9, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNYR21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR21, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR21, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNextYearLayout.createSequentialGroup()
                        .addComponent(lblNYR10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR10, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR10, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNYR22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR22, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR22, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNextYearLayout.createSequentialGroup()
                        .addComponent(lblNYR11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR11, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR11, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNYR23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR23, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR23, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNextYearLayout.createSequentialGroup()
                        .addComponent(lblNYR12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYVenueR12, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNYDateR12, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlNextYearLayout.setVerticalGroup(
            pnlNextYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNextYearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNextYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNYR1)
                    .addComponent(lblNYVenueR1)
                    .addComponent(lblNYDateR1)
                    .addComponent(lblNYR13)
                    .addComponent(lblNYVenueR13)
                    .addComponent(lblNYDateR13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNextYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNYR2)
                    .addComponent(lblNYVenueR2)
                    .addComponent(lblNYDateR2)
                    .addComponent(lblNYR14)
                    .addComponent(lblNYVenueR14)
                    .addComponent(lblNYDateR14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNextYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNYR3)
                    .addComponent(lblNYVenueR3)
                    .addComponent(lblNYDateR3)
                    .addComponent(lblNYR15)
                    .addComponent(lblNYVenueR15)
                    .addComponent(lblNYDateR15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNextYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNYR4)
                    .addComponent(lblNYVenueR4)
                    .addComponent(lblNYDateR4)
                    .addComponent(lblNYR16)
                    .addComponent(lblNYVenueR16)
                    .addComponent(lblNYDateR16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNextYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNYR5)
                    .addComponent(lblNYVenueR5)
                    .addComponent(lblNYDateR5)
                    .addComponent(lblNYR17)
                    .addComponent(lblNYVenueR17)
                    .addComponent(lblNYDateR17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNextYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNYR6)
                    .addComponent(lblNYVenueR6)
                    .addComponent(lblNYDateR6)
                    .addComponent(lblNYR18)
                    .addComponent(lblNYVenueR18)
                    .addComponent(lblNYDateR18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNextYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNYR7)
                    .addComponent(lblNYVenueR7)
                    .addComponent(lblNYDateR7)
                    .addComponent(lblNYR19)
                    .addComponent(lblNYVenueR19)
                    .addComponent(lblNYDateR19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNextYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNYR8)
                    .addComponent(lblNYVenueR8)
                    .addComponent(lblNYDateR8)
                    .addComponent(lblNYR20)
                    .addComponent(lblNYVenueR20)
                    .addComponent(lblNYDateR20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNextYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNYR9)
                    .addComponent(lblNYVenueR9)
                    .addComponent(lblNYDateR9)
                    .addComponent(lblNYR21)
                    .addComponent(lblNYVenueR21)
                    .addComponent(lblNYDateR21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNextYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNYR10)
                    .addComponent(lblNYVenueR10)
                    .addComponent(lblNYDateR10)
                    .addComponent(lblNYR22)
                    .addComponent(lblNYVenueR22)
                    .addComponent(lblNYDateR22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNextYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNYR11)
                    .addComponent(lblNYVenueR11)
                    .addComponent(lblNYDateR11)
                    .addComponent(lblNYR23)
                    .addComponent(lblNYVenueR23)
                    .addComponent(lblNYDateR23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNextYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNYR12)
                    .addComponent(lblNYVenueR12)
                    .addComponent(lblNYDateR12))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(Integer.toString(grandprixworld.gui.FullGame.data.currentYear + 1), pnlNextYear);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCYDateR1;
    private javax.swing.JLabel lblCYDateR10;
    private javax.swing.JLabel lblCYDateR11;
    private javax.swing.JLabel lblCYDateR12;
    private javax.swing.JLabel lblCYDateR13;
    private javax.swing.JLabel lblCYDateR14;
    private javax.swing.JLabel lblCYDateR15;
    private javax.swing.JLabel lblCYDateR16;
    private javax.swing.JLabel lblCYDateR17;
    private javax.swing.JLabel lblCYDateR18;
    private javax.swing.JLabel lblCYDateR19;
    private javax.swing.JLabel lblCYDateR2;
    private javax.swing.JLabel lblCYDateR20;
    private javax.swing.JLabel lblCYDateR21;
    private javax.swing.JLabel lblCYDateR22;
    private javax.swing.JLabel lblCYDateR23;
    private javax.swing.JLabel lblCYDateR3;
    private javax.swing.JLabel lblCYDateR4;
    private javax.swing.JLabel lblCYDateR5;
    private javax.swing.JLabel lblCYDateR6;
    private javax.swing.JLabel lblCYDateR7;
    private javax.swing.JLabel lblCYDateR8;
    private javax.swing.JLabel lblCYDateR9;
    private javax.swing.JLabel lblCYR1;
    private javax.swing.JLabel lblCYR10;
    private javax.swing.JLabel lblCYR11;
    private javax.swing.JLabel lblCYR12;
    private javax.swing.JLabel lblCYR13;
    private javax.swing.JLabel lblCYR14;
    private javax.swing.JLabel lblCYR15;
    private javax.swing.JLabel lblCYR16;
    private javax.swing.JLabel lblCYR17;
    private javax.swing.JLabel lblCYR18;
    private javax.swing.JLabel lblCYR19;
    private javax.swing.JLabel lblCYR2;
    private javax.swing.JLabel lblCYR20;
    private javax.swing.JLabel lblCYR21;
    private javax.swing.JLabel lblCYR22;
    private javax.swing.JLabel lblCYR23;
    private javax.swing.JLabel lblCYR3;
    private javax.swing.JLabel lblCYR4;
    private javax.swing.JLabel lblCYR5;
    private javax.swing.JLabel lblCYR6;
    private javax.swing.JLabel lblCYR7;
    private javax.swing.JLabel lblCYR8;
    private javax.swing.JLabel lblCYR9;
    private javax.swing.JLabel lblCYVenueR1;
    private javax.swing.JLabel lblCYVenueR10;
    private javax.swing.JLabel lblCYVenueR11;
    private javax.swing.JLabel lblCYVenueR12;
    private javax.swing.JLabel lblCYVenueR13;
    private javax.swing.JLabel lblCYVenueR14;
    private javax.swing.JLabel lblCYVenueR15;
    private javax.swing.JLabel lblCYVenueR16;
    private javax.swing.JLabel lblCYVenueR17;
    private javax.swing.JLabel lblCYVenueR18;
    private javax.swing.JLabel lblCYVenueR19;
    private javax.swing.JLabel lblCYVenueR2;
    private javax.swing.JLabel lblCYVenueR20;
    private javax.swing.JLabel lblCYVenueR21;
    private javax.swing.JLabel lblCYVenueR22;
    private javax.swing.JLabel lblCYVenueR23;
    private javax.swing.JLabel lblCYVenueR3;
    private javax.swing.JLabel lblCYVenueR4;
    private javax.swing.JLabel lblCYVenueR5;
    private javax.swing.JLabel lblCYVenueR6;
    private javax.swing.JLabel lblCYVenueR7;
    private javax.swing.JLabel lblCYVenueR8;
    private javax.swing.JLabel lblCYVenueR9;
    private javax.swing.JLabel lblNYDateR1;
    private javax.swing.JLabel lblNYDateR10;
    private javax.swing.JLabel lblNYDateR11;
    private javax.swing.JLabel lblNYDateR12;
    private javax.swing.JLabel lblNYDateR13;
    private javax.swing.JLabel lblNYDateR14;
    private javax.swing.JLabel lblNYDateR15;
    private javax.swing.JLabel lblNYDateR16;
    private javax.swing.JLabel lblNYDateR17;
    private javax.swing.JLabel lblNYDateR18;
    private javax.swing.JLabel lblNYDateR19;
    private javax.swing.JLabel lblNYDateR2;
    private javax.swing.JLabel lblNYDateR20;
    private javax.swing.JLabel lblNYDateR21;
    private javax.swing.JLabel lblNYDateR22;
    private javax.swing.JLabel lblNYDateR23;
    private javax.swing.JLabel lblNYDateR3;
    private javax.swing.JLabel lblNYDateR4;
    private javax.swing.JLabel lblNYDateR5;
    private javax.swing.JLabel lblNYDateR6;
    private javax.swing.JLabel lblNYDateR7;
    private javax.swing.JLabel lblNYDateR8;
    private javax.swing.JLabel lblNYDateR9;
    private javax.swing.JLabel lblNYR1;
    private javax.swing.JLabel lblNYR10;
    private javax.swing.JLabel lblNYR11;
    private javax.swing.JLabel lblNYR12;
    private javax.swing.JLabel lblNYR13;
    private javax.swing.JLabel lblNYR14;
    private javax.swing.JLabel lblNYR15;
    private javax.swing.JLabel lblNYR16;
    private javax.swing.JLabel lblNYR17;
    private javax.swing.JLabel lblNYR18;
    private javax.swing.JLabel lblNYR19;
    private javax.swing.JLabel lblNYR2;
    private javax.swing.JLabel lblNYR20;
    private javax.swing.JLabel lblNYR21;
    private javax.swing.JLabel lblNYR22;
    private javax.swing.JLabel lblNYR23;
    private javax.swing.JLabel lblNYR3;
    private javax.swing.JLabel lblNYR4;
    private javax.swing.JLabel lblNYR5;
    private javax.swing.JLabel lblNYR6;
    private javax.swing.JLabel lblNYR7;
    private javax.swing.JLabel lblNYR8;
    private javax.swing.JLabel lblNYR9;
    private javax.swing.JLabel lblNYVenueR1;
    private javax.swing.JLabel lblNYVenueR10;
    private javax.swing.JLabel lblNYVenueR11;
    private javax.swing.JLabel lblNYVenueR12;
    private javax.swing.JLabel lblNYVenueR13;
    private javax.swing.JLabel lblNYVenueR14;
    private javax.swing.JLabel lblNYVenueR15;
    private javax.swing.JLabel lblNYVenueR16;
    private javax.swing.JLabel lblNYVenueR17;
    private javax.swing.JLabel lblNYVenueR18;
    private javax.swing.JLabel lblNYVenueR19;
    private javax.swing.JLabel lblNYVenueR2;
    private javax.swing.JLabel lblNYVenueR20;
    private javax.swing.JLabel lblNYVenueR21;
    private javax.swing.JLabel lblNYVenueR22;
    private javax.swing.JLabel lblNYVenueR23;
    private javax.swing.JLabel lblNYVenueR3;
    private javax.swing.JLabel lblNYVenueR4;
    private javax.swing.JLabel lblNYVenueR5;
    private javax.swing.JLabel lblNYVenueR6;
    private javax.swing.JLabel lblNYVenueR7;
    private javax.swing.JLabel lblNYVenueR8;
    private javax.swing.JLabel lblNYVenueR9;
    private javax.swing.JPanel pnlCurrentYear;
    private javax.swing.JPanel pnlNextYear;
    // End of variables declaration//GEN-END:variables
}
