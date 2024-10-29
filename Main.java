package com.enigma.nawadata_logic_test;

import com.enigma.nawadata_logic_test.constant.Constant;
import com.enigma.nawadata_logic_test.constant.Message;
import com.enigma.nawadata_logic_test.utils.InputUtil;

public class Main {

    public static void main(String[] args) {
        while (true)
        {
            showMenu();
            int input = InputUtil.inputInt(Constant.APP_INPUT_YOUR_CHOICE);
            switch (input) {
                case 1:
                    AppSortCharacter.run();
                    break;
                case 2:
                    AppPSBB.run();
                    break;
                case 3:
                    System.out.println(Constant.APP_EXIT);
                    return;
                default:
                    System.out.println(Message.INPUT_NOT_FOUND);
                    break;
            }
            if(!tryAgain()) {
                System.out.println(Constant.APP_EXIT);
                return;
            }
        }
    }

    public static void showMenu()
    {
        System.out.println(Constant.LINE);
        System.out.println(Constant.APP_NAME);
        System.out.println(Constant.APP_CHOICE_SORT_CHARACTER);
        System.out.println(Constant.APP_CHOICE_PSBB);
        System.out.println(Constant.APP_CHOICE_EXIT);
        System.out.println(Constant.LINE);
    }

    public static boolean tryAgain()
    {
        while (true)  {
            String input = InputUtil.inputString(Constant.APP_TRY_AGAIN).toLowerCase();
            switch (input) {
                case "y":
                    return true;
                case "n":
                    return false;
                default:
                    System.out.println(Message.INPUT_NOT_FOUND);
                    break;
            }
        }
    }


}