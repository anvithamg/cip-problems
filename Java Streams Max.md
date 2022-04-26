###  Java Streams Max
Basic Accuracy: 98.26% Submissions: 597 Points: 1

Given an array arr[] of size N containing integers. The task is to find the maximum element from the array using streams.

Example 1:

Input:
4
1 2 3 4

Output:
4

Explanation:
From 1 2 3 4, 4 is max clearly.

Example 2:

Input:
3
3 2 1

Output:
3

Explanation:
From 3 2 1, 3 is max clearly.

User Task:
You need to complete the function maxUsingStreams that takes arr as argument and returns the max element. The printing is done by the driver code.

Constraints:
1 <= N <= 1000
1 <= arr[i] <= 1000
```java
public static int maxUsingStreams(int []arr)
{
    //Your code here
    int max = Arrays.stream(arr).max().getAsInt();
    return max;
    //Use stream().max().getAsInt()
}
```
