#### 19. Binary number to decimal number 
Basic Accuracy: 64.72% Submissions: 12640 Points: 1
Given a Binary Number B, find its decimal equivalent.
 

Example 1:

Input: B = 10001000
Output: 136
Example 2:

Input: B = 101100
Output: 44
 

Your Task:
You don't need to read or print anything. Your task is to complete the function binary_to_decimal() which takes the binary number as string input parameter and returns its decimal equivalent.
 

Expected Time Complexity: O(K * Log(K)) where K is number of bits in binary number.
Expected Space Complexity: O(1)
 

Constraints:
1 <= number of bits in binary number  <= 16
```java
class Solution
{
    public int binary_to_decimal(String str)
    {
        // Code here
        int m=0;
		    int k=1;
		    for(int i=str.length() - 1;i>=0;i--){
		        m = m+(int)(str.charAt(i) - '0') * k;
		        k = k*2;
		    }
		    return m;
    }
}
```
