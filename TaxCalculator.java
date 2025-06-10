public class TaxCalculator {

    private static final double BASIC_SALES_TAX_RATE = 0.10;
    private static final double IMPORT_DUTY_RATE = 0.05;

    public static double calculateTax(Item item) {
        double tax = 0;
        if (item.getType() == ItemType.OTHER) {
            tax += item.getPrice() * BASIC_SALES_TAX_RATE;
        }
        if (item.isImported()) {
            tax += item.getPrice() * IMPORT_DUTY_RATE;
        }
        return roundTax(tax);
    }

    private static double roundTax(double tax) {
        return Math.ceil(tax * 20) / 20.0;
    }
}


