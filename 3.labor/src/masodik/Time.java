package masodik;

public class Time {
	private int min;
	
	public Time(int hh,int mm) {   //konstruktor (a)
		min=60*hh+mm;
	}
	public int getMins() { //metódus (a)
		if (min>=60) {
			return min%60;
		}else {
			return min;
		}	
	}
	
	public int getHours() { //metódus (a)
		return min/60;
	}
	
	public String toString() { //metódus (a)
		String s=(getHours()+":"+getMins());
		return s;
	}
	
	
	
	
	public static void main(String[] args) {
		Time t1 = new Time(8,05), t2 = new Time(13,00);
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println("ez lefutott?");
		Fraction f=new Fraction();
		System.out.println(f);
	}

}
