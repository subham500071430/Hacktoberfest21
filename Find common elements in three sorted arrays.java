import java.util.*;
public class main {
	public static void main(String[] args){
		int[] a={1,5,7,9,11};
		int[] b={2,3,5,9,11};
		int[] c={3,5,7,10,11};
		//System.out.print(binary(b,0,b.length-1,a[4]));
		for(int i=0;i<a.length;i++){
		if(binary(b,0,b.length-1,a[i])==1&&binary(c,0,c.length-1,a[i])==1)
		System.out.print(a[i]+" ");
		}
	}
		public static int binary(int[] x,int li,int ri,int k){
		if(ri>=li){
		int mid=li+(ri-li)/2;
		if(x[mid]==k)
		return 1;
		if(k<x[mid]) 
		return binary(x,li,mid-1,k);
		else
		return binary(x,mid+1,ri,k);
		}
		return 0;
}
}
