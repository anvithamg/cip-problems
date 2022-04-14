#### 5. The Pattern Matcher - Java 
Easy Accuracy: 41.98% Submissions: 11344 Points: 2
You are given a string s of x and y. You need to verify whether the string follows the pattern xnyn. That is the string is valid only if equal number of ys follow equal number of xs.
As an example: xxyyxxyy is valid. xy is valid. xxyyx is invalid. xxxyyyxxyyxy is valid.

Example 1:

Input:
xxyy

Output:
1
Example 2:

Input:
xyx

Output:
0
Your Task:

Since this is a function problem, you don't need to take any input. Just complete the function follPatt(string s) that outputs 1 if string is valid, else it outputs 0.

Constraints:
1 <= |s| <=100
```java
class Geeks{
    
    static void follPatt(String s)
    {
        
        //Your code here
        Stack<Character> stack=new Stack<Character>();
        int n = s.length();
        if(n%2 != 0){
            System.out.println('0');
                return;
            
        }
        
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='x'){
                if(i>0 && s.charAt(i-1) == 'y' && !stack.isEmpty()){
                    System.out.println('0');
                        return;
                    
                }
                stack.push('x');
                
            } 
            else {
                if(stack.isEmpty()){
                    System.out.println('0');
                    return;
                    
                }
                    
                stack.pop();
            }
        }
       
      System.out.println('1');
    }
}
```
