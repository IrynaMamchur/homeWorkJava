package homeWork1;

import java.util.Random;


public class Worker extends Person implements AbleToCalculatePension {

    private double minSalary;
    private double maxSalary;
    private int money;


    public Worker(String name, int age, double growth, double weight, boolean isMan) {
        super(name, age, growth, weight, isMan);
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
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
        if (getIsMan()) {
            System.out.println("Его зовут: " + getName() + ", ему " + getAge() + " лет, его рост составляет " + getGrowth() + " см, а вес: " + getWeight() + " кг");
        } else {
            System.out.println("Её зовут: " + getName() + ", ей " + getAge() + " лет, её рост составляет " + getGrowth() + " см, а вес: " + getWeight() + " кг");
        }
    }

    @Override
    public void goWork() {
        System.out.println(getName() + " работает");
    }


    @Override
    public double calculatePension(int age, double maxSalary, double minSalary) {
        Random random = new Random();
        boolean randomBoolean = random.nextBoolean();
        String name = this.getName() + " PF";
        int ageWork = (age - 18);
        PensionFund firstPensionFund = new PensionFund(name, randomBoolean, "21.10.1998");
        return firstPensionFund.pensionCalculation(ageWork, minSalary, maxSalary);

    }
}
