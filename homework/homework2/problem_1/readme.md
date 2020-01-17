## (25pt) Color Sort

### Function (15pt)
Sort an array that contains three colors red, yellow and green in-place such that the same color are adjacent, with the colors in the order of red, yellow and green. Integers 0, 1, and 2 are used to represent the color red, yellow, and green respectively. 

No sorting function from any library is allowed or you'll receive zero points.

A few examples:

- Input: [2,0,2,1,1,0], Output: [0,0,1,1,2,2]
- Input: [1,1,1,2,1,0], Output: [0,1,1,1,1,2]
- Input: [1,0,2,0,2], Output: [0,0,1,2,2]

The solution can only make up to two passes through the array without any additional array. O(1) storage complexity if you know the fancy terms. That means you can only go through the entire array no more than 2 times. 

Extra credit: 5pt to have a solution that make only one pass with O(1) space too.

Skeleton code is provided in this folder. 

### Tests (10pt)
Add at least 3 more tests following the given pattern. 

Note that this tests structure will run all tests even if some would fail.

At submission, all tests should pass and your code should (only) print:

```bash
testColorSort PASSED
```








