package com.enigma.nawadata_logic_test.utils;

import com.enigma.nawadata_logic_test.constant.Message;

import java.util.Scanner;

public class InputUtil {
    public static String inputString(String message) {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.printf("%s: ", message);
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println(Message.INPUT_IS_EMPTY);
                continue;
            }

            if(!input.matches("^[a-zA-Z\\s]+$")) {
                System.out.println(Message.INPUT_MUST_BE_LETTER);
                continue;
            }
            return input;
        }
    }

    public static String inputStringNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.printf("%s: ", message);
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println(Message.INPUT_IS_EMPTY);
                continue;
            }
            return input;
        }
    }
    public static Integer inputInt(String message) {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.printf("%s: ", message);
            Integer input = scanner.nextInt();
            scanner.nextLine();
            if (input.toString().isEmpty()) {
                System.out.println(Message.INPUT_IS_EMPTY);
                continue;
            }

            if(!input.toString().matches("^[0-9]+$")) {
                System.out.println(Message.INPUT_MUST_BE_NUMBER);
                continue;
            }
            return input;
        }
    }
}
