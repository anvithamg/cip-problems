##### Check Prime 
Easy Accuracy: 43.19% Submissions: 9646 Points: 2
Lamp Geeks Summer Carnival is LIVE NOW   
Given an integer n check if n is prime or not.
A prime number is a number that is divisible by 1 and itself only.

Example 1:

Input:
n = 17
Output: 
True
Explanation:
17 is  divisible by  only 1 and 17.
So it's a prime number.
Example 2:

Input:
n = 56
Output: 
False
Explanation:
56 is divisible by 2, 4, 7.....etc. So
its not a prime number.
Your Task:
The input n is provided as a parameter to the function prime. Complete the given code so that it returns a boolean value. Don't print anything.
 

Expected Time Complexity: O(n)
Expected Auxilary Space: O(n)

Contraints:â€‹
1 <= n <= 10000
```java
public static boolean prime(int n){
    
    //Write your code here
    //returns a boolean value 
    if(n==1) return false;
    if(n==2 || n==3) return true;
    if(n%2 == 0 || n%3 == 0) return false;
    for(int i=5;i*i<=n;i=i+6){
        if(n%i == 0 || n%(i+2)==0) return false;
    }
     return true;
    
}
```
