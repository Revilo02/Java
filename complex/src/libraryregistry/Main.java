package libraryregistry;

public class Main {
	static public void main(String[] args) {
		Book b1 = new Book("George Orwell", "1984", "reg�ny", 1949);
		Book b2 = new Book("Mad�ch Imre","Az ember trag�di�ja","dr�ma", 1980);
		
		Reader r1 = new Reader("Szeifert N�ri", "ABCD12", 1996);
		Reader r2 = new Reader("Kov�cs B�la", "DCBA21", 1994);
		Menu.books.add(b1);
		System.out.println(b1); 
		System.out.println(b2);
		
		System.out.println(r1);
		System.out.println(r2);
		
		
	}

}
