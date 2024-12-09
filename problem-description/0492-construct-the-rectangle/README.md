## [492. Construct the Rectangle](https://leetcode.com/problems/construct-the-rectangle/)

<code>Easy</code> <code>Math</code>

<br>

A web developer needs to know how to design a web page's size. So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements:

1. The area of the rectangular web page you designed must equal to the given target area.
2. The width <code>W</code> should not be larger than the length <code>L</code>, which means <code>L >= W</code>.
3. The difference between length <code>L</code> and width <code>W</code> should be as small as possible.

Return *an array* <code>[L, W]</code> *where* <code>L</code> *and* <code>W</code> *are the length and width of the web page you designed in sequence*.

<br>

#### Example 1:

> __Input:__ area = 4
>
> __Output:__ [2,2]
>
> __Explanation:__ The target area is 4, and all the possible ways to construct it are [1,4], [2,2], [4,1].
>
> But according to requirement 2, [1,4] is illegal; according to requirement 3,  [4,1] is not optimal compared to [2,2]. So the length L is 2, and the width W is 2.

#### Example 2:

> __Input:__ area = 37
>
> __Output:__ [37,1]

#### Example 3:

> __Input:__ area = 122122
>
> __Output:__ [427,286]

<br>

#### Constraints:

- <code>1 <= area <= 10<sup>7</sup></code>