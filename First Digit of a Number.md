##### First Digit of a Number 
Easy Accuracy: 62.86% Submissions: 5530 Points: 2
Lamp Geeks Summer Carnival is LIVE NOW   
Given a number N, find the first digit of the number.

Example 1:

Input:
N = 123
Output:
1
 

Example 2:

Input:
N = 976
Output:
9
Your Task:

Your task is to complete the function firstDigit() which takes an integer N as parameters and returns the first digit of N.

Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 109
```java
public static int firstDigit(int n){
    
    // code here
    int num = (int)Math.log10(n);
    n = (int)(n/(Math.pow(10,num)));
    return n;
}
```
