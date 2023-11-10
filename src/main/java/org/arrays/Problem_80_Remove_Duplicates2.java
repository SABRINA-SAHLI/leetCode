package org.arrays;

public class Problem_80_Remove_Duplicates2 {

    public int removeDuplicates(int[] nums) {

        int index = 1;
        int counter = 0;
        for(int i=1 ;i<nums.length;i++){
            if( nums[i] !=nums[i-1] ) {
                nums[index] = nums[i];
                index++;
                counter = 0;
            }else{
                if(counter ==0){
                    nums[index] = nums[i];
                    index++;
                    counter++;

                }
            }
        }
        return index;
    }

}
