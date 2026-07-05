class Solution {
    public void rotate(int[] nums, int k) {
     // Edge Cases
     if (nums == null || nums.length <= 1) {
        return;
     }
     // when k > length array
     k = k % nums.length;

     // rotate entire
     reverse(nums, 0, nums.length-1);
     // rotate p1
     reverse(nums, 0, k-1);
     // rotate p2   
     reverse(nums, k, nums.length-1);
    }

    // Helper
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}