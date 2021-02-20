public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
         for(int i=0;i<A.size();i++){
             int x=A.get(i)-i;
             int y=A.get(i)+i;
             if(max1<x)
             max1=x;
             if(min1>x)
             min1=x;
             if(max2<y)
             max2=y;
             if(min2>y)
             min2=y;
         }
         return Math.max(Math.abs(max1-min1),Math.abs(max2-min2));
    }
}
