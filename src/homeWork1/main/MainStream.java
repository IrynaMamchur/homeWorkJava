package homeWork1.main;

import homeWork1.Car;
import homeWork1.Person;
import homeWork1.Sex;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {
        //коллекция из людей
        //для каждого человека необходимо взять его возраст
        //добавить к возрасту +5 лет
        //сложить все возраста
        //получить общую сумму
        //Вася - 15 лет
        //Антон - 40 лет
        //Евгений - 78 лет
        //20-45-83 = 148


        List<Person> list = new ArrayList<>();
    Person first = new Person() {
        public void die() {

        }
    };
    first.setAge(15);
    list.add(first);

    Person second = new Person() {
        public void die() {

        }
    };

        second.setAge(40);
        list.add(second);

        Person third = new Person() {
            public void die() {

            }
        };

        second.setAge(78);
        list.add(third);

        int sum = 0;
        for(Person person: list) {
            int age = person.getAge();
            age +=5;
            sum+= age;
        }
//        Predicate<Person> predicate = (p) -> p.getAge() >50;
//
//        list.stream().filter(predicate); или

//        list
//                .stream()
//                .filter((p) -> p.getAge() >50);

        list.stream().forEach(p -> System.out.println(p.getAge()));
        list.stream().forEach(p-> System.out.println(p.getAge() +5));

        Optional<Integer> answer = list.stream()
                .map(Person::getAge)
                .map(age -> age +5)
                .reduce(Integer::sum);


        Car car1 = ()-> System.out.println("поехали");
                Car car2 = () -> System.out.println("Не доехали");
                Car car3 = () -> {
                    System.out.println("приехали");
                    System.out.println(" почти");
                };


                Car car4 = new Car() {
                    @Override
                    public void go() {
                        System.out.println("поехали 2");
                    }
                };

        System.out.println(car1.getClass());
        System.out.println(car2.getClass());
        System.out.println(car3.getClass());
        System.out.println(car4.getClass());

        car1.go();
        car2.go();
        car3.go();
        car4.go();
//        Car car = new Car() {
//            @Override
//            public void go() {
//                System.out.println("поехали");
//            }
//        };
      //  System.out.println(car.getClass());
//
//        Car car1= new Car() {
//            @Override
//            public void go() {
//                System.out.println("поехали");
//            }
//        };
     //   System.out.println(car1.getClass());

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("---%%---");
                System.out.println(integer);
            }
        };  // Consumer  один аргумент принимает и ничего не возвращает
        consumer.accept(5);
        consumer.accept(51);
        consumer.accept(15);
        consumer.accept(25);

        Consumer<Integer> consumer2 = (integer) -> System.out.println(integer); // второй вариант записи, тут тоже можно написать х вместо Intejer
        consumer2.accept(5);
        consumer2.accept(51);
        consumer2.accept(15);
        consumer2.accept(25);

        Predicate<Integer> predicate = (x) -> x>10; // можно ставить со скобками, тогда ставить return
        Predicate<Integer> predicate1 = (x) -> {
            return x>10;
        };

        boolean b1 = predicate.test(12);
        boolean b2 = predicate.test(10);
        boolean b3 = predicate.test(9);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

//
//        Function<Person, Sex> function = (p) -> p.getSex();
//        Sex s1 = function.apply(first);
//        System.out.println(s1);


        // stream в коллекции ничего не меняет. Исключение, если в стриме указываем через set.. Или через переприсвоение (=)




    }





}
