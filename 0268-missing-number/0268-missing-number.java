class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int i=1;
         if (nums[0] != 0) {
                return 0;
            }
        for(;i<nums.length;i++){
            if(nums[i]-nums[i-1]!=1){
                return nums[i]-1;
            }
        }
    return length;
    }
}