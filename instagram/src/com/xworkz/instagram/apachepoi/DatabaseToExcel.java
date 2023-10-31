package com.xworkz.instagram.apachepoi;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseToExcel {
    private static final String JDBC_URL = "jdbc:mysql:////localhost:3306/";
    private static final String USER = "root";
    private static final String PASSWORD = "Xworkzodc@123";

    public static void main(String[] args) {
        try {
            // Database connection code (as shown in the previous example)

            // Create a new Excel workbook and sheet
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Sheet1");

            // Create header row
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Column Name 1");
            headerRow.createCell(1).setCellValue("Column Name 2");

            // Initialize row counter
            int rowNum = 1;

            // Iterate through the database result set
            while (resultSet.next()) {
                // Create a new row
                Row row = sheet.createRow(rowNum++);

                // Retrieve data from the result set and fill the cells
                row.createCell(0).setCellValue(resultSet.getString("column_name1"));
                row.createCell(1).setCellValue(resultSet.getString("column_name2"));

                // Add more cells if you have more columns...
            }

            // Write the workbook content to a file
            try (FileOutputStream fileOut = new FileOutputStream("database.xlsx")) {
                workbook.write(fileOut);
            }

            // Close resources
            workbook.close();
            resultSet.close();
            statement.close();
            connection.close();

            System.out.println("Excel file created successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
