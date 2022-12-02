package com.test.generallogic;

import com.test.dto.Top10Char;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class CharLogicTest {

    @Test
    public void testGetTotalCharacterCount() {
        String input = "Helloo1";
        int result = CharLogic.getTotalCharacterCount(input);
        assertEquals(input.length(), result);
    }

    @Test
    public void testGetTotalAmountOfDigits() {
        String input = "Helloo1";
        long expResult = 1L;
        long result = CharLogic.getTotalAmountOfDigits(input);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAmountOfAlphaChars() {
        String input = "Helloo1";
        long expResult = 7L;
        long result = CharLogic.getAmountOfAlphaChars(input);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAmountOfUppercaseAlpha() {
        String input = "Helloo1";
        long expResult = 1L;
        long result = CharLogic.getAmountOfUppercaseAlpha(input);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAmountOfLowercaseAlpha() {
        String input = "Helloo1";
        long expResult = 5L;
        long result = CharLogic.getAmountOfLowercaseAlpha(input);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAmountOfWhiteSpace() {
        String input = "Hell oo1";
        long expResult = 1L;
        long result = CharLogic.getAmountOfWhiteSpace(input);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAmountOfPunctuationChars() {
        String input = "He,ll;oo-1";
        long expResult = 3L;
        long result = CharLogic.getAmountOfPunctuationChars(input);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTotalWordCount() {
        String input = "Hell oo1";
        long expResult = 2L;
        long result = CharLogic.getTotalWordCount(input);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTop10CharsHas3RepeatedChars() {
        String input = "Heelloo123";
        List<Top10Char> expResult = null;
        List<Top10Char> result = CharLogic.getTop10Chars(input);
        assertEquals(7, result.size());

        assertEquals('e', result.get(0).getCharacter());
        assertEquals(2, result.get(0).getCount());
        assertNotSame(0, result.get(0).getPercentage());

        assertEquals('l', result.get(1).getCharacter());
        assertEquals(2, result.get(1).getCount());
        assertNotSame(0, result.get(1).getPercentage());

        assertEquals('o', result.get(2).getCharacter());
        assertNotSame(0, result.get(2).getPercentage());
        assertEquals(2, result.get(2).getCount());
    }
}
