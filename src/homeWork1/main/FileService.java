package homeWork1.main;

import java.io.*;

public class FileService {
    public String getFirstLineForFile(String fileName) {
        File file = new File(fileName);

        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))
            )

        {
            System.out.println("try");


            String answer = bufferedReader.readLine();
     //       bufferedReader.close();
       //     fileReader.close();  // за счет того, что выведено в круглые скобки try

            return answer;
        } catch (IOException e) {
//            System.out.println("catch");
//            throw new RuntimeException();
            e.printStackTrace();
            //  throw new IllegalArgumentException("Проверьте доступность файла");// можно без этого, но внизу return"", если с этим, то без return
        }
        finally {
            System.out.println("finally");
            //финально выполняется всегда
            //разрыв соединения
        }
      //  System.out.println("Это выполняется после кетч");
   return "";
    }


    // catch (IOException ignored){ // такой вариант для незначительных ошибок
//}
//return "";


//    catch (IOException e){
//        throw new IllegalArgumentException("Новая ошибка", e);
//    }



}
