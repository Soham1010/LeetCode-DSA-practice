class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int[] arr = new int[len];
        int occ = 0;
        int arr_i = 0;

        for (int i=0; i<len; i++) {
            if (nums[i] == val) {
                occ++;
                continue;
            }
            arr[arr_i] = nums[i];
            arr_i++;
        }
        for (int k=0; k<len; k++) {
            nums[k] = arr[k];
        }
        return len-occ;
    }
}