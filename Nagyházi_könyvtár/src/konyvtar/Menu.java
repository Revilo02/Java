
package konyvtar;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	//Itt lesznek a menüknek az almenüi
	
	/**
	 * A fõmenü megjelenéséért felelõ függvény
	 */
	protected static void Fomenu() {
		System.out.println(
				"[0] Könyv hozzáadása \n"+
				"[1] Könyv törlése \n"+
				"[2] Könyv módosítása \n"+
				"[3] Könyv kiadása \n"+
				"[4] Könyv visszavétele \n"+
				"[5] Könyv szûrése\n"+
				"[6] Olvasó hozzáadása \n"+
				"[7] Olvasó adatainak módosítása\n"+
				"[8] Mentés\n"+
				"[9] Kilépés");
	}
	/**
	 * A könyv módosítási lehetõségeinek megjelenítéséért felel a függvény
	 */
	protected static void bookmodify() {
		System.out.println(
						   "[1] Könyv szerzõjének módosítása\n"+
						   "[2] Könyv címének módosítása \n"+
						   "[3] Könyv mûfajának módosítása\n"+
						   "[4] Könyv kiadási évének módosítása \n"+
						   "[5] Minden adat módosítása \n"+
						   "[6] Vissza");
	}
	/**
	 * Szûrési lehetõségek megjelenítéséért felel hogy a felhasználóknak megkönnyítse a dolgát
	 */
	protected static void booksearch() {
		System.out.println("[1] Cím szerinti szûrés\n"+"[2] Szerzõ szerinti szûrés\n"+"[3] Mûfaj szerinti szûrés\n "+"[4] vissza\n");
	}
	/**
	 * Olvasó modósítás lehetõségeinek megjelenítéséért felel a függvény
	 */
	protected static void readermodify() {
		System.out.println("[1] Név módosítása\n"+"[2] Elérhetõség szerint\n"+"[3] Minden adat módosítása\n"+"[4] vissza");
	}
	
}
