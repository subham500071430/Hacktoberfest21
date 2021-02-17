import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    int n=Integer.parseInt(br.readLine());
		    String[] s=br.readLine().split(" ");
		    int m=Integer.parseInt(br.readLine());
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=Integer.parseInt(s[i]);
		    }
		    Arrays.sort(a);
		    int diff=Integer.MAX_VALUE;
		    for(int i=0;m+i-1<n;i++){
		        if(diff>a[m+i-1]-a[i])
		        diff=a[m+i-1]-a[i];
		    }
		    System.out.println(diff);
	}
	}	
}
