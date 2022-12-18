package homeWork1;

public class PensionFund {

    final static double PENSION_FACTOR = 0.02;

    private String name;

    private boolean state;

    private String dateOfCreation;

    private int ageWork;

    double minSalary;

    double maxSalary;

    private static int averagePensionInStage = 1500;

    final String dateOfCreationStatePenFund = "15.12.2022";
    public PensionFund(String dateOfCreation) {
        this.dateOfCreation =dateOfCreationStatePenFund;
    }

    public PensionFund(String name, boolean state, String dateOfCreation) {
        this.name = name;
        this.state = state;
        if (state) {
            this.dateOfCreation = dateOfCreationStatePenFund;
        } else {
            this.dateOfCreation = dateOfCreation;
        }
    }

    public void pensionCalculation(int ageWork) {
        if (state) {
            double averageValue = AverageValueUtils.averageValueOfTwoNumbers(1200, 7000);
            double valuePension = averageValue * PENSION_FACTOR * ageWork;
            System.out.println("Пенсия равна " + valuePension);
        } else {
            double averageValue = AverageValueUtils.averageValueOfThreeNumbers(1200, 7000);
            double valuePension = averageValue * PENSION_FACTOR * ageWork;
            System.out.println("Пенсия равна " + valuePension);
        }
        }

    public void pensionCalculation1(double minSalary, double maxSalary, int ageWork) {
        if (state) {

            double valuePension = (minSalary + maxSalary)/2 * PENSION_FACTOR * ageWork;
            System.out.println("Пенсия равна " + valuePension);
        } else {
            double valuePension = (minSalary + maxSalary + averagePensionInStage)/3  * PENSION_FACTOR * ageWork;
            System.out.println("Пенсия равна " + valuePension);
        }
    }

    }






    //4) Добавьте метод расчета пенсии, который принимает параметры:
    // сколько лет отработал человек, сколько зарабатывал минимально,
    // сколько зарабатывал максимально.
    // Ответ ВОЗВРАЩАЕТСЯ в виде числа с помощью return
    //
    //
    //Этот метод должен быть реализован так:
    //
    //
    //а) Если фонд государственный, тогда метод вызывает класс-утилиту
    // и находит среднее значение между максимальной и минимальной зп.
    // Потом это значение умножает на коэффициент пенсии и на количество лет
    //
    //
    //б) Если фонд НЕгосударственный, тогда метод вызывает класс-утилиту и
    // находит среднее значение между максимальной,
    // минимальной зп и средним значение пенсии в стране - 1500. Потом это значение умножает на коэффициент пенсии и на количество лет.

