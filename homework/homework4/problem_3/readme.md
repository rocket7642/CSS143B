## Linked List

The following problems are based on the SingleLinkedList **with a dummy node**. 

Do not change any other part of the SingleLinkedList outside the homework functions without permission.


### (30pt) Implement the linked list reversal recursively
```java
public void reverseRecursive() {
    // homework 
}
```

reverseRecursive() reverses the order of nodes (**not just the value**) in a linked list. For example:

* If the list is empty, after calling the reverseRecursive() the list will still be empty
* If the list has 1, after calling the reverseRecursive() the list will be 1
* If the list has 1->2->3, after calling the reverseRecursive() the list will be 3->2->1
* If the list has 1->2->3->4, after calling the reverseRecursive() the list will be 4->3->2->1
* If the list has 1->2->2->3, after calling the reverseRecursive() the list will be 3->2->2->1

reverseRecursive() works by changing the order of existing nodes without creating any new node or changing the value of any node. This is to be done **recursively**.

No additional storage like array, stack, queue or another linkedlist is allowed for this problem.

Complete the test in LinkedListTests.java
```java
public static void testReverseRecursive() {
    // homework
}
```

The following test cases are required, each worth 2pt:

- input is empty
- input has 1 element
- input has 2 elements without duplicates
- input has 2 elements with duplicates
- input has 3 elements without duplicates
- input has 5 elements without duplicates
