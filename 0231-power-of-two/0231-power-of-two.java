import java.lang.Math;

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n<1) return false;

        double x = n;
        while (x>=1) {
            if (x % (int)x != 0.0)
                return false;
            x /= 2; 
        }
        return true;

    }
}