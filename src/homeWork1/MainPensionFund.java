package homeWork1;

public class MainPensionFund {
    public static void main(String[] args) {
        PensionFund statePensionFund = new PensionFund("State Pension Fund", true, "15.12.2022");
        PensionFund notStatePensionFund = new PensionFund("Best Pension Fund", false, "12.07.2000");
        PensionFund secondNotStatePensionFund = new PensionFund("Public Pension Fund", false, "03.05.2021");

        statePensionFund.pensionCalculation(52, 1200, 7000);
        notStatePensionFund.pensionCalculation(45, 1200, 7000);
        secondNotStatePensionFund.pensionCalculation(50, 1000, 8000);
        System.out.println(statePensionFund);

        System.out.println(statePensionFund.hashCode());
        System.out.println(notStatePensionFund.hashCode());



    }
}
