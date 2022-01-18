import behaviours.ICarType;

public class CombustionCar extends Car implements ICarType {

    protected String engine;

    public CombustionCar(Tyres _tyres, Chassis _chassis, double _price, int _damage) {
        super(_tyres, _chassis, _price, _damage);
        this.engine = "Combustion Engine";
    }

    @Override
    public String refuel() {
        return "Need fuel";
    }

    @Override
    public String run(){
        return "Brum brum car go brrrr";
    }
}
