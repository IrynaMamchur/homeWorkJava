package homeWork1;

import java.util.Objects;

public class PensionFund {
    public final static double PENSION_FACTOR = 0.02;
    private String name;
    private boolean isState;
    private int ageWork;
    private final static double AVERAGY_SALARY = 1500;
    private double minSalary;
    private double maxSalary;
    private final String dateOfCreation;

    public PensionFund(String name, boolean isState, String dateOfCreation) {
        this.name = name;
        this.isState = isState;
        this.dateOfCreation = dateOfCreation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isState() {
        return isState;
    }

    public void setState(boolean state) {
        isState = state;
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
        return isState == that.isState && ageWork == that.ageWork && Double.compare(that.minSalary, minSalary) == 0 && Double.compare(that.maxSalary, maxSalary) == 0 && Objects.equals(name, that.name) && Objects.equals(dateOfCreation, that.dateOfCreation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isState, ageWork, minSalary, maxSalary, dateOfCreation);
    }


    public double pensionCalculation(int ageWork, double maxSalary, double minSalary) {
        double averageValue;
        if (isState) {
            averageValue = AverageValueUtils.averageValueOfTwoNumbers(minSalary, maxSalary);

        } else {
            averageValue = AverageValueUtils.averageValueOfThreeNumbers(minSalary, maxSalary, AVERAGY_SALARY);
        }
        return averageValue * PENSION_FACTOR * ageWork;
    }

}










