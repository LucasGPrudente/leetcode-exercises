## [451. Sort Characters By Frequency](https://leetcode.com/problems/sort-characters-by-frequency/)

<code>Medium</code> <code>Hash Table</code> <code>String</code> <code>Sorting</code> <code>Heap (Priority Queue)</code> <code>Bucket Sort</code> <code>Counting</code>

<br>

Given a string <code>s</code>, sort it in __decreasing order__ based on the __frequency__ of the characters. The __frequency__ of a character is the number of times it appears in the string.

Return *the sorted string*. If there are multiple answers, return *any of them*.

<br>

#### Example 1:

> __Input:__ s = "tree"
>
> __Output:__ "eert"
>
> __Explanation:__ 'e' appears twice while 'r' and 't' both appear once.
>
> So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

#### Example 2:

> __Input:__ s = "cccaaa"
>
> __Output:__ "aaaccc"
>
> __Explanation:__ Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
>
> Note that "cacaca" is incorrect, as the same characters must be together.

#### Example 3:

> __Input:__ s = "Aabb"
>
> __Output:__ "bbAa"
>
> __Explanation:__ "bbaA" is also a valid answer, but "Aabb" is incorrect.
>
> Note that 'A' and 'a' are treated as two different characters.

<br>

#### Constraints:

- <code>1 <= s.length <= 5 * 10<sup>5</sup></code>
- <code>s</code> consists of uppercase and lowercase English letters and digits.