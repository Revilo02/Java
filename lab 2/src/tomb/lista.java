package tomb;
import java.util.Scanner;
import java.util.ArrayList;
public class lista {
	 public static void lista10()
	{
		Scanner sc=new Scanner(System.in);
		int szam=0;
		double atlag=0;
		ArrayList<Integer> szamok =new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			szam=sc.nextInt();
			szamok.add(szam);
			atlag+=szam;
		}
		atlag=atlag/szamok.size();
		for(int j=0; j<szamok.size();j++)
		{
			
			if (szamok.get(j)>atlag)
				System.out.println(szamok.get(j));
		}
		sc.close();
	}
	
}
