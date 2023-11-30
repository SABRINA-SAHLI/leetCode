package org.slidingWindow;

public class Problem_209_minSubaray {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int right = 0 , left = 0;
        int minLen = Integer.MAX_VALUE;
        while(right < nums.length){
            sum += nums[right];
            while(sum >=target){
                minLen = Math.min(minLen,(right - left) +1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE?0: minLen;
    }

}
