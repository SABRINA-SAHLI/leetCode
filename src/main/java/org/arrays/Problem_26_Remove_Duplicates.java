package org.arrays;

public class Problem_26_Remove_Duplicates {

    public static int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i=1;i< nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[]args){

        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
