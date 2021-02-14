package coding;
import java.io.*;
class solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] a={-1, 2, -3, 4, 5, 6, -7, 8, 9};
		int li=0,ri=a.length-1;
		while(li<ri) {
			if(a[li]<0)
				li++;
			if(a[ri]>=0)
				ri--;
			if(a[li]>=0&&a[ri]<0)
			{   
				int temp=a[li];
				a[li]=a[ri];
				a[ri]=temp;
				li++;
				ri--;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}
