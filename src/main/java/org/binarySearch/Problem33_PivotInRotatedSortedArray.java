package org.binarySearch;

public class Problem33_PivotInRotatedSortedArray {

    public static int search(int[]nums , int target) {
        int left = 0;
        int right = nums.length - 1;

        while  (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if(nums[mid] > nums[right]){
                if( target >= nums[left] && target < nums[mid]){
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }else{
                if(target <= nums[right] && target > nums[mid]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }


    public static void main(String[]args){

        int[]nums = {4,5,6,7,0,1,2};
        int[]nums2 = {5,1,3};
        int range = search(nums2, 5);
        System.out.println("range "+range);
    }
}
