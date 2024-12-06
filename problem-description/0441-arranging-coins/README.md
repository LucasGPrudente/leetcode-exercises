## [441. Arranging Coins](https://leetcode.com/problems/arranging-coins/)

<code>Easy</code> <code>Math</code> <code>Binary Search</code>

<br>

You have <code>n</code> coins and you want to build a staircase with these coins. The staircase consists of <code>k</code> rows where the <code>i<sup>th</sup></code> row has exactly <code>i</code> coins. The last row of the staircase __may be__ incomplete.

Given the integer <code>n</code>, return *the number of __complete rows__ of the staircase you will build*.

<br>

#### Example 1:

> __Input:__ n = 5
>
> __Output:__ 2
>
> __Explanation:__ Because the 3rd row is incomplete, we return 2.

#### Example 2:

> __Input:__ n = 8
>
> __Output:__ 3
>
> __Explanation:__ Because the 4th row is incomplete, we return 3.

<br>

#### Constraints:

- <code>1 <= n <= 2<sup>31</sup> - 1</code>