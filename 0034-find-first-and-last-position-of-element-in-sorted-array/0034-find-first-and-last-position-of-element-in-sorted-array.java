class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0 ;
        int end = nums.length-1;
        int len = nums.length;


        while(start<=end){
            int mid = (start + end)/2;
            if(nums[mid]==target){
                int left = mid;
                int right = mid;
                // left / right
                while (right + 1 < len) {
                    if (nums[right+1] == target) {
                        // mid++;
                        right++;
                    } else {break;}
                }
                while (left - 1 >= 0) {
                    if (nums[left-1] == target) {
                        // mid--;
                        left--;
                    } else {break;}
                }
                
                return new int[] {left, right};
            }else if ( target > nums[mid]){
                start = mid +1 ;
            }else{
                end = mid -1 ;
            }
        }


        return new int[] {-1, -1};
    }
}