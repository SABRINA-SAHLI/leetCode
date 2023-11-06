package org.hashMaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Problem202_HappyNumber {
    public static boolean isHappy(int n) {

        Set<Integer> nums = new HashSet<Integer>();
        return isHappy(n,nums);
    }

    public static boolean isHappy(int n, Set<Integer> nums){


        if(n == 1){
            return true;
        }else if(nums.contains(n)){
            return false;
        }else{
            nums.add(n);
            int sum = 0;
            while(n > 0){
                int digit = n % 10;
                sum += digit * digit;
                n = n/10;
            }
            return isHappy(sum, nums);
        }
    }

    public static void main(String[]args){
        System.out.println("is Happy? "+ isHappy(2));
    }

}
