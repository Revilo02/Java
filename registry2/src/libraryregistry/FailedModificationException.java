package libraryregistry;

public class FailedModificationException extends Exception {
	public String getMessage() {
		return "Sikertelen módosítás.";
	}
}
