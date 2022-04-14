#### 17. Check Palindrome 
Basic Accuracy: 54.91% Submissions: 1062 Points: 1
Given a string s, you need to check if it is palindrome or not. A palidrome is a string that reads the same from front and back.
Ignore the case in this question.

Example 1:

Input:
s = "Hello"
Output: 
false
Explanation: Hello is not equal to olleH
so it's not a palindrome.
Example 2:

Input:
s = "TenEt"
Output:
true
Explanation: TenEt = tEneT as we are
ignoring the case.
Your Task: 
Your task is to complete the function isPalin() which takes a String s as parameter and returns true if it is a palindrome, else return false. The driver code will print the output. 
```java
public static boolean isPalin(String s){
    // code here
    int start =0;
    int end = s.length() - 1;
    s=s.toLowerCase();
    while(start<end){
        if(s.charAt(start) != s.charAt(end))
            return false;
        start++;
        end--;
    }
    return true;
}
```
