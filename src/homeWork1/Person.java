package homeWork1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Person {


    private String name;
    private int age;
    private double growth;
    private double weight;
    private boolean isMan;
    private Person mom;
    private Person ded;
    private List<String> children;

    public Person(String name, int age, double growth, double weight, boolean isMan, List<String> children) {
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
        this.isMan = isMan;
        this.children = children;
    }

    public abstract void die();

    public abstract void goWork();

    public abstract void info();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age < 120) {
            this.age = age;
        }
        System.err.println("Ошибка. Введенный возраст меньше нуля или больше 120");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight >= 0 && weight < 260) {
            this.weight = weight;
        }
        System.err.println("Ошибка. Введенный вес меньше нуля или больше 260");
    }

    public double getGrowth() {
        return growth;
    }

    public void setGrowth(double growth) {
        if (growth >= 0 && growth < 2.60) {
            this.growth = growth;
        }
        System.err.println("Ошибка. Введенный рост меньше нуля или больше 2.60 м");
    }

    public boolean getIsMan() {
        return isMan;
    }

    public boolean setIsMan() {
        return isMan;
    }

    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.growth, growth) == 0 && Double.compare(person.weight, weight) == 0 && isMan == person.isMan && Objects.equals(name, person.name) && Objects.equals(children, person.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, growth, weight, isMan, children);
    }
}



