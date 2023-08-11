package homeWork1.main;

import java.util.PriorityQueue;

public class MainQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();// очередь
        queue.add(5);
        queue.add(15);
        queue.add(34);

        System.out.println(queue.peek());// из очереди берется первый элемент
        System.out.println(queue.peek());
        System.out.println(queue.peek());

        System.out.println(queue.poll()); // почти аналогия со Стеком, только в стеке pop. Разница в порядке действий
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }

}
