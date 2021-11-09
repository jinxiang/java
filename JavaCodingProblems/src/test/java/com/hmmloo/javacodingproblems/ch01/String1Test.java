package com.hmmloo.javacodingproblems.ch01;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class String1Test {
    @Test
    public void test1() {
        // Create a Map and add some values
        Map<String, String> map = new HashMap<>();
        map.put("Name", "Aman");
        map.put("Address", "Kolkata");

        // Print the map
        System.out.println("Map: " + map);

        // remap the values using compute() method
        map.compute("Name", (key, val)
                -> val.concat(" Singh"));
        map.compute("Address", (key, val)
                -> val.concat(" West-Bengal"));
        map.compute("NewKey", (k,v) -> (v==null)? "1": "-1");
        // print new mapping
        System.out.println("New Map: " + map);
    }
}