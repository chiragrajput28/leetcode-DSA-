/**
 * Given a sorted and rotated array A of N distinct elements which is rotated at some point, and given an element key. The task is to find the index of the given element key in the array A.

Example 1:

Input:
N = 9
A[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}
key = 10
Output:
5
Explanation: 10 is found at index 5.
Example 2:

Input:
N = 4
A[] = {3, 5, 1, 2}
key = 6
Output:
-1
Explanation: There is no element that has value 6.
 */

package Searching;

public class searchInRotatedArray {
    public static void main(String[] args) {
        int N = 9;
        int A[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 10;
        int ans = search(A, 0, N-1, key);
        System.out.println(ans);
    }
    public static int search(int A[], int l, int h, int key)
    {
        // find the pivot element 
        int temp = 0;
        for (int i = l; i < h; i++) {
            if (A[i] > A[i+1]) {
                temp = i;
            }
        }
        
        //System.out.println(temp);
        int temp1 = temp+1;
        // binary search on either sorted arrays
        while (l <= temp) {
            int mid = (l+temp)/2;
            //System.out.println(mid + "first");
            if (A[mid] == key) return mid;
            if (A[mid] < key) l = mid+1;
            else temp = mid-1;
        }
    
        while (temp1 <= h) {
            int mid = (temp1+h)/2;
            //System.out.println(mid + "second");
            if (A[mid] == key) return mid;
            if (A[mid] < key) temp1 = mid+1;
            else h = mid-1;
        }
        return -1;
    }
}
