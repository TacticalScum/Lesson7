package HomeWork7;

public class HomeWork7 {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Murzik", 10),
                new Cat("Barsik", 15),
                new Cat("Vaska", 40),
                new Cat("Muzhik", 40),
                new Cat("Stepka", 40),
                new Cat("Filka", 40)
        };

        Bowl bowl = new Bowl(60);

        for (Cat cat : cats) {
            cat.eat(bowl);
        }
        System.out.println("Finally in the bowl: " + bowl.getFoodAmount());
        System.out.println(" ");

        bowl.addMoreFood(50);
        System.out.println("You added " + bowl.getFoodSize() + " food\nNow in the bowl: " + bowl.getFoodAmount());
        System.out.println(" ");

        Cat[] cat1 = {
                new Cat("Varfalomei", 10)
        };
        for (Cat cat : cat1) {
            cat.eat(bowl);
        }
    }
}