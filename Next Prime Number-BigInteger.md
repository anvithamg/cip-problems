### Next Prime Number-BigInteger
Easy Accuracy: 98.63% Submissions: 285 Points: 2

Given an integer n. Write a program to find the prime number next to n.

Example 1:

Input:
n = 15
Output: 
17
Explanation:
17 is next prime number.

Example 2:

Input:
n = 7
Output: 
11
Explanation:
11 is the prime number next to 7.

Your Task:
The input n is provided as a parameter to the function nextPrime. Complete the given code so that it returns the next Prime Number. Don't print anything.
```java
public static int nextPrime(int n){
        
    //write your code here
    //Use BigInteger to solve
    BigInteger b = BigInteger.valueOf(n);
    String a = b.nextProbablePrime().toString();
    return Integer.parseInt(a);
    
        
}
```
