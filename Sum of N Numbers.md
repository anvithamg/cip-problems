##### Sum of N Numbers
Basic Accuracy: 81.65% Submissions: 5138 Points: 1
Lamp Geeks Summer Carnival is LIVE NOW  
Given an integer N find the sum of the first N natural number.

Example 1:

Input:
N = 10
Output: 
55
Explanation:
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55.
Example 2:

Input:

N= 5
Output: 
15
Explanation: 1 + 2 + 3 + 4 + 5 = 15.
Your Task:
The input n is provided as a parameter to the function nSum(). Complete the given code so that it returns the sum of n natural numbers. The driver code prints the answer.
```java
int nSum(int n){
    int ans = 0;

    //Write your code here to calculate and return sum of n number.
    ans = n*(n+1)/2;


    return ans;
}
```
