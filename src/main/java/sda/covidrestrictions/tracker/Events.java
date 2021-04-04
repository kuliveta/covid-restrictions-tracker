package sda.covidrestrictions.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Events {

    static int numberOfEventType;

    static List<String> insideOrOutsideAllowed = new ArrayList<>();
    public static void ListEvents(){

        System.out.println("Please choose where will be held the event: ");
        insideOrOutsideAllowed.add("Inside");
        insideOrOutsideAllowed.add("Outside");
        for (int i = 0; i < insideOrOutsideAllowed.size() ; i++) {
            System.out.println((i+1)+" - " + insideOrOutsideAllowed.get(i) + ";");}}

    public static void messageAccordingToEventType(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number next to the option you choose :");
        numberOfEventType = scanner.nextInt();
        if(numberOfEventType == 1) {
            System.out.println("Sorry, currently events inside are not allowed.");
        }else if (numberOfEventType == 2) {
            System.out.println("Sorry, currently events outside are not allowed.");
        }else System.out.println("Sorry, the number you entered is out of range. Please, enter correct number!");
    }
}
