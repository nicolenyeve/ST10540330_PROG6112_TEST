public abstract class totalSales implements ConsoleType {
    String ConsoleType;
    String Store;
    int totalSales;

    public totalSales(String Type, String Store, int SalesTotal){
        this.consoleType= consoleType;
        this. store = store;
        this.totalSales= totalSales;
    }

    @Override
    public String getConsoleType() {
        return AccidentVechileType;
    }

    @Override
    public String getStore() {
        return Store;
    }

    @Override
    public int getSalesTotal() {
        return SalesTotal;
    }
    public abstract void printSalesTotalReport();
}
