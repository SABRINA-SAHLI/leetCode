package org.arrays;

public class Problem_169_Majority_Element {

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if(count ==0){
                candidate = num;
            }
            if(num == candidate)
                count++;
            else
                count--;
        }

        return candidate;
    }

public static void main(String[]args){

        int[] nums = {3, 2 ,3, 2, 1, 2};
        System.out.println(majorityElement(nums));
}
}
