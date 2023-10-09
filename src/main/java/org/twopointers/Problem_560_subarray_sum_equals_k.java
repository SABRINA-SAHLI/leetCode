package org.twopointers;

import java.util.HashMap;
import java.util.Map;

public class Problem_560_subarray_sum_equals_k {

    //Brute approach
    public int subarraySum(int[] nums, int k) {
        int ans = 0;

        // precompute sum between elements

        for(int i = 0; i < nums.length; i++){
            int sum = nums[i];
            if(nums[i]== k) ans++;
            for(int j = i+1; j <nums.length; j++){
                sum += nums[j];
                if(sum == k ) ans++;
                //  if(sum > k) break;

            }
        }
        return ans;
    }

    //Optimised approach
    public static int subarraySum2(int[] nums, int k) {
        int ans = 0;
        Map<Integer,Integer> sumArray = new HashMap<>();
        sumArray.put(0,1);
        int sum = 0;
        for(int num: nums){
            sum += num;
            int diff = sum- k;
            if(sumArray.containsKey(diff)){
                ans += sumArray.get(diff);
            }
            sumArray.put(sum, sumArray.getOrDefault(sum,0)+1);

        }


        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3,-3,4,1,6,10};
        int k = 7;
        int result = subarraySum2(nums, k);
        System.out.println("Total number of subarrays with sum " + k + ": " + result);
    }
}
