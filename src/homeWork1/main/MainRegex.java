package homeWork1.main;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegex {
    public static void main(String[] args) {
        String str = "+7(932)438-55-37";

        Pattern pattern = Pattern.compile("\\+7|[()-]?");
        Matcher matcher = pattern.matcher(str);

        str = matcher.replaceAll("");
        System.out.println(str);
//        String answer = matcher.replaceAll("0");
//        System.out.println(answer);

//        for (int i=0; i<str.length(); i++){
//            if (matcher.find()){
//                System.out.println(matcher.group());
//            }
//        }

//        String[] result = pattern.split(str);
//        System.out.println(Arrays.toString(result));
//
//        int count = 0;
//        while (matcher.find()){
//            System.out.println(matcher.groupCount());
//            System.out.println(matcher.group());
//
//            count++;
//        }
//
//        System.out.println(matcher.matches());
//
//        System.out.println(count);

//        System.out.println(matcher.find());
//        System.out.println(matcher.group());//без find не выполняется




//        System.out.println(str);
//        String result = str.replaceAll("[0-9]+","{тут было число}" );
//        System.out.println(result);
//        String[] strings = str.split("[еи]+");
//        System.out.println(Arrays.toString(strings));
    }
}
