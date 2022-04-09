##### GCD 
Basic Accuracy: 70.17% Submissions: 4091 Points: 1
Lamp Geeks Summer Carnival is LIVE NOW   
Given two numbers A and B. The task is to find the GCD of  A and B.
The GCD of two numbers is the largest number that can divide both A and B perfectly.

Example 1:

Input:
A = 6
B = 9
Output:
3
Explanation:
After 3 there is no number that can
divide both 6 and 9 perfectly.
Example 2:

Input:
A = 10
B = 15
Output: 
5
Explanation:
5 is the greatest common divisor of
10 and 15.
Your Task:
The input A and B are provided as parameters to the function gcd. Complete the given code so that it returns the gcd of A and B . Don't print anything.

Constraints:
1 ≤ A,B ≤ 100
```java
public static int gcd(int a, int b){

        
    //code here to calculate and return gcd of a and b
    int num = 1;
    for(int i=1;i<=a*b;i++){
        if(a%i == 0 && b%i==0)
            num = i;
    }
    return num;
        
}
```
