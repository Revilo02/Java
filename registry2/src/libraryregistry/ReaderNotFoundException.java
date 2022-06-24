package libraryregistry;

public class ReaderNotFoundException extends Exception{
	public String getMessage() {
		return "Nincs ilyen felhasználó.";
	}
}
