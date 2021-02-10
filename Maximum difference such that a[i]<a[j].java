import java.util.*;
import java.io.*;
import java.lang.*;
public class Difference{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int[] a=new int[n];
for(int i=0;i<n;i++){
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("Maximum Difference :"+diff(a,n));
}
public static int diff(int[] a,int n){
int min=a[0];
int d=Integer.MIN_VALUE;
for(int i=1;i<n;i++){
if(min>a[i])
min=a[i];
else if(d<a[i]-min)
d=a[i]-min;
}
return d;
}
}
