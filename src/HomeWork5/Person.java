package HomeWork5;

public class Person {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Person(String name, String position, String email, String phoneNumber, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.printf("%s - %s%nЭлектронная почта: %s%nМоб.телефон: %s%nЗарплата - %d руб.%nВозраст - %d лет%n",
                name,position,email,phoneNumber,salary,age);
    }

    public int getAge(){
        return age;
    }

}
