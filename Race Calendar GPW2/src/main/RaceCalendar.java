package main;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RaceCalendar {

	public int year;
	public static List<Venue> circuits = new ArrayList<Venue>();
	public List<Venue> selectedVenues = new ArrayList<Venue>();
	public List<RaceWeekend> calendar = new ArrayList<RaceWeekend>();

	public RaceCalendar(int year) {

		this.year = year;

		List<LocalDate> available = findAvailableDates();

		int[] grandsPrix = new int[50];

		System.out.println(year + " FIA Formula One World Championship Calendar");
		System.out.println();
		
		for (Venue v: circuits) {
			grandsPrix[v.country.ordinal()]++;
		}

		for (int i = 0; i < grandsPrix.length; i++) {
			if (grandsPrix[i] > 0) {
				selectedVenues.add(VenueSelect(i));
			}
		}

		Random rnd = new Random();
		int races = rnd.nextInt(6) + 18;

		List<LocalDate> calendarDates = new ArrayList<LocalDate>();

		for (int i = 0; i < races; i++) {
			int index = rnd.nextInt(available.size());
			calendarDates.add(available.get(index));
			available.remove(index);
		}

		calendarDates.sort(new CalendarSorter());
		List<Venue> selectedVenues2 = new ArrayList<Venue>();

		for (Venue v: selectedVenues) {
			if (v.lastYear == true) {
				selectedVenues2.add(v);
				selectedVenues2.add(v);
				selectedVenues2.add(v);
				selectedVenues2.add(v);
				selectedVenues2.add(v);
				selectedVenues2.add(v);
				selectedVenues2.add(v);
				selectedVenues2.add(v);
				selectedVenues2.add(v);
				selectedVenues2.add(v);
				selectedVenues2.add(v);
				selectedVenues2.add(v);
				selectedVenues2.add(v);
				selectedVenues2.add(v);
			}
		}
		selectedVenues.addAll(selectedVenues2);

		for (Venue v: circuits) {
			v.lastYear = false;
		}
		
		Venue venueAUS = null;
		Venue venueMON = null;
		Venue venueUAE = null;

		for (Venue v: selectedVenues) {
			if (v.country == Country.AUSTRALIA) { venueAUS = v; }
			else if (v.country == Country.MONACO) { venueMON = v; }
			else if (v.country == Country.UNITED_ARAB_EMIRATES) { 
				venueUAE = v;		
			};
		}
		selectedVenues.removeIf(ven -> ven.country == Country.AUSTRALIA);
		selectedVenues.removeIf(ven -> ven.country == Country.MONACO);
		selectedVenues.removeIf(ven -> ven.country == Country.UNITED_ARAB_EMIRATES);
		
		List<Venue> euroVenues = new ArrayList<Venue>();
		List<Venue> flyVenues = new ArrayList<Venue>();
		
		for (Venue v: selectedVenues) {
			if (v.region == Region.EUR) {
				euroVenues.add(v);
			} else if (v.region == Region.FLY) {
				flyVenues.add(v);
			}
		}
		
		for (LocalDate d: calendarDates) {
			if (calendarDates.get(0) == d) {
				calendar.add(new RaceWeekend(d, venueAUS));
				circuits.get(circuits.indexOf(venueAUS)).lastYear = true;
				
			}
			else if ((calendarDates.get(1) == d) || (calendarDates.get(2) == d)) {
				int location = rnd.nextInt(flyVenues.size());
				Venue selected = flyVenues.get(location);
				calendar.add(new RaceWeekend(d, selected));
				flyVenues.removeIf(v -> v.imageCode == selected.imageCode);
				circuits.get(circuits.indexOf(selected)).lastYear = true;
			}
			else if ((calendarDates.get(3) == d)) {
				if (rnd.nextInt(1) == 0) {
					int location = rnd.nextInt(flyVenues.size());
					Venue selected = flyVenues.get(location);
					calendar.add(new RaceWeekend(d, selected));
					flyVenues.removeIf(v -> v.imageCode == selected.imageCode);
					circuits.get(circuits.indexOf(selected)).lastYear = true;
				} else {
					int location = rnd.nextInt(euroVenues.size());
					Venue selected = euroVenues.get(location);
					calendar.add(new RaceWeekend(d, selected));
					euroVenues.removeIf(v -> v.imageCode == selected.imageCode);
					circuits.get(circuits.indexOf(selected)).lastYear = true;
				}
				
			}
			else if ((calendarDates.get(4) == d)) {
				int location = rnd.nextInt(euroVenues.size());
				Venue selected = euroVenues.get(location);
				calendar.add(new RaceWeekend(d, selected));
				euroVenues.removeIf(v -> v.imageCode == selected.imageCode);
				circuits.get(circuits.indexOf(selected)).lastYear = true;
			}
			else if (calendarDates.get(5) == d) {
				calendar.add(new RaceWeekend(d, venueMON));
				circuits.get(circuits.indexOf(venueMON)).lastYear = true;
			}
			else if ((calendarDates.get(6) == d)) {
				int location = rnd.nextInt(flyVenues.size());
				Venue selected = flyVenues.get(location);
				calendar.add(new RaceWeekend(d, selected));
				flyVenues.removeIf(v -> v.imageCode == selected.imageCode);
				circuits.get(circuits.indexOf(selected)).lastYear = true;
			}
			else if ((calendarDates.get(7) == d) || (calendarDates.get(8) == d) || (calendarDates.get(9) == d) || (calendarDates.get(10) == d) || (calendarDates.get(11) == d) || (calendarDates.get(12) == d) || (calendarDates.get(13) == d)) {
				int location = rnd.nextInt(euroVenues.size());
				Venue selected = euroVenues.get(location);
				calendar.add(new RaceWeekend(d, selected));
				euroVenues.removeIf(v -> v.imageCode == selected.imageCode);
				circuits.get(circuits.indexOf(selected)).lastYear = true;
			}
			else if (calendarDates.get(races - 1) == d) {
				calendar.add(new RaceWeekend(d, venueUAE));
				circuits.get(circuits.indexOf(venueUAE)).lastYear = true;
			}
			else {
				int location = rnd.nextInt(flyVenues.size());
				Venue selected = flyVenues.get(location);
				calendar.add(new RaceWeekend(d, selected));
				flyVenues.removeIf(v -> v.imageCode == selected.imageCode);
				circuits.get(circuits.indexOf(selected)).lastYear = true;
			}
		}

		/*
		 * for (LocalDate l: calendarDates) { System.out.println(l.toString()); } for
		 * (Venue v: selectedVenues) { System.out.println(v.shortName); }
		 */
		int count = 0;
		for (RaceWeekend w: calendar) {
			count++;
			System.out.println("Round " + count + ": " + w.raceday + " - " + w.track.shortName);
		}
		System.out.println();

	}

	private Venue VenueSelect(int countryOrdinal) {
		List<Venue> countryVenues = new ArrayList<Venue>();

		for (Venue v: circuits) {
			if (v.country.ordinal() == countryOrdinal) {
				countryVenues.add(v);
				if (v.lastYear == true) {
					countryVenues.add(v);
					countryVenues.add(v);
					countryVenues.add(v);
					countryVenues.add(v);
					countryVenues.add(v);
					countryVenues.add(v);
					countryVenues.add(v);
					countryVenues.add(v);
					countryVenues.add(v);
					countryVenues.add(v);
					countryVenues.add(v);
					countryVenues.add(v);
					countryVenues.add(v);
					countryVenues.add(v);
					countryVenues.add(v);
					countryVenues.add(v);
					countryVenues.add(v);
					countryVenues.add(v);
					countryVenues.add(v);
				} else if (v.grade == 1) {
					countryVenues.add(v);
					countryVenues.add(v);
					countryVenues.add(v);
				} else if (v.grade == 2) {
					countryVenues.add(v);
					countryVenues.add(v);
				} else if (v.grade == 3) {
					countryVenues.add(v);
				}
			}
		}
		if (countryVenues.size() == 1) return countryVenues.get(0);
		else {
			Random rnd = new Random();
			return countryVenues.get(rnd.nextInt(countryVenues.size()));
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

		circuits.add(new Venue("Melbourne Grand Prix Circuit", "Melbourne", Country.AUSTRALIA, Region.FLY, true, "AUS", 1));
		circuits.add(new Venue("Bahrain International Circuit", "Sakhir", Country.BAHRAIN, Region.FLY, true, "BHR", 1));
		circuits.add(new Venue("Shanghai International Circuit", "Shanghai", Country.CHINA, Region.FLY, true, "CHN", 1));
		circuits.add(new Venue("Baku City Circuit", "Baku", Country.AZERBAIJAN, Region.EUR, true, "AZE", 1));
		circuits.add(new Venue("Circuit de Barcelona-Catalunya", "Barcelona", Country.SPAIN, Region.EUR, true, "ESP", 1));
		circuits.add(new Venue("Circuit de Monaco", "Monte-Carlo", Country.MONACO, Region.EUR, true, "MON", 1));
		circuits.add(new Venue("Circuit Gilles Villeneuve", "Montréal", Country.CANADA, Region.FLY, true, "CAN", 1));
		circuits.add(new Venue("Circuit Paul Ricard", "Le Castellet", Country.FRANCE, Region.EUR, true, "FRA", 1));
		circuits.add(new Venue("Silverstone Circuit", "Silverstone", Country.GREAT_BRITAIN, Region.EUR, true, "GBR", 1));
		circuits.add(new Venue("Red Bull Ring", "Spielberg", Country.AUSTRIA, Region.EUR, true, "AUT", 1));
		circuits.add(new Venue("Hockenheimring", "Hockenheim", Country.GERMANY, Region.EUR, true, "GER", 1));
		circuits.add(new Venue("Hungaroring", "Budapest", Country.HUNGARY, Region.EUR, true, "HUN", 1));
		circuits.add(new Venue("Circuit Spa-Francorchamps", "Spa", Country.BELGIUM, Region.EUR, true, "BEL", 1));
		circuits.add(new Venue("Autodromo Nazionale Monza", "Monza", Country.ITALY, Region.EUR, true, "ITA", 1));
		circuits.add(new Venue("Marina Bay Street Circuit", "Marina Bay", Country.SINGAPORE, Region.FLY, true, "SNG", 1));
		circuits.add(new Venue("Suzuka Circuit", "Suzuka", Country.JAPAN, Region.FLY, true, "JAP", 1));
		circuits.add(new Venue("Autodromo Hermanos Rodriguez", "Mexico City", Country.MEXICO, Region.FLY, true, "MEX", 1));
		circuits.add(new Venue("Circuit of the Americas", "Austin", Country.UNITED_STATES, Region.FLY, true, "USA", 1));
		circuits.add(new Venue("Autodromo Jose Carlos Pace", "Interlagos", Country.BRAZIL, Region.FLY, true, "BRA", 1));
		circuits.add(new Venue("Yas Marina Circuit", "Yas Marina", Country.UNITED_ARAB_EMIRATES, Region.FLY, true, "UAE", 1));

		circuits.add(new Venue("Autodromo Enzo e Dino Ferrari", "Imola", Country.ITALY, Region.EUR, false, "IMO", 1));
		circuits.add(new Venue("Autodromo Fernanda Pires da Silva", "Estoril", Country.PORTUGAL, Region.EUR, false, "ESO", 1));
		circuits.add(new Venue("Bahrain International Circuit - Endurance", "Sakhir Endurance", Country.BAHRAIN, Region.FLY, false, "SKE", 1));
		circuits.add(new Venue("Buddh International Circuit", "New Delhi", Country.INDIA, Region.FLY, false, "BUD", 1));
		circuits.add(new Venue("Buriram International Circuit", "Buriram", Country.THAILAND, Region.FLY, false, "BUR", 1));
		circuits.add(new Venue("Circuit de Nevers Magny-Cours", "Magny-Cours", Country.FRANCE, Region.EUR, false, "MAG", 1));
		circuits.add(new Venue("Circuit Ricardo Tormo", "Valencia", Country.SPAIN, Region.EUR, false, "VAL", 1));
		circuits.add(new Venue("Circuit Zandvoort", "Zandvoort", Country.THE_NETHERLANDS, Region.EUR, false, "ZAN", 1));
		circuits.add(new Venue("Circuito de Jerez", "Jerez", Country.SPAIN, Region.EUR, false, "JER", 1));
		circuits.add(new Venue("Ciudad del Motor de Aragón", "Aragón", Country.SPAIN, Region.EUR, false, "ARA", 1));
		circuits.add(new Venue("Dubai Autodrome", "Dubai", Country.UNITED_ARAB_EMIRATES, Region.FLY, false, "DUB", 1));
		circuits.add(new Venue("Fuji Speedway", "Fuji", Country.JAPAN, Region.FLY, false, "FUJ", 1));
		circuits.add(new Venue("Hanoi Street Circuit", "Hanoi", Country.VIETNAM, Region.FLY, false, "HAN", 1));
		circuits.add(new Venue("Indianapolis Motor Speedway", "Indianapolis", Country.UNITED_STATES, Region.FLY, false, "IDY", 1));
		circuits.add(new Venue("Istanbul Park", "Istanbul", Country.TURKEY, Region.EUR, false, "IST", 1));
		circuits.add(new Venue("Korea International Circuit", "Yeongam", Country.SOUTH_KOREA, Region.FLY, false, "YEO", 1));
		circuits.add(new Venue("Kuwait Motor Town", "Kuwait City", Country.KUWAIT, Region.FLY, false, "KUW", 1));
		circuits.add(new Venue("Losail International Circuit", "Losail", Country.QATAR, Region.FLY, false, "LOS", 1));
		circuits.add(new Venue("Miami Street Circuit", "Miami", Country.UNITED_STATES, Region.FLY, false, "MIA", 1));
		circuits.add(new Venue("Moscow Raceway", "Moscow Raceway", Country.RUSSIA, Region.EUR, false, "MSC", 1));
		circuits.add(new Venue("Mugello Circuit", "Mugello", Country.ITALY, Region.EUR, false, "MUG", 1));
		circuits.add(new Venue("Nurburgring", "Nurburgring", Country.GERMANY, Region.EUR, false, "NUR", 1));
		circuits.add(new Venue("Sepang International Circuit", "Kuala Lumpur", Country.MALAYSIA, Region.FLY, false, "SEP", 1));
		circuits.add(new Venue("TT Circuit Assen", "Assen", Country.THE_NETHERLANDS, Region.EUR, false, "ASS", 1));

		circuits.add(new Venue("Adria International Raceway", "Adria", Country.ITALY, Region.EUR, false, "ADR", 2));
		circuits.add(new Venue("Algarve International Circuit", "Algarve", Country.PORTUGAL, Region.EUR, false, "ALG", 2));
		circuits.add(new Venue("Autodrom Most", "Most", Country.CZECHIA, Region.EUR, false, "MST", 2));
		circuits.add(new Venue("Autodromo Internacional de Codegua", "Codegua", Country.CHILE, Region.FLY, false, "CDG", 2));
		circuits.add(new Venue("Autodromo Juan y Oscar Galvez", "Buenos Aires", Country.ARGENTINA, Region.FLY, false, "JOG", 2));
		circuits.add(new Venue("Autodromo Termas de Rio Hondo", "Rio Hondo", Country.ARGENTINA, Region.FLY, false, "TRH", 2));
		circuits.add(new Venue("Autodromo Victor Borrat Fabini", "Montevideo", Country.URUGUAY, Region.FLY, false, "VBF", 2));
		circuits.add(new Venue("Automotodrom Slovakiaring", "Bratislava", Country.SLOVAKIA, Region.EUR, false, "SVK", 2));
		circuits.add(new Venue("Autopolis", "Autopolis", Country.JAPAN, Region.FLY, false, "ATP", 2));
		circuits.add(new Venue("Barber Motorsport Park", "Birmingham", Country.UNITED_STATES, Region.FLY, false, "BAR", 2));
		circuits.add(new Venue("Brands Hatch", "Brands Hatch", Country.GREAT_BRITAIN, Region.EUR, false, "BRH", 2));
		circuits.add(new Venue("Brno Circuit", "Brno", Country.CZECHIA, Region.EUR, false, "BRN", 2));
		circuits.add(new Venue("Bruce McLaren Motorsport Park", "Taupo", Country.NEW_ZEALAND, Region.FLY, false, "TAU", 2));
		circuits.add(new Venue("Canadian Tire Motorsport Park", "Bowmanville", Country.CANADA, Region.FLY, false, "CTM", 2));
		circuits.add(new Venue("Circuit de la Sarthe Bugatti", "Le Mans", Country.FRANCE, Region.EUR, false, "LMS", 2));
		circuits.add(new Venue("Circuit de Lédenon", "Lédenon", Country.FRANCE, Region.EUR, false, "LED", 2));
		circuits.add(new Venue("Circuit International Automobile Moulay El Hassan", "Marrakesh", Country.MOROCCO, Region.FLY, false, "MRK", 2));
		circuits.add(new Venue("Circuit Paul Armagnac", "Nogaro", Country.FRANCE, Region.EUR, false, "NOG", 2));
		circuits.add(new Venue("Circuit Zolder", "Zolder", Country.BELGIUM, Region.EUR, false, "ZOL", 2));
		circuits.add(new Venue("Circuito de Navarra", "Navarra", Country.SPAIN, Region.EUR, false, "NAV", 2));
		circuits.add(new Venue("Circuito de Jarama", "Jarama", Country.SPAIN, Region.EUR, false, "JAR", 2));
		circuits.add(new Venue("Circuito San Juan Villicum", "San Juan", Country.ARGENTINA, Region.FLY, false, "SJA", 2));
		circuits.add(new Venue("Dijon-Prenois", "Dijon", Country.FRANCE, Region.EUR, false, "DIJ", 2));
		circuits.add(new Venue("Donington Park", "Donington", Country.GREAT_BRITAIN, Region.EUR, false, "DON", 2));
		circuits.add(new Venue("EuroSpeedway Lausitz", "Lausitz", Country.GERMANY, Region.EUR, false, "ESL", 2));
		circuits.add(new Venue("Fort Grozny Autodrom", "Grozny", Country.RUSSIA, Region.EUR, false, "GRZ", 2));
		circuits.add(new Venue("Gold Coast Street Circuit", "Gold Coast", Country.AUSTRALIA, Region.FLY, false, "GDC", 2));
		circuits.add(new Venue("Inje Speedium", "Inje", Country.SOUTH_KOREA, Region.FLY, false, "INJ", 2));
		circuits.add(new Venue("Kazan Ring", "Kazan", Country.RUSSIA, Region.EUR, false, "KAZ", 2));
		circuits.add(new Venue("Kyalami Circuit", "Kyalami", Country.SOUTH_AFRICA, Region.FLY, false, "KYA", 2));
		circuits.add(new Venue("Lime Rock Park", "Lime Rock Park", Country.UNITED_STATES, Region.FLY, false, "LRP", 2));
		circuits.add(new Venue("Long Beach Street Circuit", "Long Beach", Country.UNITED_STATES, Region.FLY, false, "LGB", 2));
		circuits.add(new Venue("Madras Motor Race Track", "Madras", Country.INDIA, Region.FLY, false, "MAD", 2));
		circuits.add(new Venue("Mid-Ohio Sports Car Course", "Lexington", Country.UNITED_STATES, Region.FLY, false, "MDO", 2));
		circuits.add(new Venue("Misano World Circuit Marco Simoncelli", "Misano", Country.ITALY, Region.EUR, false, "MIS", 2));
		circuits.add(new Venue("Motorsport Arena Oschersleben", "Oschersleben", Country.GERMANY, Region.EUR, false, "OSC", 2));
		circuits.add(new Venue("Ningbo International Circuit", "Ningbo", Country.CHINA, Region.FLY, false, "NNG", 2));
		circuits.add(new Venue("NOLA Motorsports Park", "New Orleans", Country.UNITED_STATES, Region.FLY, false, "NOL", 2));
		circuits.add(new Venue("Norisring", "Nuremberg", Country.GERMANY, Region.EUR, false, "NOR", 2));
		circuits.add(new Venue("Okayama International Circuit", "Okayama", Country.JAPAN, Region.FLY, false, "OKA", 2));
		circuits.add(new Venue("Ordos International Circuit", "Ordos", Country.CHINA, Region.FLY, false, "ORD", 2));
		circuits.add(new Venue("Penbay International Circuit", "Penbay", Country.TAIWAN, Region.FLY, false, "PEN", 2));
		circuits.add(new Venue("Portland International Raceway", "Portland", Country.UNITED_STATES, Region.FLY, false, "PRT", 2));
		circuits.add(new Venue("Potrero de los Funes Circuit", "San Luis", Country.ARGENTINA, Region.FLY, false, "SLS", 2));
		circuits.add(new Venue("Road America", "Elkhart Lake", Country.UNITED_STATES, Region.FLY, false, "RAM", 2));
		circuits.add(new Venue("Road Atlanta", "Atlanta", Country.UNITED_STATES, Region.FLY, false, "RAT", 2));
		circuits.add(new Venue("Sachsenring", "Chemnitz", Country.GERMANY, Region.EUR, false, "SAC", 2));
		circuits.add(new Venue("Scandinavian Raceway", "Anderstorp", Country.SWEDEN, Region.EUR, false, "AND", 2));
		circuits.add(new Venue("Sebring International Raceway", "Sebring", Country.UNITED_STATES, Region.FLY, false, "SEB", 2));
		circuits.add(new Venue("Sentul International Circuit", "Sentul", Country.INDONESIA, Region.FLY, false, "SEN", 2));
		circuits.add(new Venue("Snetterton Circuit", "Snetterton", Country.GREAT_BRITAIN, Region.EUR, false, "SNE", 2));
		circuits.add(new Venue("Sonoma Raceway", "Sonoma", Country.UNITED_STATES, Region.FLY, false, "SON", 2));
		circuits.add(new Venue("Sportsland Sugo", "Murata", Country.JAPAN, Region.FLY, false, "SUG", 2));
		circuits.add(new Venue("St Petersburg Street Circuit", "St Petersburg", Country.UNITED_STATES, Region.FLY, false, "STP", 2));
		circuits.add(new Venue("Sydney Motorsport Park", "Sydney", Country.AUSTRALIA, Region.FLY, false, "SYD", 2));
		circuits.add(new Venue("The Bend Motorsport Park", "Tailem Bend", Country.AUSTRALIA, Region.FLY, false, "TBD", 2));
		circuits.add(new Venue("Tokachi International Speedway", "Hokkaido", Country.JAPAN, Region.FLY, false, "TOK", 2));
		circuits.add(new Venue("Toronto Street Circuit", "Toronto", Country.CANADA, Region.FLY, false, "TOR", 2));
		circuits.add(new Venue("Twin Ring Motegi", "Motegi", Country.JAPAN, Region.FLY, false, "MTG", 2));
		circuits.add(new Venue("Vallelunga Circuit", "Vallelunga", Country.ITALY, Region.EUR, false, "VLL", 2));
		circuits.add(new Venue("Virginia International Raceway", "Virginia", Country.UNITED_STATES, Region.FLY, false, "VIR", 2));
		circuits.add(new Venue("Watkins Glen International", "Watkins Glen", Country.UNITED_STATES, Region.FLY, false, "WTG", 2));
		circuits.add(new Venue("WeatherTech Raceway Laguna Seca", "Laguna Seca", Country.UNITED_STATES, Region.FLY, false, "LGS", 2));
		circuits.add(new Venue("Zhejiang International Circuit", "Zhejiang", Country.CHINA, Region.FLY, false, "ZHE", 2));
		circuits.add(new Venue("Zhuhai International Circuit", "Zhuhai", Country.CHINA, Region.FLY, false, "ZHU", 2));

		circuits.add(new Venue("Adelaide Street Circuit", "Adelaide", Country.AUSTRALIA, Region.FLY, false, "ADE", 3));
		circuits.add(new Venue("Auto World Tianjin", "Tianjin", Country.CHINA, Region.FLY, false, "TJN", 3));
		circuits.add(new Venue("Autodromo Velo Citta", "Rodovia", Country.BRAZIL, Region.FLY, false, "VCT", 3));
		circuits.add(new Venue("Bucharest Ring", "Bucharest", Country.ROMANIA, Region.EUR, false, "BUC", 3));
		circuits.add(new Venue("Chengdu International Circuit", "Chengdu", Country.CHINA, Region.FLY, false, "CGD", 3));
		circuits.add(new Venue("Circuit Chris Amon", "Pukekohe", Country.NEW_ZEALAND, Region.FLY, false, "PUK", 3));
		circuits.add(new Venue("Circuit de Dakar Baobabs", "Dakar", Country.SENEGAL, Region.FLY, false, "DAK", 3));
		circuits.add(new Venue("Everland Speedway", "Gyeonggi-do", Country.SOUTH_KOREA, Region.FLY, false, "EVE", 3));
		circuits.add(new Venue("Hamilton Street Circuit", "Hamilton", Country.NEW_ZEALAND, Region.FLY, false, "HAM", 3));
		circuits.add(new Venue("Highlands Motorsport Park", "Otago", Country.NEW_ZEALAND, Region.FLY, false, "HIG", 3));
		circuits.add(new Venue("Mantorp Park", "Mantorp", Country.SWEDEN, Region.EUR, false, "MAN", 3));
		circuits.add(new Venue("Mount Panorama Circuit", "Bathurst", Country.AUSTRALIA, Region.FLY, false, "MTP", 3));
		circuits.add(new Venue("Newcastle Street Circuit", "Newcastle", Country.AUSTRALIA, Region.FLY, false, "NEW", 3));
		circuits.add(new Venue("Phillip Island Grand Prix Circuit", "Phillip Island", Country.AUSTRALIA, Region.FLY, false, "PIS", 3));
		circuits.add(new Venue("Rudskogen Motorsenter", "Rudskogen", Country.NORWAY, Region.EUR, false, "RUD", 3));
		circuits.add(new Venue("Rustavi International Motorpark", "Rustavi", Country.GEORGIA, Region.EUR, false, "RSV", 3));
		circuits.add(new Venue("Sydney Olympic Park Circuit", "Homebush", Country.AUSTRALIA, Region.FLY, false, "SOP", 3));
		circuits.add(new Venue("Townsville Street Circuit", "Townsville", Country.AUSTRALIA, Region.FLY, false, "TOW", 3));
		circuits.add(new Venue("Transilvania Motor Ring", "Transilvania", Country.ROMANIA, Region.EUR, false, "TRA", 3));

		circuits.add(new Venue("Autodromo Tocancipa", "Nurburgring", Country.GERMANY, Region.EUR, false, "NUR", 4));
		circuits.add(new Venue("Automotodrom Grobnik", "Grobnik", Country.CROATIA, Region.EUR, false, "GRB", 4));
		circuits.add(new Venue("Reem International Circuit", "Ar Reem", Country.SAUDI_ARABIA, Region.FLY, false, "REE", 4));

		for (int i = 2020; i < 2029; i++) {
			new RaceCalendar(i);
		}
	}

}
