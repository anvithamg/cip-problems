### No Parameter Lambda Expression
Basic Accuracy: 94.28% Submissions: 709 Points: 1

You need to use lambda expression to print "Hello".

Example 1 :

Input:
No Input
Output:
Hello

Example 2 :

Input:
No Input
Output:
Hello

User Task:
You need to complete the function helperFunction that does not take any argument. This function expects an object of Hello as a return type. Hello is an interface that has the member function sayHello. Your helperFunction uses lambda expression to implement the sayHello within helperFunction itself. Then you return the object. The driver code will call the sayHello method using the returned object.

```java
public static Hello helperFunction() 
{
    //Your code here
    //Implement sayHello using lambda expression and return the object.
    //Write this in the lambda expression: System.out.println("Hello")
    return () -> {System.out.println("Hello");};

}
```
