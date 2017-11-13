public class Sales {

    private String itemld; // id of the item
    private double value;
    private int quantity; // the price of one item private int quantity; // the number of the items sold
    // constructor missing

    public Sales(String itemld, double value, int quantity) {
        this.itemld = itemld;
        this.value = value;
        this.quantity = quantity;

    }

    public double doublegetValue() {
        return value;
    }
    public int getQuantity() {
        return quantity;
    }


}
