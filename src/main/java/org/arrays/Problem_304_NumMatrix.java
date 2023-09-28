package org.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/range-sum-query-2d-immutable/description/
public class Problem_304_NumMatrix {


    int[][]matrixSum ;
    public Problem_304_NumMatrix(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        matrixSum= new int[n][m];

        for(int i =0 ; i< n; i++){
            matrixSum[i][0]= matrix[i][0];
            for(int j= 1; j <  m ;j++){
             matrixSum[i][j] = matrixSum[i][j-1]+ matrix[i][j];
            }
        }

        for(int j=0; j< m ; j++ ){
            for(int i=1; i< n ; i++){
                matrixSum[i][j]= matrixSum[i][j] + matrixSum[i-1][j];
            }
        }

    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        int sum = matrixSum[row2][col2];
        if(row1 > 0) {
           sum -=  matrixSum[row1 - 1][col2];
        }
        if( col1 > 0){
            sum-= matrixSum[row2][col1-1];
        }

        if(col1 > 0 && row1 > 0){
            sum += matrixSum[row1-1][col1-1];
        }
        return sum;
    }


    public static void main(String[]args){
        int[][]matrix= {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        Problem_304_NumMatrix obj = new Problem_304_NumMatrix(matrix);

        for(int[] arr: obj.matrixSum){
            System.out.println(Arrays.toString(arr));
        }

         int sum1 = obj.sumRegion(2, 1, 4, 3);
         int sum2 = obj.sumRegion(1, 1, 2, 2);
         int sum = obj.sumRegion(1, 2, 2, 4);
         System.out.println(sum1 + " "+ sum2);
    }
}
