## Linked List

All the following problems is based on the SingleLinkedList *with a dummy node*.

### 1. (30pt) Implement a copy constructor for SingleLinkedList
A [copy constructor](https://www.baeldung.com/java-copy-constructor) initializes a list by making an identical copy of the values in all the nodes in the given list. 

#### Implement the following copy constructor in SingleLinkedList.java (20pt)
```java
public SingleLinkedList(SingleLinkedList list) {
    // homework
}
```

For example:
Given a list that is  *h->1->2->3*, *h* is the head pointer. Run:
```java
SingleLinkedList newList = new SingleLinkedList(list);
```
and newList will be initialized as h->1->2->3.

***Note:*** Not allowed to use the *size* member variable or any add functions including add(int val) and addFirst(int val) or zero points will be given for this problem.

#### Add a test in testCopyConstructor() (10pt)
In LinkedListTests.java, complete the following test for the copy constructor：
```java
public SingleLinkedList(SingleLinkedList list) {
    // homework
}
```
The following test cases are required, each worth 2pt:
- empty list
- list with one node
- list with two nodes, different values
- list with two nodes, same values
- list with three nodes, same value
- list with three nodes, different values

### 2. (20pt) Implement the remove function
```java
    public int remove(int valueToRemove) {
    // homework
    return 0; // place holder
}
```
This function removes *all* nodes whose val == valueToRemove and returns the number of node actually removed.

For example: 

- If the list is 1->2->3, after calling the remove(3) the list will be 1->2, and return 1
- If the list is 1->2->4->2, after calling remove(2) the list will be 1->4, and return 2
- If the list is 1->1->4->2, after calling remove(1) the list will be 4->2, and return 2
- if the list is 3->3->3->3, after calling remove(3) the list will be empty, and return 4
- If the list is 1->1->4->2, after calling remove(5) the list will still be 1->1->4->2, and return 0

Complete the test in LinkedListTests.java
```java
public static void testRemove() {
    // homework
}
```

The following test cases are required, each worth 2pt:

- input is empty
- input has one element
- input has more than one elements without duplicates
- input has more than one elements with duplicates
- input has more than one elements, all elements being the same values

### 5. (20pt) Implement the linked list reversal in ***test/unit_tests.cpp***
```java
public void reverse_iterative() {
    // homework 
}
```

reverse_iterative() reverses the order of node (**not just the value**) in a linked list. For example:

* If the list is empty, after calling the reverse_iterative() the list will still be empty
* If the list has 1, after calling the reverse_iterative() the list will be 1
* If the list has 1->2->3, after calling the reverse_iterative() the list will be 3->2->1
* If the list has 1->2->3->4, after calling the reverse_iterative() the list will be 4->3->2->1

reverse_iterative() works by changing the order of existing nodes without creating any new node or changing value of any node. This is to be done iteratively which means recursion is not allowed.

Complete the test in LinkedListTests.java
```java
public static void testReverseIterative() {
    // homework
}
```

The following test cases are required, each worth 2pt:

- list is empty
- list has one element
- list has two elements
- list has three elements without duplicates
- list has three elements with duplicates
- list has three elements with identical value
