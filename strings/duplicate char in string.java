package coding;
import java.io.*;
import java.util.*;
class solution{
	public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s=br.readLine();
	HashMap<Character,Integer> h=new HashMap<Character,Integer>();
	for(int i=0;i<s.length();i++) {
		if(h.containsKey(s.charAt(i))&&h.get(s.charAt(i))==1) {
			System.out.print(s.charAt(i));
			h.put(s.charAt(i), -1);
		}
		else if(!h.containsKey(s.charAt(i))){
			h.put(s.charAt(i), 1);
		}
	}
	}
}
