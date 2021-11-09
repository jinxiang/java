package com.hmmloo.javacodingproblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class String12Test {

    @Test
    public void test1() {
        String str1 = "test1";
        assertEquals("tes1", String12.removeDuplicates1(str1));
        assertEquals("tes1", String12.removeDuplicates2(str1));
    }
}