package sda.covidrestrictions.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Events {

    static int numberOfEventType;

    static List<String> insideOrOutsideAllowed = new ArrayList<>();
    public static void ListEvents(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose where will be held the event: ");
        List<String> insideOrOutsideAllowed = new ArrayList<>();
        insideOrOutsideAllowed.add("Inside");
        insideOrOutsideAllowed.add("Outside");
        for (int i = 0; i < insideOrOutsideAllowed.size() ; i++) {
            System.out.println((i+1)+" - " + insideOrOutsideAllowed.get(i) + ";");}}

    public static void messageAccordingToEventType(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number next to the option you choose :");
        numberOfEventType = scanner.nextInt();
        if(numberOfEventType == insideOrOutsideAllowed.size()) {
            System.out.println("Sorry, currently events inside for corporate reasons are not allowed.");
            System.exit(0);}
        else System.out.println("Sorry, currently events outside for corporate reasons are not allowed.");
    }
}
