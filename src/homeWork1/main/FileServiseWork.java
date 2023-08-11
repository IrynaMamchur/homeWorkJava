package homeWork1.main;

import java.io.*;
import java.util.Scanner;

public class FileServiseWork {


        //Пользователь с консоли вводит имя файла
        //Далее пользователь вводит строку

        //Записать в файл строку
        //ВАЖНО: обработать исключения

        //Доп. задача - добавить блок finally, в нем любое сообщение на экран
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String path = scanner.next();

            try {
                System.out.println("try");
                String str = scanner.next();
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                bufferedWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
                }
            finally {
                System.out.println("finally");

            }

        }

    }

