package libraryregistry;

public class BookNotFoundException extends Exception {
	public String getMessage() {
		return "Nincs ilyen könyv.";
	}
}
