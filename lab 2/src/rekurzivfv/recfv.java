package rekurzivfv;

public class recfv {
	static int fakt(int sz)
	{
		
		if (sz==1)
			return sz;
		if (sz<0)
			return 0;
		
		else 
			{
			return sz*fakt(sz-1);
			}
	}
	static int fib_szam(int n)
	{
		if (n<=1)
			return n;
		else return fib_szam(n-1)+(fib_szam(n-2));
		
		
	}
	static public void main(String[] args)
	{
		System.out.println(fakt(17));
		System.out.print(fib_szam(40));
		System.out.println();
		System.out.print("v�ge");
		
	}
}
