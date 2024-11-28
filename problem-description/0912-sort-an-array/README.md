## [912. Sort an Array](https://leetcode.com/problems/sort-an-array/)

<code>Medium</code> <code>Array</code> <code>Divide and Conquer</code> <code>Heap (Priority Queue)</code>

<code>Sorting</code> <code>Merge Sort</code> <code>Bucket Sort</code> <code>Radix Sort</code><code>Counting Sort</code>

<br>

Given an array of integers <code>nums</code>, sort the array in ascending order and return it.

You must solve the problem __without using any built-in__ functions in <code>O(nlog(n))</code> time complexity and with the smallest space complexity possible.

<br>

#### Example 1:

> __Input:__ nums = [5,2,3,1]
>
> __Output:__ [1,2,3,5]
>
> __Explanation:__ After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).

#### Example 2:

> __Input:__ nums = [5,1,1,2,0,0]
>
> __Output:__ [0,0,1,1,2,5]
>
> __Explanation:__ Note that the values of nums are not necessairly unique.

<br>

#### Constraints:

- <code>1 <= nums.length <= 5 * 10<sup>4</sup></code>
- <code>-5 * 10<sup>4</sup> <= nums[i] <= 5 * 10<sup>4</sup></code>