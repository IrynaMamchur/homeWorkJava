package homeWork1.generics;

import java.util.List;

public class Box<T>{

    private T value;
    private List<T>list;

    public Box(T value) {
        this.value = value;
    }

    public void print(){
        System.out.println(value.getClass());
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
