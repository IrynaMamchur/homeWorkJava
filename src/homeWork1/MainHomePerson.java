package homeWork1;



public class MainHomePerson {

    public static void main(String[] args) {

        Person person = new Person("Andrey", 72, 182, 68, true, 500);
        Person secondPerson = new Person();
        Person thirdPerson = new Person("Nikolya", 17, 173, 59, true, 100);
        Person forPerson = new Person("Dmytro", 43, 174, 62, true, 1000);
        Person fivePerson = new Person("Diana", 23, 168, 52, false, 2000);
        Person sexPerson = new Person("Andrea", 65, 156, 58, false, 600);

        person.info();
        secondPerson.info();
        thirdPerson.info();
        forPerson.info();
        fivePerson.info();
        sexPerson.info();

        person.goWork();
        thirdPerson.goWork();
        forPerson.goWork();
        fivePerson.goWork();

        System.out.println("Он получает " + forPerson.getMoney());

    }
}
