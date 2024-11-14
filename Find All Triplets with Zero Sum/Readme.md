# POTD: Find All the Triplets with Zero Sum

Given an array **arr[]**, find all possible indices **[i, j, k]** of triplets **[arr[i], arr[j], arr[k]]** in the array whose sum is equal to **zero**. Return **indices** of triplets in any order and all the returned triplets indices should also be **internally sorted**, i.e., for any triplet indices [i, j, k], the condition i < j < k should hold.

Note: Try to solve this using the O(n<sup>2</sup>) approach.


Examples:

>**Input**: arr[] = [0, -1, 2, -3, 1]\
>**Output**: [[0, 1, 4], [2, 3, 4]]\
>**Explanation**: Triplets with sum 0 are:\
>arr[0] + arr[1] + arr[4] = 0 + (-1) + 1 = 0\
>arr[2] + arr[3] + arr[4] = 2 + (-3) + 1 = 0

>**Input**: [1, -2, 1, 0, 5]\
>**Output**: [[0, 1, 2]]\
>E**xplanation**: Only triplet which satisfies the condition is arr[0] + arr[1] + arr[2] = 1 + (-2) + 1 = 0

>**Input**: arr[] = [2, 3, 1, 0, 5]\
>**Output**: [[]]\
>**Explanation**: There is no triplet with sum 0.


<hr>

Difficulty: Easy\
Points: 2\
Date: 04/11/2024

Solve it here: [Click Here](https://www.geeksforgeeks.org/problems/find-all-triplets-with-zero-sum/1)
