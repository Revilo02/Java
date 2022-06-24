package hello;

public class Helloworld {
	static int osztokSzama(int szam) {
		int db = 0;
		for (int i = 1; i <= szam; i++) {
			if (szam % i == 0) {
				db++;
				} 
		}
		return db;
	}
	
	static boolean prim_e(int szam) {
		if (osztokSzama(szam) == 2) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int sv=0;
		int i=2;
		while(sv<100)	
		{
			if(prim_e(i)==true) {
				System.out.println(i);
				
				sv++;
			}
			i++;
		}
	}
}
