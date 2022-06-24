package konyvtar;

public class Konyvek {
	private int ID;
	static  protected int IDplus;
	
	private String name;
	private String szerzo;
	private String mufaj;
	private int kiadaseve;
	private boolean kiadva;
	private String leiras;
	Konyvek(String name,String szerzo,String mufaj,int kiadaseve){
		ID=++IDplus;
		this.name=name;
		this.szerzo=szerzo;
		this.mufaj=mufaj;
		this.kiadaseve=kiadaseve;
		this.leiras="M�g nincs le�r�s hozz�adva";
		this.kiadva=false;
	}
	/**
	 * 
	 * @return a K�nyv nev�vel t�r vissza
	 */
	public String getName() {return name;}
	/**
	 * 
	 * @return a k�nyv szerz�j�vel t�r vissza
	 */
	public String getSzerzo() {return szerzo;}
	/**
	 * 
	 * @return a k�nyv kiad�s�v�vel t�r vissza
	 */
	
	public int getKiadaseve() { return kiadaseve;}
	/**
	 * 
	 * @return a k�nv m�faj�val t�r vissza
	 */
	public String getMufaj() {return mufaj;}
	/**
	 * 
	 * @return true vagy false �rt�kkel t�r vissza annak f�ggv�ny�ben hogy ki lett-e adva a k�nyv
	 */
	public boolean getKiadva() {return kiadva;}
	/**
	 * 
	 * @return az opcion�lisan hozz�adhat� le�r�ssal t�r vissza
	 */
	public String getLeiras() {return leiras;}
	/**
	 * 
	 * @param ki param�ter �ll�tja �t a konstruktorban a kiadv�t annak f�ggv�ny�ben hogy a k�nyvet visszahoztuk-e vagy �pp kiadjuk-e az olvas� r�sz�re
	 */
	public void setKiadva(boolean ki) {kiadva=ki;}
	/**
	 * @return a felhaszn�l� sz�m�ra �rtelmezhet� m�don val� kiirat�si Stringgel t�r vissza
	 */
	public String toString()
	{return ID+", "+name+", "+szerzo+", "+mufaj+", "+kiadaseve+", "+leiras;}
	/**
	 * 
	 * @return a k�nyv egyedi azonos�t�j�v�l t�r vissza
	 */
	public int getID() {return ID;}
	/**
	 * 
	 * @param �t�ll�tja az ID �s az ID plus met�dust a f�jlbeolvas�sn�l KELL haszn�lni
	 */
	public void setID(int id) {this.ID=id;IDplus=ID;}
	/**
	 * 
	 * @param n param�terrel �ll�thatjuk �t a k�nyv c�m�t
	 */
	public void setName(String n) {name=n;}
	/**
	 * 
	 * @param sz param�terrel �ll�tjuk �t a p�ld�nyos�tott k�nyv szerz�j�t
	 */
	public void setSzerzo(String sz) {szerzo=sz;}
	/**
	 * 
	 * @param i a kiad�s�v�t lehet vele m�dos�tani
	 */
	public void setKiadaseve(int i) {kiadaseve=i;}
	/**
	 * 
	 * @param m a k�nyv m�faj�t lehet vele m�dos�tani
	 */
	public void setMufaj(String m) {mufaj=m;}
	/**
	 * 
	 * @param le a k�nyv le�r�s�t lehet m�dos�tani , ez egy szabadon v�laszthat� opci� a k�nyv l�trehoz�s�n�l
	 */
	public void setLeiras(String le) {leiras=le;}
	/**
	 * 
	 * F�jlba �r�shoz ezt a met�dust haszn�ljuk ;-vel vannak elv�lasztva az adattagok hogy visszaolvas�sn�l megtudjuk k�l�nb�ztetni hogy melyik adattag m�gis mi
	 */
	public String toFile()
	{return ID+";"+name+";"+szerzo+";"+mufaj+";"+kiadaseve+";"+leiras+"\n";}
	
}
