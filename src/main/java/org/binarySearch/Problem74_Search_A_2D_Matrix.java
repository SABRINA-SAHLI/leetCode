package org.binarySearch;

public class Problem74_Search_A_2D_Matrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = (n*m) - 1;
           while(left <= right){
              int mid= (left+right)/2;
              //find the element in the mid position
               int row= mid/n;
               int col= mid % n;
               if(matrix[row][col] == target){
                   return true;
               }
               if(matrix[row][col]>target){
                   right = mid - 1;
               }else if(matrix[row][col]< target) {
                left = mid + 1;
               }
           }
        return false;
    }



    public static void main(String[]args){

       int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
       System.out.println(searchMatrix(matrix,20));

    }
}
