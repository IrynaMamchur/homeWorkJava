package homeWork1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class InternetConnection {
    public static void main(String[] args) {
        String google = "https://www.tel-ran.com";
        try {
            URL url = new URL(google);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            InputStreamReader inputStreamReader = new InputStreamReader(urlConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            System.out.println(bufferedReader.readLine());
//            System.out.println(urlConnection.getContentLength());
//            System.out.println(urlConnection.getContentType());
       String str = "";
       while (str != null){
           str = bufferedReader.readLine();
           System.out.println(str);
       }

        }
        catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
