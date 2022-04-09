##### Fibonacci Number 
Basic Accuracy: 74.31% Submissions: 1868 Points: 1
Lamp Geeks Summer Carnival is LIVE NOW   
Given an integer n. Write a program to find the nth Fibonacci number.
The nth Fibonacci number is given by the forumla F(n) = F(n-1) + F(n-2). The first few fibonacci numbers are:
1 1 2 3 5... and so on.

Example 1:

Input:
n = 4
Output: 
3
Explanation:
In the series 1 1 2 3 5...... the fourth
fibonacci number is 3.
Example 2:

Input:
n = 6
Output: 
8
Explanation:
In the series 1 1 2 3 5 8 13...... the
sixth fibonacci number is 8.
Your Task:
The input n is provided as a parameter to the function fibonacci. Complete the given code so that it returns the nth Fibonacci number Number. Don't print anything.
```java
public static int fibonacci(int n){
        
    //Write your code here to calculate
    //to calculate the nth fibonacci number
    if(n==0) return 1;
    else if(n==1) return 1;
    int c=1,a=1,b=1;
    for(int i=2;i<n;i++){
        c = a+b;
        a=b;
        b=c;
    }
    return c;    
}
```
