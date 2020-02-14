## (100pt) Binary Tree

This problem has 4 parts. Note that part 4 is extra credit.

### (25pt) Implement the iterative in-order traversal for binary tree

Complete the following function that returns the values of an in-order traversal from a binary tree.

```java
    public List<Integer> inorderIterative() {
        // homework
        // to be done iteratively
        return Arrays.asList(0); // place holder
    }
```

Test is provided in 

```java
    public void inorderTraversal() {...}
```



### (25pt) Implement the Lowest Common Ancester for binary tree

In the lecture we went through the concept of **Lowest Common Ancester (LCA)** for a binary tree and demonstrated how to find the LCA for a binary search tree. 



(10pt) In this problem instead, we are going to write the code to find the LCA of a **binary tree** in the following function:

```java
    public int LCA(int v1, int v2) {
        // homework
        return 0;  // place holder
    }
```

This is to be done with recursion.



(15pt) Add unit tests for this LCA in 

```java
    @Test
    public void LCA() {
        // homework
        // get test cases from getRegularTreeTestCases()
        assertTrue(false); // place holder
    }
```

The unit tests should follow the same code pattern as other provided complete unit tests such as for height:

```java
    @Test
    public void height() {
        List<BinaryTree> trees = getRegularTreeTestCases();
        int[] expected = {0, 1, 2, 3, 3, 3, 5};

        for (int i = 0; i < expected.length; i++) {
            int actual = trees.get(i).height();
            assertEquals(expected[i], actual);
        }
    }
```

The array of expected will need to be filled up with the correct values, while the test cases should be obtained by calling getRegularTreeTestCases() instead. All test cases should PASS.



### (25pt) Implement the level-order traversal for binary tree

Unlike the 3 regular ways to travere a binary tree to visit all the nodes, level-order traversal visit the binary tree one level at a time from the top. Here's the function to work on:

```java
    public List<List<Integer>> levelOrderTraversal() {
        // homework
        // to be done iteratively
        return null; // place holder
    }
```

Also add unit tests in 

```java
    @Test
    public void levelOrderTraversal() {
        // homework
        // get test cases from getRegularTreeTestCases()
        assertTrue(false); // place holder
    }
```

OK to use other data structure for help.



For example, given the tree

```
      1
     / \
    2   N
```

The returned list should be 

```
[
  [1],
  [2],
]
```



Given the tree

```
      1
     /  \
    2    3
   / \    \
  4   5    6
```

The returned list should be 

```
[
  [1],
  [2,3],
  [4,5,6],
]
```



Note the return value is a list of lists, each of which contain the values on that level of the tree from left to right.



### (25pt) EXTRA CREDIT: Given a binary search tree, find the n-th smallest value in the tree

The title is pretty self-explanatory already. This is to be done in the following function

```java
    public int nthSmallestInBST(int n) {
        // homework
        return -1;  // place holder
    }
```

And add unit tests in 

```java
    @Test
    public void nthSmallestInBST() {
        // homework
        // extra credit
        // get test cases from getBSTTestCases()
        assertTrue(false); // place holder
    }
```

One can assume the n-th smallest value does exist in the tree.

Here are two examples. Give the following tree:

```
      2
     / \
    1   N
```

and n=2, then n-th smallest value is 2.



Given this tree

```
      7
     /  \
    5    8
   / \    \
  4   6    9
```

- When n = 1, return 4

- When n = 3, return 6
- When n = 5, return 8
