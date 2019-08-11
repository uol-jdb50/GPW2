package main;

public class Venue {

	public String name;
	public String shortName;
	public Country country;
	public Region region;
	public boolean lastYear;
	public String imageCode;
	public int grade;
	
	public Venue(String name, String shortName, Country country, Region region, boolean lastYear, String imageCode, int grade) {
		this.name = name;
		this.shortName = shortName;
		this.country = country;
		this.region = region;
		this.lastYear = lastYear;
		this.imageCode = imageCode;
		this.grade = grade;
	}

	public Venue() {
		// TODO Auto-generated constructor stub
	}
	
}
