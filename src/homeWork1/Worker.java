package homeWork1;

import java.util.Objects;

public class Worker extends Person {
    private String name;
    private int age;
    private double growth;
    private double weight;
    private boolean isMan;
    private double minSalary;
    private double maxSalary;
    private int money;

    public Worker(String name, int age, double growth, double weight, boolean isMan) {
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
        this.isMan = isMan;
    }

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
        if (age >= 0 && age < 65) {
            this.age = age;
        }
        System.err.println("Ошибка. Введенный возраст меньше нуля или больше 65");
        // хотя, если работающий, то надо бы ставить возраст от 18, например. 65 поставила пока пределом для работы - потом на пенсию. В классе пенсионер поставила от 55, хотя, конечно, есть и более ранние пенсионеры))
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
        if (growth >= 0 && growth < 260) {
            this.growth = growth;
        }
        System.err.println("Ошибка. Введенный рост меньше нуля или больше 260 см");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return age == worker.age && Double.compare(worker.growth, growth) == 0 && Double.compare(worker.weight, weight) == 0 && isMan == worker.isMan && name.equals(worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, growth, weight, isMan);
    }

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }

    public int getMoney(int money) {
        return money;
    }

    @Override
    public void info() {
        if (isMan) {
            System.out.println("Его зовут: " + name + ", ему " + age + " лет, его рост составляет " + growth + " см, а вес: " + weight + " кг");
        } else {
            System.out.println("Её зовут: " + name + ", ей " + age + " лет, её рост составляет " + growth + " см, а вес: " + weight + " кг");
        }
    }

    @Override
    public void goWork() {
        System.out.println(name + " работает");
    }

}
