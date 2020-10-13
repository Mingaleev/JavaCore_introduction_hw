package HomeWork6.Animals;

public class Animal {
    String nameAnimal;
    int maxRunDistance;
    int maxSwimDistance;
    public static int countAnimal;

    public Animal(String nameAnimal, int maxRunDistance, int maxSwimDistance) {
        this.nameAnimal = nameAnimal;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        countAnimal++;
    }

    public void run (int distanceRun){
        if (distanceRun < maxRunDistance){
            System.out.println(nameAnimal + " пробежал(а) " + distanceRun + "метров");
        } else System.out.println(nameAnimal + " не смог(ла) пробежать");
    }

    public void swim (int distanceSwim){
        if (distanceSwim < maxSwimDistance){
            System.out.println(nameAnimal + " проплыл(а) " + distanceSwim + "метров");
        } else System.out.println(nameAnimal + " не смог(ла) проплыть, добирались на спасательном круге!)");
    }

    public void printCount (){
        System.out.println("Животных создано " + countAnimal);
    }

    public void printCountCat(){
    };
    public void printCountDog(){
    };

}