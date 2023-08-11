package homeWork1.main;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("By");
        System.out.println(list);

        //for(int i =0; i< list.size(); i++){
         //   System.out.println(list.get(i));
        //} - работает только для list, ниже универсальное

        Iterator iterator = list.iterator();
       // System.out.println(iterator.hasNext());
       // System.out.println(iterator.next());

       // System.out.println(iterator.hasNext());
        //System.out.println(iterator.next());

       // System.out.println(iterator.hasNext());
       // System.out.println(iterator.next()); //когда hasNext выдает falls next не запускается

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        } // итератор одноразовый, надо каждый раз создавать новый

        //x.iterator() Название
        iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        //foreach  разновидность цикла for

        System.out.println("----");
        for (String s : list) {
            System.out.println(s);
        } // это используется в 90% случаев

        String answer = "";
        for (String s: list) {
            answer = answer +s;
        }

        //index = 0
        for (String a: list) {
            if (a.equals("Hello")){
                System.out.println("Ok");
            }
        }




    }
}
