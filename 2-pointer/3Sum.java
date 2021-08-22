/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
 */
import java.util.*;

class Solution {
    public static void main(String args[]) {
        int nums[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = new LinkedList<>();
        res = threeSum(nums);
        System.out.println(res);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new LinkedList<>();
        for(int i = 0; i < nums.length - 2; i++) {
            if ((i == 0 || (nums[i] != nums[i-1])) && nums[i] <= 0) {
                int j = i+1;
                int k = nums.length -1;
                while(j < k) {
                    if (nums[j] + nums[k] == -(nums[i])) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (j < k && nums[j] == nums[j+1]) j++;
                        while (j < k && nums[k] == nums[k-1]) k--;
                        j++;
                        k--;
                    }
                    else if(nums[j] + nums[k] < -(nums[i])) {
                        j++;
                    }
                    else {
                         k--;
                    } 
                }   
            }
        }
        return ans;
    }
}