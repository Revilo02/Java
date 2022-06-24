//package szakasz;
import java.util.Scanner;

public class szakasz {
		static public void main (String[] args)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Adja meg ; elv�lasztva az els� koordin�ta x �s y �rt�k�t") ;
			String bex=input.nextLine();
			System.out.println("Adja meg ; elv�lasztva a m�sodik koordin�ta  x �s y �rt�k�t") ;
			String bey=input.nextLine();
			double a[]=new double[4]; 
			a[0]=Double.parseDouble(bex.split(";")[0]) ;
			a[1]=Double.parseDouble(bex.split(";")[1]) ;
			a[2]=Double.parseDouble(bey.split(";")[0]) ;
			a[3]=Double.parseDouble(bey.split(";")[1]) ;
			System.out.println(Math.sqrt((a[2]-a[0])*(a[2]-a[0]))+(a[3]-a[1])*(a[3]-a[1]));
			
		}
				
}

