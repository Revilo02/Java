package Maximum;
import java.util.Scanner;
public class Kiválasztás {
	static public void main(String[] args)
	{
		Scanner sc=new Scanner(System.in) ;
		double sv=0; //legnagyobb szám
		double min=-1;
		double be;
		double second=0; 
		do {
			be=sc.nextInt();
			if (be>sv)
				{
					second=sv;
					sv=be;				
				}
			if (min==-1 || min>be & be>0)
			{
				min=be;
			}
			
			}
		while(be>=0);
		System.out.println("A legnagyobb beolvasott szám :"+sv);
		System.out.println("A 2. legnagyobb beolvasott szám :"+second);
		System.out.println("A legkisebb beolvasott szám :"+min);
	}
}
