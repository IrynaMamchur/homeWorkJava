package homeWork1;

import java.util.List;

public class ArchivatorService {

    ////Следующий момент - сделать класс ArchivatorService и добавить в него два метода.
    //    // 1) принимает лист из архиваторов и печает их на экран.
    //    // Важно: используете тут знак ? И extends/super 2) принимает лист архиваторов и добавляет один любой новый архиватор в этот лист
    //    Важно: используете тут знак ? И extends/super


    public void giveListAndPrint(List<?extends Archivator> archivators){

for (Archivator archivator: archivators){
    System.out.println(archivator);
}
    }

    public void giveListAndAddNew(List<?super Archivator> archivators){

       archivators.add(new RARArchivator());
       archivators.add(new ZIPArchivator());
//
    }

}
