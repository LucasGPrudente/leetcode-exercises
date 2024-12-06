## [292. Nim Game](https://leetcode.com/problems/nim-game/)

<code>Easy</code> <code>Math</code> <code>Brainteaser</code> <code>Game Theory</code>

<br>

You are playing the following Nim Game with your friend:

- Initially, there is a heap of stones on the table.
- You and your friend will alternate taking turns, and __you go first__.
- On each turn, the person whose turn it is will remove 1 to 3 stones from the heap.
- The one who removes the last stone is the winner.

Given <code>n</code>, the number of stones in the heap, return <code>true</code> *if you can win the game assuming both you and your friend play optimally, otherwise return* <code>false</code>.

<br>

#### Example 1:

> __Input:__ n = 4
>
> __Output:__ false
>
> __Explanation:__ These are the possible outcomes:
>
> 1. You remove 1 stone. Your friend removes 3 stones, including the last stone. Your friend wins.
> 2. You remove 2 stones. Your friend removes 2 stones, including the last stone. Your friend wins.
> 3. You remove 3 stones. Your friend removes the last stone. Your friend wins.
>
> In all outcomes, your friend wins.

#### Example 2:

> __Input:__ n = 1
>
> __Output:__ true

#### Example 3:

> __Input:__ n = 2
>
> __Output:__ true

<br>

#### Constraints:

- <code>1 <= n <= 2<sup>31</sup> - 1</code>