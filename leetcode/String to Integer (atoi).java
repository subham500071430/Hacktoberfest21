class Solution {
    public int myAtoi(String s) {
        
        String a = s.trim();
        boolean sign  = true ;
        long num=0;
        for(int i=0;i<a.length();i++){
            if(i==0){
               if(a.charAt(i)=='-'){
                sign = false;
               }
               else if(a.charAt(i)=='+') sign = true;
               else if((int)a.charAt(i)>47&&(int)a.charAt(i)<58){
                   num = num*10 + (int)a.charAt(i) - 48;
               }
               else break;
            }    
            else if((int)a.charAt(i)>47&&(int)a.charAt(i)<58){
                if(sign){
                    num = num*10 + (int)a.charAt(i) - 48;
                }
                else{
                    num = num*10 - ((int)a.charAt(i) - 48);
                }
                if(num>Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if(num<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
            else{
                break;
            }
        }
        
        return (int)num;
    }
}
