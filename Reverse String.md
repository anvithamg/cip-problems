#### 18. Reverse String 
Basic Accuracy: 83.16% Submissions: 1227 Points: 1
Given a string s, you need to reverse it.

Example 1:

Input:
s = "Hello"
Output: 
olleH
Explanation: Reverse of Hello is olleH
Example 2:

Input:
s = "World"
Output:
dlroW
Explanation: Reverse of World is dlroW
Your Task: 
The task is to complete the reverseString() which takes a string s as parameter and returns the reversed string.
```java
public static String reverseString(String s){
    // code here
    String rev = "";
    for(int i=s.length()-1;i>=0;i--){
        rev = rev+s.charAt(i);
    }
    return rev;
    
}
```
