package sda.covidrestrictions.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main<numberOfTypeOfBusiness> {

    public static void main(String[] args) {
        BusinessType.welcomeMessageToUser();
        List<String> corporateBusinessType = new ArrayList<>();
        corporateBusinessType.add("Retail");
        corporateBusinessType.add("Catering");
        corporateBusinessType.add("Services");
        corporateBusinessType.add("Events");
        for (int i = 0; i < corporateBusinessType.size(); i++) {
            System.out.println(( i + 1 ) + " - " + corporateBusinessType.get(i) + ";");
        }
        System.out.println("Please put number of your business type here:");
        Scanner scanner = new Scanner(System.in);
        int numberOfTypeOfBusiness = scanner.nextInt();
        if (numberOfTypeOfBusiness > corporateBusinessType.size()) {
            System.out.println("Sorry, you have entered number out of scope");
        } else System.out.printf("Since you are representative of %s business, please answer following questions: ",
                corporateBusinessType.get(numberOfTypeOfBusiness - 1));
        System.out.println("_______________");


        switch (numberOfTypeOfBusiness) {
            case 1:
                Retail.messageToCustomer();
                Retail.getProductsList();
                Retail.messageAccordingToProductGroup();
                Retail.getNumberOfPeople();
                break;
            case 2:
                System.out.println("Catering");
                break;
            case 3:
                System.out.println("Services");
                break;
            case 4:
                System.out.println("Events");
                break;


        }
    }
}










