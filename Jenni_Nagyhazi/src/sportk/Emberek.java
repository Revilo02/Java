package sportk;

public abstract class Emberek {
	private String nev;
	private int szev; // szuletési év
	private String email;

	public Emberek(String n, int s, String e) {
		nev = n;
		szev = s;
		email = e;
	}

	public String getNev() {
		return nev;
	}

	public int getSzev() {
		return szev;
	}

	public String getEmail() {
		return email;
	}

	public void setNev(String n) {
		nev = n;
	}

	public void setSzev(int s) {
		szev = s;
	}

	public void setEmail(String e) {
		email = e;
	}

	public String toString() {
		return nev + ", " + szev + ", " + email;
	}
}
