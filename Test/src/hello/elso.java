package feladatok;

public class elso 
{
	static int osztokSzama(int x)
	{
		int db=0;
		int n=1;
		while (x >= n)
		{
			if (x % n == 0)
			{
				db+=1;
			}
			n += 1;
		}
		return db;
	}
	static boolean prim_e(int z)
	{
		if (z == 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		int szam = 79;
		System.out.println(osztokSzama(szam));
		System.out.println(prim_e(osztokSzama(szam)));
		int van = 0;
		for(int y = 2; van < 100; y++);
			{
				if (prim_e(osztokSzama(y)))
				{
					System.out.println(y+" ");
					van+=1;
				}
			}
				
		
	}
}
