package main;

public class Venue {

	public String name;
	public String shortName;
	public Country country;
	public boolean lastYear;
	public String imageCode;
	public int grade;
	
	public Venue(String name, String shortName, Country country, boolean lastYear, String imageCode, int grade) {
		this.name = name;
		this.shortName = shortName;
		this.country = country;
		this.lastYear = lastYear;
		this.imageCode = imageCode;
		this.grade = grade;
	}
	
}
