class Solution {
    public int search(int[] nums, int target) {
        // int start = 0;
        // int end = nums.length-1;

        // while (start<= end) {
        //     int mid = (start+mid)/2;

        //     if ()
        // }
        int len=nums.length;
        int count = 0;

        while (count < len) {
            if (nums[count] != target) {
                count++;
            } else {break;}
        } 
        // not found, count - len-1
        if (count == len) {
            if (nums[len-1] != target) {
                return -1;
            }
        }
        return count;

    }
}