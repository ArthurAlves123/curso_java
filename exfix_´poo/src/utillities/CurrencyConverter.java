package utillities;

public class CurrencyConverter {
    public double dollar_price;
    public int qnt;

    public double converter(){
        return dollar_price * qnt * 1.06;
    }
}
