##### Prime Factorization 
Easy Accuracy: 72.91% Submissions: 3980 Points: 2
Lamp Geeks Summer Carnival is LIVE NOW   
Given a number N find the prime factorization of the number.

Example 1:

Input:
N = 100
Output:
2 2 5 5
Explanation:
100 = 2 * 2 * 5 * 5
 

Example 2:

Input:
N = 27
Output:
3 3 3
Explanation:
27 = 3 * 3 * 3
Your Task:

Your task is to complete the function printPrimeFactotization() which takes a number N in the parameter and prints the prime factorization of the number space separated. The new line is printed by the driver's code.
 

Constraint:

2 <= N <= 10000
```java
public static boolean isPrime(int n){
    if(n==1) return false;
    if(n==2 || n==3) return true;
    if(n%2 == 0 || n%3 == 0) return false;
    for(int i=5;i*i<=n;i=i+6){
        if(n%i == 0 || n%(i+2)==0) return false;
    }
     return true;
    
}
public static void printPrimeFactorization(int n){
    
    // code here
    for(int i=0;i<n;i++){
        if(isPrime(i)){
            int x=i;
            while(n%x == 0){
                System.out.print(i+" ");
                x = x*i;
            }
        }
    }
    
    
}
```
