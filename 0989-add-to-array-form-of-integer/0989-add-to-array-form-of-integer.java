import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> out = new ArrayList<>();
        int i = num.length - 1;
        
        // Loop from right to left, adding k to the current digit
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i]; // Add the current digit to k
                i--;
            }
            
            out.add(k % 10); // Take the last digit of the sum and add it to our list
            k /= 10;         // Carry over the remaining part of k to the next place value
        }
        
        // Since we added digits from right to left, our list is backwards. 
        // We just need to reverse it.
        Collections.reverse(out);
        return out;
    }
}