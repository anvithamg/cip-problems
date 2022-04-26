### Check Prime-BigInteger
Easy Accuracy: 35.02% Submissions: 843 Points: 2

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
```java
public static boolean prime(int n){
    
    //write your code here
    BigInteger a = BigInteger.valueOf(n);
    return a.isProbablePrime(100);
    //Use BigInteger to solve the problem
    
    
}
```
