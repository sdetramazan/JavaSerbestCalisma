package Class.Inheritance.Ornek_03;

public class BusCar extends Car{
    private int passengerCapacity;
    public BusCar(String colour,int engineCapacity,String brand,int passengerCapacity){
        super(colour,engineCapacity,brand);
        setPassengerCapacity(passengerCapacity);

    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
    @Override
    public String toString(){
        return super.toString()+
                "\nYolcu Kapasitesi :"+this.passengerCapacity;
    }
}
