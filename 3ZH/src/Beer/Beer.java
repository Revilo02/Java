package labor8;

public class Beer 
{
	private String name;
	private String style;
	private double strength;
	
	public Beer(String name, String style, double strength)
	{
		this.name = name;
		this.style = style;
		this.strength = strength;
	}

	public String getName() {
		return name;
	}

	public String getStyle() {
		return style;
	}

	public double getStrength() {
		return strength;
	}
	
	public String toString()
	{
		return "S�r neve: " + name + "\n" +
				"S�r jellege: " + style + "\n" +
				"S�r alkoholszintje: " + strength;
	}
}
