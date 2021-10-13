public class maximumProductSubarray {
   public static void main(String[] args) {
       int arr[] = {-3,-2};
       int res = maxProduct(arr);
       System.out.println(res);
   } 
    public static int maxProduct(int[] nums) {
        int maxproduct = Integer.MIN_VALUE;
        int lastMaxproduct = 0;
        if (nums.length == 1) return nums[0];
        for (int i = 0; i < nums.length; i++) {
            lastMaxproduct = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (maxproduct < lastMaxproduct) {
                    maxproduct = lastMaxproduct;
                }
                lastMaxproduct *= nums[j];
                if (maxproduct < lastMaxproduct) {
                    maxproduct = lastMaxproduct;
                }
            }
        }
        return Math.max(maxproduct, lastMaxproduct);
    }
}
