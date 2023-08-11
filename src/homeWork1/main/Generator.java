package homeWork1.main;

import homeWork1.Person;
import homeWork1.Sex;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {

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
            }



            //List<Person> answer = people
            //        .stream()
            //        .filter(person -> person.getSex().equals(Sex.MALE))
            //        .filter(person -> person.getYears() < 18)
            //        .toList();
//
            //System.out.println(answer);

        }

    }

