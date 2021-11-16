// https://www.interviewbit.com/problems/gas-station/

package GreedyAlgorithm;
//import java.util.*;
import java.util.stream.IntStream;

public class gasStation {
   public static void main(String[] args) {
       int A[] = {2};
       int B[] = {2};
       System.out.println(canCompleteCircuit(A,B));
   } 

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int sum1 = IntStream.of(gas).sum();
        int sum2 = IntStream.of(cost).sum();
        if(sum1 < sum2) return -1;
        System.out.println("hi");
        for(int i = 0; i < n; i++) {
            if(gas[i] >= cost[i]) {
                System.out.println("yes");
                if (check(gas,cost,i)) {
                    System.out.println("check");
                    return i;
                }
            }
        }
        return -1;
    }
        public static boolean check(int[] gas, int[] cost, int index) {
            int currGas = 0;
            for(int i = index; i < index + gas.length; i++) {
                currGas += gas[i%gas.length] - cost[i%gas.length];
                System.out.println(currGas + "currgas");
                if (currGas < 0) {
                    return false;
                }
            }
            return true;
        }
}
