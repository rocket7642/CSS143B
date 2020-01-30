## ArrayList vs LinkedList Round 2: Remove(0)

In the lecture we saw the performance comparison for the *add(0, value)* function between ArrayList and LinkedList.

This homework is based on the same code but now we are comparing the performance of *remove(0)*.

Here's the definition of the remove(index) function
```java
E remove(int index)

Removes the element at the specified position in this list (optional operation). 
Shifts any subsequent elements to the left (subtracts one from their indices). 
Returns the element that was removed from the list.
```

Complete the following:

- Add calls to this function in removeFirstFromList(List<Integer> list) in Main.java
- Run this test with various test sizes similar to what was shown in lecture
- Plot the time on a graph (pick your file format)
- Write a small text file explaning what you have observed from the experiment especially if you have anything new from what's discussed in class.
  
Submit the Main.java file, the graph and the text file.
