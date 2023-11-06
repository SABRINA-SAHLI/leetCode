package org.hashMaps;

import java.io.CharConversionException;
import java.util.HashMap;
import java.util.Map;

public class Problem205_Isomorphic_Strings {

    public static boolean isIsomorphic(String s, String t) {


        if(s.length()!= t.length()){
            return false;
        }
        int[] arrS = new int[200];
        int[] arrT = new int[200];


        for(int i=0; i< s.length();i++){

            Character charS = s.charAt(i);
            Character charT = t.charAt(i);

            if(arrS[charS]!= arrT[charT])
                return false;

            arrS[charS] = i+1;
            arrT[charT] = i+1;
        }
        return true;
    }

    public static void main(String[]args){

     // String s = "paper";
     // String t = "title";
      String s = "badc";
      String t = "baba";
      System.out.println(" are isomorphic?: "+isIsomorphic(s,t));

    }
}
