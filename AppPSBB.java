package com.enigma.nawadata_logic_test;

import com.enigma.nawadata_logic_test.constant.Constant;
import com.enigma.nawadata_logic_test.constant.Message;
import com.enigma.nawadata_logic_test.utils.InputUtil;

public class AppPSBB {
    public static void run()
    {
        startingApp();
    }
    public static void startingApp() {
        createLine();
        Integer[] numberOfFamilyMembers;
        Integer numberOfFamily;
        int maxMembersPerBus = 4;
        int maxFamiliesPerBus = 2;
        while (true) {
            numberOfFamily = InputUtil.inputInt(Constant.APP_INPUT_NUMBER_OF_FAMILY);
            String numberOfFamilyMember = InputUtil.inputStringNumber(Constant.APP_INPUT_NUMBER_OF_FAMILY_MEMBER);
            numberOfFamilyMembers = validateAndSplit(numberOfFamilyMember);

            if (numberOfFamilyMembers != null && numberOfFamilyMembers.length == numberOfFamily) {
                int totalMembers = 0;
                for (Integer members : numberOfFamilyMembers) {
                    totalMembers += members;
                }

                int busesNeededByMembers = (int) Math.ceil((double) totalMembers / maxMembersPerBus);
                int busesNeededByFamilies = (int) Math.ceil((double) numberOfFamily / maxFamiliesPerBus);

                int totalBusesNeeded = Math.max(busesNeededByMembers, busesNeededByFamilies);
                System.out.println("Minimum bus required is: " + totalBusesNeeded);
                break;
            } else {
                System.out.println("Input must be equal with count of family.");
            }
        }
        createLine();
    }

    public static Integer[] validateAndSplit(String input)
    {
        String[] parts = input.split(" ");
        Integer[] result = new Integer[parts.length];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }

        if(result.length == 0) {
            System.out.println(Message.INPUT_IS_EMPTY);
            return null;
        }
        return result;
    }


    public static void createLine()
    {
        System.out.println(Constant.LINE);
    }
}
