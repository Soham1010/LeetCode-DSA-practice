class Solution {
    public int[] twoSum(int[] num, int target) {
        int len = num.length;
        int[] arr = new int[len];
        int left = 0;
        int right = len-1;
        int i = 0;

        while (i < len) {
            int current = num[left] + num[right];
            if (current<target) {
                left++;
                continue;
            }
            if (current>target) {
                right--;
                continue;
            }
            return new int[] {left+1, right+1};
        }
    return new int[] {};
    }
}