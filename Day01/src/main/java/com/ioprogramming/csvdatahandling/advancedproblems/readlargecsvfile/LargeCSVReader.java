package com.ioprogramming.csvdatahandling.advancedproblems.readlargecsvfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeCSVReader {
    public static void main(String[] args) {
        String filePath = "large_file.csv";
        int chunkSize = 100;
        int recordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineCount = 0;

            while ((line = br.readLine()) != null) {
                lineCount++;

                if (lineCount % chunkSize == 0) {
                    recordCount += chunkSize;
                    System.out.println("Processed " + recordCount + " records so far.");
                }
            }

            if (lineCount % chunkSize != 0) {
                recordCount += lineCount % chunkSize;
                System.out.println("Processed " + recordCount + " records so far.");
            }

            System.out.println("Total records processed: " + recordCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


