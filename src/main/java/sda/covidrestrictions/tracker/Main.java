package sda.covidrestrictions.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main<Covid> {

    public static void main(String[] args) {
        General.welcomeMessageToUser();
        List<String> corporateBusinessType = new ArrayList<>();
        corporateBusinessType.add("Retail");
        corporateBusinessType.add("Catering");
        corporateBusinessType.add("Services");
        corporateBusinessType.add("Events");
        for (int i = 0; i < corporateBusinessType.size(); i++) {
            System.out.println(( i + 1 ) + " - " + corporateBusinessType.get(i) + ";");
        }
        System.out.println("Please, enter the number of your business type here:");
        Scanner scanner = new Scanner(System.in);
        int numberOfTypeOfBusiness = scanner.nextInt();
        if (numberOfTypeOfBusiness > corporateBusinessType.size()) {
            System.out.println("Sorry, the number you entered is out of scope");
        } else System.out.printf("Since you are representative of %s business, please answer the following questions: ",
                corporateBusinessType.get(numberOfTypeOfBusiness - 1));
        System.out.println("                     ");



        switch (numberOfTypeOfBusiness) {
            case 1:
                Retail.messageToCustomer();
                Retail.getProductsList();
                break;
            case 2:
                Catering.productListCatering();
                break;
            case 3:
                Service.servicePlace();
                break;
            case 4:
                Events.ListEvents();
                Events.messageAccordingToEventType();
                break;


        }
        General.legalDisclaimer();
        General.thanksForUsing();

    }
}










