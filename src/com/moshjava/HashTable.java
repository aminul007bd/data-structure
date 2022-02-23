package com.moshjava;

import java.util.HashMap;
import java.util.Map;

public class HashTable {

    public static void main(String[] args) {
        // key: Employeee number  (int
        // value: name (string

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Mosh");
        map.put(2, "John");
        map.put(3, "marry");
        map.put(3, "marry444");
        map.put(3, null);

        for( var item : map.entrySet())
            System.out.println(item);


    }
}
