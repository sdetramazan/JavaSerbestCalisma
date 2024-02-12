package Soru_03;

import java.util.Scanner;

public class _02_Soru {
    public static void main (String [] args){
        //Girilen 5 sayının toplamının sonucunu yazdırınız

        Scanner scanner = new Scanner(System.in);

        int toplam=0;
        int sayac=0;

        while (sayac<5){
            System.out.print("Sayı giriniz= ");
            int sayi = scanner.nextInt();
            toplam=toplam+sayi;
            sayac++;
        }
        System.out.println("toplam = " + toplam);

      /*  for (int i = 0; i < 5; i++) {
            System.out.print(i+1+". sayıyı giriniz= ");
            int sayi = scanner.nextInt();
            toplam+=sayi;
        }
        System.out.println("for Toplam= " +toplam);*/
    }
}
