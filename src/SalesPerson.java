public class SalesPerson {

    private String id;
    private int count = 0;
    private Sales[] salesHistory = new Sales[3] ; // details of the different sales private int count = 0;	// number of sales made

    public SalesPerson(String id) {
        this.id = id;
    }

    public SalesPerson(String id, Sales[] s, int c) {
        this.id = id;
        this.salesHistory = s;
        this.count = c;
    }
    public int getCount() {
        return count;
    }
    public String getId() {
        return id;
    }

    public void setSalesHistory(Sales s) {
        salesHistory[count] = s;
        count ++;
    }
    public Sales getSalesHistory(int where) {
        for (int i = 0; i < salesHistory.length; i ++) {
                return salesHistory[where];
        }
        return null;
    }
    public double calcTotalSales() {
        double total = 0;
        for (int i = 0; i < salesHistory.length; i ++) {
            if (salesHistory[i] != null) {
                total += salesHistory[i].doublegetValue();
            }
        }
        return total;
    }

    public void addSales(Sales s, String ID, SalesPerson[] salesPeople) {

        for (int i = 0; i < salesPeople.length; i ++) {

            if (salesPeople[i].getId() == ID) {

                salesPeople[i].setSalesHistory(s);

            }

        }

    }

    public double largestSale() {
        double max = 0;

        for (int i = 0; i < salesHistory.length; i ++) {
            if (salesHistory[i] != null) {
                if (salesHistory[i].doublegetValue() > max) {
                    max = salesHistory[i].doublegetValue();
                }
            }
        }
        return max;
    }
// value
    {

    }



}
