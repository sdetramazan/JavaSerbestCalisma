package Soru;

import java.util.Scanner;

public class _19_Soru {
    public static void main (String[] args){

        //Girilen bir sayı 10 dan büyük ise ekrana 10 dan büyük yazdırınız

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı gir = ");
        int sayi = scanner.nextInt();

        if (sayi>10){
            System.out.println("sayı 10 dan büyüktür");}
        else
            System.out.println("sayı 10 dan küçüktür");
    }
}
