package com.xworkz.instagram.apachepoi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseTester {
    private static final String JDBC_URL = "jdbc:mysql:////localhost:3306/instagram";
    private static final String USER = "root";
    private static final String PASSWORD = "Xworkzodc@123";

    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram","root","Xworkzodc@123");

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a query (replace 'your_table' with your actual table name)
            ResultSet resultSet = statement.executeQuery("SELECT * FROM passport_appli");

            // Process the result set (you might want to customize this part based on your database schema)
            while (resultSet.next()) {
                String columnName1 = resultSet.getString("name_applicant");
                int columnName2 = resultSet.getInt("age_applicant");

                // Perform your logic here...

                // Example: Print the data to the console
                System.out.println(columnName1 + "\t" + columnName2);
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
