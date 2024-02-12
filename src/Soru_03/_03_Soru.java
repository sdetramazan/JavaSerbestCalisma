package Soru_03;

import java.util.Scanner;

public class _03_Soru {
    public static void main (String [] args){
        //Girilen 6 sayıdan sadece pozitif olanlarının
        //toplamını bulunuz

        Scanner scanner = new Scanner(System.in);

        int sayac =0;
        int toplam =0;
        while (sayac<6){
            System.out.print(sayac+1+ ". Sayıyı giriniz= ");
            int count = scanner.nextInt();
            sayac++;
            if (count>0){
                toplam+=count;
            }
        }
        System.out.println("Pozitif sayıların Toplamı ="+toplam);
        System.out.println();
        System.out.println("***** fori ********");
        System.out.println();

        for (int i = 0; i < 6; i++) {

            System.out.print(i+1+ ". Sayıyı giriniz= ");
            int count = scanner.nextInt();
            if (count>0){
                toplam+=count;
            }

        }
        System.out.println("toplam = " + toplam);
    }


}
