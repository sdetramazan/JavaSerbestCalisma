package Class.Inheritance.Ornek_03;

public class Car {
    private String colour;
    private int engineCapacity;
    private String brand;

    public Car(String colour,int engineCapacity,String brand){
        setColour(colour);
        setEngineCapacity(engineCapacity);
        setBrand(brand);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString(){
        return
                "\nAracın : \nRengi :"+this.colour+
                        "\nMotor Hacmi :"+this.engineCapacity+
                        "\nMarkası :"+this.brand;
    }
}
