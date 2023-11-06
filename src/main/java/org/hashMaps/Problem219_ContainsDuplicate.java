package org.hashMaps;

import java.util.*;

public class Problem219_ContainsDuplicate {



    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> numsMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(numsMap.containsKey(nums[i]) && Math.abs(numsMap.get(nums[i])-i)<=k){
                return true;
            }
            else{
                numsMap.put(nums[i],i);
            }
        }
        return false;
    }

    public static void main(String[]args){
        int[]nums = {1,3,5,4,6,4,7};
        System.out.println(containsNearbyDuplicate(nums,2));
    }
}
