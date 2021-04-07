package sda.covidrestrictions.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catering {

    public static void restrictionsToCatering() {
        System.out.println("Please choose one of dining options: ");
        List<String> allowedFunctions = new ArrayList<>();
        allowedFunctions.add("Eat in");
        allowedFunctions.add("Serving clients outside on terraces");
        allowedFunctions.add("Take away");
        for (int i = 0; i < allowedFunctions.size(); i++) {
            System.out.println(( i + 1 ) + " - " + allowedFunctions.get(i) + ";");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number next to the dining option to confirm your decision:");
        int numberOfDiningType = scanner.nextInt();
        if (numberOfDiningType == allowedFunctions.size() - ( allowedFunctions.size() - 1 )) {
            System.out.println("Sorry, at this moment you can not serve customers inside");
            System.exit(0);
        } else if (numberOfDiningType == allowedFunctions.size() - ( allowedFunctions.size() - 2 )) {
            System.out.println("Sorry, at this moment you can not serve customers outside, but please check our" +
                    " application in a few days since we are expecting changes here");
            System.exit(0);
        } else if (numberOfDiningType > allowedFunctions.size()) {
            System.out.println("Sorry, you have entered number out of provided functions scope");
            ifToTryOneMoreTime();
        } else {
            System.out.println("You can provide takeaway service strictly following " +
                    "\"square meter per person\" guidelines");
            General.getAllowedNumberOfPeople();
        }
    }


    public static void ifToTryOneMoreTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to check another option? Yes or No?");
        String tryOneMoreTime = scanner.next();
        if (tryOneMoreTime.equalsIgnoreCase("yes")) restrictionsToCatering();
        else System.exit(0);
    }


}
