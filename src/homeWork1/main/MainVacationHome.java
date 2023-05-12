package homeWork1.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainVacationHome {
    public static void main(String[] args) {
        VacationCalculation vacationCalculation = new VacationCalculation();
        Scanner scanner = new Scanner(System.in);

        try {
            int valueDays = scanner.nextInt();
            int amountOfPeople = scanner.nextInt();
            System.out.println("Стоимость отпуска составляет: " + vacationCalculation.priceOfAllVacation(valueDays, amountOfPeople) + " евро");

        }
        catch (InputMismatchException e) {
            System.out.println("Неправильно введены цифры");

        }
        finally {
            System.out.println("");

        }

    }
}
