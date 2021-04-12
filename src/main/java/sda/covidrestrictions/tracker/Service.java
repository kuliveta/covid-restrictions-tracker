package sda.covidrestrictions.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    static int insideOutsideService = 0;
    static int numberOfInsideService = 0;
    static int numberOfOutsideService = 0;
    static List<String> serviceListInside = new ArrayList<>();
    static List<String> serviceListOutside = new ArrayList<>();

    public static void restrictionsToServices() {

        getInsideOutsideServices();
        messageToUserAccordingToServiceType();


    }

    public static void messageToUserAccordingToServiceType() {

        if (insideOutsideService == 1) {
            chooseInsideServices();
        } else if (insideOutsideService == 2) {
            chooseOutsideServices();
        } else
            ifToTryOneMoreTime();
    }

    public static void chooseInsideServices() {
        printLisOfInsideServices();
        printMessageForInsideServices();

    }

    private static void printLisOfInsideServices() {

        System.out.println("Please choose one number of provided services below:");
        Scanner scanner = new Scanner(System.in);
        serviceListInside.add("Hairdresser");
        serviceListInside.add("Manicure");
        serviceListInside.add("Pedicure");
        serviceListInside.add("Podiatrist");
        serviceListInside.add("Other services inside");
        for (int i = 0; i < serviceListInside.size(); i++) {
            System.out.println(( i + 1 ) + " - " + serviceListInside.get(i) + ";");
        }
    }

    private static void printMessageForInsideServices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number according to your inside service type here:");
        numberOfInsideService = scanner.nextInt();

        if (numberOfInsideService == serviceListInside.size()) {
            serviceInsideIsNotAllowed();
        }
        if (numberOfInsideService > serviceListInside.size() || numberOfInsideService == 0) {
            ifToTryOneMoreTimeInside();General.thanksForUsing();
        } else serviceInsideIsAllowed();


    }

    public static void chooseOutsideServices() {
        printListOfOutsideServices();
        messageAccordingToOutsideServices();
    }

    private static void printListOfOutsideServices() {
        System.out.println("Please choose the number of the service - next to the option you choose :");
        Scanner scanner = new Scanner(System.in);
        serviceListOutside.add("Individual photo-services outside");
        serviceListOutside.add("Other services outside");

        for (int i = 0; i < serviceListOutside.size(); i++) {
            System.out.println(( i + 1 ) + " - " + serviceListOutside.get(i) + ";");
        }
    }

    private static void messageAccordingToOutsideServices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number according to your outside service type here :");
        numberOfOutsideService = scanner.nextInt();

        if (numberOfOutsideService == 1) {
            serviceOutsideIsAllowed();
        } else if (numberOfOutsideService == 2) {
            serviceOutsideIsNOTAllowed();
        } else
            ifToTryOneMoreTimeOutside();
    }


    public static void getInsideOutsideServices() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter:\n 1 - if you want to provide services inside;\n 2 - if you want provide services outside:");
        insideOutsideService = scanner.nextInt();
    }


    public static void serviceInsideIsAllowed() {
        System.out.println("Hi, this inside service <" + serviceListInside.get(numberOfInsideService - 1) + "> is allowed!");
    }

    public static void serviceInsideIsNotAllowed() {
        System.out.println("Sorry, currently <" + serviceListInside.get(numberOfInsideService - 1) + "> are not allowed.");
    }

    public static void serviceOutsideIsAllowed() {
        System.out.println("Hi, this outside service <" + serviceListOutside.get(numberOfOutsideService - 1) + "> is allowed!");
    }

    public static void serviceOutsideIsNOTAllowed() {
        System.out.println("Sorry, currently <" + serviceListOutside.get(numberOfOutsideService - 1) + "> are not allowed.");
    }

    public static void ifToTryOneMoreTime() {
        System.out.println("Sorry number you put is out of provided scope.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to check another option? Yes or No?");
        String tryOneMoreTime = scanner.next();
        if (tryOneMoreTime.equalsIgnoreCase("yes")) restrictionsToServices();
        else General.thanksForUsing();
        System.exit(0);
    }

    public static void ifToTryOneMoreTimeInside() {
        System.out.println("Sorry number you put is out of provided scope.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to check another option? Yes or No?");
        String tryOneMoreTimeInside = scanner.next();
        if (tryOneMoreTimeInside.equalsIgnoreCase("yes")) {
            printMessageForInsideServices();
            General.legalDisclaimer();
            General.thanksForUsing();
        } else General.thanksForUsing();
        System.exit(0);
    }

    public static void ifToTryOneMoreTimeOutside() {
        System.out.println("Sorry number you put is out of provided scope.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to check another option? Yes or No?");
        String tryOneMoreTimeOutside = scanner.next();
        if (tryOneMoreTimeOutside.equalsIgnoreCase("yes")) {
            messageAccordingToOutsideServices();
            General.legalDisclaimer();
            General.thanksForUsing();
        } else General.thanksForUsing();
        System.exit(0);
    }

}

