## [419. Battleships in a Board](https://leetcode.com/problems/battleships-in-a-board/)

<code>Medium</code> <code>Array</code> <code>Depth-First Search</code> <code>Matrix</code>

<br>

Given an <code>m x n</code> matrix <code>board</code> where each cell is a battleship <code>'X'</code> or empty <code>'.'</code>, return *the number of the __battleships__ on* <code>board</code>.

Battleships can only be placed horizontally or vertically on <code>board</code>. In other words, they can only be made of the shape <code>1 x k</code> (<code>1</code> row, <code>k</code> columns) or <code>k x 1</code> (<code>k</code> rows, <code>1</code> column), where <code>k</code> can be of any size. At least one horizontal or vertical cell separates between two __battleships__ (i.e., there are no adjacent battleships).

<br>

#### Example 1:

> __Input:__ board = [ ["X",".",".","X"], [".",".",".","X"], [".",".",".","X"] ]
>
> __Output:__ 2

#### Example 2:

> __Input:__ board = [ ["."] ]
>
> __Output:__ 0

<br>

#### Constraints:

- <code>m == board.length</code>
- <code>n == board[i].length</code>
- <code>1 <= m, n <= 200</code>
- <code>board[i][j]</code> is either <code>'.'</code> or <code>'X'</code>.