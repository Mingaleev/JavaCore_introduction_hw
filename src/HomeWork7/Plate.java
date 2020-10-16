package HomeWork7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int amount) {
        if (amount < 0 || food < amount) {
            return false;
        } else {
            food -= amount;
            return true;
        }
    }

    public void addFood(int sizeFood) {
        System.out.println("Add " + sizeFood + " food");
        food += sizeFood;
    }


    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
