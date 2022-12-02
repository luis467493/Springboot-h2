package com.test.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Output {

    private int totalChars;
    private long totalNumericChars;
    private long totalAlphaChars;
    private long totalUppercaseAlphaChars;
    private long totalLowercaseAlphaChars;
    private long totalWhiteSpace;
    private long totalPunctuationSpace;
    private long totalWords;
    private List<Top10Char> top10 = new ArrayList<>();
}
