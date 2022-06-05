/**
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.
 */

public class setMatrixZeros {
    static int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
    public static void main(String[] args) {
        setZeros(matrix);
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int n = matrix.length;
        int m = matrix[0].length;
        boolean rows[] = new boolean[n];
        boolean cols[] = new boolean[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(rows[i] == true || cols[j] == true) {
                    matrix[i][j] = 0;
                }
            }   
        }
    }
}