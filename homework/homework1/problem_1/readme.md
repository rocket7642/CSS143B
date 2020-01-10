## (30pt) Binary Search

Write a function to perform binary search in a **sorted** integer array. Also write as many tests as you think necessary to demonstrate your binary search code works correctly. 

The binary search function takes an integer to find, and returns the **index** of the input value if found. -1 otherwise.

For example:

- Searching 6 in array [1, 3, 6, 8, 9] should return 2 because number 6 appears at index 2.
- Searching 9 in array [1, 3, 6, 8, 9] should return 4.
- Searching 7 in array [1, 3, 6, 8, 9] should return -1 because 7 is not found in this array.

You may pick the assumption whether the input array is in ascending or descending sorted order and please indicate your assumption in comments. Your test can assume input array is correctly sorted. 

If there's duplicated numbers in the array, you can choose how the search code behaves. Returning the first found index is OK.

Binary search was discussed in class as part of the search problem. If you need help, [here](https://www.geeksforgeeks.org/binary-search/) is a good start. Note that binary search can be implemented with or without recursion. If you are comfortable with recursion already, feel free to use it. Otherwise for-loop would do just fine.

A basic code structure is provided at [homework1/problem_1/src/Main.java](https://github.com/pdgetrf/CSS143B/tree/master/homework/homework1/problem_1/src/Main.java). This file must be used and no change can be made to the main function (line 7, 8 and 9). 

When the homework is done, your code should print

```bash
testBinarySearch PASSED
```



