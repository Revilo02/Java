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
	 * @return az olvas� name param�ter�vel t�r vissza
	 */
	public String getName() {return name;}
	/**
	 * 
	 * @return az olvas� el�rhet�s�g�vel t�r vissza
	 */
	public String getElerhetoseg() {return elerhetoseg;}
	/**
	 * 
	 * @return az olvas� ID-j�val t�r vissza
	 */
	public int getID() {return ID;}
  /**
   * @return az olvas� adattagjainak kiirat�s�val t�r vissza
   */
	public String toString() {return ID+", "+name+", "+elerhetoseg;}
	/**
	 * 
	 * @param n-el lehet m�dos�tani az olvas�t
	 */
	public void namemodosit(String n) {name=n;}
	/**
	 * 
	 * @param e-vel lehet az el�rhet�s�get m�dos�tani
	 */
	public void elerhetosegmodosit(String e) {elerhetoseg=e;}
	/**
	 * 
	 * @param a az olvas� ID-j�t m�dos�tja ezt is csak beolvas�sn�l KELL haszn�lni
	 */
	public void setID(int a) {ID=a;
							IDplusz=a;}
	/**
	 * 
	 * @param k az olvas� k�nyveinek list�j�hoz  ad egy �j k�nyvet
	 */
	public void konyvadd(Konyvek k) {
			a.add(k);		
	}
	/**
	 * 
	 * @return az olvas� k�nyveinek list�j�val t�r vissza
	 */
	public ArrayList<Konyvek> listaz(){
		return a;
	}
	/**
	 * 
	 * F�jlba �r�shoz ezt a met�dust haszn�ljuk ;-vel vannak elv�lasztva az adattagok hogy visszaolvas�sn�l megtudjuk k�l�nb�ztetni hogy melyik adattag m�gis mi
	 *,de a k�nyvek ID-jai m�r sz�k�zzel vannak elv�lasztva egym�st�l mivel azt nem tudhatjuk el�re hogy 5 vagy 10 k�nyve lesz kiv�ve az olvas�nak
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
