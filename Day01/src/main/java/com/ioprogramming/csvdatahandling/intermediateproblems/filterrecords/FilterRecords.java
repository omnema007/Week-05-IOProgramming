package com.ioprogramming.csvdatahandling.intermediateproblems.filterrecords;
import com.opencsv.CSVReader;
import java.io.FileReader;


public class FilterRecords {
    public static void main(String[] args) {
        String fileName = "student.csv";



        try (CSVReader csvReader = new CSVReader(new FileReader(fileName))) {
            String[] nextLine;

           csvReader.readNext();

            while ((nextLine = csvReader.readNext()) != null) {
               int marks = Integer.parseInt(nextLine[3]);

               if (marks > 80) {
                   System.out.println(String.join(",", nextLine));
               }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
