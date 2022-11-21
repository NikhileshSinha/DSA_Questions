class NiksSolution {
    public void rotate(int[][] matrix) {
        //CODE STARTS
        
        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int lmt;
        if(matrix.length%2==0){
            lmt = matrix.length/2;
        }
        else{
            lmt = (matrix.length-1)/2;
        }
        int jSwip = matrix.length-1;
        for(int j=0; j<lmt; j++){
            for(int i=0; i<matrix.length; i++){
                int temp = matrix[i][jSwip];
                matrix[i][jSwip] = matrix[i][j];
                matrix[i][j] = temp;
            }
            jSwip--;
        }
        
        //CODE ENDS
    }
}
