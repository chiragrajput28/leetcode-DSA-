import java.util.*;
public class mergeInterval {
    public static void main(String[] args) {
        int interval[][] = {{1,4}, {2,3}, {2,5}, {6,6}, {7,9}};
        //{1,3}, {2,6}, {8,10}, {15,18}
        merge(interval);
        // System.out.println("check2");
    }
    public static void merge(int[][] intervals) {
        // if (intervals.length <= 1)
		// 	return intervals;
        // System.out.println("check3");
		Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        int len = intervals.length;
        List<int[]> res = new ArrayList<>();
        //ArrayList<Integer> flag = new ArrayList<>();
        int i = 0;
        while (i < len) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            // System.out.println(start);
            // System.out.println(end);
            // System.out.println(i);
            while (i < len-1 && end >= intervals[i+1][0]) {
                i++;
                // System.out.println(i);
                if (end < intervals[i][1]) {
                    end = intervals[i][1];
                }
                else {
                    continue;
                }
            }    
            i++;
            // System.out.println("check1");
            // for (int j = i+1; j < len; j++) {
            //     // if (flag.size() != 0 && flag.contains(j)) {
            //     //     break;
            //     // }
            //     if (end >= intervals[j][0] && end < intervals[j][1]) {
            //         end = intervals[j][1];
            //         //flag.add(j);
            //     }   
            // }
            int x[] = {start, end};
            res.add(x);
            // if (!flag.contains(i)) {
            //     int x[] = {start, end};
            //     res.add(x);
            //     res[i][0] = start;
            //     res[i][1] = end;
            // }
        }
        for(int j = 0; j < res.size(); j++) {
            System.out.print(Arrays.toString(res.get(j)));
        }
        // return res.toArray(new int[res.size()][]);
        // System.out.println(res.toArray(new int[res.size()][]));
    }
}
