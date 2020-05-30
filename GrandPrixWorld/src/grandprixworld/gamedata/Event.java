/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata;

import java.time.LocalDate;

/**
 *
 * @author Josh Brookes
 */
public class Event {
    public String eventName;
    public Venue venue;
    public LocalDate eventStart;
    
    public Event(String eventName, Venue venue, LocalDate eventStart) {
        this.eventName = eventName;
        this.venue = venue;
        this.eventStart = eventStart;
    }
    
}
