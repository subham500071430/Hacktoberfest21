class Solution {
    public int[] plusOne(int[] digits) {
      boolean flag=true;
      int len=0;
      for(int i=digits.length-1;i>=0;i--){
          if(digits[i]!=9){
              flag=false;
              break;
          }
      }
        if(flag==false){
           len=digits.length; 
        }
        else{
           len=digits.length+1;
        }
        int[] arr=new int[len];
        if(flag==true){
            arr[0]=1;
            for(int i=1;i<arr.length;i++){
                arr[i]=0;
            }
        }
        else{
            int j=digits.length-1;
            while(digits[j]==9){
                arr[j]=0;
                j--;
            }
            arr[j]=digits[j]+1;
            j--;
            while(j>=0){
                arr[j]=digits[j];
                j--;
            }
        } 
        return arr;
    }
}
