package creational_patterns.factory_method;

//TODO: додати параметр у Фабричний метод, який би говорив, з якого заводу постачати продукцію (з Вінницького, чи з Київосього)
//Це пункти 5 з презентації про Абстр. фабрику.
public class SupplierCreatorRoshen extends SupplierCreator {
    @Override
    public BreadAndCakesSupplier createBreadAndCakesSupplier() {
        return new BreadAndCakesRoshen();
    }
}
