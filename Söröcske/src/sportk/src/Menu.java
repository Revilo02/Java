package sportk.src;

public class Menu {
	protected static void FoMenu() {
		System.out.println(
				"1 �j ember felv�tele\n"
				+ "2 �j sport felv�tele\n"
				+ "3 Ember hozz�ad�sa a sporthoz\n"
				+ "4 Sz�r�s\n"
				+ "5 Sportol� adatainak m�dos�t�s\n"
				+ "6 Tan�r adatainak m�dos�t�sa"
				+ "7 Ment�s\n"
				+ "8 Exit");
	}
	protected static void peopleadd() {
		System.out.println(
				"1 �j oktat� felv�tele\n"+
				"2 �j sportol� felv�tele\n"+
				"3 Vissza \n");
	}
	protected static void sportadd() {
		System.out.println(
				"1 Oktat� hozz�ad�sa\n"+ 
				"2 Sportol� hozz�ad�sa\n"+ 
				"3 Vissza\n");
	}
	protected static void Datasearch() {
		System.out.println(
				"1 Sport szerinti keres�s\n"
				+ "2 Oktat� szerinti keres�s\n"
				+ "3 Sportol� szerinti keres�s\n"
				+ "5 Id�pont szerinti keres�s\n"
				+ "6 Vissza \n");
	}
	protected static void Smodify() {
		System.out.println(
				"1 Sporol� nev�nek m�dos�t�sa\n"
				+ "2 Sportol� sz�let�si �v�nek m�dos�t�sa\n"
				+ "3 Sportol� email c�m�nek m�dos�t�sa"
				+ "4 Vissza\n");
	}
	protected static void Tmodify() {
		System.out.println(
				"1 Tan�r nev�nek m�dos�t�sa\n"
				+ "2 Tan�r sz�let�si �v�nek m�dos�t�sa\n"
				+ "3 Tan�r email c�m�nek m�dos�t�sa"
				+ "4 Vissza\n");
	}
}
