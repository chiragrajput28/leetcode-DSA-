/**
 * Given an unsorted array Arr of size N of positive integers. 
 * One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Find these two numbers.
 * 
 * Input:
    N = 3
    Arr[] = {1, 3, 3}
   Output: 3 2
   Explanation: Repeating number is 3 and 
    smallest positive missing number is 2.
 */
public class findMissingAndRepeating {
    public static void main(String args[]) {
        int[] nums = {4, 4, 5, 2, 1};
        int n = nums.length;
        int[] res = findTwoElement(nums,n);
        for (int x: res)
            System.out.print(x + " ");
    } 
    public static int[] findTwoElement(int arr[], int n) {
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            if (arr[Math.abs(arr[i]) -1] > 0)
                arr[Math.abs(arr[i]) -1] = -arr[Math.abs(arr[i]) -1];
            else 
                ans[0] = Math.abs(arr[i]);
                //returning the duplicate number
        }
        // for (int x : arr) {
        //     System.out.println(x + " ");
        // }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) 
                ans[1] = i + 1;
                //returning the missing number
        }
        return ans;
    }
}
