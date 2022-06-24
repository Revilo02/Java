package konyvtar;
import java.util.ArrayList;
public class Latogato {
	private String name;
	private String elerhetoseg;
	private  ArrayList<Konyvek> a=new ArrayList<Konyvek>();
	private int ID;
	static private int IDplusz;
	Latogato(String n,String e){
		name=n;
		elerhetoseg=e;
		ID=++IDplusz;
		
	}
	/**
	 * 
	 * @return az olvasó name paraméterével tér vissza
	 */
	public String getName() {return name;}
	/**
	 * 
	 * @return az olvasó elérhetõségével tér vissza
	 */
	public String getElerhetoseg() {return elerhetoseg;}
	/**
	 * 
	 * @return az olvasó ID-jával tér vissza
	 */
	public int getID() {return ID;}
  /**
   * @return az olvasó adattagjainak kiiratásával tér vissza
   */
	public String toString() {return ID+", "+name+", "+elerhetoseg;}
	/**
	 * 
	 * @param n-el lehet módosítani az olvasót
	 */
	public void namemodosit(String n) {name=n;}
	/**
	 * 
	 * @param e-vel lehet az elérhetõséget módosítani
	 */
	public void elerhetosegmodosit(String e) {elerhetoseg=e;}
	/**
	 * 
	 * @param a az olvasó ID-ját módosítja ezt is csak beolvasásnál KELL használni
	 */
	public void setID(int a) {ID=a;
							IDplusz=a;}
	/**
	 * 
	 * @param k az olvasó könyveinek listájához  ad egy új könyvet
	 */
	public void konyvadd(Konyvek k) {
			a.add(k);		
	}
	/**
	 * 
	 * @return az olvasó könyveinek listájával tér vissza
	 */
	public ArrayList<Konyvek> listaz(){
		return a;
	}
	/**
	 * 
	 * Fájlba íráshoz ezt a metódust használjuk ;-vel vannak elválasztva az adattagok hogy visszaolvasásnál megtudjuk különböztetni hogy melyik adattag mégis mi
	 *,de a könyvek ID-jai már szóközzel vannak elválasztva egymástól mivel azt nem tudhatjuk elõre hogy 5 vagy 10 könyve lesz kivéve az olvasónak
	 */
	public String toFile() {
		// TODO Auto-generated method stub
		String ki="";
		ki=ID+";"+name+";"+elerhetoseg+";";
		for(int i=0; i<listaz().size();i++) {
			ki+=this.listaz().get(i).getID();
			if(i!=listaz().size()-1) {
				ki+=" ";
			}
			
		}
		ki+="\n";
		return ki;
	
	}
}
