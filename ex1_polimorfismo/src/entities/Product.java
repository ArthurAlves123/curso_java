package entities;

public class Product {
    private String name_product;
    protected Double price_product;

    public Product(){

    }
    public Product(String name_product, Double price_product) {
        this.name_product = name_product;
        this.price_product = price_product;
    }
    public String getName_product() {
        return name_product;
    }
    public void setName_product(String name_product) {
        this.name_product = name_product;
    }
    public Double getPrice_product() {
        return price_product;
    }
    public void setPrice_product(Double price_product) {
        this.price_product = price_product;
    }

    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(name_product);
        sb.append(" $ ");
        sb.append(String.format("%.2f", price_product));
        return sb.toString();
    }
}
