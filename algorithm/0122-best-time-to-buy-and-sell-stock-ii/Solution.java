class Solution {

    // Find and return the maximum profit you can achieve
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                maxProfit += prices[i - 1] - minPrice;
                minPrice = prices[i];
            }
        }

        maxProfit += prices[prices.length - 1] - minPrice;

        return maxProfit;
    }
}