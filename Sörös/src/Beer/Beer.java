package Beer;

public class Beer {
	private String name;
	private String style;
	private double strength;
	
	public Beer(String n, String s, double st) {
		this.name = n;
		this.style = s;
		this.strength = st;
	}
	public String getName() {
		return this.name;
	}
	public String getStyle() {
		return this.style;
	}
	public double getStrength() {
		return this.strength;
	}
	public String toString() {
		return ("Name: " + this.name + " Style: " + this.style + " Strength: " + this.strength);
	}
}