class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int l = 0;
        int r = arr.length-1;
        
        while (l <= r) {
            int m = (l+r)/2;
            
            if (k > arr[m]) {
                l = m+1;
            } else if (k < arr[m]) {
                r = m-1;
            } else {
                return true;
            }
        }
        return false;
    }
}