## [38. Count and Say](https://leetcode.com/problems/count-and-say/)

<code>Medium</code> <code>String</code>

<br>

The __count-and-say__ sequence is a sequence of digit strings defined by the recursive formula:

- <code>countAndSay(1) = "1"</code>
- <code>countAndSay(n)</code> is the run-length encoding of <code>countAndSay(n - 1)</code>.

__Run-length encoding__ (RLE) is a string compression method that works by replacing consecutive identical characters (repeated 2 or more times) with the concatenation of the character and the number marking the count of the characters (length of the run). For example, to compress the string <code>"3322251"</code> we replace <code>"33"</code> with <code>"23"</code>, replace <code>"222"</code> with <code>"32"</code>, replace <code>"5"</code> with <code>"15"</code> and replace <code>"1"</code> with <code>"11"</code>. Thus the compressed string becomes <code>"23321511"</code>.

Given a positive integer <code>n</code>, return *the* <code>n<sup>th</sup></code> *element of the __count-and-say__ sequence*.

<br>

#### Example 1:

> __Input:__ n = 4
>
> __Output:__ "1211"
>
> __Explanation:__
>
> countAndSay(1) = "1"
>
> countAndSay(2) = RLE of "1" = "11"
>
> countAndSay(3) = RLE of "11" = "21"
>
> countAndSay(4) = RLE of "21" = "1211"

#### Example 2:

> __Input:__ n = 1
>
> __Output:__ "1"
>
> __Explanation:__ This is the base case.

<br>

#### Constraints:

- <code>1 <= n <= 30</code>