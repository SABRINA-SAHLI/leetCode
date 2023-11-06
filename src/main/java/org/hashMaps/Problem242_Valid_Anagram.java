package org.hashMaps;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Problem242_Valid_Anagram {

    public static boolean isAnagram(String s, String t) {

        if(s.length()!= t.length())
            return false;

        Map<Character,Integer> counterMap = new HashMap<Character,Integer>();

        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            counterMap.put(c, counterMap.getOrDefault(c,0)+1);
        }

        for(int i= 0; i<t.length();i++){
            Character c = t.charAt(i);
            counterMap.put(c, counterMap.getOrDefault(c,0)-1);

        }

        for(int value :counterMap.values()){
            if(value!= 0)
                return false;
        }
        return true;

    }


    //Second method
    public static boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch)-1);
                }
            }
        }
        return map.isEmpty();
    }

    public static void main(String[]args){

       String  s = "anagram", t = "nbgaram";
       System.out.println("Are anagram? :"+ isAnagram(s,t));
    }
}
