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
