package homeWork1.main;

import java.io.*;
import java.util.Scanner;

public class MainFileHomework {
    public static void main(String[] args) {
        File file = new File("resources/names.txt");
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int finish = scanner.nextInt();

        try{
            FileReader fileReader = new FileReader(file);
            System.out.println("Файл успешно найден");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            int count =0;

            while (line !=null){
                count++;
                line = bufferedReader.readLine();
            if (count>=start && count <=finish){
                System.out.println(line);
            }
            }
        //}
    //    catch (FileNotFoundException e) {
      //      System.out.println("Прости, такого файла нет ");
        } catch (IOException e) { // данная строка ловит все исключения, если надо на разные исключения, то прописываются все отдельно, как выше указано
            System.out.println("Неизвестная ошибка");
        }
    }
}
