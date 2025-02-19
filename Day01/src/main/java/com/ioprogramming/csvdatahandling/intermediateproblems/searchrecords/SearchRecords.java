package com.ioprogramming.csvdatahandling.intermediateproblems.searchrecords;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.Scanner;

public class SearchRecords {
    public static void main(String[] args) {
        String fileName = "employee.csv";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name to search record: ");
        String searchName = sc.nextLine();

        try (CSVReader csvReader = new CSVReader(new FileReader(fileName))) {
            String[] data;

            csvReader.readNext();

            while ((data = csvReader.readNext()) != null) {
                String name = data[1];

                if (name.equalsIgnoreCase(searchName)) {
                    System.out.println("Id: " + data[0] + ", Name: " + name + ", Department: " + data[2] + ", Salary: " + data[3]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
