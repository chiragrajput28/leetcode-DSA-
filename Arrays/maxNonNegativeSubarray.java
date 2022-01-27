import java.util.ArrayList;

public class maxNonNegativeSubarray {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(-1);
        a.add(8);
        a.add(2);
        a.add(1);
        ArrayList<Integer> ans = new ArrayList<>();
        ans = max(a);
        for(int num: ans) System.out.println(num);
    }

    public static ArrayList<Integer> max(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int start = 0;
        int end = -1;
        int sum = 0;
        int osum = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > 0) {
                sum += a.get(i);
                if (sum > osum) osum = sum;
                end++;
            }
            else {
                if (sum == osum) {
                ArrayList<Integer> subans = new ArrayList<>();
                for(int j = start; j <= end; j++) {
                    subans.add(a.get(j));
                }
                ans.add(subans);
                }
                start = i+1;
                end = i;
                sum = 0;
            }
        }        
        return ans.get(0);
    }

    public static void addList(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> a, int start, int end) {
        ArrayList<Integer> subans = new ArrayList<>();
        for(int j = start; j <= end; j++) {
            subans.add(a.get(j));
        }
        ans.add(subans);

    }
}
