class Solution {
    public int reverse(int x) {
        int num=x;
        double z=0;
        if(num<0){
          z=-rev(Math.abs(num));  
        }
        else{
          z=rev(Math.abs(num));  
        }
        if(z<-Math.pow(2,31)||z>Math.pow(2,31)-1)
            return 0;
        return (int)z;
        
    }
    static double rev(int n){
        int y=n,count=0;
        double rvr=0;
        while(y>0){
           y=y/10;
           count++; 
        }
        if(count==0){
            return 0;
        }
        while(n>0){
         rvr=rvr+n%10*Math.pow(10,count-1);
            count--;
            n=n/10;
        }
        return rvr;
    }
}
