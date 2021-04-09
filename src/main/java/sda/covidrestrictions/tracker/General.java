package sda.covidrestrictions.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class General {

    static int numberOfPeople = 1;
    static int allowedSqMetersPerPerson = 25;
    static List<String> corporateBusinessType = new ArrayList<>();


    public static void printOutBusinessTypeOptions(){
        corporateBusinessType.add("Retail");
        corporateBusinessType.add("Catering");
        corporateBusinessType.add("Services");
        corporateBusinessType.add("Events");
        for (int i = 0; i < corporateBusinessType.size(); i++) {
            System.out.println(( i + 1 ) + " - " + corporateBusinessType.get(i) + ";");
        }}

    public static void getInputAboutBusinessType(){
        System.out.println("Please, enter the number of your business type here:");
        Scanner scanner = new Scanner(System.in);
        int numberOfTypeOfBusiness = scanner.nextInt();
        if (numberOfTypeOfBusiness > corporateBusinessType.size()) {
            System.out.println("Sorry, the number you entered is out of scope");
        } else System.out.printf("Since you are representative of %s business, please answer the following questions: ",
                corporateBusinessType.get(numberOfTypeOfBusiness - 1));
        System.out.println("                     ");

        switch (numberOfTypeOfBusiness) {
            case 1: Retail.restrictionsToRetail();break;
            case 2: Catering.restrictionsToCatering();break;
            case 3: Service.restrictionsToServices();break;
            case 4: Events.restrictionsForEvents();break;
        } }


    public static void getAllowedNumberOfPeople() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the size of your premises square meters : ");
        double sizeOfPremises = scanner.nextDouble();
        if (sizeOfPremises > 49) numberOfPeople = (int) (sizeOfPremises / allowedSqMetersPerPerson);
        System.out.println("Allowed number of customers in your shop is : " + numberOfPeople);
    }

    public static void welcomeMessageToUser() {
        System.out.println("Hello! Welcome to our Covid restrictions tracker for corporate usage!\n" +
                "We hope our information will give more certainty on Government and Health Institutions" +
                "decisions to stop Covid 19 spreading in our country.\n " +
                "Please follow upcoming instructions! At first you should enter the number that corresponds to your business type");
    }


    public static void legalDisclaimer() { System.out.println("**************** \n Be responsible and follow the restrictions! \n * We do not take responsibility if any of " +
                "the rules have changed or do not comply with government decisions.");}
    public static void thanksForUsing() {
        System.out.println("**************** \nThank you for using our app!");
    }
}

