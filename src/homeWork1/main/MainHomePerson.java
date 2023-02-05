package homeWork1.main;


import homeWork1.*;

import java.util.*;

public class MainHomePerson {

    public static void main(String[] args) {
        Pensioner person = new Pensioner("Andrey", 72, 1.82, 78.3, true, 1200);
        Worker firstPerson = new Worker("Slas", 24, 1.72, 56, true);
        Worker secondPerson = new Worker("Diana", 35, 1.68, 61, false);
        Worker thirdPerson = new Worker("Dmytro", 43, 1.75, 64,true);
        Pensioner forPerson = new Pensioner("Andrea", 65, 1.56, 58.3, false, 800);


        System.out.println("Получает " + firstPerson.getMoney(1200));
        //Person[][] workers = new Person[10][10];


        List<Person> children = new ArrayList<>();
        Worker firstChild = new Worker();
        firstChild.setName("Kiril");
        Worker secondChild = new Worker();
        secondChild.setName("Yly");
        Worker thirdChild = new Worker();
        thirdChild.setName("Try");
        children.add(firstChild);
        children.add(secondChild);
        children.add(thirdChild);
        firstPerson.setChildren(children);

        firstPerson.infoOfChildren();

        List<Person> children1 = new ArrayList<>();
        Worker firstChild1 = new Worker();
        firstChild.setName("Faz");
        Worker secondChild1 = new Worker();
        secondChild.setName("Dolly");
        Worker thirdChild1 = new Worker();
        thirdChild.setName("Sveta");
        Worker forChild1 = new Worker();
        forChild1.setName("Igor");

        children1.add(firstChild1);
        children1.add(secondChild1);
        children1.add(thirdChild1);
        children1.add(forChild1);
        secondPerson.setChildren(children1);
        secondPerson.infoOfChildren();

        List<Person> children2 = new ArrayList<>();
        Worker firstChild2 = new Worker();
        firstChild.setName("Galya");
        Worker secondChild2 = new Worker();
        secondChild.setName("Hill");
        Worker thirdChild2 = new Worker();
        thirdChild.setName("Poty");
        Worker forChild2 = new Worker();
        forChild2.setName("Sofy");
        Worker fifthChild2 = new Worker();
        forChild2.setName("Gyter");

        children2.add(firstChild2);
        children2.add(secondChild2);
        children2.add(thirdChild2);
        children2.add(forChild2);
        children2.add(fifthChild2);
        thirdPerson.setChildren(children2);

        thirdPerson.infoOfChildren();

        List<Person> children3 = new ArrayList<>();
        Pensioner firstChild3 = new Pensioner();
        firstChild3.setName("Holl");
        Pensioner secondChild3 = new Pensioner();
        secondChild3.setName("Dota");
        children3.add(firstChild3);
        children3.add(secondChild3);
        person.setChildren(children3);
        person.die();

        List<Person> children4 = new ArrayList<>();
        Pensioner firstChild4 = new Pensioner();
        firstChild4.setName("Frayt");
        children4.add(firstChild4);
        forPerson.setChildren(children4);
        forPerson.die();

        Company microsoft = new Company("Microsoft");
        Company google = new Company("Google");
        Company hdi = new Company("HDI");
        Company twitter = new Company("TWITTER");
        Company apple = new Company("Appel");
        Company axa = new Company("AXA");


        List<Company> companyList = new ArrayList<>();
        companyList.add(microsoft);
        companyList.add(google);
        firstPerson.setCompanyList(companyList);

        firstPerson.infoAboutCompanies();


        List<Company> companyList1 = new ArrayList<>();
        companyList1.add(hdi);
        companyList1.add(axa);
        companyList1.add(apple);
        secondPerson.setCompanyList(companyList1);

        secondPerson.infoAboutCompanies();




        PensionFund firstPensionFund = new PensionFund("State PF", TypeOfPensionFund.STATE, "21.10.1998");
        PensionFund secondPensionFund = new PensionFund("Public PF", TypeOfPensionFund.NON_STATE, "21.10.1998");
        PensionFund thirdPensionFund = new PensionFund("First PF", TypeOfPensionFund.SCAMMERS, "21.10.1998");
        Set<PensionFund> pensionFunds = new HashSet<>();
        pensionFunds.add(firstPensionFund);
        pensionFunds.add(secondPensionFund);
        pensionFunds.add(thirdPensionFund);



        firstPerson.calculatePension(24, 3000, 1200, pensionFunds);
        secondPerson.calculatePension(35, 7000, 1200, pensionFunds);
        thirdPerson.calculatePension(43, 3000, 1200, pensionFunds);


        Map<String, String> inMicrosoft = new HashMap<>();
        inMicrosoft.put("New year ", "31.12.");
        inMicrosoft.put("Companies birthday ", "15.07.");
        inMicrosoft.put("Independence Day", "04.07.");
        System.out.println(inMicrosoft);


        Map<String, String> inAxa = new HashMap<>();
        inAxa.put("New year ", " 31.12.-01.01.");
        inAxa.put("Companies birthday ", " 21.09.");
        inAxa.put("Christmas", " 25.12.-27.12.");
        System.out.println(inAxa);







        // Worker worker = new Worker("Rom", 52, 165, 54, true);
        //worker.setMonth(Month.AUGUST);


        // worker.setMinSalary(1500);
        //worker.setMaxSalary(1800);
        //worker.setSex(Sex.MALE);

        //worker.setNewSalary();

        //System.out.println(worker.getMinSalary());
        //System.out.println(worker.getMaxSalary());


        //Worker worker1 = new Worker("Rina", 35,156,48,false);

        //worker1.setMinSalary(1500);
        //worker1.setMaxSalary(1800);
        //worker1.setSex(Sex.FEMALE);

        //worker1.setNewSalary();

        //System.out.println(worker1.getMinSalary());
        //System.out.println(worker1.getMaxSalary());

        //System.out.println(Arrays.toString(Month.values()));
        //Month[] months = Month.values();
        // System.out.println(months[4]);

        //Month feb = Month.valueOf("FEBRUARY");
        //System.out.println(feb.getNumber());

        //worker.setMonth(Month.DECEMBER);
        //worker.setNewSalary();

        //System.out.println(Month.APRIL);
    }

}
