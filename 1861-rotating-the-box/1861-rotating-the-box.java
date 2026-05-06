class Solution {
    public char[][] rotateTheBox(char[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        char[][] res = new char[n][m];

         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = '.';
            }
        }

        for (int r = 0; r < m; r++) {
            int p = n - 1;
            for (int c = n - 1; c >= 0; c--) {
                if (grid[r][c] == '*') {
                    res[c][m - 1 - r] = '*';
                    p = c - 1;
                } else if (grid[r][c] == '#'){
                    res[p][m - 1 - r] = '#';
                    p--;
                }
                    
            }
        }

    
    return res;
    }
}