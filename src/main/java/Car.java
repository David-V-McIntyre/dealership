public abstract class Car {
    private Tyres tyres;
    private Chassis chassis;
    private double price;
    private int damage;

    public Car(Tyres _tyres, Chassis _chassis, double _price, int _damage){
        this.tyres = _tyres;
        this.chassis = _chassis;
        this.price = _price;
        this.damage = _damage;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
