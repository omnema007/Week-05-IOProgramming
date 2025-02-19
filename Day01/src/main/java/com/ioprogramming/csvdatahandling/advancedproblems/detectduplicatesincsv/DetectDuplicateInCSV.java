package com.ioprogramming.csvdatahandling.advancedproblems.detectduplicatesincsv;
import java.util.*;
import java.io.*;
public class DetectDuplicateInCSV {
    public static void main(String[] args) {
        String filePath = "employee.csv";
        int idColumnIndex = 0;
        Map<String, String> records = new HashMap<>();
        Set<String> duplicates = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] fields = line.split(",");
                String id = fields[idColumnIndex].trim();

                if (records.containsKey(id)) {
                    duplicates.add(id);
                } else {
                    records.put(id, line);
                }
            }

            if (duplicates.isEmpty()) {
                System.out.println("No duplicate records found.");
            } else {
                System.out.println("Duplicate records found:");
                for (String id : duplicates) {
                    System.out.println(records.get(id));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
