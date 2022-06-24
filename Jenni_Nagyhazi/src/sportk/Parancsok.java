package sportk;

import java.util.*;

class Parancsok {
	static ArrayList<Sportolok> sportolo = new ArrayList<Sportolok>();
	static ArrayList<Tanar> tanar = new ArrayList<Tanar>();
	static ArrayList<Sport> sport = new ArrayList<Sport>();

	protected static void SPeopleadd() {
		Scanner s = new Scanner(System.in);
		System.out.println("K�rem adja meg a sportol� nev�t: ");
		String nev = s.nextLine();
		System.out.println("K�rem adja meg a sportol� sz�let�s�nek �v�t: ");
		String szev = s.nextLine();
		System.out.println("K�rem adja meg a sportol� email c�m�t: ");
		String email = s.nextLine();
		System.out.println("K�rem adja meg a sportol� edz�si szintj�t: ");
		String szint = s.nextLine();

		sportolo.add(new Sportolok(nev, Integer.parseInt(szev), email, szint));
		s.close();
	}

	protected static void Teacheradd() {
		Scanner s = new Scanner(System.in);
		System.out.println("K�rem adja meg a oktat� nev�t: ");
		String nev = s.nextLine();
		System.out.println("K�rem adja meg a oktat� sz�let�s�nek �v�t: ");
		String szev = s.nextLine();
		System.out.println("K�rem adja meg a oktat� email c�m�t: ");
		String email = s.nextLine();
		System.out.println("K�rem adja meg a oktat� �rt�kel�s�t: ");
		String ertekeles = s.nextLine();

		tanar.add(new Tanar(nev, Integer.parseInt(szev), email, ertekeles));

		s.close();
	}

	static public void Peopleadd() {
		String valasz;
		Scanner s = new Scanner(System.in);
		while (true) {
			valasz = s.nextLine();
			if (valasz.equals("1")) {
				Teacheradd();
			} else if (valasz.equals("2")) {
				SPeopleadd();
			} else if (valasz.equals("3")) {
				break;
			}
		}
	}

	static public void Sportadd() {
		String valasz;
		Scanner s = new Scanner(System.in);
		while (true) {
			valasz = s.nextLine();
			if (valasz.equals("1")) {
			} else if (valasz.equals("2")) {
			} else if (valasz.equals("3")) {
				break;
			}
		}
	}

	protected static void Oktatoszerint() {
		Scanner s = new Scanner(System.in);
		System.out.println("K�rem adja meg a oktat� nev�t akire r� szeretne keresni: ");
		String nev = s.nextLine();
		for (int i = 0; i < tanar.size(); i++) {
			if (tanar.get(i).getNev().contains(nev)) {
				System.out.println(tanar.get(i));
			}
		}

	}

	protected static void Sportoloszerint() {
		Scanner s = new Scanner(System.in);
		System.out.println("K�rem adja meg a sportol� nev�t akire r� szeretne keresni: ");
		String nev = s.nextLine();
		for (int i = 0; i < sportolo.size(); i++) {
			if (sportolo.get(i).getNev().contains(nev)) {
				System.out.println(sportolo.get(i));
			}
		}

	}

	protected static void Sportszerint() {
		Scanner s = new Scanner(System.in);
		System.out.println("K�rem adja meg a sport nev�t amire r� szeretne keresni: ");
		String nev = s.nextLine();
		for (int i = 0; i < sport.size(); i++) {
			if (sport.get(i).getNev().contains(nev)) {
				System.out.println(sport.get(i));
			}
		}

	}

	protected static void Idopontszerint() {
		Scanner s = new Scanner(System.in);
		System.out.println("K�rem adja meg a napot amire r� szeretne keresni: ");
		String ido = s.nextLine();
		for (int i = 0; i < sport.size(); i++) {
			if (sport.get(i).getIdopont().contains(ido)) {
				System.out.println(sport.get(i));
			}
		}

	}

	static public void Data() {
		String valasz;
		Scanner s = new Scanner(System.in);
		while (true) {
			valasz = s.nextLine();
			if (valasz.equals("1")) {
				Sportszerint();
			} else if (valasz.equals("2")) {
				Oktatoszerint();
			} else if (valasz.equals("3")) {
				Sportoloszerint();
			} else if (valasz.equals("4")) {
				Idopontszerint();
			} else if (valasz.equals("5")) {
				break;
			}
		}
	}

	protected static int SmodifyID() {
		Scanner sc = new Scanner(System.in);
		System.out.println("K�rem adja meg a m�dos�tand� sportol� nev�t: ");
		String reginev = sc.nextLine();
		for (int i = 0; i < sportolo.size(); i++) {
			if (sportolo.get(i).getNev().contains(reginev)) {
				System.out.println(sportolo.get(i));
			}
		}
		System.out.println("K�rem adja meg a sportol� ID-j�t");
		int elvartID=sc.nextInt();
		
		for (int i = 0; i < sportolo.size(); i++){
			if(elvartID==sportolo.get(i).getID()) {
			return i;
			}
		}
		return -1;
	}
	protected static void SModify() {
		int i=SmodifyID();
	

		Scanner s=new Scanner(System.in);
		
		while(true) {
			System.out.println("Adja meg azt amit majd Jenni be�r");
			String v1=s.nextLine();
			if(v1.equals("n")){
				System.out.println("K�rem adja meg az �j nevet: ");
				String ujnev=s.nextLine();
				sportolo.get(i).setNev(ujnev);
				break;
			}
			else if(v1.equals("s")){
				System.out.println("K�rem adja meg az �j sz�let�si �v�t: ");
				int ujev=s.nextInt();
				sportolo.get(i).setSzev(ujev);
				break;
			}
			else if(v1.equals("e")){
				System.out.println("K�rem adja meg az �j email c�met: ");
				String ujemail=s.nextLine();
				sportolo.get(i).setEmail(ujemail);
				break;
			}	
			else if(v1.equals("v")) {
				break;
			}
			}
	}

	static public void Tmodify() {
		String valasz;
		Scanner s = new Scanner(System.in);
		while (true) {
			valasz = s.nextLine();
			if (valasz.equals("1")) {
			} else if (valasz.equals("2")) {
			} else if (valasz.equals("3")) {
			} else if (valasz.equals("4")) {
				break;
			}
		}

	}

}
