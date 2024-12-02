## [1346. Check If N and Its Double Exist](https://leetcode.com/problems/check-if-n-and-its-double-exist/)

<code>Easy</code> <code>Array</code> <code>Hash Table</code> <code>Two Pointers</code> <code>Binary Search</code> <code>Sorting</code>

<br>

Given an array <code>arr</code> of integers, check if there exist two indices <code>i</code> and <code>j</code> such that:

- <code>i != j</code>
- <code>0 <= i, j < arr.length</code>
- <code>arr[i] == 2 * arr[j]</code>

<br>

#### Example 1:

> __Input:__ arr = [10,2,5,3]
>
> __Output:__ true
>
> __Explanation:__ For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]

#### Example 2:

> __Input:__ arr = [3,1,7,11]
>
> __Output:__ false
>
> __Explanation:__ There is no i and j that satisfy the conditions.

<br>

#### Constraints:

- <code>2 <= arr.length <= 500</code>
- <code>-10<sup>3</sup> <= arr[i] <= 10<sup>3</sup></code>