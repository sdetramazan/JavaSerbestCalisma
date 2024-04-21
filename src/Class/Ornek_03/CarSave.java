package Class.Ornek_03;

import java.util.ArrayList;
import java.util.Scanner;

public class CarSave {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner strInput=new Scanner(System.in);

        ArrayList<Car> carList=new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Car car=new Car();
            System.out.println((i+1)+". Aracın:");
            System.out.print("Numarası:");
            car.carNumber=input.nextInt();
            System.out.print("Markası:");
            car.carBrand=strInput.nextLine();
            System.out.print("Üretim Yılı:");
            car.productionYear=input.nextInt();
            System.out.println();
            carList.add(car);

        }

        System.out.println("*****************");
        carsPrint(carList);
        carMediumYear(carList);

    }
    public static void carsPrint(ArrayList<Car> carList){
        int i=1;

        for (Car cars:carList) {
            System.out.println(i+". Aracın : ");
            System.out.println("Numarası: "+cars.carNumber);
            System.out.println("Markası: "+cars.carBrand);
            System.out.println("Uretim Yılı: "+cars.productionYear);
            i++;
        }
    }
    public static void carMediumYear(ArrayList<Car> carList){
        System.out.println("***********");
        int i=1;
        int total=0;
        int avarege=0;
        for (Car cars:carList) {
            total+=cars.productionYear;
            avarege=total/i;
            i++;
        }
        System.out.print("Ortalama üretim yılı: "+avarege);


    }
}
