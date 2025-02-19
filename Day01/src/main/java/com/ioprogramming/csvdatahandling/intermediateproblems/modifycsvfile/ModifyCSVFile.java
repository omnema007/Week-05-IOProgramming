package com.ioprogramming.csvdatahandling.intermediateproblems.modifycsvfile;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;

public class ModifyCSVFile {
    public static void main(String[] args) {
        String inputFileName = "employee.csv";
        String outputFileName = "updated_employee.csv";

        try (CSVReader reader = new CSVReader(new FileReader(inputFileName));
             CSVWriter writer = new CSVWriter(new FileWriter(outputFileName))) {

            String[] data;
            String[] header = reader.readNext();
            writer.writeNext(header);

            while ((data = reader.readNext()) != null) {
                String department = data[2];
                int salary = Integer.parseInt(data[3]);

                if (department.equalsIgnoreCase("IT")) {
                    salary += salary * 0.10;
                    data[3] = String.valueOf(salary);
                }

                writer.writeNext(data);

            }



            System.out.println("Salaries updated successfully in " + outputFileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
