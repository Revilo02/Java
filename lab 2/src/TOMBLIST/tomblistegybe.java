package TOMBLIST;
import java.util.Scanner;
import java.util.ArrayList;
public class tomblistegybe {
	static void tombki(int[] t)
	{
		for (int i=0;i<t.length;i++)
		{
			System.out.print(t[i]+" ");
		}
		System.out.println();
	}
	static int [] tombpoz(int [] t )
	{
		for (int i=0;i<t.length;i++) {
			if(t[i]<0) {
				t[i]=0-t[i];
			}
		}
		return t;
	}
	static void listki(ArrayList<Integer> l) {
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");
			//System.out.println(l.get(i));
		}
		System.out.println();
	}
	static ArrayList<Integer> listpoz(ArrayList<Integer> l)
	{
		
		for (int i=0;i<l.size();i++)
		{
			if(l.get(i)<0)
			{
			
				l.add(i,-l.get(i));
				l.remove(i+1);
			}
		}
		return l;
	}
	static public void main(String[] args)
	{	Scanner sc=new Scanner(System.in);
		ArrayList<Integer> l=new ArrayList<Integer>();
	
		int t[]=new int[10];
		for(int i=0;i<t.length;i++)
			{
				t[i]=sc.nextInt();
				l.add(t[i]);
			}
		sc.close();
		tombki(t);
		tombpoz(t);
		tombki(t);
		listki(l);
		listpoz(l);
		listki(l);
	}
}
