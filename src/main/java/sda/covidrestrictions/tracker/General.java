package sda.covidrestrictions.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class General {

    static int numberOfPeople = 1;
    static int allowedSqMetersPerPerson = 25;

    public static void getAllowedNumberOfPeople() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the size of your premises square meters : ");
        double sizeOfPremises = scanner.nextDouble();
        if (sizeOfPremises > 49) numberOfPeople = (int) (sizeOfPremises / allowedSqMetersPerPerson);
        System.out.println("Allowed number of customers in your shop is : " + numberOfPeople);
    }

    public static void welcomeMessageToUser() {
        System.out.println("Dear user of Covid restrictions tracker, please enter the number that corresponds to your business type");
    }


    public static void legalDisclaimer() { System.out.println("**************** \n Be responsible and follow the restrictions! \n * We do not take responsibility if any of " +
                "the rules have changed or do not comply with government decisions.");}
    public static void thanksForUsing() {
        System.out.println("**************** \nThank you for using our app!");
    }
}

