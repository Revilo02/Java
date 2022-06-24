package sportk.src;

public class Menu {
	protected static void FoMenu() {
		System.out.println(
				"1 Új ember felvétele\n"
				+ "2 Új sport felvétele\n"
				+ "3 Ember hozzáadása a sporthoz\n"
				+ "4 Szûrés\n"
				+ "5 Sportoló adatainak módosítás\n"
				+ "6 Tanár adatainak módosítása"
				+ "7 Mentés\n"
				+ "8 Exit");
	}
	protected static void peopleadd() {
		System.out.println(
				"1 Új oktató felvétele\n"+
				"2 Új sportoló felvétele\n"+
				"3 Vissza \n");
	}
	protected static void sportadd() {
		System.out.println(
				"1 Oktató hozzáadása\n"+ 
				"2 Sportoló hozzáadása\n"+ 
				"3 Vissza\n");
	}
	protected static void Datasearch() {
		System.out.println(
				"1 Sport szerinti keresés\n"
				+ "2 Oktató szerinti keresés\n"
				+ "3 Sportoló szerinti keresés\n"
				+ "5 Idõpont szerinti keresés\n"
				+ "6 Vissza \n");
	}
	protected static void Smodify() {
		System.out.println(
				"1 Sporoló nevének módosítása\n"
				+ "2 Sportoló születési évének módosítása\n"
				+ "3 Sportoló email címének módosítása"
				+ "4 Vissza\n");
	}
	protected static void Tmodify() {
		System.out.println(
				"1 Tanár nevének módosítása\n"
				+ "2 Tanár születési évének módosítása\n"
				+ "3 Tanár email címének módosítása"
				+ "4 Vissza\n");
	}
}
