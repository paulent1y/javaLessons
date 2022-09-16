package by.paulent1y;

import java.util.Random;

public class StuffForEmployee {

    public static void doStuff() {

        //StuffForEmployee.doStuff(); to psvm

        Random r = new Random();
        String[] names = {"Vasiliy","Ivan","Santa Claus","Victor","Anna","Ariel","Susanna","Ben Afleck","Tom Cruise", "Cat"};
        String[] positions = {"Cashier","Cleaner","Security","Manager","Technician","Baker","Butcher"};

        //"4. Создать массив из 5 сотрудников." - could be more fun
        int amountOfEmpl = 30;

        Employee[] employees = new Employee[amountOfEmpl];
        for (int i=0; i<employees.length; i++) {
            String name = names[r.nextInt(names.length)];
            int age = r.nextInt(16,100);
            String email = name.toLowerCase().replace(" ", "_") + (2022 - age) +   "@gmail.com";
            String phone = String.valueOf(r.nextInt(10000000, 99999999));
            String job = positions[r.nextInt(positions.length)];
            int salary = r.nextInt(100, 1000);

            employees[i] = new Employee(name, age,job,email, phone, salary);
        }

        int ageToFire = 40;
        System.out.println("List of employees older than " + ageToFire + ":");
        for (Employee employee : employees)
            if (employee.isOlder(ageToFire)) employee.getInfo();
    }
}
