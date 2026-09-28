public class Store extends totalSales {
    public Store(String ConsoleType, String Store, int SalesTotal) {
        super(ConsoleType, Store, SalesTotal);
    }
    @Override
    public void printAccidentReport(){

        System.out.println(" console type :"+ getConsoleType());
        System.out.println("store"+ getStore());
        System.out.println("Accident Total:" + getTotalSales());
        }
    }

