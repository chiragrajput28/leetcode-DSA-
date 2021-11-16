/**
 * Given an array A of N elements. Find the majority element in the array. 
 * A majority element in an array A of size N is an element that appears more than N/2 times in the array.
 * Example 1:

Input:
N = 3 
A[] = {1,2,3} 
Output:
-1
Explanation:
Since, each element in 
{1,2,3} appears only once so there 
is no majority element.
Example 2:

Input:
N = 5 
A[] = {3,1,3,3,2} 
Output:
3
Explanation:
Since, 3 is present more
than N/2 times, so it is 
the majority element.
 */


import java.util.*;

public class majorityElement {
    public static void main(String[] args) {
        int A[] = {3,1,3,3,2};
        int ans = majorElement(A, A.length);
        System.out.println(ans);
    }

    public static int majorElement(int a[], int size) {
        int ans = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int item: a) {
            map.put(item, map.getOrDefault(item,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int temp = entry.getValue();
            if (temp > size/2)
                ans = entry.getKey();
        }
        return ans;
    }
}
