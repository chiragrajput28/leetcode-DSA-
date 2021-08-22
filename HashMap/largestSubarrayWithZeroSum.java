/* 
Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.

Example 1:

Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5
Explanation: The largest subarray with
sum 0 will be -2 2 -8 1 7.
*/

import java.util.*;
class GfG
{
    public static void main(String[] args) {
        int a[] = {15,-2,2,-8,1,7,10,23};
        int n = a.length;
        int res = maxLen(a, n);
        System.out.println(res);
    }
    public static int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxi = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum == 0) {
                maxi = i + 1;
            }
            else {
                if(map.get(sum) == null) {
                    map.put(sum, i);
                }
                else {
                    maxi = Math.max(maxi, i - map.get(sum));
                }
            }
        }
        return maxi;
    }
}
