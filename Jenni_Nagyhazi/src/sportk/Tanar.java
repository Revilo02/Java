package sportk;

public class Tanar extends Emberek {
	private int ID;
	static private int IDno;
	private String ertekeles;

	public Tanar(String n, int s, String e, String ert) {
		super(n, s, e);
		ertekeles = ert;
		ID = ++IDno;
	}

	public int getID() {
		return ID;
	}

	public String getErtekeles() {
		return ertekeles;
	}

	public void setErtekeles(String ert) {
		ertekeles = ert;
	}

	public String toString() {
		return ID + ", " + super.toString() + ", " + ertekeles;
	}

}
