package sportk;

public class Sportolok extends Emberek {
	private int ID;
	static private int IDno;
	private String szint; // kezd�, halad�

	public Sportolok(String n, int s, String e, String sz) {
		super(n, s, e);
		szint = sz;
		ID = ++IDno;
	}

	public int getID() {
		return ID;
		
	}

	public String getSzint() {
		return szint;
	}

	public void setSzint(String sz) {
		szint = sz;
	}

	public String toString() {
		return ID + ", " + super.toString() + ", " + szint;
	}

}
