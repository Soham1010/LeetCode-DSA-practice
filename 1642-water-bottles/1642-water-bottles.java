class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int filled = numBottles;
        int drink = numBottles;
        int mt_bottles = numBottles;

        while (mt_bottles >= numExchange) {
            // Exchange:
            int rem = mt_bottles % numExchange;
            int filled_bottles_got = mt_bottles/numExchange;
            
            // Drink
            drink += filled_bottles_got;
            mt_bottles = rem + filled_bottles_got;
        }
        return drink;

    }
}