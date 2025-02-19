package com.ioprogramming.json.practiceproblems.validatejsonstructure;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJson {
    public static void main(String[] args) {
        String json = "{ \"name\": \"Alice\", \"email\": \"alice@example.com\", \"age\": 25 }";

        try {
            ObjectMapper objectMapper = new ObjectMapper();

            Student student = objectMapper.readValue(json, Student.class);

            System.out.println("Valid JSON: " + student.getName() + ", " + student.getEmail() + ", " + student.getAge());
        } catch (Exception e) {
            System.out.println("Invalid JSON structure!");
        }
    }
}
