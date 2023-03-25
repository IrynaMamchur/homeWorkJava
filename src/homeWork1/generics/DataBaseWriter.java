package homeWork1.generics;

public class DataBaseWriter <D> {

        //То есть смысл такой - когда хотим что-то сохранить в БД,
         // то создаем объект класса DatabaseWriter и указываем тип данных, которые хотим записать.
        //
        //Добавьте в класс конструктор со всеми полями и метод save.
        //
        //Этот метод save будет делать одно дело - просто писать на экран сообщение "данные в бд записаны,
        // тип данных = {тут нужно вывести тип данных}"
        //
        //Для вывода типа данных можно воспользоваться методом getClass на объекте

    private String database;
    private D value;

    public DataBaseWriter(String database, D value) {
        this.database = database;
        this.value = value;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public D getValue() {
        return value;
    }

    public void setValue(D value) {
        this.value = value;
    }

    public void save() {
        System.out.println("данные в бд записаны, тип данных = {" + value.getClass() + "}");
    }

    @Override
    public String toString() {
        return "DataBaseWriter{" +
                "database='" + database + '\'' +
                ", value=" + value +
                '}';
    }
}
