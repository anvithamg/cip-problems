#### 4. Predict the Column - Java 
Easy Accuracy: 49.84% Submissions: 11593 Points: 2
Given a matrix(2D array) M of size N*N consisting of 0s and 1s only. The task is to find the column with maximum number of 0s.

Example 1:

Input:
3
1 1 0
1 1 0
1 1 0

Output:
2

Explanation:
2nd column (0-based indexing) is having 3 zeros which is maximum.
Example 2:

Input:
3
0 1 0
0 0 1
0 1 0

Output:
0

Explanation:
0th column (0-based indexing) is having 3 zeros which is maximum.

Constraints:
1 <= N <= 102
0 <= A[i][j] <= 1
User Task:
Your task is to complete the function columnWithMaxZero() which should return the column number with maximum number of zeros. If more than one column exists, print the one which comes first.
```java
class Geeks{
    
    static int columnWithMaxZero(int a[][],int n){
        
        // Your code here
        int max = Integer.MIN_VALUE;
        int val = 0;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(a[j][i] == 0)
                    count++;
            }
            if(count>max){
                max = count;
                val = i;
            }
        }
        return val;
        
    }
}
``
