package org.arrays;

public class Problem66_Plus_One {

    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >= 0; i--){
            if (digits[i] + 1 <= 9){
                digits[i]  ++;
                return digits;
            }
            digits[i] = 0;
        }
        int[]ans = new int[digits.length+1];
        ans[0] = 1;
        return ans;
    }


}
