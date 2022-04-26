### Factorial of BigInteger
Easy Accuracy: 86.26% Submissions: 407 Points: 2

Given one integer x. Your task is to find factorial of x. You have to return value of factorial x in BigInteger.

 

Example:


Input:
x = 10 

Output:
3628800

Explanation: Factorial of x is 3628800.

 

Your Task:

Complete the function factorial() which returns factorial of x.
```java
public static BigInteger factorial(int x){
        
    //write your code here
    BigInteger c = new BigInteger("1");
    BigInteger a = new BigInteger("1");
    for(int i=2;i<=x;i++){
        a = BigInteger.valueOf(i);
        c = c.multiply(a);
    }
    return c;
    //return factorial of x as datatype of BigInteger
        
}
```
