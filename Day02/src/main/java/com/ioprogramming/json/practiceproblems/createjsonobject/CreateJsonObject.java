package com.ioprogramming.json.practiceproblems.createjsonobject;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonObject {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("name" , "Om");
        jsonObject.put("age", 23);

        JSONArray subjects = new JSONArray();
        subjects.put("Physics");
        subjects.put("Chemistry");
        subjects.put("Maths");

        jsonObject.put("subjects", subjects);

        System.out.println(jsonObject);
    }
}
