public class solution1 {
   public static void main(String[] args) {
	  int[] a= {-4,3,10,-9,7,-13,1};
	  for(int i=0;i<a.length;i++) {
		  int min=Integer.MAX_VALUE,index=0,temp=0;
		  for(int j=i;j<a.length;j++) {
			  if(min>a[j]) {
				 min=a[j]; 
				 index=j;}
		  }
		  temp=a[i];
		  a[i]=min;
		  a[index]=temp;
	  }
	  for(int i=0;i<a.length;i++)
		  System.out.print(a[i]+" ");
   }
}
