package sportk;

public class Sport {
	private String nev;
	private Tanar tan;
	private String idopont;
	private Sportolok sportolok[];

	public Sport(String n, Tanar t, String i, int sp) {
		nev = n;
		tan = t;
		idopont = i;
		sportolok = new Sportolok[sp];
	}

	public String getNev() {
		return nev;
	}

	public Tanar getT() {
		return tan;
	}

	public String getIdopont() {
		return idopont;
	}

}
