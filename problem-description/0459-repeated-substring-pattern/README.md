## [459. Repeated Substring Pattern](https://leetcode.com/problems/repeated-substring-pattern/)

<code>Easy</code> <code>String</code> <code>String Matching</code>

<br>

Given a string <code>s</code>, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

<br>

#### Example 1:

> __Input:__ s = "abab"
>
> __Output:__ true
>
> __Explanation:__ It is the substring "ab" twice.

#### Example 2:

> __Input:__ s = "aba"
>
> __Output:__ false

#### Example 3:

> __Input:__ s = "abcabcabcabc"
>
> __Output:__ true
>
> __Explanation:__ It is the substring "abc" four times or the substring "abcabc" twice.

<br>

#### Constraints:

- <code>1 <= s.length <= 10<sup>4</sup></code>
- <code>s</code> consists of lowercase English letters.