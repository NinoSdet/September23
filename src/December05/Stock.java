package December05;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;


    public Stock(String symbol, String name){
        this.symbol= symbol;
        this.name =name;
    }
    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice){
        this.symbol= symbol; // this(name, symbol);
        this.name =name;
        this.previousClosingPrice=previousClosingPrice;
        this.currentPrice=currentPrice;
    }

    public Stock(){
        this("GOOG", "Google Inc");

    }
    public double getChangePercent(){
        return ((currentPrice-previousClosingPrice)/previousClosingPrice) *100;
    }
    public void setSymbol(String symbol){
       this.symbol =symbol;

    }
    public void setName(String name){
        this.name=name;

    }
}
