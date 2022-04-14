#### 12. Sum All Array Elements 
Easy Accuracy: 88.17% Submissions: 3386 Points: 2
You are given a array that contains integers. You need to return the sum of all array elements.

Example 1:

Input:
numbers = [54, 43, 2, 1, 5]
Output: 
105
Explanation: Just sum it 54+43+2+1+5=105.
Example 2:

Input:
numbers = [324, 5, 2, 2]
Output:
333
Explanation: Just sum it 324+5+2+2=333.
Your Task: 
Write the code to return the sum of all array elements. The array is provided as a parameter to the function arraySum. Don't print the output, just return it as it will be printed by the driver code.
```java
public static int arraySum(int[] numbers){
    //Just return the sum of the list
    //Don't print here
    int sum = 0;
    for(int i:numbers)
        sum += i;
    return sum;
}
```
