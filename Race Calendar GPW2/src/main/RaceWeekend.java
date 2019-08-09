package main;

import java.time.LocalDate;

public class RaceWeekend {

	public LocalDate raceday;
	public Venue track;
	
	public RaceWeekend(LocalDate raceday, Venue track) {
		this.raceday = raceday;
		this.track = track;
	}
	
}
