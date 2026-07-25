class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i=1; i<nums.length; i++) {
            // start new arr, if current sum + num[i] < current Sum
            currSum = Math.max(nums[i], currSum + nums[i]);
            // Update maxSum
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}