package complex;

/** Komplex számokat reprezentáló osztály. */
public class Complex {
	/** 
	 * Valós és képzetes rész
	 * */
	private double re, im;
	
	/** Konstruktor. Re: valós rész, Im: képzetes rész */
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
	/** Default konstruktor, nullára inicializál */
	public Complex() {
		this(0,0);
	}
	public void setRe(double re) {
	    this.re = re;
	}
	public void setIm(double im) {
	    this.im = im;
	}
	public double getRe() {
	    return re;
	}
	public double getIm() {
	    return im;
	}
	
	public String toString() {
		   String s = (this.re+"+"+this.im+"i");
		   return s;
		}
	/** Visszaadja a szám abszolút értékét. */
	public double abs() {
		double d = Math.sqrt(re*re+im*im);
		return d;
	}
	/** Összeadja this-t és c-t, az eredmény a visszatérési érték. */
    public Complex add(Complex c) {
        Complex ret = 
            new Complex(re+c.re, im+c.im);
        return ret;
    }


	
	public static void main(String[] args) {
		
		// 1. feladat: Írjunk programot, ami beolvas 10 komplex számot, és kiírja a legnagyobb abszolút értékut!
	    Scanner sc = new Scanner(System.in);
	    Complex c[] = new Complex[10];
	    for (int i = 0; i < 10; i++) {
	        c[i] = new Complex(sc.nextDouble(), sc.nextDouble());
	    }
	    int max = 0;
	    for (int i = 1; i < 10; i++) {
	        if (c[max].abs() < c[i].abs()){
	            max = i;
	        }
	    }
	    System.out.println(c[max].toString());
	    
	    // 2. feladat: 
	    Complex c1 = new Complex(1,0), c2 = new Complex(0,2);
	    Complex c3 = c1.add(c2); // c3 = c1+c2;
	    System.out.println(c3.toString()); 

	    // 3. feladat: Írjunk programot, ami beolvas 10 komplex számot, és kiírja az összegüket!
	    Complex act = new Complex(); // aktuálisan beolvasott
	    Complex sum = new Complex(); // összeg

	    for (int i = 0; i < 10; i++) {
	        act.setRe(sc.nextDouble());
	        act.setIm(sc.nextDouble());
	        sum = sum.add(act); // mindig no a sum
	    }

	    System.out.println(sum.toString()); 
	    
	    
	}


}
