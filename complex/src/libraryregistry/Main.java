package libraryregistry;

public class Main {
	static public void main(String[] args) {
		Book b1 = new Book("George Orwell", "1984", "regény", 1949);
		Book b2 = new Book("Madách Imre","Az ember tragédiája","dráma", 1980);
		
		Reader r1 = new Reader("Szeifert Nóri", "ABCD12", 1996);
		Reader r2 = new Reader("Kovács Béla", "DCBA21", 1994);
		Menu.books.add(b1);
		System.out.println(b1); 
		System.out.println(b2);
		
		System.out.println(r1);
		System.out.println(r2);
		
		
	}

}
