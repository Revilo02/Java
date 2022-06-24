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
		this.leiras="Még nincs leírás hozzáadva";
		this.kiadva=false;
	}
	/**
	 * 
	 * @return a Könyv nevével tér vissza
	 */
	public String getName() {return name;}
	/**
	 * 
	 * @return a könyv szerzõjével tér vissza
	 */
	public String getSzerzo() {return szerzo;}
	/**
	 * 
	 * @return a könyv kiadásévével tér vissza
	 */
	
	public int getKiadaseve() { return kiadaseve;}
	/**
	 * 
	 * @return a könv mûfajával tér vissza
	 */
	public String getMufaj() {return mufaj;}
	/**
	 * 
	 * @return true vagy false értékkel tér vissza annak függvényében hogy ki lett-e adva a könyv
	 */
	public boolean getKiadva() {return kiadva;}
	/**
	 * 
	 * @return az opcionálisan hozzáadható leírással tér vissza
	 */
	public String getLeiras() {return leiras;}
	/**
	 * 
	 * @param ki paraméter állítja át a konstruktorban a kiadvát annak függvényében hogy a könyvet visszahoztuk-e vagy épp kiadjuk-e az olvasó részére
	 */
	public void setKiadva(boolean ki) {kiadva=ki;}
	/**
	 * @return a felhasználó számára értelmezhetõ módon való kiiratási Stringgel tér vissza
	 */
	public String toString()
	{return ID+", "+name+", "+szerzo+", "+mufaj+", "+kiadaseve+", "+leiras;}
	/**
	 * 
	 * @return a könyv egyedi azonosítójávál tér vissza
	 */
	public int getID() {return ID;}
	/**
	 * 
	 * @param átállítja az ID és az ID plus metódust a fájlbeolvasásnál KELL használni
	 */
	public void setID(int id) {this.ID=id;IDplus=ID;}
	/**
	 * 
	 * @param n paraméterrel állíthatjuk át a könyv címét
	 */
	public void setName(String n) {name=n;}
	/**
	 * 
	 * @param sz paraméterrel állítjuk át a példányosított könyv szerzõjét
	 */
	public void setSzerzo(String sz) {szerzo=sz;}
	/**
	 * 
	 * @param i a kiadásévét lehet vele módosítani
	 */
	public void setKiadaseve(int i) {kiadaseve=i;}
	/**
	 * 
	 * @param m a könyv mûfaját lehet vele módosítani
	 */
	public void setMufaj(String m) {mufaj=m;}
	/**
	 * 
	 * @param le a könyv leírását lehet módosítani , ez egy szabadon választható opció a könyv létrehozásánál
	 */
	public void setLeiras(String le) {leiras=le;}
	/**
	 * 
	 * Fájlba íráshoz ezt a metódust használjuk ;-vel vannak elválasztva az adattagok hogy visszaolvasásnál megtudjuk különböztetni hogy melyik adattag mégis mi
	 */
	public String toFile()
	{return ID+";"+name+";"+szerzo+";"+mufaj+";"+kiadaseve+";"+leiras+"\n";}
	
}
