package entities;

public class ImportedProducted extends Product{
    private Double customFee;

    public ImportedProducted(){

    }

    public ImportedProducted(String name_product, Double price_product, Double customFee) {
        super(name_product, price_product);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    public double totalPrice(){
        return price_product + customFee;
    }

    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.getName_product());
        sb.append(" $ ");
        sb.append(String.format("%.2f", totalPrice()));
        sb.append(" (Customs fee: ");
        sb.append("$ " + String.format("%.2f", customFee) + ")");
        return sb.toString();
    }
}
