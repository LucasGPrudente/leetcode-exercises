## [217. Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)

<code>Easy</code> <code>Array</code> <code>Hash Table</code> <code>Sorting</code>

<br>

Given an integer array <code>nums</code>, return <code>true</code> if any value appears __at least twice__ in the array, and return <code>false</code> if every element is distinct.

<br>

#### Example 1:

> __Input:__ nums = [1,2,3,1]
>
> __Output:__ true
>
> __Explanation:__ The element 1 occurs at the indices 0 and 3.

#### Example 2:

> __Input:__ nums = [1,2,3,4]
>
> __Output:__ false
>
> __Explanation:__ All elements are distinct.

#### Example 3:

> __Input:__ nums = [1,1,1,3,3,4,3,2,4,2]
>
> __Output:__ true

<br>

#### Constraints:

- <code>1 <= nums.length <= 10<sup>5</sup></code>
- <code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code>