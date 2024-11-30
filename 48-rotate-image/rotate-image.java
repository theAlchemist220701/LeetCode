class Solution {

    //My Swap Function
        public void swap(int [][]matrix,int i,int j){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }



    public void rotate(int[][] matrix) {
         for(int i=0;i<matrix.length;i++){
            int a=i;
            for(int j=i;j<matrix.length;j++){
                int b=j;
                swap(matrix,a,b);
            }
        }


    for(int i=0;i<matrix.length;i++){
        int start = 0;
        int end = matrix.length-1;
        while(start<=end){
            int temp=matrix[i][start];
            matrix[i][start]=matrix[i][end];
            matrix[i][end]=temp;
            start++;
            end--;
        } 
    }
       



        }
    }
