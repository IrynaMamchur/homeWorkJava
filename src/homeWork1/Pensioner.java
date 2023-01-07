package homeWork1;


public class Pensioner extends Person {

    private double pension;
    private int money;

    public Pensioner(String name, int age, double growth, double weight, boolean isMan) {
        super(name, age, growth, weight, isMan);
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

    public void die() {
        double x = (getAge() - 50) * pension;
        System.out.println("Этот пенсионер умер, он заработал: " + x);
    }

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

