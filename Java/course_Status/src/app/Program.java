package course_Status.src.app;

import java.time.LocalDateTime;

import course_Status.src.entities.Order;
import course_Status.src.enums.OrderStatus;

public class Program {
    public static void main(String[] args) {
        
        Order order = new Order(1040, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}