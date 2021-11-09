package com.hmmloo.javacodingproblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test4 {
    @Test
    public void testContainsOnlyDigits() {
        String4 str = new String4();
        boolean result = str.containsOnlyDigits("a");
        assertFalse(result);
        assertTrue(str.containsOnlyDigits("1"));
        assertTrue(str.containsOnlyDigits("12"));
        assertFalse(str.containsOnlyDigits("1a"));
        assertFalse(str.containsOnlyDigits("1 2"));
        assertFalse(str.containsOnlyDigits("1 a"));
    }

    @Test
    public void testContainsOnlyDigits1() {
        String4 str = new String4();
        boolean result = str.containsOnlyDigits1("a");
        assertFalse(result);
        assertTrue(str.containsOnlyDigits1("1"));
        assertTrue(str.containsOnlyDigits1("12"));
        assertFalse(str.containsOnlyDigits1("1a"));
        assertFalse(str.containsOnlyDigits1("1 2"));
        assertFalse(str.containsOnlyDigits1("1 a"));
    }

    @Test
    public void testContainsOnlyDigits2() {
        assertFalse(String4.containsOnlyDigits1("a"));
        assertTrue(String4.containsOnlyDigits1("1"));
        assertTrue(String4.containsOnlyDigits1("12"));
        assertFalse(String4.containsOnlyDigits1("1a"));
        assertFalse(String4.containsOnlyDigits1("1 2"));
        assertFalse(String4.containsOnlyDigits1("1 a"));
    }

}