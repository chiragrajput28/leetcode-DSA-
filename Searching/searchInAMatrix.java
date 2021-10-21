/**
 * Given a matrix mat[][] of size N x M, where every row and column is sorted in increasing order, and a number X is given. The task is to find whether element X is present in the matrix or not.


Example 1:

Input:
N = 3, M = 3
mat[][] = 3 30 38 
         44 52 54 
         57 60 69
X = 62
Output:
0
Explanation:
62 is not present in the
matrix, so output is 0

Example 2:

Input:
N = 1, M = 6
mat[][] = 18 21 27 38 55 67
X = 55
Output:
1
Explanation:
55 is present in the
matrix at 5th cell.
 */

package Searching;

public class searchInAMatrix {
   public static void main(String[] args) {
    int N = 3, M = 3;
    int mat[][] = {{3, 30, 38}, 
             {44, 52, 54}, 
             {57, 60, 69}};
    int X = 62;
    int ans = matSearch(mat, N, M, X);
    System.out.println(ans);
   } 
   public static int matSearch(int mat[][], int N, int M, int X)
    {
        // your code here
        // int col = 0;
        // int row = 0;
        for (int i = 0; i < N; i++) {
            //System.out.println(i);
            if (mat[i][M-1] >= X && mat[i][0] <= X) {
                //System.out.println("yes");
                //row = i;
                // for (int j = 0; j < M; j++) {
                //     //System.out.println(j + "j");
                //     if (mat[row][j] == X) {
                //         return 1;
                //     }
                // }
                int start = 0;
                int end = M-1;
                while (start <= end) {
                    int mid = (start + end)/2;
                    //System.out.println(mid);
                    if (mat[i][mid] == X) {
                        return 1;
                    }
                    if (mat[i][mid] > X) {
                        end = mid-1;
                    }
                    else {
                        start = mid+1;
                    }
                }
            }
        }
        return 0;
    }
}
