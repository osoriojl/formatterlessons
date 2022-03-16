package formatter;

public class Lecture {
    public static void main(String[] args) {
        String productName = "Mug";
        int qty = 20;
        float price = 5.0f;
        float total = qty * price;

        String name1 = String.format("%-15s %-15s %-15s %-15s\n", "Item", "Qty", "Price", "Total");
        String name2 = String.format("%-15s %-15s %-15s %-15s\n", "----", "----", "----", "----");
        String line = String.format("%-15s %-10s %10.2f %15.2f\n", productName, qty, price, total);
        String output = name1 + name2 + line;
        System.out.println(output);


    }
}
