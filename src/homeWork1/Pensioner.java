package homeWork1;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pensioner extends Person {

    private double pension;
    private int money;

    public Pensioner(String name, int age, double growth, double weight, boolean isMan, double pension) {
        super(name, age, growth, weight, isMan);
        this.pension = pension;
        this.pension = getPension();
    }

    public Pensioner() {
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
        double x = getPension() * (getAge() - 50);
        int countOfChildren = 0;
        if (getChildren() != null) {
            countOfChildren = getChildren().size();
            System.out.println("Этот пенсионер умер, зато у него " + getChildren().size() + " детей и он заработал: " + x);
        } else {
            System.out.println("Этот пенсионер умер и он заработал: " + x);
        }

        // выше переопределение. Поскольку вводится новая инфо в методе



    }

    @Override
    public String toString() {
        return "classes.Pensioner{" +
                "pension=" + pension +
                '}';
    }

    }