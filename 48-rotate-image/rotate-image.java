class Solution {
    public void rotate(int[][] matrix) {
       for (int i = 0; i < matrix.length; i++) {
    for (int j = i; j < matrix.length; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}

    
    for(int k=0;k<matrix.length;k++){
         int p =0 ; int q = matrix[k].length-1;
        while(p<q){
            int temp = matrix[k][p];
            matrix[k][p] = matrix[k][q];
            matrix[k][q]=temp;
            p++; q--;
        }
    }}
}