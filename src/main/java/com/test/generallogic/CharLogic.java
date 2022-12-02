package com.test.generallogic;

import com.test.dto.Top10Char;
import com.test.dto.TopChar;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class CharLogic {

    private static final char[] punctuationChars = new char[]{',', ';', '-', ':', '_'};

    public static int getTotalCharacterCount(String input) {
        return input.length();
    }

    public static long getTotalAmountOfDigits(String input) {
        return input.chars().mapToObj(e -> (char) e).
                filter(character -> Character.isDigit(character)).count();
    }

    public static long getAmountOfAlphaChars(String input) {
        return input.chars().mapToObj(e -> (char) e).
                filter(character -> Character.isDigit(character)
                || Character.isLetter(character)).count();
    }

    public static long getAmountOfUppercaseAlpha(String input) {
        return input.chars().mapToObj(e -> (char) e).
                filter(character -> Character.isUpperCase(character)).count();
    }

    public static long getAmountOfLowercaseAlpha(String input) {
        return input.chars().mapToObj(e -> (char) e).
                filter(character -> Character.isLowerCase(character)).count();
    }

    public static long getAmountOfWhiteSpace(String input) {
        return input.chars().mapToObj(e -> (char) e).
                filter(character -> Character.isWhitespace(character)).count();
    }

    private static List<Character> getPunctuationChars() {
        List<Character> punctChars = new ArrayList<>();
        for (int i = 0; i < punctuationChars.length; i++) {
            punctChars.add(punctuationChars[i]);
        }
        return punctChars;
    }

    public static long getAmountOfPunctuationChars(String input) {
        return input.chars().mapToObj(e -> (char) e).
                filter(character -> {
                    return getPunctuationChars().contains(character);
                }).count();
    }

    public static long getTotalWordCount(String input) {
        return input.split(" ").length;
    }

    public static List<Top10Char> getTop10Chars(String input) {
        Map<Character, Long> frequency = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<TopChar> top10CharList = new ArrayList<>();

        frequency.forEach((character, freq) -> {
            top10CharList.add(new TopChar(freq.intValue(), character));
        });

        List<TopChar> top10CharListSorted = top10CharList.stream().sorted((arg0, arg1) -> {
            return Integer.valueOf(arg1.getCount()).compareTo(arg0.getCount());
        }).collect(Collectors.toList());

        return top10CharListSorted.stream().map((topChar) -> {
            return new Top10Char(topChar.getCount(),
                    (topChar.getCount() * 1.0) / input.length(),
                    topChar.getCharacter());
        }).collect(Collectors.toList());
    }
}
