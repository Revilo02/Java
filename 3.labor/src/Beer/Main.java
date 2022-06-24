package Beer;
import java.io.IOException;
import java.util.*;

public class Main {

	public static ArrayList<Beer> sorok = new ArrayList<Beer>();
	public static ArrayList<Command> commands = new ArrayList<>();
	public static void main(String[] args) throws IOException 
	{
		Scanner  sc = new Scanner(System.in);
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
			String[] cmd = sc.nextLine().split(" ");
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
		sc.close();
	}
}
/*
public class Main {
	protected void Add(String[] cmd)
	{
			
	}
	static public void main(String[] args) {
		Beer b =new Beer("Guinness", "stout", 4.2);
		Beer c =new Beer("Kõbányai","Fos",1.1);
		Collection <Beer> lista=new ArrayList();
		lista.add(c);
		lista.add(b);
		System.out.println(b);
		System.out.println(c);
		Scanner sc=new Scanner(System.in);
		
		
		//String[] bee=new String[4];
		int ki=0;
		do{
			String be=sc.nextLine();
			String cmd[] =be.split(" ");
			
			
			if (cmd[0].equals("exit"))
				ki=1;
			else if(cmd[0].equals("Add")) {
				lista.add(new Beer(cmd[1],cmd[2],Double.parseDouble(cmd[3])));	
			}
			else if(cmd[0].equals("list")) {
				for(int i=0;i<lista.size();i++) {
					System.out.println(((ArrayList) lista).get(i));
				}
			}
			System.out.println(cmd[0]);
		}while(ki==0);
		
		
		
	}

}

*/