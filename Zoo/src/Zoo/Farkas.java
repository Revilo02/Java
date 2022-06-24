package Zoo;

public class Farkas  extends Animal{
	
	private int kor ;
	Farkas(String name){
		super(name);

	}

	
	public String hangotad() {
		
		return "kornyikál";
	}
	public String megharapjak() {
		kor++;
		if(kor%2==0) {
			this.megharapjak();
		}
		return hangotad();
		
	}
}
