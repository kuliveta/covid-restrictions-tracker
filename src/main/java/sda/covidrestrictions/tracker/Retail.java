package sda.covidrestrictions.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Retail {

    static int numberOfPeople = 1;
    static int allowedSqMetersPerPerson = 25;
    int numberOfProductType;

        List<String> allowedProducts = new ArrayList<>();

        public static void messageToCustomer (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose one of product categories below" +
                "represented in your portfolio in amount which exceeds 70%");}

    public static void getProductsList() {
      
        List<String> allowedProducts = new ArrayList<>();
        allowedProducts.add("Food");
        allowedProducts.add("Pharmacy");
        allowedProducts.add("Animal products");
        allowedProducts.add("Gasoline services");
        allowedProducts.add("Hygienic products");
        allowedProducts.add("products");
        allowedProducts.add("products1");
        allowedProducts.add("animal5 products");
        allowedProducts.add("animal6 products");
        allowedProducts.add("animal7 products");
        allowedProducts.add("other products");
        for (int i = 0; i < allowedProducts.size() ; i++) {
            System.out.println((i+1)+" - " + allowedProducts.get(i) + ";");}}


    public void messageAccordingToProductGroup(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number next to your main product group:");
        numberOfProductType = scanner.nextInt();
        if(numberOfProductType == allowedProducts.size()){
        System.out.println("Sorry business selling those products is not allowed to operate");
        System.exit(0);}
        else System.out.println("Retail business selling those products is allowed to operate following" +
                "\"square meter per person\" guidelines");}

    public static void getNumberOfPeople() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size of your premises in square meters");
        int sizeOfPremises = scanner.nextInt();
        if (sizeOfPremises > 49) numberOfPeople = sizeOfPremises / allowedSqMetersPerPerson;
            System.out.println("allowed number of people  " + numberOfPeople);
 }

    }