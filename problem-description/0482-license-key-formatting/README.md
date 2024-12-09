## [482. License Key Formatting](https://leetcode.com/problems/license-key-formatting/)

<code>Easy</code> <code>String</code>

<br>

You are given a license key represented as a string <code>s</code> that consists of only alphanumeric characters and dashes. The string is separated into <code>n + 1</code> groups by <code>n</code> dashes. You are also given an integer <code>k</code>.

We want to reformat the string <code>s</code> such that each group contains exactly <code>k</code> characters, except for the first group, which could be shorter than <code>k</code> but still must contain at least one character. Furthermore, there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase.

Return *the reformatted license key*.

<br>

#### Example 1:

> __Input:__ s = "5F3Z-2e-9-w", k = 4
>
> __Output:__ "5F3Z-2E9W"
>
> __Explanation:__ The string s has been split into two parts, each part has 4 characters.
>
> Note that the two extra dashes are not needed and can be removed.

#### Example 2:

> __Input:__ s = "2-5g-3-J", k = 2
>
> __Output:__ "2-5G-3J"
>
> __Explanation:__ The string s has been split into three parts, each part has 2 characters except the first part as it could be shorter as mentioned above.

<br>

#### Constraints:

- <code>1 <= s.length <= 10<sup>5</sup></code>
- <code>s</code>  consists of English letters, digits, and dashes <code>'-'</code>.
- <code>1 <= k <= 10<sup>4</sup></code>