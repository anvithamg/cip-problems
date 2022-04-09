##### Factorial 
Basic Accuracy: 91.0% Submissions: 2065 Points: 1
Lamp Geeks Summer Carnival is LIVE NOW   
Given an integer N. Write a program to return the factorial of N.
Note: 0 factorial is equal to 1.

Example 1:

Input:
N = 10
Output: 
3628800
Explanation:
1*2*3*4*5*6*7*8*9*10 = 3628800 .
Your Task:
The input N is provided as a parameter to the function nFactorial. Complete the given code so that it returns the factorial of N. The output is printed by the driver code.
```java
int nFactorial(int n){
    int ans = 1;
    
    //Write your code here
    for(int i=1;i<=n;i++){
        ans = ans *i;
    }
    
    return ans;
}
```
