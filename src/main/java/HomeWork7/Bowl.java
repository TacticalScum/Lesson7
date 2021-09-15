package HomeWork7;


public class Bowl {
    private int foodAmount;
    private int foodSize;


    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
        if (foodAmount < 0) this.foodAmount = 0;
    }

    public void decreaseFood(int amount) {
        this.foodAmount -= amount;
        if (foodAmount < 0) this.foodAmount = 0;
        System.out.printf("Bowl decreased by %d food, now remain: %d\n", amount, this.foodAmount);
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void addMoreFood(int foodSize) {
        this.foodSize = foodSize;
        this.foodAmount += foodSize;
    }

    public int getFoodSize() {
        return foodSize;
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "foodAmount=" + foodAmount +
                '}';
    }
}