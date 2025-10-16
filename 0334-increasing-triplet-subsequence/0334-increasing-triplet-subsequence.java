class Solution {
    public boolean increasingTriplet(int[] nums) {
        int f = Integer.MAX_VALUE;
        int s = Integer.MAX_VALUE;
        int t = Integer.MAX_VALUE;

        for (int i=0; i<nums.length; i++) {
            int temp = nums[i];

            if (f >= temp) {
                f = temp;
            } else if (s >= temp) {
                s = temp;
            } else {
                t = temp;
                return true;
            }
        }
        return false;

    }
    
}