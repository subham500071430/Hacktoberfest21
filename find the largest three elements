import java.lang.*;
import java.util.*;
public class solution {
	public static void main(String[] args){
	 int max=Integer.MIN_VALUE;
	 int second_max=Integer.MIN_VALUE;
	 int third_max=Integer.MIN_VALUE;
	 int d=Integer.MAX_VALUE;
	 int[] a= {10,4,3,50,23,90};
	 for(int i=0;i<a.length;i++) {
		if(max<a[i]) {	
		//third_max=second_max;
		second_max=max;
		max=a[i];
		}

	 }
	 for(int i=0;i<a.length;i++) {
		 if((second_max-a[i])<d&&(second_max-a[i])>0) {
			 d=second_max-a[i];
			 third_max=a[i];
		 }
	 }
	 System.out.println(max+" "+second_max+" "+third_max);
}
}
