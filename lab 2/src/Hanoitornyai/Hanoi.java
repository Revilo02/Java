package Hanoitornyai;

public class Hanoi {
	
	static void tornyok(int n,char honnan,char seged,char hova)
	{
		if (n==0)
			return ;
	    tornyok (n - 1,honnan, hova, seged);
	    System.out.println("rakj 1-et "+  honnan  +"---> " + hova );
	    tornyok(n - 1, seged, honnan, hova);
	}
	static public void main(String[] args) {
		tornyok(20,'A','B','C');
	}
}
