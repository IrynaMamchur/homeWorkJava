package homeWork1.main;

import java.util.Scanner;

public class MainStackTask {
    public static void main(String[] args) {


        //()((()))((((()))))
        //количество открывающихся должно соответствовать закрывающимся через booling

// " " - true
        //"()"  = true
        //"(" - false
        // "))))" - false

        // ")(" - false
        // "())(()" - false
        //"(]"
        //"[(])"

        //1) количество левых и правых равно
        //2) если уровень вложенности скобок = 0б то не может быть закрывающихся скобок

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int counter = 0;
        boolean answer = true;

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol == '(') {
                counter++;
            }
            if (symbol == ')') {
                counter--;
            }
            if (counter < 0) { //2
                answer = false;
            }
        }

        if (counter > 0) { //1
            answer = false;
        }


        System.out.println(answer);




    }
}
