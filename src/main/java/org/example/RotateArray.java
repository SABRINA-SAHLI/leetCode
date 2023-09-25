package org.example;

import java.util.Arrays;


public class RotateArray {




    /*Rotate Array From Last to first by K times {3, -2, 1, 4, 6, 9, 8 } K = 3 Answer = {6, 9, 8, 3, -2, 1, 4}
        Time complexity o(n*k), space complexity= O(1)   */

    public static int[] rotate(int[]arr, int k){

        int temp;
        int n = arr.length;
        for(int i=0; i<k ; i++){
            temp=arr[n-1];

            for(int j=n-2 ; j >= 0 ; j--){
                arr[j+1] = arr[j];
            }
            arr[0] = temp;
        }

        return arr;
    }


    /*  Time complexity  : O(n+k)
        Space complexity : k
     */
    public static int[] rotate2(int[]arr, int k){

        int[]arrTemp = new int[k];
        int n = arr.length;
        int index=0;
        for(int i = n -k ; i < n; i++){
            arrTemp[index] = arr[i];
            index ++;
        }

        for( int i = n-k-1; i>=0 ;i--){
            arr[i+k] = arr[i];
        }

        for(int i = 0 ; i < k; i++){
            arr[i] = arrTemp[i];
        }
        return arr;
    }


    public static void main(String[]args) {


        int[] arr5 = {3, -2, 1, 4, 6, 9, 8};
        int[] result = rotate(arr5, 3);
        System.out.println("First approach "+Arrays.toString( result));

        int[] result2 = rotate2(arr5, 3);
        System.out.println("Second approach " +Arrays.toString(result2));
    }
}
