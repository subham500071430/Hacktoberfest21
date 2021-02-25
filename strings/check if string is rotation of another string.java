package coding;
import java.io.*;
import java.util.*;
class solution{
	public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s1=br.readLine();
	String s2=br.readLine();
	//to check if s2 is rotation of s1 string
	String s3=s1+s1;
	if(s2.length()==s1.length()&&s3.indexOf(s2)!=-1) {
		//s2 is rotation of s1
		System.out.println("true");
	}
	else {
		//s2 isn't rotation of s1
		System.out.println("false");
	}
	}
}	
