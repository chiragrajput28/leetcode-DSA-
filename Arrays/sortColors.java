/**
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, 
with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
 */

public class sortColors {
    public static void main(String args[]) {
        int[] nums = {2,0,2,1,1,0};
        sortColor(nums);
    }
    public static void sortColor(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        }
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int temp;
        while (mid <= high) {
            if (nums[mid] == 0) {
                temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            else if (nums[mid] == 2) {
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
            else {
                mid++;
            }
        }
        for (int x: nums) {
            System.out.println(x);
        }
    }
}
