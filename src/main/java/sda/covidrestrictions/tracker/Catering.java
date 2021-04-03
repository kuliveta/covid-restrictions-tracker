package sda.covidrestrictions.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catering {

    static int numberOfPeople = 1;
    static int allowedSqMetersPerPerson = 25;
    static int numberOfProductType;

    static List<String> allowedFunctions = new ArrayList<>();

    public static void messageToCateringCustomer (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose one of the options: ");}

        /*public static void DiningOptions (){
            List<String> allowedFunctions = new ArrayList<>();
            allowedFunctions.add("Outdoors");
            allowedFunctions.add("Indoors");
            for (int i = 0; i < allowedFunctions.size() ; i++) {
                System.out.println((i+1)+" - " + allowedFunctions.get(i) + ";");
            }}
       */

    public static void productListCatering(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose one of dining options: ");
        List<String> allowedFunctions = new ArrayList<>();
        allowedFunctions.add("Eat in");
        allowedFunctions.add("Take away");
        for (int i = 0; i < allowedFunctions.size() ; i++) {
            System.out.println((i+1)+" - " + allowedFunctions.get(i) + ";");}}

    public static void messageAccordingToGroup(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number next to the dining option to confirm your decision:");
        numberOfProductType = scanner.nextInt();
        if(numberOfProductType == allowedFunctions.size()) {
            System.out.println("Sorry, selling of those products in person currently is not allowed.");
            System.exit(0);}
        else System.out.println("Retail business selling those products is allowed to operate if are met the following " +
                "\"square meter per person\" guidelines");
    }

    public static void getNumberOfPeopleInside() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the size of your premises used for customer service in square meters: ");
        int sizeOfPremises = scanner.nextInt();
        if (sizeOfPremises > 49) numberOfPeople = sizeOfPremises / allowedSqMetersPerPerson;
        System.out.println("Allowed number of customers in your shop is : " + numberOfPeople);

}}
