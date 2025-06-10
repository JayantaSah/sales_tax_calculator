import java.text.DecimalFormat;

public class ReceiptGenerator {

    public static void generateReceipt(ShoppingCart cart) {
        DecimalFormat df = new DecimalFormat("0.00");

        for (Item item : cart.getItems()) {
            double itemPriceWithTax = item.getPrice() + TaxCalculator.calculateTax(item);
            System.out.println(item.getQuantity() + " " + item.getName() + ": " + df.format(itemPriceWithTax));
        }

        System.out.println("Sales Taxes: " + df.format(cart.getTotalSalesTax()));
        System.out.println("Total: " + df.format(cart.getTotalAmount()));
    }
}


