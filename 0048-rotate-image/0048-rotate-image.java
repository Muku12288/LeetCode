class Solution {
    public void rotate(int[][] matrix) {

    // Tranpose the matrix;
        int temp,m,l;
        int row= matrix.length;
        int col = matrix[0].length;

        for(int i=0; i<= row-2; i++){
            for(int j=i+1; j<col; j++){
                temp= matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        } 
    // reverse the row;
        for(int k= 0; k< row; k++){
            m=0;
            l= col-1;
            while(m<=l){
                temp= matrix[k][m];
                matrix[k][m] = matrix[k][l];
                matrix[k][l] = temp;

                m++;
                l--;
            }

        }
    }
}