package org.arrays;

public class SumOfSubMatrices {


    public static int sumOfSubmatrices(int[][]mat){
        int sum = 0;
        int m = mat.length;
        int n = mat[0].length;
        for(int i = 0; i < m ; i++){
            for(int j = 0 ; j< n; j++){
                sum += (i+1)*(j+1)*(n-j)*(m-i)* mat[i][j];
            }
        }

        return sum;
    }


    public static void main(String[]args){

        int[][]mat = {{1, 1}, {1, 1}};
        int count = sumOfSubmatrices(mat);
        System.out.println("count: "+count);

       int[][] mat2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int count2 = sumOfSubmatrices(mat2);
        System.out.println("Nb Submatrices in mat2 is: "+count2);
    }
}
