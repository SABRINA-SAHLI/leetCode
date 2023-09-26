package org.arrays;

public class Problem1351_CountNegativeNumber_SortedMatrix {

    public static int countNegatives_BruteApproach(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i = 0; i <m; i++){
            for(int j = n-1; j >= 0; j--){
                if(grid[i][j] < 0){
                    count ++;
                } else if(grid[i][j] >= 0){
                    break;
                }
            }
        }

        return count;
    }


    public static int countNegatives_Optimized(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i = 0; i <m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] < 0){
                    count += n-j;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[]args) {

        int[][]grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int[][]grid2 = {{5,1,0},{-5,-5,-5}};
        int count = countNegatives_Optimized(grid);
        System.out.println("Count: "+count);

    }
}
