package pm;

public class parameter {
	static void ki2(int a ,int b) {
		System.out.println(a+" "+b);
	}
	static int[] elo2(int a ,int b) {
		int tomb[]=new int[2];
		tomb[0]=-a;
		tomb[1]=-b;
		
		
		return tomb;
	}
	static public void main(String[] args)
	{
		int a=2,b=3;
		ki2(a,b);
		System.out.println(elo2(a,b)[0]+" "+elo2(a,b)[1]);
		/* 1,elo2 meghívása elõtt magát a számot
		 * 2,a szám ellentetjét
		 * 
		 * 
		 */
	}
}
