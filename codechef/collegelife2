/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        int t=Integer.parseInt(br.readLine());
	        while(t-->0){
	        int s=Integer.parseInt(br.readLine());
	        String s1=br.readLine();
	        StringTokenizer st1= new StringTokenizer(s1," ");
	        int[] q=new int[s];
	        for(int i=0;i<s;i++){
	            q[i]=Integer.parseInt(st1.nextToken());
	        }
	        int total_runtime=0,skip_time=0;
	        for(int i=0;i<s;i++){
	            String s2=br.readLine();
	            StringTokenizer st2= new StringTokenizer(s2," ");
	            if(st2.countTokens()>2){
	                skip_time=skip_time+q[i]*(st2.countTokens()-2);
	            }
	            int j=0;
	            while(st2.hasMoreTokens()){
	              if(j>0){
	                  total_runtime=total_runtime+Integer.parseInt(st2.nextToken());
	              }
	              else{
	                  st2.nextToken();
	              }
	              j++;
	            }  
	        }
	        System.out.println(total_runtime-skip_time);
	      }
	}
}
