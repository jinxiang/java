package com.hmmloo.javacodingproblems;

public class String11 {
    public static boolean isPalindrome1(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (right > left) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome2(String str) {
        return str.equals(new StringBuffer(str).reverse().toString());
    }
}
