# Example Midterm 1

## 2020 Winter CSS143B Midterm 1 &nbsp; &nbsp; &nbsp; Student Name:

**1. (2pt) The "void" methods like**
```java
void foo() {}
```

- (A) return Strings.
- (B) return primitive type values.
- (C) have no return value.
- (D) return class-type values.

**2. (2pt) Consider the following code:**
```java
public static void foo(String str) {
  str.concat("rains too much");
}
public static void main(String[] args) {
  String str = "seattle ";
  foo(str);
  System.out.println("After calling foo: " + str);
```
What is output by the above code?
<br/>
<br/>
<br/>
<br/>

**3. (4pt) what's the difference between overload and override?**

Hint: answer in terms of function signature AND class relationship (same class vs different class)
<br/>
<br/>
<br/>
<br/>

**4. (10pt) Write a function to reverse an integer array in place**

For example, if the input is [3,2,1,4], the output should be [4,1,2,3]
```java
public static void reverse(int[] values) {







}
```

**5. (5pt) How would you test your reverse function? Write down the test cases as you think necessary**
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

**6. (5pt) What does "late binding" mean?**
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

**7. (15pt) Implement the dequeue() function for ArrayQueue that stores data circularly in the internal array**

The interface of the Queue is 
```java
public interface Queue {
  boolean enqueue(int val);
  QueueElement dequeue();
  int size();
}
```

And the ArrayQueue is 
```java
public class ArrayQueue implements Queue {

  private int data[];
  private int size;

  // data removed from this side --> [front....end] <-- data added from this side
  private int front;
  private int end;
  
  // dequeue return QueueElement.isValid==true when dequeue is successful. false otherwise.
  @Override
  public QueueElement dequeue() {








}
```
