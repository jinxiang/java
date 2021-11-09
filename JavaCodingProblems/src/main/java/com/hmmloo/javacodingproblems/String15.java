package com.hmmloo.javacodingproblems;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 15. Sorting an array of strings by length
 */
public class String15 {

    public static void sortArrayByLength(String[] strs, Sort direction) {
        if(Sort.ASC == direction) {
            Arrays.sort(strs, Comparator.comparingInt(String::length));
        } else {
            Arrays.sort(strs, Comparator.comparingInt(String::length).reversed());
        }
    }

    public static String[] sortArrayByLength1(String[] strs, Sort direction) {
        if(Sort.ASC == direction) {
            return Arrays.stream(strs).sorted(Comparator.comparingInt(String::length)).toArray(String[]::new);
        } else {
            return Arrays.stream(strs).sorted(Comparator.comparingInt(String::length).reversed()).toArray(String[]::new);
        }
    }

    private enum Sort {
        ASC, DESC;
    }
}
