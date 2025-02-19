package com.ioprogramming.csvdatahandling.basicproblems.countrowsincsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountRowsCSV {
    public static void main(String[] args) {
        String fileName = "employee.csv";

        int rowCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                rowCount++;
            }

            System.out.println("The number of records: " + rowCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
