import behaviours.ICarType;

public class HybridCar extends Car implements ICarType {

    protected String engine;

    public HybridCar(Tyres _tyres, Chassis _chassis, double _price, int _damage) {
        super(_tyres, _chassis, _price, _damage);
        this.engine = "hybrid";
    }


    @Override
    public String refuel() {
        return "need electricity and petrol";
    }

    @Override
    public String run() {
        return "hybrid car go hmmmmmmmmm then brrrr then hmmmmmm";
    }
}
