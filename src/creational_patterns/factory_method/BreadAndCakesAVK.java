package creational_patterns.factory_method;

public class BreadAndCakesAVK implements BreadAndCakesSupplier {
    @Override
    public void supply() {
        System.out.println("Поставка від АВК");
    }
}
