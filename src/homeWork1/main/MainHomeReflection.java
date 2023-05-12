package homeWork1.main;

import homeWork1.PensionFund;
import homeWork1.Pensioner;
import homeWork1.Worker;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class MainHomeReflection {
    public static void main(String[] args) {
        Class cls = Pensioner.class;
        Annotation[] annotations = cls.getDeclaredAnnotations();
        System.out.println(Arrays.toString(annotations));
        for(Annotation annotation: annotations){
            System.out.println(annotation);


        }
    }
}
