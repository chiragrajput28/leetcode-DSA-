import java.util.*;


public class jumpGameIII {
    //private static boolean add;
    public static void main(String[] args) {
        int arr[] = {4,2,3,0,3,1,2};
        int start = 5;
        System.out.println(canReach(arr, start));
    }
    public static boolean canReach(int[] arr, int start) {
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        //boolean vis[] = new boolean[n];
        if (arr[start] == 0) return true;
        while (q.size() > 0) {
            int size = q.size();
            while(size-- > 0) {
                int point = q.remove();
                //either i can go to the left 
                if (point - arr[point] >= 0) {
                    if (arr[point - arr[point]] == 0) {
                        return true;
                    }
                    else if(arr[point - arr[point]] > 0) {
                        q.add(point - arr[point]);
                    }
                }
                //or go to the right
                if (point + arr[point] < n) {
                    if (arr[point + arr[point]] == 0) {
                        return true;
                    }
                    else if(arr[point + arr[point]] > 0) {
                        q.add(point + arr[point]);
                    }
                }
                arr[point] = -1;
            }
        }
        return false;
    }
        
}