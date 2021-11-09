package com.hmmloo.javacodingproblems;

public class String6 {

    public static int countOccurencesOfACertainCharacter(String str, char ch) {
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }

    public static int countOccurencesOfACertainCharacter1(String str, char ch) {
        int count = 0;
        for (char l : str.toCharArray()) {
            if (ch == l) {
                count++;
            }
        }
        return count;
    }
    public static long countOccurencesOfACertainCharacter2(String str, char ch) {
        return str.chars().filter( l -> l == ch).count();
    }

}
