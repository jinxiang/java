package com.hmmloo.javacodingproblems;

import java.util.HashSet;
import java.util.Set;

public class Utils {
    // Generic function to convert an Array to Set
    public static <T> Set<T> convertArrayToSet(T array[]) {

        // Create an empty Set
        Set<T> set = new HashSet<>();

        // Iterate through the array
        for (T t : array) {
            // Add each element into the set
            set.add(t);
        }

        // Return the converted Set
        return set;
    }
}
