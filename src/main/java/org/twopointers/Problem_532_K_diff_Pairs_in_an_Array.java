package org.twopointers;

import java.util.HashMap;
import java.util.Map;

public class Problem_532_K_diff_Pairs_in_an_Array {
    public static int findPairs(int[] nums, int k) {

        int count = 0;
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int num : nums)
            numsMap.put(num,numsMap.getOrDefault(num,0)+1);

        for(int num: numsMap.keySet()){
            if( (k > 0 && numsMap.containsKey(num+k))  || (k==0 && numsMap.get(num)>1))
                count++;

        }
        return count;
    }
    public static void main(String[]args){

        int[] nums = {1,3,1,5,4};

        System.out.println(" number = "+findPairs(nums,0));
    }
}
