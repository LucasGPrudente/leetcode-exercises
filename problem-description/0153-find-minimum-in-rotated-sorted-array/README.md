## [153. Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)

<code>Medium</code> <code>Array</code> <code>Binary Search</code>

<br>

Suppose an array of length <code>n</code> sorted in ascending order is __rotated__ between <code>1</code> and <code>n</code> times. For example, the array <code>nums = [0,1,2,4,5,6,7]</code> might become:

- <code>[4,5,6,7,0,1,2]</code> if it was rotated <code>4</code> times.
- <code>[0,1,2,4,5,6,7]</code> if it was rotated <code>7</code> times.

Notice that __rotating__ an array <code>[a[0], a[1], a[2], ..., a[n-1]]</code> 1 time results in the array <code>[a[n-1], a[0], a[1], a[2], ..., a[n-2]]</code>.

Given the sorted rotated array <code>nums</code> of __unique__ elements, return *the minimum element of this array*.

You must write an algorithm that runs in <code>O(log n) time</code>.

<br>

#### Example 1:

> __Input:__ nums = [3,4,5,1,2]
>
> __Output:__ 1
>
> __Explanation:__ The original array was [1,2,3,4,5] rotated 3 times.

#### Example 2:

> __Input:__ nums = [4,5,6,7,0,1,2]
>
> __Output:__ 0
>
> __Explanation:__ The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.

#### Example 3:

> __Input:__ nums = [11,13,15,17]
>
> __Output:__ 11
>
> __Explanation:__ The original array was [11,13,15,17] and it was rotated 4 times.

<br>

#### Constraints:

- <code>n == nums.length</code>
- <code>1 <= n <= 5000</code>
- <code>-5000 <= nums[i] <= 5000</code>
- All the integers of <code>nums</code> are __unique__.
- <code>nums</code> is sorted and rotated between <code>1</code> and <code>n</code> times.