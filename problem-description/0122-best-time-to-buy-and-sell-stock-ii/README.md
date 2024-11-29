## [122. Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/)

<code>Medium</code> <code>Array</code> <code>Dynamic Programming</code> <code>Greedy</code>

<br>

You are given an integer array <code>prices</code> where <code>prices[i]</code> is the price of a given stock on the <code>i<sup>th</sup></code> day.

On each day, you may decide to buy and/or sell the stock. You can only hold __at most one__ share of the stock at any time. However, you can buy it then immediately sell it on the __same day__.

Find and return *the __maximum__ profit you can achieve*.

<br>

#### Example 1:

> __Input:__ prices = [7,1,5,3,6,4]
>
> __Output:__ 7
>
> __Explanation:__ Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
>
> Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
>
> Total profit is 4 + 3 = 7.


#### Example 2:

> __Input:__ prices = [1,2,3,4,5]
>
> __Output:__ 4
> >
> __Explanation:__ Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
>
> Total profit is 4.


#### Example 3:

> __Input:__ prices = [7,6,4,3,1]
>
> __Output:__ 0
>
> __Explanation:__ There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.

<br>

#### Constraints:

- <code>1 <= prices.length <= 3 * 10<sup>4</sup></code>
- <code>0 <= prices[i] <= 10<sup>4</sup></code>