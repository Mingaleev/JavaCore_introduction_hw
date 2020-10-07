package HomeWork5;

public class Main5 {
    public static void main(String[] args) {

        Person[] personArr = new Person[5];
        personArr[0] = new Person("Мингалеев Артур Чулпанович","Заместитель начальника отдела АСУТП",
                "mach@mail.ru","+79274444444",50000,30);
        personArr[1] = new Person("Мирошник Дмитрий Петрович","Ведущий инженер КИПиА",
                "mdp@mail.ru","+79275555555",45000,45);
        personArr[2] = new Person("Мехоношин Вячеслав Иванович","Слесарь КИПиА",
                "mvi@mail.ru","+79276666666",33000,36);
        personArr[3] = new Person("Малышев Константин Юрьевич","Ведущий инженер АСУТП",
                "mku@mail.ru","+79277777777",50000,30);
        personArr[4] = new Person("Куликов Рамис Ильдарович","Начальник отдела АСУТП",
                "kri@mail.ru","+79278888888",55000,47);


        for (Person person : personArr) {
            if (person.getAge() > 40) person.info();
        }

    }
}
