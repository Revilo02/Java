package labor8;

import java.util.Scanner();
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Main {

	public static ArrayList<Beer> sorok = new ArrayList<Beer>();
	public static ArrayList<Command> commands = new ArrayList<>();
	public static void main(String[] args) throws IOException 
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//Beer sor1 = new Beer("krusovice","cerné",3.8);
		//Beer sor2 = new Beer("krusovice","svetlé",4.2);
		//System.out.println(sor1.toString());
		//System.out.println(sor2.toString());
		Command add = new Add("add");
		Command list = new List("list");
		commands.add(add);
		commands.add(list);
		while(true)
		{
			String[] cmd = bf.readLine().split(" ");
			System.out.println(cmd[0]);
			System.out.println(cmd.length);
			if(add.getName().equals(cmd[0]))
			{
				add.action(sorok, cmd);
			}
			else if(list.getName().equals(cmd[0]))
			{
				if(cmd.length > 1)
				{
					if(cmd[1].equals("name"))
					{
						Collections.sort(sorok,new NameComparator());
						list.action(sorok, cmd);
					}
					else if(cmd[1].equals("strength"))
					{
						Collections.sort(sorok, new StrengthComparator());
						list.action(sorok, cmd);
					}
					else if(cmd[1].equals("style"))
					{
						Collections.sort(sorok, new StyleComparator());
						list.action(sorok, cmd);
					}
					else
						list.action(sorok, cmd);
				}
				else
					list.action(sorok, cmd);
			}
			else if("exit".equals(cmd[0]))
				break;
		}
		bf.close();
	}
}
