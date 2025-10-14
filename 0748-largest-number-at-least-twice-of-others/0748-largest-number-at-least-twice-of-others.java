class Solution {
    public int dominantIndex(int[] nums) {
    // largest > 2_x_second_largest  
    // 2 var 
    // one loop

    int max = 0;
    int index = 0;
    int diff = 0;
    int i=0;

    for (; i<nums.length; i++) {
        if (max < nums[i]) {
            index = i;
            max = nums[i];
        }
    }
    i=0;
    for (; i<nums.length; i++) {
        if (nums[i] == max) {
            continue;
        }
        int t_diff = max - 2* nums[i];
        if (t_diff<0) {return -1;}
    }
    return index;

    }}