package homeWork1;


import java.util.Objects;

public class Pensioner extends Person {

    private double pension;
    private int money;

    public Pensioner(String name, int age, double growth, double weight, boolean isMan, double pension) {
        super(name, age, growth, weight, isMan);
    this.pension = getPension();
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    @Override
    public void die() {
        double x = (getAge() - 50) * pension;
        System.out.println("Этот пенсионер умер, он заработал: " + x);
    }
    // выше переопределение. Поскольку вводится новая инфо в методе
    @Override
    public void goWork() {
        System.out.println(getName() + " отдыхает дома");
    }

    @Override
    public void info() {
        if (getIsMan()) {
            System.out.println("Его зовут: " + getName() + ", ему " + getAge() + " лет, его рост составляет " + getGrowth() + " см, а вес: " + getWeight() + " кг");
        } else {
            System.out.println("Её зовут: " + getName() + ", ей " + getAge() + " лет, её рост составляет " + getGrowth() + " см, а вес: " + getWeight() + " кг");
        }
    }

}

