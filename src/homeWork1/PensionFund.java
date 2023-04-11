package homeWork1;

import java.util.List;
import java.util.Objects;

public class PensionFund {
    public final static double PENSION_FACTOR = 0.02;
    private String name;
    private TypeOfPensionFund typeOfPensionFund;
    private int ageWork;
    private final static double AVERAGY_SALARY = 1500;
    private double minSalary;
    private double maxSalary;
    private String dateOfCreation;
    private List<String>currencies;

    private int dayOfCreation;
    private int monthOfCreation;
    private int yearOfCreation;

    public int getDayOfCreation() {
        return dayOfCreation;
    }

    public int getMonthOfCreation() {
        return monthOfCreation;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setDayOfCreation(int dayOfCreation) {
        this.dayOfCreation = dayOfCreation;
    }

    public void setMonthOfCreation(int monthOfCreation) {
        this.monthOfCreation = monthOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public PensionFund(String name, TypeOfPensionFund typeOfPensionFund, String dateOfCreation) {
        this.name = name;
        this.typeOfPensionFund = typeOfPensionFund;
        this.dateOfCreation = dateOfCreation;
    }

    public PensionFund() {

    }

    public PensionFund(String name, TypeOfPensionFund typeOfPensionFund, int dayOfCreation, int monthOfCreation, int yearOfCreation) {
        this.name = name;
        this.typeOfPensionFund = typeOfPensionFund;
        this.dayOfCreation = dayOfCreation;
        this.monthOfCreation = monthOfCreation;
        this.yearOfCreation = yearOfCreation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeOfPensionFund getTypeOfPensionFund() {
        return typeOfPensionFund;
    }

    public void setTypeOfPensionFund(TypeOfPensionFund typeOfPensionFund) {
        this.typeOfPensionFund = typeOfPensionFund;
    }

    public int getAgeWork() {
        return ageWork;
    }

    public void setAgeWork(int ageWork) {
        this.ageWork = ageWork;
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

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PensionFund that = (PensionFund) o;
        return Objects.equals(name, that.name) && typeOfPensionFund == that.typeOfPensionFund && Objects.equals(dateOfCreation, that.dateOfCreation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, typeOfPensionFund, dateOfCreation);
    }

    public double pensionCalculation(int ageWork, double maxSalary, double minSalary) {
        double averageValue = 0;
        TypeOfPensionFund typeOfPensionFund = getTypeOfPensionFund();
        switch (typeOfPensionFund) {
            case STATE:
                averageValue = AverageValueUtils.average(minSalary, maxSalary);
                break;
            case NON_STATE:
                averageValue = AverageValueUtils.average(minSalary, maxSalary, AVERAGY_SALARY);
                break;
            case SCAMMERS:
                averageValue = 0;
                break;
        }
        return averageValue * PENSION_FACTOR * ageWork;
    }

    public List<String> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<String> currencies) {
        this.currencies = currencies;
    }

    @Override
    public String toString() {
        return " " +
               name +
                ", " + typeOfPensionFund +
                ", " + dayOfCreation+
                "."+ monthOfCreation+
                "."+ yearOfCreation+
                ' ';
    }
}










