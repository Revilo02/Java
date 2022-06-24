package Beer;

import java.util.ArrayList;

public abstract class Command {
	private String name;
	public Command(String n) {this.name=n;};
	public String getName() {return name;}
	abstract void action(ArrayList<Beer> beers, String[] cmd);
}
