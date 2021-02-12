import java.util.*;
public class solution1 {
   public static void main(String[] args) {
	   int[] a= {3,-5,-3,2,-9,1,7,-10};
	   Arrays.sort(a);
	   int p_count=0,n_count=0;
	   for(int i=0;i<a.length;i++) {
		   if(a[i]<0)
			   n_count++;
		   else
		   p_count++;
	   }
		   if(p_count>n_count) {
			   swap(a,0,a.length-2);
		   }
		   else if(n_count==p_count)
			   swap(a,0,a.length-1);
		   else 
			   swap(a,1,a.length-1);
		   for(int i=0;i<a.length;i++) {
			   System.out.print(a[i]+" ");
		   }
	
		   
   }
   public static int[] swap(int[] a,int li,int ri) {
	   int temp=0;
	   while(li<ri) {
		   temp=a[li];
		   a[li]=a[ri];
		   a[ri]=temp;
		   li+=2;
		   ri-=2;
	   }
	   return a;
   }
}
