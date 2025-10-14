class Solution {
    public int maxArea(int[] height) {
       // double pointer
       // smaller  * distance 

       int f = 0;
       int b = height.length -1;

       int amt_water = 0;
       while (f < b) {
           int f_num = height[f];
           int b_num = height[b];

           int diff = b-f;

           if (f_num < b_num) {
            int t_amt = f_num * diff;
            if (t_amt > amt_water) {
                amt_water = t_amt;
            }
            f++;
            continue;
           } else {
            int t_amt = b_num * diff;
            if (t_amt > amt_water) {
                amt_water = t_amt;
            }
            b--;
            continue;
           }

       }
       return amt_water;
    }
}