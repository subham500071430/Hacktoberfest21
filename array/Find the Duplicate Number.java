//1st approach
class Solution {
    public int findDuplicate(int[] nums) {
       Arrays.sort(nums);
       for(int i=0;i<nums.length-1;i++){
           if(nums[i]==nums[i+1])
               return nums[i];
       }
        return -1;
    }
}

//2nd approach
class Solution {
    public int findDuplicate(int[] nums) {
       HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(h.contains(nums[i]))
                return nums[i];
            h.add(nums[i]);
        }
        return -1;
    }
}
