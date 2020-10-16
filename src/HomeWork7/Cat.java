package HomeWork7;

public class Cat {
    private String name;
    private int sizeSatiety;
    private boolean satiety;

    public Cat(String name, int sizeSatiety) {
        this.name = name;
        this.sizeSatiety = sizeSatiety;
    }

    public String getName() {
        return name;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void eat(Plate plate) {
        if (satiety) {
            System.out.println(name + " already full");
        } else {
            System.out.println("Cat " + name + " eat...");
            satiety = plate.decreaseFood(sizeSatiety);
            if (satiety) {
                System.out.println(name + " eat till full");
            } else {
                System.out.println(name + " not eat till full");
            }
        }
    }

    public void fear(AngryDog dog) {
        System.out.println("Cat " + name + " fear dog " + dog.getName());
    }

    public void fear() {
        System.out.println("Cat " + name + " fear all dogs and all shadow...");
    }
}
