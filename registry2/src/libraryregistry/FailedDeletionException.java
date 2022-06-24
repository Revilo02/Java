package libraryregistry;

public class FailedDeletionException extends Exception{
	public String getMessage() {
		return "Sikertelen törlés.";
	}
}
