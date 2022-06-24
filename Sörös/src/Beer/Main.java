package Beer;

import java.util.*;

public class Main {
	
	static ArrayList<Beer> tarolo = new ArrayList<Beer>();
	
	protected static void add(String[] cmd) {
		tarolo.add(new Beer(cmd[1],cmd[2],Double.parseDouble(cmd[3])));
	}
	
	protected static void list(String[] cmd) {
		if(cmd[1].equals("name")) {
			Collections.sort(tarolo, new NameComparator());
		} else if(cmd[1].equals("style")) {
			Collections.sort(tarolo, new StyleComparator());
		} else if(cmd[1].equals("strength")) {
			Collections.sort(tarolo, new StrengthComparator());
		} 
		for(int i=0; i < tarolo.size();i++) {
			System.out.println(tarolo.get(i).toString());
		}
	}
	protected static void search(String[] cmd) {
		if(cmd[1].equals("name"))
		for(int i=0;i<tarolo.size();i++) {
			if(tarolo.get(i).getName().equals(cmd[2]))
				System.out.println(tarolo.get(i));
		}
		else if(cmd[1].equals("style")) {
			for(int i=0;i<tarolo.size();i++) {
				if(tarolo.get(i).getStyle().equals(cmd[2]))
					System.out.println(tarolo.get(i));
			}
		}
		else if(cmd[1].equals("strength")) {
			for(int i=0;i<tarolo.size();i++) {
				if(tarolo.get(i).getStrength()==(Double.parseDouble(cmd[2])))
					System.out.println(tarolo.get(i));
			}
		}
		
	}
	protected static void find(String[] cmd) {
		if(cmd[1].equals("name"))
			for(int i=0;i<tarolo.size();i++) {
				if(tarolo.get(i).getName().contains(cmd[2]))
					System.out.println(tarolo.get(i));
			}
			else if(cmd[1].equals("style")) {
				for(int i=0;i<tarolo.size();i++) {
					if(tarolo.get(i).getStyle().contains(cmd[2]))
						System.out.println(tarolo.get(i));
				}
			}
			else if(cmd[1].equals("strength")) {
				for(int i=0;i<tarolo.size();i++) {
					if(tarolo.get(i).getStrength()==(Double.parseDouble(cmd[2])))
						System.out.println(tarolo.get(i));
				}
			}
	}
	
	public static void remove(String[] cmd) {
		for(int i=0;i<tarolo.size();i++) {
			if(tarolo.get(i).getName().equals(cmd[1]))
				tarolo.remove(i);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		tarolo.add(new Beer("V", "s", 0));
		tarolo.add(new Beer("B", "s", 0));
		tarolo.add(new Beer("K", "s", 0));
		while(true) {
			String line = s.nextLine();
			String[] cmd = line.split(" ");
			if(cmd[0].equals("exit")) {
				s.close();
				break;
			} else if(cmd[0].equals("add")) {
				add(cmd);
			} else if(cmd[0].equals("list")) {
				list(cmd);
			} else if(cmd[0].equals("search")) {
				search(cmd) ;
			} else if(cmd[0].equals("find")) {
				find(cmd);
			}else if(cmd[0].equals("remove")) {
				remove(cmd);			}
		}
	}

}
