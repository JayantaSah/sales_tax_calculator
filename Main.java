public class Main {
    public static void main(String[] args) {
        // Input 1
        System.out.println("Output 1:");
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addItem(new Item("book", 12.49, 1, ItemType.BOOK, false));
        cart1.addItem(new Item("music CD", 14.99, 1, ItemType.OTHER, false));
        cart1.addItem(new Item("chocolate bar", 0.85, 1, ItemType.FOOD, false));
        ReceiptGenerator.generateReceipt(cart1);
        System.out.println();

        // Input 2
        System.out.println("Output 2:");
        ShoppingCart cart2 = new ShoppingCart();
        cart2.addItem(new Item("imported box of chocolates", 10.00, 1, ItemType.FOOD, true));
        cart2.addItem(new Item("imported bottle of perfume", 47.50, 1, ItemType.OTHER, true));
        ReceiptGenerator.generateReceipt(cart2);
        System.out.println();

        // Input 3
        System.out.println("Output 3:");
        ShoppingCart cart3 = new ShoppingCart();
        cart3.addItem(new Item("imported bottle of perfume", 27.99, 1, ItemType.OTHER, true));
        cart3.addItem(new Item("bottle of perfume", 18.99, 1, ItemType.OTHER, false));
        cart3.addItem(new Item("packet of headache pills", 9.75, 1, ItemType.MEDICAL, false));
        cart3.addItem(new Item("imported box of chocolates", 11.25, 1, ItemType.FOOD, true));
        ReceiptGenerator.generateReceipt(cart3);
    }
}


