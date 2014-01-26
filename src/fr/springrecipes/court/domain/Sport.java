package fr.springrecipes.court.domain;

public class Sport {

	private String name ;
	private String club ;
	
	
	public Sport () {
		
	}
	
	public Sport(String name, String club) {
		
		this.name = name;
		this.club = club;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	

}
