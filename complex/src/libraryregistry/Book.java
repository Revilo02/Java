package libraryregistry;


public class Book {
	private String writer;
	private String title;
	private String type;
	private int relyear; // Release Year
	private String owner; //személyiszám
	//private int serialnumber;

	public Book(String wri, String ti, String ty, int y) {
		writer = wri;
		title = ti;
		type = ty;
		relyear = y;
	}
	
	public void setWriter(String writer) {
	    this.writer = writer;
	}
	
	public void setTitle(String title) {
	    this.title = title;
	}
	
	public void setType(String type) {
	    this.type = type;
	}
	
	public void setRelyear(int relyear) {
	    this.relyear = relyear;
	}
	
	public void setOwner(String o) {
		owner = "free";
	}
	
	public String getWriter() { return writer; }
	public String getTitle() { return title; }
	public String getType() { return type; }  
	public String getOwner() {return owner;}


	public String toString() {
		return writer+": "+title+" "+relyear+" ("+type+") "; //"Reader:"+owner.getName();
	}
}
