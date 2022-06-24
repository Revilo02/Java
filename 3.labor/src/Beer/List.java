package Beer;
import java.util.*;
public class List extends Command {

	public List(String name) {
		super(name);
	}

	public void action(ArrayList<Beer> beers, String[] cmd) {
		for (int i = 0; i < beers.size(); i++)
		{
			System.out.println(beers.get(i).toString());
		}
	}
}
