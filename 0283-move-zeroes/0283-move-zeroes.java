class Solution {
    public void moveZeroes(int[] nums) {
        // left, right ptr.     no. of zero's
        int l = 0;

        for (int i=0; i<nums.length; i++) {
            // if right is 0 swap with left, l++
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;
                l++;
            }
        }
    }
}