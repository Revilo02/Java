
package konyvtar;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	//Itt lesznek a men�knek az almen�i
	
	/**
	 * A f�men� megjelen�s��rt felel� f�ggv�ny
	 */
	protected static void Fomenu() {
		System.out.println(
				"[0] K�nyv hozz�ad�sa \n"+
				"[1] K�nyv t�rl�se \n"+
				"[2] K�nyv m�dos�t�sa \n"+
				"[3] K�nyv kiad�sa \n"+
				"[4] K�nyv visszav�tele \n"+
				"[5] K�nyv sz�r�se\n"+
				"[6] Olvas� hozz�ad�sa \n"+
				"[7] Olvas� adatainak m�dos�t�sa\n"+
				"[8] Ment�s\n"+
				"[9] Kil�p�s");
	}
	/**
	 * A k�nyv m�dos�t�si lehet�s�geinek megjelen�t�s��rt felel a f�ggv�ny
	 */
	protected static void bookmodify() {
		System.out.println(
						   "[1] K�nyv szerz�j�nek m�dos�t�sa\n"+
						   "[2] K�nyv c�m�nek m�dos�t�sa \n"+
						   "[3] K�nyv m�faj�nak m�dos�t�sa\n"+
						   "[4] K�nyv kiad�si �v�nek m�dos�t�sa \n"+
						   "[5] Minden adat m�dos�t�sa \n"+
						   "[6] Vissza");
	}
	/**
	 * Sz�r�si lehet�s�gek megjelen�t�s��rt felel hogy a felhaszn�l�knak megk�nny�tse a dolg�t
	 */
	protected static void booksearch() {
		System.out.println("[1] C�m szerinti sz�r�s\n"+"[2] Szerz� szerinti sz�r�s\n"+"[3] M�faj szerinti sz�r�s\n "+"[4] vissza\n");
	}
	/**
	 * Olvas� mod�s�t�s lehet�s�geinek megjelen�t�s��rt felel a f�ggv�ny
	 */
	protected static void readermodify() {
		System.out.println("[1] N�v m�dos�t�sa\n"+"[2] El�rhet�s�g szerint\n"+"[3] Minden adat m�dos�t�sa\n"+"[4] vissza");
	}
	
}
