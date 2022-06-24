package konyvtar;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class IO {
	
	/**
	 * 
	 * A függvény az olvasók és a Könyvek beolvasásáért felel , elvárt bemeneti fájl Könyvek.txt és Olvasok.txt más elnevezés esetén a program
	 * NEM fogja látni a bejövő adatokat 
	 * Könyv beolvasásának feltételelei: 6 paraméter szerint történik
	 * 1. A könyv ID-ja ennek int típúsúnak kell lennie
	 * 2. A könyv Neve ennek String típúsúnak kell lennie
	 * 3. A könyv szerzője ennek String típúsúnak kell lennie
	 * 4. A könyv műfaja ennek is String típúsúnak kell lennie
	 * 5. A könyv kiadásának évszáma ennek egész számnak kell lennie
	 * 6. A könyv leírása ennek is String típúsúnak kell lennie 
	 * NEM A KÖNYV BEOLVASÁSÁNÁL ADJUK MEG HOGY KI VAN-E ADVA HANEM AZ OLVASÓK BEOLVASÁSÁNÁL
	 * 
	 * Olvasók beolvasása
	 * Olvasok.txt fájlból
	 * itt 3 főrészre vágjuk a beérkező fájlt
	 * 1.Az olvasó neve
	 * 2.Az olvasó elérhetősége
	 * 3.Az olvasó könyvei
	 * 		Ezt a részt szóközönként elválasztjuk és az elvárt bemenetek egész számok amelyek a könyvek ID-jai lesznek ezeknek beolvasása után állítjuk
	 * 		át a Könyvek állapotát kiadottra
	 * @param paraméterül veszi a beolvasni kkívánt fájl nevét
	 */
	public static void beolvas(String Filename) throws Exception {
		File file = new File(Filename);

		try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF8"))) {
			String str;

			while ((str = in.readLine()) != null) {
				String[] sv = str.split(";");
				if (Filename.equals("Könyvek.txt")) {
					// int a=(int)sv[3];

					try {
						Konyvek k = (new Konyvek(sv[1], sv[2], sv[3], Integer.parseInt(sv[4])));
						k.setID(Integer.parseInt(sv[0]));
						k.setLeiras(sv[5]);
						Tarolo.addBook(k);
					} catch (Exception e) {
						System.out.println(e.getMessage());
						System.out.println("Nem megfelelő adattagok");
					}
				} else if (Filename.equals("Olvasok.txt")) {

					String[] konyvid;
					try {
						Latogato l = new Latogato(sv[1], sv[2]);
						l.setID(Integer.parseInt(sv[0]));
						try {
							konyvid = sv[3].split(" ");
						} catch (Exception e) {
							konyvid = new String[0];
						}

						for (int i = 0; i < konyvid.length; i++) {
							for (int j = 0; j <Tarolo.BooksListSize() ;j++) {
								if (Integer.parseInt(konyvid[i]) == Tarolo.getBooksElement(i).getID()) {
									l.konyvadd(Tarolo.getBooksElement(i));
									Tarolo.getBooksElement(i).setKiadva(true);
									break;
								}
							}
						}
						Tarolo.addLatogato(l);
					} catch (Exception e) {
						System.out.println(e.getMessage());
						System.out.println("Nem megfelelő adattagok");
					}

				}else {System.out.println("Nem megfelelő bemeneti fájl");}
			}
		}
	}
	/**
	 * Az olvasók és a könyvek .ToFile() metódusa alapján vannak megkülönböztetve az adattagok a sikeres visszaolvasás érdekében
	 */
	public static  void Fajlbair() {
		Collections.sort(Tarolo.getBooksList(), new IDComparator());	
		try {
			FileWriter ki=
			  new FileWriter(new File("Könyvek.txt"), StandardCharsets.UTF_8);
			for (int i=0;i<Tarolo.BooksListSize();i++) {	
				ki.write(Tarolo.getBooksElement(i).toFile());
			}
			ki.close();
			ki=  new FileWriter(new File("Olvasok.txt"), StandardCharsets.UTF_8);
			for (int i=0;i<Tarolo.LatogtoListSize();i++) {	
				ki.write(Tarolo.getLatogatokElement(i).toFile());
			}
			
			ki.close();
		}catch(Exception e) {
			System.err.println("Nem jó bemenet!");
		}
	}
}
