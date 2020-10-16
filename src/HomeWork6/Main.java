package HomeWork6;

import HomeWork6.Animals.Animal;
import HomeWork6.Animals.Cat;
import HomeWork6.Animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Luna",100,15),
                new Cat("Alisa",200,15),
                new Cat ("Barsik",600,15),
                new Dog("Reks",500,20),
                new Dog("Bobik",300,50)
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(150);
            animals[i].swim(30);
        }
        animals[0].printCount();
        animals[0].printCountCat();
        animals[3].printCountDog();

    }
}
