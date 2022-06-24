package tomblistrend;
import java.util.Scanner;
import java.util.ArrayList;
public class kivrend {
	static double[] rend(double [] t)
	{
		int maxindex;
		double tmp;
		for (int i=t.length-1;i>0;i--)
		{
			maxindex=i;
			for(int j=0;j<i-1;j++)
			{
				if (t[j]>t[maxindex])
					maxindex=j;
			}
			tmp = t[i];
			t[i] = t[maxindex];
			t[maxindex] = tmp;
		}
		return t;
	}
	static public void main(String[]args)
	{
		double [] t= {9,8,4,2,2,7,23,1};
		rend(t);
		for(int i=0 ;i<t.length;i++)
		{
			System.out.print(t[i]+" ");
		}
	}
}
/*
ciklus i = n-1 .. 0
  maxIndex = i
  ciklus j = 0 .. i-1
    ha t[j] > t[maxIndex] 
    akkor maxIndex = j
  ciklus vége
  tmp = t[i]
  t[i] = t[maxIndex]
  t[maxIndex] = tmp
ciklus vége
*/