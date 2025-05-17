import java.util.*;

class Item {
    String name;
    int price;

    // Constructor
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        // Integer list
        List<Integer> b = new ArrayList<Integer>();
        b.add(2);
        b.add(30);
        b.add(60);
        System.out.println("Elements of b are: " + b);

        // List of custom objects
        List<Item> products = new ArrayList<Item>();
        products.add(new Item("Milk Powder", 1060));
        products.add(new Item("Tooth paste", 260));
        products.add(new Item("Bread", 160));

        // Nested loop: print each integer and for each, print all items
        for (Integer element : b) {
            System.out.println("Integer: " + element);

            for (Item e : products) {
                System.out.println(e.name + " - Price: " + e.price);
            }
        }
    }
}
