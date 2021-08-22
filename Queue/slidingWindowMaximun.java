/**
 * You are given an array of integers nums, there is a sliding window of size k which is moving from the 
 * very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding 
 * window moves right by one position.

Return the max sliding window.
Example 1:

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
Example 2:

Input: nums = [1], k = 1
Output: [1]
Example 3:

Input: nums = [1,-1], k = 1
Output: [1,-1]
Example 4:

Input: nums = [9,11], k = 2
Output: [11]
Example 5:

Input: nums = [4,-2], k = 2
Output: [4]
 */

import java.util.*;

public class slidingWindowMaximun {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ans = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(ans));
    }
    //using doubly ended queue (optimised)
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int a = nums.length;
        Deque<Integer> dq = new LinkedList<>();
        int ans[] = new int[a-k+1];
        int i = 0;
        for (; i < k; i++) {        
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {  
                dq.removeLast();
            }  
            dq.addLast(i);
        }
        for(; i < a; i++) {
            ans[i-k] = nums[dq.peekFirst()];
            while(!dq.isEmpty() && dq.peekFirst() <= i-k) {
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {  
                dq.removeLast();
            }  
            dq.addLast(i);
        }
         ans[i-k] = nums[dq.peekFirst()];
        return ans;
    }
}
