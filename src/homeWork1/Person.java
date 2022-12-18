package homeWork1;

public class Person {

    private String  name;

    private int age;

    private int growth;

    private int weight;

    private boolean man;

    private int money;

    private String namePensionFund;

    private double minSalary;

    private double maxSalary;

    final static double PENSION_FACTOR = 0.02;

    private boolean state;

    private int ageWork;

    private static int averagePensionInStage = 1500;



    public Person(String name, int age, int growth, int weight, boolean man, int money, String namePensionFund, boolean state, double minSalary, double maxSalary, int ageWork ) {
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
        this.man = man;
        this.money = money;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.namePensionFund = namePensionFund;
        this.state = state;
        this.ageWork = ageWork;
    }

    public Person() {
    }

    public Person(String name, int age, int growth, int weight, boolean man, int money) {
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
        this.man = man;
        this.money = money;

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
            System.out.println( name + " отдыхает дома");
        } else {
            int money1 = getMoney();
            System.out.println(name + " работает и получает " + money1);
        }
    }


    public int getMoney() {
        return money*2;
    }

    public void pensionCalculation1() {
        if (state) {
            double valuePension = (minSalary + maxSalary)/2 * PENSION_FACTOR * ageWork;
            System.out.println(name + " получает пенсию в размере " + valuePension + " евро");
        } else {
            double valuePension = (minSalary + maxSalary + averagePensionInStage)/3 * PENSION_FACTOR * ageWork;
            System.out.println(name + " получает пенсию в размере " + valuePension + " евро");
        }
    }
    }




