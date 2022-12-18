package homeWork1;

public class AverageValueUtils {



    private static int averagePensionInStage = 1500;






// У меня с применением утилиты возникла следующая проблема: данные по з/п пришлось забить в формулу калькулятора). Как выйти из этой ситуации я не понимаю.
    // Поэтому я создала 2 калькулятора в фонде: с утилитой и без; а также калькулятор по человеку без утилиты.

    public static double averageValueOfThreeNumbers(double minSalary, double maxSalary){
        return (minSalary+maxSalary + averagePensionInStage)/3;
    }

    public static double averageValueOfTwoNumbers(double  minSalary, double maxSalary) {
        return (minSalary+maxSalary)/2;
    }


}
