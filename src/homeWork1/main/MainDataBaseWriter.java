package homeWork1.main;

import homeWork1.generics.DataBaseWriter;

public class MainDataBaseWriter {
    public static void main(String[] args) {
        DataBaseWriter<Integer> dataBaseWriter = new DataBaseWriter<>("DB", 3);
        dataBaseWriter.save();
    }
}
