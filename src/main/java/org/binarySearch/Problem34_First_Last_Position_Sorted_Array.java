package org.binarySearch;

import java.util.Arrays;

public class Problem34_First_Last_Position_Sorted_Array {



    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = findFirst(nums, target);
        ans[1] = findLast(nums, target);
        return ans;
    }

    public static int findFirst(int[]nums, int target){

        int left = 0;
        int right = nums.length - 1 ;
        int range = -1;
        while(left <=right){
            int mid = (left + right)/2;
            if(nums[mid] < target){
                left = mid+1;

            }else if (nums[mid]> target){
                right = mid-1;

            }else if( nums[mid]==target){
                range = mid;
                right = mid-1;

            }
        }

        return range;
    }

    public static int findLast(int[]nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int range = -1;
        while(left<= right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                range = mid;
                left = mid+1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else if( nums[mid] > target){
                right = mid -1;
            }

        }
        return range;
    }
    public static void main(String[]args){
        int[]nums = {5,7,7,8,8,10};
        int[] ranges = searchRange(nums, 8);
        System.out.println("ranges = "+ Arrays.toString(ranges));
    }











}
