import java.util.*;
public class Segregate{
public static void main(String[] args){
int[] a={0,1,1,0,1,0,1,0,1,1};
int li=0,ri=a.length-1;
while(li<ri){
while(a[li]==0&&li<ri)
li++;
while(a[ri]==1&&li<ri)
ri--;
if(li<ri){
int temp=a[li];
a[li++]=a[ri];
a[ri--]=temp;
}
}
for(int i=0;i<a.length;i++)
System.out.print(a[i]+" ");
}
}
