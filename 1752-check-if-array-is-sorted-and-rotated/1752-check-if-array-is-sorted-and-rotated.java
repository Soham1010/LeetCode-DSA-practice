class Solution {
    public boolean check(int[] nums) {
        int ct = 0;

        for (int i=1; i<nums.length; i++) {
            if (nums[i] < nums[i-1]) {
                ct++;
            }   
        }
// 2. The Fix: Check the boundary wrap-around (last element vs first element)
        if (nums[nums.length - 1] > nums[0]) {
            ct++;
        }

        // 3. If there's at most 1 total drop, it's a valid sorted/rotated array
        return ct <= 1;    }
}