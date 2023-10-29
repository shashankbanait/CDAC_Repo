// Q1. Write a java program to Create a HashMap called populationMap,
// stores population data for several cities, retrieves and prints the population
// of a specific city, iterates through the map to print all city populations,
// removes a city from the map, and checks if a city exists in the map.

import java.util.HashMap;

public class QuestionOne{
    public static void main(String[] args) {
        HashMap<String, Integer> populationMap = new HashMap<>();
        populationMap.put("Nagpur", 534);
        populationMap.put("Pune", 362);
        populationMap.put("Mumbai", 767);
        populationMap.put("Delhi", 876);

        for(String i: populationMap.keySet()){
            Integer val = populationMap.get(i);
            System.out.println("City: " + i + " Population: " + val);
        }

        for (Integer v : populationMap.values()) {
            System.out.println("Population: " + v);
        }


    }
}