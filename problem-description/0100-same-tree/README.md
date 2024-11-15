## [100. Same Tree](https://leetcode.com/problems/same-tree/)

<code>Easy</code> <code>Tree</code> <code>Depth-First Search</code> <code>Breadth-First Search</code> <code>Binary Tree</code>

<br>

Given the roots of two binary trees <code>p</code> and <code>q</code>, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

<br>

#### Example 1:

> __Input:__ p = [1,2,3], q = [1,2,3]
>
> __Output:__ true

#### Example 2:

> __Input:__ p = [1,2], q = [1,null,2]
>
> __Output:__ false

#### Example 3:

> __Input:__ p = [1,2,1], q = [1,1,2]
>
> __Output:__ false

<br>

#### Constraints:

- The number of nodes in both trees is in the range <code>[0, 100]</code>.
- <code>-10<sup>4</sup> <= Node.val <= 10<sup>4</sup></code>