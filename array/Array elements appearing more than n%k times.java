package coding;
import java.io.*;
import java.util.*;
public class solution {
	public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s=br.readLine();
	int n=Integer.parseInt(s.split(" ")[0]);
	int k=Integer.parseInt(s.split(" ")[1]);
	int[] a=new int[n];
	String[] ch=br.readLine().split(" ");
	for(int i=0;i<n;i++) {
		a[i]=Integer.parseInt(ch[i]);
	}
	HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
    int p=n/k;
    for(int i=0;i<n;i++) {
    	if(h.containsKey(a[i])) {
    	h.put(a[i],h.get(a[i])+1);
    	if(h.get(a[i])>p) {
    		System.out.print(a[i]+" ");
    		h.put(a[i],Integer.MIN_VALUE);
    	}
    	}
    	else {
    		h.put(a[i],1);
    	}
    }
	}  	
}
