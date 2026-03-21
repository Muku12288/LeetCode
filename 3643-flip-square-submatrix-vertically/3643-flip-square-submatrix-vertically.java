class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int p = x+k-1, i=x;

        while(i <p){
            for(int j=y; j<=y+k-1; j++){
                int tmp = grid[p][j];
                grid[p][j] = grid[i][j];
                grid[i][j] = tmp;
            }
            p--;
            i++;
        }

        return grid;
    }
}