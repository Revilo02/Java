package gyakorlo;

public class masodik {
	
	static int szam(int szam) {
		int sv=0;
		for(int i=1;i<(Math.sqrt(szam))+1;i++)
		{
			if (szam%i==0 )
			{
				
				sv=sv+szam/i+i;
			}
		}

		return sv-szam;
	}
	static boolean baratsag(int egyik,int masik)
	{
		
		if (szam(egyik)==masik & szam(masik)==egyik)
			
			return true;
		else return false;
	
		 
	}
	
	static public void main(String[] args)
	{
		System.out.println(baratsag(220,284));
	}
}
