package fr.springrecipes.court.service;

import java.util.List;

import fr.springrecipes.court.domain.Reservation;

public interface ReservationService {
	
	public List<Reservation> query(String courtName);


}
