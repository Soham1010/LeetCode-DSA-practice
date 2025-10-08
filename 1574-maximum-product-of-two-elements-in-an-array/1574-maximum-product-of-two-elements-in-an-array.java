class Solution {
    public int maxProduct(int[] nums) {
       if(nums.length==0)return -1;
       if(nums.length==1)return -1;
       
       
       Arrays.sort(nums);
       int length = nums.length;
       return (nums[length-1]-1)*(nums[length-2]-1); 
    }
}