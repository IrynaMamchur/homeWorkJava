package homeWork1.main;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {

        List<String> arr1 = new ArrayList<>();
        arr1.add("Я ");
        arr1.add("ненавижу ");
        arr1.add("тесты ");
        arr1.add("и ");
        arr1.add("экзамены");
        System.out.println(arr1);

        Iterator iterator = arr1.iterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next());
        }
    }
}
