package gyakorlo;
import java.util.Scanner;
public class elso {
	static boolean tokeletes(double szam) {
		
		double osszeg=0;
		for (int i=0;i<=(int)Math.sqrt(szam);i++)
		{
				if (szam%i==0)
				{					
					osszeg=osszeg+i+szam/i;					
				}		
		}
		osszeg=osszeg-szam;
		if (osszeg==szam)
		{
			return true; 
		}
		else
		{
			return false;
		}		
	}
	static public void main(String[]args)  	{
		Scanner sc=new Scanner(System.in);
		double be=sc.nextDouble();
		if(tokeletes(be)==true)
		{
			System.out.println("Tökéletes");
		}
		else {
			System.out.println("Nem tökéletes");
		}
		
	}
}