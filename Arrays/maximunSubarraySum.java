/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) 
 * which has the largest sum and return its sum.
 * A subarray is a contiguous part of an array.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6. */

public class maximunSubarraySum {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int res = maxSubArray(nums);
        System.out.println(res);
    }
    public static int maxSubArray(int[] nums) {
        // if (nums.length == 1) 
        //     return nums[0];
        int sum = 0;
        int maxi = nums[0];
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxi = Math.max(maxi, sum);
            if (sum <= 0)
                sum = 0;
        }
        return maxi;
    }    
}
