// Find and return the maximum profit you can achieve

/**
 * @param {number[]} prices
 * @return {number}
 */

var maxProfit = function (prices) {
  let maxProfit = 0;
  let buy = 0;

  for (let i = 1; i < prices.length; i++) {
      if (prices[i] < prices[i - 1]) {
          maxProfit += prices[i - 1] - prices[buy];
          prices[buy] = prices[i];
      }
  }

  maxProfit += prices[prices.length - 1] - prices[buy];

  return maxProfit;
};