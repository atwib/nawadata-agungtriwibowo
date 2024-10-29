package com.enigma.nawadata_logic_test.service.impl;

import com.enigma.nawadata_logic_test.constant.LetterType;
import com.enigma.nawadata_logic_test.service.ProcessService;
import com.enigma.nawadata_logic_test.utils.SortUtils;

import java.util.ArrayList;
import java.util.List;

public class ProcessServiceImpl implements ProcessService {
    @Override
    public String consonant(String input) {
        String s = input.replaceAll(" ", "").toLowerCase();
        List<Character> output = filter(s, LetterType.CONSONANT);
        SortUtils.bubbleSortAlphabetic(output);
        return charListToString(output);
    }

    @Override
    public String vowel(String input) {
        String s = input.replaceAll(" ", "").toLowerCase();
        List<Character> output = filter(s, LetterType.VOWEL);
        SortUtils.bubbleSortAlphabetic(output);
        return charListToString(output);
    }

    public static List<Character> filter(String input, LetterType letterType) {
        List<Character> vowelChar = List.of('a','i','u','e','o');
        List<Character> output = new ArrayList<>();
        for (char ch : input.toCharArray()) {
            if(letterType == LetterType.VOWEL && vowelChar.contains(ch)) {
                output.add(ch);
            } else if(letterType == LetterType.CONSONANT && !vowelChar.contains(ch)) {
                output.add(ch);
            }
        }
        return output;
    }

    public static String charListToString(List<Character> charList) {
        String result = "";
        for (Character ch : charList) {
            result += ch;
        }
        return result;
    }
}
