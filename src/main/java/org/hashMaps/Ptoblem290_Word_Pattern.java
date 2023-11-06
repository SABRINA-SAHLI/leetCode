package org.hashMaps;

import java.util.HashMap;
import java.util.Map;

/* https://leetcode.com/problems/word-pattern/submissions/?envType=study-plan-v2&envId=top-interview-150 */
public class Ptoblem290_Word_Pattern {

    public static boolean wordPattern(String pattern, String s) {


       String[] arrS = s.split(" ");
       if(pattern.length() != arrS.length)
          return false;

       Map<Character,String> patternMap = new HashMap<Character,String>();
       Map<String,Character> sMap = new HashMap<String, Character>();

       for(int i=0; i< pattern.length();i++) {
            char c = pattern.charAt(i);
            String word = arrS[i];

           if((patternMap.containsKey(c) && !patternMap.get(c).equals(word))  ||
                           (sMap.containsKey(word) && sMap.get(word)!= c)
                           )
               return false;
           patternMap.put(c,word);
           sMap.put(word,c);
       }

        return true;
    }
//Second method with one hashMap
    public boolean wordPattern2(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;
        Map<Character, String> charToWord = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (!charToWord.containsKey(c)) {
                if (charToWord.containsValue(word)) return false;
                charToWord.put(c, word);
            }
            else if (!charToWord.get(c).equals(word)) return false;
        }
        return true;
    }

    public static void main(String[]args){
        String pattern = "abba";
        String  s = "dog cat cat dog";
        System.out.println("there is a bijections? "+ wordPattern(pattern,s));
    }
}
