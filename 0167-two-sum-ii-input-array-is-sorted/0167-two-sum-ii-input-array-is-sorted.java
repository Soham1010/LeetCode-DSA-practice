class Solution {
    public int[] twoSum(int[] num, int target) {
        int len = num.length;
        int[] arr = new int[len];

        for (int i=1;i<=len; i++) {
            for (int j=i+1;j<=len; j++) {
                if (num[i-1] + num[j-1] == target) {
                   return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}