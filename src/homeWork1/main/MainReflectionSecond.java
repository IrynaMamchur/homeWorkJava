package homeWork1.main;

import homeWork1.PensionFund;

import java.lang.annotation.Annotation;

public class MainReflectionSecond {
    public static void main(String[] args) {
        //Person person = new Person();
        //Class cls1 = person.getClass();

        Class cls = PensionFund.class;
        Annotation[] annotations = cls.getAnnotations();
        System.out.println(annotations);
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
            if (annotation.annotationType().getName().equals("classes.JavaMages")) {
                System.out.println("Этим классом будет управлять наш фреймворк JavaMages43e");
            }
        }
    }
}
