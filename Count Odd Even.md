#### 1. Count Odd Even - Java 
Easy Accuracy: 49.82% Submissions: 19117 Points: 2
Congrats on completing Module 1.

In the previous module we learnt about the basics of Java.  Now, we'll move to more complex stuff. Here, we'll learn about arrays.

Given an array A of N elements. The task is to count number of even and odd elements in the array.

Example 1:

Input:
5
1 2 3 4 5

Output:
3 2

Explanation:
In the given array, there are 3 odd elements 
(1, 3, 5) and 2 even elements (2 and 4).
Example 2:

Input:
4
1 6 18 7

Output:
2 2

Explanation:
In the given array, there are 2 odd
elements (1, 7) and 2 even elements (6 and 18).
User Task:
Your task is to complete the function countOddEven() which should print number of odd and number of even elements in a single line seperated by space. You don't need to provide the new line.

Constraints:
1 <= N <= 106
1 <= Ai <= 106
```java
class Geeks {
    static void countOddEven(int a[], int n) {

        // Your code here
        int odd = 0;
        int even = 0;
        for(int i:a){
            if(i%2 == 0) even++;
            else odd++;
        }
        System.out.print(odd+" "+even);
    }
}
```
