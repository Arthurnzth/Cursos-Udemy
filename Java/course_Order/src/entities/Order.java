package course_Order.src.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import course_Order.src.enums.OrderStatus;

public class Order {

    private static DateTimeFormatter fmtDMYT = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static DateTimeFormatter fmtDMY = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> orders = new ArrayList<>();

    public Order(){
    }
    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item){
        orders.add(item);
    }
    public void removeItem(OrderItem item){
        orders.remove(item);
    }
    public double total(){
        double sum = 0;
        for(OrderItem c : orders){
            sum += c.subTotal();
        }
        return sum;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(moment.format(fmtDMYT) + "\n");
        sb.append("Order status: ");
        sb.append(status.toString().charAt(0));
        sb.append(status.toString().toLowerCase().substring(1) + "\n");
        sb.append("Client: ");
        sb.append(client.getName() + " (");
        sb.append(client.getBirthDate().format(fmtDMY) + ") - ");
        sb.append(client.getEmail() + "\n");
        sb.append("Order items:\n");
        for(OrderItem c : orders){
            sb.append(c.toString() + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
    
}
