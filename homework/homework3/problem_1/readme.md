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

***Note:*** 
- Not allowed to use the *size* member variable or any add functions including add(int val) and addFirst(int val) or zero points will be given for this problem.
- This linkedlist has a dummy node

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


### 5. (10pt) Implement the linked list reversal in ***test/unit_tests.cpp***
```C++
template <class T>
void SingleLinkedList<T>::reverse_iterative() {
    // homework 
}
```

reverse_iterative() reverse the order of node (**not just the value**) in a linked list. For example:

* If the list is empty, after calling the reverse_iterative() the list will still be empty
* If the list has 1, after calling the reverse_iterative() the list will be 1
* If the list has 1->2->3, after calling the reverse_iterative() the list will be 3->2->1
* If the list has 1->2->3->4, after calling the reverse_iterative() the list will be 4->3->2->1

reverse_iterative() works "in-place" which means no new node should be created during the process. 

The unit test for your reverse_iterative() is already provided in ***src/unit_tests.cpp***
```C++
TEST(sll_test, reverse_iterative) {
    ASSERT_TRUE(test_reverse_iterative_n(0));
    ASSERT_TRUE(test_reverse_iterative_n(1));
    ASSERT_TRUE(test_reverse_iterative_n(2));
    ASSERT_TRUE(test_reverse_iterative_n(3));
    ASSERT_TRUE(test_reverse_iterative_n(4));
}
```

Your reverse_iterative() should pass all of these test cases.


