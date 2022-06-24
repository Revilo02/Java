package Beer;
import java.util.*;
public class Beer {
	private String name;
	private String type;
	private double strength;
	Beer(String n,String t,double s){
		this.name=n;
		this.type=t;
		this.strength=s;
	}
	public String getName() {return name ;}
	public String getType() {return type;}
	public double getStrength() {return strength;}
	public String toString() {
		return name+" "+type+" "+strength;
	}
	protected void Add(String[] cmd ) {
		 new Beer(cmd[1],cmd[2],Double.parseDouble(cmd[3]));
		
	}
	
	
	
}
