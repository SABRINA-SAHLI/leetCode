package org.arrays;

public class Problem27_Remove_Element {

    public static int removeElement(int[] nums, int val) {
        int index= 0;
            for(int i=0;i<nums.length;i++){
               if(nums[i] != val) {
                   nums[index] = nums[i];
                   index++;
               }
            }

            return index;
    }

    public static void main(String[]args){

        int val = 5;
        int[]nums = {};
        System.out.println(removeElement(nums,val));
    }
}
