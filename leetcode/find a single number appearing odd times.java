class Solution {
    public int singleNumber(int[] nums) {
       int oddelement=nums[0];
       for(int i=1;i<nums.length;i++){
           oddelement=oddelement^nums[i];
       } 
       return oddelement; 
    }
}
