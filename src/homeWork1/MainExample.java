package homeWork1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainExample {
    public static void main(String[] args) {
       //Integer a = 5;
       //int b = 5;

       //char c = 'c';
       //Character character = 'c';

        int[] array = new int[2];
        List<Integer> list = new ArrayList<>(); //список (лист) из интов. Если создается переменная через Integer, у нее есть свои методы, в отличие от int
    // List<Integer> list2 = new ArrayList<>();
     List<Integer> list2 = new LinkedList<>();// линкудЛист из интов, так писать правильнее, чем ниже
LinkedList<Integer> list3 = new LinkedList<>();






        //можно использовать все, кроме примитива
        // можно делать двухмерный список, но применяется крайне редко
List<Person> people = new ArrayList<>();
people.add(new Worker("Kal", 43, 180, 47, false, List.of("Sara", "Ravin")));
people.add(new Pensioner("Hot", 68, 179, 61, true, 1800, List.of("Artyr")));


     System.out.println(people);
        array[0] = 1;
        array[1] = 3;
        //array[2] = 4; //добавить нельзя, поскольку всего 2 места

        list.add(1); //ячейка под номером 0
        list.add(3); //можно добавлять сколько угодно
        list.add(10000); //2
        list.add(4);// ячейка под номером 3
        list.add(1000);

        list.add(3,5); // это добавляется ячейка со сдвигом значений
        list.set(3, 1000); // меняет значение 3-й ячейки

        System.out.println(list);
        System.out.println(list.isEmpty());

        System.out.println((list.contains(10010))); //поиск объекта false/true

        list.remove(5); // по индексу удаление

        //list.clear(); //полная чистка информации

        list.addAll(list2); //(складывает массивы)
        list.addAll(list);

        int a =array[1];
        int b = list.get(1);
        //for (int i = 2; i<5; i+=2){
       //     System.out.println(list.get(i));
        //}

        int len = array.length;
        int len1 = list.size();

        //for (int i =0; i <array.length; i++){
          //  if(array[i] ==999){
            //    System.out.println(i);
              //  break;
            //}

        int index = list.indexOf(1000);
        System.out.println(index); //если при поиске не находится такое значениеЮ то выведет -1. Это поиск по значению


        //Правильно создать два списка. Один ArrayList, один LinkedList (тип данных String). Добавить в каждый из них по 3 элемента.
        //Центральный элемент в ArrayList заменить на первый элемент. Удалить последний элемент.
        //к LinkedList добавить весь ArrayList.
        //* - найти самую длинную строку в вашем получившемся листе.

     List<String> first = new ArrayList<>();
     List<String> second = new LinkedList<>();
     first.add("do");
     first.add("re");
     first.add("mi");

     second.add("fa");
     second.add("sol");
     second.add("si");

        first.set(1, "do");
        first.remove(2);

        second.addAll(first);

        System.out.println(second);

        int max = 0;
        int j = 0;

        for (int i =0; i< second.size(); i++) {
            if (second.get(i).length() > max) {
                max = second.get(i).length();
                j = i;
            }
        }
        System.out.println (max + " " + second.get(j));
    }



    }

