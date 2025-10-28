class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int max = nums[0];

        // one loop
        for (int i=1; i<nums.length; i++) {
           
           // umeed
            if (currSum < 0) {
                currSum = nums[i];
            } else {
                currSum += nums[i];
            }
            if (currSum > max) {
                max = currSum;
            }
        }

        return max;
    }
}