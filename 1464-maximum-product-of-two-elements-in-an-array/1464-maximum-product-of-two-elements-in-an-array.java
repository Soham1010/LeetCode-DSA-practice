class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] >= max) {
                // update smax and max
                smax = max;
                max = nums[i];
            }
            if (nums[i] < max && nums[i] >= smax) {
                // update smax
                smax = nums[i];
            }
        }

        return (smax-1)*(max-1);


    }
}