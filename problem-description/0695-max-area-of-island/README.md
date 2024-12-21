## [695. Max Area of Island](https://leetcode.com/problems/max-area-of-island/)

<code>Medium</code> <code>Array</code> <code>Depth-First Search</code> <code>Breadth-First Search</code> <code>Union Find</code> <code>Matrix</code>

<br>

You are given an <code>m x n</code> binary matrix <code>grid</code>. An island is a group of <code>1</code>'s (representing land) connected __4-directionally__ (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

The __area__ of an island is the number of cells with a value <code>1</code> in the island.

Return *the maximum __area__ of an island in* <code>grid</code>. If there is no island, return <code>0</code>.

<br>

#### Example 1:

> __Input:__ grid = [ [0,0,1,0,0,0,0,1,0,0,0,0,0], [0,0,0,0,0,0,0,1,1,1,0,0,0], [0,1,1,0,1,0,0,0,0,0,0,0,0], [0,1,0,0,1,1,0,0,1,0,1,0,0], [0,1,0,0,1,1,0,0,1,1,1,0,0], [0,0,0,0,0,0,0,0,0,0,1,0,0], [0,0,0,0,0,0,0,1,1,1,0,0,0], [0,0,0,0,0,0,0,1,1,0,0,0,0] ]
>
> __Output:__ 6
>
> __Explanation:__ The answer is not 11, because the island must be connected 4-directionally.

#### Example 2:

> __Input:__ grid = [[0,0,0,0,0,0,0,0]]
>
> __Output:__ 0

<br>

#### Constraints:

- <code>m == grid.length</code>
- <code>n == grid[i].length</code>
- <code>1 <= m, n <= 50</code>
- <code>grid[i][j]</code> is either <code>0</code> or <code>1</code>.