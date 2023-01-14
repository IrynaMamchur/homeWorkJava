package homeWork1;


import java.util.Arrays;

public class MainHomePerson {

    public static void main(String[] args) {
        Pensioner person = new Pensioner("Andrey", 72, 1.82, 78.3, true, 700);
        Worker firstPerson = new Worker("Nikolya", 17, 1.73, 59, true);
        Worker secondPerson = new Worker("Dmytro", 43, 1.74, 62, true);
        Worker thirdPerson = new Worker("Diana", 23, 1.68, 52.4, false);
        Pensioner forPerson = new Pensioner("Andrea", 65, 1.56, 58.3, false, 800);


        person.info();
        System.out.println(firstPerson.getName() + " получает " + firstPerson.getMoney(1200));


        System.out.println(secondPerson.getName() + " получит пенсию в размере " + secondPerson.calculatePension(43, 7000, 1200) + " евро");
        //Worker worker = new Worker("Rom", 52, 165, 54, true);
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
