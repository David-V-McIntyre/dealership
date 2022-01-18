import behaviours.ICarType;

import java.util.ArrayList;

public class Customer {
    private double wallet;
    private ArrayList<ICarType> carCollection;

    public Customer(double _wallet){
        this.wallet = _wallet;
        this.carCollection = new ArrayList<>();
    }

    public void setWallet(double _money){
        this.wallet = _money;
    }

    public void addCar(ICarType _car){
        this.carCollection.add(_car);
    }

    public void buyCarCustomer(ICarType _car){
        addCar(_car);
        double price = ((Car) _car).getPrice();
        double money = this.wallet - price;
        setWallet(money);
    }

    public double getWallet() {
        return wallet;
    }

    public ArrayList<ICarType> getCarCollection() {
        return carCollection;
    }

    public int getCarCollectionSize(){
        return this.carCollection.size();
    }
}
