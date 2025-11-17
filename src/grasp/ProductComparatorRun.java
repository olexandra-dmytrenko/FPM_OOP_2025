package grasp;

import grasp.items.Product;
import grasp.items.ProductByKilos;

import java.sql.SQLOutput;

public class ProductComparatorRun {
    public static void main(String[] args) {
        Product product11 = new ProductByKilos("Pares", 10.02, 3);
        Product product12 = new ProductByKilos("Pare", 10.02, 3);
        Product product21 = new ProductByKilos("Apples", 10.02, 3);
        Product product22 = new ProductByKilos("Apples", 11.00, 1);

        System.out.println(1 == 1);
        System.out.println(Integer.valueOf(1).equals(Integer.valueOf(1)));
        System.out.println(Double.valueOf(1).equals(Integer.valueOf(1)));
        System.out.println(Double.valueOf(1).equals(Double.valueOf(1)));
        System.out.println("a".equals("a"));

        System.out.println(product11.equals(product12));
        System.out.println(product11.equals(product21));
        System.out.println(product21.equals(product22));
    }
}
