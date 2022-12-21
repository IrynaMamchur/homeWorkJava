package homeWork1;

public class PensionFund {
    final static double PENSION_FACTOR = 0.02;
    private String name;
    private boolean state;
    private int ageWork;
    private int averagePensionInStage = 1500;
    final String dateOfCreation;

    public PensionFund(String name, boolean state, String dateOfCreation) {
        this.name = name;
        this.state = state;
        this.dateOfCreation = dateOfCreation;
    }

    public void pensionCalculation(int ageWork) {
        if (state) {
            double averageValue = AverageValueUtils.averageValueOfTwoNumbers(1200, 7000);
            double valuePension = averageValue * PENSION_FACTOR * ageWork;
            System.out.println("Пенсия равна " + valuePension);
        } else {
            double averageValue = AverageValueUtils.averageValueOfThreeNumbers(1200, 7000, 1500);
            double valuePension = averageValue * PENSION_FACTOR * ageWork;
            System.out.println("Пенсия равна " + valuePension);
        }
    }
}










