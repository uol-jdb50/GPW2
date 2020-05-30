/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata;

import grandprixworld.gui.FullGame;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Josh Brookes
 */
public class Championship {

    List<Driver> drivers;
    List<Team> teams;
    public List<Event> calendar;
    public List<LocalDate> testingDates = new ArrayList<LocalDate>();
    public int testCost;

    public List<DriverStanding> driversStandings = new ArrayList<DriverStanding>();
    public List<TeamStanding> teamsStandings = new ArrayList<TeamStanding>();

    public Championship(List<Driver> drivers, List<Team> teams, List<Event> calendar) {
        this.drivers = drivers;
        this.teams = teams;
        this.calendar = calendar;
        setupDriversChampionship();
        setupTeamsChampionship();
        setupTestingCalendar();
        newTestCost();
    }

    private void setupTestingCalendar() {
        Random rnd = new Random();
        testingDates.add(LocalDate.of(2019, 3, 15));
    }

    private void setupDriversChampionship() {
        driversStandings.clear();
        for (Driver d : drivers) {
            driversStandings.add(new DriverStanding(d));
        }
        Collections.sort(driversStandings, new SortByDriverPts());
    }

    private void setupTeamsChampionship() {
        teamsStandings.clear();
        for (Team t : teams) {
            teamsStandings.add(new TeamStanding(t));
        }
        Collections.sort(teamsStandings, new SortByTeamPts());
    }

    public int findDriverPosition(String lname) {
        int i = 1;
        for (DriverStanding ds : driversStandings) {
            if (ds.driver.lname.equals(lname)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int findTeamPosition(String name) {
        int i = 1;
        for (TeamStanding ts : teamsStandings) {
            if (ts.team.name.equals(name)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int findDriverPts(String lname) {
        for (DriverStanding ds : driversStandings) {
            if (ds.driver.lname.equals(lname)) {
                return ds.points;
            }
        }
        return -1;
    }

    public int findTeamPts(String name) {
        for (TeamStanding ts : teamsStandings) {
            if (ts.team.name.equals(name)) {
                return ts.points;
            }
        }
        return -1;
    }

    public boolean testingThisWeek() {
        for (LocalDate d : testingDates) {
            if (grandprixworld.gui.FullGame.data.currentDate.equals(d)) {
                return true;
            }
        }
        return false;
    }

    public Event findNextEvent() {
        LocalDate date = FullGame.data.currentDate;
        do {
            for (Event e : calendar) {
                if (e.eventStart.isEqual(date)) {
                    return e;
                }
            }
            date = date.plusDays(7);
        } while (date.isBefore(LocalDate.of(FullGame.data.currentYear, Month.DECEMBER, 31)));
        return FullGame.data.nextYearCalendar.get(0);
    }

    public int findRoundNum(String eventName) {
        int i = 1;
        for (Event e : calendar) {
            if (e.eventName.equals(eventName)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int findCalendarLength() {
        return calendar.size();
    }

    public DriverStanding findDriverStandingByRaceNum(int raceNum) {
        for (DriverStanding d : driversStandings) {
            if (d.driver.raceNum == raceNum) {
                return d;
            }
        }
        return null;
    }

    public void addPoints(int raceNum, int points) {
        for (DriverStanding d : driversStandings) {
            if (d.driver.raceNum == raceNum) {
                d.points += points;
            }
        }
    }

    public void setCCPoints() {
        for (TeamStanding t : teamsStandings) {
            t.points = findDriverPts(t.team.driver1.lname) + findDriverPts(t.team.driver2.lname);
        }
    }
    
    public void newTestCost() {
        Random r = new Random();
        testCost = (r.nextInt(8) + 1) * 250;
    }

}
