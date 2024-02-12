package Soru_03;

import java.util.Scanner;

public class _05_Soru {
    public static void main (String [] args){
        //Kullanıcıdan gireceği 5 sayıdan tek olanlarının toplanın bulunuz
        Scanner scanner = new Scanner(System.in);

        int sayac =0;
        int toplam=0;

        while (sayac<5){
            System.out.print(sayac+1+ ". sayıyı giriniz=");
            int sayi = scanner.nextInt();
            sayac++;
            if (sayi%2==1){
                toplam+=sayi;
            }
        }
        System.out.println("Toplam =" +toplam);

    }
}
