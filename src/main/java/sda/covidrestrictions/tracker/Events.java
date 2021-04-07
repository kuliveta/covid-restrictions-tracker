package sda.covidrestrictions.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Events {

    static int numberOfEventType;

    static List<String> insideOrOutsideAllowed = new ArrayList<>();


    public static void PlaceOfEvent() {

        System.out.println("Please choose where event will be held.: ");
        insideOrOutsideAllowed.add("Inside");
        insideOrOutsideAllowed.add("Outside");
        for (int i = 0; i < insideOrOutsideAllowed.size(); i++) {
            System.out.println(( i + 1 ) + " - " + insideOrOutsideAllowed.get(i) + ";");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 1 for Inside and 2 for outside events :");
        numberOfEventType = scanner.nextInt();
        if (numberOfEventType == 1) {
            insideEventsNotAllowed();

        } else if (numberOfEventType == 2) {
            outsideEventsNotAllowed();

        } else System.out.println("Sorry, the number you entered is out of range. Please, enter correct number!");
    }

    public static void insideEventsNotAllowed() {
        System.out.println("Sorry, currently events inside are not allowed.");
    }

    public static void outsideEventsNotAllowed() {
        System.out.println("Sorry, currently events outside are not allowed.");
    }

    public static void insideEventsAllowed(){
        List<String> activityTypeInside = new ArrayList<>();
        activityTypeInside.add("Theater");
        activityTypeInside.add("Cinema");
        activityTypeInside.add("Sports");
        for (int i = 0; i < activityTypeInside.size() ; i++) {
            System.out.println((i+1)+" - " + activityTypeInside.get(i) + ";");}
        System.out.println("Please choose number next to your type of the event");
        Scanner scanner = new Scanner(System.in);
        int typeOfInsideEvent = scanner.nextInt();}

    public static void outsideEventsAllowed(){
        List<String> activityTypeOutside = new ArrayList<>();
        activityTypeOutside.add("Concert");
        activityTypeOutside.add("Sports");
    for (int i = 0; i < activityTypeOutside.size() ; i++) {
        System.out.println((i+1)+" - " + activityTypeOutside.get(i) + ";");}
        System.out.println("Please choose number next to your type of the event");
    Scanner scanner = new Scanner(System.in);
    int typeOfOutsideEvent = scanner.nextInt();
    General.getAllowedNumberOfPeople();getLengthOfEvent();}



    public static void getLengthOfEvent(){
        System.out.println("Please indicate length of your event in hours");
        List<Double> lengthOfEvent = new ArrayList<>();
        lengthOfEvent.add(0.5);
        lengthOfEvent.add(1.0);
        lengthOfEvent.add(1.5);
        lengthOfEvent.add(2.0);
        for (int i = 0; i < lengthOfEvent.size() ; i++) {
            System.out.println((i+1)+" - " + lengthOfEvent.get(i) + ";");}
        Scanner scanner = new Scanner(System.in);
        int choiceNumber = scanner.nextInt();}

}
