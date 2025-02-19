package com.ioprogramming.json.practiceproblems.mergejsonobjects;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJsonObjects {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            String json1 = "{ \"name\": \"Alice\", \"age\": 25 }";
            JsonNode node1 = objectMapper.readTree(json1);

            String json2 = "{ \"email\": \"alice@example.com\", \"city\": \"New York\" }";
            JsonNode node2 = objectMapper.readTree(json2);

            ObjectNode mergedNode = objectMapper.createObjectNode();
            mergedNode.putAll((ObjectNode) node1);
            mergedNode.putAll((ObjectNode) node2);

            // Print merged JSON
            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mergedNode));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

