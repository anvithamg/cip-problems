#### 6. Almost Equal -Java 
Easy Accuracy: 41.55% Submissions: 13725 Points: 2
Given two strings S1 and S2 consisting of only lowercase characters whose anagrams are almost equal. The task is to count the number of characters which needs to be edited(delete) to make S1 equal to S2.

Example 1:

Input:
madame
madam

Output:
1

Explanation:
String S1 = madame, string S2 = madam. character 'e' in 
first string is need to be deleted to make S1 equal to S2.
Example 2:

Input:
suryansh
suryanshzzawesome

Output:
9

Explanation:
String S1 = suryansh, string S2 = suryanshzzawesome. 
All character after "suryansh" in second string are 
need to be deleted to make S1 equal to S2.
Constraints:
1 <= S1, S2 <= 104
```java
class Geeks{
    
    static int coutChars(String s1, String s2)
    {
        
       //Your code here
       int ans = 0;
       int a[] = new int[26];
       for(int i = 0; i < s1.length(); i++) a[s1.charAt(i)-'a']++;
       for(int i = 0; i < s2.length();i++) a[s2.charAt(i)-'a']--;
       for(int i = 0; i < 26; i++) ans +=Math.abs(a[i]);

       return ans;
    }
}
```
