package by.paulent1y;

public class Employee {
    private String name;
    private int age;
    private String position;
    private String email;
    private String phone;
    private int salary;

    public Employee(String name, int age, String position, String email,  String phone, int salary)  {
        this.name = name;
        this.age = age;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    public void getInfo() {
        System.out.print("Employee: " + name + " " + age + " years old");
        System.out.print(". Works as " + position + " with salary " + salary + "$");
        System.out.print(". Contacts: "  + email + ", +" + phone);
        System.out.println();
    }

    public boolean isOlder(int n) {
        return (age>n);
    }
}
