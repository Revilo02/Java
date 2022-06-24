package Zoo;

public abstract class Animal {
	private String name;
	Animal(String n){
		name=n;
	
	}
	public String getName() {return name;};
	abstract public String hangotad();
	public void jatszik(Animal a) 
	{
		System.out.println(this.name+" "+hangotad()) ;
	}
	abstract public String megharapjak();
}
