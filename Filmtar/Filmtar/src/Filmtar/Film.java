package Filmtar;

public class Film extends Videoanyag {
	
	private int hossz; //percben megadva
	private int korhatar;
	private String leiras; //rövid szöveges leírás a filmrõl
	
	public Film(String cim, String mufaj, int ev, int hossz, int korhatar, String leiras) {
		super(cim,mufaj,ev);
		this.hossz=hossz; this.korhatar=korhatar; this.leiras=leiras;
	}
	
	public int getHossz() {return hossz;}
	public int getKorh() {return korhatar;}
	public String getLeiras() {return leiras;}
	
	public String toString() {
		return super.getCim()+"\t"+super.getMufaj()+"\t"+super.getEv()+"\t"+this.hossz+"\t"+this.korhatar+"\t"+this.leiras;
	}
	public String toFajlba() { return "Film"+";"+this.getCim()+";"+this.getMufaj()+";"+this.getEv()+";"+this.getHossz()+";"+this.getKorh()+";"+this.getLeiras();}
}
