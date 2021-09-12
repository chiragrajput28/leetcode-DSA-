import java.util.*;
class Solution {
    public static void main(String[] args) {
        int lowLimit = 19, highLimit = 28;
        int res = countBalls(lowLimit, highLimit);
        System.out.println(res);
    }
    public static int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int maxi = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum1 = sumOfDigits(i);
            if (hashmap.containsKey(sum1)) {
                hashmap.put(sum1, hashmap.get(sum1) + 1);
            }
            else {
                hashmap.put(sum1, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
            if (entry.getValue() > maxi) {
                maxi = entry.getValue();
            }
            //System.out.println(entry.getKey() + " " + entry.getValue());
        }
        return maxi;
    }
    public static int sumOfDigits(int num) {
        int res = 0;
        while (num != 0) {
            res += num % 10;
            num = Math.floorDiv(num, 10);
        }
        return res;
    }
}