package homeWork1;

public class Person {

    private String name;
    private int age;
    private int growth;
    private int weight;
    private boolean man;
    private int money;

    public Person(String name, int age, int growth, int weight, boolean man, int money) {
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
        this.man = man;
        this.money = money;
    }
    public Person() {
    }

    public void info() {
        if (man) {
            System.out.println("Его зовут: " + name + ", ему " + age + " лет, его рост составляет " + growth + " см, а вес: " + weight + " кг");
        } else {
            System.out.println("Её зовут: " + name + ", ей " + age + " лет, её рост составляет " + growth + " см, а вес: " + weight + " кг");
        }
    }

    public void goWork() {
        if (age < 18 || age > 70) {
            System.out.println(name + " отдыхает дома");
        } else {
            int money1 = getMoney();
            System.out.println(name + " работает и получает " + money1);
        }
    }

    public int getMoney() {
        return money * 2;
    }

}




