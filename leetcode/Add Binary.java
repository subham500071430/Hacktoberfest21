class Solution {
    public String addBinary(String a, String b) {
        String c="";
        int i=a.length()-1,j=b.length()-1,sum=0,carry=0;
        while(i>=0||j>=0){
        if(j<0)     
        sum=carry+Character.getNumericValue(a.charAt(i));
        else if(i<0)
        sum=carry+Character.getNumericValue(b.charAt(j));
        else
        sum=carry+Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(j));
        if(sum==3){
            carry=1;
            c="1".concat(c);
        }
        else if(sum==2){
            carry=1;
            c="0".concat(c);
        }
        else{
            c=Integer.toString(sum).concat(c);
            carry=0;
        }
          i--;
          j--;  
        } 
        if(carry==1)
            c="1".concat(c);
        return c;
    }
}
