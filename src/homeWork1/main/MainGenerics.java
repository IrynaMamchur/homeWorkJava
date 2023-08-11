package homeWork1.main;

import homeWork1.Person;
import homeWork1.generics.Box;

import java.util.ArrayList;
import java.util.List;

public class MainGenerics {
    public static void main(String[] args) {

            List<String> listForStringsOnlyForString = new ArrayList<>();

            listForStringsOnlyForString.add("String1");
            listForStringsOnlyForString.add("String2");
            listForStringsOnlyForString.add("String3");
            listForStringsOnlyForString.add("String4");
            listForStringsOnlyForString.add("String5");
            //listForStringsOnlyForString.add(new Person());
            Person person = new Person();
        Box <String> stringTestGeneric = new Box<>("1234");
        Box<Integer> integerTestGeneric = new Box<>(1234);

        Box<Person> personTestGeneric = new Box<>(person);

        Integer[]arr = new Integer[10];
        System.out.println(arr.toString());
        System.out.println(arr.hashCode());
        Box<Integer[]> arrayTest = new Box<>(new Integer[2]);
      //  TestGeneric<Int> arrayTest = new TestGeneric<>(new Integer[2]); //примитив нельзя

        stringTestGeneric.print();
        integerTestGeneric.print();
        personTestGeneric.print();

//            for (Object o : listForStringsOnlyForString) {
//                String str = (String) o;
//                System.out.println(str);
//            }


            //object -> person -> worker

            //int a = 5;
            //long b = a; //неявное приведение типов
//
//            long c = 3_000_000_000L;
//            int d = (int) c; //явное приведение

            //System.out.println(d);
//
//
            //Person person = new Worker();
            //Worker worker = (Worker) person;
//
            //Object object = new Worker(); //неявное приведение типов
            //Worker worker1 = (Worker) object; //явное приведение типов
//
            //System.out.println(person);
            //System.out.println(worker1);
//
            ////Object obj = new Object();
            ////Worker worker2 = (Worker) obj;
//
            //Person person1 = new Person();
            //Worker worker3 = (Worker) person1;

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Box<Integer> box = new Box(1);

       Box <String > stringBox =  new Box("123");


        box.setList(list);
        System.out.println(box);

    }
}
