package formatter;

public class Lecture {
    public static void main(String[] args) {
        String productName = "Mug";
        int qty = 20;
        float price = 5.0f;
        float total = qty * price;

        String name1 = String.format("%-15s %-15s %-15s %-15s\n", "Item", "Qty", "Price", "Total");
        String name2 = String.format("%-15s %5s %10s\n", "----", "----", "-----");
        String output = name1 + name2;
        System.out.println(output);
        String line = String.format("%-15s %5d %10.2f\n", productName, qty, price);
        System.out.println(line);

    }
}
