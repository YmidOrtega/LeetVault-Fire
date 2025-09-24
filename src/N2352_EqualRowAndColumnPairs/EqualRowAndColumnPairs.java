package N2352_EqualRowAndColumnPairs;

import java.util.Arrays;

public class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        int length = grid.length;
        int[][] tGrid = new int[length][length];
        for (int row = 0; row < length; row++) {
            for (int column = 0; column < length; column++) {
                tGrid[column][row] = grid[row][column];
            }
        }
        int count = 0;
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                if(Arrays.equals(grid[i],tGrid[j])){
                    count++;
                }
            }
        }
        return count;
    }
}
