package sportk;

public class Menu {
	protected static void FoMenu() {
		System.out.println("\t   M E N U\n" + "================================\n" + "1 �j ember felv�tele\n"
				+ "2 �j sport felv�tele\n" + "3 Sportol� felv�tele �r�ra\n" + "4 Keres�s\n"
				+ "5 Sportol� adatainak m�dos�t�s\n" + "6 Tan�r adatainak m�dos�t�sa\n" + "7 Ment�s\n" + "8 Exit\n"
				+ "================================\n" + "V�lasza: ");
	}

	protected static void peopleadd() {
		System.out.println("�J EMBER HOZZ�AD�SA\n" + "================================\n" + "1 �j oktat� felv�tele\n"
				+ "2 �j sportol� felv�tele\n" + "3 Vissza \n" + "================================\n" + "V�lasza: ");
	}

	protected static void sportadd() {
		System.out.println("SPORT FELV�TELE\n" + "================================\n" + "1 Oktat� hozz�ad�sa\n"
				+ "2 Sportol� hozz�ad�sa\n" + "3 Vissza\n" + "================================\n" + "V�lasza: ");
	}

	protected static void Datasearch() {
		System.out.println("KERES�S\n" + "================================\n" + "1 Sport szerinti keres�s\n"
				+ "2 Oktat� szerinti keres�s\n" + "3 Sportol� szerinti keres�s\n" + "4 Id�pont szerinti keres�s\n"
				+ "5 Vissza \n" + "================================\n" + "V�lasza: ");

	}

	protected static void Tmodify() {
		System.out.println("TAN�R M�DOS�T�S\n" + "================================\n" + "1 Tan�r nev�nek m�dos�t�sa\n"
				+ "2 Tan�r sz�let�si �v�nek m�dos�t�sa\n" + "3 Tan�r email c�m�nek m�dos�t�sa" + "4 Vissza\n"
				+ "================================\n" + "V�lasza: ");
	}
}
