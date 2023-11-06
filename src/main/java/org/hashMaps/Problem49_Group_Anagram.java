package org.hashMaps;

import java.util.*;

public class Problem49_Group_Anagram {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = String.valueOf(chars);
            if(!anagrams.containsKey(sorted))
                anagrams.put(sorted, new ArrayList<>());
            anagrams.get(sorted).add(str);
        }

        return new ArrayList<>(anagrams.values());
    }


}
