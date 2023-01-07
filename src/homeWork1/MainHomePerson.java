package homeWork1;


public class MainHomePerson {

    public static void main(String[] args) {
        Pensioner person = new Pensioner("Andrey", 72, 1.82, 78.3, true);
        Worker firstPerson = new Worker("Nikolya", 17, 1.73, 59, true);
        Worker secondPerson = new Worker("Dmytro", 43, 1.74, 62, true);
        Worker thirdPerson = new Worker("Diana", 23, 1.68, 52.4, false);
        Pensioner forPerson = new Pensioner("Andrea", 65, 1.56, 58.3, false);


        person.info();
        System.out.println(firstPerson.getName() + " получает " + firstPerson.getMoney(1200));


        System.out.println(secondPerson.getName() + " получит пенсию в размере " + secondPerson.calculatePension(43, 7000, 1200) + " евро");

    }
}
