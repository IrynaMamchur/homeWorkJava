package homeWork1.main;

import java.util.*;

public class MainMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();


      //  Map<String, Integer> map = new HashMap<>();
        //всегда два значения: ключ и значение

       // map.put("Sido", 5);
      //  map.put("Sido", 2); //нельзя вложить 2 одинаковых ключа, Sido должно быть уникальным (ключ)
        // так будет перезапись
     //   map.put("Ivano", 2); // ключи разные, хотя значения могут быть одинаковые

      //  int mark = map.get(name); // если вводится ключ, которого нет - выбьет ошибку, поэтому надо делать Integer

      //  if (map.containsKey(name)){ // команда "включает"
       //     Integer mark = map.get(name);
      //      System.out.println(mark);
      //  } else{
      //      System.out.println("Такого ученика нет");
     //   }

      //  Set<String> set = map.keySet(); //отщепляет только ключи
     //   System.out.println(set);
      //  Collection<Integer> collection = map.values();// все значения

      //  for (Integer integer : collection) {
    //        System.out.println(integer);
     //   }

     //   boolean hasTwo = map.containsValue(2); // поиск значения, есть или нет
     //   System.out.println(hasTwo);



        // Integer mark = map.get(name);// так возвращаться будет null
        //System.out.println(mark);
// hashMap hashSet  устроены одинаково, но 2 содержит в себе hashMap, но значение(value) не используется

// 1. Создать мапу HashMap
// 2. Заполнить значениями Город страныБ где сейчас живете - население
    //    3. Со сканнера вводится имя города - выводится население
      //      4. Найти среднее количество жителей во всех добавленных городах
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Berlin", 2000000);
        map1.put("Nurberg", 1000000);
        map1.put("Munchen", 1500000);
        map1.put("Drezden", 800000);
        map1.put("Regensburg", 500000);
        if (map1.containsKey(name)){ // команда "включает"
            Integer town = map1.get(name);
            System.out.println(town);
        } else{
            System.out.println("Такого города нет");
        }
        Collection<Integer> collection = map1.values();

        int value = 0;
        for (Integer integer : collection) {
        value += integer;
        }
        int result = value / map1.size();
        System.out.println(result);



    }
}
