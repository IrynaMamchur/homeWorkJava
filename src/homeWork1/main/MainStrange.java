package homeWork1.main;

public class MainStrange {
    public static void main(String[] args) {
        System.out.println("Я это сделал"); //пока стек не перезаполнится
        MainStrange.main(args);// будет выполняться бесконечноБ поскольку вызывает сам себя


    }
}
