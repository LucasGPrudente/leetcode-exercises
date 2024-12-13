## [36. Valid Sudoku](https://leetcode.com/problems/valid-sudoku/)

<code>Medium</code>
Array
Matrix
Hash Table
Ordered Set
Backtracking
Bit Manipulation
Recursion
Bitmask
Iterator
Math
String
Ordered Map
Hash Function
Dynamic Programming
Greedy
Counting
Simulation
Sorting
Two Pointers
Interactive
Memoization
String Matching
Divide and Conquer
Enumeration
Game Theory
Number Theory
Heap (Priority Queue)
Brainteaser
Linked List
Binary Tree
Queue
Breadth-First Search
Monotonic Stack
Design
Geometry
Depth-First Search
Line Sweep
Prefix Sum

<br>

Determine if a 9 x 9<code>Medium</code> Sudoku board is valid. Only the filled cells need to be validated __according to the following rules__:

1. Each row must contain the digits <code>1-9</code> without repetition.
2. Each column must contain the digits <code>1-9</code> without repetition.
3. Each of the nine <code>3 x 3</code> sub-boxes of the grid must contain the digits <code>1-9</code> without repetition.

__Note:__

- A Sudoku board (partially filled) could be valid but is not necessarily solvable.
- Only the filled cells need to be validated according to the mentioned rules.

<br>

#### Example 1:

> __Input:__ board =
>
> [ ["5","3",".",".","7",".",".",".","."], ["6",".",".","1","9","5",".",".","."], [".","9","8",".",".",".",".","6","."]
>
> , ["8",".",".",".","6",".",".",".","3"], ["4",".",".","8",".","3",".",".","1"], ["7",".",".",".","2",".",".",".","6"]
>
> , [".","6",".",".",".",".","2","8","."], [".",".",".","4","1","9",".",".","5"], [".",".",".",".","8",".",".","7","9"] ]
>
> __Output:__ true

#### Example 2:

> __Input:__ board =
>
> [ ["8","3",".",".","7",".",".",".","."], ["6",".",".","1","9","5",".",".","."], [".","9","8",".",".",".",".","6","."]
>
> , ["8",".",".",".","6",".",".",".","3"], ["4",".",".","8",".","3",".",".","1"], ["7",".",".",".","2",".",".",".","6"]
>
> , [".","6",".",".",".",".","2","8","."], [".",".",".","4","1","9",".",".","5"], [".",".",".",".","8",".",".","7","9"] ]
>
> __Output:__ false
>
> __Explanation:__ Same as Example 1, except with the __5__ in the top left corner being modified to __8__. Since there are two 8's in the top left 3x3 sub-box, it is invalid.

<br>

#### Constraints:

- <code>board.length == 9</code>
- <code>board[i].length == 9</code>
- <code>board[i][j]</code> is a digit <code>1-9</code> or <code>'.'</code>.