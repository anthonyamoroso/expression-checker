package com.anthonyamoroso.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckerTest {

    private final Checker checker = new Checker();

    @Test
    void check_should_return_true() {
        // Given
        String expression = "([(aaa([dcdec[cfvg]bgbgb]bgbgb)bggb)k])";

        // When // Then
        assertTrue(checker.check(expression));
    }

    @Test
    void check_should_return_false() {
        // Given
        String expression = "((aaa([dcdec[cfvg]bgbgb]bgbgbbggb)";

        // When // Then
        assertFalse(checker.check(expression));
    }

}