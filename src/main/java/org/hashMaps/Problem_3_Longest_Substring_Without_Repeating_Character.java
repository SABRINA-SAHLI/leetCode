package org.hashMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem_3_Longest_Substring_Without_Repeating_Character {

    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        Map<Character,Integer> charsMap= new HashMap<>();
        int k = 0;
        for(int i = 0;i<chars.length;i++ ){

            char c = chars[i];
            if(charsMap.containsKey(c) && charsMap.get(c)>= k) {
                k = charsMap.get(c) + 1;
            }
               result = Math.max(result, i - k + 1);
                charsMap.put(c,i);
        }
        return result;
    }




    public static void main(String[]args){
        String s4 = "abcabcbb";
        String s3 = "cdd";
        String  s2 = "abba";
        String  s1 = "dvdf";
        String  s = "pwwkew";
       System.out.println("Longest substring without repeating characters "+lengthOfLongestSubstring(s));
    }
}
