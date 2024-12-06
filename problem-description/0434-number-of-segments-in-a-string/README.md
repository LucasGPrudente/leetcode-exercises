## [434. Number of Segments in a String](https://leetcode.com/problems/number-of-segments-in-a-string/)

<code>Easy</code> <code>String</code>

<br>

Given a string <code>s</code>, return *the number of segments in the string*.

A __segment__ is defined to be a contiguous sequence of __non-space characters__.

<br>

#### Example 1:

> __Input:__ s = "Hello, my name is John"
>
> __Output:__ 5
>
> __Explanation:__ The five segments are ["Hello,", "my", "name", "is", "John"]

#### Example 2:

> __Input:__ s = "Hello"
>
> __Output:__ 1

<br>

#### Constraints:

- <code>0 <= s.length <= 300</code>
- <code>s</code> consists of lowercase and uppercase English letters, digits, or one of the following characters <code>"!@#$%^&*()_+-=',.:"</code>.
- The only space character in <code>s</code> is <code>' '</code>.