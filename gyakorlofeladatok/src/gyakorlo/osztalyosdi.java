package gyakorlo;

//import java.util.Scanner;

public class osztalyosdi {

	private int fokszam,db;
	private char valtozo;
	public String toString() 
	{
	 String s=(this.fokszam+","+this.valtozo+","+this.db);
	 return s;
	}
	static public void main(String[] args)
	{
//		Scanner sc=new Scanner(System.in) ;
		osztalyosdi o[]=new osztalyosdi[10];
		for(int i=0 ;i<o.length;i++)
			{
				o[i]=new osztalyosdi();
				o[i].fokszam=i+10;
			
				o[i].valtozo='v';
				o[i].db=i+20;
			}
		
	}
}
