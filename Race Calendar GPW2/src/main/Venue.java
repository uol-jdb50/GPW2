package main;

public class Venue {

	public String name;
	public String shortName;
	public Country country;
	public boolean lastYear;
	
	public Venue(String name, String shortName, Country country, boolean lastYear) {
		this.name = name;
		this.shortName = shortName;
		this.country = country;
		this.lastYear = lastYear;
	}
	
}
