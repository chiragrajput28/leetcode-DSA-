/**
 * The next greater element of some element x in an array is the 
 * first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and 
determine the next greater element of nums2[j] in nums2. If there is no next greater element, 
then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

 

Example 1:

Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
Example 2:

Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.
 */


import java.util.*;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {2,3,5};
        int[] arr1 = {1,2,3,4,5};
        int[] ans = new int[arr.length];
        ans = nextGreaterElements(arr,arr1);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] nextGreaterElements(int[] nums1, int[] nums2) {
        // int ans[] = new int[nums1.length];
        // for (int i=0; i<nums1.length; i++) {
        //     for (int j=0; j<nums2.length; j++) {
                
        //         if (nums1[i] == nums2[j]) {
        //             //System.out.println(j);
        //             for (int k = j+1; k < nums2.length; k++) {
        //                 //System.out.println(k + "k");
        //                 if (nums2[k] > nums1[i]) {
        //                     ans[i] = nums2[k];
        //                     break;
        //                 }
        //             }
        //             if (ans[i] == 0) {
        //                 ans[i] = -1;
        //             }
        //         }
        //     }
        // }

        // BEST APPROACH

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            for (int j = i+1; j < nums2.length; j++) {
                if (nums2[j] > nums2[i]) { map.put(nums2[i], nums2[j]);
                    break;
                }
            }
            // if (map.get(nums2[i]) == null) {
            //     map.put(nums2[i], -1);
            // }
        }
        //printing hashmap
        // for (Integer key : map.keySet()) {
        //     System.out.println(key + " " + map.get(key));
        // }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }
        return nums1;


    }
}