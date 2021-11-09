package com.hmmloo.javacodingproblems;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class String13 {
    public static String removeCharacter1(String abc, char a) {
        return abc.replaceAll(Pattern.quote(String.valueOf(a)), "");
    }

    public static String removeCharacter2(String abc, char a) {
        StringBuilder sb = new StringBuilder();
        for(char ch : abc.toCharArray()) {
            if(ch != a) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String removeCharacter3(String abc, char a) {
        return abc.chars().filter(c -> c != a).mapToObj( c -> String.valueOf((char)c)).collect(Collectors.joining());
    }
}
