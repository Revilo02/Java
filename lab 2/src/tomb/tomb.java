package tomb;
import java.util.Scanner;
import java.util.ArrayList;
public class tomb {
	static void tombok()
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		double atlag=0;
		int be=0;
		for (int i=0;i<a.length;i++)
		{
			be=sc.nextInt();
			atlag=be+atlag;
			a[i]=be ;
		}
		atlag=atlag/a.length;
		for (int i=0;i<a.length;i++)
		{
			
			if(atlag<a[i])
			{
				
				System.out.println(a[i]);
			}
		}
	
	}
	
	static public void main(String[] args) {
		tombok();
		lista10();
		
	}

	
}
