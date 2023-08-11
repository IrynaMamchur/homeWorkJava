package homeWork1.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //Лист, изменить порядок элементов (наоборот) - перевернуть лист
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(10);

        List<Integer> answer = new ArrayList<>();

       // for (int i = list.size() - 1; i >= 0; i--) {
       //     int element = list.get(i);
      //     answer.add(element);
      //  }

        for (Integer integer: list) {
            stack.push(integer);
        }
        for (int i = 0; i<list.size(); i++){
            int element = stack.pop();
            answer.add(element);
        }



        System.out.println(list);
        System.out.println(answer);




        stack.add(1);
        stack.add(5);
        stack.add(10);

        stack.push(11); //можно, как пуш, так и add

        // filo  - отсчет идет с последнего элемента
        System.out.println(stack.peek()); // достать последний элемент, в плане, посмотреть последний элемент
        System.out.println(stack.pop()); // достает первый сверху элемент и не возвращает, следовательно, потом будет след элемент браться
        System.out.println(stack.pop());//
        System.out.println(stack.pop());//


// полный стек вызовов всегда хранится в стеке




    }
}
