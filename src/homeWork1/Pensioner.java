package homeWork1;

import java.util.Objects;

import static homeWork1.PensionFund.PENSION_FACTOR;


public class Pensioner extends Person implements AbleToCalculatePension {
    private String name;
    private int age;
    private double growth;
    private double weight;
    private boolean isMan;
    private double pension;
    private int money;

    public Pensioner(String name, int age, double growth, double weight, boolean isMan) {
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
        if (age >= 55 && age < 110) {
            this.age = age;
        }
        System.err.println("Ошибка. Введенный возраст меньше 55 или больше 110");
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

    public void die() {
        double x = (age - 50) * pension;
        System.out.println("Этот пенсионер умер, он заработал: " + x);
    }

    public void goWork() {
        System.out.println(name + " отдыхает дома");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pensioner pensioner = (Pensioner) o;
        return age == pensioner.age && Double.compare(pensioner.growth, growth) == 0 && Double.compare(pensioner.weight, weight) == 0 && isMan == pensioner.isMan && Objects.equals(name, pensioner.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, growth, weight, isMan);
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
    public double calculatePension(PensionFund pensionFund, int age, double maxSalary, double minSalary) {
        pension = (age - 18) * ((maxSalary + minSalary) / 2) * PENSION_FACTOR;
        return pension;
    }
}
