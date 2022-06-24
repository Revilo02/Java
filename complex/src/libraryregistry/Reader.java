package libraryregistry;

public class Reader {
	private String name;
	private String identitycard;
	private int yob; // Year Of Birth
	//private ArrayList<Book> books = new ArrayList<Book>();

	public Reader(String na, String id, int y) {
		name = na; 
		identitycard = id; 
		yob = y;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	public void setID(String identitycard) {
	    this.identitycard = identitycard;
	}
	
	public void setYob(int yob) {
	    this.yob = yob;
	}
	
	public String getName() { return name; }
	public String getID() { return identitycard; }
	public int getYob() { return yob;}
	
	//public void listBooks() {
	//	for(int i = 0; i < books.size(); i++) {
	//		System.out.println(books.get(i));
	//	}
	//}
	//public void addBook(Book b) {
	//	b.setOwner(this);
	//	books.add(b);
	//}
		
	//public void removeBook(int serialnumber) {
	//	for (int i = 0; i < books.size(); i++) {
	//		if (books.get(i).getSern() == serialnumber) {
	//			books.get(i).setOwner(null);
	//			books.remove(i);
	//			
	//		}
	//	}	
	//}
	public String toString() {
		return name+" "+yob+" "+identitycard;
	}
}
