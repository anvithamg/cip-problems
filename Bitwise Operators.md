##### Bitwise Operators - Java 
Easy Accuracy: 56.22% Submissions: 13321 Points: 2
Lamp Geeks Summer Carnival is LIVE NOW   
Bitwise operators are useful when we want to work with bits. Here, we'll take a look at them.

Given three positive integers a, b and c. Your task is to perform some bitwise operations on them as given below:
1. d = a ^ a
2. e = c ^ b
3. f = a & b
4. g = c | (a ^ a)
5. e = ~e
Note: ^ is for xor.

Example 1:

Input:
4 8 2

Output:
0
10
0
2
-11
Example 2:

Input:
7 7 7

Output:
0
0
7
7
-1
Your Task:
You don't need to read input anything. Your task is to complete the function bitWiseOp() which takes a, b, c as parameters and print the output for the above-mentioned bitwise operations in consecutive lines.

Constraints:
1 <= A, B, C <= 106 
```java
class Geeks {
    static void bitWiseOp(int a, int b, int c) {

        // Your code here
        int d = a^a;
        int e = c^b;
        int f = a&b;
        int g = c|(a^a);
        int h = ~e;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
```
