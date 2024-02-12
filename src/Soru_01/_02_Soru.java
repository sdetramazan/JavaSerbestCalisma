package Soru_01;

import java.util.Scanner;

public class _02_Soru {
    public static void main (String [] args){
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız
        //tek veya çift şeklinde yazdırınız

        Scanner scanner = new Scanner(System.in);
        System.out.print("sayı gir =");
        int sayi = scanner.nextInt();

        if (sayi%2==0){
            System.out.println("sayı çift");
        }else
            System.out.println("sayı tek");
    }
}
