package com.gs.practice;

import java.util.HashMap;
import java.util.Map;

public class StudentAverage {


    public static String findStudentWithHighestAverage(String[][] data) {
        Map<String, int[]> studentMap = new HashMap<>();

        for (String[] entry : data) {
            String name = entry[0];
            int marks = Integer.parseInt(entry[1]);

            if (studentMap.containsKey(name)) {
                int[] stats = studentMap.get(name);
                stats[0] += marks;
                stats[1] += 1;
            } else {
                studentMap.put(name, new int[]{marks, 1});

            }
        }
        String topStudent = "";
        double highestAverage = Double.NEGATIVE_INFINITY;

        for (Map.Entry<String, int[]> entry : studentMap.entrySet()) {
            String name = entry.getKey();
            int[] stats = entry.getValue();
            double average = (double) stats[0] / stats[1];

            if (average > highestAverage) {
                highestAverage = average;
                topStudent = name + " " + (int) average;
            }
        }
        return topStudent;
    }


    public static void main(String[] args) {
        String[][] data = {{"Charles", "84"},
                {"John", "100"},
                {"Andy", "37"},
                {"John", "23"},
                {"Charles", "20"}};

        String result = StudentAverage.findStudentWithHighestAverage(data);
        System.out.println("Result :" +result);
    }
}





