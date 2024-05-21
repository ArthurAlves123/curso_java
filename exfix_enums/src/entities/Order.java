package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities_enums.OrderStatus;

public class Order {
    static DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime moment; 
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    public Order(){
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    public LocalDateTime getMoment() {
        return moment;
    }
    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public List<OrderItem> getItems() {
        return items;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        double sum_total = 0.0;
        for (OrderItem i : items) {
            sum_total += i.subtotal();
        }
        return sum_total;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(fmt02.format(getMoment()) + "\n");
        sb.append("Order status: ");
        sb.append(getStatus() + "\n");
        sb.append("Client: ");
        sb.append(client.getClient_name() + " (");
        sb.append(fmt01.format(client.getClient_bithDate()) + ") - ");
        sb.append(client.getClient_email() + "\n");
        sb.append("Order Items:\n");
        for (OrderItem i : items) {
            sb.append(i.getProduct().getProduct_name() + ", ");
            sb.append(i.getProduct().getProduct_price() + ", ");
            sb.append("Quantity: ");
            sb.append(i.getItem_qtd() + ", ");
            sb.append("Subtotal: $");
            sb.append(String.format("%.2f", i.subtotal()) + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));

        return sb.toString();
    }
}
