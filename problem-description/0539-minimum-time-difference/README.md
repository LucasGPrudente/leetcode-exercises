## [539. Minimum Time Difference](https://leetcode.com/problems/minimum-time-difference/)

<code>Medium</code> <code>Array</code> <code>Math</code> <code>String</code> <code>Sorting</code>

<br>

Given a list of 24-hour clock time points in __"HH:MM"__ format, return *the __minimum__ minutes difference between any two time-points in the list*.

<br>

#### Example 1:

> Input: timePoints = ["23:59","00:00"]
>
> Output: 1

#### Example 2:

> Input: timePoints = ["00:00","23:59","00:00"]
>
> Output: 0

<br>

#### Constraints:

- <code>2 <= timePoints.length <= 2 * 10<sup>4</sup></code>
- <code>timePoints[i]</code> is in the format __"HH:MM"__.