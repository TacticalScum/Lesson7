package HomeWork7;

public class Cat {
    private String name;
    private int appetite;
    private static int hungryCatsCounter;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Bowl bowl) {
        System.out.printf("Cat %s ready to eat\n", this.name);
        if (this.appetite < bowl.getFoodAmount()) {
            bowl.decreaseFood(this.appetite);
            System.out.printf("Cat %s is full\n", this.name);
            System.out.println(" ");
        } else {
            System.out.printf("Cat %s cannot eat more than the bowl have\n", this.name);
            System.out.println(" ");
            hungryCatsCounter++;
            if (hungryCatsCounter > 3) {
                System.out.println("You are awful man :(\nYou left more than 3 cats to starve to death\n");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }
}
