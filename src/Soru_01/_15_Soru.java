package Soru_01;

import java.util.Scanner;

public class _15_Soru {
    public static void main (String[] args){
        // Soru: Girilen bir sayının sıfır mı, negatif mi , pozitip mi
        // olduğunu ternary operatör ile yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı gir = ");
        double sayi =scanner.nextDouble();

        System.out.println((sayi==0) ? "Sıfır" : (sayi<0) ? "negatif": "pozitif");
    }
}
