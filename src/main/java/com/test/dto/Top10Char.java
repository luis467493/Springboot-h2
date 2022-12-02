package com.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Top10Char {

    private int count;
    private double percentage;
    private char character;
}
