class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;

        int left = 0;
        int right = len-1;

        if (nums[left] <= nums[right]) {
            return nums[left];
        }

        while (left < right){ 
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // Min is to the right of mid
                left = mid + 1;
            } else {
                // Min is at mid or to the left of mid
                right = mid;
            }
        }
        return nums[left];
    }
}