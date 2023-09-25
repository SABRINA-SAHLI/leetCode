package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayAssignments {

     /*1.  Find all elements in an array that are greater than all elements to their right
      Example: 3 5 9 6 8 5. Solution : 9, 8 */



    public static List<Integer> greaterThan(int[]arr){

        List<Integer> ans = new ArrayList<>();
        int[]temp= new int[arr.length];
        int n = arr.length;

        temp[0] = arr[n-1];
        for(int i = n-2 ; i >= 0;i--){
            temp[i]= Math.max(arr[i], temp[i+1]);
        }

        for(int i = n-2; i >=0;i--){
            if( arr[i] > temp[i+1])
                ans.add(arr[i]);
        }
        return ans;

    }
    public static void main(String[]args) {


        int[] arr = {13, 5, 12, 10, 8, 6};
        List<Integer> ans = greaterThan(arr);
        System.out.println(ans);

    }
}
