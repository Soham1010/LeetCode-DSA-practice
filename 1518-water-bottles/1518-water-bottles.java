class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drank = numBottles;

        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;

            drank = drank + newBottles;

            // FIX: Your total empty bottles for the next round 
            // is the new full bottles you just drank + the leftovers.
            numBottles = newBottles + remBottles; 
        }

        return drank;
    }
}