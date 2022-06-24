package JSF;

public class SRTF {
	private char jel;
	private int priority;
	private int start;
	private int timeleft;
	private int waiting;
	public SRTF(char j,int p, int s,int t){
		this.jel=j;
		priority=p;
		start=s;
		timeleft=t;
		waiting=0;
	}
	public void reduceTime() {
		if(timeleft>0) {
			timeleft--;
		}
		return;
	}
	public void Addwaiting() {
		if (timeleft>0) {
			waiting++;}
		return;
	}
	public char getJel() {return jel;}
	public int getStart() {return start ;}
	public int getTimeleft() {return timeleft;}
	public int getWaiting() {return waiting;}
}
