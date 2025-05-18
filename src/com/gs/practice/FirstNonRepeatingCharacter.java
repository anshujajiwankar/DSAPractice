package com.gs.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args){
        String s = "aabbccddeef";
        char[] arr = s.toCharArray();

        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for(Character c : arr){
            if(charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            }else{
                charCount.put(c, 1);
            }
        }
        boolean found = false;
        for(Map.Entry<Character, Integer> entry : charCount.entrySet()){
            if(entry.getValue() == 1){
                System.out.print(entry.getKey());
                found = true;
                break;
            }

        }
        if (!found){
            System.out.println(" NOT Found ");
        }
    }
}
