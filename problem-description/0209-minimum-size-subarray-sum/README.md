## [209. Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/)

<code>Medium</code> <code>Array</code> <code>Binary Search</code> <code>Sliding Window</code> <code>Prefix Sum</code>

<br>

Given an array of positive integers <code>nums</code> and a positive integer <code>target</code>, return *the __minimal length__ of a subarray whose sum is greater than or equal to* <code>target</code>. If there is no such subarray, return <code>0</code> instead.

<br>

#### Example 1:

> __Input:__ target = 7, nums = [2,3,1,2,4,3]
>
> __Output:__ 2
>
> __Explanation:__ The subarray [4,3] has the minimal length under the problem constraint.

#### Example 2:

> __Input:__ target = 4, nums = [1,4,4]
>
> __Output:__ 1

#### Example 3:

> __Input:__ target = 11, nums = [1,1,1,1,1,1,1,1]
>
> __Output:__ 0

<br>

#### Constraints:

- <code>1 <= target <= 10<sup>9</sup></code>
- <code>1 <= nums.length <= 10<sup>5</sup></code>
- <code>1 <= nums[i] <= 10<sup>4</sup></code>