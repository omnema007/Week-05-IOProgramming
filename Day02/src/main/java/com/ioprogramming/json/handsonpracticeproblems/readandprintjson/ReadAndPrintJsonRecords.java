package com.ioprogramming.json.handsonpracticeproblems.readandprintjson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadAndPrintJsonRecords {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File("user.json"));

            System.out.println(jsonNode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
