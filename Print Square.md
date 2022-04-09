##### Print Square 
Basic Accuracy: 36.45% Submissions: 7296 Points: 1
Lamp Geeks Summer Carnival is LIVE NOW   
Given an integer S, write a program to print the square of size S using * character. 

Before submitting code, verify it by running offline. Does your square visually looks like a square?

Example 1:

Input:
S = 4
Output:


Explanation:
It's a square! Each side contains S = 4 *.
Your Task:
The function square takes S as a parameter. Use this s to make your square with S *. Print your answer within the function itself. You do need to provide a new line at the end.
 

Constraints:
1 ≤ S ≤ 10
```java
public static void square(int n){
    //Complete the code given below
    for(int i=1;i<=n;i++){
        if(i==1){
            for(int j=1;j<=n;j++)
                System.out.print("* ");
            System.out.println();    
        }
        else if(i==n){
            for(int j=1;j<=n;j++)
                System.out.print("* ");
            System.out.println();  
        }
        else{
            for(int j=1;j<=n;j++){
                if(j==1 || j==n){
                    System.out.print("*");
                    if(j==1)
                        System.out.print(" ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
           
           
        }
           
    }
}
```
