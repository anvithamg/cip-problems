##### For Loop- primeCheck - Java 
Easy Accuracy: 46.73% Submissions: 24393 Points: 2
Lamp Geeks Summer Carnival is LIVE NOW   
What do you do when you need to execute certain statements more than once? You put them in a loop. Loops are very powerful. Majority of coding questions need loops to work. You can't even input testcases without loops!

Here, we will use for loop and check if the given number n is prime or not.
Note: A number is prime if it's divisible by itself and 1. Also, 1 is not prime.

Example 1:

Input:
1

Output:
No
Example 2:

Input:
2

Output:
Yes
User Task:
Your task is to complete the provided function.

Constraints:
1 <= a <= 1000
```java
class Geeks {
    static void isPrime(int n) {
        int cheak = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // Your code here
            if(n%i==0 && n!=2){
                cheak=0;
            }
        }
        if(n==1){
            cheak=0;
        }
        if(cheak==1){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }

        System.out.println();
    }
}
```
