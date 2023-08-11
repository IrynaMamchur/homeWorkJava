package homeWork1;

import java.util.List;
import java.util.Set;

public class CrowdServiceWork {


    public void addPensioner(List<?super Pensioner> personList){

        personList.add(new Pensioner("1", 1, 1, 20.0, true, 20.0 ));
        personList.add(new Pensioner("2", 1, 1, 20.0, true, 20.0 ));
        personList.add(new Pensioner("3", 1, 1, 20.0, true, 20.0 ));


    }


    public void findWorkerAndCalculatePension(List<?extends Worker> personList, int age, double maxSalary, double minSalary, Set<PensionFund> pensionFunds){


        for (Worker worker: personList){
            worker.calculatePension(age, maxSalary, minSalary, pensionFunds);
        }

    }
}
