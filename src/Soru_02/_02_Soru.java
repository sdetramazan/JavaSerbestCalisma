package Soru_02;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args){
        // (int (Math.Random()*10)  -> 0-9 arası üretir.
        // 20-30 arası ramdom sayı? min birde max lazım, alt sınır ve üst sınır lazım
        // Girilen min-max aralığında random sayı üreten programı yazınız.

        Scanner scanner = new Scanner(System.in);

        System.out.print("alt sınır = ");
        int altSinir = scanner.nextInt();

        System.out.print("üst sınır = ");
        int ustSinir=scanner.nextInt();
        
        int rndSayi=(int)(Math.random()*(ustSinir-altSinir)+altSinir);
        System.out.println("rndSayi = " + rndSayi);
    }
}
