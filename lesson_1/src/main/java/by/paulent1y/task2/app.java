package by.paulent1y.task2;

public class app {
    /*






     */
    public static void main(String[] args) {
        //Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
        PhoneBook pb = new PhoneBook();

        //В этот телефонный справочник с помощью метода add() можно добавлять записи
        pb.add("Emily", "+14215125125");
        pb.add("Emily", "+142151155125");
        pb.add("Emily", 1421515125);
        pb.add("Miley", "+142151155125");

        // а с помощью метода get() искать номер телефона по фамилии.
        pb.get("Miley");

        //Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        //тогда при запросе такой фамилии должны выводиться все телефоны.
        pb.get("Emily");


        //Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
        //взаимодействие с пользователем через консоль и т.д).
        //Консоль использовать только для вывода результатов проверки телефонного справочника.
        //thats all then ¯\_(ツ)_/¯
    }

}
