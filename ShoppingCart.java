import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private double totalSalesTax;
    private double totalAmount;

    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.totalSalesTax = 0;
        this.totalAmount = 0;
    }

    public void addItem(Item item) {
        items.add(item);
        double tax = TaxCalculator.calculateTax(item);
        totalSalesTax += tax;
        totalAmount += item.getPrice() + tax;
    }

    public List<Item> getItems() {
        return items;
    }

    public double getTotalSalesTax() {
        return totalSalesTax;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}


