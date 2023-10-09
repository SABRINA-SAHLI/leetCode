package org.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem1_TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i = 0; i< nums.length; i++ ){
            numMap.put(nums[i],i );
        }
        for(int i = 0 ; i < nums.length ;i++){
            int complement = target - nums[i];
            if(numMap.containsKey(complement) && numMap.get(complement)!= i){
                return new int[]{i, numMap.get(complement)};
            }
        }
        return new int[]{};
    }


    public static void main(String[]args){


        int[]nums={3,3};
        System.out.println(Arrays.toString(twoSum(nums,6)));
    }
}
