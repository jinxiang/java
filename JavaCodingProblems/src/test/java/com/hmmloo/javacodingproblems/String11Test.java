package com.hmmloo.javacodingproblems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class String11Test {

    @Test
    public void test1() {
        String valid1 = "ABCBA";
        String valid2 = "AB BA";
        String valid3 = "AB  BA";
        String invalid1 = "ABCA";
        assertTrue(String11.isPalindrome1(valid1));
        assertTrue(String11.isPalindrome2(valid1));
        assertTrue(String11.isPalindrome1(valid2));
        assertTrue(String11.isPalindrome2(valid2));
        assertTrue(String11.isPalindrome1(valid3));
        assertTrue(String11.isPalindrome2(valid3));
        assertFalse(String11.isPalindrome1(invalid1));
        assertFalse(String11.isPalindrome2(invalid1));
    }
}