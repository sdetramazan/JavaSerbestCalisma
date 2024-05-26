package Class.Ornek_11;

import java.util.Scanner;

public class ElectricityAccount {

    int totalEnergyConsumption;
    double unitPrice=20;

public void energyConsumption(int consuption){
    totalEnergyConsumption+=consuption;
}
    public void faturaYaz()
    {
        double tuketimTL=totalEnergyConsumption*unitPrice;
        System.out.println("**************");
        System.out.println("    Faturanız");
        System.out.println("**************");
        System.out.println("Toplam Tüketim="+totalEnergyConsumption);
        System.out.println("Toplam Tutar="+tuketimTL);
        System.out.println("****************");


    }

}
