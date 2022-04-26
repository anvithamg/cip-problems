###  Multi Parameters Lambda Expression
Basic Accuracy: 99.16% Submissions: 625 Points: 1

You need to use lambda expression to add two numbers x and y.

Example 1 :  

Input:
5 7

Sample Output:
12

Explanation:
5+7 = 12

Example 2 :  

Input:
1 5

Sample Output:
6

Explanation:
1+5 = 6

User Task:
You need to complete the function helperFunction that does not take any argument. This function expects an object of Add as a return type. Add is an interface that has the member function addParameters. Your helperFunction uses lambda expression to implement the addParameters within helperFunction itself. Then you return the object. The driver code will call the addParameters method and print the result using it.

Constraints:
1 <= x, y<= 103

```java
public static Add helperFunction() 
{
    //Your code here
    //Implement the addParameters method that returns x+y. 
    return(x,y) -> x+y;
}
```
