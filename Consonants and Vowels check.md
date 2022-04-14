#### 7. Consonants and Vowels check - Java 
Easy Accuracy: 46.8% Submissions: 15745 Points: 2
You are given a string s containing only lowecase letters. You need to count the number of vowels and the number of consonants.

If vowel count > consonant count then print - “Yes”(without quotes).
If vowel count < consonant count then print - “No”(without quotes).
If vowel count = consonant count then print - “Same”(without quotes).
Example 1:

Input:
the quick brown fox jumps over the lazy dog

Output:
No
Example 2:

Input:
aaaaaa

Output:
Yes
Your Task:
Since this is a function problem, you don't need to take any input. Just complete the function checkString(string  s) that take s as input and produces output.

Constraints:
1 <= |s| <= 100
```java
class Geeks{
    
    static void checkString(String s)
    {
        int v=0;
        int c=0;
        
        //Your code here
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a'||s.charAt(i) =='e'||s.charAt(i) =='i'||s.charAt(i) =='o'||s.charAt(i) =='u')
                v++;
            else if(s.charAt(i) != ' ')
                c++;
            
        }
        
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else
        System.out.print("Same");
        
        System.out.println();
    }
}
```
