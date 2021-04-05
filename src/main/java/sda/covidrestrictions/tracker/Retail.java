package sda.covidrestrictions.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Retail {

    static int numberOfPeople = 1;
    static int allowedSqMetersPerPerson = 25;
    static int numberOfProductType;
    String tryOneMoreTime;

        public static void messageToCustomer (){
        System.out.println("Please choose one of the product categories below " +
                "represented in your portfolio in amount which exceeds 70% : ");}

    public static void getProductsList() {

            List<String> allowedProducts = new ArrayList<>();
            allowedProducts.add("Food");
            allowedProducts.add("Pharmacy");
            allowedProducts.add("Animal products");
            allowedProducts.add("Gasoline services");
            allowedProducts.add("Hygienic products");
            allowedProducts.add("Optical products");
            allowedProducts.add("Flowers");
            allowedProducts.add("Bookstore");
            allowedProducts.add("Press sales");
            allowedProducts.add("Tobacco products and electronic smoking devices");
            allowedProducts.add("other products");

            for (int i = 0; i < allowedProducts.size(); i++) {
                System.out.println(( i + 1 ) + " - " + allowedProducts.get(i) + ";");
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number next to the product group that is your main (more than 70%) business :");
            numberOfProductType = scanner.nextInt();
            if(numberOfProductType == allowedProducts.size()){
                System.out.println("Sorry, selling of those products in person currently is not allowed.");
            System.exit(0);}
            if(numberOfProductType >= allowedProducts.size()){
                System.out.println("Sorry, number you have entered is out of scope.");ifToTryOneMoreTime();
                General.legalDisclaimer();General.thanksForUsing();System.exit(0);}

            else System.out.println("Retail business selling those products is allowed to operate strictly following " +
                    "\"square meter per person\" guidelines"); getNumberOfPeople();
        }

    public static void getNumberOfPeople() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the size of your premises used for customer service in square meters : ");
        int sizeOfPremises = scanner.nextInt();
        if (sizeOfPremises > 49) numberOfPeople = sizeOfPremises / allowedSqMetersPerPerson;
            System.out.println("Allowed number of customers in your shop is : " + numberOfPeople);
 }

    public static void ifToTryOneMoreTime(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to check another option? Yes or No?");
        String tryOneMoreTime = scanner.next();
        if (tryOneMoreTime.equalsIgnoreCase("yes")) getProductsList();
        else System.exit(0);}


    }

