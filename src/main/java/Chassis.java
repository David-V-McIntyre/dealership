public class Chassis {
    private String brand;
    private String model;
    private String colour;

    public Chassis(String brand, String model, String colour){
        this.brand  = brand;
        this.model = model;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }
}
