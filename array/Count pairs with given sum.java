class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        int total=0;
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
            }
            else{
                h.put(arr[i],1);
            }
        }
        for(int i=0;i<n;i++){
            int temp=k-arr[i],count=0;;
            if(h.containsKey(temp)){
              if(temp==arr[i]){
                count=h.get(temp)-1;
              }  
              else{
              count=h.get(temp);
              }
            }
            total=total+count;
        }
        return total/2;
    }
}
