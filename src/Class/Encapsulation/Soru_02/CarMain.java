package Class.Encapsulation.Soru_02;

public class CarMain {
    public static void main(String[] args){
        Car car = new Car();
        car.setRenk("Beyaz");
        car.setModel(2013);
        car.setMotorHacmi(1400);
        car.setKapiSayisi(5);

        System.out.println(car);
        System.out.println();
        Car car1=new Car("mavi",1986,1200,6);
        System.out.println(car1);

    }
}
