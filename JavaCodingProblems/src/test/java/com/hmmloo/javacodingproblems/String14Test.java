package com.hmmloo.javacodingproblems;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class String14Test {

    @Test
    public void test1() {
        assertEquals(Pair.of('a',2), String14.maxOccurenceCharacter1("abac"));
        assertEquals(Pair.of('a',2L), String14.maxOccurenceCharacter2("abac"));
    }

    @Test
    public void test2() {
        String days = "Sunday\n"
                + "Monday\n"
                + "Tuesday\n"
                + "Wednesday\n"
                + "Thursday\n"
                + "Friday\n"
                + "Saturday";
        System.out.print(days);
        System.out.print(days.indent(10));
    }
}