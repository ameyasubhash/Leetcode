class Solution {
    public void setZeroes(int[][] matrix) {
        // brute force
        // int m=matrix.length;
        // int n=matrix[0].length;
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         if(matrix[i][j]==0){      
        //             // we need k loop for both m & n and change those only whose isn't zero
        //             for(int k=0; k<n; k++){
        //                 if(matrix[i][k]!=0)
        //                 matrix[i][k]=-1234;
        //             }
        //             for(int k=0; k<m; k++){
        //                 if(matrix[k][j]!=0)
        //                 matrix[k][j]=-1234;
        //             }
        //         }
        //     }
        // }
        // for(int i=0;i<m;i++)
        //     for(int j=0;j<n;j++)
        //         if(matrix[i][j]==-1234)
        //             matrix[i][j]=0;
        
        int col0=1;
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0; i<m; i++){
            if(matrix[i][0]==0) col0=0;
            for(int j=1; j<n; j++){
                if(matrix[i][j]==0)
                    matrix[i][0] = matrix[0][j] = 0;
            }
        }
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=1; j--)
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            if(col0==0) matrix[i][0]=0;
                    
        }
    }
}