package sportk;

public class Menu {
	protected static void FoMenu() {
		System.out.println("\t   M E N U\n" + "================================\n" + "1 Új ember felvétele\n"
				+ "2 Új sport felvétele\n" + "3 Sportoló felvétele órára\n" + "4 Keresés\n"
				+ "5 Sportoló adatainak módosítás\n" + "6 Tanár adatainak módosítása\n" + "7 Mentés\n" + "8 Exit\n"
				+ "================================\n" + "Válasza: ");
	}

	protected static void peopleadd() {
		System.out.println("ÚJ EMBER HOZZÁADÁSA\n" + "================================\n" + "1 Új oktató felvétele\n"
				+ "2 Új sportoló felvétele\n" + "3 Vissza \n" + "================================\n" + "Válasza: ");
	}

	protected static void sportadd() {
		System.out.println("SPORT FELVÉTELE\n" + "================================\n" + "1 Oktató hozzáadása\n"
				+ "2 Sportoló hozzáadása\n" + "3 Vissza\n" + "================================\n" + "Válasza: ");
	}

	protected static void Datasearch() {
		System.out.println("KERESÉS\n" + "================================\n" + "1 Sport szerinti keresés\n"
				+ "2 Oktató szerinti keresés\n" + "3 Sportoló szerinti keresés\n" + "4 Idõpont szerinti keresés\n"
				+ "5 Vissza \n" + "================================\n" + "Válasza: ");

	}

	protected static void Tmodify() {
		System.out.println("TANÁR MÓDOSÍTÁS\n" + "================================\n" + "1 Tanár nevének módosítása\n"
				+ "2 Tanár születési évének módosítása\n" + "3 Tanár email címének módosítása" + "4 Vissza\n"
				+ "================================\n" + "Válasza: ");
	}
}
