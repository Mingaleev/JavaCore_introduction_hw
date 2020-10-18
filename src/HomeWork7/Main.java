package HomeWork7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik",10),
                new Cat("Luna",25),
                new Cat("Alisa",15)
        };

        Plate plate = new Plate(40);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(plate);
        }

        for (Cat cat : cats) {
            if (!cat.getSatiety()) {
                plate.addFood(40);
                break;
            }
        }

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(plate);
        }


        AngryDog dog = new AngryDog("Tuzik");
        dog.scare(cats[0]);

    }
}
