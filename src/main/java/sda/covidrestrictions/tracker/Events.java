package sda.covidrestrictions.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Events {
    static int numberOfEventType;
    static String allowanceStatusInside = "Not allowed";
    static String allowanceStatusOutside = "Not allowed";


    public static void restrictionsForEvents() {
        getPlaceOfEvent();
        messageToUserAccordingToEventType();
    }


    private static void getPlaceOfEvent() {
        System.out.println("Please choose where event will be held. For INSIDE type number 1,\n" +
                " for OUTSIDE type number 2: ");
        Scanner scanner = new Scanner(System.in);
        numberOfEventType = scanner.nextInt();
    }

    public static void messageToUserAccordingToEventType() {

        if (numberOfEventType == 1) {
            checkCurrentStatusInside();
        } else if (numberOfEventType == 2) {
            checkCurrentStatusOutside();
        } else System.out.println("Sorry, the number you entered is out of range. Please, enter correct number!");
    }


    public static void checkCurrentStatusInside() {
        if (allowanceStatusInside.equalsIgnoreCase("not allowed")) {
            insideEventsNotAllowed();
        } else {
            insideEventsAllowed();
        }
    }

    public static void checkCurrentStatusOutside() {
        if (allowanceStatusOutside.equalsIgnoreCase("not allowed")) {
            outsideEventsNotAllowed();
        } else {
            outsideEventsAllowed();
        }
    }

    public static void insideEventsNotAllowed() {
        System.out.println("Sorry, currently events inside are not allowed.");
    }

    public static void outsideEventsNotAllowed() {
        System.out.println("Sorry, currently events outside are not allowed.");
    }

    public static void insideEventsAllowed() {
        List<String> activityTypeInside = new ArrayList<>();
        activityTypeInside.add("Theater");
        activityTypeInside.add("Cinema");
        activityTypeInside.add("Sports");
        for (int i = 0; i < activityTypeInside.size(); i++) {
            System.out.println(( i + 1 ) + " - " + activityTypeInside.get(i) + ";");
        }
        System.out.println("Please choose number next to your type of the event");
        Scanner scanner = new Scanner(System.in);
        int typeOfInsideEvent = scanner.nextInt();
    }

    public static void outsideEventsAllowed() {
        List<String> activityTypeOutside = new ArrayList<>();
        activityTypeOutside.add("Concert");
        activityTypeOutside.add("Sports");
        for (int i = 0; i < activityTypeOutside.size(); i++) {
            System.out.println(( i + 1 ) + " - " + activityTypeOutside.get(i) + ";");
        }
        System.out.println("Please choose number next to your type of the event");
        Scanner scanner = new Scanner(System.in);
        int typeOfOutsideEvent = scanner.nextInt();
        General.getAllowedNumberOfPeople();
        getLengthOfEvent();
    }


    public static void getLengthOfEvent() {
        System.out.println("Please indicate length of your event in hours");
        List<Double> lengthOfEvent = new ArrayList<>();
        lengthOfEvent.add(0.5);
        lengthOfEvent.add(1.0);
        lengthOfEvent.add(1.5);
        lengthOfEvent.add(2.0);
        for (int i = 0; i < lengthOfEvent.size(); i++) {
            System.out.println(( i + 1 ) + " - " + lengthOfEvent.get(i) + ";");
        }
        Scanner scanner = new Scanner(System.in);
        int choosenLength = scanner.nextInt();
        if (choosenLength >= lengthOfEvent.size() - 1) {
            System.out.println("warning text");
            if (choosenLength == lengthOfEvent.size() - 2) {
                System.out.println("warning text");
            }

        }

    }
}
