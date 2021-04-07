package sda.covidrestrictions.tracker;

import java.sql.*;

public class DataBaseConnection {

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/covid_restrictions_tracker", "root", "password");
    }

    public static void createTable(Connection connection) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS covid_restrictions_impact_on_business(" +
                "unique_id_code INT AUTO_INCREMENT PRIMARY KEY," +
                "field_of_business VARCHAR(200)," +
                "geography VARCHAR(200)," +
                "impact_of_covid_restrictions VARCHAR(100),"+
                "internet_sales VARCHAR(255)" +
                "restriction_to_be_removed VARCHAR(250),"+
                ")";
}
    public static void printAllDatabaseRecord(Connection connection) throws SQLException {
        String sql = "SELECT * from covid_restrictions_impact_on_business ";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int unique_code = resultSet.getInt("respondent_code");
                String fieldOfBusiness = resultSet.getString("field_of_business");
                String geography = resultSet.getString("geography");
                String covidImpact = resultSet.getString("impact_of_Covid_restrictions");
                String internetSales = resultSet.getString("internet_sales");
                String restrictionToRemove = resultSet.getString("restrictions_to_be_removed");

            }
        }
    }
    public static void insertIntoTable(Connection connection, String field_of_business, String geography, String impact_of_Covid_restrictions,
                                       String internet_sales, String restrictions_to_be_removed ) throws SQLException {
        String sql = "INSERT INTO covid_restrictions_impact_on_business (field_of_business,geography,impact_of_Covid_restrictions,internet_sales" +
                "restrictions_to_be_removed VALUES(?,?,?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ((PreparedStatement) statement).setString(1, field_of_business);
            statement.setString(2, geography);
            statement.setString(3, impact_of_Covid_restrictions);
            statement.setString(4, internet_sales);
            statement.setString(5, restrictions_to_be_removed);

            boolean isSuccessful = statement.execute();
            if (isSuccessful) {
                System.out.println("Thank you for your opinion.Record was successfully inserted");
            }
        }
    }
}
