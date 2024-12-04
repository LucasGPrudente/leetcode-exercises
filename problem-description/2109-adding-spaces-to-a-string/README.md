## [2109. Adding Spaces to a String](https://leetcode.com/problems/adding-spaces-to-a-string/)

<code>Medium</code> <code>Array</code> <code>Two Pointers</code> <code>String</code> <code>Simulation</code>

<br>

You are given a __0-indexed__ string s and a __0-indexed__ integer array spaces that describes the indices in the original string where spaces will be added. Each space should be inserted __before__ the character at the given index.

- For example, given <code>s = "EnjoyYourCoffee"</code> and <code>spaces = [5, 9]</code>, we place spaces before <code>'Y'</code> and <code>'C'</code>, which are at indices <code>5</code> and <code>9</code> respectively. Thus, we obtain <code>"Enjoy Your Coffee"</code>.

Return the modified string __after__ the spaces have been added.

<br>

### Example 1:

> __Input:__ s = "LeetcodeHelpsMeLearn", spaces = [8,13,15]
>
> __Output:__ "Leetcode Helps Me Learn"
>
> __Explanation:__ The indices 8, 13, and 15 correspond to the underlined characters in "LeetcodeHelpsMeLearn".
>
> We then place spaces before those characters.

### Example 2:

> __Input:__ s = "icodeinpython", spaces = [1,5,7,9]
>
> __Output:__ "i code in py thon"
>
> __Explanation:__ The indices 1, 5, 7, and 9 correspond to the underlined characters in "icodeinpython".
>
> We then place spaces before those characters.

### Example 3:

> __Input:__ s = "spacing", spaces = [0,1,2,3,4,5,6]
>
> __Output:__ " s p a c i n g"
>
> __Explanation:__ We are also able to place spaces before the first character of the string.

<br>

### Constraints:

- <code>1 <= s.length <= 3 * 10<sup>5</sup></code>
- <code>s</code> consists only of lowercase and uppercase English letters.
- <code>1 <= spaces.length <= 3 * 10<sup>5</sup></code>
- <code>0 <= spaces[i] <= s.length - 1</code>
- All the values of <code>spaces</code> are __strictly increasing__.