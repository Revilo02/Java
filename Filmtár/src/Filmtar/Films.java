package Filmtar;

import java.util.ArrayList;

public class Films {
	
	private String title; 
	private double playtime; 
	private double premier; 
	private double agelimit;
	private String category; 
	private String actors ;
	
	//Films osztályom konstruktora
	public Films(String title, double playtime, double premier, double agelimit, String category, String actors) {
		this.title = title;
		this.playtime = playtime;
		this.premier = premier;
		this.agelimit = agelimit;
		this.category = category;
		this.actors = actors;
	}
	
// az addot argumentumok get-methodusa
	public String getTitle() {
		return title;
	}
	
	public double getPremier() {
		return premier;
	}
	
	public String getCategory() {
		return category;
	}
	public String  getActors() {
		return actors;
	}
	
	public void setTitle(String cim) {
		title=cim;
	}
	
	public void setCategory(String kategoria) {
		category=kategoria;
	}
	
	
	public void setActor(String szinesz) {
		actors=szinesz;
	}
	
	public void setPlaytime(double ido) {
		playtime=ido;
	}
	public void setPremier(double kiadasi_ev) {
		premier=kiadasi_ev;
	}
	
	public void setAgelimit(double korhatar) {
		agelimit=korhatar;
	}
	
	
	// Films osztályom toString methodusa
	public String toString() {
		return title +";"+ " " + playtime +";" +" "+ premier+";"+" "+agelimit+";"+" "+category+";"+" "+actors;
	}
}

