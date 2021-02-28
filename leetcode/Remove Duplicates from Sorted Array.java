class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1)
            return nums.length;
        int curr=nums[0],point=1,dcount=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==curr){
                dcount++;
            }
            else{
                curr=nums[i];
                swap(nums,i,point);
                point++;
            }
        }
        
        return nums.length-dcount; 
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
