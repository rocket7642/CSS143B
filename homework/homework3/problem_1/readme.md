## Linked List

All the following problems are based on the SingleLinkedList *with a dummy node*. 

Do not change any other part of the SingleLinkedList outside the homework functions without permission.

### 1. (20pt) Implement a copy constructor for SingleLinkedList
A [copy constructor](https://www.baeldung.com/java-copy-constructor) initializes a list by making an identical copy of the values in all the nodes in the given list. 

#### Implement the following copy constructor in SingleLinkedList.java
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

#### Add a test in testCopyConstructor()
In LinkedListTests.java, complete the following test for the copy constructor：
```java
public static void testCopyConstructor() {
    // homework
}
```
The following test cases are required, each worth 2pt:
- empty list
- list with one node
- list with two nodes, different values
- list with two nodes, same values
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

- If the list is empty, after calling the remove(ANY_VALUE), the list will still be empty and return 0 
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

Add test cases using the above examples. Each is worth 2 points.

### 3. (20pt) Implement the linked list reversal iteratively
```java
public void reverseIterative() {
    // homework 
}
```

reverseIterative() reverses the order of nodes (**not just the value**) in a linked list. For example:

* If the list is empty, after calling the reverseIterative() the list will still be empty
* If the list has 1, after calling the reverseIterative() the list will be 1
* If the list has 1->2->3, after calling the reverseIterative() the list will be 3->2->1
* If the list has 1->2->3->4, after calling the reverseIterative() the list will be 4->3->2->1

reverseIterative() works by changing the order of existing nodes without creating any new node or changing the value of any node. This is to be done iteratively which means recursion is not allowed.

Complete the test in LinkedListTests.java
```java
public static void testReverseIterative() {
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

### 4. Merge two sorted linked list (20pt) 
Implement a merge function to merge the given list into the calling list. Assuming values in both lists are ***Sorted in ascending order***.
    
```java
public void mergeSorted(SingleLinkedList listToMerge) {
    // homework
}
```

The mergeSorted function merges all values from the list in the parameter to it's own list while ***maintaining the ascending order***. Merge should not change anything in the input list. New nodes will be created in the calling list to accomodate the values from the external list.

For example:

* If current list is empty, and the other list is also empty, after merge the current list will still be empty
* If current list is 7->8->9, and the other list is empty, after merge the current list does not change
* If the current list is 1->3, and the other list is 2->4, after merge the current list will be 1->2->3->4
* If the current list is 1->3, and the other list is 4->5, after merge the current list will be 1->3->4->5
* If the current list is 6->7->8, and the other list is 4->5, after merge the current list will be 4->5->6->7->8
* If the current list is 3->3->8, and the other list is 2->5, after merge the current list will be 2->3->3->5->8

Complete the test in LinkedListTests.java
```java
public static void testMergeSorted() {
    // homework
}
```

Add test cases using the above examples. Each worth 2pt.
