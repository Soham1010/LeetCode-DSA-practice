class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] buf = new int[len];

        for (int i=0; i<len; i++) {
            buf[i] = nums[i] * nums[i];
        }
        Arrays.sort(buf);
        return buf;
    }
}