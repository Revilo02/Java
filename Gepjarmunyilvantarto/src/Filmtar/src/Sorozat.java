package Filmtar.src;

public class Sorozat extends Videoanyag {
	private int reszek;
	/**
	 * fsadgfdasgdgas szép vagy ma Ádi
	 * 
	 */
	public Sorozat(String cim,String mufaj, int ev,  int reszek) {
		super(cim,mufaj,ev);
		this.reszek=reszek;
	}
	
	public int getReszek() {return reszek;}
	
	public String toString() {
		return super.getCim()+"\t"+super.getMufaj()+"\t"+super.getEv()+"\t"+this.reszek;
	}
	
	public String toFajlba() {return "Sorozat"+";"+this.getCim()+";"+this.getMufaj()+";"+this.getEv()+";"+this.getReszek();}

}
