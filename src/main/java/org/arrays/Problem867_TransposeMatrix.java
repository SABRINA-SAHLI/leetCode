package org.arrays;

import java.util.Arrays;

    /* Given a 2D integer array matrix, return the transpose of matrix.
     The transpose of a matrix is the matrix flipped over its main diagonal,
       switching the matrix's row and column indices.
     */
public class Problem867_TransposeMatrix {



    public static int[][] transpose(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int[][]ans = new int[n][m];

        for(int i = 0 ; i< m; i++){
            for(int j=0; j< n ; j++){
                ans[j][i] = matrix[i][j];
            }
        }

        return ans;
    }


    public static void main(String[]args){

       int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
       int[][] ans = transpose(matrix);
       for(int i = 0; i < ans.length; i++)
        System.out.println(Arrays.toString(ans[i]));
    }
}
