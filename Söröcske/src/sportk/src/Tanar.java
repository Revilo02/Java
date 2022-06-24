package sportk.src;

public class Tanar {
	private String nev;
	private int szev; //szuletési év
	private String email;
	
	public Tanar(String n, int s, String e) {
		nev=n;
		szev=s;
		email=e;
	}
	public String getNev() { return nev; }
	public int getSzev() { return szev; }
	public String getEmail() { return email; }
	
	public String toString() {
		return nev+", "+szev+", "+email;
	}


}
