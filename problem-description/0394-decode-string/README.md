## [394. Decode String](https://leetcode.com/problems/decode-string/)

<code>Medium</code> <code>String</code> <code>Stack</code> <code>Recursion</code>

<br>

Given an encoded string, return its decoded string.

The encoding rule is: <code>k[encoded_string]</code>, where the <code>encoded_string</code> inside the square brackets is being repeated exactly <code>k</code> times. Note that <code>k</code> is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, <code>k</code>. For example, there will not be input like <code>3a</code> or <code>2[4]</code>.

The test cases are generated so that the length of the output will never exceed <code>10<sup>5</sup></code>.

<br>

#### Example 1:

> __Input:__ s = "3[a]2[bc]"
>
> __Output:__ "aaabcbc"

#### Example 2:

> __Input:__ s = "3[a2[c]]"
>
> __Output:__ "accaccacc"

#### Example 3:

> __Input:__ s = "2[abc]3[cd]ef"
>
> __Output:__ "abcabccdcdcdef"

<br>

#### Constraints:

- <code>1 <= s.length <= 30</code>
- <code>s</code> consists of lowercase English letters, digits, and square brackets <code>'[]'</code>.
- <code>s</code> is guaranteed to be __a valid__ input.
- All the integers in <code>s</code> are in the range <code>[1, 300]</code>.