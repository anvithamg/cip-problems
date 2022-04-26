### One Parameter Lambda Expression
Basic Accuracy: 92.56% Submissions: 707 Points: 1

You need to use lambda expression to multiply a given number n by 5.

Example 1:

Input:
5

Output:
25

Explanation:
5 * 5 = 25

Example 2:

Input:
6

Output:
30

Explanation:
6 * 5 = 30

User Task:
You need to complete the function helperFunction that does not take any argument. This function expects an object of Multiply as a return type. Multiply is an interface that has the member function multiplyBy5. Your helperFunction uses lambda expression to implement the multiplyBy5 within helperFunction itself. Then you return the object. The driver code will call the multiplyBy5 method and print the result using it.

Constraints:
1 <= n <= 103
```java
public static Multiply helperFunction() 
{
    //Your code here
    return(n) -> n*5;
    //Implement the multiplyBy5(int n) method using lambda expression. The implemented function should return n*5
    
}
```
