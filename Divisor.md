##### Divisor 
Basic Accuracy: 81.22% Submissions: 3691 Points: 1
Lamp Geeks Summer Carnival is LIVE NOW   
Given an integer N. Write a program to print all the divisors of N.

Example 1:

Input:
N = 12
Output: 
1 2 3 4 6 12
Explanation:
12 is divisible by 1 2 3 4 6 12.
Example 2:

Input:
N = 10
Output: 
1 2 5 10
Explanation:
10 is divisible by 1 2 5 10.
Your Task:
The input n is provided as a parameter to the function divisor. Complete the given code so that it prints all the divisors in a single line. Don't print a new line as it will be auto appended by the driver code.
 

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
 

Constraints:
1 <= n <= 105
```java
public static void divisor(int n){
        
    //Write your code here
    for(int i=1;i<=n;i++){
        if(n%i==0){
            System.out.print(i+" ");
        }
    }
        
}
```
