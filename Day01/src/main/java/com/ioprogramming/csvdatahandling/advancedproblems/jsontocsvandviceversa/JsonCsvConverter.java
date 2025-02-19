package com.ioprogramming.csvdatahandling.advancedproblems.jsontocsvandviceversa;

import org.json.CDL;
import org.json.JSONArray;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonCsvConverter {

    // Convert JSON to CSV
    public static void jsonToCsv(String jsonFile, String csvFile) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(jsonFile)));
            JSONArray jsonArray = new JSONArray(content);

            String csvData = CDL.toString(jsonArray);

            try (FileWriter writer = new FileWriter(csvFile)) {
                writer.write(csvData);
                System.out.println("CSV file created successfully: " + csvFile);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Convert CSV to JSON
    public static void csvToJson(String csvFile, String jsonFile) {
        try {
            String csvData = new String(Files.readAllBytes(Paths.get(csvFile)));
            JSONArray jsonArray = CDL.toJSONArray(csvData);

            try (FileWriter writer = new FileWriter(jsonFile)) {
                writer.write(jsonArray.toString(4)); // Pretty print with indentation
                System.out.println("JSON file created successfully: " + jsonFile);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String jsonFilePath = "students.json";
        String csvFilePath = "students.csv";
        String outputJsonFilePath = "students_output.json";

        jsonToCsv(jsonFilePath, csvFilePath);

        csvToJson(csvFilePath, outputJsonFilePath);
    }
}

