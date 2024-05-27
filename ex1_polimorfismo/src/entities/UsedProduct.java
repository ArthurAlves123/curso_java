package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private LocalDate manufacturedDate;
    static DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public UsedProduct(){

    }

    public UsedProduct(String name_product, Double price_product, LocalDate manufacturedDate) {
        super(name_product, price_product);
        this.manufacturedDate = manufacturedDate;
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDate manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();

        sb.append(super.getName_product());
        sb.append(" (used) ");
        sb.append("$ " + String.format("%.2f", super.getPrice_product()));
        sb.append(" (Manufacture date: ");
        sb.append(getManufacturedDate().format(fmt01) + ")");

        return sb.toString();
    }
}
