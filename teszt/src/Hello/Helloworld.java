package Hello;
import java.util.Scanner;
import java.util.ArrayList;
public class Helloworld 

{
	static public void main(String[] args) 
	{
		ArrayList<Integer> szamok = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		int x=0;
		int ossz=0;
		while (x<10)
		{
			System.out.println("szam:");
			int szam = input.nextInt();
			ossz+=szam;
			szamok.add(szam);
			x+=1;
		}
		input.close();
		double atlag=ossz/10;
		System.out.println("Az átlaguk: " + atlag);
		System.out.print("Az átlagnál nagyobb számok : ");
		for (int i = 0; i < szamok.size(); i++) 
			{
				if (szamok.get(i)>atlag)
					System.out.print(szamok.get(i)+" ");
			}
	}
}