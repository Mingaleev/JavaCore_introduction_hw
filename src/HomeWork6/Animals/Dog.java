package HomeWork6.Animals;

public class Dog extends Animal{
    public static int countDog;
    public Dog(String nameAnimal, int maxRunDistance, int maxSwimDistance) {
        super(nameAnimal, maxRunDistance, maxSwimDistance);
        countDog++;
    }

    @Override
    public void printCountDog() {
        System.out.println("Собак создано " + countDog);
    }
}
