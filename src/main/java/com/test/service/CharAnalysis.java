package com.test.service;

import com.test.dto.Input;
import com.test.dto.Output;
import com.test.generallogic.CharLogic;
import org.springframework.stereotype.Service;

@Service
public class CharAnalysis {

    public Output analyseChar(Input input) {
        Output output = new Output();
        output.setTotalChars(CharLogic.getTotalCharacterCount(input.getText()));
        output.setTotalNumericChars(CharLogic.getTotalAmountOfDigits(input.getText()));
        output.setTotalAlphaChars(CharLogic.getAmountOfAlphaChars(input.getText()));
        output.setTotalUppercaseAlphaChars(CharLogic.getAmountOfUppercaseAlpha(input.getText()));
        output.setTotalLowercaseAlphaChars(CharLogic.getAmountOfLowercaseAlpha(input.getText()));
        output.setTotalWhiteSpace(CharLogic.getAmountOfWhiteSpace(input.getText()));
        output.setTotalPunctuationSpace(CharLogic.getAmountOfPunctuationChars(input.getText()));
        output.setTotalWords(CharLogic.getTotalWordCount(input.getText()));
        output.setTop10(CharLogic.getTop10Chars(input.getText()));
        return output;
    }
}
