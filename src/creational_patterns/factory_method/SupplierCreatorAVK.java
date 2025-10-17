package creational_patterns.factory_method;

public class SupplierCreatorAVK extends SupplierCreator {
    @Override
    public BreadAndCakesSupplier createBreadAndCakesSupplier() {
        return new BreadAndCakesAVK();
    }
}
