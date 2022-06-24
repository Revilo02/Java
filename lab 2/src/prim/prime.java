package prim;

public class prime {
	static private int osztokszama(int szam) {
		int osztokszama=0;
		int i=1;
		while (i<=(int)Math.sqrt(szam))
		{
			if(szam%i==0 ) {
				osztokszama+=2;
			}
			i++;
		}
		
		if(szam%Math.sqrt(szam)==0)
			osztokszama-=1;
		
		return osztokszama;
	}
	static private boolean prime(int szam) {
		if (osztokszama(szam)==2)
			return true;
		else return false;
	}
	static public void main (String[] args)
	{
		int sv=0;
		int i=2;
		while(sv<100)	
		{
			if(prime(i)) {
				System.out.println(i);
				
				sv++;
			}
			i++;
		}
		
	}
}
