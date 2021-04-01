package sda.covidrestrictions.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusinessType {
    int numberOfTypeOfBusiness;
    public static void welcomeMessageToUser() {
        System.out.println("Dear user of Covid restrictions tracker, please enter the number that corresponds to your business type");
    }
    public static void getUserInput() {
        System.out.println("Number of your business type is:");
        Scanner scanner = new Scanner(System.in);
        int numberOfTypeOfBusiness = scanner.nextInt();
    }}

        /*for (int i = 0; i < corporateBusinessType.size(); i++) {
            System.out.println(( i + 1 ) + " - " + corporateBusinessType.get(i) + ";");

        }
        System.out.println("Number of your business type is:");
        Scanner scanner = new Scanner(System.in);
        numberOfTypeOfBusiness = scanner.nextInt();
        if (numberOfTypeOfBusiness > corporateBusinessType.size()) {
            System.out.println("Sorry, you have entered number out of scope");
        } else System.out.printf("Since you are representative of %s business, please answer following questions: ",
                corporateBusinessType.get(numberOfTypeOfBusiness - 1));
        System.out.println("_______________");

    }

    public static String chooseBusinessType(int businessType,List<String> corporateBusinessType) {
        int businessIndex = businessType-1;
        return corporateBusinessType.get(businessIndex);
    }



}*/


