package homeWork1.main;

import homeWork1.Person;
import homeWork1.Sex;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class MainStreamPersonNew {
    public static void main(String[] args) throws IOException {
            File file = new File("resources/names.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            File outputFile = new File("resources/out.txt");
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            Random random = new Random();

            List<Person> people = new ArrayList<>();

            String name = "";
            while (name != null) {
                name = bufferedReader.readLine();
                if (name != null) {
                    Person person = new Person();
                    person.setName(name);
                    person.setAge(random.nextInt(0, 80));
                    if (random.nextBoolean()) {
                        person.setSex(Sex.MALE);
                    }
                    else {
                        person.setSex(Sex.FEMALE);
                    }
                    people.add(person);
                    bufferedWriter.write(person.toString());
                    bufferedWriter.newLine();
                }
            }

            bufferedWriter.close();
            bufferedReader.close();
            fileWriter.close();
            fileReader.close();




            //List<Person> answer = people
            //        .stream()
            //        .filter(person -> person.getSex().equals(Sex.MALE))
            //        .filter(person -> person.getYears() < 18)
            //        .toList();
//
            //System.out.println(answer);

        }

//        List<Person> list = new ArrayList<>();
//        Person first = new Person() {
//            @Override
//            public void die() {
//
//            }
//        };
//        first.setAge(15);
//        list.add(first);
//
//        Person second = new Person() {
//            @Override
//            public void die() {
//
//            }
//        };
//
//        second.setAge(40);
//        list.add(second);
//
//        Person third = new Person() {
//            @Override
//            public void die() {
//
//            }
//        };
//
//        second.setAge(78);
//        list.add(third);
//
//       long result = list.stream()
//                       .filter(person -> person.getAge() >35)
//                               .sorted()
//                                       .count();
//
//        List<Person> answer = list.stream()
//                .filter(person -> person.getAge() >35) //конвейерный метод, выбирает всех, кто больше 35 лет
//                .sorted() //конвейерный метод
//                .toList(); //терминальный
//
//        Set<Person> answer2 = list.stream()
//                .filter(person -> person.getAge() >35) //конвейерный метод, выбирает всех, кто больше 35 лет
//                .sorted() //конвейерный метод
//                .collect(Collectors.toSet()); //терминальный
//
////        List<Person> answer3 = list.stream()
////                .filter(person -> person.getAge() >35) //конвейерный метод, выбирает всех, кто больше 35 лет
////                .sorted() //конвейерный метод
////                .collect(Collectors.toSet()); //так нельзя, поскольку это только для сетов работает. Собираем коллектор в сет,
////                а пытаемся запихнуть в лист
////
//        System.out.println(result);
//        System.out.println(list);
//        System.out.println(answer);
//        System.out.println(answer2);

    }

