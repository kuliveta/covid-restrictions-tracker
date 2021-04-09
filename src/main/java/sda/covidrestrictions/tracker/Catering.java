package sda.covidrestrictions.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catering {
    static List<String> cateringFunctions = new ArrayList<>();


    public static void restrictionsToCatering() {
        printListOfCateringOptions();
        printRestrictionsAccordingToType();
    }


    private static void printListOfCateringOptions() {
        System.out.println("Please choose one of dining options: ");
        cateringFunctions.add("Eat in");
        cateringFunctions.add("Serving clients outside on terraces");
        cateringFunctions.add("Take away");
        for (int i = 0; i < cateringFunctions.size(); i++) {
            System.out.println(( i + 1 ) + " - " + cateringFunctions.get(i) + ";");
        }
    }

    private static void printRestrictionsAccordingToType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number next to your main product group:");
        int numberOfDiningType = scanner.nextInt();
        if (numberOfDiningType == cateringFunctions.size() - ( cateringFunctions.size() - 1 )) {
            System.out.println("Sorry, at this moment you can not serve customers inside");

        } else if (numberOfDiningType == cateringFunctions.size() - ( cateringFunctions.size() - 2 )) {
            messageToCateringOutside();
        } else if (numberOfDiningType > cateringFunctions.size()) {
            messageAboutWrongNumber();

        } else {
            messageToTakeAwayServices();

        }
    }

    private static void messageToCateringInside() {
        System.out.println("Sorry, at this moment you can not serve customers inside");

    }

    private static void messageToCateringOutside() {
        System.out.println("Sorry, at this moment you can not serve customers outside, but please check our" +
                " application in a few days since we are expecting changes here");

    }

    private static void messageToTakeAwayServices() {
        System.out.println("You can provide takeaway service strictly following " +
                "\"square meter per person\" guidelines");
        General.getAllowedNumberOfPeople();
    }

    private static void messageAboutWrongNumber() {
        System.out.println("Sorry, you have entered number out of provided functions scope");
        ifToTryOneMoreTime();
    }

    public static void ifToTryOneMoreTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to check another option? Yes or No?");
        String tryOneMoreTime = scanner.next();
        if (tryOneMoreTime.equalsIgnoreCase("yes")) restrictionsToCatering();
        else System.exit(0);
    }


}
