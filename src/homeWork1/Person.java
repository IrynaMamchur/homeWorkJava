package homeWork1;

import java.util.List;
import java.util.Objects;

public class Person implements Comparable<Person> {


    private String name;
    private int age;
    private double growth;
    private double weight;
    private boolean isMan;
    private Person mom;
    private Person ded;

    private Sex sex;

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    private List<Person> children;


    public Person() {

    }


    public Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, int age, double growth, double weight, boolean isMan) {
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
        this.isMan = isMan;
    }


    //  public abstract void die();


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

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.growth, growth) == 0 && Double.compare(person.weight, weight) == 0 && isMan == person.isMan && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, growth, weight, isMan);
    }


    public void infoOfChildren() {
        int countOfChildren = 0;
        if (children == null) {
            System.out.println("У меня нет детей");
            System.out.println();
            return;
        }
        System.out.println("У " + getName() + " " + children.size() + " детей");
        for (Person child : children) {
            if (child != null) {
                countOfChildren++;
                System.out.println(countOfChildren + ") " + child.name);
            }
        }
    }

    @Override

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", years=" + age +
                ", sex=" + sex +
                '}';
    }


    @Override
    public int compareTo(Person o) {
        int firstNameLen = -1;
        int secondNameLen = -1;

        if (name != null) {
            firstNameLen = name.length();
        }

        if (o.name != null) {
            secondNameLen = o.name.length();
        }

        if (firstNameLen != secondNameLen) {
            return Integer.compare(firstNameLen, secondNameLen);
        }
        else {
            return Integer.compare(age, o.age);
        }
    }


    //(o) -> (если в коде больше 1 строки, то скобки{if (name.length() > o.getName().length()) {
    //            return 1;
    //        }
    //        if (name.length() < o.getName().length()) {
    //            return -1;
    //        } else {
    //            if (age > o.getAge()) {
    //                return 1;
    //            }
    //            if (age < o.getAge()) {
    //                return -1;
    //            }
    //        }
    //        return 0;
    //    }}

}














