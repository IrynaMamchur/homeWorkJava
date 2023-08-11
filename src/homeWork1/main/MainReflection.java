package homeWork1.main;

import homeWork1.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class MainReflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Person person = new Person();

        Class cls1 = Person.class;
        Class cls = person.getClass();

        System.out.println(cls.getName());

        Constructor[] constructors = cls.getConstructors();

        System.out.println(Arrays.toString(constructors));

        Method[] methods = cls.getMethods();
        //for (Method method : methods) {
        //    System.out.println(method);
        //}

        //System.out.println("111111111");
        Method setMethod = cls.getMethod("setYears", int.class);
        //Method setMethod = cls.getMethod("average", double.class, double.class);
        //Method setMethod = cls.getMethod("average", double.class, double.class, double.class);
        setMethod.invoke(person, 10); // == person.setYears(10);


        System.out.println(person);

        Scanner scanner = new Scanner(System.in);
        Class scannerClass = scanner.getClass();

        Method[] scannerMethods = scannerClass.getMethods();

        for (Method scannerMethod : scannerMethods) {
            System.out.println(scannerMethod);
        }

        Method method = scannerClass.getMethod("hasNextLong", int.class);

        method.invoke(scanner, 10);

        System.out.println("Программа отработала");

        //hasNextLong(int)

    }
}



