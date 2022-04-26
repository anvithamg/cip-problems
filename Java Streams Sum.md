### Java Streams Sum
Basic Accuracy: 98.0% Submissions: 606 Points: 1

Given an array arr[] of size N containing integers. The task is to find the sum of the array using streams.

Example 1 :

Input:
4
1 2 3 4

Output:
10

Explanation:
1+2+3+4 = 10

Example 2 :

Input:
3
3 2 1

Output:
6

Explanation:
3+2+1 = 6

User Task:
You need to complete the function sumUsingStreams that takes arr as argument and returns the sum. The printing is done by the driver code.

Constraints:
1 <= N <= 1000
```java
public static int sumUsingStreams(int []arr)
{
    //Your code here
    int sum = Arrays.stream(arr).sum();
    return sum;
    //use stream.sum()
}

```
