package entities;

public class OrderItem {
    private Integer item_qtd;
    private Product product;

    public OrderItem(){

    }
    
    public OrderItem(Integer item_qtd, Product product) {
        this.item_qtd = item_qtd;
        this.product = product;
    }

    public Integer getItem_qtd() {
        return item_qtd;
    }
    public void setItem_qtd(Integer item_qtd) {
        this.item_qtd = item_qtd;
    }
    
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    public double subtotal(){
        return product.getProduct_price() * item_qtd;
    }
}
