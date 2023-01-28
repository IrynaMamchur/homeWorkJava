package homeWork1;

import java.util.List;


public class Worker extends Person implements AbleToCalculatePension {

    private double minSalary;
    private double maxSalary;
    private int money;
    private Month month;
    private Sex sex;

    private Company company;

    private static List<String> Company;
    private int supplementForChildren;

    public Worker(String name, int age, double growth, double weight, boolean isMan, List<String> children) {
        super(name, age, growth, weight, isMan, children);
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

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getSupplementForChildren() {
        return supplementForChildren;
    }

    public void setSupplementForChildren(int supplementForChildren) {
        this.supplementForChildren = supplementForChildren;
    }

    public homeWork1.Company getCompany() {
        return company;
    }

    public void setCompany(List<String> company) {
        Company = company;
    }

    public void setCompany(homeWork1.Company company) {
        this.company = company;
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
        String name = this.getName() + " PF";
        int ageWork = (age - 18);
        int supplementForChildren;
        if (getChildren().get(0).equals("null")) {
            supplementForChildren = 0;
        } else {
            supplementForChildren = 200 * getChildren().size();
        }
        minSalary = minSalary + supplementForChildren;
        PensionFund firstPensionFund = new PensionFund(name, TypeOfPensionFund.STATE, "21.10.1998");
        double result = firstPensionFund.pensionCalculation(ageWork, minSalary, maxSalary);
        return result;
    }

    public static void isWorkInCompany(List<Company> workerCompany) {
        System.out.print("Я работал в следующих компаниях: ");
        int index = 0;
        for (Company company : workerCompany) {
            System.out.print(workerCompany.get(index) + ", ");
            index++;
        }
        System.out.println("");
    }


    @Override
    public String toString() {
        return "Worker{" +
                '}';
    }




    //First level: Не так давно мы делали в классе Worker метод, который рассчитывает пенсию.
    //Для расчета пенсии использовался "хардкодинг", когда мы прямо в методе создавали непонятный пенсионный фонд. Сегодня от этого откажемся.
    //
    //
    //1) Добавить в класс Worker поле - множество (Set) из Пенсионных фондов.
    //2) Добавить для него гетер и сетер
    //3) в методе расчета пенсии взять Set из пенсионных фондов и для каждого из них посчитать возможную пенсию, выбрать наиболее выгодное предложение и вернуть (return) из этого метода именно самое лучшее предложение (там, где больше всего заплатят). (как это реализовать - полностью на вашей совести)
    //4) Создать в Main несколько работников и несколько сетов из пенсионных фондов. Заполнить каждому работнику доступные ему пенсионный фонды (см. пункт 1)
    //5) запустить расчет пенсии
    //
    //
    //Second level:
    //public void setNewSalary() {
        //Sex sex = getSex();
        //switch (sex) {
        //  case MALE:
        //    minSalary *= 1.5;
        //  maxSalary *= 1.5;
        //break; // тут ставить обязательно
        //case FEMALE:
        //  minSalary *= 1.6;
        //maxSalary *= 1.6;


        //if (month.equals(Month.DECEMBER)) {
        //minSalary *= 10;
        // maxSalary *= 10;
        // }else if (month.equals(Month.NOVEMBER)){
        //      minSalary*=2;
        //     maxSalary*=2;
        // } else if (month.equals(Month.APRIL)){
        // minSalary*=0;
        //maxSalary*=0;
        //} вместо этого - ниже пишется switch, это проще и меньше записи. От 3х записей надо делать switch

        // switch (month){    // вместо свича можно забить значения в ЕМЕН
        //   case DECEMBER:
        //     minSalary *= 10;
        //   maxSalary *= 10;
        // break;
        //case NOVEMBER:
        //  minSalary *= 2;
        //maxSalary *= 2;
        //break;
        //case JANUARY:
        //  minSalary *= 1.1;
        //maxSalary *= 1.1;
        // case FEBRUARY: // вместо этого default
        //case JANUARY:
        //case MAY:
        //case JULY:
        //case JUNE:
        //default:
        // minSalary *= 0;
        // maxSalary *= 0;
        //  break;

        //double number = month.getNumber();
       // minSalary *= number;
       // maxSalary *= number;
   // }


    //if (sex.equals(Sex.MALE)){
    //  minSalary *= 1.5;
    //maxSalary *= 1.5;
    //} else {
    //  minSalary *= 1.6;
    //maxSalary *= 1.6;
    //} выше соответствует этому


}
