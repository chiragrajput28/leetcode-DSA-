/**
 * Given two sorted arrays and a number x, find the pair whose sum is closest to x and the pair has an element from each array.
 *  In the case of multiple closest pairs return the smallest one.
Example 1:

Input : arr[ ] = {1, 4, 5, 7}
brr[ ] = {10, 20, 30, 40} 
X = 32
Output : 1 30
Explanation:
The closest pair whose sum is closest
to 32 is {1, 30} = 31.
Example 2:

Input : arr[ ] = {1, 4, 5, 7}
brr[ ] = {10, 20, 30, 40}
X = 50 
Output :  7 40 
 */
package Searching;
import java.util.*;

public class closestPairFromTwoArrays {
   public static void main(String[] args) {
        int arr[ ] = {1, 3, 5, 7};
        int brr[ ] = {2,4,6,8};
        int X = 11;
        int n = arr.length;
        int m = brr.length;
        ArrayList<Integer> ans;
        ans = printClosest(arr, brr, n, m, X);
        System.out.println(ans.get(0) + " " + ans.get(1));
   } 
   public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = m-1;
        // System.out.println(i);
        // System.out.println(j);
        // System.out.println(n);
        // System.out.println(m);
        int res = Integer.MAX_VALUE;
        int min = 0;
        int res_i = 0, res_j = 0;
        while (i < n-1 && j > 0) {
            // System.out.println(i + "i");
            // System.out.println(j + "j");
            min = Math.abs(x-(arr[i] + brr[j]));
            //System.out.println(min+" min");
            if (min < res) {
                res = min;
                res_i = i;
                res_j = j;
                // if (ans.size() == 0) {
                //     ans.add(arr[i]);
                //     ans.add(brr[j]);
                // }
                // else {
                //     ans.remove(0);
                //     ans.remove(0);
                //     ans.add(arr[i]);
                //     ans.add(brr[j]);
                // }
                //System.out.println(ans.get(0) + " " + ans.get(1));
            }
            if ((arr[i] + brr[j]) > x) j--;
            else if ((arr[i] + brr[j]) < x) i++;
            else break;
        }
        ans.add(arr[res_i]);
        ans.add(brr[res_j]); 
        return ans;
    }
}
