package com.ioprogramming.json.handsonpracticeproblems.validateemailfield;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.nio.file.Files;
import java.nio.file.Paths;

public class EmailValidator {

    public static void main(String[] args) {
        try {
            String schemaFileName = "emailSchema.json";
            JSONObject jsonSchema = new JSONObject(
                    new JSONTokener(Files.newInputStream(Paths.get(schemaFileName))));

            Schema schema = SchemaLoader.load(jsonSchema);

            String emailJsonString = "{ \"email\": \"example@example.com\" }";
            JSONObject emailJson = new JSONObject(emailJsonString);

            schema.validate(emailJson);
            System.out.println("Email is valid!");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Email is invalid: " + e.getMessage());
        }
    }
}

