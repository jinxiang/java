package com.hmmloo.javacodingproblems;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class String14 {
    public static Pair<Character, Integer> maxOccurenceCharacter1(String str) {
        Map<Character, Integer> counter = new HashMap<>();
        for(char ch: str.toCharArray()) {
            if(!Character.isWhitespace(ch)) {
                counter.compute(ch, (k, v) -> v==null? 1: ++v);
            }
        }
        int maxOccur = Collections.max(counter.values());
        char maxChar = Character.MIN_VALUE;
        for(Map.Entry<Character, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == maxOccur) {
                maxChar = entry.getKey();
            }
        }
        return Pair.of(maxChar, maxOccur);
    }

    public static Pair<Character, Long> maxOccurenceCharacter2(String str) {
        return str.chars().filter(c -> !Character.isWhitespace(c)).mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue())
                .map(p -> Pair.of(p.getKey(), p.getValue()))
                .orElse(Pair.of(Character.MIN_VALUE, -1L));
    }
}
