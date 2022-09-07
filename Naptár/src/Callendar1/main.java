package Callendar1;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Comparator;
import java.util.TreeMap;

public class main {
	static TreeMap<LocalDate, String>  a=new TreeMap<LocalDate, String>();

	private static void printMonth(LocalDate t) {
		System.out.println(t.getMonth()+" "+ t.getYear());
		System.out.println("Mo  "+"Tu  "+"We  "+"Th"+"  Fr"+"  Sa"+"  Su");	
		LocalDate first=t.minusDays(t.getDayOfMonth()-1);
		System.out.print(" ");
		int n=1;
		for(int i=0;i<t.lengthOfMonth()+first.getDayOfWeek().getValue()-1;i++) {
			if((i)%7==0 &i!=0) {
				System.out.println();
			}
			if(i<first.getDayOfWeek().getValue()-1) {
				System.out.print("    ");
				
			}
			else{if(10>n) {
				System.out.print("");
				
				System.out.print(n+"   ");
				n++;
			}else {
				System.out.print(n+"  ");
				n++;
			}
			}
			
		}
		
	}
	
	private static void printYear(LocalDate t) {
		int ev=t.getYear();
		System.out.println();
		for(int i=1;i<13;i++) {
			LocalDate today=LocalDate.of(ev, i, 21)
					;
			System.out.println();
			printMonth(today);
		}
	}
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		LocalDate l=( LocalDate.now());
		System.out.println(l);
		String s;
		LocalDate apr1 = LocalDate.of(l.getYear(), 4, 1);
		
	//	System.out.println(cal.getActualMinimum(Calendar.DATE));
		//printYear(l);
		printMonth(apr1);
	}

}
