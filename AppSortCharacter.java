package com.enigma.nawadata_logic_test;

import com.enigma.nawadata_logic_test.constant.Constant;
import com.enigma.nawadata_logic_test.service.ProcessService;
import com.enigma.nawadata_logic_test.service.impl.ProcessServiceImpl;
import com.enigma.nawadata_logic_test.utils.InputUtil;

public class AppSortCharacter {
    public static void run()
    {
        startingApp();
    }
    public static void startingApp()
    {
        createLine();
        ProcessService processService = new ProcessServiceImpl();
        String input = InputUtil.inputString(Constant.APP_INPUT_ONE_LINE);
        String consonant = processService.consonant(input);
        String vowel = processService.vowel(input);

        System.out.println(Constant.APP_VOWEL_CHARACTER);
        System.out.println(vowel);
        System.out.println(Constant.APP_CONSONANT_CHARACTER);
        System.out.println(consonant);
        createLine();
    }


    public static void createLine()
    {
        System.out.println(Constant.LINE);
    }
}
