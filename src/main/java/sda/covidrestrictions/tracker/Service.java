package sda.covidrestrictions.tracker;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

    public static void restrictionsToServices() {
        int insideOutsideService = 0;
        int numberOfInsideService = 0;
        int numberOfOutsideService = 0;

        Scanner scanner = new Scanner(System.in);
        while (insideOutsideService > 2 || insideOutsideService < 1) {
            System.out.println("Please enter 1 - if you want to provide services inside, and 2 - if you want provide services Outside:");
            insideOutsideService = scanner.nextInt();
        }
        if (insideOutsideService == 1) {
            List<String> serviceListInside = new ArrayList<>();
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
                System.out.println("Hi, this inside service <" + serviceListInside.get(numberOfInsideService - 1) + "> is allowed!");
                General.getAllowedNumberOfPeople();
            } else {
                System.out.println("Sorry, currently <" + serviceListInside.get(numberOfInsideService - 1) + "> are not allowed.");
            }

        }
        if (insideOutsideService == 2) {
            List<String> serviceListOutside = new ArrayList<>();
            serviceListOutside.add("Individual photo-services Outside");
            serviceListOutside.add("Other services Outside");

            for (int i = 0; i < serviceListOutside.size(); i++) {
                System.out.println(( i + 1 ) + " - " + serviceListOutside.get(i) + ";");
            }
            while (numberOfOutsideService > serviceListOutside.size() || numberOfOutsideService < 1) {
                System.out.println("Please choose the number of the service - next to the option you choose :");
                numberOfOutsideService = scanner.nextInt();
            }
            //System.out.println("The size of serviceListOutside is: " + serviceListOutside.size());

            if (numberOfOutsideService == 1) {
                System.out.println("Hi, this outside service <" + serviceListOutside.get(numberOfOutsideService - 1) + "> is allowed!");
            } else {

                System.out.println("Sorry, currently <" + serviceListOutside.get(numberOfOutsideService - 1) + "> are not allowed.");
            }


        }}}