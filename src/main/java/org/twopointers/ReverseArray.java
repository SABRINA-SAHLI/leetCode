package org.twopointers;

import java.util.Arrays;

public class ReverseArray {


    public static int[] reverseArray(int[]arr, int left, int right){

        if(left >= right) {
            return arr;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        return  reverseArray(arr, left+1 ,right-1);


    }



    public static void main(String[]args){

        int[] nums= {1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(nums, 0, nums.length-1)));
    }
}
