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

    public static int[]  rotate2(int[] nums, int k) {
        int[]arrTemp = new int[k];
        int n = nums.length;
        int index=0;
        k = k % n;

        if(n == 1)
            return nums;

        for(int i = n- k ; i < n; i++){
            arrTemp[index] = nums[i];
            index ++;
        }

        for( int i = n-k-1; i>=0 ;i--){
            nums[i+k] = nums[i];
        }

        for(int i = 0 ; i < k; i++){
            nums[i] = arrTemp[i];
        }
       return nums;
    }


    private static void reverse(int[]arr, int i, int j){

        int leftIndex = i;
        int rightIndex = j;
        int temp;
        while(leftIndex < rightIndex){

            temp = arr[leftIndex] ;
            arr[leftIndex]= arr[rightIndex];
            arr[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }


    }

    public static int[] rotate3(int[]nums, int k){

        k = k % nums.length;
        int n = nums.length;

        reverse(nums,0, n-k-1);
        reverse(nums, n-k, nums.length-1);
        reverse(nums,0, nums.length-1);
        return nums;
    }


    public static void main(String[]args) {


        int[] arr = {3, -2, 1, 4, 6, 9, 8};
        int[] result = rotate(arr, 3);
        System.out.println("First approach "+Arrays.toString( result));


        int[] arr2 = {3, -2, 1, 4, 6, 9, 8};
        int[] result2 =rotate2(arr2, 3);
        System.out.println("Second approach " +Arrays.toString(result2));

        int[] arr3 = {3, -2, 1, 4, 6, 9, 8};
        int[] result3 =rotate3(arr3, 3);
        System.out.println("Optimized Approach " +Arrays.toString(result3));
    }
}
