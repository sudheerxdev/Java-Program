class Solution {
    public int[][] transpose(int[][] matrix) {
        // int [][] ans = new int[matrix[0].length][matrix.length];
        // for(int i = 0 ; i < matrix.length ; i++){
        //     int n = matrix[i].length ;
        //     for(int j = 0 ; j < n; j++){
        //         ans[j][i] = matrix[i][j];
        //     }
        // }
        // return  ans; 
          int [][] ans = new int[matrix.length][matrix[0].length];
        for(int i = 0 ; i < matrix.length ; i++){
            int n = matrix[i].length ;
            for(int j = 0 ; j < n; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return  ans;
    }
}
