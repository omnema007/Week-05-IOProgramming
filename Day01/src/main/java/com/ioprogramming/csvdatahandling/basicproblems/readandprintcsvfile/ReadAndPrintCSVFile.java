package com.ioprogramming.csvdatahandling.basicproblems.readandprintcsvfile;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadAndPrintCSVFile {
    public static void main(String[] args) {
        String fileName = "student.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                for (String value : columns) {
                    System.out.print(value+"\t");
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
