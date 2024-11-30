class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int m = matrix.length;//Number of Row
        int n = matrix[0].length;//Number of Columns
        int [][] transposed=new int [n][m];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                transposed[j][i]=matrix[i][j];//Using variable to change
            }
        }


        return transposed;




    }
}