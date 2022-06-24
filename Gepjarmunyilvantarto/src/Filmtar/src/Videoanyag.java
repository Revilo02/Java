package Filmtar.src;

abstract class Videoanyag {
	private String cim; 
	private String mufaj; //kisbetûvel  megadva
	private int ev;
	
	public Videoanyag(String cim, String mufaj, int ev) {
		this.cim=cim; this.mufaj=mufaj; this.ev=ev;
	}
	
	public String getCim() {return cim;}
	public int getEv() {return ev;}
	public String getMufaj() {return mufaj;}
	abstract public String toFajlba() ;
	
	/*
	 * Amikor késõbb létrehozod a Sorozatban is a toFajlba töröld itt a return-t 
	 * és állítsd át abstractra ezt
	 */
}
