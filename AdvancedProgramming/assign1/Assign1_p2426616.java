package assign1;

public class Assign1_p2426616 {
    //Main
    public static void main(String[] args) {
        //Array of food producuts
        Food[] snacks = new Food[2];
        //Array of drink products
        Drink[] drinks = new Drink[2];

        drinks[0] = new Drink("Coca Cola", 2.0, true, false);
        drinks[1] = new Drink("Fanta", 2.0, true, false);
        snacks[0] = new Food("Peanuts", 1.0, true, true);
        snacks[1] = new Food("Seaweed", 1.0, false, true);

        for (Drink drink : drinks) {
            System.out.println(drink);
        }
        for (Food snack : snacks) {
            System.out.println(snack);
        }

    }
}
