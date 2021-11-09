package com.hmmloo.javacodingproblems;

public class String4 {
    public static boolean containsOnlyDigits(String a) {
        for(char ch : a.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsOnlyDigits1(String str) {
        return !str.chars().anyMatch(n -> !Character.isDigit(n));
    }

    public static boolean containsOnlyDigits2(String str) {
        return str.matches("[0-9]+");
    }
}
