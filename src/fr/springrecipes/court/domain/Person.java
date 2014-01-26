package fr.springrecipes.court.domain;


public class Person {

	private String nom;
	private String prenom;
	
	private String age ;
	
	private String pays;
	private String pass;
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	private Sport sport ;

	
	public Person() {
		
	}
	public Person(Sport sport) {
		this.sport = sport;
	}
	public Person(String nom, String age){
		this.nom = nom;
		this.age = age;
	}
public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}


	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	public Sport getSport() {
		return sport;
	}
	public void setSport(Sport sport) {
		this.sport = sport;
	}
}
