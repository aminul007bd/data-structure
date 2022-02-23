package com.moshjava;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static char findFirstNodeRepeatingChar(String str) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: str.toCharArray()) {
            count = map.containsKey(ch) ? map.get(ch): 0;
            map.put(ch, count + 1);
        }
        for(var ch: str.toCharArray())
            if(map.get(ch) == 1) return ch;

        return Character.MIN_VALUE;
    }
    public static void main(String[] args) {
        var result = findFirstNodeRepeatingChar("a green apple");
        System.out.println(result);
    }
}
