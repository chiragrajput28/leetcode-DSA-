public class islandPerimeter {
    static int island[][] = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
    static int rows = island.length;
    static int column = island[0].length;
    public static void main(String[] args) {
        int perimeter = Perimeter(island);
        System.out.println(perimeter);
    }
    public static int Perimeter(int[][] grid) {
        int sum = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < column; j++) {
                if (grid[i][j] == 1) {
                    sum += check(i,j);
                }
            }
        }
        return sum;
    }
    public static int check(int i, int j) {
        int count = 4;
        if (i -1 >= 0 && j >= 0 && island[i-1][j] == 1) {
            count -= 1;
        }
        if (i +1 <= rows-1 && j >= 0 && island[i+1][j] == 1) {
            count -= 1;
        }
        if (i >= 0 && j -1 >= 0 && island[i][j-1] == 1) {
            count -= 1;
        }
        if (i >= 0 && j +1 <= column-1 && island[i][j+1] == 1) {
            count -= 1;
        }
        return count;
    }
}
