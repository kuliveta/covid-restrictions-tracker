package sda.covidrestrictions.tracker;

public class Main<numberOfTypeOfBusiness> {
    public static void main(String[] args) {


        BusinessType.getBusinessType();
        //if(numberOfTypeOfBusiness==1) {
        Retail.messageToCustomer();
        Retail.getProductsList();

        Retail productQuestions = new Retail();
        productQuestions.messageAccordingToProductGroup();
        Retail.getNumberOfPeople();

        }




    }


