package sda.covidrestrictions.tracker;

import java.util.ArrayList;
import java.util.List;

import static sda.covidrestrictions.tracker.BusinessType.chooseBusinessType;

public class Main<numberOfTypeOfBusiness> {
    public static void main(String[] args) {
        List<String> corporateBusinessType = new ArrayList<>();
        corporateBusinessType.add("Retail");
        corporateBusinessType.add("Catering");
        corporateBusinessType.add("Services");
        corporateBusinessType.add("Events");

        BusinessType.getBusinessType(corporateBusinessType);

        BusinessType.chooseBusinessType(1,corporateBusinessType);

        Retail.messageToCustomer();
        Retail.getProductsList();
        Retail.messageAccordingToProductGroup();
        Retail.getNumberOfPeople();

    }
}










