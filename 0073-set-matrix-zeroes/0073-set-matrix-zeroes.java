class Solution {
    public void setZeroes(int[][] matrix) {
        //brute force without space
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<matrix.length;k++){
                        if(matrix[k][j]==0) 
                            matrix[k][j]=0;
                        else
                         matrix[k][j]=-1234;
                    }
                    for(int l=0;l<matrix[0].length;l++){
                        if(matrix[i][l]==0) 
                            matrix[i][l]=0;
                        else
                            matrix[i][l]=-1234;    
                    }
                }
            }
        }
        
		for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-1234)
                matrix[i][j]=0;
            }
		}
    


        //brute force using space


    //   int temp[][]=new int[matrix.length][matrix[0].length];
	// 	 for(int i =0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             temp[i][j]=1;
    //         }
	// 	 }
    //     for(int i =0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(matrix[i][j]==0){
    //                 for(int k=0;k<matrix.length;k++){
    //                      temp[k][j]=0;
    //                 }
    //                 for(int l=0;l<matrix[0].length;l++){
    //                         temp[i][l]=0;    
    //                 }
    //             }
    //         }
    //     }
        
	// 	 for(int i =0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(temp[i][j]==0)
    //             matrix[i][j]=temp[i][j];
    //         }
	// 	 }
    // }



    // public void seti(int [][] matrix,int i){
    //     for(int i=i;i<matrix.length;i++){
    //         for(int j=0;j<)
    //     }
    // }
    // public void setj(int [][] matrix,int j)
    }
}