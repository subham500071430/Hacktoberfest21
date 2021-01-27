import java.util.*;
import java.io.*;
public class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
int x=Integer.parseInt(br.readLine());
int li=0;
int ri=n-1;
System.out.print("Index:"+search(a,li,ri,x));
}
static int search(int[] a,int li,int ri,int x){
 if(ri>=li){
 int mid=li+(ri-li)/2;
 if(a[mid]==x)
 return mid;
 if(x<a[mid]){
 return search(a,li,mid-1,x);
}
else
 return search(a,mid+1,ri,x);
}
return -1;
}
}
