package fr.springrecipes.court.service;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import fr.springrecipes.court.domain.Person;
import fr.springrecipes.court.domain.Reservation;
import fr.springrecipes.court.domain.Sport;

public class ReservationServiceImpl implements ReservationService {

	public static final Sport FOOT = new Sport("FOOT", "CASACLUB");
	public static final Sport TENNIS = new Sport("TENNIS", "CASACLUB");
	public static final Person p1 = new Person("P1","24");
	public static final Person p2 = new Person("p2","30");
	
	private List<Reservation> reservations ;
	
	public ReservationServiceImpl() {
		reservations = new ArrayList<Reservation>();
		reservations.add(new Reservation(p1, FOOT, new GregorianCalendar(2014, 01, 14).getTime(), 16));
		reservations.add(new Reservation(p1, FOOT, new GregorianCalendar(2012, 04, 12).getTime(), 17));
	}
	  
	public List<Reservation> query(String FOOT) {
		List<Reservation> result = new ArrayList<Reservation>();
        for (Reservation reservation : reservations) {
            if (reservation.getSport().getName().equals(FOOT)) {
                result.add(reservation);
            }
        }
        return result;

	}
    
}
