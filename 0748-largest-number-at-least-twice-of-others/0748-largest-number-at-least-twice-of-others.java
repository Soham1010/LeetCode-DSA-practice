class Solution {
    public int dominantIndex(int[] nums) {
    // largest > 2_x_second_largest  
    // 2 var 
    // one loop

    int max = -1;
    int smax = -1;
    int index = 0;

    for (int i=0; i<nums.length; i++) {
        if (max < nums[i]) {
            smax = max;
            max = nums[i];
            index = i;
        } else if (smax < nums[i]) {
            smax = nums[i];
        }
    }
    int diff = max -(2*smax);
    if (diff <0) {
        return -1;
    }
    return index;

    }}