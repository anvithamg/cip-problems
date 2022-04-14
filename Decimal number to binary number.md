#### 20. Decimal number to binary number 
Easy Accuracy: 53.59% Submissions: 1034 Points: 2
Given a decimal number N in string format, compute its binary equivalent.


Example 1:

Input: N = 7
Output: 111
Example 2:

Input: N = 33
Output: 100001

Your Task:
You have to print its binary form. Don't need to add new line. Complete the function toBinary() which takes the decimal number N as input parameter and prints its binary equivalent.
```java
class Solution
{
    public void toBinary(String N)
    {
        // Code here
        String s = "";
        int n = Integer.parseInt(N);
        while(n>0){
            s = n%2 + s;
            n = n/2;
        }
        System.out.print(s);
    }
}
```
