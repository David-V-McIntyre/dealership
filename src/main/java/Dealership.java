import behaviours.ICarType;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<ICarType> carStock;
    private double till;

    public Dealership(double _till){
        this.till = _till;
        this.carStock = new ArrayList<>();
    };

    public ArrayList<ICarType> getCarStock() {
        return carStock;
    }

    public int getCarStockSize() {
        return carStock.size();
    }

    public double getTill() {
        return till;
    }

    public void setTill(double _money){
        this.till = _money;
    }

    public void addCar(ICarType _car){
        this.carStock.add(_car);
    }

    public void buyCarDealer(ICarType _car){
        double damages = checkForDamage(_car) * 100;
        double price = ((Car) _car).getPrice() - damages;
        double money = this.till - price;
        setTill(money);
        ((Car) _car).setPrice(price);
        addCar(_car);
    }

    public void sellCarDealer(ICarType _car){
        removeCar(_car);
        double price = ((Car) _car).getPrice();
        double money = this.till + price;
        setTill(money);
    }

    private void removeCar(ICarType _car) {
        this.carStock.remove(_car);
    }

    private int checkForDamage(ICarType _car){
        return ((Car) _car).getDamage();
    }

    private void repairDamage(ICarType _car){
        double damages = checkForDamage(_car) * 100;
        double price = ((Car) _car).getPrice() + damages;
        double money = this.till - damages;
        setTill(money);
        ((Car) _car).setPrice(price);
        ((Car) _car).setDamage(0);
    }
}
