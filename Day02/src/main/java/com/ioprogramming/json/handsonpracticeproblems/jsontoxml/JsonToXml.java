package com.ioprogramming.json.handsonpracticeproblems.jsontoxml;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
public class JsonToXml {
    public static void main(String[] args) {
        try {
            String json = "{ \"name\": \"Alice\", \"age\": 25, \"city\": \"New York\" }";

            // Convert JSON to JsonNode
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(json);

            // Convert JsonNode to XML
            XmlMapper xmlMapper = new XmlMapper();
            String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);

            System.out.println(xml);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
