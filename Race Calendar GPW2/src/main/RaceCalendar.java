package main;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RaceCalendar {

	public int year;
	public List<Venue> circuits = new ArrayList<Venue>();
	public List<Venue> selectedVenues = new ArrayList<Venue>();
	public List<RaceWeekend> calendar = new ArrayList<RaceWeekend>();

	public RaceCalendar(int year) {

		this.year = year;

		List<LocalDate> available = findAvailableDates();

		circuits.add(new Venue("Melbourne Grand Prix Circuit", "Melbourne", Country.AUSTRALIA, true, "AUS", 1));
		circuits.add(new Venue("Bahrain International Circuit", "Sakhir", Country.BAHRAIN, true, "BHR", 1));
		circuits.add(new Venue("Shanghai International Circuit", "Shanghai", Country.CHINA, true, "CHN", 1));
		circuits.add(new Venue("Baku City Circuit", "Baku", Country.AZERBAIJAN, true, "AZE", 1));
		circuits.add(new Venue("Circuit de Barcelona-Catalunya", "Barcelona", Country.SPAIN, true, "ESP", 1));
		circuits.add(new Venue("Circuit de Monaco", "Monte-Carlo", Country.MONACO, true, "MON", 1));
		circuits.add(new Venue("Circuit Gilles Villeneuve", "Montréal", Country.CANADA, true, "CAN", 1));
		circuits.add(new Venue("Circuit Paul Ricard", "Le Castellet", Country.FRANCE, true, "FRA", 1));
		circuits.add(new Venue("Silverstone Circuit", "Silverstone", Country.GREAT_BRITAIN, true, "GBR", 1));
		circuits.add(new Venue("Red Bull Ring", "Spielberg", Country.AUSTRIA, true, "AUT", 1));
		circuits.add(new Venue("Hockenheimring", "Hockenheim", Country.GERMANY, true, "GER", 1));
		circuits.add(new Venue("Hungaroring", "Budapest", Country.HUNGARY, true, "HUN", 1));
		circuits.add(new Venue("Circuit Spa-Francorchamps", "Spa", Country.BELGIUM, true, "BEL", 1));
		circuits.add(new Venue("Autodromo Nazionale Monza", "Monza", Country.ITALY, true, "ITA", 1));
		circuits.add(new Venue("Marina Bay Street Circuit", "Marina Bay", Country.SINGAPORE, true, "SNG", 1));
		circuits.add(new Venue("Suzuka Circuit", "Suzuka", Country.JAPAN, true, "JAP", 1));
		circuits.add(new Venue("Autodromo Hermanos Rodriguez", "Mexico City", Country.MEXICO, true, "MEX", 1));
		circuits.add(new Venue("Circuit of the Americas", "Austin", Country.UNITED_STATES, true, "USA", 1));
		circuits.add(new Venue("Autodromo Jose Carlos Pace", "Interlagos", Country.BRAZIL, true, "BRA", 1));
		circuits.add(new Venue("Yas Marina Circuit", "Yas Marina", Country.UNITED_ARAB_EMIRATES, true, "UAE", 1));
		
		circuits.add(new Venue("Autodromo Enzo e Dino Ferrari", "Imola", Country.ITALY, false, "IMO", 1));
		circuits.add(new Venue("Autodromo Fernanda Pires da Silva", "Estoril", Country.PORTUGAL, false, "ESO", 1));
		circuits.add(new Venue("Bahrain International Circuit - Endurance", "Sakhir Endurance", Country.BAHRAIN, false, "SKE", 1));
		circuits.add(new Venue("Buddh International Circuit", "New Delhi", Country.INDIA, false, "BUD", 1));
		circuits.add(new Venue("Buriram International Circuit", "Buriram", Country.THAILAND, false, "BUR", 1));
		circuits.add(new Venue("Circuit de Nevers Magny-Cours", "Magny-Cours", Country.FRANCE, false, "MAG", 1));
		circuits.add(new Venue("Circuit Ricardo Tormo", "Valencia", Country.SPAIN, false, "VAL", 1));
		circuits.add(new Venue("Circuit Zandvoort", "Zandvoort", Country.THE_NETHERLANDS, false, "ZAN", 1));
		circuits.add(new Venue("Circuito de Jerez", "Jerez", Country.SPAIN, false, "JER", 1));
		circuits.add(new Venue("Ciudad del Motor de Aragón", "Aragón", Country.SPAIN, false, "ARA", 1));
		circuits.add(new Venue("Dubai Autodrome", "Dubai", Country.UNITED_ARAB_EMIRATES, false, "DUB", 1));
		circuits.add(new Venue("Fuji Speedway", "Fuji", Country.JAPAN, false, "FUJ", 1));
		circuits.add(new Venue("Hanoi Street Circuit", "Hanoi", Country.VIETNAM, false, "HAN", 1));
		circuits.add(new Venue("Indianapolis Motor Speedway", "Indianapolis", Country.UNITED_STATES, false, "IDY", 1));
		circuits.add(new Venue("Istanbul Park", "Istanbul", Country.TURKEY, false, "IST", 1));
		circuits.add(new Venue("Korea International Circuit", "Yeongam", Country.SOUTH_KOREA, false, "YEO", 1));
		circuits.add(new Venue("Kuwait Motor Town", "Kuwait City", Country.KUWAIT, false, "KUW", 1));
		circuits.add(new Venue("Losail International Circuit", "Losail", Country.QATAR, false, "LOS", 1));
		circuits.add(new Venue("Miami Street Circuit", "Miami", Country.UNITED_STATES, false, "MIA", 1));
		circuits.add(new Venue("Moscow Raceway", "Moscow Raceway", Country.RUSSIA, false, "MSC", 1));
		circuits.add(new Venue("Mugello Circuit", "Mugello", Country.ITALY, false, "MUG", 1));
		circuits.add(new Venue("Nurburgring", "Nurburgring", Country.GERMANY, false, "NUR", 1));
		circuits.add(new Venue("Sepang International Circuit", "Kuala Lumpur", Country.MALAYSIA, false, "SEP", 1));
		circuits.add(new Venue("TT Circuit Assen", "Assen", Country.THE_NETHERLANDS, false, "ASS", 1));
		
		circuits.add(new Venue("Adria International Raceway", "Adria", Country.ITALY, false, "ADR", 2));
		circuits.add(new Venue("Algarve International Circuit", "Algarve", Country.PORTUGAL, false, "ALG", 2));
		circuits.add(new Venue("Autodrom Most", "Most", Country.CZECHIA, false, "MST", 2));
		circuits.add(new Venue("Autodromo Internacional de Codegua", "Codegua", Country.CHILE, false, "CDG", 2));
		circuits.add(new Venue("Autodromo Juan y Oscar Galvez", "Buenos Aires", Country.ARGENTINA, false, "JOG", 2));
		circuits.add(new Venue("Autodromo Termas de Rio Hondo", "Rio Hondo", Country.ARGENTINA, false, "TRH", 2));
		circuits.add(new Venue("Autodromo Victor Borrat Fabini", "Montevideo", Country.URUGUAY, false, "VBF", 2));
		circuits.add(new Venue("Automotodrom Slovakiaring", "Bratislava", Country.SLOVAKIA, false, "SVK", 2));
		circuits.add(new Venue("Autopolis", "Autopolis", Country.JAPAN, false, "ATP", 2));
		circuits.add(new Venue("Barber Motorsport Park", "Birmingham", Country.UNITED_STATES, false, "BAR", 2));
		circuits.add(new Venue("Brands Hatch", "Brands Hatch", Country.GREAT_BRITAIN, false, "BRH", 2));
		circuits.add(new Venue("Brno Circuit", "Brno", Country.CZECHIA, false, "BRN", 2));
		circuits.add(new Venue("Bruce McLaren Motorsport Park", "Taupo", Country.NEW_ZEALAND, false, "TAU", 2));
		circuits.add(new Venue("Canadian Tire Motorsport Park", "Bowmanville", Country.CANADA, false, "CTM", 2));
		circuits.add(new Venue("Circuit de la Sarthe Bugatti", "Le Mans", Country.FRANCE, false, "LMS", 2));
		circuits.add(new Venue("Circuit de Lédenon", "Lédenon", Country.FRANCE, false, "LED", 2));
		circuits.add(new Venue("Circuit International Automobile Moulay El Hassan", "Marrakesh", Country.MOROCCO, false, "MRK", 2));
		circuits.add(new Venue("Circuit Paul Armagnac", "Nogaro", Country.FRANCE, false, "NOG", 2));
		circuits.add(new Venue("Circuit Zolder", "Zolder", Country.BELGIUM, false, "ZOL", 2));
		circuits.add(new Venue("Circuito de Navarra", "Navarra", Country.SPAIN, false, "NAV", 2));
		circuits.add(new Venue("Circuito de Jarama", "Jarama", Country.SPAIN, false, "JAR", 2));
		circuits.add(new Venue("Circuito San Juan Villicum", "San Juan", Country.ARGENTINA, false, "SJA", 2));
		circuits.add(new Venue("Dijon-Prenois", "Dijon", Country.FRANCE, false, "DIJ", 2));
		circuits.add(new Venue("Donington Park", "Donington", Country.GREAT_BRITAIN, false, "DON", 2));
		circuits.add(new Venue("EuroSpeedway Lausitz", "Lausitz", Country.GERMANY, false, "ESL", 2));
		circuits.add(new Venue("Fort Grozny Autodrom", "Grozny", Country.RUSSIA, false, "GRZ", 2));
		circuits.add(new Venue("Gold Coast Street Circuit", "Gold Coast", Country.AUSTRALIA, false, "GDC", 2));
		circuits.add(new Venue("Inje Speedium", "Inje", Country.SOUTH_KOREA, false, "INJ", 2));
		circuits.add(new Venue("Kazan Ring", "Kazan", Country.RUSSIA, false, "KAZ", 2));
		circuits.add(new Venue("Kyalami Circuit", "Kyalami", Country.SOUTH_AFRICA, false, "KYA", 2));
		circuits.add(new Venue("Lime Rock Park", "Lime Rock Park", Country.UNITED_STATES, false, "LRP", 2));
		circuits.add(new Venue("Long Beach Street Circuit", "Long Beach", Country.UNITED_STATES, false, "LGB", 2));
		circuits.add(new Venue("Madras Motor Race Track", "Madras", Country.INDIA, false, "MAD", 2));
		circuits.add(new Venue("Mid-Ohio Sports Car Course", "Lexington", Country.UNITED_STATES, false, "MDO", 2));
		circuits.add(new Venue("Misano World Circuit Marco Simoncelli", "Misano", Country.ITALY, false, "MIS", 2));
		circuits.add(new Venue("Motorsport Arena Oschersleben", "Oschersleben", Country.GERMANY, false, "OSC", 2));
		circuits.add(new Venue("Ningbo International Circuit", "Ningbo", Country.CHINA, false, "NNG", 2));
		circuits.add(new Venue("NOLA Motorsports Park", "New Orleans", Country.UNITED_STATES, false, "NOL", 2));
		circuits.add(new Venue("Norisring", "Nuremberg", Country.GERMANY, false, "NOR", 2));
		circuits.add(new Venue("Okayama International Circuit", "Okayama", Country.JAPAN, false, "OKA", 2));
		circuits.add(new Venue("Ordos International Circuit", "Ordos", Country.CHINA, false, "ORD", 2));
		circuits.add(new Venue("Penbay International Circuit", "Penbay", Country.TAIWAN, false, "PEN", 2));
		circuits.add(new Venue("Portland International Raceway", "Portland", Country.UNITED_STATES, false, "PRT", 2));
		circuits.add(new Venue("Potrero de los Funes Circuit", "San Luis", Country.ARGENTINA, false, "SLS", 2));
		circuits.add(new Venue("Road America", "Elkhart Lake", Country.UNITED_STATES, false, "RAM", 2));
		circuits.add(new Venue("Road Atlanta", "Atlanta", Country.UNITED_STATES, false, "RAT", 2));
		circuits.add(new Venue("Sachsenring", "Chemnitz", Country.GERMANY, false, "SAC", 2));
		circuits.add(new Venue("Scandinavian Raceway", "Anderstorp", Country.SWEDEN, false, "AND", 2));
		circuits.add(new Venue("Sebring International Raceway", "Sebring", Country.UNITED_STATES, false, "SEB", 2));
		circuits.add(new Venue("Sentul International Circuit", "Sentul", Country.INDONESIA, false, "SEN", 2));
		circuits.add(new Venue("Snetterton Circuit", "Snetterton", Country.GREAT_BRITAIN, false, "SNE", 2));
		circuits.add(new Venue("Sonoma Raceway", "Sonoma", Country.UNITED_STATES, false, "SON", 2));
		circuits.add(new Venue("Sportsland Sugo", "Murata", Country.JAPAN, false, "SUG", 2));
		circuits.add(new Venue("St Petersburg Street Circuit", "St Petersburg", Country.UNITED_STATES, false, "STP", 2));
		circuits.add(new Venue("Sydney Motorsport Park", "Sydney", Country.AUSTRALIA, false, "SYD", 2));
		circuits.add(new Venue("The Bend Motorsport Park", "Tailem Bend", Country.AUSTRALIA, false, "TBD", 2));
		circuits.add(new Venue("Tokachi International Speedway", "Hokkaido", Country.JAPAN, false, "TOK", 2));
		circuits.add(new Venue("Toronto Street Circuit", "Toronto", Country.CANADA, false, "TOR", 2));
		circuits.add(new Venue("Twin Ring Motegi", "Motegi", Country.JAPAN, false, "MTG", 2));
		circuits.add(new Venue("Vallelunga Circuit", "Vallelunga", Country.ITALY, false, "VLL", 2));
		circuits.add(new Venue("Virginia International Raceway", "Virginia", Country.UNITED_STATES, false, "VIR", 2));
		circuits.add(new Venue("Watkins Glen International", "Watkins Glen", Country.UNITED_STATES, false, "WTG", 2));
		circuits.add(new Venue("WeatherTech Raceway Laguna Seca", "Laguna Seca", Country.UNITED_STATES, false, "LGS", 2));
		circuits.add(new Venue("Zhejiang International Circuit", "Zhejiang", Country.CHINA, false, "ZHE", 2));
		circuits.add(new Venue("Zhuhai International Circuit", "Zhuhai", Country.CHINA, false, "ZHU", 2));
		
		circuits.add(new Venue("Adelaide Street Circuit", "Adelaide", Country.AUSTRALIA, false, "ADE", 3));
		circuits.add(new Venue("Auto World Tianjin", "Tianjin", Country.CHINA, false, "TJN", 3));
		circuits.add(new Venue("Autodromo Velo Citta", "Rodovia", Country.BRAZIL, false, "VCT", 3));
		circuits.add(new Venue("Bucharest Ring", "Bucharest", Country.ROMANIA, false, "BUC", 3));
		circuits.add(new Venue("Chengdu International Circuit", "Chengdu", Country.CHINA, false, "CGD", 3));
		circuits.add(new Venue("Circuit Chris Amon", "Pukekohe", Country.NEW_ZEALAND, false, "PUK", 3));
		circuits.add(new Venue("Circuit de Dakar Baobabs", "Dakar", Country.SENEGAL, false, "DAK", 3));
		circuits.add(new Venue("Everland Speedway", "Gyeonggi-do", Country.SOUTH_KOREA, false, "EVE", 3));
		circuits.add(new Venue("Hamilton Street Circuit", "Hamilton", Country.NEW_ZEALAND, false, "HAM", 3));
		circuits.add(new Venue("Highlands Motorsport Park", "Otago", Country.NEW_ZEALAND, false, "HIG", 3));
		circuits.add(new Venue("Mantorp Park", "Mantorp", Country.SWEDEN, false, "MAN", 3));
		circuits.add(new Venue("Mount Panorama Circuit", "Bathurst", Country.AUSTRALIA, false, "MTP", 3));
		circuits.add(new Venue("Newcastle Street Circuit", "Newcastle", Country.AUSTRALIA, false, "NEW", 3));
		circuits.add(new Venue("Phillip Island Grand Prix Circuit", "Phillip Island", Country.AUSTRALIA, false, "PIS", 3));
		circuits.add(new Venue("Rudskogen Motorsenter", "Rudskogen", Country.NORWAY, false, "RUD", 3));
		circuits.add(new Venue("Rustavi International Motorpark", "Rustavi", Country.GEORGIA, false, "RSV", 3));
		circuits.add(new Venue("Sydney Olympic Park Circuit", "Homebush", Country.AUSTRALIA, false, "SOP", 3));
		circuits.add(new Venue("Townsville Street Circuit", "Townsville", Country.AUSTRALIA, false, "TOW", 3));
		circuits.add(new Venue("Transilvania Motor Ring", "Transilvania", Country.ROMANIA, false, "TRA", 3));
		
		circuits.add(new Venue("Autodromo Tocancipa", "Nurburgring", Country.GERMANY, false, "NUR", 4));
		circuits.add(new Venue("Automotodrom Grobnik", "Grobnik", Country.CROATIA, false, "GRB", 4));
		circuits.add(new Venue("Reem International Circuit", "Ar Reem", Country.SAUDI_ARABIA, false, "REE", 4));
		
		int[] grandsPrix = new int[50];
		
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
		
		for (LocalDate d: calendarDates) {
			int location = rnd.nextInt(selectedVenues.size());
			Venue selected = selectedVenues.get(location);
			calendar.add(new RaceWeekend(d, selected));
			selectedVenues.removeIf(v -> v.imageCode == selected.imageCode);
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
		for (int i = 2020; i < 2021; i++) {
			new RaceCalendar(i);
		}
	}

}
