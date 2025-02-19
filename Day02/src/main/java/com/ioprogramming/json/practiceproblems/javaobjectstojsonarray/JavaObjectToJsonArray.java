package com.ioprogramming.json.practiceproblems.javaobjectstojsonarray;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class JavaObjectToJsonArray {
    public static void main(String[] args) {
        try {
            List<Car> cars = new ArrayList<>();
            cars.add(new Car("Mahindra", "Bolero", 2023));
            cars.add(new Car("Hyundai", "Venue", 2022));
            cars.add(new Car("Honda", "Amaze", 2024));

            ObjectMapper objectMapper = new ObjectMapper();
            String jsonArray = objectMapper.writeValueAsString(cars);

            System.out.println(jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
