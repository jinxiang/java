package com.hmmloo.javacodingproblems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class String13Test {

    @Test
    public void test1() {
        assertEquals("bc", String13.removeCharacter1("abc", 'a'));
        assertEquals("bc", String13.removeCharacter2("abc", 'a'));
        assertEquals("bc", String13.removeCharacter3("abc", 'a'));
    }

    @Test
    public void test2() {
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 100000; i++) {
            sb.append("Tpoint");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i = 0; i < 100000; i++) {
            sb2.append("Tpoint");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");

    }

    @Test
    public void test3() {
        char c = '祥';
        String s = "祥";
        System.out.println(c);
        System.out.println(s.length());
    }
}