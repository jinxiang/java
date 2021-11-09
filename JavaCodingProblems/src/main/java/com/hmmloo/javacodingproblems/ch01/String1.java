package com.hmmloo.javacodingproblems.ch01;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class String1 {

    public Map<Character, Integer> countDuplicateCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>();
        for (char ch : str.toCharArray()) {
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }

    public Map<Character, Long> countDuplicateCharactersWithStream(String str) {
        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }
}