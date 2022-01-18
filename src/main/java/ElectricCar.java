import behaviours.ICarType;

public class ElectricCar extends Car implements ICarType {
    private String engine;

    public ElectricCar(Tyres _tyres, Chassis _chassis, double _price, int _damage) {
        super(_tyres, _chassis, _price, _damage);
        this.engine = "combustion";
    }


    @Override
    public String refuel() {
        return "need electricity";
    }

    @Override
    public String run() {
        return "electric car go mmmmmmmmm";
    }
}
