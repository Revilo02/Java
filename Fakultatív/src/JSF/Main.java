package JSF;
import java.util.ArrayList;
public class Main {
	
	static int teljesido(ArrayList<SRTF> lista) {
		int sv=0;
		for(int i=0;i<lista.size();i++) {
			sv+=lista.get(i).getTimeleft();
		}
		return sv;
	}
	public static void main(String[] args) {
		ArrayList<SRTF> lista=new ArrayList<SRTF>();
		
		SRTF A=new SRTF('A',1,0,6);
		SRTF B=new SRTF('B',1,1,5);
		SRTF C=new SRTF('C',1,5,2);
		SRTF D=new SRTF('D',1,10,1);
		lista.add(D);
		lista.add(A);
		lista.add(B);
		lista.add(C);
		int min=lista.get(0).getTimeleft();
		for(int i=0;i<teljesido(lista);i++) {
			for(int j=0;j<lista.size();i++) {
				if(lista.get(j).getStart()>=i) {
					if()
				}
			}
		}
	}
}
