#### 8. Maximum Area Rectangle 
Easy Accuracy: 74.92% Submissions: 8037 Points: 2
Given N  pairs of rectangles, where each pair denotes the length L and breadth B of the ith rectangle. The task is to return the maximum area of the rectangle.

Example 1:

Input:
N = 3
rect[] = {{1,2},
          {3,4},
          {5,6}}
Output:
30

Explanation:
1. Total area of Rect. 1 = 1 * 2 = 2
2. Total area of Rect. 2 = 3 * 4 = 12
3. Total area of Rect. 3 = 5 * 6 = 30
4. Out of all rectangles, Rectangle 3 has the maximum area.

Example 2:

Input:
N = 2
rect[] = {{12,3},
          {40,5}} 

Output:
200

Explanation:
1. Total area of Rect. 1 = 12 * 3 = 36
2. Total area of Rect. 2 = 40 * 5 = 200. 
3. Out of all rectangles, Rectangle 2 has the maximum area.
User Task: Your task is to complete the function calculate_Area() which returns maximum area. Use area() function in Rectangle class.

Constraints:
1 <= N <= 103
1 <= L, B <= 104
1 <= Area <= 108
```java
class maxArea{
    
    static int calculate_Area(Rectangle arr[]){
        
        // Your code here
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int area = arr[i].area();
            if(area > max)
                max = area;
            }
        return max;
    }
    
}
```
