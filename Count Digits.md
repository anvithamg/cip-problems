##### Count Digits 
Easy Accuracy: 67.66% Submissions: 5148 Points: 2
Lamp Geeks Summer Carnival is LIVE NOW   
Given a natural number N. You have to find the number of digits in it.
 

Example 1:

Input:
n = 5534
Output:
4
Explanation: 5534 has 4 digits
Example 2:

Input:
n = 100273
Output:
6
Explanation: 100273 has 6 digits

Your Task:
Complete the function countDigits() which takes N as input parameter and prints the number of digits in N.
```java
public static void countDigits(int n){

    //write your code here
    //print number of digits in n
    int count = 0;
    while(n>0){
        n = n/10;
        count = count+1;
    }
    System.out.print(count);

}
```
