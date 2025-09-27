package grasp.run;

import grasp.items.Order;
import grasp.items.OrderItem;
import grasp.items.Product;

public class Shop {
    public static void main(String[] args) {

        Product socks = new Product("Socks", 40.0, 20);
        Product mango = new Product("Mango", 200, 10);

        OrderItem buySocks = new OrderItem(socks, 5);
        OrderItem buyMango = new OrderItem(mango, 2);

        Order myOrder = new Order();
        myOrder.addItem(buySocks);
        myOrder.addItem(socks, 1);
        myOrder.addItem(buyMango);

        double orderPrice = myOrder.countPrice();

        System.out.println("Total cost: " + orderPrice);
    }
}
