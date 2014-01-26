package fr.springrecipes.court.domain;

import java.util.Date;

public class Reservation {
	private Date date;
    private int hour;
    private Person player;
    private Sport sport;
    

	public Reservation( Person player,Sport sport,Date date, int hour) {
	
		this.date = date;
		this.hour = hour;
		this.player = player;
		this.sport = sport;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public Person getPlayer() {
		return player;
	}
	public void setPlayer(Person player) {
		this.player = player;
	}
	public Sport getSport() {
		return sport;
	}
	public void setSport(Sport sport) {
		this.sport = sport;
	}
	
    
	
	


}
