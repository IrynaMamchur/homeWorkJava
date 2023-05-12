package homeWork1;

import java.util.List;

public abstract class Archivator {
    private String faleName;
    private List<Archivator>archivators;

    public String getFaleName() {
        return faleName;
    }

    public void setFaleName(String faleName) {
        this.faleName = faleName;
    }

    public List<Archivator> getArchivators() {
        return archivators;
    }

    public void setArchivators(List<Archivator> archivators) {
        this.archivators = archivators;
    }
    //1 уровень сложности: Создайте абстрактный класс Archivator и два его наследника
    // ZIPArchivator и RARArchivator, добавьте метод archive и dearchive -
    // реализуете их по разному (достаточно просто вывести два разных сообщения для разных классов),
    // эти методы принимают один аргумент - строку, имя файла, который надо архивировать.
    //Следующий момент - сделать класс ArchivatorService и добавить в него два метода.
    // 1) принимает лист из архиваторов и печает их на экран.
    // Важно: используете тут знак ? И extends/super 2) принимает лист архиваторов и добавляет один любой новый архиватор в этот лист Важно: используете тут знак ? И extends/super
    //2 уровень сложности:
    //Описание задания.
}
