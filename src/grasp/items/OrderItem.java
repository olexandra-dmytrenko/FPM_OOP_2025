package grasp.items;

import grasp.exeption.ItemNotAddedException;

public class OrderItem {
    private Product product;
    private int number;
    private double kilos;

    public OrderItem(Product product, int number) {
        this.product = product;
        this.number = number;

        //validateNumbers();
    }

    public OrderItem(Product product, double kilos) {
        this.product = product;
        this.number = number;

    }

    public OrderItem(Product product, int number, double kilos) {
        this.product = product;
        this.number = number;

        validateNumbers(product, number, kilos);
    }

    private void validateNumbers(Product product, int number, double kilos) {
        if (kilos > 0 && number > 0){
            throw new ItemNotAddedException("Please specify either the number or kilograms for product: " + product);
        }else if (number > 0) {
            validateNumber(product, number);
        } else if (kilos > 0) {
            validateKilos(product, kilos);
        } else if (kilos <= 0 && number <= 0) {
            throw new ItemNotAddedException("Please specify the number or kilograms for product: " + product);
        } else {
            throw new ItemNotAddedException("Please specify correct number or kilograms for product: " + product);
        }
    }

    private boolean validateKilos(Product product, double kilos) {
        return true;
    }

    private boolean validateNumber(Product product, int number) {
        return true;
    }

    public double countPrice(){
        return number * product.getPrice();
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "product=" + product +
                ", number=" + number +
                '}';
    }
}
