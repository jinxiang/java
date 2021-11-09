package com.hmmloo.javacodingproblems;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class String5 {
    private static final Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static Pair<Integer, Integer> countVowelsAndConsonants(String str) {
        str = str.toLowerCase();
        int vowelsC = 0;
        int consonantsC = 0;
        for(char ch: str.toCharArray()) {
            if (vowels.contains(ch)) {
                vowelsC++;
            } else if(ch >= 'a' && ch <= 'z') {
                consonantsC++;
            }
        }
        return Pair.of(vowelsC, consonantsC);
    }

    public static Pair<Long, Long> countVowelsAndConsonants1(String str) {
        long vowelsC = str.toLowerCase().chars().filter(c -> vowels.contains(c)).count();
        long consonantsC = str.toLowerCase().chars().filter(c -> !vowels.contains(c)).filter(ch -> ch >= 'a' && ch <= 'z').count();
        return Pair.of(vowelsC, consonantsC);
    }

    public static Pair<Long, Long> countVowelsAndConsonants2(String str) {
        Map<Boolean, Long> collect = str.chars().mapToObj(c -> (char) c).filter(ch -> ch >= 'a' && ch <= 'z')
                .collect(Collectors.partitioningBy(c -> vowels.contains(c), Collectors.counting()));
        return Pair.of(collect.get(true), collect.get(false));
    }
}
