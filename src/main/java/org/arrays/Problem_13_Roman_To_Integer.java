package org.arrays;

import java.util.HashMap;
import java.util.Map;

public class Problem_13_Roman_To_Integer {
    public static int romanToInt(String s) {

        char[] chars = s.toCharArray();

        Map<Character,Integer> numbersMap = new HashMap<Character,Integer>();
        numbersMap.put('I', 1);
        numbersMap.put('V', 5);
        numbersMap.put('X', 10);
        numbersMap.put('L', 50);
        numbersMap.put('C', 100);
        numbersMap.put('D', 500);
        numbersMap.put('M', 1000);

        int  i = 0;
        int ans = 0;
        while(i< chars.length-1){
            char c1= chars[i];
            char c2 = chars[i+1];
            if((c1 == 'I' || c1 == 'X' || c1 == 'C') && (numbersMap.get(c1) < numbersMap.get(c2))){
                ans += numbersMap.get(c2) - numbersMap.get(c1);
                i += 2;
            }else{
                ans += numbersMap.get(c1);
                i++;
            }
        }
        if(i == chars.length-1)
          ans += numbersMap.get(chars[i]);
        return ans;
    }


    public static int romanToInt2(String s) {
        int result = 0;
        char[] chars = s.toCharArray();

        Map<Character, Integer> numbersMap = new HashMap<Character, Integer>();
        numbersMap.put('I', 1);
        numbersMap.put('V', 5);
        numbersMap.put('X', 10);
        numbersMap.put('L', 50);
        numbersMap.put('C', 100);
        numbersMap.put('D', 500);
        numbersMap.put('M', 1000);

        for(int i = 0;i< chars.length;i++){

            if((i < chars.length-1) && numbersMap.get(chars[i]) < numbersMap.get(chars[i+1])){
                result -= numbersMap.get(chars[i]);
            }else{
                result += numbersMap.get(chars[i]);
            }

        }

        return result;

    }
    public static void main(String[]args){

        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }


}
