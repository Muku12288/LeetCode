import java.util.*;

class Solution {
    public int minimumArea(int[][] grid) {
        NavigableSet<Integer> rowset = new TreeSet<>();
        NavigableSet<Integer> colset = new TreeSet<>();

        for(int row=0; row<grid.length; row++){
            for(int col=0; col<grid[0].length; col++){
                if(grid[row][col] == 1){
                    rowset.add(row);
                    colset.add(col);
                }
            }
        }
        int rowlen = rowset.last() - rowset.first() +1;
        int collen = colset.last() - colset.first() + 1;
    return  rowlen*collen;
    }
}