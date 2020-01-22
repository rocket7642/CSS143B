## (40pt) Stack ADT Using Array

In the class we have seen the example of a Queue ADT using array. In this problem you will implement a stack ADT similarly also using array.

A stack is defined as a FIRST IN LAST OUT data structure with the following operations:

- boolean push(int v) : add an integer v onto the top stack, and return a boolean indicating whether push was successful
- boolean pop() : remove an integer from the top of the stack, and return a boolean indicating whether pop was successful
- StackElement peek() : return the value at the top of the stack

### The ArrayStack Class (10pt)

Following the exmaple of ArrayQueue from class, implement the following functions in ArrayStack.java:
- push
- pop
- peek
- constructor ArrayStack

By its name, similar to the ArrayQueue example we saw in class, internally an interger array is used to store the actual data.

### Tests for the ArrayStack Class (10pt)

Following the exmaple of ArrayQueue from class, implement the following functions in Tests.java:
- testArrayStackOfSizeOne
- testArrayStackOfSizeTwo
- testArrayStackOfSizeThree

Note that push, pop and peek all need to be verified in these tests.

### Validate Parentheses (10pt)

Now that you finished the awesome Stack ADT, let's put it to some use to solve the following problem.

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', implement the ValidParentheses.isValid() ***USING YOUR ARRAYSTACK*** in ValidParentheses to determind if the input string is valid. 

**WARNING:** If your ArrayStack is not used directly to solve the problem, you will receive zero points for the 20pts of this part including the tests.

An input string is valid if:

- Open brackets must be closed by the same type of brackets, and 
- Open brackets must be closed in the correct order.

An empty string is also considered valid.

Here are some examples of valid parentheses:
- empty
- {}
- ()[]{}
- ([]) and []()
- ({[]}), [()()], ()[](), {}[[]]

On the countrary, the following are not "valid" parentheses string:
- ((]
- [)(}
- )(
- []{{]}

### Tests for ValidParentheses.isValid (10pt)
Add tests for your isValid function in ValidParentheses.testIsValid(). A sample of test cases have been provided:
```java
public static boolean testIsValid() {
    String[] inputs = {"(}","{}()", ")[]("};
    boolean[] expected = {false, true, false};

    // homework
    return false; // place holder
}
```
Complete the test calls and verficiation. Also add at least another 5 different test cases (1 pt for each case).

## Submission Output
Upon submission, your code should only print the following:
```bash
testArrayStackEmptyQueue PASSED
testArrayStackQueueOfSizeOne PASSED
testArrayStackQueueOfSizeTwo PASSED
testArrayStackOfSizeThree PASSED
ValidParentheses.testIsValid PASSED
```
