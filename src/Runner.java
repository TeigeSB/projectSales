public class Runner {

    public static String largestSaleEver(SalesPerson[] salesPeople) {
     double max = 0;
     String who = "";

        for ( int i = 0; i < salesPeople.length; i ++) {
            if (salesPeople[i] != null) {
                if (salesPeople[i].largestSale() > max) {
                    max = salesPeople[i].largestSale();
                    who = salesPeople[i].getId();

                }
            }
        }
      return who;
    }

    public static void main (String[] args){

        SalesPerson[] salesPeople = new SalesPerson[6];
        salesPeople[0] = new SalesPerson("100");
        salesPeople[1] = new SalesPerson("101");
        salesPeople[2] = new SalesPerson("102");
        salesPeople[0].setSalesHistory(new Sales("A100",300.00,10));
        salesPeople[0].setSalesHistory(new Sales("A200",1000.00,2));
        salesPeople[1].setSalesHistory(new Sales("A300",2550.40,10));
        System.out.println(salesPeople[2].getId());
        System.out.println(salesPeople[0].getCount());
        System.out.println(salesPeople[1].getSalesHistory(0).doublegetValue());
        System.out.println(salesPeople[0].calcTotalSales());
        System.out.println(largestSaleEver(salesPeople));


    }

}
