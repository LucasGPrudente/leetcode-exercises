## [228. Summary Ranges](https://leetcode.com/problems/summary-ranges/)

<code>Easy</code> <code>Array</code>

<br>

You are given a __sorted unique__ integer array nums.

A __range__ <code>[a,b]</code> is the set of all integers from <code>a</code> to <code>b</code> (inclusive).

Return *the __smallest sorted__ list of ranges that __cover all the numbers in the array exactly__*. That is, each element of <code>nums</code> is covered by exactly one of the ranges, and there is no integer <code>x</code> such that <code>x</code> is in one of the ranges but not in <code>nums</code>.

Each range <code>[a,b]</code>  in the list should be output as:

- <code>"a->b"</code> if <code>a != b</code>
- <code>"a"</code> if <code>a == b</code>

<br>

#### Example 1:

> __Input:__ nums = [0,1,2,4,5,7]
>
> __Output:__ ["0->2","4->5","7"]
>
> __Explanation:__ The ranges are:
> [0,2] = "0->2"
> [4,5] = "4->5"
> [7,7] = "7"

#### Example 2:

> __Input:__ nums = [0,2,3,4,6,8,9]
>
> __Output:__ ["0","2->4","6","8->9"]
>
> __Explanation:__ The ranges are:
> [0,0] = "0"
> [2,4] = "2->4"
> [6,6] = "6"
> [8,9] = "8->9"

<br>

#### Constraints:

- <code>0 <= nums.length <= 20</code>
- <code>-2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1</code>
- All the values of <code>nums</code> are unique.
- <code>nums</code> is sorted in ascending order.
