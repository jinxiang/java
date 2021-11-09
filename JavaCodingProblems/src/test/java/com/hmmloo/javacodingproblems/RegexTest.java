package com.hmmloo.javacodingproblems;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

public class RegexTest {

    public static int runTest(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }
        return matches;
    }

    @Test
    public void givenText_whenSimpleRegexMatches_thenCorrect() {
        Pattern pattern = Pattern.compile("foo");
        Matcher matcher = pattern.matcher("foo");

        assertTrue(matcher.find());
    }

    @Test
    public void givenText_whenSimpleRegexMatchesTwice_thenCorrect() {
        Pattern pattern = Pattern.compile("foo");
        Matcher matcher = pattern.matcher("foofoo");
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }

        assertEquals(matches, 2);
    }

    @Test
    public void givenText_whenMatchesWithDotMetach_thenCorrect() {
        int matches = runTest(".", "foo");

        assertTrue(matches > 0);
    }

    @Test
    public void givenORSet_whenMatchesAny_thenCorrect() {
        int matches = runTest("[abc]", "b");

        assertEquals(matches, 1);
        assertEquals(runTest("[abc]", "bc"), 2);
        assertEquals(runTest("[abc]", "dbc"), 2);
    }

    @Test
    public void givenORSet_whenMatchesAllCombinations_thenCorrect() {
        int matches = runTest("[bcr]at", "bat cat rat");

        assertEquals(matches, 3);
    }

    @Test
    public void givenNORSet_whenMatchesNon_thenCorrect() {
        int matches = runTest("[^abc]", "g");

        assertTrue(matches > 0);
    }

    @Test
    public void givenNORSet_whenMatchesAllExceptElements_thenCorrect() {
        int matches = runTest("[^bcr]at", "sat mat eat");

        assertTrue(matches > 0);
    }

    @Test
    public void givenUpperCaseRange_whenMatchesUpperCase_thenCorrect() {
        int matches = runTest(
                "[A-Z]", "Two Uppercase alphabets 34 overall");

        assertEquals(matches, 2);
    }

    @Test
    public void givenLowerCaseRange_whenMatchesLowerCase_thenCorrect() {
        int matches = runTest(
                "[a-z]", "Two Uppercase alphabets 34 overall");

        assertEquals(matches, 26);
    }

    @Test
    public void givenTwoSets_whenMatchesUnion_thenCorrect() {
        int matches = runTest("[1-3[7-9]]", "123456789");

        assertEquals(matches, 6);
    }

    @Test
    public void givenTwoSets_whenMatchesIntersection_thenCorrect() {
        int matches = runTest("[1-6&&[3-9]]", "123456789");

        assertEquals(matches, 4);
    }

    @Test
    public void givenSetWithSubtraction_whenMatchesAccurately_thenCorrect() {
        int matches = runTest("[0-9&&[^2468]]", "123456789");

        assertEquals(matches, 5);
    }

    @Test
    public void givenDigits_whenMatches_thenCorrect() {
        int matches = runTest("\\d", "123");

        assertEquals(matches, 3);
    }

    @Test
    public void givenNonDigits_whenMatches_thenCorrect() {
        int mathces = runTest("\\D", "a6c");

        assertEquals(mathces, 2);
    }

    @Test
    public void givenWhiteSpace_whenMatches_thenCorrect() {
        int matches = runTest("\\s", "a c");

        assertEquals(matches, 1);
    }

    @Test
    public void givenNonWhiteSpace_whenMatches_thenCorrect() {
        int matches = runTest("\\S", "a c");

        assertEquals(matches, 2);
    }

    @Test
    public void givenWordCharacter_whenMatches_thenCorrect() {
        int matches = runTest("\\w", "hi!");

        assertEquals(matches, 2);
    }

    @Test
    public void givenNonWordCharacter_whenMatches_thenCorrect() {
        int matches = runTest("\\W", "hi!");

        assertEquals(matches, 1);
    }

    @Test
    public void givenZeroOrOneQuantifier_whenMatches_thenCorrect() {
        int matches = runTest("\\a?", "hi");

        assertEquals(matches, 3);
    }

    @Test
    public void givenZeroOrOneQuantifier_whenMatches_thenCorrect2() {
        int matches = runTest("\\a{0,1}", "hi");

        assertEquals(matches, 3);
    }

    @Test
    public void givenBraceQuantifier_whenFailsToMatch_thenCorrect() {
        int matches = runTest("a{3}", "aa");
        assertFalse(matches > 0);
        assertEquals(matches, 0);
    }

    @Test
    public void givenBraceQuantifierWithRange_whenMatches_thenCorrect() {
        int matches = runTest("a{2,3}", "aaaa");

        assertEquals(matches, 1);
    }

    @Test
    public void givenBraceQuantifierWithRange_whenMatchesLazily_thenCorrect() {
        int matches = runTest("a{2,3}?", "aaaa");

        assertEquals(matches, 2);
    }

    @Test
    public void givenCapturingGroup_whenMatches_thenCorrect() {
        int matches = runTest("(\\d\\d)", "12");

        assertEquals(matches, 1);
    }

    @Test
    public void givenCapturingGroup_whenMatches_thenCorrect2() {
        int matches = runTest("(\\d\\d)", "1212");

        assertEquals(matches, 2);
    }
}
