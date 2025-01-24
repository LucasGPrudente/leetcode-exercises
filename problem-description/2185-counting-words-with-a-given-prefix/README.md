## [2185. Counting Words With a Given Prefix](https://leetcode.com/problems/counting-words-with-a-given-prefix/)

<code>Easy</code> <code>Array</code> <code>String</code> <code>String Matching</code>

<br>

You are given an array of strings <code>words</code> and a string <code>pref</code>.

Return *the number of strings in* <code>words</code> *that contain* <code>pref</code> *as a __prefix__*.

A __prefix__ of a string <code>s</code> is any leading contiguous substring of <code>s</code>.

<br>

#### Example 1:

> __Input:__ words = ["pay","attention","practice","attend"], pref = "at"
>
> __Output:__ 2
>
> __Explanation:__ The 2 strings that contain "at" as a prefix are: "__at__ tention" and "__at__ tend".

#### Example 2:

> __Input:__ words = ["leetcode","win","loops","success"], pref = "code"
>
> __Output:__ 0
>
> __Explanation:__ There are no strings that contain "code" as a prefix.

<br>

#### Constraints:

- <code>1 <= words.length <= 100</code>
- <code>1 <= words[i].length, pref.length <= 100</code>
- <code>words[i]</code> and <code>pref</code> consist of lowercase English letters.