package org.binarySearch;

public class Problem540_Single_Element_In_Sorted_Array {

    public static int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }



    public static void main (String[]args){

        int[]nums = {1,2,2,3,3,4,4,5,5};
        int ans = singleNonDuplicate(nums);
        System.out.println(ans);
    }
}
