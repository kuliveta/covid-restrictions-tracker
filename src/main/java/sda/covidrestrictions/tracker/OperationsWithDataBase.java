package sda.covidrestrictions.tracker;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class OperationsWithDataBase {
    public static void main(String[] args) throws SQLException {
        Connection connection = DataBaseConnection.getConnection();

        DataBaseConnection.createTable(connection);

        DataBaseConnection.printAllDatabaseRecord(connection);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Field of your business:"); //is it possible to get from main?
            String businessType = scanner.nextLine();
            System.out.println("Where are you from (Riga, other city):");
            String geography = scanner.nextLine();
            System.out.println("Approximate drop on sales due to covid");
            String impactOnSales = scanner.nextLine();
            System.out.println("Does your business have internet shop? ");
            String internetSales = scanner.nextLine();
            System.out.println("Which Covid restriction should be removed?");
            String restrictionToRemove = scanner.nextLine();

        // DataBaseConnection.updateRecord(businessType, geography, impactOnSales, internetSales,restrictionToRemove );

            /*DataBaseConnection.printAllDatabaseRecord(connection);
            DataBaseConnection.deleteRecord(connection);
            DataBaseConnection.printAllDatabaseRecord(connection);
            DataBaseConnection.createTable(connection);*/

    }

}

