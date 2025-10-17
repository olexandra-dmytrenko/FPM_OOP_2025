package creational_patterns.builder;

public class BuildShopRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Shop furshetShop = new Shop();
        furshetShop.setFloor("floor")
                .setWalls("waLLS")
                .setRoof("ROOF")
                .setFridges("NEW FRIDGES");

        furshetShop.setCameras("bought new cameras");

        System.out.println(furshetShop);

        furshetShop.setRoof("old roof replaced");

        System.out.println(furshetShop);

        Shop silpoShop = (Shop) furshetShop.clone();
        System.out.println("Silpo: " + silpoShop);
    }
}
