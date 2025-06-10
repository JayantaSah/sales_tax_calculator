public class Item {
    private String name;
    private double price;
    private int quantity;
    private ItemType type;
    private boolean imported;

    public Item(String name, double price, int quantity, ItemType type, boolean imported) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
        this.imported = imported;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public ItemType getType() {
        return type;
    }

    public boolean isImported() {
        return imported;
    }
}


