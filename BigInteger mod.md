####  BigInteger mod
Easy Accuracy: 52.36% Submissions: 7971 Points: 2

Given two BigIntegers X and Y. You have to find the remainder when X divides Y.

 

Example 1:

Input:
X = 3, Y = 4
Output:
1
Explanation:
1 is the remainder when X divides Y.

 

Example 2:

Input:
X = 8, Y = 2 
Output:
2
Explanation:
2 is the remainder when X divides Y.

 

Your Task:
Your task is to complete the function mod() which accepts BigIntegers X and Y as input parameters, and returns the remainder when X divides Y.

 

Constraints:
1 <= X, Y <= 1030
```java
class MathematicalOperation{
    
    static BigInteger mod(BigInteger x, BigInteger y){
        // Your code here  
        return y.remainder(x);
    }
    
}
```
