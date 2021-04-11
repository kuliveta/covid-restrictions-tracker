package sda.covidrestrictions.tracker;

import javax.swing.*;
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

        if (insideOutsideService == 1) {
            chooseInsideServices();
        }
        if (insideOutsideService == 2) {
            chooseOutsideServices();
        }
    }

    public static void chooseInsideServices() {
        Scanner scanner = new Scanner(System.in);
        serviceListInside.add("Hairdresser");
        serviceListInside.add("Manicure");
        serviceListInside.add("Pedicure");
        serviceListInside.add("Podiatrist");
        serviceListInside.add("Other services Inside");
        for (int i = 0; i < serviceListInside.size(); i++) {
            System.out.println((i + 1) + " - " + serviceListInside.get(i) + ";");
        }
        while (numberOfInsideService > serviceListInside.size() || numberOfInsideService < 1) {
            System.out.println("Please choose the number of the service - next to the option you choose :");
            numberOfInsideService = scanner.nextInt();
        }

        if (numberOfInsideService < serviceListInside.size()) {
            serviceInsideIsAllowed();
            General.getAllowedNumberOfPeople();
        } else {
            serviceInsideIsNotAllowed();
        }

    }

    public static void chooseOutsideServices() {
        Scanner scanner = new Scanner(System.in);
        serviceListOutside.add("Individual photo-services Outside");
        serviceListOutside.add("Other services Outside");

        for (int i = 0; i < serviceListOutside.size(); i++) {
            System.out.println((i + 1) + " - " + serviceListOutside.get(i) + ";");
        }
        while (numberOfOutsideService > serviceListOutside.size() || numberOfOutsideService < 1) {
            System.out.println("Please choose the number of the service - next to the option you choose :");
            numberOfOutsideService = scanner.nextInt();
        }
        //System.out.println("The size of serviceListOutside is: " + serviceListOutside.size());

        if (numberOfOutsideService == 1) {
            serviceOutsideIsAllowed();
        } else {
            serviceOutsideIsNOTAllowed();

        }
    }

    public static void getInsideOutsideServices() {

        Scanner scanner = new Scanner(System.in);

        while (insideOutsideService > 2 || insideOutsideService < 1) {
            System.out.println("Please enter 1 - if you want to provide services inside, and 2 - if you want provide services Outside:");
            insideOutsideService = scanner.nextInt();
        }
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
}