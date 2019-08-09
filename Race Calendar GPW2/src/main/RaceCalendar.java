package main;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RaceCalendar {

	public int year;

	public RaceCalendar(int year) {

		this.year = year;

		List<LocalDate> available = findAvailableDates();

		List<Venue> circuits = new ArrayList<Venue>();
		circuits.add(new Venue("Melbourne Grand Prix Circuit", "Melbourne", Country.AUSTRALIA, true));
		circuits.add(new Venue("Bahrain International Circuit", "Sakhir", Country.BAHRAIN, true));
		circuits.add(new Venue("Shanghai International Circuit", "Shanghai", Country.CHINA, true));
		circuits.add(new Venue("Baku City Circuit", "Baku", Country.AZERBAIJAN, true));
		circuits.add(new Venue("Circuit de Barcelona-Catalunya", "Barcelona", Country.SPAIN, true));
		circuits.add(new Venue("Circuit de Monaco", "Monte-Carlo", Country.MONACO, true));
		circuits.add(new Venue("Circuit Gilles Villeneuve", "Montréal", Country.CANADA, true));
		circuits.add(new Venue("Circuit Paul Ricard", "Le Castellet", Country.FRANCE, true));
		circuits.add(new Venue("Silverstone Circuit", "Silverstone", Country.GREAT_BRITAIN, true));
		circuits.add(new Venue("Red Bull Ring", "Spielberg", Country.AUSTRIA, true));
		circuits.add(new Venue("Hockenheimring", "Hockenheim", Country.GERMANY, true));
		circuits.add(new Venue("Hungaroring", "Budapest", Country.HUNGARY, true));
		circuits.add(new Venue("Circuit Spa-Francorchamps", "Spa", Country.BELGIUM, true));
		circuits.add(new Venue("Autodromo Nazionale Monza", "Monza", Country.ITALY, true));
		circuits.add(new Venue("Marina Bay Street Circuit", "Marina Bay", Country.SINGAPORE, true));
		circuits.add(new Venue("Suzuka Circuit", "Suzuka", Country.JAPAN, true));
		circuits.add(new Venue("Melbourne Grand Prix Circuit", "Melbourne", Country.AUSTRALIA, true));
		circuits.add(new Venue("Melbourne Grand Prix Circuit", "Melbourne", Country.AUSTRALIA, true));
		circuits.add(new Venue("Melbourne Grand Prix Circuit", "Melbourne", Country.AUSTRALIA, true));
		circuits.add(new Venue("Melbourne Grand Prix Circuit", "Melbourne", Country.AUSTRALIA, true));
		circuits.add(new Venue("Melbourne Grand Prix Circuit", "Melbourne", Country.AUSTRALIA, true));
		circuits.add(new Venue("Melbourne Grand Prix Circuit", "Melbourne", Country.AUSTRALIA, true));
		circuits.add(new Venue("Melbourne Grand Prix Circuit", "Melbourne", Country.AUSTRALIA, true));
		circuits.add(new Venue("Melbourne Grand Prix Circuit", "Melbourne", Country.AUSTRALIA, true));
		circuits.add(new Venue("Melbourne Grand Prix Circuit", "Melbourne", Country.AUSTRALIA, true));
		circuits.add(new Venue("Melbourne Grand Prix Circuit", "Melbourne", Country.AUSTRALIA, true));
		circuits.add(new Venue("Melbourne Grand Prix Circuit", "Melbourne", Country.AUSTRALIA, true));
		
		Random rnd = new Random();
		int races = rnd.nextInt(6) + 18;

		List<LocalDate> calendarDates = new ArrayList<LocalDate>();

		for (int i = 0; i < races; i++) {
			int index = rnd.nextInt(available.size()) - 1;
			calendarDates.add(available.get(index));
			available.remove(index);
		}

		calendarDates.sort(new CalendarSorter());

		for (LocalDate l: calendarDates) {
			System.out.println(l.toString());
		}

	}

	private List<LocalDate> findAvailableDates() {
		LocalDate current = LocalDate.of(year, 2, 28);

		List<LocalDate> availableDates = new ArrayList<LocalDate>();
		boolean found = false;
		do {
			if (current.getDayOfWeek() == DayOfWeek.FRIDAY) {
				found = true;
				current = current.plusDays(2);
				availableDates.add(current);
			} else {
				current = current.minusDays(1);
			}
		} while (found == false);

		do {
			current = current.plusDays(7);
			availableDates.add(current);
		} while (current.getMonthValue() < 12);

		return availableDates;
	}

	public static void main(String[] args) {
		for (int i = 2019; i < 2020; i++) {
			new RaceCalendar(i);
		}
	}

}
