package grasp.items;

import java.util.Objects;

public class ProductByKilos extends Product{
    private double weight;
    private double presentWeight;

    public ProductByKilos(String name, double price, double presenceKilos) {
        super(name, price);
        this.presentWeight = presenceKilos;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPresentWeight() {
        return presentWeight;
    }

    public void setPresentWeight(double presentWeight) {
        this.presentWeight = presentWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductByKilos that = (ProductByKilos) o;
        return Double.compare(weight, that.weight) == 0 && Double.compare(presentWeight, that.presentWeight) == 0;
    }

    @Override
    public int hashCode() {
        int hash = (int) (weight+presentWeight);
        return Objects.hash(super.hashCode(), weight, presentWeight);
    }
}
