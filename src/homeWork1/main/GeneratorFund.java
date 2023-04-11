package homeWork1.main;

import homeWork1.PensionFund;
import homeWork1.TypeOfPensionFund;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorFund {
    public static void main(String[] args) throws IOException {
        //  1 уровень сложности: Задача:
        //  Создайте файл fund.txt и заполните его 10 названиями различных банков Германии.
        //Теперь создайте generator, который будет считывать данные построчно из файла
        // и создавать Пенсионные фонды. Остальные поля, кроме имени фонда заполните рандомно.
        // (используйте библиотеку рандом)
        //
        //2) Создать stream, который из всех пенсионных фондов оставляет только
        // государственные и название которых короче, чем 15 символов

        File file = new File("resources/fund.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);


        Random random = new Random();

        List<PensionFund> pensionFunds = new ArrayList<>();

        String personString = "";
        while (personString != null) {
            personString = bufferedReader.readLine();


            String name = "";
            while (name != null) {
                name = bufferedReader.readLine();
                if (name != null) {
                    String[] data = name.split(" ");

                    PensionFund pensionFund = new PensionFund();
                    pensionFund.setName(name);
                    if (random.nextBoolean()) {
                        pensionFund.setTypeOfPensionFund(TypeOfPensionFund.STATE);
                    } else {
                        pensionFund.setTypeOfPensionFund(TypeOfPensionFund.NON_STATE);
                    }

                    pensionFund.setDayOfCreation(random.nextInt(1, 30));
                    pensionFund.setMonthOfCreation(random.nextInt(1, 12));
                    pensionFund.setYearOfCreation(random.nextInt(1900, 2023));
                    pensionFunds.add(pensionFund);
                }


            }
        }
        for (PensionFund pensionFund : pensionFunds) {
            System.out.println(pensionFund);
        }

        System.out.println("------------------");
        List<PensionFund> answer = pensionFunds.stream()
                .filter(pensionFund -> pensionFund.getTypeOfPensionFund().equals(TypeOfPensionFund.STATE))
                .filter(pensionFund -> pensionFund.getName().length() < 15)
                .toList();


        for (PensionFund pensionFund : answer) {
            System.out.println(pensionFund);
        }

    }
}
