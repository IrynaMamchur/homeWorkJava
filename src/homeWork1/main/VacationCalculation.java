package homeWork1.main;

public class VacationCalculation {

    private int valueDays;
    private int amountOfPeople;
    private static final int PRICE_OF_ONE_DAY = 10;
    private int vacationPrice;

    public int getVacationPrice() {
        return vacationPrice;
    }

    public void setVacationPrice(int vacationPrice) {
        this.vacationPrice = vacationPrice;
    }

    public int getValueDays() {
        return valueDays;
    }

    public void setValueDays(int valueDays) {
        this.valueDays = valueDays;
    }

    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(int amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }



    public int priceOfAllVacation(int valueDays, int amountOfPeople){
       return valueDays*amountOfPeople;
    }

    // 1 уровень сложности: Формируем отпуск.
    // С консоли Считываем два числа - количество дней отдыха и количество людей.
    // Ответ - это стоимость отпуска - произведение дней отдыха на количество людей
    //Обратите внимание, что при попытке ввести текст вместо числа у вас упадет ошибка.
    // Обработайте ее используя блок try-catch одним из способов, что обсуждали с вами на занятии.
}
