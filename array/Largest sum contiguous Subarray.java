import java.util.*;
public class solution1 {
   public static void main(String[] args) {
	   int curr_best=Integer.MIN_VALUE,overall_best=Integer.MIN_VALUE;
	   int[] a= {1,-5,7,6,3-20};
	   for(int i=0;i<a.length;i++) {
		   curr_best=curr_best+a[i];
		   if(curr_best>overall_best)
			   overall_best=curr_best;
		   if(curr_best<0) {
			   curr_best=0;
		   }
	   }
	   System.out.println(overall_best);
   }
}
