import java.util.*;
public class lastStoneWeight {
    public static void main(String []args) {
        int [] stones = {2,7,4,1,8,1};
        int res = lastStone(stones);
        System.out.println(res);
    }
    public static int lastStone(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((m1, m2) -> m2 - m1);
        for (int x: stones) {
            maxHeap.add(x);
        }
        while(maxHeap.size() > 1) {
            int stoneOne = maxHeap.poll();
            int stoneTwo = maxHeap.poll();
            if (stoneOne != stoneTwo) {
                maxHeap.add(stoneOne-stoneTwo);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}
