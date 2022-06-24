package labor8;

import java.util.ArrayList;

public abstract class Command 
{
	private String name;
	public Command(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public abstract void action(ArrayList<Beer> beers, String[] cmd);
}
