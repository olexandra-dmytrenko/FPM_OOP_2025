package creational_patterns.factory_method;

public class SupplyBreakAndCakesRunner {
    public static void main(String[] args) {
        SupplierCreator creatorRoshen = new SupplierCreatorRoshen();
        SupplierCreator creatorAvk = new SupplierCreatorAVK();

        BreadAndCakesSupplier breadAndCakesSupplierRoshen = creatorRoshen.createBreadAndCakesSupplier();
        BreadAndCakesSupplier breadAndCakesSupplierAvk = creatorAvk.createBreadAndCakesSupplier();

        breadAndCakesSupplierAvk.supply();
        breadAndCakesSupplierRoshen.supply();
    }
}
