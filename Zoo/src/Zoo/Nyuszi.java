package Zoo;

public class Nyuszi extends Animal{
	Nyuszi(String name){
		super(name);
	}

	
	public String hangotad() {
		
		return "makk-makk";
	}
	public String megharapjak() {
		return hangotad()+" "+hangotad();
	}
	
}
