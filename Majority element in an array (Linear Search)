import java.util.*;
import java.io.*;
public class Majority{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int[] a=new int[n];
for(int i=0;i<n;i++){
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("Majority Element :"+frequency(a,n));
}
public static int frequency(int[] a,int n){
for(int i=0;i<=n/2;i++){
if(a[i]==a[n/2+i]){
return a[i];}
}
return -1;}
}
