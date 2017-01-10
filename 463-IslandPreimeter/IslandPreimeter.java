public class Solution {
    /* 1st version ~189ms
    public int islandPerimeter(int[][] grid) {
        int rslt = 0;
        
        for (int i = 0; i< grid.length; i++) {
            for (int j = 0; j< grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    rslt += 4- oneAround(i, j, grid);
                }
            }
        }
        
        return rslt;
        
    }
    public int oneAround(int i, int j, int[][] grid) {
        //for positions (i,j), count the number of 1 arounded.
        // return: 0,1,2,3,4
        int number = 0;
        if (i-1 >= 0 && grid[i-1][j] == 1) number++;
        if (j-1 >= 0 && grid[i][j-1] == 1) number++;
        if (i+1 < grid.length && grid[i+1][j] == 1) number++;
        if (j+1 < grid[0].length && grid[i][j+1] == 1) number++;
        
        return number;
    }
    */
    //2nd version: ~144ms
    // oneAround() only need to count the left and abover corner.
    /*
        public int islandPerimeter(int[][] grid) {
        int rslt = 0;
        
        for (int i = 0; i< grid.length; i++) {
            for (int j = 0; j< grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    rslt += 4- 2* oneAround(i, j, grid);
                }
            }
        }
        
        return rslt;
        
    }
    public int oneAround(int i, int j, int[][] grid) {
        //for positions (i,j), count the number of 1 on left or above corner.
        // return: 0,1,2
        int number = 0;
        if (i-1 >= 0 && grid[i-1][j] == 1) number++;
        if (j-1 >= 0 && grid[i][j-1] == 1) number++;
        
        return number;
    }
    */
    
    //Furhter improvement, count cells number and neighours number.
    public int islandPerimeter(int[][] grid) {
        int cells = 0;
        int neighours = 0;
        
        for (int i = 0; i< grid.length; i++) {
            for (int j = 0; j< grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    cells++;
                    if (i-1 >= 0 && grid[i-1][j] == 1) neighours++;
                    if (j-1 >= 0 && grid[i][j-1] == 1) neighours++;
                }
            }
        }
        
        return cells * 4 - neighours * 2;
        
    }
}