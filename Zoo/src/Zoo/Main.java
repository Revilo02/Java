package Zoo;

public class Main {
	static public void main(String[] args) {
		/*Animal tapsi = new Nyuszi("Tapsi");
		Animal pisze = new Nyuszi("Pisze");
		System.out.println("-= Tapsi jatszik =-");
		tapsi.jatszik(pisze);/**/
		Animal vuk = new Roka("Vuk");
		Animal tapsi = new Nyuszi("Tapsi");
		Animal pisze = new Nyuszi("Pisze");
		System.out.println("-= Tapsi jatszik =-");
		tapsi.jatszik(pisze);
		tapsi.jatszik(vuk);
		System.out.println("-= Vuk jatszik =-");
		vuk.jatszik(tapsi);
		vuk.jatszik(pisze);
		Animal f1=new Farkas("B�la");
		Animal f2=new Farkas("Hu de unom m�r");
		System.out.println(f1.megharapjak());
		f1.megharapjak();
	}
}
