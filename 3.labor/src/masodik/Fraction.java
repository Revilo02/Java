package masodik;

public class Fraction {
	private int num;
	private int den;
	static int gcd(int a, int b)
	{ int x=a;
		int y=b;
		while (a != b)
		{
		   if (a > b)
		      a = a - b;
		   else
		      b = b - a;
		}
		return a;
	} 

	public Fraction() {
		this.num=0;
		this.den=1;
	}
	public Fraction(int num) {
		this.num=num;
		this.den=1;
	}
	
	public Fraction( int num,int den) {
		this.num=num;
		this.den=den;
	}
	public int getNum() {
		return num;
	}
	public int getDen() {
		return den;
	}
	public double doubleValue() {
		return num/den;
	}
	public Fraction reciprocal() {
		Fraction f=new Fraction(den,num);
		return f;
		
	}
	/*public Time add(Time t) {
		//Complex ret = new Complex(re+c.re, im+c.im);
			int tmp=(min+t.min)/(24*60);
			Time ret=new Time(0-tmp*24,min+t.min);
			return ret;	
	}*/
	public Fraction Add(Fraction f) {
		
		if(f.den==den)
		{	Fraction ret=new Fraction(num+f.num,den)	;
			return ret;
		}
		else {
			Fraction ret=new Fraction(num*f.den+f.num*den,den*f.den)	;
			return ret;
			
		}
	}
public Fraction sub(Fraction f) {
		
		if(f.den==den)
		{	Fraction ret=new Fraction(num-f.num,den)	;
			return ret;
		}
		else {
			Fraction ret=new Fraction(num*f.den-f.num*den,den*f.den)	;
			return ret;
			
		}
	}
	public Fraction mult(Fraction f)
	{
		Fraction ret=new Fraction(f.num*num,f.den*den);
		 return ret;
	}
	public Fraction div(Fraction f)
	{
		Fraction ret=new Fraction(f.num*den,f.den*num);
		 return ret;
	}
	public String toString() {
		String s =this.num+"/"+this.den;
		return s;
	}
	public Fraction simplify(Fraction f)
	{	
		int gcd=gcd(f.num,f.den);
		Fraction ret=new Fraction(f.num/gcd,f.den/gcd);
		return ret;
	}
	
	static public void main(String[] args) {
		Fraction f=new Fraction(2,3);
		Fraction f1=new Fraction(3,4);
		Fraction f3=f.Add(f1);
		System.out.println(f.toString());
		System.out.println(f3.toString());
		
	}
}
