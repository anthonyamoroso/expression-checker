package com.anthonyamoroso.kata;

import java.util.Objects;
import java.util.Stack;

public class Checker implements CheckerApi {

    private static final Character OPENING_BRACKET = '[';
    private static final Character OPENING_PARENTHESIS = '(';
    private static final Character CLOSING_BRACKET = ']';
    private static final Character CLOSING_PARENTHESIS = ')';

    @Override
    public boolean check(String expression) {
        Stack<Character> delimiters = new Stack<>();
        for (Character character : expression.toCharArray()) {
            if (isOpenningDelimiter(character)) {
                delimiters.add(character);
            } else if (isClosingDelimiter(character)) {
                if (delimiters.isEmpty() || wrongClosingDelimiter(character, delimiters.peek())) {
                    return false;
                }
                delimiters.pop();
            }
        }
        return delimiters.isEmpty();
    }

    private boolean wrongClosingDelimiter(Character closingDelimiter, Character openingDelimiter) {
        boolean matchedDelimiter = closingDelimiter.equals(CLOSING_BRACKET) && Objects.equals(openingDelimiter, OPENING_BRACKET) || closingDelimiter.equals(CLOSING_PARENTHESIS) && Objects.equals(openingDelimiter, OPENING_PARENTHESIS);
        return !matchedDelimiter;
    }

    private boolean isClosingDelimiter(Character character) {
        return character.equals(CLOSING_BRACKET) || character.equals(CLOSING_PARENTHESIS);
    }

    private boolean isOpenningDelimiter(Character character) {
        return character.equals(OPENING_BRACKET) || character.equals(OPENING_PARENTHESIS);
    }
}