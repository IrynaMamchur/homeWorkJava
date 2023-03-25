package homeWork1;

import java.util.*;


public class Worker extends Person implements AbleToCalculatePension {

    private double minSalary;
    private double maxSalary;
    private int money;
    private Month month;
    private Sex sex;

    private static List<Company> companyList;
    private int supplementForChildren;
    private Set<PensionFund> pensionFunds;



    private static final int MONEY_PER_CHILD = 200;


    public Worker() {
    }

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

    public static List<Company> getCompanyList() {
        return companyList;
    }

    public static void setCompanyList(List<Company> companyList) {
        Worker.companyList = companyList;
    }

    public Set<PensionFund> getPensionFunds() {
        return pensionFunds;
    }

    public void setPensionFunds(Set<PensionFund> pensionFunds) {
        this.pensionFunds = pensionFunds;
    }

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }

    public int getMoney(int money) {
        return money;
    }


    @Override
    public double calculatePension(int age, double maxSalary, double minSalary, Set<PensionFund> pensionFunds) {
        int ageWork = (age - 18);
        int supplementForChildren;
        if (getChildren() == null) {
            supplementForChildren = 0;
        } else {
            supplementForChildren =  MONEY_PER_CHILD* getChildren().size();
        }
        supplementForChildren+= minSalary;
        double max = 0;
        String pensionFundName = null;
        for (PensionFund pensionFund : pensionFunds) {
            double result = pensionFund.pensionCalculation(ageWork, supplementForChildren, maxSalary);
            if (max < result) {
                max = result;
                pensionFundName = String.valueOf(pensionFund.getName());
            }

        }
        System.out.println("Наилучшее предложение у пенсионного фонда " + pensionFundName + " составляет " + max + "евро");
        return max;

    }

    public static void infoAboutCompanies() {
        System.out.print("Я работал в следующих компаниях: ");
        boolean start = true;

        for (Company company : companyList) {
            if (start) {
                System.out.print(company.getName());
                start = false;
            } else {
                System.out.print(", " + company.getName());
            }
        }
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "Worker{" +
                "minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                '}';
    }

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
