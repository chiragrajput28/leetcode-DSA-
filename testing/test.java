package testing;

import java.util.*;

//import java.util.HashMap;

//import java.util.*;

public class test {
    public static void main(String[] args) {
        //int x = 0;

        int mat[][] = {{9,8,7,6},{8,7,6,5},{7,6,5,4},{6,5,4,3}};
        Arrays.sort(mat, new Comparator<int[]>() {
            public int compare(int[] e1, int[]e2) {
                if(e1[0] > e2[0]) {
                    return -1;
                }
                else 
                    return 1;
            }
        });
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
}