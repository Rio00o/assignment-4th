package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Map<Integer, String> seasons = new HashMap<>();
        seasons.put(1, "冬");
        seasons.put(2, "冬");
        seasons.put(3, "春");
        seasons.put(4, "春");
        seasons.put(5, "春");
        seasons.put(6, "夏");
        seasons.put(7, "夏");
        seasons.put(8, "夏");
        seasons.put(9, "秋");
        seasons.put(10, "秋");
        seasons.put(11, "秋");
        seasons.put(12, "冬");

        List<String> result = seasons.entrySet().stream()
                .filter(entry -> entry.getValue().equals("冬"))
                .map(entry-> entry.getKey() + "月は" + entry.getValue() + "です")
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
