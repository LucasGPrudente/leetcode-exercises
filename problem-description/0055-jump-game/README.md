## [55. Jump Game](https://leetcode.com/problems/jump-game/)

<code>Medium</code> <code>Array</code> <code>Dynamic Programming</code> <code>Greedy</code>

<br>

You are given an integer array <code>nums</code>. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return <code>true</code> *if you can reach the last index, or* <code>false</code> *otherwise*.

<br>

#### Example 1:

> __Input:__ nums = [2,3,1,1,4]
>
> __Output:__ true
>
> __Explanation:__ Jump 1 step from index 0 to 1, then 3 steps to the last index.

#### Example 2:

> __Input:__ nums = [3,2,1,0,4]
>
> __Output:__ false
>
> __Explanation:__ You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.

<br>

#### Constraints:

- <code>1 <= nums.length <= 10<sup>4</sup></code>
- <code>0 <= nums[i] <= 10<sup>5</sup></code>