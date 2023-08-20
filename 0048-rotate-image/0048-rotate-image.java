class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        
        // brute force
        // int [][] temp = new int [n][n];
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         temp[j][n-1-i]=matrix[i][j];
        //     }
        // }
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         matrix[i][j]=temp[i][j];
        //     }
        // }
        
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){      // j=0 will not the ans
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
    }
}