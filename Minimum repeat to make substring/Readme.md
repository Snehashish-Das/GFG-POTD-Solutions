# POTD: Minimum repeat to make substring

Given two strings **s1** and **s2**. Return a minimum number of times **s1** has to be repeated such that s2 is a substring of it. If **s2** can never be a substring then return **-1**.

Note: Both the strings contain only lowercase letters.

Examples:

>Input: s1 = "ww", s2 = "www"\
>Output: 2\
>Explanation: Repeating s1 two times (wwww), s2 is a substring of it.

>Input: s1 = "abcd", s2 = "cdabcdab" \
>Output: 3 \
>Explanation: Repeating s1 three times (abcdabcdabcd), s2 is a substring of it. s2 is not a substring of s2 when it is repeated less than 3 times.

>Input: s1 = "ab", s2 = "cab"\
>Output: -1\
>Explanation: No matter how many times we repeat s1, we can't get a string such that s2 is a substring of it.

<hr>

Difficulty: Medium\
Points: 4\
Date: 08/11/2024

Solve it here: [Click Here](https://www.geeksforgeeks.org/problems/minimum-times-a-has-to-be-repeated-such-that-b-is-a-substring-of-it--170645/1)
