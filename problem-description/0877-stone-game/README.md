## [877. Stone Game](https://leetcode.com/problems/stone-game/)

<code>Medium</code> <code>Array</code> <code>Math</code> <code>Dynamic Programming</code> <code>Game Theory</code>

<br>

Alice and Bob play a game with piles of stones. There are an __even__ number of piles arranged in a row, and each pile has a __positive__ integer number of stones <code>piles[i]</code>.

The objective of the game is to end with the most stones. The __total__ number of stones across all the piles is __odd__, so there are no ties.

Alice and Bob take turns, with __Alice starting first__. Each turn, a player takes the entire pile of stones either from the __beginning__ or from the __end__ of the row. This continues until there are no more piles left, at which point the person with the __most stones wins__.

Assuming Alice and Bob play optimally, return <code>true</code> *if Alice wins the game, or* <code>false</code> *if Bob wins*.

<br>

#### Example 1:

> __Input:__ piles = [5,3,4,5]
>
> __Output:__ true
>
> __Explanation:__
>
> Alice starts first, and can only take the first 5 or the last 5.
>
> Say she takes the first 5, so that the row becomes [3, 4, 5].
>
> If Bob takes 3, then the board is [4, 5], and Alice takes 5 to win with 10 points.
>
> If Bob takes the last 5, then the board is [3, 4], and Alice takes 4 to win with 9 points.
>
> This demonstrated that taking the first 5 was a winning move for Alice, so we return true.

#### Example 2:

> __Input:__ piles = [3,7,2,3]
>
> __Output:__ true

<br>

#### Constraints:

- <code>2 <= piles.length <= 500</code>
- <code>piles.length</code> is __even__.
- <code>1 <= piles[i] <= 500</code>
- <code>sum(piles[i])</code> is __odd__.