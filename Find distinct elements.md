#### 10. Find distinct elements 
Easy Accuracy: 66.52% Submissions: 1148 Points: 2
Given an array arr[] of size n, find count of all the distinct elements in an array

Example 1:

Input: 
n = 4
arr = {2, 2, 3, 2}
Output: 
2
Example 2:

Input: 
n = 5
arr = {12, 1, 14, 3, 16}
Output: 
5
Your Task:
You do not need to read input or print anything. Your task is to complete the function distinct() which takes the array arr and n as input parameters and returns the number of distinct elements in the array.

Constraints:
1 ≤ n ≤ 100
-1000 ≤ arr[i] ≤ 1000
```java
static int distinct(int arr[], int n) {
    // code here
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i:arr){
        set.add(i);
    }
    return set.size();
}
```
