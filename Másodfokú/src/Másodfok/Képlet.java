package M�sodfok;
import java.util.Scanner;

public class K�plet {
	
	static public void main (String[] args)
		{	
			Scanner sc = new Scanner(System.in);
			System.out.println("Adja meg a �rt�k�t:");
			double a=sc.nextDouble();
			System.out.println("Adja meg b �rt�k�t");
			double b=sc.nextDouble();
			System.out.println("Adja meg c �rt�k�t");
			double c=sc.nextDouble();
			if(b*b-4*a*c>0)
			{	
				System.out.println("X1= "+(-b+Math.sqrt(b*b-4*a*c))/(2*a));
			   
			    System.out.println("X2= "+(-b-Math.sqrt(b*b-4*a*c))/(2*a));
			}
			else if(b*b-(4*a*c)==0 &a!=0)
				{
					
				System.out.println("X1=X2="+(-b/(2*a)));
				}
				else System.out.println("Nincs megold�s");
			}
		}

