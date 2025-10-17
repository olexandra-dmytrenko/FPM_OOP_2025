package creational_patterns.builder;

public class Shop implements Cloneable{
    private String walls;
    private String roof;
    private String floor;
    private String fridges;
    private String sellingEquipment;
    private String cameras;

    public Shop setWalls(String walls) {
        this.walls = walls;
        return this;
    }

    public Shop setRoof(String roof) {
        this.roof = roof;
        return this;
    }

    public Shop setFloor(String floor) {
        this.floor = floor;
        return this;

    }

    public Shop setFridges(String fridges) {
        this.fridges = fridges;
        return this;

    }

    public Shop setSellingEquipment(String sellingEquipment) {
        this.sellingEquipment = sellingEquipment;
        return this;

    }

    public Shop setCameras(String cameras) {
        this.cameras = cameras;
        return this;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Shop{" +
                "walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                ", floor='" + floor + '\'' +
                ", fridges='" + fridges + '\'' +
                ", sellingEquipment='" + sellingEquipment + '\'' +
                ", cameras='" + cameras + '\'' +
                '}';
    }
}
