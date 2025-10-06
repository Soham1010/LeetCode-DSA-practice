class Solution {
    public int tribonacci(int n) {
       if (n == 0)  {
        return 0;
       } else if (n==1) {
        return 1;
       } else if (n == 2) {
        return 1;
       }

        int fNum = 0;
        int sNum = 1;
        int tNum = 1;

        for( int i=1; i<=n; i++) {
            int tri = fNum + sNum + tNum;
            fNum = sNum;
            sNum = tNum;
            tNum = tri;
        }
        return fNum;

    }
}