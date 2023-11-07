package org.hashMaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem128_Longest_Consecutive_Sequence {

    public static int longestConsecutive(int[] nums) {
        int length = 1;
        int maxLength = 0;

        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);

        for(int i = 0 ;i< nums.length-1;i++){
            int num = nums[i];
            if(nums[i+1] - nums[i] ==1){
                length ++;
            }else if((Math.abs(nums[i+1] - nums[i]) > 1)){
                maxLength = Math.max(length,maxLength);
                length = 1;
            }
        }
        maxLength = Math.max(length,maxLength);
        return maxLength;

    }




    public static int longestConsecutive2(int[]nums){

        int result = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int num: nums){
            map.put(num,1);
        }

        for(int i = 0; i< nums.length;i++){
            if(map.containsKey(nums[i]) && !map.containsKey(nums[i]+1)){
                int length = 1;
                int num = nums[i];
                while(map.containsKey(num-1)){
                    length++;
                    map.remove(num);
                    num-- ;
                }
                result = Math.max(length, result);
            }
        }


        return result;

    }
    public static void main(String[]args){
        int[]nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println("Longest consecutive list length is :"+longestConsecutive2(nums));
    }
}
