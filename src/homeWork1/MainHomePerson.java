package homeWork1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainHomePerson {

    public static void main(String[] args) {
        Pensioner person = new Pensioner("Andrey", 72, 1.82, 78.3, true, 1200, List.of("Eva", "Roma", "Karl"));
        Worker firstPerson = new Worker("Nikolya", 24, 1.73, 59, true, List.of("null"));
        Worker secondPerson = new Worker("Dmytro", 40, 1.85, 81, true, List.of("Anna", "Egor"));
        Worker thirdPerson = new Worker("Diana", 23, 1.68, 52.4, false, List.of("Slava"));
        Pensioner forPerson = new Pensioner("Andrea", 65, 1.56, 58.3, false, 800, List.of("Frank"));


        person.info();
        System.out.println(firstPerson.getName() + " получает " + firstPerson.getMoney(1200));


        System.out.println(secondPerson.getName() + " получит пенсию в размере " + secondPerson.calculatePension(40, 7000, 1200) + " евро");
        System.out.println(firstPerson.getName() + " получит пенсию в размере " + firstPerson.calculatePension(24, 3000, 1000) + " евро");
        Person[][] workers = new Person[10][10];
        workers[5][4] = new Worker("ryt", 54, 1.73, 55, true, List.of("null"));
        workers[3][5] = new Pensioner("Kre", 73, 1.82, 65, false, 655, List.of("Gena", "Kolya"));

        person.die();
        forPerson.die();
       // Worker worker = new Worker("Rom", 52, 165, 54, true);
        //worker.setMonth(Month.AUGUST);


       // worker.setMinSalary(1500);
        //worker.setMaxSalary(1800);
        //worker.setSex(Sex.MALE);

        //worker.setNewSalary();

        //System.out.println(worker.getMinSalary());
        //System.out.println(worker.getMaxSalary());


        //Worker worker1 = new Worker("Rina", 35,156,48,false);

        //worker1.setMinSalary(1500);
        //worker1.setMaxSalary(1800);
        //worker1.setSex(Sex.FEMALE);

        //worker1.setNewSalary();

        //System.out.println(worker1.getMinSalary());
        //System.out.println(worker1.getMaxSalary());

        //System.out.println(Arrays.toString(Month.values()));
        //Month[] months = Month.values();
       // System.out.println(months[4]);

        //Month feb = Month.valueOf("FEBRUARY");
        //System.out.println(feb.getNumber());

        //worker.setMonth(Month.DECEMBER);
        //worker.setNewSalary();

        //System.out.println(Month.APRIL);
    }
}
