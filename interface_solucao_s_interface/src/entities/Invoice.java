package entities;

public class Invoice {
    private Double basidPayment;
    private Double tax;

    public Invoice(){
        
    }
    public Invoice(Double basidPayment, Double tax) {
        this.basidPayment = basidPayment;
        this.tax = tax;
    }
    public Double getBasidPayment() {
        return basidPayment;
    }
    public void setBasidPayment(Double basidPayment) {
        this.basidPayment = basidPayment;
    }
    public Double getTax() {
        return tax;
    }
    public void setTax(Double tax) {
        this.tax = tax;
    }

    public double getTotalPayment() {
        return getBasidPayment() + getTax();
    }

}
