package org.hashMaps;

import java.util.HashMap;
import java.util.Map;

/*Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using
the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

 */
public class Problem383_Ransom_Note {

    public static boolean canConstruct(String ransomNote, String magazine) {

        if(magazine.length() < ransomNote.length())
            return false;
        Map<Character, Integer> magMap = new HashMap<>();
        for(Character character : magazine.toCharArray()){
            magMap.put(character,magMap.getOrDefault(character,0)+1);
        }
        for(Character ch : ransomNote.toCharArray()){
            if(!magMap.containsKey(ch) || magMap.get(ch) <= 0)
                return false;
            else
                magMap.put(ch,magMap.get(ch)-1);

        }
        return true;
    }


    public static boolean canConstruct2(String ransomNote, String magazine){

        int[] freq = new int[128];
        for(char c : magazine.toCharArray()){
            freq[c]++;
        }

        for(char c : ransomNote.toCharArray()){
            if ( --freq[c] < 0)
               return false;
        }

        return true;
    }

    public static void main(String[]args){

        String magazine ="aabc";
        String ransomNote ="aad";
        System.out.println(canConstruct(ransomNote,magazine));
    }
}
