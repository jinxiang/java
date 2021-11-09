package com.hmmloo.javacodingproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class String12 {
    public static String removeDuplicates1(String str1) {
        StringBuilder sb = new StringBuilder();
        Set<Character> s = new HashSet(Arrays.asList(str1.toCharArray()));
        for(char c : str1.toCharArray()) {
            if (s.add(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String removeDuplicates2(String str1) {
        return Arrays.asList(str1.split("")).stream().distinct().collect(Collectors.joining());
    }
}
