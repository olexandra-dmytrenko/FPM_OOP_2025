package grasp.run;

import grasp.controller.OrderController;
import grasp.items.Order;
import grasp.items.OrderItem;
import grasp.items.Product;

import java.util.Arrays;
import java.util.List;

public class ShopThroughController {
    public static void main(String[] args) {
        Product socks = new Product("Socks", 40.0, 20);
        Product mango = new Product("Mango", 200, 10);

        OrderItem buySocks = new OrderItem(socks, 5);
        OrderItem buyMango = new OrderItem(mango, 2);

        List<OrderItem> orderItems = Arrays.asList(buyMango, buySocks);

        OrderController orderController = new OrderController();
        Order myOrder = orderController.createOrder(orderItems);

        System.out.println("Total cost with items: " + myOrder.countPrice() + "\n Order Items: " + myOrder.toString());

        orderController.cancelOrder(myOrder);
        System.out.println("Total cost items removed: " + myOrder.countPrice());
    }
}
