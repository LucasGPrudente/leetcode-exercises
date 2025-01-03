## [1. Two Sum](https://leetcode.com/problems/two-sum/)

<code>Easy</code> <code>Array</code> <code>Hash Table</code>

<br>

Given an array of integers <code>nums</code> and an integer <code>target</code>, return *indices of the two numbers such that they add up to <code>target</code>*.

You may assume that each input would have __*exactly* one solution__, and you may not use the same element twice.

You can return the answer in any order.

<br>

#### Example 1:

> __Input:__ nums = [2,7,11,15], target = 9
>
> __Output:__ [0,1]
>
> __Explanation:__ Because nums[0] + nums[1] == 9, we return [0,1].

#### Example 2:

> __Input:__ nums = [3,2,4], target = 6
>
> __Output:__ [1,2]

#### Example 3:

> __Input:__ nums = [3,3], target = 6
>
> __Output:__ [0,1]

<br>

#### Constraints:

- <code>2 <= nums.length <= 10<sup>4</sup></code>
- <code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code>
- <code>-10<sup>9</sup> <= target <= 10<sup>9</sup></code>
- __Only one valid answer exists.__