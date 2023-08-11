package homeWork1.main;

import java.util.*;

public class MainSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Hello");
        list.add("Hello");

        set.add("hello");
        set.add("hello");
        set.add("hello");

        int size = set.size();
        boolean answer = set.contains("hello");
        System.out.println(answer);


        System.out.println(list);
        System.out.println(set);

        set.clear();// очищает
        set.isEmpty(); //есть ли пустые места
        //System.out.println(empty);
        set.remove("nnn"); // удаление

        Set<Integer> integers = new HashSet<>();

        for (int i = 0; i < 1000; i++) {
            long start = System.currentTimeMillis();
            integers.add(i);
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        }
        System.out.println(integers);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {

            integers.add(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);

        System.out.println(integers);

        //Вводится 3 числа с консоли
        // узнать равны ли они друг другу
        // 5. 5 5 = true
        // 5 4 5 false


        Set<Integer> set1 = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        set1.add(a);
        set1.add(b);
        set1.add(c);
        int size1 = set1.size();
        System.out.println(size1);

        Set<Integer> integers1 = new HashSet<>(); //в хешсета порядка нет
        for (int i = 0; i < 1000; i++) {

            integers1.add(i);
        }
        System.out.println(integers1);






        Set<Integer> integers2 = new TreeSet<>();
        for (int i = 0; i < 1000; i++) {

            integers2.add(i);
        }
        System.out.println(integers2);


        //  Set<String> strings = new HashSet<>(); //в хешсете порядка нет
        //  for (int i =0; i <1000; i++){

        //     strings.add (String.valueOf(i));}
        // System.out.println(strings);

        Set<Integer> integers3 = new TreeSet<>();// по порядку размещаются значения, от наименьшего к большему.
        // Можно помещать только объекты классов, реализующих интерфейс comparable
        // красно-черное дерево метод - если вводятся числа по порядку, то середина массива является корнем
        for (int i = 0; i < 1000; i++) {

            integers3.add(i);
        }
        System.out.println(integers3);
    }



}
