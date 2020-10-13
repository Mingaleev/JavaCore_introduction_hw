package HomeWork6.Animals;

public  class Cat extends Animal{
    public static int countCat;

    public Cat(String nameAnimal, int maxRunDistance, int maxSwimDistance) {
        super(nameAnimal, maxRunDistance, maxSwimDistance);
        countCat++;
    }

    @Override
    public void swim(int distanceSwim) {
        System.out.println("Коты не умеют плавать!");
    }

    @Override
    public void printCountCat() {
        System.out.println("Кошек создано " + countCat);
    }
}
