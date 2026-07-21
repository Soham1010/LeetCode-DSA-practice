class Solution {
    public void sort012(int[] arr) {
        // code here
        int zero = 0, one = 0, two = 0;
        
        for (int currNum : arr) {
            if (currNum == 0) {
                zero++;
            } else if (currNum == 1) {
                one++;
            } else {
                two++;
            }
        }
        
        for (int i=0; i < arr.length; i++) {
            // If i in 0-zero
            // If i in zero-one
            // if i in one-arr.length
            
            if (0 <= i && i < zero) {
                arr[i] = 0;
            } else if (i < zero + one) {
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }
        }
        
        
        
    }
}