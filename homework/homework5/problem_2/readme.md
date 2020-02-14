## Reverse A Stack Using Recursion (25pt)

### 1. (15pt) Implement a function to reverse the values in a stack
```java
    void ReverseStack(Stack<Integer> stack) {
        // homework
    }
```

This is to be done recursively and in-place which means the stack in the argument will be reversed without creating another stack of the same size.

Requirements:

- Any loop such as "for", "while" is not allowed. Zero point if any loop is used. OK to add helper function. 
- Cannot use collection storage such as array, stack, queue, map. If you want to use something but not sure, please ask before going ahead.
- Must use recursion.

Examples:

* input stack: (top on the left, bottom on the right): [], after the reversal: []
* input stack: (top on the left, bottom on the right): [0], after the reversal: [0]
* input stack: (top on the left, bottom on the right): [0, 1], after the reversal: [1, 0]
* input stack: (top on the left, bottom on the right): [0, 1, 2], after the reversal: [2, 1, 0]
* input stack: (top on the left, bottom on the right): [0, 2, 2, 3], after the reversal: [3, 2, 2, 0]



Add unit tests in

```java
@Test
public void reverseStack() {
    // homework
    assertTrue(false);  // place holder
}
```

