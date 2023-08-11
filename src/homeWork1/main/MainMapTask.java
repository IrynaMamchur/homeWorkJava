package homeWork1.main;

import java.util.*;

public class MainMapTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfCity = scanner.nextLine();

        Map<String, Integer>  cities= new HashMap<>();
        cities.put("Berlin", 2000000);
        cities.put("Nurberg", 1000000);
        cities.put("Munchen", 1500000);
        cities.put("Drezden", 800000);
        cities.put("Regensburg", 500000);
        if (cities.containsKey(nameOfCity)){ // команда "включает"
            Integer population = cities.get(nameOfCity);
            System.out.println(population);
        } else{
            System.out.println("Такого города нет");
        }
        //Collection<Integer> populationOfCities = cities.values();

        int sum = 0;

        //for (Integer populationOfCity : populationOfCities) {
          //  sum += populationOfCity;
      //  } этот лучше
        Set<String>set = cities.keySet();
        for (String city: set
             ) {
            sum+=cities.get(city);
        }

        int average = sum / cities.size();
        System.out.println(average);



    }
}
