public class multiDimesionalArrays {
    public static void main(String[] args) {
        
        int[][] grid = {
            {0, 1},
            {3, 5, 7},
            {1},
            {1, 0, 2, 5}
        };

        System.out.println(grid[2][0]);

        String[][] texts = new String[2][3];
        System.out.println(texts[0][0]);

        for(int row=0; row < grid.length; row++) {
            for(int col=0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
