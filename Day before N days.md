##### Day before N days 
Easy Accuracy: 33.34% Submissions: 7270 Points: 2
Lamp Geeks Summer Carnival is LIVE NOW   
Given two integer d and n. Where d is the day, out of 7 days of week, d varies from 0 to 6 as shown below.

0 - Sunday

1 - Monday

2 - Tuesday

3 - Wednesday

4 - Thursday

5 - Friday

6 - Saturday

Complete the function utility() with d and n as parameters. Print index for the day which is n days before the given day d.

 

Example 1:

Input:
d = 4
n = 3
Output:
1
Explanation: 3 days before the 4th is 1
 

Example 2:

 

Input:
d = 2
n = 19
Output: 
4
Explanation: 19 days before the 2nd is 4
Your Task: 

Complete the function utility() with d and n as parameters. You have to print index for the day which is n days before the given day d. Just print the answer after performing suitable operations. New line will be added by the driver code.
```java
public static void utility(int d, int n){
    //write your code here
    int x = n % 7;
    int ans = d - x;
    if(ans >= 0){
    System.out.printf("%d", ans);
    }else{
    System.out.printf("%d", 7 + ans);
    }
    
    
    
}
```
