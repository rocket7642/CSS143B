## (30pt) Number That Appears The Most Times

Write a function to find the number that appears the most times (highest frequency) in an integer array. All tests are provided to you already.

For example:

- In [7], number 7 appeared once, and there is no other number, therefore findHighestFrequencyNumber(...) should return 7
- In [2, 2], number 2 appeared twice, and there is no other number, therefore findHighestFrequencyNumber(...) should return 2
- In [7, 8, 9, 8, 8], number 8 appeared 3 times, number 7 and 9 both only appeared once, therefore findHighestFrequencyNumber(...) should return 8

To simplify things, we do not check the case for having a tie such as [5, 5, 9, 9]. 

The returned result from findHighestFrequencyNumber() is an object of type Answer. Similar to what we did in the findMax() example in class. If the input array is empty, the returned Answer object will have:

```java
val: -1
isValid: false
```

Otherwise *val* should be the number that appears the most times, and *isValid* should be true.

A basic code structure is provided at [homework1/problem_3/src/Main.java](https://github.com/pdgetrf/CSS143B/blob/master/homework/homework1/problem_3/src/Main.java). This file **must** be used and you can **only** write in the findHighestFrequencyNumber(...) function. ***DO NOT CHANGE*** other part of the code. OK to add your own function though.

When the homework is done, your code should print:

```bash
testFindHighestFrequencyNumber PASSED
```

It is OK to change the order of the original array.
