package sda.covidrestrictions.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusinessType {
    public static void getBusinessType() {
        int numberOfTypeOfBusiness;

        System.out.println("Dear user of Covid tracker please enter number belonging to your business type");
        List<String> corporateBusinessType = new ArrayList<>();
        corporateBusinessType.add("Retail");
        corporateBusinessType.add("Catering");
        corporateBusinessType.add("Services");
        corporateBusinessType.add("Events");
        for (int i = 0; i < corporateBusinessType.size(); i++) {
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

}


