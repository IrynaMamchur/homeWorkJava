package homeWork1;

import java.util.List;

public class CrowdService {

    public void findChildrenForListOfPerson(List<Person> personList) {
        // personList - на самом деле это список из воркеров
        // но усли у нас список из ПЕрсонов, то только Персон
        if (personList == null) {
            return;
        }
        personList.add(new Person());
        for (Person person : personList) {
            if (person != null) {
                person.infoOfChildren();
            }
        }
    }

        public void findChildrenForListOfPersonSecond(List<?> personList) {
            // ? говорит о том, что это будет лист из любых объектов. Лист с ? нельзя добавить компании или другие..

// удобный метод для печати любого количества любого типа данных
            for (Object o : personList) {
                System.out.println(o);
            }
        }

            public void findChildrenForListOfPersonThird(List<?extends Person> personList){


        for (Person person: personList){
            person.infoOfChildren();
        }

    }

//    public void findChildrenForListOfPersonFourth(List<?extends Person> personList){
//    //List <Person> +++
//        // List<Worker> -+-
//        //List<Pensioner> --+
//        // читать можно, добавить нельзя
//
////        personList.add(new Person());
////    personList.add(new Worker());
////    personList.add(new Pensioner("1", 1, 1, 20.0, true, 20.0 ));
//
//        for (Person person: personList){
//            person.infoOfChildren();
//        }
//
//    }

    public void findChildrenForListOfPersonFourth(List<?super Person> personList){
       // в данный метод можно добавлять
        personList.add(new Person());
       personList.add(new Worker());
       personList.add(new Pensioner("1", 1, 1, 20.0, true, 20.0 ));
//
        }




}
